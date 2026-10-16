package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kmu implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ kmu(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.zbe zbeVarB = defpackage.zbe.b(((defpackage.absg) obj).b);
                if (zbeVarB == null) {
                    zbeVarB = defpackage.zbe.UNKNOWN_CONTEXT;
                }
                return zbeVarB.name();
            case 1:
                defpackage.absk abskVar = (defpackage.absk) obj;
                abskVar.getClass();
                return "{" + juu.m(abskVar) + "}";
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.dek dekVar = (defpackage.dek) obj;
                dekVar.getClass();
                defpackage.dbb.j(dekVar, 0);
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.lpg.j().f((android.content.ComponentName) obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                los losVar = (los) obj;
                if (losVar != null) {
                    return losVar.d();
                }
                return null;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.tna.az((defpackage.cim) obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.otu otuVar = (defpackage.otu) obj;
                defpackage.yqm yqmVar = defpackage.kzb.a;
                return java.lang.Boolean.valueOf(otuVar == defpackage.otu.LIVE_ACTIVE);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.yqm yqmVar2 = defpackage.kzb.a;
                return defpackage.kxg.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar3 = laf.a;
                return defpackage.tna.aJ((los) obj);
            case 9:
                osy osyVar = (osy) obj;
                defpackage.yqm yqmVar4 = laf.a;
                if (osyVar.equals(osy.a)) {
                    return osyVar;
                }
                defpackage.abor aborVarK = osyVar.K();
                defpackage.abqv abqvVarB = defpackage.abrx.b(j$.time.Instant.now().toEpochMilli());
                aborVarK.t();
                osy osyVar2 = aborVarK.b;
                abqvVarB.getClass();
                osyVar2.c = abqvVarB;
                osyVar2.b |= 1;
                return aborVarK.q();
            case 10:
                defpackage.zbd zbdVar = (defpackage.zbd) obj;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap = defpackage.lby.a;
                zbdVar.getClass();
                if (defpackage.afga.f(zbdVar, defpackage.zbd.FV) || defpackage.afga.f(zbdVar, defpackage.zbd.FW)) {
                    return defpackage.lby.f;
                }
                return null;
            case 11:
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = defpackage.lby.a;
                ((defpackage.zbd) obj).getClass();
                return defpackage.lby.i;
            case 12:
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap3 = defpackage.lby.a;
                ((defpackage.zbd) obj).getClass();
                return defpackage.lby.i;
            case 13:
                defpackage.zbd zbdVar2 = (defpackage.zbd) obj;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap4 = defpackage.lby.a;
                zbdVar2.getClass();
                if (defpackage.afga.f(zbdVar2, defpackage.zbd.GJ) || defpackage.afga.f(zbdVar2, defpackage.zbd.GK)) {
                    return null;
                }
                defpackage.lby lbyVar = defpackage.lby.m;
                defpackage.you youVarListIterator = lbyVar.t.b.listIterator(0);
                while (youVarListIterator.hasNext()) {
                    defpackage.lch lchVar = (defpackage.lch) youVarListIterator.next();
                    if (defpackage.afga.f(lchVar.a, zbdVar2)) {
                        int i = lchVar.c;
                        defpackage.lby lbyVar2 = defpackage.lby.q;
                        defpackage.jzl.l(lbyVar2, lbyVar.c(), defpackage.ygw.q(java.lang.Integer.valueOf(i)));
                        return lbyVar2;
                    }
                }
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            case 14:
                defpackage.zbd zbdVar3 = (defpackage.zbd) obj;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap5 = defpackage.lby.a;
                zbdVar3.getClass();
                if (defpackage.afga.f(zbdVar3, defpackage.zbd.GJ) || defpackage.afga.f(zbdVar3, defpackage.zbd.GK)) {
                    return null;
                }
                defpackage.lby lbyVar3 = defpackage.lby.n;
                defpackage.you youVarListIterator2 = lbyVar3.t.b.listIterator(0);
                while (youVarListIterator2.hasNext()) {
                    defpackage.lch lchVar2 = (defpackage.lch) youVarListIterator2.next();
                    if (defpackage.afga.f(lchVar2.a, zbdVar3)) {
                        int i2 = lchVar2.c;
                        defpackage.lby lbyVar4 = defpackage.lby.q;
                        defpackage.jzl.l(lbyVar4, lbyVar3.c(), defpackage.ygw.q(java.lang.Integer.valueOf(i2)));
                        return lbyVar4;
                    }
                }
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            case 15:
                defpackage.zbd zbdVar4 = (defpackage.zbd) obj;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap6 = defpackage.lby.a;
                zbdVar4.getClass();
                if (defpackage.afga.f(zbdVar4, defpackage.zbd.GJ) || defpackage.afga.f(zbdVar4, defpackage.zbd.GK)) {
                    return null;
                }
                defpackage.lby lbyVar5 = defpackage.lby.o;
                defpackage.you youVarListIterator3 = lbyVar5.t.b.listIterator(0);
                while (youVarListIterator3.hasNext()) {
                    defpackage.lch lchVar3 = (defpackage.lch) youVarListIterator3.next();
                    if (defpackage.afga.f(lchVar3.a, zbdVar4)) {
                        int i3 = lchVar3.c;
                        defpackage.lby lbyVar6 = defpackage.lby.q;
                        defpackage.jzl.l(lbyVar6, lbyVar5.c(), defpackage.ygw.q(java.lang.Integer.valueOf(i3)));
                        return lbyVar6;
                    }
                }
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            case 16:
                defpackage.zbd zbdVar5 = (defpackage.zbd) obj;
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap7 = defpackage.lby.a;
                zbdVar5.getClass();
                if (defpackage.afga.f(zbdVar5, defpackage.zbd.GJ) || defpackage.afga.f(zbdVar5, defpackage.zbd.GK)) {
                    return null;
                }
                defpackage.lby lbyVar7 = defpackage.lby.p;
                defpackage.you youVarListIterator4 = lbyVar7.t.b.listIterator(0);
                while (youVarListIterator4.hasNext()) {
                    defpackage.lch lchVar4 = (defpackage.lch) youVarListIterator4.next();
                    if (defpackage.afga.f(lchVar4.a, zbdVar5)) {
                        int i4 = lchVar4.c;
                        defpackage.lby lbyVar8 = defpackage.lby.q;
                        defpackage.jzl.l(lbyVar8, lbyVar7.c(), defpackage.ygw.q(java.lang.Integer.valueOf(i4)));
                        return lbyVar8;
                    }
                }
                throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
            case 17:
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap8 = defpackage.lby.a;
                ((defpackage.zbd) obj).getClass();
                defpackage.lby lbyVar9 = defpackage.lby.r;
                defpackage.lby lbyVar10 = defpackage.lby.q;
                defpackage.zbe zbeVarC = lbyVar10.c();
                defpackage.ygw ygwVar = (defpackage.ygw) defpackage.lby.b.get(lbyVar10);
                if (ygwVar == null) {
                    int i5 = defpackage.ygw.d;
                    ygwVar = defpackage.ymx.a;
                    ygwVar.getClass();
                }
                defpackage.jzl.l(lbyVar9, zbeVarC, ygwVar);
                return lbyVar9;
            case 18:
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap9 = defpackage.lby.a;
                ((defpackage.zbd) obj).getClass();
                return null;
            case 19:
                defpackage.lcu lcuVar = defpackage.lcv.a;
                defpackage.jzb.r().a((defpackage.lby) obj);
                return defpackage.afbk.a;
            default:
                defpackage.ldb ldbVar = defpackage.ldd.a;
                ((defpackage.eex) obj).getClass();
                return defpackage.abrz.a;
        }
    }
}
