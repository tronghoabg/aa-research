package g2;

import android.net.Uri;
import android.util.Base64;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final C2691l f35689a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f35690b;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[PHI: r36
  0x0067: PHI (r36v19 java.lang.String) = 
  (r36v1 java.lang.String)
  (r36v2 java.lang.String)
  (r36v3 java.lang.String)
  (r36v4 java.lang.String)
  (r36v5 java.lang.String)
  (r36v6 java.lang.String)
  (r36v7 java.lang.String)
  (r36v8 java.lang.String)
  (r36v9 java.lang.String)
  (r36v10 java.lang.String)
  (r36v11 java.lang.String)
  (r36v12 java.lang.String)
  (r36v13 java.lang.String)
  (r36v14 java.lang.String)
  (r36v15 java.lang.String)
  (r36v16 java.lang.String)
  (r36v17 java.lang.String)
  (r36v20 java.lang.String)
 binds: [B:74:0x015a, B:70:0x014c, B:66:0x0141, B:62:0x0134, B:58:0x0127, B:54:0x011c, B:50:0x010f, B:46:0x0100, B:42:0x00f0, B:38:0x00e0, B:34:0x00d0, B:30:0x00c0, B:26:0x00b0, B:22:0x00a2, B:18:0x0092, B:14:0x0082, B:10:0x0072, B:7:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(g2.C2694o r44, g2.C2682c r45, android.net.Uri r46) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.w.<init>(g2.o, g2.c, android.net.Uri):void");
    }

    public static byte[] a(String str) {
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr = new byte[bArrDecode.length + 4];
        System.arraycopy(R1.n.f10151a, 0, bArr, 0, 4);
        System.arraycopy(bArrDecode, 0, bArr, 4, bArrDecode.length);
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w.class == obj.getClass()) {
            w wVar = (w) obj;
            if (this.f35689a.equals(wVar.f35689a) && this.f35690b.equals(wVar.f35690b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35690b.hashCode() + ((this.f35689a.hashCode() + Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE) * 31);
    }
}
