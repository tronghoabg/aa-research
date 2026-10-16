package defpackage;

import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.List;

/* loaded from: classes3.dex */
public final class vpf implements vow {
    final /* synthetic */ vsq a;

    public vpf(vsq vsqVar) {
        this.a = vsqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, tmb] */
    @Override // defpackage.vow
    public final boolean a(abnp abnpVar) {
        vsq vsqVar = this.a;
        int i = 0;
        if (((Boolean) vsqVar.e.a()).booleanValue()) {
            xxh xxhVar = (xxh) vsqVar.d;
            if (xxhVar.f()) {
                int i2 = 0;
                while (true) {
                    if (i2 >= ((vor) abnpVar.b).e.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((von) ((vor) abnpVar.b).e.get(i2)).b == 3) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    abnpVar.t();
                    vor vorVar = (vor) abnpVar.b;
                    vorVar.b();
                    vorVar.e.remove(i2);
                }
                abnp abnpVarN = vop.a.n();
                abnpVarN.t();
                vop vopVar = (vop) abnpVarN.b;
                vopVar.e = 1;
                vopVar.b |= 2;
                abpt abptVarAg = wox.ag(vsqVar.f.f());
                abnpVarN.t();
                vop vopVar2 = (vop) abnpVarN.b;
                abptVarAg.getClass();
                vopVar2.d = abptVarAg;
                vopVar2.b |= 1;
                if (((Boolean) vsqVar.c.a()).booleanValue()) {
                    yfq yfqVarA = ((vxg) xxhVar.b()).a();
                    long jLongValue = ((Long) vsqVar.a.a()).longValue();
                    long jLongValue2 = ((Long) vsqVar.g.a()).longValue();
                    Stream map = Collection.EL.stream(yfqVarA).map(new uzr(6));
                    int i3 = yfq.d;
                    yfq yfqVarA2 = vwi.a((List) map.collect(ycm.a), jLongValue, jLongValue2);
                    int size = yfqVarA2.size();
                    while (i < size) {
                        ajhb ajhbVar = (ajhb) yfqVarA2.get(i);
                        abnp abnpVarN2 = ajgw.a.n();
                        abnpVarN2.t();
                        ajgw ajgwVar = (ajgw) abnpVarN2.b;
                        ajhbVar.getClass();
                        ajgwVar.d = ajhbVar;
                        ajgwVar.c = 3;
                        abnp abnpVarN3 = ajgy.a.n();
                        abnpVarN3.t();
                        ajgy ajgyVar = (ajgy) abnpVarN3.b;
                        ajgyVar.b |= 2;
                        ajgyVar.c = true;
                        ajgy ajgyVar2 = (ajgy) abnpVarN3.q();
                        abnpVarN2.t();
                        ajgw ajgwVar2 = (ajgw) abnpVarN2.b;
                        ajgyVar2.getClass();
                        ajgwVar2.e = ajgyVar2;
                        ajgwVar2.b |= 1;
                        abnpVarN.aS(abnpVarN2);
                        i++;
                    }
                } else {
                    yfq yfqVarB = ((vxg) xxhVar.b()).b();
                    long jLongValue3 = ((Long) vsqVar.a.a()).longValue();
                    long jLongValue4 = ((Long) vsqVar.g.a()).longValue();
                    Stream map2 = Collection.EL.stream(yfqVarB).map(new uzr(4));
                    int i4 = yfq.d;
                    yfq yfqVarA3 = vwi.a((List) map2.collect(ycm.a), jLongValue3, jLongValue4);
                    int size2 = yfqVarA3.size();
                    while (i < size2) {
                        ajfr ajfrVar = (ajfr) yfqVarA3.get(i);
                        abnp abnpVarN4 = ajgw.a.n();
                        abnpVarN4.t();
                        ajgw ajgwVar3 = (ajgw) abnpVarN4.b;
                        ajfrVar.getClass();
                        ajgwVar3.d = ajfrVar;
                        ajgwVar3.c = 1;
                        abnp abnpVarN5 = ajgy.a.n();
                        abnpVarN5.t();
                        ajgy ajgyVar3 = (ajgy) abnpVarN5.b;
                        ajgyVar3.b |= 2;
                        ajgyVar3.c = true;
                        ajgy ajgyVar4 = (ajgy) abnpVarN5.q();
                        abnpVarN4.t();
                        ajgw ajgwVar4 = (ajgw) abnpVarN4.b;
                        ajgyVar4.getClass();
                        ajgwVar4.e = ajgyVar4;
                        ajgwVar4.b |= 1;
                        abnpVarN.aS(abnpVarN4);
                        i++;
                    }
                }
                abnp abnpVarN6 = von.a.n();
                vop vopVar3 = (vop) abnpVarN.q();
                abnpVarN6.t();
                von vonVar = (von) abnpVarN6.b;
                vopVar3.getClass();
                vonVar.c = vopVar3;
                vonVar.b = 3;
                abnpVar.aR(abnpVarN6);
                return true;
            }
        }
        return false;
    }
}
