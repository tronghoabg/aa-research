package defpackage;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.car.CarInfo;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class klj {
    static final /* synthetic */ afia[] a = {new affo(klj.class, "datastoreFactory", "getDatastoreFactory(Landroid/content/Context;)Landroidx/datastore/core/DataStore;")};
    public final CarInfo b;
    public final efa c;
    private final aezr d;
    private final afgl e;
    private final SparseArray f;
    private final Map g;

    /* JADX WARN: Type inference failed for: r4v7, types: [efa, java.lang.Object] */
    public klj(CarInfo carInfo) {
        carInfo.getClass();
        this.b = carInfo;
        aezr aezrVarDG = woy.dG(new kjy(this, 6));
        this.d = aezrVarDG;
        String str = (String) aezrVarDG.a();
        aitx aitxVarB = ahni.b(mkm.a.d().plus(new aiwh(null)));
        cyo cyoVar = new cyo(17);
        str.getClass();
        eht ehtVar = new eht(str, cyoVar, aitxVarB);
        this.e = ehtVar;
        Context context = mki.a.c;
        context.getClass();
        this.c = ehtVar.getValue(context, a[0]);
        this.f = new SparseArray();
        this.g = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object d(defpackage.klj r5, defpackage.klq r6, float r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.klf
            if (r0 == 0) goto L13
            r0 = r8
            klf r0 = (defpackage.klf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            klf r0 = new klf
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.woy.dF(r8)
            efa r8 = r5.c
            klg r2 = new klg
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.c = r3
            java.lang.Object r5 = defpackage.dtb.c(r8, r2, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klj.d(klj, klq, float, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object e(defpackage.klj r5, defpackage.klq r6, boolean r7, defpackage.afck r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.klh
            if (r0 == 0) goto L13
            r0 = r8
            klh r0 = (defpackage.klh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            klh r0 = new klh
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.woy.dF(r8)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.woy.dF(r8)
            efa r8 = r5.c
            kli r2 = new kli
            r4 = 0
            r2.<init>(r5, r6, r7, r4)
            r0.c = r3
            java.lang.Object r5 = defpackage.dtb.c(r8, r2, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            afak r5 = defpackage.afak.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.klj.e(klj, klq, boolean, afck):java.lang.Object");
    }

    public final ehz a(klq klqVar) {
        String str = "Temperature-" + klqVar.a + "-lastValue-" + klqVar.b.a();
        Map map = this.g;
        Object ehzVar = map.get(str);
        if (ehzVar == null) {
            ehzVar = new ehz(str);
            map.put(str, ehzVar);
        }
        return (ehz) ehzVar;
    }

    public final ehz b(klq klqVar) {
        int iA = klqVar.b.a();
        SparseArray sparseArray = this.f;
        Object obj = sparseArray.get(iA);
        if (obj == null) {
            ehz ehzVar = new ehz(a.bp(iA, "SeatTemperature-lastUsedHeat-"));
            sparseArray.put(iA, ehzVar);
            obj = ehzVar;
        }
        return (ehz) obj;
    }

    public final eqj c(klq klqVar) {
        return tby.u(dtx.l(aiyr.a(new jyc(this.c.b(), this, klqVar, 2)), afcp.a, 5000L), null);
    }
}
