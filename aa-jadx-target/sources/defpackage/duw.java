package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class duw {
    public static int c(android.content.Context context, java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("permission must be non-null");
        }
        if (android.os.Build.VERSION.SDK_INT >= 33 || !android.text.TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid());
        }
        return new defpackage.dun(context).c() ? 0 : -1;
    }

    public static android.content.res.ColorStateList d(android.content.Context context, int i) {
        android.content.res.ColorStateList colorStateListA;
        java.lang.Object colorStateList;
        defpackage.aahg aahgVar;
        android.content.res.Resources.Theme theme;
        android.content.res.Resources resources = context.getResources();
        android.content.res.Resources.Theme theme2 = context.getTheme();
        java.util.WeakHashMap weakHashMap = defpackage.dvi.a;
        defpackage.dvf dvfVar = new defpackage.dvf(resources, theme2);
        synchronized (defpackage.dvi.b) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) defpackage.dvi.a.get(dvfVar);
            colorStateListA = null;
            if (sparseArray == null || sparseArray.size() <= 0 || (aahgVar = (defpackage.aahg) sparseArray.get(i)) == null) {
                colorStateList = null;
            } else if (!((android.content.res.Configuration) aahgVar.b).equals(dvfVar.a.getConfiguration()) || (!((theme = dvfVar.b) == null && aahgVar.a == 0) && (theme == null || aahgVar.a != theme.hashCode()))) {
                sparseArray.remove(i);
                colorStateList = null;
            } else {
                colorStateList = aahgVar.c;
            }
        }
        if (colorStateList == null) {
            android.util.TypedValue typedValueB = defpackage.dvi.b();
            resources.getValue(i, typedValueB, true);
            if (typedValueB.type < 28 || typedValueB.type > 31) {
                try {
                    colorStateListA = defpackage.dvc.a(resources, resources.getXml(i), theme2);
                } catch (java.lang.Exception e) {
                    android.util.Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
                }
            }
            if (colorStateListA != null) {
                synchronized (defpackage.dvi.b) {
                    java.util.WeakHashMap weakHashMap2 = defpackage.dvi.a;
                    android.util.SparseArray sparseArray2 = (android.util.SparseArray) weakHashMap2.get(dvfVar);
                    if (sparseArray2 == null) {
                        sparseArray2 = new android.util.SparseArray();
                        weakHashMap2.put(dvfVar, sparseArray2);
                    }
                    sparseArray2.append(i, new defpackage.aahg(colorStateListA, dvfVar.a.getConfiguration(), theme2));
                }
                colorStateList = colorStateListA;
            } else {
                colorStateList = resources.getColorStateList(i, theme2);
            }
        }
        return (android.content.res.ColorStateList) colorStateList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (defpackage.dmh.F(r6, r10, r0, r1, r2) == 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent e(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, android.os.Handler r9, int r10) {
        /*
            r0 = r10 & 1
            if (r0 == 0) goto L11
            r1 = r10 & 4
            if (r1 != 0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        L11:
            if (r0 == 0) goto L15
            r10 = r10 | 2
        L15:
            r5 = r10
            r10 = r5 & 4
            r0 = r5 & 2
            if (r0 != 0) goto L27
            if (r10 == 0) goto L1f
            goto L29
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required"
            r6.<init>(r7)
            throw r6
        L27:
            if (r10 != 0) goto La3
        L29:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto L99
            if (r10 == 0) goto L8d
            android.content.Context r10 = r6.getApplicationContext()
            java.lang.String r10 = r10.getPackageName()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r3 = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION"
            java.lang.String r10 = r10.concat(r3)
            int r0 = defpackage.dmh.F(r6, r10, r0, r1, r2)
            if (r0 == 0) goto L88
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L7a
            java.lang.String r10 = alh$.ExternalSyntheticApiModelOutline0.m(r6)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r10 = r10.concat(r3)
            int r0 = defpackage.dmh.F(r6, r10, r0, r1, r2)
            if (r0 != 0) goto L7a
            goto L88
        L7a:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Permission "
            java.lang.String r8 = " is required by your application to receive broadcasts, please add it to your manifest"
            java.lang.String r7 = defpackage.a.bp(r10, r7, r8)
            r6.<init>(r7)
            throw r6
        L88:
            android.content.Intent r6 = r6.registerReceiver(r7, r8, r10, r9)
            return r6
        L8d:
            r3 = 0
            r5 = r5 & 1
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            android.content.Intent r6 = ep$.ExternalSyntheticApiModelOutline1.m(r0, r1, r2, r3, r4, r5)
            return r6
        L99:
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r3 = 0
            android.content.Intent r6 = ep$.ExternalSyntheticApiModelOutline1.m(r0, r1, r2, r3, r4, r5)
            return r6
        La3:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duw.e(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, android.os.Handler, int):android.content.Intent");
    }
}
