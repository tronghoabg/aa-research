package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nxt implements defpackage.afer {
    public final /* synthetic */ defpackage.bwx a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ java.lang.Object d;
    public final /* synthetic */ java.lang.Object e;
    public final /* synthetic */ java.lang.Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nxt(aiuw aiuwVar, java.util.List list, defpackage.axx axxVar, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, defpackage.affc affcVar, defpackage.bwx bwxVar, int i) {
        this.g = i;
        this.b = aiuwVar;
        this.c = list;
        this.d = axxVar;
        this.e = snapshotStateList;
        this.f = affcVar;
        this.a = bwxVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aiuw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [affc, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        java.util.List listH;
        if (this.g == 0) {
            ?? r0 = this.b;
            defpackage.yqm yqmVar = nyc.a;
            defpackage.bwx bwxVar = this.a;
            ahoc.d((aiuw) r0, (defpackage.afdo) null, 0, new nxy((java.util.List) this.c, (defpackage.axx) this.d, (androidx.compose.runtime.snapshots.SnapshotStateList) this.e, (defpackage.affc) this.f, bwxVar, (defpackage.afdk) null), 3);
            return defpackage.afbk.a;
        }
        defpackage.bwx bwxVar2 = this.a;
        ?? r2 = this.d;
        defpackage.yqm yqmVar2 = defpackage.mzk.a;
        if (((java.lang.Boolean) r2.a()).booleanValue() || (listH = defpackage.mzk.h(bwxVar2)) == null || listH.isEmpty()) {
            ?? r3 = this.e;
            bwxVar2.b(defpackage.mzk.i(defpackage.tna.aq(this.c), defpackage.mzk.c(this.f), defpackage.mzk.b(this.b)));
            r2.b(java.lang.Boolean.valueOf(false));
            r3.b(java.lang.Boolean.valueOf(true));
            defpackage.mzk.a.l().y("MediaSwitcher resumed, restoring stable items with %s", defpackage.mzk.h(bwxVar2));
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ nxt(defpackage.bwx bwxVar, defpackage.bwx bwxVar2, defpackage.bys bysVar, defpackage.bys bysVar2, defpackage.bys bysVar3, defpackage.bwx bwxVar3, int i) {
        this.g = i;
        this.d = bwxVar;
        this.a = bwxVar2;
        this.c = bysVar;
        this.f = bysVar2;
        this.b = bysVar3;
        this.e = bwxVar3;
    }
}
