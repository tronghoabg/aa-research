package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class idx {
    public final java.util.Set a = java.util.Collections.newSetFromMap(new java.util.WeakHashMap());
    public final java.util.Set b = new java.util.HashSet();
    public boolean c;

    public final boolean a(defpackage.ien ienVar) {
        boolean z = true;
        if (ienVar == null) {
            return true;
        }
        java.util.Set set = this.a;
        java.util.Set set2 = this.b;
        boolean zRemove = set.remove(ienVar);
        if (!set2.remove(ienVar) && !zRemove) {
            z = false;
        }
        if (z) {
            ienVar.c();
        }
        return z;
    }

    public final java.lang.String toString() {
        java.util.Set set = this.a;
        return super.toString() + "{numRequests=" + set.size() + ", isPaused=" + this.c + "}";
    }
}
