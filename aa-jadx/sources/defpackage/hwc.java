package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hwc extends java.lang.RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public hwc(java.lang.Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
