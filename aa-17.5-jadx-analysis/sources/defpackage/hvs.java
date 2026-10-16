package defpackage;

/* loaded from: classes2.dex */
final class hvs extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    public hvs(Throwable th) {
        super("Unexpected exception thrown by non-Glide code", th);
    }
}
