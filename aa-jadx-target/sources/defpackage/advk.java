package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class advk {
    public final java.util.Set a = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());

    protected abstract void a();

    protected abstract void b();

    public final void c(java.lang.Object obj, boolean z) {
        java.util.Set set = this.a;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            b();
        }
    }
}
