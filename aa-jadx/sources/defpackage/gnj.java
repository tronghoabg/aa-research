package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class gnj implements defpackage.hvf {
    private final android.net.Uri a;
    private final int b;
    private final android.content.Context c;

    public gnj(android.content.Context context, android.net.Uri uri, int i) {
        this.a = uri;
        this.b = i;
        this.c = context;
    }

    @Override // defpackage.hvf
    public final java.lang.Class a() {
        return java.io.InputStream.class;
    }

    @Override // defpackage.hvf
    public final void d(defpackage.hsq hsqVar, defpackage.hve hveVar) {
        android.net.Uri uri = this.a;
        android.content.Context context = this.c;
        java.lang.String queryParameter = uri.getQueryParameter("lookupKey");
        java.lang.String queryParameter2 = uri.getQueryParameter("name");
        defpackage.gni gniVar = new defpackage.gni(context.getResources());
        gniVar.b(queryParameter2, queryParameter);
        android.graphics.Bitmap bitmapA = gniVar.a(this.b);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmapA.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
        hveVar.f(new java.io.ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
    }

    @Override // defpackage.hvf
    public final int e() {
        return 1;
    }

    @Override // defpackage.hvf
    public final void b() {
    }

    @Override // defpackage.hvf
    public final void c() {
    }
}
