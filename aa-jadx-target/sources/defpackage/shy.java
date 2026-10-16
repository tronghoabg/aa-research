package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class shy extends defpackage.stt {
    public final /* synthetic */ defpackage.sid a;

    public shy(defpackage.sid sidVar) {
        this.a = sidVar;
    }

    @Override // defpackage.stt
    public final void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.sid.a.f().ai(8970).u("Service available");
        this.a.e.post(new defpackage.imx((java.lang.Object) this, (java.lang.Object) componentName, (java.lang.Object) iBinder, 10, (byte[]) null));
    }

    @Override // defpackage.stt
    public final void b(android.content.ComponentName componentName) {
        this.a.e.post(new sbj(this, componentName, 8));
    }
}
