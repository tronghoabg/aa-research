package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class mtk implements afeh {
    private final /* synthetic */ int h;
    public static final mtk g = new mtk(6);
    public static final mtk f = new mtk(5);
    public static final mtk e = new mtk(4);
    public static final mtk d = new mtk(3);
    public static final mtk c = new mtk(2);
    public static final mtk b = new mtk(1);
    public static final mtk a = new mtk(0);

    public mtk(int i) {
        this.h = i;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        long jN;
        int i = this.h;
        if (i == 0) {
            roc.ar((bux) obj2, ((Number) obj3).intValue());
            return afak.a;
        }
        if (i == 1) {
            long j = ((cja) obj2).a;
            long j2 = ((cjv) obj3).a;
            bqb bqbVar = bqb.a;
            bqb.f((cmd) obj, j, j2);
            return afak.a;
        }
        if (i == 2) {
            roc.ar((bux) obj2, ((Number) obj3).intValue());
            return afak.a;
        }
        if (i == 3) {
            roc.ar((bux) obj2, ((Number) obj3).intValue());
            return afak.a;
        }
        if (i == 4) {
            roc.ar((bux) obj2, ((Number) obj3).intValue());
            return afak.a;
        }
        if (i != 5) {
            roc.ar((bux) obj2, ((Number) obj3).intValue());
            return afak.a;
        }
        ndy ndyVar = (ndy) obj;
        bux buxVar = (bux) obj2;
        ((Number) obj3).intValue();
        buxVar.v(1278498169);
        if (ndyVar == null) {
            buxVar.o();
            return null;
        }
        ndx ndxVar = ndyVar.d;
        if (ndxVar instanceof ndx) {
            buxVar.v(276106841);
            jN = ((cjv) ndxVar.a.invoke(kfn.i(buxVar))).a;
            buxVar.o();
        } else {
            if (ndxVar != null) {
                buxVar.v(276099792);
                buxVar.o();
                throw new aezs();
            }
            buxVar.v(276108708);
            buxVar.o();
            jN = cjn.n();
        }
        long j3 = jN;
        mvs mvsVar = new mvs(null, ndyVar.a, ndyVar.b, false, j3, null, BitmapDescriptorFactory.HUE_RED, ndyVar.c, 104);
        buxVar.o();
        return mvsVar;
    }
}
