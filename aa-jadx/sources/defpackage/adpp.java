package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adpp implements defpackage.aeai {
    public final defpackage.aeai a;
    public boolean b = false;
    public int c = 0;
    private final java.lang.Runnable d;

    public adpp(defpackage.aeai aeaiVar, java.lang.Runnable runnable) {
        this.a = aeaiVar;
        this.d = runnable;
    }

    public final java.lang.Runnable a() {
        if (this.b && this.c == 0) {
            return this.d;
        }
        return null;
    }
}
