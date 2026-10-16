package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.SessionInfo;

/* loaded from: classes.dex */
public final class mt {
    private static final boolean A(ciu ciuVar, afec afecVar) {
        byw bywVar = new byw(new ciu[16]);
        if (!ciuVar.q.A) {
            crt.c("visitChildren called on an unattached node");
        }
        byw bywVar2 = new byw(new cfx[16]);
        cfx cfxVar = ciuVar.q;
        cfx cfxVar2 = cfxVar.u;
        if (cfxVar2 == null) {
            bzi.w(bywVar2, cfxVar);
        } else {
            bywVar2.n(cfxVar2);
        }
        while (true) {
            int i = bywVar2.b;
            if (i == 0) {
                break;
            }
            cfx cfxVarN = (cfx) bywVar2.c(i - 1);
            if ((cfxVarN.s & 1024) == 0) {
                bzi.w(bywVar2, cfxVarN);
            } else {
                while (true) {
                    if (cfxVarN == null) {
                        break;
                    }
                    if ((cfxVarN.r & 1024) != 0) {
                        byw bywVar3 = null;
                        while (cfxVarN != null) {
                            if (cfxVarN instanceof ciu) {
                                bywVar.n((ciu) cfxVarN);
                            } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                int i2 = 0;
                                for (cfx cfxVar3 = ((cwe) cfxVarN).C; cfxVar3 != null; cfxVar3 = cfxVar3.u) {
                                    if ((cfxVar3.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cfxVarN = cfxVar3;
                                        } else {
                                            if (bywVar3 == null) {
                                                bywVar3 = new byw(new cfx[16]);
                                            }
                                            if (cfxVarN != null) {
                                                bywVar3.n(cfxVarN);
                                            }
                                            bywVar3.n(cfxVar3);
                                            cfxVarN = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cfxVarN = bzi.n(bywVar3);
                        }
                    } else {
                        cfxVarN = cfxVarN.u;
                    }
                }
            }
        }
        bywVar.j(civ.a);
        int i3 = bywVar.b - 1;
        Object[] objArr = bywVar.a;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                ciu ciuVar2 = (ciu) objArr[i3];
                if (r(ciuVar2) && l(ciuVar2, afecVar)) {
                    return true;
                }
                i3--;
            }
        }
        return false;
    }

    private static final boolean B(ciu ciuVar, afec afecVar) {
        byw bywVar = new byw(new ciu[16]);
        if (!ciuVar.q.A) {
            crt.c("visitChildren called on an unattached node");
        }
        byw bywVar2 = new byw(new cfx[16]);
        cfx cfxVar = ciuVar.q;
        cfx cfxVar2 = cfxVar.u;
        if (cfxVar2 == null) {
            bzi.w(bywVar2, cfxVar);
        } else {
            bywVar2.n(cfxVar2);
        }
        while (true) {
            int i = bywVar2.b;
            if (i == 0) {
                break;
            }
            cfx cfxVarN = (cfx) bywVar2.c(i - 1);
            if ((cfxVarN.s & 1024) == 0) {
                bzi.w(bywVar2, cfxVarN);
            } else {
                while (true) {
                    if (cfxVarN == null) {
                        break;
                    }
                    if ((cfxVarN.r & 1024) != 0) {
                        byw bywVar3 = null;
                        while (cfxVarN != null) {
                            if (cfxVarN instanceof ciu) {
                                bywVar.n((ciu) cfxVarN);
                            } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                int i2 = 0;
                                for (cfx cfxVar3 = ((cwe) cfxVarN).C; cfxVar3 != null; cfxVar3 = cfxVar3.u) {
                                    if ((cfxVar3.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            cfxVarN = cfxVar3;
                                        } else {
                                            if (bywVar3 == null) {
                                                bywVar3 = new byw(new cfx[16]);
                                            }
                                            if (cfxVarN != null) {
                                                bywVar3.n(cfxVarN);
                                            }
                                            bywVar3.n(cfxVar3);
                                            cfxVarN = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            cfxVarN = bzi.n(bywVar3);
                        }
                    } else {
                        cfxVarN = cfxVarN.u;
                    }
                }
            }
        }
        bywVar.j(civ.a);
        Object[] objArr = bywVar.a;
        int i3 = bywVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            ciu ciuVar2 = (ciu) objArr[i4];
            if (r(ciuVar2) && m(ciuVar2, afecVar)) {
                return true;
            }
        }
        return false;
    }

    private static final ciu C(ciu ciuVar) {
        ciu ciuVarP = p(ciuVar);
        if (ciuVarP != null) {
            return ciuVarP;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    private static final int D(ciu ciuVar, int i) {
        if (!ciuVar.c) {
            ciuVar.c = true;
            try {
                cie cieVarB = ciuVar.b();
                cho choVar = new cho(i);
                cic cicVar = ((czq) bzi.s(ciuVar)).J;
                ciu ciuVarB = cicVar.b();
                ((cig) cieVarB).j.invoke(choVar);
                ciu ciuVarB2 = cicVar.b();
                boolean z = choVar.b;
                int i2 = 2;
                if (!z) {
                    if (ciuVarB != ciuVarB2 && ciuVarB2 != null) {
                        if (cil.c != cil.b) {
                            i2 = 3;
                        }
                    }
                }
                return i2;
            } finally {
                ciuVar.c = false;
            }
        }
        return 1;
    }

    public static int a() {
        return Build.VERSION.SDK_INT < 36 ? Build.VERSION.SDK_INT * 100000 : Build.VERSION.SDK_INT_FULL;
    }

    public static final int b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginEnd();
        }
        return 0;
    }

    public static final int c(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.getMarginStart();
        }
        return 0;
    }

    public static final int d(View view) {
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = measuredHeight + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        return i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
    }

    public static final int e(View view) {
        return c(view) + b(view);
    }

    public static final int f(View view) {
        return view.getMeasuredWidth() + e(view);
    }

    public static SessionInfo g(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            throw new IllegalArgumentException("Expected the SessionInfo to be encoded in the bind intent extras, but the extras were null.");
        }
        Bundle bundle = extras.getBundle("androidx.car.app.extra.SESSION_INFO_BUNDLE");
        return new SessionInfo(bundle.getInt("display-type"), bundle.getString("session-id"));
    }

    public static void h(SessionInfo sessionInfo, Intent intent) {
        if (Build.VERSION.SDK_INT >= 29) {
            intent.setIdentifier(sessionInfo.toString());
        } else {
            intent.setData(new Uri.Builder().path(sessionInfo.toString()).build());
        }
        Bundle bundle = new Bundle();
        bundle.putInt("display-type", sessionInfo.getDisplayType());
        bundle.putString("session-id", sessionInfo.getSessionId());
        intent.putExtra("androidx.car.app.extra.SESSION_INFO_BUNDLE", bundle);
    }

    public static boolean i(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return false;
        }
        return extras.containsKey("androidx.car.app.extra.SESSION_INFO_BUNDLE");
    }

