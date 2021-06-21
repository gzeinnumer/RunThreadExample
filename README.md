# RunThreadExample

### Repeat Every 6 second, delay 1 second
```java
Timer timer = new Timer();
timer.scheduleAtFixedRate(new TimerTask() {
    @Override
    public void run() {
        Toast.makeText(MainActivity.this, "Coba", Toast.LENGTH_SHORT).show();
    }
}, 1000, 6000);
```
### Run Thread UI
```java
runOnUiThread (new Thread(new Runnable() {
    public void run() {
        Toast.makeText(MainActivity.this, "Coba", Toast.LENGTH_SHORT).show();
    }
}));
```
### Run Thread No UI
```java
Thread timer = new Thread(){
    public void run(){
        try{
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //Toast.makeText(MainActivity.this, "Coba", Toast.LENGTH_SHORT).show();
            Log.d(getClass().getSimpleName(), "onCreate: ");
        }
    }
};
timer.start();
```
### Run Thread No UI Delay 4 second
```java
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        //Toast.makeText(MainActivity.this, "Coba", Toast.LENGTH_SHORT).show();
        Log.d(getClass().getSimpleName(), "onCreate: ");
    }
}, 4000);
```

---

```
Copyright 2021 M. Fadli Zein
```