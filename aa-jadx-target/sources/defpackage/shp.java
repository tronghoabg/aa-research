package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class shp extends defpackage.stt {
    public final defpackage.sht a;
    public final long b;
    public final android.content.ComponentName c;
    public final defpackage.rty d;
    public defpackage.rxo f;
    public defpackage.rvp g;
    public final /* synthetic */ defpackage.shu h;
    public final defpackage.rxe j;
    public final java.util.List e = new java.util.ArrayList();
    public int i = 3;

    public shp(defpackage.shu shuVar, long j, android.content.ComponentName componentName, defpackage.rty rtyVar) {
        this.h = shuVar;
        this.a = new defpackage.sht(shuVar);
        this.j = new defpackage.rxe(shuVar);
        this.b = j;
        this.c = componentName;
        this.d = rtyVar;
    }

    @Override // defpackage.stt
    public final void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.h.c.post(new defpackage.kfq(this, iBinder, 12));
    }

    @Override // defpackage.stt
    public final void b(android.content.ComponentName componentName) {
        this.h.c.post(new defpackage.sho(this, 3));
    }
}
