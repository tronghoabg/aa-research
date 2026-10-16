package defpackage;

import com.google.android.projection.gearhead.companion.DeveloperHeadUnitNetworkService;

/* loaded from: classes2.dex */
public final class pdn implements rbt {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public pdn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024b  */
    /* JADX WARN: Type inference failed for: r11v15, types: [eqa, java.lang.Object] */
    @Override // defpackage.rbt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdn.a():void");
    }

    @Override // defpackage.rbt
    public final void b(rbs rbsVar) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((ype) ((ype) kpz.a.h()).ai((char) 3371)).y("Connection suspended | %s", rbsVar);
                ((eqj) this.a).p();
                return;
            }
            if (i == 2) {
                Object obj = this.a;
                synchronized (((DeveloperHeadUnitNetworkService) obj).e) {
                    ((DeveloperHeadUnitNetworkService) obj).f = null;
                }
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        ((ype) ((ype) xco.a.h()).ai((char) 10087)).y("onConnectionSuspended: %s", rbsVar);
                        return;
                    }
                    return;
                }
                ((ype) ((ype) xbo.f.h()).ai((char) 10021)).y("Car Client connection suspended: %s", rbsVar);
                Object obj2 = this.a;
                xbo xboVar = (xbo) obj2;
                xboVar.u = false;
                xboVar.s();
                xau xauVar = xboVar.q;
                if (xauVar != null) {
                    xauVar.a();
                }
                xaz xazVar = xboVar.s;
                if (xazVar != null) {
                    xazVar.a();
                }
                ((xas) obj2).p(yzy.dj);
            }
        }
    }
}
