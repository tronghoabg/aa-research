package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class abod extends java.io.IOException {
    private static final long serialVersionUID = -6947486886997889499L;

    public abod(int i, int i2, int i3, java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(java.lang.String.valueOf(java.lang.String.format(java.util.Locale.US, "Pos: %d, limit: %d, len: %d", java.lang.Long.valueOf(i), java.lang.Long.valueOf(i2), java.lang.Integer.valueOf(i3)))), th);
    }

    public abod(java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
