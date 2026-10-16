package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class xvm {
    int a;
    final int b;
    defpackage.xvm c;
    final java.util.Map d = new java.util.HashMap(0);

    public xvm(int i, int i2) {
        if (i > i2) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = i;
        this.b = i2;
        this.c = null;
    }

    public final java.lang.String toString() {
        return "Node" + java.lang.System.identityHashCode(this);
    }
}
