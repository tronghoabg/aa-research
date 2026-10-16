package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class soe {
    public java.lang.Object d;
    public boolean e = false;
    final /* synthetic */ defpackage.sok f;

    public soe(defpackage.sok sokVar, java.lang.Object obj) {
        this.f = sokVar;
        this.d = obj;
    }

    protected abstract void c();

    public final void d() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void e() {
        d();
        java.util.ArrayList arrayList = this.f.g;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
