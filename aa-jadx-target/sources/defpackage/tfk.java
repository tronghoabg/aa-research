package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class tfk {
    private int a = Integer.MIN_VALUE;
    private final java.util.Set b = new java.util.HashSet();

    public final int b() {
        int i;
        synchronized (this.b) {
            i = this.a + 1;
            this.a = i;
        }
        return i;
    }

    public final void c(int i, java.lang.Runnable runnable) {
        java.util.Set set = this.b;
        synchronized (set) {
            if (set.add(java.lang.Integer.valueOf(i))) {
                runnable.run();
            }
        }
    }
}
