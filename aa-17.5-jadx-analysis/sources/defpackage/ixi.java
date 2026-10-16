package defpackage;

import com.google.android.gms.car.navigation.AdasRouteInfo;
import com.google.android.gms.car.navigation.Distance;

/* loaded from: classes2.dex */
public final class ixi {
    public static final ixh a = new ixh();

    public static xld a(Distance distance) {
        abnp abnpVarN = xld.a.n();
        int i = distance.a;
        if (i > 0) {
            abnpVarN.t();
            xld xldVar = (xld) abnpVarN.b;
            xldVar.b |= 1;
            xldVar.c = i;
        }
        String str = distance.b;
        if (str != null) {
            abnpVarN.t();
            xld xldVar2 = (xld) abnpVarN.b;
            xldVar2.b |= 2;
            xldVar2.d = str;
        }
        int i2 = distance.c;
        abnpVarN.t();
        xld xldVar3 = (xld) abnpVarN.b;
        int iAD = a.aD(i2);
        if (iAD == 0) {
            throw null;
        }
        xldVar3.e = iAD - 1;
        xldVar3.b |= 4;
        return (xld) abnpVarN.q();
    }

    public static xma b(AdasRouteInfo.Path path) {
        abnp abnpVarN = xma.a.n();
        int[] iArr = path.a;
        if (iArr != null) {
            for (int i : iArr) {
                abnpVarN.t();
                xma xmaVar = (xma) abnpVarN.b;
                abod abodVar = xmaVar.b;
                if (!abodVar.c()) {
                    xmaVar.b = abnv.G(abodVar);
                }
                xmaVar.b.g(i);
            }
        }
        int[] iArr2 = path.b;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                abnpVarN.t();
                xma xmaVar2 = (xma) abnpVarN.b;
                abod abodVar2 = xmaVar2.c;
                if (!abodVar2.c()) {
                    xmaVar2.c = abnv.G(abodVar2);
                }
                xmaVar2.c.g(i2);
            }
        }
        int[] iArr3 = path.c;
        if (iArr3 != null) {
            for (int i3 : iArr3) {
                abnpVarN.t();
                xma xmaVar3 = (xma) abnpVarN.b;
                abod abodVar3 = xmaVar3.d;
                if (!abodVar3.c()) {
                    xmaVar3.d = abnv.G(abodVar3);
                }
                xmaVar3.d.g(i3);
            }
        }
        return (xma) abnpVarN.q();
    }
}
