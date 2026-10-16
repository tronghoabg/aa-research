package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.api.internal.av;
import java.util.HashSet;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private static ah f4675a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile HashSet f4676b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile HashSet f4677c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f4678d;

    /* renamed from: e, reason: collision with root package name */
    private volatile String f4679e;

    public ah(Context context) {
        this.f4678d = context.getApplicationContext();
    }

    public static ah a(Context context) {
        ah ahVar;
        av.m(context);
        synchronized (ah.class) {
            ahVar = f4675a;
            if (ahVar == null) {
                u.d(context);
                ahVar = new ah(context);
                f4675a = ahVar;
            }
        }
        return ahVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009b, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static final boolean e(android.content.pm.PackageInfo r10, boolean r11) {
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
            com.google.d.d.bn r2 = com.google.android.gms.common.t.f5126c     // Catch: java.lang.IllegalArgumentException -> La6
            goto L2f
        L2d:
            com.google.d.d.bn r2 = com.google.android.gms.common.t.f5125b     // Catch: java.lang.IllegalArgumentException -> La6
        L2f:
            int r3 = com.google.android.gms.common.util.a.f5137a     // Catch: java.lang.IllegalArgumentException -> La6
            com.google.d.b.an.u(r1)     // Catch: java.lang.IllegalArgumentException -> La6
            android.content.pm.SigningInfo r3 = android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0.m95m(r10)     // Catch: java.lang.IllegalArgumentException -> La6
            if (r3 == 0) goto L67
            boolean r4 = android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0.m$1(r3)     // Catch: java.lang.IllegalArgumentException -> La6
            if (r4 != 0) goto L67
            android.content.pm.Signature[] r4 = android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0.m115m$1(r3)     // Catch: java.lang.IllegalArgumentException -> La6
            if (r4 != 0) goto L47
            goto L67
        L47:
            int r4 = com.google.d.d.bn.f7456d     // Catch: java.lang.IllegalArgumentException -> La6
            com.google.d.d.bi r4 = new com.google.d.d.bi     // Catch: java.lang.IllegalArgumentException -> La6
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> La6
            android.content.pm.Signature[] r3 = android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0.m115m$1(r3)     // Catch: java.lang.IllegalArgumentException -> La6
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La6
            r6 = r0
        L54:
            if (r6 >= r5) goto L62
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La6
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La6
            r4.g(r7)     // Catch: java.lang.IllegalArgumentException -> La6
            int r6 = r6 + 1
            goto L54
        L62:
            com.google.d.d.bn r3 = r4.f()     // Catch: java.lang.IllegalArgumentException -> La6
            goto L6b
        L67:
            com.google.d.d.bn r3 = com.google.d.d.bn.p()     // Catch: java.lang.IllegalArgumentException -> La6
        L6b:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La6
            if (r4 != 0) goto L9e
            com.google.d.d.bn r3 = r3.a()     // Catch: java.lang.IllegalArgumentException -> La6
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La6
            r5 = r0
        L7a:
            if (r5 >= r4) goto L9d
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La6
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La6
            com.google.d.d.fv r7 = r2.iterator()     // Catch: java.lang.IllegalArgumentException -> La6
        L86:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La6
            int r9 = r5 + 1
            if (r8 == 0) goto L9b
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La6
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La6
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La6
            if (r8 == 0) goto L86
            return r1
        L9b:
            r5 = r9
            goto L7a
        L9d:
            return r0
        L9e:
            java.lang.String r2 = "Unable to obtain package certificate history."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La6
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> La6
            throw r3     // Catch: java.lang.IllegalArgumentException -> La6
        La6:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r11 == 0) goto Lb6
            com.google.android.gms.common.q[] r11 = com.google.android.gms.common.t.f5124a
            com.google.android.gms.common.q r10 = f(r10, r11)
            goto Lc2
        Lb6:
            com.google.android.gms.common.q[] r11 = new com.google.android.gms.common.q[r1]
            com.google.android.gms.common.q[] r2 = com.google.android.gms.common.t.f5124a
            r2 = r2[r0]
            r11[r0] = r2
            com.google.android.gms.common.q r10 = f(r10, r11)
        Lc2:
            if (r10 == 0) goto Lc5
            return r1
        Lc5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.ah.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    private static q f(PackageInfo packageInfo, q... qVarArr) {
        if (packageInfo.signatures != null) {
            if (packageInfo.signatures.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            r rVar = new r(packageInfo.signatures[0].toByteArray());
            for (int i2 = 0; i2 < qVarArr.length; i2++) {
                if (qVarArr[i2].equals(rVar)) {
                    return qVarArr[i2];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.content.pm.PackageInfo] */
    private final ac g(String str) throws PackageManager.NameNotFoundException {
        ac acVarC;
        if (str == null) {
            return ac.c("null pkg");
        }
        if (str.equals(this.f4679e)) {
            return ac.b();
        }
        int i2 = u.f5134h;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                u.e();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | com.google.android.gms.dynamite.h e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
        }
        if (u.f5133g.c()) {
            z zVar = new z();
            zVar.d(str);
            zVar.b(ag.c(this.f4678d));
            zVar.c();
            acVarC = u.b(zVar.a());
        } else {
            try {
                threadPolicyAllowThreadDiskReads = this.f4678d.getPackageManager().getPackageInfo(str, 134217792);
                boolean zC = ag.c(this.f4678d);
                if (threadPolicyAllowThreadDiskReads == 0) {
                    acVarC = ac.c("null pkg");
                } else if (((PackageInfo) threadPolicyAllowThreadDiskReads).signatures == null || ((PackageInfo) threadPolicyAllowThreadDiskReads).signatures.length != 1) {
                    acVarC = ac.c("single cert required");
                } else {
                    r rVar = new r(((PackageInfo) threadPolicyAllowThreadDiskReads).signatures[0].toByteArray());
                    String str2 = ((PackageInfo) threadPolicyAllowThreadDiskReads).packageName;
                    ac acVarA = u.a(str2, rVar, zC, false);
                    acVarC = (!acVarA.f4668a || ((PackageInfo) threadPolicyAllowThreadDiskReads).applicationInfo == null || (((PackageInfo) threadPolicyAllowThreadDiskReads).applicationInfo.flags & 2) == 0 || !u.a(str2, rVar, false, true).f4668a) ? acVarA : ac.c("debuggable release cert app rejected");
                }
            } catch (PackageManager.NameNotFoundException e3) {
                return ac.d("no pkg ".concat(str), e3);
            }
        }
        if (!acVarC.f4668a) {
            return acVarC;
        }
        this.f4679e = str;
        return acVarC;
    }

    public final boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (ag.c(this.f4678d)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public final boolean c(String str) throws PackageManager.NameNotFoundException {
        ac acVarG = g(str);
        acVarG.e();
        return acVarG.f4668a;
    }

    public final boolean d(int i2) throws PackageManager.NameNotFoundException {
        ac acVarC;
        int length;
        String[] packagesForUid = this.f4678d.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            int i3 = 0;
            acVarC = null;
            while (true) {
                if (i3 >= length) {
                    av.m(acVarC);
                    break;
                }
                acVarC = g(packagesForUid[i3]);
                if (acVarC.f4668a) {
                    break;
                }
                i3++;
            }
        } else {
            acVarC = ac.c("no pkgs");
        }
        acVarC.e();
        return acVarC.f4668a;
    }
}
