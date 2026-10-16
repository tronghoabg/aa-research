package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hyw implements defpackage.hvf {
    private final java.lang.String a;
    private java.lang.Object b;

    public hyw(java.lang.String str) {
        this.a = str;
    }

    @Override // defpackage.hvf
    public final java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // defpackage.hvf
    public final void c() {
        try {
            ((java.io.InputStream) this.b).close();
        } catch (java.io.IOException unused) {
        }
    }

    @Override // defpackage.hvf
    public final void d(defpackage.hsq hsqVar, defpackage.hve hveVar) {
        try {
            java.lang.String str = this.a;
            if (!str.startsWith("data:image")) {
                throw new java.lang.IllegalArgumentException("Not a valid image data URL.");
            }
            int iIndexOf = str.indexOf(44);
            if (iIndexOf == -1) {
                throw new java.lang.IllegalArgumentException("Missing comma in data URL.");
            }
            if (!str.substring(0, iIndexOf).endsWith(";base64")) {
                throw new java.lang.IllegalArgumentException("Not a base64 image data URL.");
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(android.util.Base64.decode(str.substring(iIndexOf + 1), 0));
            this.b = byteArrayInputStream;
            hveVar.f(byteArrayInputStream);
        } catch (java.lang.IllegalArgumentException e) {
            hveVar.g(e);
        }
    }

    @Override // defpackage.hvf
    public final int e() {
        return 1;
    }

    @Override // defpackage.hvf
    public final void b() {
    }
}
