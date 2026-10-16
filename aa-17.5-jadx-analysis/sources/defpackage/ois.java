package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class ois implements lhg {
    public static final oip a = new oip();
    public static final List b = woy.bi(oiq.b, oiq.c, oiq.d, oiq.e, oiq.f);
    public static final yph c = yph.c("GH.ThermalStateWatch");
    public static final afgl d = new ofw(mki.b, 3);
    public final eqj e;
    public oiq f;
    private final eqj g;
    private final HashSet h;

    public /* synthetic */ ois(byte[] bArr) {
        obq obqVar = new obq();
        ner nerVar = new ner();
        nfa nfaVar = new nfa();
        nff nffVar = new nff();
        neo neoVarA = neo.a.a();
        this.e = obqVar;
        this.g = tby.h(obqVar, eqy.a(eqy.b(neoVarA, new oin(0))), nerVar, nfaVar, nffVar, eqy.a(eqy.b(neoVarA, new oin(2))), new oio());
        this.h = new HashSet();
    }

    public static final String a(int i, Context context) {
        String string = context.getString(i);
        string.getClass();
        return string;
    }

    public final void b(yzy yzyVar) {
        if (yzyVar != null) {
            HashSet hashSet = this.h;
            if (hashSet.contains(yzyVar)) {
                return;
            }
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.THERMAL_MITIGATION, yzyVar).l());
            hashSet.add(yzyVar);
        }
    }

    @Override // defpackage.lhg
    public final void c() {
        this.f = null;
        this.h.clear();
        this.g.fE(lbh.d(), new nns(new afec() { // from class: oim
            /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[PHI: r0
  0x0028: PHI (r0v3 int) = (r0v2 int), (r0v12 int) binds: [B:15:0x0026, B:14:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[LOOP:1: B:23:0x0058->B:25:0x005e, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
            @Override // defpackage.afec
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r12) {
                /*
                    Method dump skipped, instructions count: 359
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.oim.invoke(java.lang.Object):java.lang.Object");
            }
        }, 6));
    }

    public final boolean e(oir oirVar) {
        oiq oiqVar = this.f;
        return (oiqVar == null || woy.cn(oirVar.c, oiqVar)) ? false : true;
    }

    @Override // defpackage.lhg
    public final void d() {
    }

    public ois() {
        this(null);
    }
}
