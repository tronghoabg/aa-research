package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rxw implements defpackage.rxx {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rxw(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.rxx
    public final void a(android.content.ContentProviderClient contentProviderClient) throws android.os.RemoteException {
        if (this.b != 0) {
            int i = ((defpackage.yyt) this.a).r;
            defpackage.yqk yqkVar = defpackage.rxy.a;
            contentProviderClient.delete(defpackage.ryc.a, "detector_type", new java.lang.String[]{java.lang.String.valueOf(i)});
        } else {
            defpackage.yqk yqkVar2 = defpackage.rxy.a;
            contentProviderClient.update(defpackage.ryc.a, (android.content.ContentValues) this.a, null, null);
        }
    }
}
