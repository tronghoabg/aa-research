package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.view.KeyEvent;
import android.view.View;
import android.view.textclassifier.TextClassification;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.text.BreakIterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class asl {
    public static final void A(cfy cfyVar, bux buxVar) {
        obg obgVar = obg.a;
        long jB = buxVar.b();
        long j = jB ^ (jB >>> 32);
        cfy cfyVarJ = bzi.j(buxVar, cfyVar);
        ccx ccxVarN = buxVar.N();
        afdr afdrVar = cwb.a;
        buxVar.M();
        buxVar.w();
        if (buxVar.G()) {
            buxVar.j(afdrVar);
        } else {
            buxVar.y();
        }
        byq.c(buxVar, obgVar, cwb.e);
        byq.c(buxVar, ccxVarN, cwb.d);
        buxVar.i(afak.a, new alx(cwb.g, 16));
        byq.c(buxVar, cfyVarJ, cwb.c);
        byq.c(buxVar, Integer.valueOf((int) j), cwb.f);
        buxVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ctq B(defpackage.avt r26, int r27, int r28, int r29, int r30, int r31, defpackage.cts r32, java.util.List r33, defpackage.cuo[] r34, int r35, int r36, int[] r37, int r38) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asl.B(avt, int, int, int, int, int, cts, java.util.List, cuo[], int, int, int[], int):ctq");
    }

    public static final avu C(csp cspVar) {
        Object objG = cspVar.g();
        if (objG instanceof avu) {
            return (avu) objG;
        }
        return null;
    }

    public static final avu D(cuo cuoVar) {
        Object objG = cuoVar.g();
        if (objG instanceof avu) {
            return (avu) objG;
        }
        return null;
    }

    public static final float E(avp avpVar, dlr dlrVar) {
        return dlrVar == dlr.a ? avpVar.c(dlrVar) : avpVar.b(dlrVar);
    }

    public static final float F(avp avpVar, dlr dlrVar) {
        return dlrVar == dlr.a ? avpVar.b(dlrVar) : avpVar.c(dlrVar);
    }

    public static final cfy G(cfy cfyVar, avp avpVar) {
        return cfyVar.a(new avq(avpVar));
    }

    public static final cfy H(cfy cfyVar, float f) {
        return cfyVar.a(new avl(f, f, f, f));
    }

    public static final cfy I(cfy cfyVar, float f, float f2) {
        return cfyVar.a(new avl(f, f2, f, f2));
    }

    public static final cfy J(cfy cfyVar, float f, float f2, float f3, float f4) {
        return cfyVar.a(new avl(f, f2, f3, f4));
    }

    public static /* synthetic */ avp K(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new avr(f, f2, f, f2);
    }

    public static /* synthetic */ avp L(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return new avr(f, f2, f3, f4);
    }

    public static final void M(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(771959668);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(null) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, bxp.b);
                bvvVar.ad(parcelableSnapshotMutableState);
                objS = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objS;
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new beg(bwqVar, 8);
                bvvVar.ad(objS2);
            }
            czz.am(bhq.b.b(O((afdr) objS2, buxVarC)), bxc.i(-291176396, true, new bgh(cfyVar, bwqVar, afegVar, i4), buxVarC), buxVarC, 56);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(cfyVar, afegVar, i, 10);
        }
    }

    public static final void N(cfy cfyVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2064964257);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            M(cfyVar, afegVar, buxVarC, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afz(cfyVar, afegVar, i, 9);
        }
    }

    public static final bhp O(afdr afdrVar, bux buxVar) {
        View view = (View) buxVar.f(daa.f);
        boolean zC = buxVar.C(view);
        bvv bvvVar = (bvv) buxVar;
        Object objS = bvvVar.S();
        if (zC || objS == buw.a) {
            objS = new bgg(view, afdrVar);
            bvvVar.ad(objS);
        }
        bgg bggVar = (bgg) objS;
        boolean zE = buxVar.E(bggVar);
        Object objS2 = bvvVar.S();
        if (zE || objS2 == buw.a) {
            objS2 = new bgb(bggVar, 5);
            bvvVar.ad(objS2);
        }
        bvq.c(bggVar, (afec) objS2, buxVar);
        return bggVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003c -> B:18:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(defpackage.crl r7, defpackage.afck r8) {
        /*
            boolean r0 = r8 instanceof defpackage.bga
            if (r0 == 0) goto L13
            r0 = r8
            bga r0 = (defpackage.bga) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            bga r0 = new bga
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            crl r7 = r0.c
            defpackage.woy.dF(r8)
            goto L3f
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.woy.dF(r8)
        L34:
            r0.c = r7
            r0.b = r3
            java.lang.Object r8 = defpackage.ti.e(r7, r0)
            if (r8 != r1) goto L3f
            return r1
        L3f:
            cql r8 = (defpackage.cql) r8
            int r2 = r8.c
            r2 = r2 & 66
            if (r2 == 0) goto L34
            java.util.List r8 = r8.a
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L4f:
            if (r5 >= r2) goto L61
            java.lang.Object r6 = r8.get(r5)
            cqu r6 = (defpackage.cqu) r6
            boolean r6 = defpackage.tl.j(r6)
            if (r6 != 0) goto L5e
            goto L34
        L5e:
            int r5 = r5 + 1
            goto L4f
        L61:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asl.P(crl, afck):java.lang.Object");
    }

    public static final boolean Q(bft bftVar) {
        return bftVar == bfx.b;
    }

    public static final boolean R(dfu dfuVar) {
        if (dfuVar != null) {
            return dfuVar.a == null && dfuVar.b == null;
        }
        return true;
    }

    public static final cjb S(dlg dlgVar, int i, djy djyVar, dft dftVar, boolean z, int i2) {
        cjb cjbVarM = dftVar != null ? dftVar.m(djyVar.b.a(i)) : cjb.a;
        int iEF = dlgVar.eF(2.0f);
        return cjb.j(cjbVarM, z ? (i2 - cjbVarM.b) - iEF : cjbVarM.b, z ? i2 - cjbVarM.b : iEF + cjbVarM.b, BitmapDescriptorFactory.HUE_RED, 10);
    }

    public static final boolean T(KeyEvent keyEvent, int i) {
        return ((int) (rl.f(keyEvent) >> 32)) == i;
    }

    public static final void U(bii biiVar, Object obj, String str, int i, afec afecVar) {
        biiVar.f(new bfv(obj, str, i, afecVar));
    }

    public static final void V(bii biiVar, Object obj, TextClassification textClassification, int i, Drawable drawable) {
        biiVar.f(new bfz(obj, textClassification, i, drawable));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final void W(bii biiVar, final Context context, final boolean z, final CharSequence charSequence, final long j) {
        if (dfv.i(j) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        ?? Invoke = bfq.a.invoke(context);
        if (Invoke.isEmpty()) {
            return;
        }
        biiVar.g();
        int size = Invoke.size();
        for (int i = 0; i < size; i++) {
            final ResolveInfo resolveInfo = (ResolveInfo) Invoke.get(i);
            U(biiVar, new bfs(i), resolveInfo.loadLabel(packageManager).toString(), 0, new afec() { // from class: bfr
                @Override // defpackage.afec
                public final Object invoke(Object obj) {
                    boolean z2 = z;
                    bfq.b.invoke(context, resolveInfo, Boolean.valueOf(z2), charSequence, new dfv(j));
                    ((bfy) obj).a();
                    return afak.a;
                }
            });
        }
        biiVar.g();
    }

    public static final void X(cju cjuVar, long j, djn djnVar, dft dftVar, cjk cjkVar) {
        long j2 = dfv.a;
        long j3 = 4294967295L & j;
        int i = (int) (j >> 32);
        int i2 = (int) j3;
        int iA = djnVar.a(Math.min(i, i2));
        int iA2 = djnVar.a(Math.max(i, i2));
        if (iA != iA2) {
            cjuVar.p(dftVar.r(iA, iA2), cjkVar);
        }
    }

    public static final int Y(String str, int i) {
        emr emrVar = emr.b;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    public static final int Z(String str, int i) {
        emr emrVar = emr.b;
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final Void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final int aa(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int ab(CharSequence charSequence, int i) {
        while (i > 0) {
            int i2 = i - 1;
            if (charSequence.charAt(i2) == '\n') {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    public static final Object ac(cqz cqzVar, ben benVar, afck afckVar) {
        Object objA = ahni.a(new bei(cqzVar, benVar, null), afckVar);
        return objA == afcr.a ? objA : afak.a;
    }

    public static final void ad(List list, ivs ivsVar, afec afecVar, fbf fbfVar) {
        djv djvVarB = ivsVar.b(list);
        if (fbfVar != null) {
            fbfVar.e(null, djvVarB);
        }
        afecVar.invoke(djvVarB);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [djq, java.lang.Object] */
    public static final fbf ae(fbf fbfVar, djv djvVar, ivs ivsVar, dje djeVar, afec afecVar, afec afecVar2) {
        affv affvVar = new affv();
        acg acgVar = new acg(ivsVar, afecVar, affvVar, 7, (int[]) null);
        ?? r8 = fbfVar.b;
        r8.d(djvVar, djeVar, acgVar, afecVar2);
        fbf fbfVar2 = new fbf(fbfVar, (djq) r8);
        ((AtomicReference) fbfVar.a).set(fbfVar2);
        affvVar.a = fbfVar2;
        return (fbf) affvVar.a;
    }

    public static final void af(des desVar, String str) {
        if ("�".length() <= 0) {
            c("alternateText can't be an empty string.");
        }
        der derVar = new der(new dfo(str), desVar.a.length(), Integer.MIN_VALUE, "androidx.compose.foundation.text.inlineContent");
        List list = desVar.b;
        list.add(derVar);
        desVar.c.add(derVar);
        list.size();
        desVar.f("�");
        desVar.g();
    }

    public static final int ag(float f, float f2, float f3, int i, int i2) {
        if (i == i2) {
            return -1;
        }
        int i3 = i - 2;
        if (i3 < 0) {
            i3 = 0;
        }
        float f4 = f + (f2 * i3);
        int i4 = i - 1;
        if (i4 > 1) {
            i4 = 1;
        }
        return afgi.k(f4 + (f3 * i4));
    }

    public static final void ah(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            c(a.bB(i2, i, "both minLines ", " and maxLines ", " must be greater than zero"));
        }
        if (i <= i2) {
            return;
        }
        c(a.bo(i2, i, "minLines ", " must be less than or equal to maxLines "));
    }

    public static final void ai(cfy cfyVar, blr blrVar, afeg afegVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(2036174316);
        if (i3 == 0) {
            i2 = (true != buxVarC.C(cfyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 16;
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.E(blrVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            ctp ctpVarB = atk.b(cfl.a, true);
            bvv bvvVar = (bvv) buxVarC;
            long j = bvvVar.u;
            long j2 = j ^ (j >>> 32);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVar);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarB, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf((int) j2), cwb.f);
            buxVarC.i(afak.a, new alx(cwb.g, i4));
            byq.c(buxVarC, cfyVarJ, cwb.c);
            afp.G(blrVar, afegVar, buxVarC, (i2 >> 3) & 126);
            bvvVar.Y(true);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new alu(cfyVar, blrVar, afegVar, i, 3);
        }
    }

    public static final void aj(final blr blrVar, final boolean z, bux buxVar, final int i) {
        int i2;
        bff bffVarD;
        bed bedVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(626339208);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(blrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.D(z) ? 16 : 32;
        }
        if (!buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            buxVarC.s();
        } else if (z) {
            buxVarC.v(1530097388);
            bed bedVar2 = blrVar.d;
            dft dftVar = null;
            if (bedVar2 != null && (bffVarD = bedVar2.d()) != null && (bedVar = blrVar.d) != null && !bedVar.j) {
                dftVar = bffVarD.a;
            }
            if (dftVar == null) {
                buxVarC.v(1530097387);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(1530097388);
                if (dfv.i(blrVar.f().b)) {
                    buxVarC.v(2110860558);
                    ((bvv) buxVarC).Y(false);
                } else {
                    buxVarC.v(2109807302);
                    int iA = blrVar.b.a((int) (blrVar.f().b >> 32));
                    int iA2 = blrVar.b.a((int) (blrVar.f().b & 4294967295L));
                    int iP = dftVar.p(iA);
                    int iP2 = dftVar.p(Math.max(iA2 - 1, 0));
                    bed bedVar3 = blrVar.d;
                    if (bedVar3 == null || !((Boolean) bedVar3.g.a()).booleanValue()) {
                        buxVarC.v(2110490542);
                        ((bvv) buxVarC).Y(false);
                    } else {
                        buxVarC.v(2110225306);
                        czz.az(true, iP, blrVar, buxVarC, ((i2 << 6) & 896) | 6);
                        ((bvv) buxVarC).Y(false);
                    }
                    bed bedVar4 = blrVar.d;
                    if (bedVar4 == null || !((Boolean) bedVar4.h.a()).booleanValue()) {
                        buxVarC.v(2110838734);
                        ((bvv) buxVarC).Y(false);
                    } else {
                        buxVarC.v(2110574459);
                        czz.az(false, iP2, blrVar, buxVarC, ((i2 << 6) & 896) | 6);
                        ((bvv) buxVarC).Y(false);
                    }
                    ((bvv) buxVarC).Y(false);
                }
                bed bedVar5 = blrVar.d;
                if (bedVar5 != null) {
                    if (!affa.f(blrVar.n.a(), blrVar.f().a())) {
                        bedVar5.m(false);
                    }
                    if (bedVar5.p()) {
                        if (bedVar5.r()) {
                            blrVar.s();
                        } else {
                            blrVar.l();
                        }
                    }
                }
                ((bvv) buxVarC).Y(false);
            }
            ((bvv) buxVarC).Y(false);
        } else {
            buxVarC.v(1989076778);
            ((bvv) buxVarC).Y(false);
            blrVar.l();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: bdh
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    blr blrVar2 = blrVar;
                    int i6 = 613566756 & i4;
                    boolean z2 = z;
                    asl.aj(blrVar2, z2, (bux) obj, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return afak.a;
                }
            };
        }
    }

    public static final void ak(blr blrVar, bux buxVar, int i) {
        int i2;
        deu deuVarE;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1436003720);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(blrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i4 = 0;
        if (buxVarC.I((i2 & 3) != 2, i2 & 1)) {
            bed bedVar = blrVar.d;
            if (bedVar == null || !((Boolean) bedVar.i.a()).booleanValue() || (deuVarE = blrVar.e()) == null || deuVarE.a() <= 0) {
                buxVarC.v(-2111042550);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-2112351432);
                boolean zC = buxVarC.C(blrVar);
                bvv bvvVar = (bvv) buxVarC;
                Object objS = bvvVar.S();
                if (zC || objS == buw.a) {
                    objS = new blk(blrVar);
                    bvvVar.ad(objS);
                }
                ben benVar = (ben) objS;
                dlg dlgVar = (dlg) buxVarC.f(dbc.d);
                djn djnVar = blrVar.b;
                long j = blrVar.f().b;
                long j2 = dfv.a;
                int iA = djnVar.a((int) (j >> 32));
                bed bedVar2 = blrVar.d;
                bff bffVarD = bedVar2 != null ? bedVar2.d() : null;
                bffVarD.getClass();
                dft dftVar = bffVarD.a;
                cjb cjbVarM = dftVar.m(afpt.g(iA, 0, dftVar.a.a.a()));
                long jFloatToRawIntBits = (Float.floatToRawIntBits(cjbVarM.e) & 4294967295L) | (Float.floatToRawIntBits(cjbVarM.b + (dlgVar.eA(2.0f) / 2.0f)) << 32);
                boolean zB = buxVarC.B(jFloatToRawIntBits);
                Object objS2 = bvvVar.S();
                if (zB || objS2 == buw.a) {
                    objS2 = new bdq(jFloatToRawIntBits);
                    bvvVar.ad(objS2);
                }
                bjy bjyVar = (bjy) objS2;
                boolean zE = buxVarC.E(benVar) | buxVarC.E(blrVar);
                Object objS3 = bvvVar.S();
                if (zE || objS3 == buw.a) {
                    objS3 = new nhk(benVar, blrVar, 1);
                    bvvVar.ad(objS3);
                }
                cql cqlVar = crh.a;
                cfy crgVar = new crg(benVar, null, (PointerInputEventHandler) objS3);
                boolean zB2 = buxVarC.B(jFloatToRawIntBits);
                Object objS4 = bvvVar.S();
                if (zB2 || objS4 == buw.a) {
                    objS4 = new bdg(jFloatToRawIntBits, i4);
                    bvvVar.ad(objS4);
                }
                AtomicInteger atomicInteger = dds.a;
                ddg ddgVar = new ddg(false, (afec) objS4);
                afp.O(bjyVar, ddgVar == cfy.e ? crgVar : new cft(crgVar, ddgVar), 0L, buxVarC, 0);
                bvvVar.Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new ati(blrVar, i, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [djq, java.lang.Object] */
    public static final void al(bed bedVar) {
        fbf fbfVar = bedVar.s;
        if (fbfVar != null) {
            bedVar.m.invoke(djv.b((djv) bedVar.t.b, null, 0L, 3));
            fbf fbfVar2 = (fbf) fbfVar.a;
            if (a.q((AtomicReference) fbfVar2.a, fbfVar)) {
                fbfVar2.b.f();
            }
        }
        bedVar.s = null;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [djq, java.lang.Object] */
    public static final void am(bed bedVar, djv djvVar, djn djnVar) {
        fbf fbfVar;
        cst cstVarE;
        cec cecVar = (cec) cek.i.j();
        afec afecVarI = cecVar != null ? cecVar.i() : null;
        cec cecVarI = byx.i(cecVar);
        try {
            bff bffVarD = bedVar.d();
            if (bffVarD != null && (fbfVar = bedVar.s) != null && (cstVarE = bedVar.e()) != null) {
                bem bemVar = bedVar.a;
                dft dftVar = bffVarD.a;
                if (bedVar.p()) {
                    long j = djvVar.b;
                    long j2 = dfv.a;
                    int iA = djnVar.a(Math.max((int) (j >> 32), (int) (j & 4294967295L)));
                    beg begVar = new beg(bemVar, 2);
                    String str = bep.a;
                    cjb cjbVarL = iA < dftVar.a.a.a() ? dftVar.l(iA) : iA != 0 ? dftVar.l(iA - 1) : new cjb(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, (int) (((dlq) begVar.invoke()).a & 4294967295L));
                    float f = cjbVarL.b;
                    float f2 = cjbVarL.c;
                    long j3 = cstVarE.j((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
                    cjb cjbVarE = byx.E((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L))) & 4294967295L), (Float.floatToRawIntBits(cjbVarL.d - f) << 32) | (4294967295L & Float.floatToRawIntBits(cjbVarL.e - f2)));
                    if (fbfVar.d()) {
                        fbfVar.b.b(cjbVarE);
                    }
                }
            }
        } finally {
            byx.l(cecVar, cecVarI, afecVarI);
        }
    }

    public static final void an(bed bedVar, cil cilVar) {
        if (!bedVar.p()) {
            cilVar.a(7);
            return;
        }
        sm smVar = bedVar.v;
        if (smVar != null) {
            smVar.r();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:207:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0454 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x069d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06a8  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x07e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0946  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0952  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ao(final defpackage.djv r58, final defpackage.afec r59, final defpackage.cfy r60, final defpackage.dfw r61, final defpackage.dka r62, final defpackage.afec r63, final defpackage.cjs r64, final boolean r65, int r66, final int r67, final defpackage.dje r68, final defpackage.beb r69, final boolean r70, final defpackage.afeh r71, defpackage.bux r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 2522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asl.ao(djv, afec, cfy, dfw, dka, afec, cjs, boolean, int, int, dje, beb, boolean, afeh, bux, int, int):void");
    }

    public static final void ap(fbf fbfVar, bed bedVar, djv djvVar, dje djeVar, djn djnVar) {
        bedVar.s = ae(fbfVar, djvVar, bedVar.t, djeVar, bedVar.m, bedVar.n);
        am(bedVar, djvVar, djnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object aq(defpackage.apr r10, float r11, defpackage.aed r12, defpackage.kwp r13, defpackage.afec r14, defpackage.afck r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof defpackage.arp
            if (r0 == 0) goto L13
            r0 = r15
            arp r0 = (defpackage.arp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            arp r0 = new arp
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            float r11 = r0.a
            affs r10 = r0.e
            aed r12 = r0.d
            defpackage.woy.dF(r15)
            goto L68
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            defpackage.woy.dF(r15)
            affs r6 = new affs
            r6.<init>()
            java.lang.Object r15 = r12.b()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r2 = 0
            int r15 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r15 != 0) goto L4e
            r15 = 0
            goto L4f
        L4e:
            r15 = r3
        L4f:
            aro r4 = new aro
            r9 = 1
            r7 = r10
            r5 = r11
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9)
            r0.d = r12
            r0.e = r6
            r0.a = r5
            r0.c = r3
            java.lang.Object r10 = defpackage.afp.ah(r12, r13, r15, r4, r0)
            if (r10 == r1) goto L76
            r11 = r5
            r10 = r6
        L68:
            bii r13 = new bii
            float r10 = r10.a
            float r11 = r11 - r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r11)
            r13.<init>(r10, r12)
            return r13
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asl.aq(apr, float, aed, kwp, afec, afck):java.lang.Object");
    }

    public static final Void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final void c(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    public static final void e(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static final void f(long j, Parcel parcel) {
        long jB = dlt.b(j);
        byte b = 0;
        if (!a.j(jB, 0L)) {
            if (a.j(jB, 4294967296L)) {
                b = 1;
            } else if (a.j(jB, 8589934592L)) {
                b = 2;
            }
        }
        parcel.writeByte(b);
        if (a.j(dlt.b(j), 0L)) {
            return;
        }
        parcel.writeFloat(dlt.a(j));
    }

    public static final long g(Parcel parcel) {
        return byx.x(parcel.readLong());
    }

    public static final long h(Parcel parcel) {
        byte b = parcel.readByte();
        long j = b == 1 ? 4294967296L : b == 2 ? 8589934592L : 0L;
        if (!a.j(j, 0L)) {
            return dln.g(j, parcel.readFloat());
        }
        dlu[] dluVarArr = dlt.a;
        return dln.g(0L, Float.NaN);
    }

    public static final bym i(ase aseVar, bux buxVar, int i) {
        ase aseVar2;
        Object objG = buxVar.g();
        Object obj = buw.a;
        if (objG == obj) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        boolean z = (((i & 14) ^ 6) > 4 && buxVar.C(aseVar)) || (i & 6) == 4;
        Object objG2 = buxVar.g();
        if (z || objG2 == obj) {
            aseVar2 = aseVar;
            ain ainVar = new ain(aseVar2, bwqVar, (afck) null, 15, (char[]) null);
            buxVar.x(ainVar);
            objG2 = ainVar;
        } else {
            aseVar2 = aseVar;
        }
        bvq.g(aseVar2, (afeg) objG2, buxVar);
        return bwqVar;
    }

    public static final bym j(ase aseVar, bux buxVar, int i) {
        Object objG = buxVar.g();
        Object obj = buw.a;
        if (objG == obj) {
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        boolean z = (((i & 14) ^ 6) > 4 && buxVar.C(aseVar)) || (i & 6) == 4;
        Object objG2 = buxVar.g();
        if (z || objG2 == obj) {
            objG2 = new ain(aseVar, bwqVar, (afck) null, 13);
            buxVar.x(objG2);
        }
        bvq.g(aseVar, (afeg) objG2, buxVar);
        return bwqVar;
    }

    public static final float k(float f, float f2) {
        return f2 == BitmapDescriptorFactory.HUE_RED ? BitmapDescriptorFactory.HUE_RED : (f2 <= BitmapDescriptorFactory.HUE_RED ? f < f2 : f > f2) ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object l(defpackage.apr r16, float r17, float r18, defpackage.aed r19, defpackage.aec r20, defpackage.afec r21, defpackage.afck r22) throws java.lang.Throwable {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.arq
            if (r2 == 0) goto L17
            r2 = r1
            arq r2 = (defpackage.arq) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            arq r2 = new arq
            r2.<init>(r1)
        L1c:
            r8 = r2
            java.lang.Object r1 = r8.c
            afcr r2 = defpackage.afcr.a
            int r3 = r8.d
            r9 = 0
            r4 = 1
            if (r3 == 0) goto L3f
            if (r3 != r4) goto L37
            float r0 = r8.b
            float r2 = r8.a
            affs r3 = r8.f
            aed r4 = r8.e
            defpackage.woy.dF(r1)
            r1 = r0
            r0 = r2
            goto L8e
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3f:
            defpackage.woy.dF(r1)
            affs r12 = new affs
            r12.<init>()
            java.lang.Object r1 = r19.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            java.lang.Object r5 = r19.b()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L67
            r5 = 0
            r6 = r5
            goto L68
        L67:
            r6 = r4
        L68:
            aro r10 = new aro
            r15 = 0
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r5 = r3
            r3 = r19
            r8.e = r3
            r8.f = r12
            r8.a = r0
            r8.b = r1
            r8.d = r4
            r4 = r5
            r7 = r10
            r5 = r20
            java.lang.Object r4 = defpackage.afp.f(r3, r4, r5, r6, r7, r8)
            if (r4 == r2) goto Laf
            r4 = r19
            r3 = r12
        L8e:
            java.lang.Object r2 = r4.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = k(r2, r1)
            bii r2 = new bii
            float r3 = r3.a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            aed r0 = defpackage.ca.C(r4, r9, r1, r0)
            r2.<init>(r3, r0)
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asl.l(apr, float, float, aed, aec, afec, afck):java.lang.Object");
    }

    public static final afak m(float f, affs affsVar, apr aprVar, afec afecVar, aeb aebVar) {
        float fA;
        float fK = k(((Number) aebVar.a()).floatValue(), f);
        float f2 = fK - affsVar.a;
        try {
            fA = aprVar.a(f2);
        } catch (CancellationException unused) {
            aebVar.b();
            fA = BitmapDescriptorFactory.HUE_RED;
        }
        afecVar.invoke(Float.valueOf(fA));
        if (Math.abs(f2 - fA) > 0.5f || fK != ((Number) aebVar.a()).floatValue()) {
            aebVar.b();
        }
        affsVar.a += fA;
        return afak.a;
    }

    public static final void n(aeb aebVar, apr aprVar, afec afecVar, float f) {
        float fA;
        try {
            fA = aprVar.a(f);
        } catch (CancellationException unused) {
            aebVar.b();
            fA = BitmapDescriptorFactory.HUE_RED;
        }
        afecVar.invoke(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            aebVar.b();
        }
    }

    public static final float o(bbt bbtVar) {
        return bbtVar.x().e == api.b ? Float.intBitsToFloat((int) (bbtVar.p() >> 32)) : Float.intBitsToFloat((int) (bbtVar.p() & 4294967295L));
    }

    public static final boolean p(bbt bbtVar, float f) {
        bbtVar.x();
        return (bbtVar.w() ? -f : o(bbtVar)) <= BitmapDescriptorFactory.HUE_RED;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.sm q(defpackage.deu r18) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asl.q(deu):sm");
    }

    public static final awu r(cfr cfrVar) {
        return new awu(1, false, new alx(cfrVar, 4), cfrVar);
    }

    public static final awu s(cfn cfnVar) {
        return new awu(3, false, new alx(cfnVar, 5), cfnVar);
    }

    public static final awu t(cfm cfmVar) {
        return new awu(2, false, new alx(cfmVar, 3), cfmVar);
    }

    public static final auy u(dve dveVar) {
        return new auy(dveVar.b, dveVar.c, dveVar.d, dveVar.e);
    }

    public static final awo v(bux buxVar) {
        WeakHashMap weakHashMap = awp.a;
        return z(buxVar).k;
    }

    public static final awo w(bux buxVar) {
        WeakHashMap weakHashMap = awp.a;
        return z(buxVar).h;
    }

    public static final cfy x(cfy cfyVar, awo awoVar) {
        return cfyVar.a(new auu(awoVar));
    }

    public static final awp y(View view) {
        awp awpVar;
        WeakHashMap weakHashMap = awp.a;
        synchronized (weakHashMap) {
            Object awpVar2 = weakHashMap.get(view);
            if (awpVar2 == null) {
                awpVar2 = new awp(view);
                weakHashMap.put(view, awpVar2);
            }
            awpVar = (awp) awpVar2;
        }
        return awpVar;
    }

    public static final awp z(bux buxVar) {
        View view = (View) buxVar.f(daa.f);
        awp awpVarY = y(view);
        boolean zE = buxVar.E(awpVarY) | buxVar.E(view);
        Object objG = buxVar.g();
        if (zE || objG == buw.a) {
            objG = new aju(awpVarY, view, 11);
            buxVar.x(objG);
        }
        bvq.c(awpVarY, (afec) objG, buxVar);
        return awpVarY;
    }
}
