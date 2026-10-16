package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class agr {
    private final defpackage.bwx a = new androidx.compose.runtime.ParcelableSnapshotMutableState(java.lang.Boolean.FALSE, defpackage.bxv.c);

    public abstract java.lang.Object a();

    public abstract java.lang.Object b();

    public abstract void c(java.lang.Object obj);

    public final void f(boolean z) {
        this.a.b(java.lang.Boolean.valueOf(z));
    }

    public final boolean g() {
        return ((java.lang.Boolean) this.a.a()).booleanValue();
    }
}
