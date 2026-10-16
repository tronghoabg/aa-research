package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class acbk implements java.io.Serializable, defpackage.abpb, defpackage.acbi, defpackage.acbj {
    public static final defpackage.acbk U = new defpackage.acbk(-1);
    private final int V;

    public acbk(int i) {
        this.V = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        if (this != U) {
            return this.V;
        }
        throw new java.lang.IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.V);
    }
}
