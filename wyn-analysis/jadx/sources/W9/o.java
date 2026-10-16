package W9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.Serializable;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f15357a;

    /* renamed from: b, reason: collision with root package name */
    public int f15358b;

    /* renamed from: c, reason: collision with root package name */
    public Object f15359c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f15360d;

    /* renamed from: e, reason: collision with root package name */
    public Serializable f15361e;

    public static String d(s8.g gVar) {
        gVar.a();
        s8.l lVar = gVar.f45330c;
        String str = lVar.f45347e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = lVar.f45344b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int[], java.io.Serializable] */
    public int a(int i5) {
        int i10 = this.f15357a + 1;
        int[] iArr = (int[]) this.f15359c;
        int length = iArr.length;
        if (i10 > length) {
            int i11 = length * 2;
            int[] iArr2 = new int[i11];
            ?? r22 = new int[i11];
            ff.m.i0(0, 14, iArr, iArr2);
            ff.m.i0(0, 14, (int[]) this.f15360d, r22);
            this.f15359c = iArr2;
            this.f15360d = r22;
        }
        int i12 = this.f15357a;
        this.f15357a = i12 + 1;
        int length2 = ((int[]) this.f15361e).length;
        if (this.f15358b >= length2) {
            int i13 = length2 * 2;
            ?? r23 = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                r23[i14] = i15;
                i14 = i15;
            }
            ff.m.i0(0, 14, (int[]) this.f15361e, r23);
            this.f15361e = r23;
        }
        int i16 = this.f15358b;
        int[] iArr3 = (int[]) this.f15361e;
        this.f15358b = iArr3[i16];
        int[] iArr4 = (int[]) this.f15359c;
        iArr4[i12] = i5;
        ((int[]) this.f15360d)[i12] = i16;
        iArr3[i16] = i12;
        int i17 = iArr4[i12];
        while (i12 > 0) {
            int i18 = ((i12 + 1) >> 1) - 1;
            if (iArr4[i18] <= i17) {
                break;
            }
            h(i18, i12);
            i12 = i18;
        }
        return i16;
    }

    public synchronized String b() {
        try {
            if (((String) this.f15360d) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f15360d;
    }

    public synchronized String c() {
        try {
            if (((String) this.f15361e) == null) {
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f15361e;
    }

    public PackageInfo e(String str) {
        try {
            return ((Context) this.f15359c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Failed to find package " + e7);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f15358b     // Catch: java.lang.Throwable -> L27
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            monitor-exit(r5)
            goto L7f
        La:
            java.lang.Object r0 = r5.f15359c     // Catch: java.lang.Throwable -> L27
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L27
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r3 = r0.checkPermission(r3, r4)     // Catch: java.lang.Throwable -> L27
            r4 = -1
            if (r3 != r4) goto L29
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r3 = "Google Play services missing or without correct permission."
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r2
            goto L7f
        L27:
            r0 = move-exception
            goto L83
        L29:
            boolean r3 = n7.AbstractC3598c.h()     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L4c
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.c2dm.intent.REGISTER"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L27
            java.util.List r3 = r0.queryIntentServices(r3, r2)     // Catch: java.lang.Throwable -> L27
            if (r3 == 0) goto L4c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L27
            if (r3 <= 0) goto L4c
            r5.f15358b = r1     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r1
            goto L7f
        L4c:
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.iid.TOKEN_REQUEST"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L27
            java.lang.String r4 = "com.google.android.gms"
            r3.setPackage(r4)     // Catch: java.lang.Throwable -> L27
            java.util.List r0 = r0.queryBroadcastReceivers(r3, r2)     // Catch: java.lang.Throwable -> L27
            r3 = 2
            if (r0 == 0) goto L6a
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L27
            if (r0 <= 0) goto L6a
            r5.f15358b = r3     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            r0 = r3
            goto L7f
        L6a:
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r4 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L27
            boolean r0 = n7.AbstractC3598c.h()     // Catch: java.lang.Throwable -> L27
            if (r0 == 0) goto L7a
            r5.f15358b = r3     // Catch: java.lang.Throwable -> L27
            goto L7c
        L7a:
            r5.f15358b = r1     // Catch: java.lang.Throwable -> L27
        L7c:
            int r0 = r5.f15358b     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
        L7f:
            if (r0 == 0) goto L82
            return r1
        L82:
            return r2
        L83:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L27
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: W9.o.f():boolean");
    }

    public synchronized void g() {
        PackageInfo packageInfoE = e(((Context) this.f15359c).getPackageName());
        if (packageInfoE != null) {
            this.f15360d = Integer.toString(packageInfoE.versionCode);
            this.f15361e = packageInfoE.versionName;
        }
    }

    public void h(int i5, int i10) {
        int[] iArr = (int[]) this.f15359c;
        int[] iArr2 = (int[]) this.f15360d;
        int[] iArr3 = (int[]) this.f15361e;
        int i11 = iArr[i5];
        iArr[i5] = iArr[i10];
        iArr[i10] = i11;
        int i12 = iArr2[i5];
        iArr2[i5] = iArr2[i10];
        iArr2[i10] = i12;
        iArr3[iArr2[i5]] = i5;
        iArr3[iArr2[i10]] = i10;
    }
}
