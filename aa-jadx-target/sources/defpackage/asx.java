package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class asx implements defpackage.atf {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ asx(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [cft, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [cft, java.lang.Object] */
    @Override // defpackage.atf
    public final int a(int i, defpackage.dlz dlzVar) {
        int i2 = this.b;
        if (i2 == 0) {
            return ((defpackage.cfy) this.a).a(0, i);
        }
        if (i2 == 1) {
            return this.a.a(0, i, dlzVar);
        }
        ?? r3 = this.a;
        return i2 != 2 ? r3.a(0, i, dlzVar) : ((defpackage.cfy) r3).a(0, i);
    }
}
