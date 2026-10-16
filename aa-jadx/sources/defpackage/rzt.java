package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rzt {
    private boolean a;
    private int b = 3;

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public final int a(boolean z) {
        boolean z2 = this.a;
        int i = 3;
        if (z) {
            if (z2 || this.b != 3) {
                i = 1;
            } else {
                i = 2;
            }
        } else if (!z2 || this.b != 2) {
            i = 1;
        }
        this.a = z;
        if (i != 1) {
            this.b = i;
        }
        return i;
    }
}
