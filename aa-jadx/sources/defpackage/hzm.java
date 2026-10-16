package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class hzm implements defpackage.hvf {
    private static final java.lang.String[] a = {"_data"};
    private final android.content.Context b;
    private final android.net.Uri c;

    public hzm(android.content.Context context, android.net.Uri uri) {
        this.b = context;
        this.c = uri;
    }

    @Override // defpackage.hvf
    public final java.lang.Class a() {
        return java.io.File.class;
    }

    @Override // defpackage.hvf
    public final void d(defpackage.hsq hsqVar, defpackage.hve hveVar) {
        android.database.Cursor cursorQuery = this.b.getContentResolver().query(this.c, a, null, null, null);
        java.lang.String string = null;
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                cursorQuery.close();
            } catch (java.lang.Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (android.text.TextUtils.isEmpty(string)) {
            hveVar.g(new java.io.FileNotFoundException("Failed to find file path for: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.c)))));
        } else {
            hveVar.f(new java.io.File(string));
        }
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
