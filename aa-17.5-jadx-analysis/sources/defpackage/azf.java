package defpackage;

/* loaded from: classes.dex */
public final class azf {
    public final Object a;
    public final Object b;
    public int c;
    public afeg d;
    final /* synthetic */ nfh e;

    public azf(nfh nfhVar, int i, Object obj, Object obj2) {
        this.e = nfhVar;
        this.a = obj;
        this.b = obj2;
        this.c = i;
    }

    public final afeg a() {
        afeg afegVar = this.d;
        if (afegVar != null) {
            return afegVar;
        }
        cct cctVar = new cct(818252804, true, new apn(this.e, this, 4));
        this.d = cctVar;
        return cctVar;
    }
}
