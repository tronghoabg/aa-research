package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class adxl implements defpackage.aeax {
    private java.io.InputStream a;

    public adxl(java.io.InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.aeax
    public final java.io.InputStream g() {
        java.io.InputStream inputStream = this.a;
        this.a = null;
        return inputStream;
    }
}
