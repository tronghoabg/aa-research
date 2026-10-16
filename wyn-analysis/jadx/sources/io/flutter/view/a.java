package io.flutter.view;

import android.app.Activity;
import android.opengl.Matrix;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.UnityAdsConstants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import ka.AbstractC3256n;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes5.dex */
public final class a implements lc.h, lc.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f37189a;

    public /* synthetic */ a(Object obj) {
        this.f37189a = obj;
    }

    public void a(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        int i5;
        io.flutter.plugin.platform.j jVar;
        ArrayList arrayList;
        int i10;
        int i11;
        h hVar;
        int i12;
        int i13;
        h hVar2;
        String str;
        String str2;
        float f10;
        float f11;
        View viewB;
        Integer num;
        WindowInsets rootWindowInsets;
        boolean z2;
        Activity activityT;
        int i14;
        l lVar;
        View viewB2;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        for (ByteBuffer byteBuffer2 : byteBufferArr) {
            byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
        }
        l lVar2 = (l) this.f37189a;
        lVar2.getClass();
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            boolean zHasRemaining = byteBuffer.hasRemaining();
            i5 = 1;
            jVar = lVar2.f37283e;
            if (!zHasRemaining) {
                break;
            }
            h hVarC = lVar2.c(byteBuffer.getInt());
            hVarC.f37226C = true;
            hVarC.f37232I = hVarC.f37265r;
            hVarC.f37233J = hVarC.f37263p;
            hVarC.f37227D = hVarC.f37251c;
            hVarC.f37228E = hVarC.f37252d;
            hVarC.f37229F = hVarC.f37255g;
            hVarC.f37230G = hVarC.f37256h;
            hVarC.f37231H = hVarC.f37259l;
            hVarC.f37251c = byteBuffer.getInt();
            hVarC.f37252d = byteBuffer.getInt();
            hVarC.f37253e = byteBuffer.getInt();
            hVarC.f37254f = byteBuffer.getInt();
            hVarC.f37255g = byteBuffer.getInt();
            hVarC.f37256h = byteBuffer.getInt();
            hVarC.f37257i = byteBuffer.getInt();
            hVarC.f37258j = byteBuffer.getInt();
            hVarC.k = byteBuffer.getInt();
            hVarC.f37259l = byteBuffer.getFloat();
            hVarC.f37260m = byteBuffer.getFloat();
            hVarC.f37261n = byteBuffer.getFloat();
            int i15 = byteBuffer.getInt();
            hVarC.f37262o = i15 == -1 ? null : strArr[i15];
            int i16 = byteBuffer.getInt();
            hVarC.f37263p = i16 == -1 ? null : strArr[i16];
            hVarC.f37264q = h.g(byteBuffer, byteBufferArr);
            int i17 = byteBuffer.getInt();
            hVarC.f37265r = i17 == -1 ? null : strArr[i17];
            hVarC.f37266s = h.g(byteBuffer, byteBufferArr);
            int i18 = byteBuffer.getInt();
            hVarC.f37267t = i18 == -1 ? null : strArr[i18];
            hVarC.f37268u = h.g(byteBuffer, byteBufferArr);
            int i19 = byteBuffer.getInt();
            hVarC.f37269v = i19 == -1 ? null : strArr[i19];
            hVarC.f37270w = h.g(byteBuffer, byteBufferArr);
            int i20 = byteBuffer.getInt();
            hVarC.f37271x = i20 == -1 ? null : strArr[i20];
            hVarC.f37272y = h.g(byteBuffer, byteBufferArr);
            int i21 = byteBuffer.getInt();
            hVarC.f37273z = i21 == -1 ? null : strArr[i21];
            int i22 = byteBuffer.getInt();
            hVarC.f37224A = i22 == -1 ? null : strArr[i22];
            byteBuffer.getInt();
            hVarC.f37234K = byteBuffer.getFloat();
            hVarC.L = byteBuffer.getFloat();
            hVarC.f37235M = byteBuffer.getFloat();
            hVarC.f37236N = byteBuffer.getFloat();
            if (hVarC.f37237O == null) {
                hVarC.f37237O = new float[16];
            }
            for (int i23 = 0; i23 < 16; i23++) {
                hVarC.f37237O[i23] = byteBuffer.getFloat();
            }
            hVarC.f37244V = true;
            hVarC.f37246X = true;
            int i24 = byteBuffer.getInt();
            ArrayList arrayList3 = hVarC.f37239Q;
            arrayList3.clear();
            ArrayList arrayList4 = hVarC.f37240R;
            arrayList4.clear();
            int i25 = 0;
            while (true) {
                lVar = hVarC.f37249a;
                if (i25 >= i24) {
                    break;
                }
                h hVarC2 = lVar.c(byteBuffer.getInt());
                hVarC2.f37238P = hVarC;
                arrayList3.add(hVarC2);
                i25++;
            }
            for (int i26 = 0; i26 < i24; i26++) {
                h hVarC3 = lVar.c(byteBuffer.getInt());
                hVarC3.f37238P = hVarC;
                arrayList4.add(hVarC3);
            }
            int i27 = byteBuffer.getInt();
            if (i27 == 0) {
                hVarC.f37241S = null;
            } else {
                ArrayList arrayList5 = hVarC.f37241S;
                if (arrayList5 == null) {
                    hVarC.f37241S = new ArrayList(i27);
                } else {
                    arrayList5.clear();
                }
                for (int i28 = 0; i28 < i27; i28++) {
                    f fVarB = lVar.b(byteBuffer.getInt());
                    int i29 = fVarB.f37220c;
                    if (i29 == 1) {
                        hVarC.f37242T = fVarB;
                    } else if (i29 == 2) {
                        hVarC.f37243U = fVarB;
                    } else {
                        hVarC.f37241S.add(fVarB);
                    }
                    hVarC.f37241S.add(fVarB);
                }
            }
            if (!hVarC.h(14)) {
                if (hVarC.h(6)) {
                    lVar2.f37290m = hVarC;
                }
                if (hVarC.f37226C) {
                    arrayList2.add(hVarC);
                }
                int i30 = hVarC.f37257i;
                if (i30 != -1 && !jVar.c(i30) && (viewB2 = jVar.b(hVarC.f37257i)) != null) {
                    viewB2.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        HashMap map = lVar2.f37285g;
        h hVar3 = (h) map.get(0);
        ArrayList arrayList6 = new ArrayList();
        kc.r rVar = lVar2.f37279a;
        if (hVar3 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            if ((Build.VERSION.SDK_INT < 28 || !((activityT = S3.f.t(rVar.getContext())) == null || activityT.getWindow() == null || !((i14 = activityT.getWindow().getAttributes().layoutInDisplayCutoutMode) == 2 || i14 == 0))) && (rootWindowInsets = rVar.getRootWindowInsets()) != null) {
                if (!lVar2.f37295r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                    hVar3.f37246X = true;
                    hVar3.f37244V = true;
                }
                int systemWindowInsetLeft = rootWindowInsets.getSystemWindowInsetLeft();
                lVar2.f37295r = Integer.valueOf(systemWindowInsetLeft);
                z2 = false;
                Matrix.translateM(fArr, 0, systemWindowInsetLeft, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                z2 = false;
            }
            hVar3.l(fArr, hashSet, z2);
            hVar3.c(arrayList6);
        }
        Iterator it = arrayList6.iterator();
        h hVar4 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = lVar2.f37293p;
            if (!zHasNext) {
                break;
            }
            h hVar5 = (h) it.next();
            if (!arrayList.contains(Integer.valueOf(hVar5.f37250b))) {
                hVar4 = hVar5;
            }
        }
        if (hVar4 == null && arrayList6.size() > 0) {
            hVar4 = (h) AbstractC3256n.e(arrayList6, 1);
        }
        if (hVar4 != null && (hVar4.f37250b != lVar2.f37294q || arrayList6.size() != arrayList.size())) {
            lVar2.f37294q = hVar4.f37250b;
            String strF = hVar4.f();
            if (strF == null) {
                strF = StringUtils.SPACE;
            }
            if (Build.VERSION.SDK_INT >= 28) {
                rVar.setAccessibilityPaneTitle(strF);
            } else {
                AccessibilityEvent accessibilityEventD = lVar2.d(hVar4.f37250b, 32);
                accessibilityEventD.getText().add(strF);
                lVar2.h(accessibilityEventD);
            }
        }
        arrayList.clear();
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((h) it2.next()).f37250b));
        }
        Iterator it3 = map.entrySet().iterator();
        while (true) {
            i10 = 4;
            if (!it3.hasNext()) {
                break;
            }
            h hVar6 = (h) ((Map.Entry) it3.next()).getValue();
            if (!hashSet.contains(hVar6)) {
                hVar6.f37238P = null;
                if (hVar6.f37257i != -1 && (num = lVar2.f37288j) != null && lVar2.f37282d.platformViewOfNode(num.intValue()) == jVar.b(hVar6.f37257i)) {
                    lVar2.g(lVar2.f37288j.intValue(), 65536);
                    lVar2.f37288j = null;
                }
                int i31 = hVar6.f37257i;
                if (i31 != -1 && (viewB = jVar.b(i31)) != null) {
                    viewB.setImportantForAccessibility(4);
                }
                h hVar7 = lVar2.f37287i;
                if (hVar7 == hVar6) {
                    lVar2.g(hVar7.f37250b, 65536);
                    lVar2.f37287i = null;
                }
                if (lVar2.f37290m == hVar6) {
                    lVar2.f37290m = null;
                }
                if (lVar2.f37292o == hVar6) {
                    lVar2.f37292o = null;
                }
                it3.remove();
            }
        }
        int i32 = 2048;
        AccessibilityEvent accessibilityEventD2 = lVar2.d(0, 2048);
        accessibilityEventD2.setContentChangeTypes(1);
        lVar2.h(accessibilityEventD2);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            h hVar8 = (h) it4.next();
            if (!Float.isNaN(hVar8.f37259l) && !Float.isNaN(hVar8.f37231H) && hVar8.f37231H != hVar8.f37259l) {
                AccessibilityEvent accessibilityEventD3 = lVar2.d(hVar8.f37250b, 4096);
                float f12 = hVar8.f37259l;
                float f13 = hVar8.f37260m;
                if (Float.isInfinite(f13)) {
                    if (f12 > 70000.0f) {
                        f12 = 70000.0f;
                    }
                    f13 = 100000.0f;
                }
                if (Float.isInfinite(hVar8.f37261n)) {
                    f10 = f13 + 100000.0f;
                    if (f12 < -70000.0f) {
                        f12 = -70000.0f;
                    }
                    f11 = f12 + 100000.0f;
                } else {
                    float f14 = hVar8.f37261n;
                    f10 = f13 - f14;
                    f11 = f12 - f14;
                }
                int i33 = hVar8.f37228E;
                if ((i33 & 16) != 0 || (i33 & 32) != 0) {
                    accessibilityEventD3.setScrollY((int) f11);
                    accessibilityEventD3.setMaxScrollY((int) f10);
                } else if ((i33 & 4) != 0 || (i33 & 8) != 0) {
                    accessibilityEventD3.setScrollX((int) f11);
                    accessibilityEventD3.setMaxScrollX((int) f10);
                }
                int i34 = hVar8.f37258j;
                if (i34 > 0) {
                    accessibilityEventD3.setItemCount(i34);
                    accessibilityEventD3.setFromIndex(hVar8.k);
                    Iterator it5 = hVar8.f37240R.iterator();
                    int i35 = 0;
                    while (it5.hasNext()) {
                        if (!((h) it5.next()).h(14)) {
                            i35++;
                        }
                    }
                    accessibilityEventD3.setToIndex((hVar8.k + i35) - i5);
                }
                lVar2.h(accessibilityEventD3);
            }
            if (hVar8.h(16) && (((str = hVar8.f37263p) != null || hVar8.f37233J != null) && (str == null || (str2 = hVar8.f37233J) == null || !str.equals(str2)))) {
                AccessibilityEvent accessibilityEventD4 = lVar2.d(hVar8.f37250b, i32);
                accessibilityEventD4.setContentChangeTypes(i5);
                lVar2.h(accessibilityEventD4);
            }
            h hVar9 = lVar2.f37287i;
            if (hVar9 != null && hVar9.f37250b == hVar8.f37250b && (hVar8.f37227D & com.google.android.gms.internal.consent_sdk.a.l(3)) == 0 && hVar8.h(3)) {
                AccessibilityEvent accessibilityEventD5 = lVar2.d(hVar8.f37250b, i10);
                accessibilityEventD5.getText().add(hVar8.f37263p);
                lVar2.h(accessibilityEventD5);
            }
            h hVar10 = lVar2.f37290m;
            if (hVar10 != null && (i12 = hVar10.f37250b) == (i13 = hVar8.f37250b) && ((hVar2 = lVar2.f37291n) == null || hVar2.f37250b != i12)) {
                lVar2.f37291n = hVar10;
                lVar2.h(lVar2.d(i13, 8));
            } else if (hVar10 == null) {
                lVar2.f37291n = null;
            }
            h hVar11 = lVar2.f37290m;
            if (hVar11 != null && hVar11.f37250b == hVar8.f37250b && (hVar8.f37227D & com.google.android.gms.internal.consent_sdk.a.l(5)) != 0 && hVar8.h(5) && ((hVar = lVar2.f37287i) == null || hVar.f37250b == lVar2.f37290m.f37250b)) {
                String str3 = hVar8.f37232I;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = hVar8.f37265r;
                String str5 = str4 != null ? str4 : "";
                AccessibilityEvent accessibilityEventD6 = lVar2.d(hVar8.f37250b, 16);
                accessibilityEventD6.setBeforeText(str3);
                accessibilityEventD6.getText().add(str5);
                int i36 = 0;
                while (i36 < str3.length() && i36 < str5.length() && str3.charAt(i36) == str5.charAt(i36)) {
                    i36++;
                }
                if (i36 < str3.length() || i36 < str5.length()) {
                    accessibilityEventD6.setFromIndex(i36);
                    int length = str3.length() - i5;
                    int length2 = str5.length() - i5;
                    while (length >= i36 && length2 >= i36) {
                        i11 = i5;
                        if (str3.charAt(length) != str5.charAt(length2)) {
                            break;
                        }
                        length--;
                        length2--;
                        i5 = i11;
                    }
                    i11 = i5;
                    accessibilityEventD6.setRemovedCount((length - i36) + 1);
                    accessibilityEventD6.setAddedCount((length2 - i36) + 1);
                } else {
                    i11 = i5;
                    accessibilityEventD6 = null;
                }
                if (accessibilityEventD6 != null) {
                    lVar2.h(accessibilityEventD6);
                }
                if (hVar8.f37229F != hVar8.f37255g || hVar8.f37230G != hVar8.f37256h) {
                    AccessibilityEvent accessibilityEventD7 = lVar2.d(hVar8.f37250b, Segment.SIZE);
                    accessibilityEventD7.getText().add(str5);
                    accessibilityEventD7.setFromIndex(hVar8.f37255g);
                    accessibilityEventD7.setToIndex(hVar8.f37256h);
                    accessibilityEventD7.setItemCount(str5.length());
                    lVar2.h(accessibilityEventD7);
                }
            } else {
                i11 = i5;
            }
            i5 = i11;
            i32 = 2048;
            i10 = 4;
        }
    }
}
