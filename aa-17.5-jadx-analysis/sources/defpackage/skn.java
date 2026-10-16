package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class skn {
    private static skn c;
    private static volatile HashSet d;
    private static volatile HashSet e;
    public final Object a;
    public volatile Object b;

    public skn(Context context) {
        this.a = context.getApplicationContext();
    }

    public static skn a(Context context) {
        skn sknVar;
        if (context == null) {
            throw new NullPointerException("null reference");
        }
        synchronized (skn.class) {
            sknVar = c;
            if (sknVar == null) {
                skh.a(context);
                sknVar = new skn(context);
                c = sknVar;
            }
        }
        return sknVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0099, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final boolean d(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r11 == 0) goto L28
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L21
        L1f:
            r11 = r0
            goto L28
        L21:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L1f
            r11 = r1
        L28:
            if (r11 == 0) goto L2d
            yfq r2 = defpackage.skg.b     // Catch: java.lang.IllegalArgumentException -> La4
            goto L2f
        L2d:
            yfq r2 = defpackage.skg.a     // Catch: java.lang.IllegalArgumentException -> La4
        L2f:
            int r3 = defpackage.spj.a     // Catch: java.lang.IllegalArgumentException -> La4
            android.content.pm.SigningInfo r3 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r10)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r3 == 0) goto L65
            boolean r4 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r4 != 0) goto L65
            android.content.pm.Signature[] r4 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m322m(r3)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r4 != 0) goto L44
            goto L65
        L44:
            int r4 = defpackage.yfq.d     // Catch: java.lang.IllegalArgumentException -> La4
            yfl r4 = new yfl     // Catch: java.lang.IllegalArgumentException -> La4
            r5 = 4
            r4.<init>(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            android.content.pm.Signature[] r3 = defpackage.hg$$ExternalSyntheticApiModelOutline0.m322m(r3)     // Catch: java.lang.IllegalArgumentException -> La4
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La4
            r6 = r0
        L52:
            if (r6 >= r5) goto L60
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La4
            r4.i(r7)     // Catch: java.lang.IllegalArgumentException -> La4
            int r6 = r6 + 1
            goto L52
        L60:
            yfq r3 = r4.g()     // Catch: java.lang.IllegalArgumentException -> La4
            goto L69
        L65:
            int r3 = defpackage.yfq.d     // Catch: java.lang.IllegalArgumentException -> La4
            yfq r3 = defpackage.yls.a     // Catch: java.lang.IllegalArgumentException -> La4
        L69:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r4 != 0) goto L9c
            yfq r3 = r3.h()     // Catch: java.lang.IllegalArgumentException -> La4
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La4
            r5 = r0
        L78:
            if (r5 >= r4) goto L9b
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La4
            ynp r7 = r2.listIterator(r0)     // Catch: java.lang.IllegalArgumentException -> La4
        L84:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La4
            int r9 = r5 + 1
            if (r8 == 0) goto L99
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La4
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La4
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r8 == 0) goto L84
            return r1
        L99:
            r5 = r9
            goto L78
        L9b:
            return r0
        L9c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r3 = "Unable to obtain package certificate history."
            r2.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La4
            throw r2     // Catch: java.lang.IllegalArgumentException -> La4
        La4:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r11 == 0) goto Lb4
            soj[] r11 = defpackage.skg.c
            soj r10 = e(r10, r11)
            goto Lc0
        Lb4:
            soj[] r11 = new defpackage.soj[r1]
            soj[] r2 = defpackage.skg.c
            r2 = r2[r0]
            r11[r0] = r2
            soj r10 = e(r10, r11)
        Lc0:
            if (r10 == 0) goto Lc3
            return r1
        Lc3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skn.d(android.content.pm.PackageInfo, boolean):boolean");
    }

    private static soj e(PackageInfo packageInfo, soj... sojVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            ske skeVar = new ske(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < sojVarArr.length; i++) {
                if (sojVarArr[i].equals(skeVar)) {
                    return sojVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016e  */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.skj f(java.lang.String r17) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skn.f(java.lang.String):skj");
    }

    public final boolean b(String str) throws PackageManager.NameNotFoundException {
        skj skjVarF = f(str);
        skjVarF.b();
        return skjVarF.b;
    }

    public final boolean c(int i) throws PackageManager.NameNotFoundException {
        int length;
        String[] packagesForUid = ((Context) this.a).getPackageManager().getPackagesForUid(i);
        skj skjVar = null;
        int i2 = 0;
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            while (true) {
                if (i2 >= length) {
                    spu.aw(skjVar);
                    break;
                }
                skjVar = f(packagesForUid[i2]);
                if (skjVar.b) {
                    break;
                }
                i2++;
            }
        } else {
            skjVar = new skj(false, "no pkgs", null);
        }
        skjVar.b();
        return skjVar.b;
    }

    public skn(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }
}
