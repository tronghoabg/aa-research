package defpackage;

import android.content.res.Resources;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class vq {
    /* JADX WARN: Removed duplicated region for block: B:102:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final defpackage.afdr r24, final defpackage.afeg r25, defpackage.cfy r26, defpackage.afeg r27, final defpackage.afeg r28, final defpackage.afeg r29, final defpackage.afeg r30, defpackage.ckv r31, long r32, long r34, long r36, long r38, defpackage.dnk r40, defpackage.bux r41, final int r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vq.a(afdr, afeg, cfy, afeg, afeg, afeg, afeg, ckv, long, long, long, long, dnk, bux, int, int, int):void");
    }

    public static final cfy b(cfy cfyVar, float f) {
        return cfyVar.a(new cgc(f));
    }

    public static final afeg c(ddu dduVar) {
        return (afeg) dduVar.b.g(ddq.e);
    }

    public static final void d(ddu dduVar, int i, afec afecVar) {
        ddu dduVar2;
        byw bywVar = new byw(new ddu[16]);
        List listK = dduVar.k(false, false);
        int i2 = bywVar.b;
        while (true) {
            bywVar.p(i2, listK);
            while (true) {
                int i3 = bywVar.b;
                if (i3 == 0) {
                    return;
                }
                dduVar2 = (ddu) bywVar.c(i3 - 1);
                if (!ddv.a(dduVar2)) {
                    ddr ddrVar = dduVar2.b;
                    if (ddrVar.f(ddx.j)) {
                        continue;
                    } else {
                        cyc cycVarF = dduVar2.f();
                        if (cycVarF == null) {
                            crt.a("Expected semantics node to have a coordinator.");
                            throw new aezp();
                        }
                        dlp dlpVarQ = dlf.q(crt.i(cycVarF, true));
                        if (dlpVarQ.b < dlpVarQ.d && dlpVarQ.c < dlpVarQ.e) {
                            afeg afegVarC = c(dduVar2);
                            ddp ddpVar = (ddp) ddrVar.g(ddx.x);
                            if (afegVarC == null || ddpVar == null || ((Number) ddpVar.b.invoke()).floatValue() <= BitmapDescriptorFactory.HUE_RED) {
                                break;
                            }
                            int i4 = 1 + i;
                            afecVar.invoke(new dde(dduVar2, i4, dlpVarQ, cycVarF));
                            d(dduVar2, i4, afecVar);
                        }
                    }
                }
            }
            listK = dduVar2.k(false, false);
            i2 = bywVar.b;
        }
    }

    public static final String e(int i, bux buxVar) {
        return ((Resources) buxVar.f(daa.c)).getString(i);
    }

    public static final String f(int i, Object[] objArr, bux buxVar) {
        return ((Resources) buxVar.f(daa.c)).getString(i, Arrays.copyOf(objArr, 1));
    }

    public static final float g(bux buxVar) {
        return ((Resources) buxVar.f(daa.c)).getDimension(R.dimen.gearhead_coolwalk_rounded_corner_radius) / ((dlg) buxVar.f(dbc.d)).a();
    }
}
