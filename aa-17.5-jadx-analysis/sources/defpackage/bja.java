package defpackage;

/* loaded from: classes.dex */
public final class bja extends cwe {
    public bld a;
    public long b;
    public afdr c;
    public ben d;
    public bjx e;
    public final crm f;

    public bja(bld bldVar, long j, afdr afdrVar) {
        this.a = bldVar;
        this.b = j;
        this.c = afdrVar;
        bas basVar = new bas(this, 5);
        cql cqlVar = crh.a;
        crm crmVar = new crm(null, null, basVar);
        W(crmVar);
        this.f = crmVar;
        this.d = b();
        this.e = d();
    }

    public final ben b() {
        return new bjb(new bih(this, 6), new bih(this, 7), this.a);
    }

    public final bjx d() {
        return new bjc(new bih(this, 4), this.a, new bih(this, 5));
    }
}
