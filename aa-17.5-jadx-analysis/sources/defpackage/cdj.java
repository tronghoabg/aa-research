package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.view.DragEvent;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class cdj {
    public cdj(dqn dqnVar) {
        new WeakReference(dqnVar);
        doy.o(dqnVar.T);
        doy.o(dqnVar.U);
        doy.o(dqnVar.V);
        doy.o(dqnVar.W);
        doy.o(dqnVar.X);
    }

    public static final void a(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ cfy b(cfy cfyVar, float f) {
        ckv ckvVar = new cgw(ckq.a).a;
        if (dlj.a(f, BitmapDescriptorFactory.HUE_RED) > 0) {
            dlj.a(f, BitmapDescriptorFactory.HUE_RED);
        }
        return cjn.f(cfyVar, new cgv(f, f, ckvVar, 0));
    }

    public static final void c(int i, Object obj, bzi bziVar, Object obj2, List list) {
        if (bziVar != null || affa.f(obj, buw.a)) {
            if ((obj2 != null && bziVar != null) || bziVar != null) {
                throw null;
            }
            list.add(new cfc(i));
        }
    }

    public static final void d(Context context, int i, SparseArray sparseArray, SparseArray sparseArray2) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            drp drpVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                break;
                            } else {
                                drx drxVar = new drx();
                                int attributeCount = xml.getAttributeCount();
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= attributeCount) {
                                        break;
                                    } else {
                                        String attributeName = xml.getAttributeName(i2);
                                        String attributeValue = xml.getAttributeValue(i2);
                                        if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                            int i3 = -1;
                                            int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                            if (identifier != -1) {
                                                i3 = identifier;
                                            } else if (attributeValue.length() > 1) {
                                                i3 = Integer.parseInt(attributeValue.substring(1));
                                            } else {
                                                Log.e("ConstraintLayoutStates", "error in parsing id");
                                            }
                                            drxVar.k(context, xml);
                                            sparseArray2.put(i3, drxVar);
                                            break;
                                        }
                                        i2++;
                                    }
                                }
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                drp drpVar2 = new drp(context, xml);
                                sparseArray.put(drpVar2.a, drpVar2);
                                drpVar = drpVar2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                drq drqVar = new drq(context, xml);
                                if (drpVar != null) {
                                    drpVar.b.add(drqVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", a.bp(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", a.bp(i, "Error parsing resource: "), e2);
        }
    }

    public static dri e(dqn dqnVar, int i, ArrayList arrayList, dri driVar) {
        int i2;
        int i3 = i == 0 ? dqnVar.ay : dqnVar.az;
        if (i3 != -1 && (driVar == null || i3 != driVar.c)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                dri driVar2 = (dri) arrayList.get(i4);
                if (driVar2.c == i3) {
                    if (driVar != null) {
                        driVar.c(i, driVar2);
                        arrayList.remove(driVar);
                    }
                    driVar = driVar2;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return driVar;
        }
        if (driVar == null) {
            if (dqnVar instanceof dqs) {
                dqs dqsVar = (dqs) dqnVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= dqsVar.aM) {
                        i2 = -1;
                        break;
                    }
                    dqn dqnVar2 = dqsVar.aL[i5];
                    if (i == 0) {
                        i2 = dqnVar2.ay;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    } else {
                        i2 = dqnVar2.az;
                        if (i2 != -1) {
                            break;
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        dri driVar3 = (dri) arrayList.get(i6);
                        if (driVar3.c == i2) {
                            driVar = driVar3;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (driVar == null) {
                driVar = new dri(i);
            }
            arrayList.add(driVar);
        }
        if (driVar.d(dqnVar)) {
            if (dqnVar instanceof dqr) {
                dqr dqrVar = (dqr) dqnVar;
                dqrVar.d.d(dqrVar.e == 0 ? 1 : 0, arrayList, driVar);
            }
            if (i == 0) {
                dqnVar.ay = driVar.c;
                dqnVar.T.d(0, arrayList, driVar);
                dqnVar.V.d(0, arrayList, driVar);
            } else {
                dqnVar.az = driVar.c;
                dqnVar.U.d(1, arrayList, driVar);
                dqnVar.X.d(1, arrayList, driVar);
                dqnVar.W.d(1, arrayList, driVar);
            }
            dqnVar.aa.d(i, arrayList, driVar);
        }
        return driVar;
    }

    public static dri f(ArrayList arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dri driVar = (dri) arrayList.get(i2);
            if (i == driVar.c) {
                return driVar;
            }
        }
        return null;
    }

    public static boolean g(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static float h(dpz dpzVar, float f) {
        return dpzVar.l.N(f);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    static dpu i(String str) {
        dpu dpuVarA = dpu.a(0);
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    return dpu.c(dpu.b);
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    return new dpu(dpu.d);
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    return dpu.c(dpu.c);
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    return new dpu(dpu.b);
                }
                break;
        }
        if (str.endsWith("%")) {
            float f = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
            dpu dpuVar = new dpu(dpu.e);
            dpuVar.i = f;
            dpuVar.m = true;
            dpuVar.h = 0;
            return dpuVar;
        }
        if (!str.contains(":")) {
            return dpuVarA;
        }
        dpu dpuVar2 = new dpu(dpu.f);
        dpuVar2.k = str;
        dpuVar2.f(dpu.c);
        return dpuVar2;
    }

    public static void j(int i, dpz dpzVar, dpf dpfVar) throws dpm {
        dpl dplVar;
        String strO;
        dph dphVarH = dpfVar.h(1);
        if ((dphVarH instanceof dpl) && (strO = (dplVar = (dpl) dphVarH).o("id")) != null) {
            k(i, dpzVar, strO, dplVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[PHI: r10 r11 r12
  0x0078: PHI (r10v2 boolean) = 
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v9 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
  (r10v1 boolean)
 binds: [B:15:0x0045, B:32:0x0093, B:29:0x0080, B:30:0x0082, B:26:0x0077, B:24:0x006d, B:21:0x005d, B:22:0x005f, B:18:0x004d, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r11v2 boolean) = 
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v10 boolean)
  (r11v11 boolean)
  (r11v1 boolean)
  (r11v1 boolean)
  (r11v12 boolean)
  (r11v1 boolean)
  (r11v13 boolean)
 binds: [B:15:0x0045, B:32:0x0093, B:29:0x0080, B:30:0x0082, B:26:0x0077, B:24:0x006d, B:21:0x005d, B:22:0x005f, B:18:0x004d, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]
  0x0078: PHI (r12v2 float) = 
  (r12v1 float)
  (r12v1 float)
  (r12v1 float)
  (r12v10 float)
  (r12v11 float)
  (r12v1 float)
  (r12v1 float)
  (r12v13 float)
  (r12v1 float)
  (r12v14 float)
 binds: [B:15:0x0045, B:32:0x0093, B:29:0x0080, B:30:0x0082, B:26:0x0077, B:24:0x006d, B:21:0x005d, B:22:0x005f, B:18:0x004d, B:19:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0 A[PHI: r11
  0x00c0: PHI (r11v5 boolean) = (r11v1 boolean), (r11v1 boolean), (r11v6 boolean), (r11v1 boolean), (r11v1 boolean), (r11v1 boolean), (r11v9 boolean) binds: [B:39:0x00b5, B:52:0x00d9, B:53:0x00db, B:49:0x00cf, B:46:0x00c6, B:42:0x00bd, B:43:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(int r17, defpackage.dpz r18, java.lang.String r19, defpackage.dpl r20) throws defpackage.dpm {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdj.k(int, dpz, java.lang.String, dpl):void");
    }

    public static final long l(sm smVar) {
        DragEvent dragEvent = (DragEvent) smVar.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    static void m(dpz dpzVar, ncp ncpVar, dpp dppVar, dpl dplVar, String str) throws dpm, NumberFormatException {
        long j;
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    String strN = dplVar.n(str);
                    boolean zEquals = strN.equals("parent");
                    Object obj = strN;
                    if (zEquals) {
                        obj = dpz.a;
                    }
                    dpp dppVarB = dpzVar.b(obj);
                    dppVar.v(dppVarB);
                    dppVar.i(dppVarB);
                    return;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    String strN2 = dplVar.n(str);
                    dpp dppVarB2 = strN2.equals("parent") ? dpzVar.b(dpz.a) : dpzVar.b(strN2);
                    dppVar.t(dppVarB2);
                    dppVar.l(dppVarB2);
                    dppVar.v(dppVarB2);
                    dppVar.i(dppVarB2);
                    return;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    dpl dplVarL = dplVar.l(str);
                    if (dplVarL == null) {
                        return;
                    }
                    ArrayList arrayListP = dplVarL.p();
                    int size = arrayListP.size();
                    for (int i = 0; i < size; i++) {
                        String str2 = (String) arrayListP.get(i);
                        dph dphVarI = dplVarL.i(str2);
                        if (dphVarI instanceof dpj) {
                            float fV = dphVarI.v();
                            if (dppVar.ai == null) {
                                dppVar.ai = new HashMap();
                            }
                            dppVar.ai.put(str2, Float.valueOf(fV));
                        } else if (dphVarI instanceof dpn) {
                            String strX = dphVarI.x();
                            if (strX.startsWith("#")) {
                                String strSubstring = strX.substring(1);
                                if (strSubstring.length() == 6) {
                                    strSubstring = "FF".concat(String.valueOf(strSubstring));
                                }
                                j = Long.parseLong(strSubstring, 16);
                            } else {
                                j = -1;
                            }
                            if (j != -1) {
                                dppVar.ah.put(str2, Integer.valueOf((int) j));
                            }
                        }
                    }
                    return;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    dppVar.z = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    dppVar.A = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    dppVar.B = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    dppVar.C = h(dpzVar, ncpVar.I(dplVar.i(str)));
                    return;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    dppVar.D = h(dpzVar, ncpVar.I(dplVar.i(str)));
                    return;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    dppVar.E = h(dpzVar, ncpVar.I(dplVar.i(str)));
                    return;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    dppVar.ae = s(dplVar, str, dpzVar, dpzVar.l);
                    return;
                }
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    dph dphVarI2 = dplVar.i(str);
                    if (dphVarI2 instanceof dpl) {
                        dpl dplVar2 = (dpl) dphVarI2;
                        dpe dpeVar = new dpe();
                        ArrayList arrayListP2 = dplVar2.p();
                        int size2 = arrayListP2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            String str3 = (String) arrayListP2.get(i2);
                            switch (str3.hashCode()) {
                                case -1897525331:
                                    if (str3.equals("stagger")) {
                                        dpeVar.a(600, dplVar2.b(str3));
                                        break;
                                    } else {
                                        break;
                                    }
                                case -1310311125:
                                    if (str3.equals("easing")) {
                                        dpeVar.c(603, dplVar2.n(str3));
                                        break;
                                    } else {
                                        break;
                                    }
                                case -1285003983:
                                    if (str3.equals("quantize")) {
                                        dph dphVarI3 = dplVar2.i(str3);
                                        if (dphVarI3 instanceof dpf) {
                                            dpf dpfVar = (dpf) dphVarI3;
                                            int iD = dpfVar.d();
                                            if (iD > 0) {
                                                dpeVar.b(610, dpfVar.c(0));
                                                if (iD > 1) {
                                                    dpeVar.c(611, dpfVar.m(1));
                                                    if (iD > 2) {
                                                        dpeVar.a(602, dpfVar.a(2));
                                                        break;
                                                    } else {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        } else {
                                            dph dphVarI4 = dplVar2.i(str3);
                                            dphVarI4.getClass();
                                            dpeVar.b(610, dphVarI4.w());
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                case -791482387:
                                    if (str3.equals("pathArc")) {
                                        String strN3 = dplVar2.n(str3);
                                        String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= 6) {
                                                i3 = -1;
                                            } else if (!strArr[i3].equals(strN3)) {
                                                i3++;
                                            }
                                        }
                                        if (i3 == -1) {
                                            System.err.println(a.bq(strN3, "0 pathArc = '", "'"));
                                            break;
                                        } else {
                                            dpeVar.b(607, i3);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                case -236944793:
                                    if (str3.equals("relativeTo")) {
                                        dpeVar.c(605, dplVar2.n(str3));
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                        dppVar.aj = dpeVar;
                        return;
                    }
                    return;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    dppVar.x = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    dppVar.y = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    dppVar.G = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    dppVar.H = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    float fI = ncpVar.I(dplVar.i(str));
                    if (dpzVar.f()) {
                        fI = 1.0f - fI;
                    }
                    dppVar.h = fI;
                    return;
                }
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    dppVar.g = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    dppVar.F = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    dppVar.h = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    dppVar.i = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    dppVar.ad = s(dplVar, str, dpzVar, dpzVar.l);
                    return;
                }
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    dppVar.f = ncpVar.I(dplVar.i(str));
                    return;
                }
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    String strN4 = dplVar.n(str);
                    boolean zEquals2 = strN4.equals("parent");
                    Object obj2 = strN4;
                    if (zEquals2) {
                        obj2 = dpz.a;
                    }
                    dpp dppVarB3 = dpzVar.b(obj2);
                    dppVar.t(dppVarB3);
                    dppVar.l(dppVarB3);
                    return;
                }
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    String strN5 = dplVar.n(str);
                    int iHashCode = strN5.hashCode();
                    if (iHashCode == -1901805651) {
                        if (strN5.equals("invisible")) {
                            dppVar.I = 4;
                            dppVar.F = BitmapDescriptorFactory.HUE_RED;
                            return;
                        }
                        return;
                    }
                    if (iHashCode == 3178655) {
                        if (strN5.equals("gone")) {
                            dppVar.I = 8;
                            return;
                        }
                        return;
                    } else {
                        if (iHashCode == 466743410 && strN5.equals("visible")) {
                            dppVar.I = 0;
                            return;
                        }
                        return;
                    }
                }
                break;
        }
        o(dpzVar, ncpVar, dplVar, dppVar, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void n(int r8, defpackage.dpz r9, defpackage.ncp r10, defpackage.dpf r11) throws defpackage.dpm {
        /*
            if (r8 != 0) goto L7
            dqh r8 = r9.c()
            goto Lb
        L7:
            dqi r8 = r9.d()
        Lb:
            r0 = 1
            dph r1 = r11.h(r0)
            boolean r2 = r1 instanceof defpackage.dpf
            if (r2 == 0) goto Lbc
            dpf r1 = (defpackage.dpf) r1
            int r2 = r1.d()
            if (r2 <= 0) goto Lbc
            r2 = 0
            r3 = r2
        L1e:
            int r4 = r1.d()
            if (r3 >= r4) goto L32
            java.lang.String r4 = r1.m(r3)
            java.lang.Object[] r5 = new java.lang.Object[r0]
            r5[r2] = r4
            r8.z(r5)
            int r3 = r3 + 1
            goto L1e
        L32:
            int r1 = r11.d()
            r3 = 2
            if (r1 <= r3) goto Lbc
            dph r11 = r11.h(r3)
            boolean r1 = r11 instanceof defpackage.dpl
            if (r1 != 0) goto L43
            goto Lbc
        L43:
            dpl r11 = (defpackage.dpl) r11
            java.util.ArrayList r1 = r11.p()
            int r3 = r1.size()
            r4 = r2
        L4e:
            if (r4 >= r3) goto Lbc
            java.lang.Object r5 = r1.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            int r6 = r5.hashCode()
            r7 = 109780401(0x68b1db1, float:5.2329616E-35)
            if (r6 == r7) goto L60
            goto Lb6
        L60:
            java.lang.String r6 = "style"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto Lb6
            dph r5 = r11.i(r5)
            boolean r6 = r5 instanceof defpackage.dpf
            if (r6 == 0) goto L84
            r6 = r5
            dpf r6 = (defpackage.dpf) r6
            int r7 = r6.d()
            if (r7 <= r0) goto L84
            java.lang.String r5 = r6.m(r2)
            float r6 = r6.a(r0)
            r8.ao = r6
            goto L88
        L84:
            java.lang.String r5 = r5.x()
        L88:
            int r6 = r5.hashCode()
            r7 = -995865480(0xffffffffc4a44c78, float:-1314.3896)
            if (r6 == r7) goto La4
            r7 = 1311368264(0x4e29e448, float:7.1257754E8)
            if (r6 == r7) goto L97
            goto Lb1
        L97:
            java.lang.String r6 = "spread_inside"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lb1
            dpx r5 = defpackage.dpx.b
            r8.as = r5
            goto Lb9
        La4:
            java.lang.String r6 = "packed"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lb1
            dpx r5 = defpackage.dpx.c
            r8.as = r5
            goto Lb9
        Lb1:
            dpx r5 = defpackage.dpx.a
            r8.as = r5
            goto Lb9
        Lb6:
            o(r9, r10, r11, r8, r5)
        Lb9:
            int r4 = r4 + 1
            goto L4e
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdj.n(int, dpz, ncp, dpf):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x008e. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o(defpackage.dpz r22, defpackage.ncp r23, defpackage.dpl r24, defpackage.dpp r25, java.lang.String r26) throws defpackage.dpm {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdj.o(dpz, ncp, dpl, dpp, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(java.lang.String r17, defpackage.dpz r18, java.lang.String r19, defpackage.ncp r20, defpackage.dpl r21) throws defpackage.dpm, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdj.p(java.lang.String, dpz, java.lang.String, ncp, dpl):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void q(java.lang.String r16, defpackage.dpz r17, java.lang.String r18, defpackage.ncp r19, defpackage.dpl r20) throws defpackage.dpm, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdj.q(java.lang.String, dpz, java.lang.String, ncp, dpl):void");
    }

    public static void r(dpz dpzVar, ncp ncpVar, String str, dpl dplVar) throws dpm, NumberFormatException {
        dpp dppVarB = dpzVar.b(str);
        if (dppVarB.ad == null) {
            dppVarB.ad = new dpu(dpu.b);
        }
        if (dppVarB.ae == null) {
            dppVarB.ae = new dpu(dpu.b);
        }
        ArrayList arrayListP = dplVar.p();
        int size = arrayListP.size();
        for (int i = 0; i < size; i++) {
            m(dpzVar, ncpVar, dppVarB, dplVar, (String) arrayListP.get(i));
        }
    }

    static dpu s(dpl dplVar, String str, dpz dpzVar, ajmd ajmdVar) throws dpm {
        dph dphVarI = dplVar.i(str);
        boolean z = dphVarI instanceof dpn;
        dpu dpuVarA = dpu.a(0);
        if (z) {
            return i(dphVarI.x());
        }
        if (dphVarI instanceof dpj) {
            return dpu.a(dpzVar.a(Float.valueOf(ajmdVar.N(dplVar.b(str)))));
        }
        if (dphVarI instanceof dpl) {
            dpl dplVar2 = (dpl) dphVarI;
            String strO = dplVar2.o("value");
            if (strO != null) {
                dpuVarA = i(strO);
            }
            dph dphVarK = dplVar2.k("min");
            if (dphVarK != null) {
                if (dphVarK instanceof dpj) {
                    dpuVarA.e(dpzVar.a(Float.valueOf(ajmdVar.N(((dpj) dphVarK).v()))));
                } else if (dphVarK instanceof dpn) {
                    dpuVarA.g = -2;
                }
            }
            dph dphVarK2 = dplVar2.k("max");
            if (dphVarK2 != null) {
                if (dphVarK2 instanceof dpj) {
                    int iA = dpzVar.a(Float.valueOf(ajmdVar.N(((dpj) dphVarK2).v())));
                    if (dpuVarA.h >= 0) {
                        dpuVarA.h = iA;
                        return dpuVarA;
                    }
                } else if (dphVarK2 instanceof dpn) {
                    Object obj = dpu.b;
                    if (dpuVarA.m) {
                        dpuVarA.l = obj;
                        dpuVarA.h = Alert.DURATION_SHOW_INDEFINITELY;
                    }
                }
            }
        }
        return dpuVarA;
    }
}