    public static void j(Context context, String str) {
        if (Log.isLoggable("CarApp", 3)) {
            Log.d("CarApp", "Checking to see if the car app requested the required library permission: ".concat(str));
        }
        try {
            try {
                k(context, str);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("CarApp", "Package name not found on the system: ".concat(String.valueOf(context.getPackageName())), e);
                throw new SecurityException("The car app does not have a required permission: ".concat(str));
            }
        } catch (SecurityException unused) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                for (String str2 : packageInfo.requestedPermissions) {
                    if (str2.equals(str)) {
                        return;
                    }
                }
            }
            throw new SecurityException("The car app does not have a required permission: ".concat(str));
        }
    }

    public static void k(Context context, String str) {
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) != 0) {
            throw new SecurityException("The car app does not have the required permission: ".concat(str));
        }
    }

    public static final boolean l(ciu ciuVar, afec afecVar) {
        int iOrdinal = ciuVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ciu ciuVarP = p(ciuVar);
                if (ciuVarP == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = ciuVarP.g().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (l(ciuVarP, afecVar) || z(ciuVar, ciuVarP, 2, afecVar)) {
                            return true;
                        }
                        return ((cig) ciuVarP.b()).a && ((Boolean) afecVar.invoke(ciuVarP)).booleanValue();
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new aezs();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return z(ciuVar, ciuVarP, 2, afecVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new aezs();
                }
                if (A(ciuVar, afecVar)) {
                    return true;
                }
                return ((cig) ciuVar.b()).a && ((Boolean) afecVar.invoke(ciuVar)).booleanValue();
            }
        }
        return A(ciuVar, afecVar);
    }

    public static final boolean m(ciu ciuVar, afec afecVar) {
        int iOrdinal = ciuVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ciu ciuVarP = p(ciuVar);
                if (ciuVarP != null) {
                    return m(ciuVarP, afecVar) || z(ciuVar, ciuVarP, 1, afecVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return ((cig) ciuVar.b()).a ? ((Boolean) afecVar.invoke(ciuVar)).booleanValue() : B(ciuVar, afecVar);
                }
                throw new aezs();
            }
        }
        return B(ciuVar, afecVar);
    }

    public static final boolean n(ciu ciuVar, ciu ciuVar2, int i, afec afecVar) {
        cfx cfxVar;
        cxx cxxVar;
        if (ciuVar.g() != cis.b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        byw bywVar = new byw(new ciu[16]);
        if (!ciuVar.q.A) {
            crt.c("visitChildren called on an unattached node");
        }
        byw bywVar2 = new byw(new cfx[16]);
        cfx cfxVar2 = ciuVar.q;
        cfx cfxVar3 = cfxVar2.u;
        if (cfxVar3 == null) {
            bzi.w(bywVar2, cfxVar2);
        } else {
            bywVar2.n(cfxVar3);
        }
        while (true) {
            int i2 = bywVar2.b;
            cfxVar = null;
            if (i2 == 0) {
                break;
            }
            cfx cfxVarN = (cfx) bywVar2.c(i2 - 1);
            if ((cfxVarN.s & 1024) == 0) {
                bzi.w(bywVar2, cfxVarN);
            } else {
                while (true) {
                    if (cfxVarN == null) {
                        break;
                    }
                    if ((cfxVarN.r & 1024) != 0) {
                        byw bywVar3 = null;
                        while (cfxVarN != null) {
                            if (cfxVarN instanceof ciu) {
                                bywVar.n((ciu) cfxVarN);
                            } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                int i3 = 0;
                                for (cfx cfxVar4 = ((cwe) cfxVarN).C; cfxVar4 != null; cfxVar4 = cfxVar4.u) {
                                    if ((cfxVar4.r & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            cfxVarN = cfxVar4;
                                        } else {
                                            if (bywVar3 == null) {
                                                bywVar3 = new byw(new cfx[16]);
                                            }
                                            if (cfxVarN != null) {
                                                bywVar3.n(cfxVarN);
                                            }
                                            bywVar3.n(cfxVar4);
                                            cfxVarN = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            cfxVarN = bzi.n(bywVar3);
                        }
                    } else {
                        cfxVarN = cfxVarN.u;
                    }
                }
            }
        }
        bywVar.j(civ.a);
        if (a.Y(i, 1)) {
            afha afhaVarM = afpt.m(0, bywVar.b);
            int i4 = afhaVarM.a;
            int i5 = afhaVarM.b;
            if (i4 <= i5) {
                boolean zF = false;
                while (true) {
                    if (zF) {
                        ciu ciuVar3 = (ciu) bywVar.a[i4];
                        if (r(ciuVar3) && m(ciuVar3, afecVar)) {
                            return true;
                        }
                    }
                    zF |= affa.f(bywVar.a[i4], ciuVar2);
                    if (i4 == i5) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            if (!a.Y(i, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            afha afhaVarM2 = afpt.m(0, bywVar.b);
            int i6 = afhaVarM2.a;
            int i7 = afhaVarM2.b;
            if (i6 <= i7) {
                boolean zF2 = false;
                while (true) {
                    if (zF2) {
                        ciu ciuVar4 = (ciu) bywVar.a[i7];
                        if (r(ciuVar4) && l(ciuVar4, afecVar)) {
                            return true;
                        }
                    }
                    zF2 |= affa.f(bywVar.a[i7], ciuVar2);
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
        }
        if (!a.Y(i, 1) && ((cig) ciuVar.b()).a) {
            if (!ciuVar.q.A) {
                crt.c("visitAncestors called on an unattached node");
            }
            cfx cfxVar5 = ciuVar.q.t;
            cxb cxbVarQ = bzi.q(ciuVar);
            loop5: while (true) {
                if (cxbVarQ == null) {
                    break;
                }
                if ((cxbVarQ.v.f.s & 1024) != 0) {
                    while (cfxVar5 != null) {
                        if ((cfxVar5.r & 1024) != 0) {
                            cfx cfxVarN2 = cfxVar5;
                            byw bywVar4 = null;
                            while (cfxVarN2 != null) {
                                if (cfxVarN2 instanceof ciu) {
                                    cfxVar = cfxVarN2;
                                    break loop5;
                                }
                                if ((cfxVarN2.r & 1024) != 0 && (cfxVarN2 instanceof cwe)) {
                                    int i8 = 0;
                                    for (cfx cfxVar6 = ((cwe) cfxVarN2).C; cfxVar6 != null; cfxVar6 = cfxVar6.u) {
                                        if ((cfxVar6.r & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                cfxVarN2 = cfxVar6;
                                            } else {
                                                if (bywVar4 == null) {
                                                    bywVar4 = new byw(new cfx[16]);
                                                }
                                                if (cfxVarN2 != null) {
                                                    bywVar4.n(cfxVarN2);
                                                }
                                                bywVar4.n(cfxVar6);
                                                cfxVarN2 = null;
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                    }
                                }
                                cfxVarN2 = bzi.n(bywVar4);
                            }
                        }
                        cfxVar5 = cfxVar5.t;
                    }
                }
                cxbVarQ = cxbVarQ.l();
                cfxVar5 = (cxbVarQ == null || (cxxVar = cxbVarQ.v) == null) ? null : cxxVar.e;
            }
            if (cfxVar != null) {
                return ((Boolean) afecVar.invoke(ciuVar)).booleanValue();
            }
        }
        return false;
    }

    public static final ciu o(ciu ciuVar) {
        ciu ciuVarB = ((czq) bzi.s(ciuVar)).J.b();
        if (ciuVarB == null || !ciuVarB.A) {
            return null;
        }
        return ciuVarB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0024, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ciu p(defpackage.ciu r8) {
        /*
            cfx r0 = r8.q
            boolean r0 = r0.A
            r1 = 0
            if (r0 == 0) goto La9
            if (r0 != 0) goto Le
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.crt.c(r0)
        Le:
            byw r0 = new byw
            r2 = 16
            cfx[] r3 = new defpackage.cfx[r2]
            r0.<init>(r3)
            cfx r8 = r8.q
            cfx r3 = r8.u
            if (r3 != 0) goto L21
            defpackage.bzi.w(r0, r8)
            goto L24
        L21:
            r0.n(r3)
        L24:
            int r8 = r0.b
            if (r8 == 0) goto La9
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.c(r8)
            cfx r8 = (defpackage.cfx) r8
            int r3 = r8.s
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3a
            defpackage.bzi.w(r0, r8)
            goto L24
        L3a:
            if (r8 == 0) goto L24
            int r3 = r8.r
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La6
            r3 = r1
        L43:
            if (r8 == 0) goto L24
            boolean r4 = r8 instanceof defpackage.ciu
            r5 = 1
            if (r4 == 0) goto L6c
            ciu r8 = (defpackage.ciu) r8
            cfx r4 = r8.q
            boolean r4 = r4.A
            if (r4 == 0) goto La1
            cis r4 = r8.g()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L6b
            r5 = 2
            if (r4 == r5) goto L6b
            r8 = 3
            if (r4 != r8) goto L65
            goto La1
        L65:
            aezs r8 = new aezs
            r8.<init>()
            throw r8
        L6b:
            return r8
        L6c:
            int r4 = r8.r
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La1
            boolean r4 = r8 instanceof defpackage.cwe
            if (r4 == 0) goto La1
            r4 = r8
            cwe r4 = (defpackage.cwe) r4
            cfx r4 = r4.C
            r6 = 0
        L7c:
            if (r4 == 0) goto L9f
            int r7 = r4.r
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9c
            int r6 = r6 + 1
            if (r6 != r5) goto L8a
            r8 = r4
            goto L9c
        L8a:
            if (r3 != 0) goto L93
            byw r3 = new byw
            cfx[] r7 = new defpackage.cfx[r2]
            r3.<init>(r7)
        L93:
            if (r8 == 0) goto L98
            r3.n(r8)
        L98:
            r3.n(r4)
            r8 = r1
        L9c:
            cfx r4 = r4.u
            goto L7c
        L9f:
            if (r6 == r5) goto L43
        La1:
            cfx r8 = defpackage.bzi.n(r3)
            goto L43
        La6:
            cfx r8 = r8.u
            goto L3a
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt.p(ciu):ciu");
    }

    public static final cjb q(ciu ciuVar) {
        cyc cycVar;
        cst cstVarJ;
        if (ciuVar.A && (cycVar = ciuVar.w) != null && (cstVarJ = crt.j(cycVar)) != null) {
            if (true != cstVarJ.t()) {
                cstVarJ = null;
            }
            if (cstVarJ != null) {
                return ciuVar.h(cstVarJ);
            }
        }
        return cjb.a;
    }

    public static final boolean r(ciu ciuVar) {
        cxb cxbVar;
        cyc cycVar;
        cxb cxbVar2;
        cyc cycVar2 = ciuVar.w;
        return (cycVar2 == null || (cxbVar = cycVar2.t) == null || !cxbVar.an() || (cycVar = ciuVar.w) == null || (cxbVar2 = cycVar.t) == null || !cxbVar2.am()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v8, types: [cfx] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2, types: [byw] */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [byw] */
    /* JADX WARN: Type inference failed for: r6v15, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v16, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v7, types: [cfx] */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static final boolean s(ciu ciuVar) {
        byw bywVar;
        boolean z;
        char c;
        ?? bywVar2;
        ?? N;
        cxx cxxVar;
        cxx cxxVar2;
        cic cicVar = ((czq) bzi.s(ciuVar)).J;
        ciu ciuVarB = cicVar.b();
        cis cisVarG = ciuVar.g();
        boolean z2 = true;
        if (ciuVarB == ciuVar) {
            ciuVar.l(cisVarG, cisVarG);
            return true;
        }
        if ((ciuVarB == null || ciuVarB.a) && !ciuVar.a && !((czq) bzi.s(ciuVar)).J.m()) {
            return false;
        }
        char c2 = 16;
        if (ciuVarB != null) {
            bywVar = new byw(new ciu[16]);
            if (!ciuVarB.q.A) {
                crt.c("visitAncestors called on an unattached node");
            }
            cfx cfxVar = ciuVarB.q.t;
            cxb cxbVarQ = bzi.q(ciuVarB);
            while (cxbVarQ != null) {
                if ((cxbVarQ.v.f.s & 1024) != 0) {
                    while (cfxVar != null) {
                        if ((cfxVar.r & 1024) != 0) {
                            cfx cfxVarN = cfxVar;
                            byw bywVar3 = null;
                            while (cfxVarN != null) {
                                if (cfxVarN instanceof ciu) {
                                    bywVar.n((ciu) cfxVarN);
                                } else if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                    int i = 0;
                                    for (cfx cfxVar2 = ((cwe) cfxVarN).C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
                                        if ((cfxVar2.r & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cfxVarN = cfxVar2;
                                            } else {
                                                if (bywVar3 == null) {
                                                    bywVar3 = new byw(new cfx[16]);
                                                }
                                                if (cfxVarN != null) {
                                                    bywVar3.n(cfxVarN);
                                                }
                                                bywVar3.n(cfxVar2);
                                                cfxVarN = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cfxVarN = bzi.n(bywVar3);
                            }
                        }
                        cfxVar = cfxVar.t;
                    }
                }
                cxbVarQ = cxbVarQ.l();
                cfxVar = (cxbVarQ == null || (cxxVar2 = cxbVarQ.v) == null) ? null : cxxVar2.e;
            }
        } else {
            bywVar = null;
        }
        byw bywVar4 = new byw(new ciu[16]);
        byw bywVar5 = new byw(new ciu[16]);
        if (!ciuVar.q.A) {
            crt.c("visitAncestors called on an unattached node");
        }
        ?? r6 = ciuVar.q.t;
        cxb cxbVarQ2 = bzi.q(ciuVar);
        boolean z3 = true;
        while (cxbVarQ2 != null) {
            if ((cxbVarQ2.v.f.s & 1024) != 0) {
                while (r6 != null) {
                    if ((r6.r & 1024) != 0) {
                        ciu ciuVar2 = r6;
                        boolean z4 = false;
                        while (ciuVar2 != null) {
                            if (ciuVar2 instanceof ciu) {
                                ciu ciuVar3 = ciuVar2;
                                if (affa.f(bywVar != null ? Boolean.valueOf(bywVar.m(ciuVar3)) : null, Boolean.valueOf(z2))) {
                                    bywVar4.n(ciuVar3);
                                } else {
                                    bywVar5.n(ciuVar3);
                                }
                                z3 &= ciuVar3 == ciuVarB ? false : z2;
                                z = false;
                            } else {
                                z = z2;
                            }
                            if (z && (ciuVar2.r & 1024) != 0 && (ciuVar2 instanceof cwe)) {
                                cfx cfxVar3 = ((cwe) ciuVar2).C;
                                int i2 = 0;
                                N = ciuVar2;
                                bywVar2 = z4;
                                while (cfxVar3 != null) {
                                    cfx cfxVar4 = N;
                                    if ((cfxVar3.r & 1024) != 0) {
                                        i2++;
                                        if (i2 == z2) {
                                            cfxVar4 = cfxVar3;
                                        } else {
                                            bywVar2 = bywVar2 == 0 ? new byw(new cfx[16]) : bywVar2;
                                            if (N != 0) {
                                                bywVar2.n(N);
                                            }
                                            bywVar2.n(cfxVar3);
                                            cfxVar4 = null;
                                        }
                                    }
                                    cfxVar3 = cfxVar3.u;
                                    z2 = true;
                                    N = cfxVar4;
                                    bywVar2 = bywVar2;
                                }
                                c = 16;
                                bywVar2 = bywVar2;
                                if (i2 == z2) {
                                    c2 = 16;
                                }
                                ciuVar2 = N;
                                z4 = bywVar2;
                            } else {
                                c = 16;
                                bywVar2 = z4;
                            }
                            N = bzi.n(bywVar2);
                            c2 = c;
                            z2 = true;
                            ciuVar2 = N;
                            z4 = bywVar2;
                        }
                    }
                    r6 = r6.t;
                    c2 = c2;
                    z2 = true;
                }
            }
            char c3 = c2;
            cxbVarQ2 = cxbVarQ2.l();
            if (cxbVarQ2 == null || (cxxVar = cxbVarQ2.v) == null) {
                c2 = c3;
                z2 = true;
                r6 = null;
            } else {
                r6 = cxxVar.e;
                c2 = c3;
                z2 = true;
            }
        }
        if (z3 && ciuVarB != null && !t(ciuVarB, false)) {
            return false;
        }
        cjn.p(ciuVar, new ahp(ciuVar, 14));
        int iOrdinal = ciuVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((czq) bzi.s(ciuVar)).J.g(ciuVar);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new aezs();
                }
                ((czq) bzi.s(ciuVar)).J.g(ciuVar);
            }
        }
        if (z3 && ciuVarB != null) {
            ciuVarB.l(cis.a, cis.d);
        }
        if (bywVar != null) {
            int i3 = bywVar.b - 1;
            Object[] objArr = bywVar.a;
            if (i3 < objArr.length) {
                while (i3 >= 0) {
                    ciu ciuVar4 = (ciu) objArr[i3];
                    if (cicVar.b() != ciuVar) {
                        return false;
                    }
                    ciuVar4.l(cis.b, cis.d);
                    i3--;
                }
            }
        }
        int i4 = bywVar5.b - 1;
        Object[] objArr2 = bywVar5.a;
        if (i4 < objArr2.length) {
            while (i4 >= 0) {
                ciu ciuVar5 = (ciu) objArr2[i4];
                if (cicVar.b() != ciuVar) {
                    return false;
                }
                ciuVar5.l(ciuVar5 == ciuVarB ? cis.a : cis.d, cis.b);
                i4--;
            }
        }
        if (cicVar.b() != ciuVar) {
            return false;
        }
        ciuVar.l(cisVarG, cis.a);
        return cicVar.b() == ciuVar;
    }

    public static final boolean t(ciu ciuVar, boolean z) {
        int iOrdinal = ciuVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return z;
                }
                if (iOrdinal == 3) {
                    return true;
                }
                throw new aezs();
            }
            ciu ciuVarP = p(ciuVar);
            if (ciuVarP != null && !t(ciuVarP, z)) {
                return false;
            }
            ciuVar.l(cis.b, cis.d);
        }
        return true;
    }

    public static final int u(ciu ciuVar, int i) {
        int iOrdinal = ciuVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                int iU = u(C(ciuVar), i);
                if (iU == 1) {
                    iU = 0;
                }
                if (iU != 0) {
                    return iU;
                }
                if (ciuVar.b) {
                    return 1;
                }
                ciuVar.b = true;
                try {
                    cie cieVarB = ciuVar.b();
                    cho choVar = new cho(i);
                    cic cicVar = ((czq) bzi.s(ciuVar)).J;
                    ciu ciuVarB = cicVar.b();
                    ((cig) cieVarB).k.invoke(choVar);
                    ciu ciuVarB2 = cicVar.b();
                    if (choVar.b) {
                        return 2;
                    }
                    if (ciuVarB == ciuVarB2 || ciuVarB2 == null) {
                        return 1;
                    }
                    return cil.c == cil.b ? 2 : 3;
                } finally {
                    ciuVar.b = false;
                }
            }
            if (iOrdinal == 2) {
                return 2;
            }
            if (iOrdinal != 3) {
                throw new aezs();
            }
        }
        return 1;
    }

    public static final int v(ciu ciuVar, int i) {
        cfx cfxVar;
        cxx cxxVar;
        int iOrdinal = ciuVar.g().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return u(C(ciuVar), i);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new aezs();
                }
                if (!ciuVar.q.A) {
                    crt.c("visitAncestors called on an unattached node");
                }
                cfx cfxVar2 = ciuVar.q.t;
                cxb cxbVarQ = bzi.q(ciuVar);
                loop0: while (true) {
                    cfxVar = null;
                    if (cxbVarQ == null) {
                        break;
                    }
                    if ((cxbVarQ.v.f.s & 1024) != 0) {
                        while (cfxVar2 != null) {
                            if ((cfxVar2.r & 1024) != 0) {
                                cfx cfxVarN = cfxVar2;
                                byw bywVar = null;
                                while (cfxVarN != null) {
                                    if (cfxVarN instanceof ciu) {
                                        cfxVar = cfxVarN;
                                        break loop0;
                                    }
                                    if ((cfxVarN.r & 1024) != 0 && (cfxVarN instanceof cwe)) {
                                        int i2 = 0;
                                        for (cfx cfxVar3 = ((cwe) cfxVarN).C; cfxVar3 != null; cfxVar3 = cfxVar3.u) {
                                            if ((cfxVar3.r & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    cfxVarN = cfxVar3;
                                                } else {
                                                    if (bywVar == null) {
                                                        bywVar = new byw(new cfx[16]);
                                                    }
                                                    if (cfxVarN != null) {
                                                        bywVar.n(cfxVarN);
                                                    }
                                                    bywVar.n(cfxVar3);
                                                    cfxVarN = null;
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    cfxVarN = bzi.n(bywVar);
                                }
                            }
                            cfxVar2 = cfxVar2.t;
                        }
                    }
                    cxbVarQ = cxbVarQ.l();
                    cfxVar2 = (cxbVarQ == null || (cxxVar = cxbVarQ.v) == null) ? null : cxxVar.e;
                }
                ciu ciuVar2 = (ciu) cfxVar;
                if (ciuVar2 == null) {
                    return 1;
                }
                int iOrdinal2 = ciuVar2.g().ordinal();
                if (iOrdinal2 == 0) {
                    return D(ciuVar2, i);
                }
                if (iOrdinal2 == 1) {
                    return v(ciuVar2, i);
                }
                if (iOrdinal2 == 2) {
                    return 2;
                }
                if (iOrdinal2 != 3) {
                    throw new aezs();
                }
                int iV = v(ciuVar2, i);
                int i3 = iV != 1 ? iV : 0;
                return i3 == 0 ? D(ciuVar2, i) : i3;
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0052, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean w(defpackage.ciu r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt.w(ciu):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x002e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean x(defpackage.ciu r10) {
        /*
            cis r0 = r10.g()
            boolean r0 = r0.a()
            r1 = 0
            if (r0 != 0) goto Ld
            goto Ldd
        Ld:
            cfx r0 = r10.q
            boolean r0 = r0.A
            if (r0 != 0) goto L18
            java.lang.String r0 = "visitChildren called on an unattached node"
            defpackage.crt.c(r0)
        L18:
            byw r0 = new byw
            r2 = 16
            cfx[] r3 = new defpackage.cfx[r2]
            r0.<init>(r3)
            cfx r3 = r10.q
            cfx r4 = r3.u
            if (r4 != 0) goto L2b
            defpackage.bzi.w(r0, r3)
            goto L2e
        L2b:
            r0.n(r4)
        L2e:
            int r3 = r0.b
            if (r3 == 0) goto Ldd
            int r3 = r3 + (-1)
            java.lang.Object r3 = r0.c(r3)
            cfx r3 = (defpackage.cfx) r3
            int r4 = r3.s
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L44
            defpackage.bzi.w(r0, r3)
            goto L2e
        L44:
            if (r3 == 0) goto L2e
            int r4 = r3.r
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto Ld9
            r4 = 0
            r5 = r4
        L4e:
            if (r3 == 0) goto L2e
            boolean r6 = r3 instanceof defpackage.ciu
            r7 = 1
            if (r6 == 0) goto L9e
            ciu r3 = (defpackage.ciu) r3
            cis r6 = r3.g()
            boolean r6 = r6.a()
            if (r6 == 0) goto Ld3
            cxb r0 = defpackage.bzi.q(r3)
            int r0 = r0.i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r10.d = r1
            bvf r1 = defpackage.cdr.a
            java.lang.Object r1 = defpackage.bzi.x(r10, r1)
            cdp r1 = (defpackage.cdp) r1
            rpp r2 = r10.f
            if (r2 == 0) goto L7c
            r2.b()
        L7c:
            if (r1 == 0) goto L9b
            cxb r2 = defpackage.bzi.q(r10)
            int r2 = r2.i
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "pfc"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            kmk r3 = new kmk
            r3.<init>(r0, r7)
            rpp r4 = r1.e(r2, r3)
        L9b:
            r10.f = r4
            return r7
        L9e:
            int r6 = r3.r
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto Ld3
            boolean r6 = r3 instanceof defpackage.cwe
            if (r6 == 0) goto Ld3
            r6 = r3
            cwe r6 = (defpackage.cwe) r6
            cfx r6 = r6.C
            r8 = r1
        Lae:
            if (r6 == 0) goto Ld1
            int r9 = r6.r
            r9 = r9 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto Lce
            int r8 = r8 + 1
            if (r8 != r7) goto Lbc
            r3 = r6
            goto Lce
        Lbc:
            if (r5 != 0) goto Lc5
            byw r5 = new byw
            cfx[] r9 = new defpackage.cfx[r2]
            r5.<init>(r9)
        Lc5:
            if (r3 == 0) goto Lca
            r5.n(r3)
        Lca:
            r5.n(r6)
            r3 = r4
        Lce:
            cfx r6 = r6.u
            goto Lae
        Ld1:
            if (r8 == r7) goto L4e
        Ld3:
            cfx r3 = defpackage.bzi.n(r5)
            goto L4e
        Ld9:
            cfx r3 = r3.u
            goto L44
        Ldd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt.x(ciu):boolean");
    }

    private static final boolean z(ciu ciuVar, ciu ciuVar2, int i, afec afecVar) {
        if (n(ciuVar, ciuVar2, i, afecVar)) {
            return true;
        }
        Boolean bool = (Boolean) lv.s(ciuVar, i, new ciw(((czq) bzi.s(ciuVar)).J.b(), ciuVar, ciuVar2, i, afecVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
