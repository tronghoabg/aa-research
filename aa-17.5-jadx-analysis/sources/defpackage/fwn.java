package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class fwn {
    public static final void a(fwo fwoVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1967087798);
        if (i3 == 0) {
            i2 = i | (true != ((i & 8) == 0 ? buxVarC.C(fwoVar) : buxVarC.E(fwoVar)) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            int i4 = (i2 >> 3) & 14;
            if (((hjo) buxVarC.f(hjp.a)).b.compareTo(hjm.a) > 0) {
                buxVarC.v(-978593722);
                List list = fwoVar.a;
                int i5 = fwoVar.c;
                hir hirVar = gux.e(buxVarC).c;
                fxi.b(cfyVar, list, i5, 32.0f, buxVarC, i4, 0);
                ((bvv) buxVarC).Y(false);
            } else {
                buxVarC.v(-978376133);
                List list2 = fwoVar.a;
                boolean z = fwoVar.b;
                int i6 = fwoVar.c;
                cfm cfmVar = cfl.k;
                hir hirVar2 = gux.e(buxVarC).c;
                fxy.b(cfyVar, list2, cfmVar, z, i6, 24.0f, null, buxVarC, i4 | 384, 64);
                buxVarC = buxVarC;
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(fwoVar, cfyVar, i, 7, null);
        }
    }

    public static final void b(fwq fwqVar, cfy cfyVar, ckv ckvVar, bux buxVar, int i) {
        int i2;
        afdr afdrVar;
        cjv cjvVar;
        bux buxVarC = buxVar.c(95751096);
        if ((i & 6) == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fwqVar) : buxVarC.E(fwqVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.C(ckvVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            afdr afdrVar2 = fwqVar.e;
            boolean z = (afdrVar2 == null && fwqVar.f == null && fwqVar.g == null) ? false : true;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                afdr eupVar = fwqVar.g;
                if (eupVar == null) {
                    eupVar = new eup(16);
                }
                afdr eupVar2 = afdrVar2 == null ? new eup(17) : afdrVar2;
                afdr eupVar3 = fwqVar.f;
                afdr eupVar4 = eupVar3 == null ? new eup(18) : eupVar3;
                if (eupVar3 == null) {
                    eupVar3 = new eup(19);
                }
                git gitVar = new git(eupVar, eupVar2, eupVar4, eupVar3);
                bvvVar.ad(gitVar);
                objS = gitVar;
            }
            git gitVar2 = (git) objS;
            gitVar2.b(new Object[0], buxVarC);
            buxVarC.v(1822508795);
            afdr afdrVar3 = fwqVar.g;
            if (afdrVar3 == null) {
                buxVarC.v(-637538446);
                Object objS2 = bvvVar.S();
                if (objS2 == obj) {
                    objS2 = new eup(20);
                    bvvVar.ad(objS2);
                }
                afdrVar3 = (afdr) objS2;
            } else {
                buxVarC.v(395075496);
            }
            bvvVar.Y(false);
            gitVar2.a(afdrVar3);
            if (afdrVar2 == null) {
                buxVarC.v(-637502734);
                Object objS3 = bvvVar.S();
                if (objS3 == obj) {
                    objS3 = new fwp(1);
                    bvvVar.ad(objS3);
                }
                afdrVar2 = (afdr) objS3;
            } else {
                buxVarC.v(395076803);
            }
            bvvVar.Y(false);
            gitVar2.b = afdrVar2;
            afdr afdrVar4 = fwqVar.f;
            if (afdrVar4 == null) {
                buxVarC.v(-637467022);
                Object objS4 = bvvVar.S();
                if (objS4 == obj) {
                    objS4 = new fwp(0);
                    bvvVar.ad(objS4);
                }
                afdrVar = (afdr) objS4;
                bvvVar.Y(false);
            } else {
                buxVarC.v(395078017);
                bvvVar.Y(false);
                afdrVar = afdrVar4;
            }
            gitVar2.c = afdrVar;
            if (afdrVar4 == null) {
                buxVarC.v(-637432302);
                Object objS5 = bvvVar.S();
                if (objS5 == obj) {
                    objS5 = new fwp(2);
                    bvvVar.ad(objS5);
                }
                afdrVar4 = (afdr) objS5;
            } else {
                buxVarC.v(395079137);
            }
            bvvVar.Y(false);
            gitVar2.d = afdrVar4;
            bvvVar.Y(false);
            asf asfVar = gitVar2.e;
            hjw hjwVar = fwqVar.d;
            if (hjwVar == null) {
                buxVarC.v(663478069);
                bvvVar.Y(false);
                cjvVar = null;
            } else {
                buxVarC.v(1822517836);
                long jA = hjwVar.a(false, buxVarC, 1);
                bvvVar.Y(false);
                cjvVar = new cjv(jA);
            }
            long jI = cjvVar != null ? cjvVar.a : cjn.i(0);
            long jT = gux.c(buxVarC).T();
            buxVarC.v(663619368);
            Object objS6 = bvvVar.S();
            if (objS6 == obj) {
                objS6 = new eup(15);
                bvvVar.ad(objS6);
            }
            bvvVar.Y(false);
            avp avpVar = bmo.a;
            boolean z2 = z;
            czz.aw((afdr) objS6, cfyVar, z2, ckvVar, bmo.e(jI, jT, jI, cjv.h(jT, 0.38f), buxVarC, 0), null, null, new avr(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), asfVar, bxc.i(-382240312, true, new bol(fwqVar, 5), buxVarC), buxVarC, ((i2 << 3) & 7168) | (i2 & 112) | 817889280, 96);
            buxVarC = buxVarC;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new cuw((Object) fwqVar, cfyVar, (Object) ckvVar, i, 9);
        }
    }

    public static final fyy c(gzc gzcVar) {
        gzcVar.getClass();
        return gzcVar.a() ? fyy.b : fyy.a;
    }

    public static final void d(afeh afehVar, cfy cfyVar, List list, List list2, boolean z, fyy fyyVar, float f, bux buxVar, int i) {
        int i2;
        boolean z2;
        boolean z3;
        afehVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1856414824);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(afehVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(list) : buxVarC.E(list)) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != ((i & 4096) == 0 ? buxVarC.C(list2) : buxVarC.E(list2)) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != buxVarC.D(z) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != buxVarC.A(fyyVar.ordinal()) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != buxVarC.z(f) ? 524288 : 1048576;
        }
        if (buxVarC.I((599187 & i2) != 599186, i2 & 1)) {
            cfy cfyVarR = awd.r(asl.J(awd.d(cfyVar, f), !list.isEmpty() ? fyyVar.c.k : fyyVar.d.k, BitmapDescriptorFactory.HUE_RED, fyyVar.e.k, BitmapDescriptorFactory.HUE_RED));
            asz aszVar = new asz(fyyVar.f.k, false, null);
            cfr cfrVar = cfl.n;
            ctp ctpVarA = avv.a(aszVar, cfrVar, buxVarC, 48);
            bvv bvvVar = (bvv) buxVarC;
            int iG = a.g(bvvVar.u);
            ccx ccxVarAh = bvvVar.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfyVarR);
            int i4 = i2;
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            afeg afegVar = cwb.e;
            byq.c(buxVarC, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVarC, ccxVarAh, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVarC, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVarC, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVarC, cfyVarJ, afegVar4);
            avy avyVar = avy.a;
            if (list.isEmpty()) {
                z2 = true;
                buxVarC.v(-171564010);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-171878257);
                asz aszVar2 = new asz(fyyVar.c.k, false, null);
                cfv cfvVar = cfy.e;
                ctp ctpVarA2 = avv.a(aszVar2, cfrVar, buxVarC, 48);
                int iG2 = a.g(bvvVar.u);
                ccx ccxVarAh2 = bvvVar.ah();
                cfy cfyVarJ2 = bzi.j(buxVarC, cfvVar);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA2, afegVar);
                byq.c(buxVarC, ccxVarAh2, afegVar2);
                byq.c(buxVarC, Integer.valueOf(iG2), afegVar3);
                byq.b(buxVarC, afecVar);
                byq.c(buxVarC, cfyVarJ2, afegVar4);
                buxVarC.v(1787905358);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    gvq.g((hju) it.next(), das.d(cfvVar, "header-start-content"), buxVarC, 48, 0);
                    cfvVar = cfvVar;
                }
                bvvVar.Y(false);
                z2 = true;
                bvvVar.Y(true);
                bvvVar.Y(false);
            }
            cfv cfvVar2 = cfy.e;
            afehVar.invoke(awd.t(avyVar.b(cfvVar2, 1.0f, z2), cfrVar, 2), buxVarC, Integer.valueOf((i4 << 3) & 112));
            if (list2.isEmpty()) {
                z3 = true;
                buxVarC.v(-170851754);
                bvvVar.Y(false);
            } else {
                buxVarC.v(-171418744);
                cfy cfyVarN = (z && list2.size() == 3) ? awd.n(cfvVar2, Float.NaN, 128.0f) : cfvVar2;
                ctp ctpVarA3 = avv.a(new asz(fyyVar.g.k, false, null), cfl.m, buxVarC, 0);
                cfy cfyVar2 = cfyVarN;
                int iG3 = a.g(bvvVar.u);
                ccx ccxVarAh3 = bvvVar.ah();
                cfy cfyVarJ3 = bzi.j(buxVarC, cfvVar2);
                buxVarC.w();
                if (bvvVar.t) {
                    buxVarC.j(afdrVar);
                } else {
                    buxVarC.y();
                }
                byq.c(buxVarC, ctpVarA3, afegVar);
                byq.c(buxVarC, ccxVarAh3, afegVar2);
                byq.c(buxVarC, Integer.valueOf(iG3), afegVar3);
                byq.b(buxVarC, afecVar);
                byq.c(buxVarC, cfyVarJ3, afegVar4);
                buxVarC.v(-616516707);
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    gvq.g((hju) it2.next(), cfyVar2, buxVarC, 0, 0);
                }
                bvvVar.Y(false);
                z3 = true;
                bvvVar.Y(true);
                bvvVar.Y(false);
            }
            bvvVar.Y(z3);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new mtc(afehVar, cfyVar, list, list2, z, fyyVar, f, i, 1);
        }
    }

    public static final void e(afm afmVar, afeh afehVar, bux buxVar, int i) {
        int i2;
        afm afmVar2;
        afeh afehVar2;
        afmVar.getClass();
        afehVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1931653983);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(afmVar) : buxVarC.E(afmVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.A(300) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.A(300) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != buxVarC.E(afehVar) ? 1024 : 2048;
        }
        if (buxVarC.I((i2 & 1171) != 1170, i2 & 1)) {
            aes aesVar = aev.d;
            afehVar2 = afehVar;
            afmVar2 = afmVar;
            ca.L(afmVar2, null, acl.n(ca.F(300, 0, aesVar, 2), null, 14), acl.s(ca.F(300, 0, aesVar, 2), null, 14), null, afehVar2, buxVarC, (i2 & 14) | ((i2 << 6) & 458752), 18);
        } else {
            afmVar2 = afmVar;
            afehVar2 = afehVar;
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new bro(afmVar2, afehVar2, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final boolean r15, int r16, int r17, final defpackage.afeh r18, defpackage.bux r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwn.f(boolean, int, int, afeh, bux, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final cmw g(int i, bux buxVar) {
        TypedArray typedArrayObtainAttributes;
        boolean z;
        XmlResourceParser xmlResourceParser;
        int i2;
        TypedArray typedArrayObtainAttributes2;
        Object objD;
        Object objG = buxVar.g();
        Object obj = buw.a;
        int i3 = 0;
        if (objG == obj) {
            objG = new ParcelableSnapshotMutableIntState(0);
            buxVar.x(objG);
        }
        byd bydVar = (byd) objG;
        Context context = (Context) buxVar.f(daa.b);
        Resources resources = (Resources) buxVar.f(daa.c);
        Resources.Theme theme = context.getTheme();
        boolean zA = buxVar.A(i);
        Object objG2 = buxVar.g();
        int i4 = 2;
        int i5 = 1;
        if (zA || objG2 == obj) {
            XmlResourceParser xml = resources.getXml(i);
            a.an(xml);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            int[] iArr = aij.a;
            int[] iArr2 = aij.a;
            if (theme == null || (typedArrayObtainAttributes = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr2, 0, 0)) == null) {
                typedArrayObtainAttributes = resources.obtainAttributes(attributeSetAsAttributeSet, iArr2);
            }
            try {
                int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                ArrayList arrayList = new ArrayList();
                xml.next();
                while (!a.b(xml) && (xml.getEventType() != 3 || !affa.f(xml.getName(), "animated-vector"))) {
                    if (xml.getEventType() == i4 && affa.f(xml.getName(), "target")) {
                        int[] iArr3 = aij.b;
                        if (theme == null || (typedArrayObtainAttributes2 = theme.obtainStyledAttributes(attributeSetAsAttributeSet, iArr3, i3, i3)) == null) {
                            typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSetAsAttributeSet, iArr3);
                        }
                        try {
                            String string = typedArrayObtainAttributes2.getString(i3);
                            if (string == null) {
                                string = "";
                            }
                            int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, i3);
                            aes aesVar = ahj.a;
                            XmlResourceParser xml2 = resources.getXml(resourceId2);
                            i2 = i3;
                            AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml2);
                            a.an(xml2);
                            String name = xml2.getName();
                            xmlResourceParser = xml;
                            if (affa.f(name, "set")) {
                                objD = aim.b(xml2, resources, theme, attributeSetAsAttributeSet2);
                            } else {
                                if (!affa.f(name, "objectAnimator")) {
                                    throw new XmlPullParserException("Unknown tag: ".concat(String.valueOf(xml2.getName())));
                                }
                                objD = aim.d(xml2, resources, theme, attributeSetAsAttributeSet2);
                            }
                            sx sxVar = new sx(string, objD);
                            typedArrayObtainAttributes2.recycle();
                            arrayList.add(sxVar);
                        } finally {
                            typedArrayObtainAttributes2.recycle();
                        }
                    } else {
                        xmlResourceParser = xml;
                        i2 = i3;
                    }
                    xmlResourceParser.next();
                    xml = xmlResourceParser;
                    i3 = i2;
                    i4 = 2;
                    i5 = 1;
                }
                z = i3;
                Object aagdVar = new aagd(dap.g(theme, resources, resourceId), arrayList);
                typedArrayObtainAttributes.recycle();
                buxVar.x(aagdVar);
                objG2 = aagdVar;
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = 0;
        }
        final aagd aagdVar2 = (aagd) objG2;
        buxVar.t(-1151315899, Integer.valueOf(bydVar.e()));
        Object objG3 = buxVar.g();
        Object obj2 = buw.a;
        if (objG3 == obj2) {
            Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Boolean.valueOf(z), bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG3 = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG3;
        final boolean zBooleanValue = ((Boolean) bwqVar.a()).booleanValue();
        cng cngVar = (cng) aagdVar2.b;
        float f = cngVar.d;
        float f2 = cngVar.e;
        float f3 = cngVar.f;
        float f4 = cngVar.g;
        String str = cngVar.c;
        long j = cngVar.i;
        int i6 = cngVar.j;
        final afei afeiVar = ahk.a;
        cct cctVarI = bxc.i(-1895266590, true, new afei() { // from class: ahf
            /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object, java.util.Collection, java.util.List] */
            @Override // defpackage.afei
            public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                ((Float) obj3).floatValue();
                ((Float) obj4).floatValue();
                bux buxVar2 = (bux) obj5;
                int iIntValue = ((Integer) obj6).intValue();
                if (buxVar2.I((iIntValue & 129) != 128, iIntValue & 1)) {
                    aagd aagdVar3 = aagdVar2;
                    boolean z2 = zBooleanValue;
                    cng cngVar2 = (cng) aagdVar3.b;
                    agg aggVarP = afp.p(Boolean.valueOf(z2), cngVar2.c, buxVar2, 0, 0);
                    long[] jArr = aao.a;
                    aan aanVar = new aan(6);
                    buxVar2.v(-285052463);
                    ?? r14 = aagdVar3.c;
                    int size = r14.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        sx sxVar2 = (sx) r14.get(i7);
                        Object obj7 = sxVar2.a;
                        int i8 = aagdVar3.a;
                        buxVar2.v(-675540879);
                        Object objG4 = buxVar2.g();
                        if (objG4 == buw.a) {
                            objG4 = new aif();
                            buxVar2.x(objG4);
                        }
                        aif aifVar = (aif) objG4;
                        ((ahl) obj7).b(aggVarP, aifVar, i8, buxVar2, 0);
                        buxVar2.o();
                        Object obj8 = sxVar2.b;
                        aif aifVar2 = (aif) aanVar.a(obj8);
                        if (aifVar2 != null) {
                            bym bymVar = aifVar.a;
                            if (bymVar != null) {
                                aifVar2.a = bymVar;
                            }
                            bym bymVar2 = aifVar.b;
                            if (bymVar2 != null) {
                                aifVar2.b = bymVar2;
                            }
                            bym bymVar3 = aifVar.c;
                            if (bymVar3 != null) {
                                aifVar2.c = bymVar3;
                            }
                            bym bymVar4 = aifVar.d;
                            if (bymVar4 != null) {
                                aifVar2.d = bymVar4;
                            }
                            bym bymVar5 = aifVar.e;
                            if (bymVar5 != null) {
                                aifVar2.e = bymVar5;
                            }
                            bym bymVar6 = aifVar.f;
                            if (bymVar6 != null) {
                                aifVar2.f = bymVar6;
                            }
                            bym bymVar7 = aifVar.g;
                            if (bymVar7 != null) {
                                aifVar2.g = bymVar7;
                            }
                            bym bymVar8 = aifVar.h;
                            if (bymVar8 != null) {
                                aifVar2.h = bymVar8;
                            }
                            bym bymVar9 = aifVar.i;
                            if (bymVar9 != null) {
                                aifVar2.i = bymVar9;
                            }
                            bym bymVar10 = aifVar.j;
                            if (bymVar10 != null) {
                                aifVar2.j = bymVar10;
                            }
                            bym bymVar11 = aifVar.k;
                            if (bymVar11 != null) {
                                aifVar2.k = bymVar11;
                            }
                            bym bymVar12 = aifVar.l;
                            if (bymVar12 != null) {
                                aifVar2.l = bymVar12;
                            }
                            bym bymVar13 = aifVar.m;
                            if (bymVar13 != null) {
                                aifVar2.m = bymVar13;
                            }
                            bym bymVar14 = aifVar.n;
                            if (bymVar14 != null) {
                                aifVar2.n = bymVar14;
                            }
                            bym bymVar15 = aifVar.o;
                            if (bymVar15 != null) {
                                aifVar2.o = bymVar15;
                            }
                            bym bymVar16 = aifVar.p;
                            if (bymVar16 != null) {
                                aifVar2.p = bymVar16;
                            }
                        } else {
                            aanVar.m(obj8, aifVar);
                        }
                    }
                    afei afeiVar2 = afeiVar;
                    buxVar2.o();
                    afeiVar2.invoke(cngVar2.h, aanVar.b(), buxVar2, 0);
                } else {
                    buxVar2.s();
                }
                return afak.a;
            }
        }, buxVar);
        long jZ = czz.z((dlg) buxVar.f(dbc.d), f, f2);
        long jA = czz.A(jZ, f3, f4);
        boolean zB = buxVar.B(j) | buxVar.A(i6);
        Object objG4 = buxVar.g();
        byte[] bArr = null;
        if (zB || objG4 == obj2) {
            objG4 = j != 16 ? new cjp(j, i6) : null;
            buxVar.x(objG4);
        }
        cjw cjwVar = (cjw) objG4;
        buxVar.v(789579543);
        Object objG5 = buxVar.g();
        if (objG5 == obj2) {
            objG5 = new con(bArr);
            buxVar.x(objG5);
        }
        con conVar = (con) objG5;
        conVar.j(jZ);
        conVar.g(true);
        conVar.h(cjwVar);
        conVar.k(jA);
        conVar.i(str);
        bvb bvbVarD = buxVar.d();
        boolean z2 = buxVar.z(f3) | buxVar.z(f4);
        Object objG6 = buxVar.g();
        Object obj3 = objG6;
        if (z2 || objG6 == obj2) {
            bva bvdVar = conVar.b;
            if (bvdVar == null || bvdVar.f()) {
                bvdVar = new bvd(bvbVarD, new coe(conVar.a.a));
            }
            bva bvaVar = bvdVar;
            bvaVar.e(new cct(1749374910, true, new bnc(cctVarI, jA, 2)));
            buxVar.x(bvaVar);
            obj3 = bvaVar;
        }
        bva bvaVar2 = (bva) obj3;
        conVar.b = bvaVar2;
        boolean zE = buxVar.E(bvaVar2);
        Object objG7 = buxVar.g();
        if (zE || objG7 == obj2) {
            objG7 = new chk(bvaVar2, 4);
            buxVar.x(objG7);
        }
        bvq.c(conVar, (afec) objG7, buxVar);
        buxVar.o();
        bwqVar.b(true);
        buxVar.m();
        afak afakVar = afak.a;
        boolean zC = buxVar.C(aagdVar2);
        Object objG8 = buxVar.g();
        if (zC || objG8 == obj2) {
            objG8 = new gfz(aagdVar2, bydVar, null);
            buxVar.x(objG8);
        }
        bvq.g(afakVar, (afeg) objG8, buxVar);
        return conVar;
    }

    public static final boolean h(long j) {
        return j == 16 || a.j(j, cjn.i(0));
    }

    public static final void i(final long j, final long j2, final afeg afegVar, bux buxVar, final int i) {
        int i2;
        long j3;
        afegVar.getClass();
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1502846141);
        if (i3 == 0) {
            i2 = (true != buxVarC.B(j) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.B(j2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != buxVarC.E(afegVar) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            bvvVar.ab(-127, null, 0, null);
            if ((i & 1) != 0 && !buxVarC.F()) {
                buxVarC.s();
            }
            buxVarC.l();
            cjv cjvVar = new cjv(j);
            cjv cjvVar2 = true != h(cjvVar.a) ? cjvVar : null;
            if (cjvVar2 == null) {
                buxVarC.v(-1126116758);
                j3 = ((cjv) buxVarC.f(ggb.a)).a;
                bvvVar.Y(false);
            } else {
                buxVarC.v(-1126118959);
                bvvVar.Y(false);
                j3 = cjvVar2.a;
            }
            czz.an(new bxe[]{ggb.a.b(new cjv(j3)), bnm.a.b(new cjv(j2)), ggf.a.b(new cjv(j3))}, afegVar, buxVarC, (i2 >> 3) & 112);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new afeg() { // from class: gfr
                @Override // defpackage.afeg
                public final Object invoke(Object obj, Object obj2) {
                    bux buxVar2 = (bux) obj;
                    ((Integer) obj2).intValue();
                    int i4 = i | 1;
                    int i5 = 306783378 & i4;
                    int i6 = 613566756 & i4;
                    fwn.i(j, j2, afegVar, buxVar2, (i4 & (-920350135)) | i5 | (i6 >> 1) | ((i5 + i5) & i6));
                    return afak.a;
                }
            };
        }
    }
}
