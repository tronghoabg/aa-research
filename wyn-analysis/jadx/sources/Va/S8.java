package Va;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes4.dex */
public final class S8 extends F8 {

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f13683j = {'N', 156};
    public static int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f13684l = 1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13685i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ S8(AbstractC1215y8 abstractC1215y8, AbstractC1215y8 abstractC1215y82, int i5) {
        super(abstractC1215y8, abstractC1215y82);
        this.f13685i = i5;
    }

    private final String i() {
        String str;
        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2;
        char[] charArray = "ϳꐷ".toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i5 = Ab.f13197E;
                    if (i5 < charArray.length) {
                        cArr2[0] = charArray[i5];
                        cArr2[1] = charArray[i5 + 1];
                        int i10 = 58224;
                        for (int i11 = 0; i11 < 16; i11++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i10) ^ ((c11 << 4) + 20570)) ^ ((c11 >>> 5) + 42719)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 13909) ^ ((c12 + i10) ^ ((c12 << 4) + 65173))));
                            i10 -= 40503;
                        }
                        int i12 = Ab.f13197E;
                        cArr[i12] = cArr2[0];
                        cArr[i12 + 1] = cArr2[1];
                        Ab.f13197E = i12 + 2;
                    } else {
                        str = new String(cArr, 0, maximumFlingVelocity);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str.intern();
    }

    private final String j() throws UnsupportedEncodingException {
        String str;
        k = (f13684l + 59) % 128;
        int[] iArr = {0, 2, 32, 2};
        byte[] bytes = "\u0000\u0000".getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13683j, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr[i15] = (char) (cArr[i15] - iArr[2]);
                        Ab.f13222y = i15 + 1;
                    }
                }
                str = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        String strIntern = str.intern();
        k = (f13684l + 125) % 128;
        return strIntern;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (r0.e() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        if (r0.e() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ed, code lost:
    
        Va.S8.f13684l = (Va.S8.k + 73) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fe, code lost:
    
        return f().c(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return r0;
     */
    @Override // Va.AbstractC1215y8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Va.C1139s8 b(Va.C1203x8 r4, Va.C1214y7 r5) {
        /*
            r3 = this;
            int r0 = r3.f13685i
            switch(r0) {
                case 0: goto Lc0;
                case 1: goto L97;
                default: goto L5;
            }
        L5:
            Va.y8 r0 = r3.e()
            Va.s8 r0 = r0.c(r4, r5)
            Va.y8 r1 = r3.f()
            Va.s8 r4 = r1.c(r4, r5)
            java.lang.Object r5 = r0.c()
            boolean r5 = r5 instanceof java.lang.String
            if (r5 != 0) goto L79
            java.lang.Object r5 = r4.c()
            boolean r5 = r5 instanceof java.lang.String
            if (r5 == 0) goto L26
            goto L79
        L26:
            java.lang.Number r5 = r0.a()
            java.lang.Number r4 = r4.a()
            boolean r0 = r5 instanceof java.lang.Double
            if (r0 != 0) goto L66
            boolean r0 = r4 instanceof java.lang.Double
            if (r0 == 0) goto L37
            goto L66
        L37:
            boolean r0 = r5 instanceof java.lang.Long
            if (r0 == 0) goto L3c
            goto L40
        L3c:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L53
        L40:
            Va.s8 r0 = new Va.s8
            long r1 = r5.longValue()
            long r4 = r4.longValue()
            long r4 = r4 + r1
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.<init>(r4)
            goto L96
        L53:
            Va.s8 r0 = new Va.s8
            int r5 = r5.intValue()
            int r4 = r4.intValue()
            int r4 = r4 + r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r4)
            goto L96
        L66:
            Va.s8 r0 = new Va.s8
            double r1 = r5.doubleValue()
            double r4 = r4.doubleValue()
            double r4 = r4 + r1
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            r0.<init>(r4)
            goto L96
        L79:
            Va.s8 r5 = new Va.s8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r0 = r0.c()
            r1.append(r0)
            java.lang.Object r4 = r4.c()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.<init>(r4)
            r0 = r5
        L96:
            return r0
        L97:
            Va.s8 r0 = new Va.s8
            Va.y8 r1 = r3.e()
            Va.s8 r1 = r1.c(r4, r5)
            boolean r1 = r1.e()
            if (r1 == 0) goto Lb7
            Va.y8 r1 = r3.f()
            Va.s8 r4 = r1.c(r4, r5)
            boolean r4 = r4.e()
            if (r4 == 0) goto Lb7
            r4 = 1
            goto Lb8
        Lb7:
            r4 = 0
        Lb8:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.<init>(r4)
            return r0
        Lc0:
            int r0 = Va.S8.k
            int r0 = r0 + 75
            int r1 = r0 % 128
            Va.S8.f13684l = r1
            int r0 = r0 % 2
            if (r0 != 0) goto Ldf
            Va.y8 r0 = r3.e()
            Va.s8 r0 = r0.c(r4, r5)
            boolean r1 = r0.e()
            r2 = 34
            int r2 = r2 / 0
            if (r1 == 0) goto Lf6
            goto Led
        Ldf:
            Va.y8 r0 = r3.e()
            Va.s8 r0 = r0.c(r4, r5)
            boolean r1 = r0.e()
            if (r1 == 0) goto Lf6
        Led:
            int r4 = Va.S8.k
            int r4 = r4 + 73
            int r4 = r4 % 128
            Va.S8.f13684l = r4
            goto Lfe
        Lf6:
            Va.y8 r0 = r3.f()
            Va.s8 r0 = r0.c(r4, r5)
        Lfe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.S8.b(Va.x8, Va.y7):Va.s8");
    }

    @Override // Va.F8
    public final String h() {
        String str;
        switch (this.f13685i) {
            case 0:
                return j();
            case 1:
                return i();
            default:
                int iMyPid = (Process.myPid() >> 22) + 1;
                int i5 = (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 66;
                int iIndexOf = TextUtils.indexOf("", "", 0) + 1;
                char[] charArray = WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.toCharArray();
                synchronized (Ab.f13221x) {
                    try {
                        char[] cArr = new char[iMyPid];
                        Ab.f13219v = 0;
                        while (true) {
                            int i10 = Ab.f13219v;
                            if (i10 < iMyPid) {
                                char c10 = (char) (charArray[i10] + i5);
                                cArr[i10] = c10;
                                cArr[i10] = (char) (c10 - 23);
                                Ab.f13219v = i10 + 1;
                            } else {
                                if (iIndexOf > 0) {
                                    Ab.f13220w = iIndexOf;
                                    char[] cArr2 = new char[iMyPid];
                                    System.arraycopy(cArr, 0, cArr2, 0, iMyPid);
                                    int i11 = Ab.f13220w;
                                    System.arraycopy(cArr2, 0, cArr, iMyPid - i11, i11);
                                    int i12 = Ab.f13220w;
                                    System.arraycopy(cArr2, i12, cArr, 0, iMyPid - i12);
                                }
                                char[] cArr3 = new char[iMyPid];
                                Ab.f13219v = 0;
                                while (true) {
                                    int i13 = Ab.f13219v;
                                    if (i13 < iMyPid) {
                                        cArr3[i13] = cArr[(iMyPid - i13) - 1];
                                        Ab.f13219v = i13 + 1;
                                    } else {
                                        str = new String(cArr3);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str.intern();
        }
    }
}
