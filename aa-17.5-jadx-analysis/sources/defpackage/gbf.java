package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.car.app.model.CarColor;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gbf {
    private static final bvf b = new byo(new fwp(5));
    private static final bvf c = new byo(new fwp(6));
    public static final yob a = yob.c("com/android/car/libraries/apphost/basewidgets/image/ui/LazyIconKt");

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.Object r9, android.content.Context r10, java.lang.String r11, int r12, defpackage.aitu r13, boolean r14, defpackage.afck r15) throws java.lang.Throwable {
        /*
            boolean r2 = r15 instanceof defpackage.gbe
            if (r2 == 0) goto L13
            r2 = r15
            gbe r2 = (defpackage.gbe) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.c = r3
            goto L18
        L13:
            gbe r2 = new gbe
            r2.<init>(r15)
        L18:
            r6 = r2
            java.lang.Object r0 = r6.b
            afcr r7 = defpackage.afcr.a
            int r2 = r6.c
            r8 = 1
            if (r2 == 0) goto L32
            if (r2 != r8) goto L2a
            java.lang.Object r1 = r6.a
            defpackage.woy.dF(r0)
            goto L76
        L2a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L32:
            defpackage.woy.dF(r0)
            if (r12 == 0) goto L7c
            boolean r0 = r9 instanceof android.net.Uri
            if (r0 == 0) goto L7c
            r0 = r9
            android.net.Uri r0 = (android.net.Uri) r0
            java.lang.String r2 = r0.getScheme()
            java.lang.String r3 = "android.resource"
            boolean r2 = defpackage.affa.f(r2, r3)
            if (r2 != 0) goto L4b
            goto L7c
        L4b:
            java.lang.String r3 = r0.getAuthority()
            if (r3 == 0) goto L7c
            int r0 = r3.length()
            if (r0 == 0) goto L7c
            boolean r0 = defpackage.affa.f(r3, r11)
            if (r0 == 0) goto L5e
            goto L7c
        L5e:
            if (r14 == 0) goto L61
            goto L7c
        L61:
            gqj r0 = new gqj
            r4 = 0
            r5 = 1
            r1 = r9
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a = r9
            r6.c = r8
            java.lang.Object r0 = defpackage.ahnc.a(r13, r0, r6)
            if (r0 != r7) goto L75
            return r7
        L75:
            r1 = r9
        L76:
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            if (r0 != 0) goto L7b
            return r1
        L7b:
            return r0
        L7c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbf.a(java.lang.Object, android.content.Context, java.lang.String, int, aitu, boolean, afck):java.lang.Object");
    }

    public static final void b(cfn cfnVar, bux buxVar, int i) {
        int i2;
        cfn cfnVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-316497858);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfnVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            cfnVar2 = cfnVar;
            ca.bb(dao.b(R.drawable.gs_error_vd_theme_24, buxVarC, 0), null, awd.c(cfy.e, 1.0f), cfnVar2, csh.g, BitmapDescriptorFactory.HUE_RED, new cjp(gux.c(buxVarC).d(), 5), buxVarC, ((i2 << 9) & 7168) | 25016, 32);
        } else {
            cfnVar2 = cfnVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bqv(cfnVar2, i, 7);
        }
    }

    public static final void c(bux buxVar, int i) {
        bux buxVarC = buxVar.c(479063302);
        int i2 = 1;
        if (buxVarC.I(i != 0, i & 1)) {
            atk.c(das.d(afp.E(awd.c(cfy.e, 1.0f), gux.c(buxVarC).Q(), gux.f(buxVarC).a.d), "lazy_icon_default_placeholder"), buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0740  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:396:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v81 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.gbg r39, defpackage.cfy r40, defpackage.cfn r41, defpackage.csi r42, defpackage.cjv r43, boolean r44, boolean r45, defpackage.afec r46, defpackage.afeg r47, boolean r48, defpackage.bux r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 2157
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gbf.d(gbg, cfy, cfn, csi, cjv, boolean, boolean, afec, afeg, boolean, bux, int, int):void");
    }

    public static final boolean e(Object obj) {
        String scheme;
        if ((obj instanceof Drawable) || (obj instanceof Bitmap) || (obj instanceof Integer)) {
            return true;
        }
        if (!(obj instanceof Uri) || (scheme = ((Uri) obj).getScheme()) == null) {
            return false;
        }
        int iHashCode = scheme.hashCode();
        return iHashCode != -368816979 ? iHashCode == 3143036 && scheme.equals("file") : scheme.equals("android.resource");
    }

    public static final void f(gat gatVar, cfy cfyVar, cfn cfnVar, csi csiVar, cjv cjvVar, boolean z, boolean z2, boolean z3, bux buxVar, int i) {
        int i2;
        cjv cjvVar2;
        bux buxVar2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1563564039);
        boolean z4 = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(gatVar) : buxVarC.E(gatVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(cfnVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.C(csiVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            cjvVar2 = cjvVar;
            i2 |= true != buxVarC.C(cjvVar2) ? 8192 : 16384;
        } else {
            cjvVar2 = cjvVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.D(z) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.D(z2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != buxVarC.D(z3) ? 4194304 : 8388608;
        }
        int i4 = i2;
        if (buxVarC.I((4793491 & i4) != 4793490, i4 & 1)) {
            cmw cmwVarG = fwn.g(R.drawable.media_icon_animation, buxVarC);
            if (gatVar.a == null && !z2) {
                z4 = false;
            }
            cjv cjvVarK = k(z, cjvVar2, Boolean.valueOf(z4), gatVar, z3, buxVarC);
            buxVar2 = buxVarC;
            int i5 = i4 << 3;
            ca.bb(cmwVarG, "Image", cfyVar, cfnVar, csiVar, BitmapDescriptorFactory.HUE_RED, cjvVarK != null ? new cjp(cjvVarK.a, 5) : null, buxVar2, (i5 & 896) | 56 | (i5 & 7168) | (i5 & 57344), 32);
        } else {
            buxVar2 = buxVarC;
            buxVar2.s();
        }
        bxf bxfVarJ = buxVar2.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new nhy(gatVar, cfyVar, cfnVar, csiVar, cjvVar, z, z2, z3, i, 1);
        }
    }

    public static final a g(int i) {
        return (i == Integer.MAX_VALUE || i <= 0) ? ftj.a : new fti(i);
    }

    private static final cmw h(bwq bwqVar) {
        return (cmw) bwqVar.a();
    }

    private static final fsy i(bwq bwqVar) {
        return (fsy) bwqVar.a();
    }

    private static final Boolean j(bwq bwqVar) {
        return (Boolean) bwqVar.a();
    }

    private static final cjv k(boolean z, cjv cjvVar, Boolean bool, gbg gbgVar, boolean z2, bux buxVar) {
        hjw hjwVarF;
        List listB;
        Object next;
        cjv cjvVar2;
        cjv cjvVar3;
        CarColor carColorA = gbgVar.a();
        if (carColorA == null) {
            buxVar.v(2005546685);
            ((bvv) buxVar).Y(false);
            hjwVarF = null;
        } else {
            buxVar.v(1865810372);
            hjwVarF = gzw.f(carColorA, buxVar);
            ((bvv) buxVar).Y(false);
        }
        if (hjwVarF == null) {
            buxVar.v(2005560015);
            ((bvv) buxVar).Y(false);
            listB = null;
        } else {
            buxVar.v(1865810802);
            listB = hjwVarF.b(buxVar);
            ((bvv) buxVar).Y(false);
        }
        if (listB == null) {
            buxVar.v(2005588969);
            ((bvv) buxVar).Y(false);
            cjvVar2 = null;
        } else {
            buxVar.v(2005588970);
            Iterator it = listB.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (fww.p(((cjv) buxVar.f(ggf.a)).a, ((cjv) next).a, buxVar, 0)) {
                    break;
                }
            }
            cjvVar2 = (cjv) next;
            ((bvv) buxVar).Y(false);
        }
        if (cjvVar == null || cjvVar.a == 16) {
            cjvVar = null;
        }
        if (!z || cjvVar == null) {
            if (!z2 && cjvVar2 != null) {
                return cjvVar2;
            }
            if (gbgVar.a() == null) {
                cjvVar3 = cjvVar;
            } else if (cjvVar == null) {
                cjvVar3 = null;
            }
            if (!affa.f(bool, true) || cjvVar == null) {
                return null;
            }
            return cjvVar3;
        }
        return cjvVar;
    }
}
