package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hei implements afec {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ hei(geu geuVar, hcj hcjVar, boolean z, int i) {
        this.d = i;
        this.b = geuVar;
        this.c = hcjVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [bym, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.d;
        if (i == 0) {
            fwb fwbVar = (fwb) obj;
            boolean z = this.a;
            Object obj2 = this.c;
            Object obj3 = this.b;
            int i2 = hej.a;
            fwbVar.getClass();
            return hej.b(fwbVar, (geu) obj3, (hcj) obj2, z);
        }
        if (i == 1) {
            fwb fwbVar2 = (fwb) obj;
            boolean z2 = this.a;
            Object obj4 = this.c;
            Object obj5 = this.b;
            int i3 = hej.a;
            fwbVar2.getClass();
            return hej.b(fwbVar2, (geu) obj5, (hcj) obj4, z2);
        }
        if (i != 2) {
            Object obj6 = this.b;
            return nni.a((nnl) this.c, this.a, (cil) obj6, (cie) obj);
        }
        giz gizVar = (giz) obj;
        gizVar.getClass();
        giz gizVar2 = this.a ? giz.c : giz.a;
        boolean zA = false;
        if (((Boolean) this.b.a()).booleanValue() && gizVar == gizVar2) {
            zA = ((cil) this.c).a(7);
        }
        return Boolean.valueOf(zA);
    }

    public /* synthetic */ hei(nnl nnlVar, boolean z, cil cilVar, int i) {
        this.d = i;
        this.c = nnlVar;
        this.a = z;
        this.b = cilVar;
    }

    public /* synthetic */ hei(boolean z, cil cilVar, bym bymVar, int i) {
        this.d = i;
        this.a = z;
        this.c = cilVar;
        this.b = bymVar;
    }
}
