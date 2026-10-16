package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class shu implements defpackage.shm {
    public static final defpackage.yqk a = defpackage.omv.n("CAR.CONMAN");
    public final android.content.Context b;
    public final android.os.Handler c;
    public final android.os.Handler d = new defpackage.stq(android.os.Looper.getMainLooper());
    public final defpackage.xzi e;
    public final com.google.android.gms.car.CarInfo f;
    public defpackage.shp g;
    public final defpackage.wyz h;

    public shu(android.content.Context context, android.os.Handler handler, defpackage.xzi xziVar, defpackage.wyz wyzVar, com.google.android.gms.car.CarInfo carInfo) {
        this.b = context;
        this.c = handler;
        this.e = xziVar;
        this.h = wyzVar;
        this.f = carInfo;
    }

    @Override // defpackage.shm
    public final void a() {
        a.f().ai(8969).u("Teardown initiated");
        this.c.post(new defpackage.ryw(this, 20));
    }
}
