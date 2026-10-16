package java.io;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public class UncheckedIOException extends java.lang.RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UncheckedIOException(java.io.IOException iOException) {
        super(iOException);
        iOException.getClass();
    }

    @Override // java.lang.Throwable
    public java.io.IOException getCause() {
        return (java.io.IOException) super.getCause();
    }
}
