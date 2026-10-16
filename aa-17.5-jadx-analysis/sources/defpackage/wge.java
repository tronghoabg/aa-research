package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes3.dex */
public final /* synthetic */ class wge implements zfk {
    public final /* synthetic */ wgf a;
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;
    private final /* synthetic */ int d;

    public /* synthetic */ wge(wgf wgfVar, int i, List list, int i2) {
        this.d = i2;
        this.a = wgfVar;
        this.b = i;
        this.c = list;
    }

    @Override // defpackage.zfk
    public final zgp a(Object obj) {
        if (this.d != 0) {
            final abow abowVar = (abow) obj;
            final List list = this.c;
            final int i = this.b;
            zgh zghVarS = wub.S(list);
            final wgf wgfVar = this.a;
            zfj zfjVarA = xur.a(new zfj() { // from class: wgd
                @Override // defpackage.zfj
                public final zgp a() {
                    zgp zgpVarY = wub.Y(abowVar);
                    for (int i2 = 0; i2 < i; i2++) {
                        if (((Boolean) wub.af((Future) list.get(i2))).booleanValue()) {
                            zgpVarY = zfb.g(zgpVarY, xur.b(new kew((wgc) wgfVar.a.get(i2), 10)), zfq.a);
                        }
                    }
                    return zgpVarY;
                }
            });
            return new zfp((yfg) zghVarS.b, zghVarS.a, wgfVar.b, zfjVarA);
        }
        int i2 = this.b;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            if (((Boolean) wub.af((Future) this.c.get(i3))).booleanValue()) {
                arrayList.add(((wgc) this.a.a.get(i3)).a());
            }
        }
        return wub.U(arrayList).a(new wdd(3), zfq.a);
    }

    public /* synthetic */ wge(wgf wgfVar, List list, int i, int i2) {
        this.d = i2;
        this.a = wgfVar;
        this.c = list;
        this.b = i;
    }
}
