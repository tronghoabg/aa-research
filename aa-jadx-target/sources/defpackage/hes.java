package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class hes implements defpackage.affc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hes(gfa gfaVar, hct hctVar, boolean z, int i) {
        this.d = i;
        this.b = gfaVar;
        this.c = hctVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [bys, java.lang.Object] */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        int i = this.d;
        if (i == 0) {
            fwl fwlVar = (fwl) obj;
            boolean z = this.a;
            java.lang.Object obj2 = this.c;
            java.lang.Object obj3 = this.b;
            int i2 = het.a;
            fwlVar.getClass();
            return het.b(fwlVar, (gfa) obj3, (hct) obj2, z);
        }
        if (i == 1) {
            fwl fwlVar2 = (fwl) obj;
            boolean z2 = this.a;
            java.lang.Object obj4 = this.c;
            java.lang.Object obj5 = this.b;
            int i3 = het.a;
            fwlVar2.getClass();
            return het.b(fwlVar2, (gfa) obj5, (hct) obj4, z2);
        }
        if (i != 2) {
            java.lang.Object obj6 = this.b;
            return defpackage.nob.a((defpackage.nod) this.c, this.a, (defpackage.cit) obj6, (defpackage.cim) obj);
        }
        gjg gjgVar = (gjg) obj;
        gjgVar.getClass();
        gjg gjgVar2 = this.a ? gjg.c : gjg.a;
        boolean zA = false;
        if (((java.lang.Boolean) this.b.a()).booleanValue() && gjgVar == gjgVar2) {
            zA = ((defpackage.cit) this.c).a(7);
        }
        return java.lang.Boolean.valueOf(zA);
    }

    public /* synthetic */ hes(defpackage.nod nodVar, boolean z, defpackage.cit citVar, int i) {
        this.d = i;
        this.c = nodVar;
        this.a = z;
        this.b = citVar;
    }

    public /* synthetic */ hes(boolean z, defpackage.cit citVar, defpackage.bys bysVar, int i) {
        this.d = i;
        this.a = z;
        this.c = citVar;
        this.b = bysVar;
    }
}
