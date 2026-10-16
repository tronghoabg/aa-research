package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class szo {
    public final java.util.concurrent.Executor a;
    public final defpackage.kpu b;
    public final defpackage.wyz c;
    public final defpackage.wyz d;

    public szo(defpackage.wyz wyzVar, defpackage.wyz wyzVar2, defpackage.kpu kpuVar, java.util.concurrent.Executor executor) {
        wyzVar2.getClass();
        executor.getClass();
        this.d = wyzVar;
        this.c = wyzVar2;
        this.b = kpuVar;
        this.a = executor;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.szo)) {
            return false;
        }
        defpackage.szo szoVar = (defpackage.szo) obj;
        return defpackage.afga.f(this.d, szoVar.d) && defpackage.afga.f(this.c, szoVar.c) && defpackage.afga.f(this.b, szoVar.b) && defpackage.afga.f(this.a, szoVar.a);
    }

    public final int hashCode() {
        return (((((this.d.hashCode() * 31) + this.c.hashCode()) * 31) + this.b.hashCode()) * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "TransportParams(assistantCallbacks=" + this.d + ", gearheadFlags=" + this.c + ", gearheadLogger=" + this.b + ", backgroundExecutor=" + this.a + ")";
    }
}
