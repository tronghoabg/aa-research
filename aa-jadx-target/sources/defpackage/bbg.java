package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bbg implements defpackage.affc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ bbg(java.lang.Object obj, boolean z, java.lang.Object obj2, int i) {
        this.d = i;
        this.c = obj;
        this.a = z;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z;
        int i = this.d;
        if (i == 0) {
            defpackage.dek dekVar = (defpackage.dek) obj;
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.b;
            byte[] bArr = null;
            if (this.a) {
                dekVar.a(defpackage.ddy.y, new defpackage.ddn(null, new defpackage.ajz(obj3, obj2, 4, bArr)));
                dekVar.a(defpackage.ddy.A, new defpackage.ddn(null, new defpackage.ajz(obj3, obj2, 5, bArr)));
            } else {
                dekVar.a(defpackage.ddy.z, new defpackage.ddn(null, new defpackage.ajz(obj3, obj2, 6, bArr)));
                dekVar.a(defpackage.ddy.B, new defpackage.ddn(null, new defpackage.ajz(obj3, obj2, 7, bArr)));
            }
            return defpackage.afbk.a;
        }
        if (i != 1) {
            if (i != 2) {
                java.lang.Object obj4 = this.b;
                return defpackage.nob.a((defpackage.nod) this.c, this.a, (defpackage.cit) obj4, (defpackage.cim) obj);
            }
            defpackage.gjv gjvVar = (defpackage.gjv) obj;
            gjvVar.getClass();
            android.net.Uri uri = gjvVar.b;
            android.graphics.Bitmap bitmap = gjvVar.d;
            return defpackage.ebo.f(defpackage.duu.b((1 & 1) != 0 ? defpackage.afdp.a : null, (1 & 2) != 0 ? 5000L : 0L, new lts(uri, (aiuw) this.c, gjvVar.c, this.a, bitmap, (j$.time.Duration) this.b, (defpackage.afdk) null)), new defpackage.lra(gjvVar, 10));
        }
        defpackage.cuw cuwVar = (defpackage.cuw) obj;
        ?? r0 = this.b;
        int size = r0.size();
        int i2 = 0;
        while (true) {
            z = this.a;
            if (i2 >= size) {
                break;
            }
            ((defpackage.axp) r0.get(i2)).d(cuwVar, z);
            i2++;
        }
        ?? r8 = this.c;
        int size2 = r8.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((defpackage.axp) r8.get(i3)).d(cuwVar, z);
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bbg(java.util.List list, java.util.List list2, boolean z, int i) {
        this.d = i;
        this.b = list;
        this.c = list2;
        this.a = z;
    }

    public /* synthetic */ bbg(boolean z, defpackage.bby bbyVar, aiuw aiuwVar, int i) {
        this.d = i;
        this.a = z;
        this.b = bbyVar;
        this.c = aiuwVar;
    }
}
