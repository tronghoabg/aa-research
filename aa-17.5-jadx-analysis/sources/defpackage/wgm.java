package defpackage;

import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class wgm implements zfk {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wgm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zfk
    public final zgp a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return ((wgp) this.a).e.a();
        }
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                return ((wgx) this.a).b.h();
            }
            return ((wgx) this.a).c.a();
        }
        yfq yfqVar = (yfq) obj;
        if (yfqVar.isEmpty()) {
            return zgl.a;
        }
        vtt vttVar = (vtt) this.a;
        ajek ajekVar = (ajek) vttVar.g.a();
        abnp abnpVarN = ajej.a.n();
        int size = yfqVar.size();
        abnpVarN.t();
        ajej ajejVar = (ajej) abnpVarN.b;
        ajejVar.b = 2 | ajejVar.b;
        ajejVar.e = size;
        abnpVarN.t();
        ajej ajejVar2 = (ajej) abnpVarN.b;
        ajekVar.getClass();
        ajejVar2.d = ajekVar;
        ajejVar2.b |= 1;
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < ajekVar.b.size(); i3++) {
            int iS = afyh.S(ajekVar.b.e(i3));
            if (iS == 0) {
                iS = 1;
            }
            hashSet.add(Integer.valueOf(iS - 1));
        }
        int size2 = yfqVar.size();
        for (int i4 = 0; i4 < size2; i4++) {
            ajei ajeiVar = (ajei) yfqVar.get(i4);
            int iS2 = afyh.S(ajeiVar.d);
            if (iS2 == 0) {
                iS2 = 1;
            }
            if (hashSet.contains(Integer.valueOf(iS2 - 1))) {
                abnpVarN.t();
                ajej ajejVar3 = (ajej) abnpVarN.b;
                ajeiVar.getClass();
                aboh abohVar = ajejVar3.c;
                if (!abohVar.c()) {
                    int size3 = abohVar.size();
                    ajejVar3.c = abohVar.d(size3 + size3);
                }
                ajejVar3.c.add(ajeiVar);
            }
        }
        ajej ajejVar4 = (ajej) abnpVarN.q();
        vry vryVar = vttVar.a;
        vrt vrtVarA = vru.a();
        abnp abnpVarN2 = ajgu.a.n();
        abnpVarN2.t();
        ajgu ajguVar = (ajgu) abnpVarN2.b;
        ajejVar4.getClass();
        ajguVar.r = ajejVar4;
        ajguVar.b |= 65536;
        vrtVarA.g((ajgu) abnpVarN2.q());
        zgp zgpVarA = vryVar.a(vrtVarA.a());
        wcg wcgVar = new wcg(vttVar, yfqVar, i2);
        Executor executor = vttVar.c;
        int i5 = zfb.c;
        zfa zfaVar = new zfa(zgpVarA, wcgVar);
        zgpVarA.c(zfaVar, yrm.aK(executor, zfaVar));
        return zfaVar;
    }
}
