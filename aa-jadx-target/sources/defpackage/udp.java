package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class udp implements java.util.Comparator {
    private final /* synthetic */ int a;
    private final java.lang.Object b;

    /* JADX WARN: Type inference failed for: r1v2, types: [aewe, java.lang.Object] */
    public udp(java.util.List list, defpackage.xyp xypVar, int i) {
        this.a = i;
        this.b = new aewt(list.size());
        aeni aeniVar = new aeni((byte[]) null);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            xypVar.a((ueu) it.next());
        }
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ueu ueuVar = (ueu) it2.next();
            int iS = ueuVar.n().i;
            if (ueuVar.A() && aeniVar.d(ueuVar.d())) {
                iS = aeniVar.s(ueuVar.d());
            }
            this.b.a(ueuVar, iS);
        }
    }

    private final mwa a(nuv nuvVar) {
        defpackage.nve nveVar = nuvVar.c.x;
        int iOrdinal = nveVar.ordinal();
        if (iOrdinal == 5) {
            return mwa.c;
        }
        if (iOrdinal == 6) {
            return mwa.d;
        }
        if (iOrdinal == 7) {
            return defpackage.mvm.k(nuvVar, (j$.time.Duration) this.b) ? mwa.b : mwa.f;
        }
        if (iOrdinal == 9) {
            return mwa.a;
        }
        if (defpackage.acqe.s() && nveVar == defpackage.nve.a) {
            return mwa.e;
        }
        java.util.Objects.toString(nveVar);
        throw new java.lang.IllegalStateException("Invalid category ".concat(java.lang.String.valueOf(nveVar)));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [aewe, java.lang.Object] */
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                uky ukyVar = (uky) obj;
                uky ukyVar2 = (uky) obj2;
                java.util.IdentityHashMap identityHashMap = (java.util.IdentityHashMap) this.b;
                java.lang.Integer num = (java.lang.Integer) identityHashMap.get(ukyVar);
                java.lang.Integer num2 = (java.lang.Integer) identityHashMap.get(ukyVar2);
                return defpackage.yek.b.c(num == null ? 0 : num.intValue(), num2 != null ? num2.intValue() : 0).c(ukyVar.b(), ukyVar2.b()).c(ukyVar.c(), ukyVar2.c()).a();
            }
            nuv nuvVar = (nuv) obj;
            nuv nuvVar2 = (nuv) obj2;
            nuvVar.getClass();
            nuvVar2.getClass();
            defpackage.yek yekVarE = defpackage.yek.b.e(a(nuvVar), a(nuvVar2));
            int i2 = defpackage.nuz.b;
            return yekVarE.f(nuvVar, nuvVar2, new aiq(18)).a();
        }
        ueu ueuVar = (ueu) obj;
        ueu ueuVar2 = (ueu) obj2;
        defpackage.yek yekVarG = defpackage.yek.b.g(ueuVar.aj(), ueuVar2.aj()).g(ueuVar.ah(), ueuVar2.ah()).g(ueuVar.ai(), ueuVar2.ai());
        ?? r3 = this.b;
        defpackage.yek yekVarE2 = yekVarG.c(r3.o(ueuVar), r3.o(ueuVar2)).g(ueuVar.A(), ueuVar2.A()).c(ueuVar.n().o, ueuVar2.n().o).e(ueuVar.f(), ueuVar2.f());
        abbj abbjVar = ueuVar.n().e;
        if (abbjVar == null) {
            abbjVar = abbj.a;
        }
        int iHashCode = abbjVar.hashCode();
        abbj abbjVar2 = ueuVar2.n().e;
        if (abbjVar2 == null) {
            abbjVar2 = abbj.a;
        }
        defpackage.yek yekVarC = yekVarE2.c(iHashCode, abbjVar2.hashCode());
        abfb abfbVar = ueuVar.n().f;
        if (abfbVar == null) {
            abfbVar = abfb.a;
        }
        int iHashCode2 = abfbVar.hashCode();
        abfb abfbVar2 = ueuVar2.n().f;
        if (abfbVar2 == null) {
            abfbVar2 = abfb.a;
        }
        return yekVarC.c(iHashCode2, abfbVar2.hashCode()).g(ueuVar.B(), ueuVar2.B()).c(ueuVar.hashCode(), ueuVar2.hashCode()).a();
    }

    public udp(j$.time.Duration duration, int i) {
        this.a = i;
        this.b = duration;
    }

    public udp(xfg xfgVar, uls ulsVar, int i) {
        this.a = i;
        this.b = new java.util.IdentityHashMap(ulsVar.g.size());
        ulr ulrVarI = ulsVar.i();
        while (ulrVarI.hasNext()) {
            uky ukyVarA = ulrVarI.a();
            ((java.util.IdentityHashMap) this.b).put(ukyVarA, java.lang.Integer.valueOf(xfgVar.e(ukyVarA).F));
        }
    }
}
