package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class kfp {
    public kfp() {
    }

    public static defpackage.ery g(defpackage.esa esaVar, defpackage.erw erwVar, defpackage.esi esiVar) {
        erwVar.getClass();
        esiVar.getClass();
        return new defpackage.ery(esaVar.getViewModelStore(), erwVar, esiVar);
    }

    public static /* synthetic */ defpackage.ery h(defpackage.esa esaVar, defpackage.esi esiVar, int i) {
        defpackage.erw defaultViewModelProviderFactory;
        if ((i & 2) != 0) {
            defaultViewModelProviderFactory = esaVar instanceof defpackage.epu ? ((defpackage.epu) esaVar).getDefaultViewModelProviderFactory() : new defpackage.erx();
        } else {
            defaultViewModelProviderFactory = null;
        }
        if ((i & 4) != 0) {
            esiVar = esaVar instanceof defpackage.epu ? ((defpackage.epu) esaVar).getDefaultViewModelCreationExtras() : defpackage.esg.a;
        }
        return g(esaVar, defaultViewModelProviderFactory, esiVar);
    }

    public static defpackage.ksw i(defpackage.bve bveVar) {
        java.lang.Object objF = bveVar.f(defpackage.ksx.b);
        if (true == defpackage.afga.f((defpackage.ksw) objF, defpackage.ksx.a)) {
            objF = null;
        }
        defpackage.ksw kswVarH = (defpackage.ksw) objF;
        if (kswVarH == null) {
            bveVar.v(-193654824);
            kswVarH = defpackage.ksx.h(bveVar);
        } else {
            bveVar.v(-193657056);
        }
        bveVar.o();
        return kswVarH;
    }

    public static defpackage.cgf j(defpackage.cgf cgfVar, defpackage.ksk kskVar, defpackage.cld cldVar) {
        defpackage.afau afauVar;
        defpackage.afau afauVar2;
        cgfVar.getClass();
        int iOrdinal = kskVar.ordinal();
        if (iOrdinal == 3) {
            afauVar = new defpackage.afau(new defpackage.dlr(1.0f), new defpackage.dlr(3.0f));
        } else if (iOrdinal != 4) {
            afauVar = iOrdinal != 5 ? new defpackage.afau(new defpackage.dlr(0.0f), new defpackage.dlr(0.0f)) : new defpackage.afau(new defpackage.dlr(3.0f), new defpackage.dlr(4.0f));
        } else {
            afauVar = new defpackage.afau(new defpackage.dlr(2.0f), new defpackage.dlr(3.0f));
        }
        defpackage.ksj ksjVar = new defpackage.ksj(0.3f, ((long) java.lang.Float.floatToRawIntBits(((defpackage.dlr) afauVar.a).a)) & 4294967295L, ((defpackage.dlr) afauVar.b).a, 0.0f);
        int iOrdinal2 = kskVar.ordinal();
        if (iOrdinal2 == 3) {
            afauVar2 = new defpackage.afau(new defpackage.dlr(3.0f), new defpackage.dlr(8.0f));
        } else if (iOrdinal2 != 4) {
            afauVar2 = iOrdinal2 != 5 ? new defpackage.afau(new defpackage.dlr(0.0f), new defpackage.dlr(0.0f)) : new defpackage.afau(new defpackage.dlr(4.0f), new defpackage.dlr(6.0f));
        } else {
            afauVar2 = new defpackage.afau(new defpackage.dlr(4.0f), new defpackage.dlr(8.0f));
        }
        float f = ((defpackage.dlr) afauVar2.a).a;
        defpackage.ksj ksjVar2 = new defpackage.ksj(0.15f, ((long) java.lang.Float.floatToRawIntBits(f)) & 4294967295L, ((defpackage.dlr) afauVar2.b).a, kskVar == defpackage.ksk.L5 ? 1.0f : 0.0f);
        return cgfVar.a(new defpackage.chu(cldVar, new defpackage.cnh(ksjVar.c, ksjVar.d, ksjVar.b, -72057594037927936L, ksjVar.a))).a(new defpackage.chu(cldVar, new defpackage.cnh(ksjVar2.c, ksjVar2.d, ksjVar2.b, -72057594037927936L, ksjVar2.a)));
    }

    public static defpackage.cgf k(defpackage.cgf cgfVar, defpackage.cld cldVar, defpackage.bve bveVar, int i) {
        cgfVar.getClass();
        if (i != 0) {
            cldVar = defpackage.vz.b(bveVar);
        }
        return j(cgfVar, defpackage.ksk.L3, cldVar);
    }

    public kfp(byte[] bArr) {
    }

    public void b() {
    }

    public void eH() {
    }

    public void a(defpackage.qsh qshVar) {
    }

    public void c(defpackage.qsh qshVar) {
    }

    public void d(rcp rcpVar) {
    }
}
