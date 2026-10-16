package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rxu implements defpackage.rxx {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ rxu(android.net.Uri uri, android.content.ContentValues contentValues, int i) {
        this.c = i;
        this.a = uri;
        this.b = contentValues;
    }

    @Override // defpackage.rxx
    public final void a(android.content.ContentProviderClient contentProviderClient) throws android.os.RemoteException {
        if (this.c == 0) {
            defpackage.yqk yqkVar = defpackage.rxy.a;
            contentProviderClient.update((android.net.Uri) this.a, (android.content.ContentValues) this.b, null, null);
            return;
        }
        defpackage.yqk yqkVar2 = defpackage.rxy.a;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("detector_type", java.lang.Integer.valueOf(((defpackage.yyt) this.b).r));
        android.net.Uri uriInsert = contentProviderClient.insert(defpackage.ryc.a, contentValues);
        if (uriInsert == null) {
            return;
        }
        java.lang.String lastPathSegment = uriInsert.getLastPathSegment();
        if (lastPathSegment == null) {
            throw new java.lang.IllegalArgumentException("uri does not contain UUID path and value");
        }
        java.util.concurrent.atomic.AtomicReference atomicReference = (java.util.concurrent.atomic.AtomicReference) this.a;
        atomicReference.set(java.util.UUID.fromString(lastPathSegment));
        atomicReference.get();
    }

    public /* synthetic */ rxu(defpackage.yyt yytVar, java.util.concurrent.atomic.AtomicReference atomicReference, int i) {
        this.c = i;
        this.b = yytVar;
        this.a = atomicReference;
    }
}
