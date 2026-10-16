package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final /* synthetic */ class gps implements afeg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ gps(gqc gqcVar, ncp ncpVar, gpn gpnVar, bym bymVar, bym bymVar2, int i) {
        this.f = i;
        this.a = gqcVar;
        this.b = ncpVar;
        this.c = gpnVar;
        this.d = bymVar;
        this.e = bymVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [aes, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v7, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.util.AttributeSet, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, org.xmlpull.v1.XmlPullParser] */
    /* JADX WARN: Type inference failed for: r9v7, types: [aitx, java.lang.Object] */
    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes;
        aik aikVarE;
        int i = this.f;
        if (i != 0) {
            int i2 = 4;
            if (i != 1) {
                bux buxVar = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                    Object obj3 = this.c;
                    ?? r9 = this.a;
                    Object obj4 = this.b;
                    ?? r11 = this.e;
                    Object obj5 = this.d;
                    bvf bvfVar = tii.b;
                    qn qnVar = (qn) obj5;
                    Context baseContext = qnVar.getBaseContext();
                    baseContext.getClass();
                    czz.an(new bxe[]{bvfVar.b(baseContext), tii.a.b(r11.a()), tii.c.b(obj5), ou.a.b(new tie(qnVar, (tif) obj4)), erz.a.b(obj4), tii.d.b(obj4), tjh.a.b(new whk(qnVar, (aitx) r9, (bym) r11))}, bxc.i(516702745, true, new tbk(obj3, 5), buxVar), buxVar, 48);
                } else {
                    buxVar.s();
                }
                return afak.a;
            }
            aik aikVar = (aik) obj;
            List list = (List) obj2;
            ?? r92 = this.a;
            r92.next();
            ?? r10 = this.c;
            aik aikVar2 = null;
            while (!a.b(r92) && (r92.getEventType() != 3 || !affa.f(r92.getName(), "propertyValuesHolder"))) {
                if (r92.getEventType() == 2 && affa.f(r92.getName(), "keyframe")) {
                    ?? r12 = this.b;
                    Object obj6 = this.d;
                    Object obj7 = this.e;
                    int[] iArr = aij.a;
                    int[] iArr2 = aij.f;
                    if (obj6 == null || (typedArrayObtainAttributes = ((Resources.Theme) obj6).obtainStyledAttributes(r12, iArr2, 0, 0)) == null) {
                        typedArrayObtainAttributes = ((Resources) obj7).obtainAttributes(r12, iArr2);
                    }
                    if (aikVar == null) {
                        try {
                            aikVarE = aim.e(typedArrayObtainAttributes.getInt(2, i2), typedArrayObtainAttributes.peekValue(0).type);
                            if (aikVarE == null) {
                                aikVarE = aim.a;
                            }
                        } catch (Throwable th) {
                            typedArrayObtainAttributes.recycle();
                            throw th;
                        }
                    } else {
                        aikVarE = aikVar;
                    }
                    aezu aezuVar = new aezu(aim.c(typedArrayObtainAttributes, typedArrayObtainAttributes.getFloat(3, BitmapDescriptorFactory.HUE_RED), aim.a(typedArrayObtainAttributes, (Resources) obj7, (Resources.Theme) obj6, 1, r10), aikVarE, 0), aikVarE);
                    typedArrayObtainAttributes.recycle();
                    ahs ahsVar = (ahs) aezuVar.a;
                    aik aikVar3 = (aik) aezuVar.b;
                    if (aikVar2 == null) {
                        aikVar2 = aikVar3;
                    }
                    list.add(ahsVar);
                }
                r92.next();
                i2 = 4;
            }
            return aikVar2 == null ? aikVar == null ? aim.a : aikVar : aikVar2;
        }
        bux buxVar2 = (bux) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        if (buxVar2.I((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            cfv cfvVar = cfy.e;
            atc atcVar = atd.c;
            cfm cfmVar = cfl.j;
            ctp ctpVarA = atp.a(atcVar, cfmVar, buxVar2, 0);
            int iG = a.g(buxVar2.b());
            ccx ccxVarN = buxVar2.N();
            cfy cfyVarJ = bzi.j(buxVar2, cfvVar);
            afdr afdrVar = cwb.a;
            buxVar2.M();
            buxVar2.w();
            if (buxVar2.G()) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            Object obj8 = this.b;
            Object obj9 = this.a;
            afeg afegVar = cwb.e;
            byq.c(buxVar2, ctpVarA, afegVar);
            afeg afegVar2 = cwb.d;
            byq.c(buxVar2, ccxVarN, afegVar2);
            Integer numValueOf = Integer.valueOf(iG);
            afeg afegVar3 = cwb.f;
            byq.c(buxVar2, numValueOf, afegVar3);
            afec afecVar = cwb.g;
            byq.b(buxVar2, afecVar);
            afeg afegVar4 = cwb.c;
            byq.c(buxVar2, cfyVarJ, afegVar4);
            ncp ncpVar = (ncp) obj8;
            gqc gqcVar = (gqc) obj9;
            gvq.g(gqcVar.a, gka.e(cfvVar, ncpVar), buxVar2, 0, 0);
            float f = gjk.f.k;
            float f2 = gjk.e.k;
            cfy cfyVarD = gka.d(ats.b(asl.I(cfvVar, f, f2), 1.0f, true), ncpVar);
            ctp ctpVarA2 = atp.a(atd.d, cfmVar, buxVar2, 6);
            int iG2 = a.g(buxVar2.b());
            ccx ccxVarN2 = buxVar2.N();
            cfy cfyVarJ2 = bzi.j(buxVar2, cfyVarD);
            buxVar2.M();
            buxVar2.w();
            if (buxVar2.G()) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            byq.c(buxVar2, ctpVarA2, afegVar);
            byq.c(buxVar2, ccxVarN2, afegVar2);
            byq.c(buxVar2, Integer.valueOf(iG2), afegVar3);
            byq.b(buxVar2, afecVar);
            byq.c(buxVar2, cfyVarJ2, afegVar4);
            cfy cfyVarR = awd.r(asl.J(ats.b(cfvVar, 1.0f, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gjk.d.k));
            ctp ctpVarA3 = avv.a(atd.g, cfl.o, buxVar2, 54);
            int iG3 = a.g(buxVar2.b());
            ccx ccxVarN3 = buxVar2.N();
            cfy cfyVarJ3 = bzi.j(buxVar2, cfyVarR);
            buxVar2.M();
            buxVar2.w();
            if (buxVar2.G()) {
                buxVar2.j(afdrVar);
            } else {
                buxVar2.y();
            }
            ?? r112 = this.e;
            ?? r5 = this.d;
            Object obj10 = this.c;
            byq.c(buxVar2, ctpVarA3, afegVar);
            byq.c(buxVar2, ccxVarN3, afegVar2);
            byq.c(buxVar2, Integer.valueOf(iG3), afegVar3);
            byq.b(buxVar2, afecVar);
            byq.c(buxVar2, cfyVarJ3, afegVar4);
            gkd.d(gqcVar, avy.a.b(cfvVar, 1.0f, true), obj10 == gpn.a, buxVar2, 0);
            asl.A(awd.m(cfvVar, f2), buxVar2);
            gkd.c(a.ae(r5), buxVar2, 8);
            buxVar2.n();
            gqk.k(gqcVar.c, ncpVar, null, false, !((Boolean) r112.a()).booleanValue(), 4, buxVar2, 196608, 12);
            buxVar2.n();
            buxVar2.n();
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public /* synthetic */ gps(XmlPullParser xmlPullParser, Resources resources, Resources.Theme theme, AttributeSet attributeSet, aes aesVar, int i) {
        this.f = i;
        this.a = xmlPullParser;
        this.e = resources;
        this.d = theme;
        this.b = attributeSet;
        this.c = aesVar;
    }

    public /* synthetic */ gps(qn qnVar, bym bymVar, tif tifVar, aitx aitxVar, afeh afehVar, int i) {
        this.f = i;
        this.d = qnVar;
        this.e = bymVar;
        this.b = tifVar;
        this.a = aitxVar;
        this.c = afehVar;
    }
}
