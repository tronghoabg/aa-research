package V5;

import A7.AbstractC0279p0;
import E5.T;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f13061a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13062b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13063c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f13064d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13065e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13066f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f13067g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f13068h;

    public n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z10, boolean z11) {
        str.getClass();
        this.f13061a = str;
        this.f13062b = str2;
        this.f13063c = str3;
        this.f13064d = codecCapabilities;
        this.f13067g = z2;
        this.f13065e = z10;
        this.f13066f = z11;
        this.f13068h = u6.k.i(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i5, int i10, double d3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(u6.v.f(i5, widthAlignment) * widthAlignment, u6.v.f(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        return (d3 == -1.0d || d3 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d3));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static V5.n g(java.lang.String r8, java.lang.String r9, java.lang.String r10, android.media.MediaCodecInfo.CodecCapabilities r11, boolean r12, boolean r13) {
        /*
            V5.n r0 = new V5.n
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L3d
            int r3 = u6.v.f46721a
            r4 = 19
            if (r3 < r4) goto L3d
            java.lang.String r4 = "adaptive-playback"
            boolean r4 = r11.isFeatureSupported(r4)
            if (r4 == 0) goto L3d
            r4 = 22
            if (r3 > r4) goto L3b
            java.lang.String r3 = u6.v.f46724d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L2a
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r6 = r2
            goto L3e
        L3d:
            r6 = r1
        L3e:
            r3 = 21
            if (r11 == 0) goto L4c
            int r4 = u6.v.f46721a
            if (r4 < r3) goto L4c
            java.lang.String r4 = "tunneled-playback"
            boolean r4 = r11.isFeatureSupported(r4)
        L4c:
            if (r13 != 0) goto L64
            if (r11 == 0) goto L5d
            int r13 = u6.v.f46721a
            if (r13 < r3) goto L5d
            java.lang.String r13 = "secure-playback"
            boolean r13 = r11.isFeatureSupported(r13)
            if (r13 == 0) goto L5d
            goto L64
        L5d:
            r7 = r1
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r1 = r8
            goto L6a
        L64:
            r7 = r2
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r2 = r9
        L6a:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.n.g(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):V5.n");
    }

    public final H5.i b(T t10, T t11) {
        T t12;
        T t13;
        int i5 = !u6.v.a(t10.f3238l, t11.f3238l) ? 8 : 0;
        if (this.f13068h) {
            if (t10.f3246t != t11.f3246t) {
                i5 |= Segment.SHARE_MINIMUM;
            }
            if (!this.f13065e && (t10.f3243q != t11.f3243q || t10.f3244r != t11.f3244r)) {
                i5 |= 512;
            }
            if (!u6.v.a(t10.f3250x, t11.f3250x)) {
                i5 |= 2048;
            }
            if (u6.v.f46724d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f13061a) && !t10.b(t11)) {
                i5 |= 2;
            }
            if (i5 == 0) {
                return new H5.i(this.f13061a, t10, t11, t10.b(t11) ? 3 : 2, 0);
            }
            t12 = t10;
            t13 = t11;
        } else {
            t12 = t10;
            t13 = t11;
            if (t12.f3251y != t13.f3251y) {
                i5 |= 4096;
            }
            if (t12.f3252z != t13.f3252z) {
                i5 |= Segment.SIZE;
            }
            if (t12.f3222A != t13.f3222A) {
                i5 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str = this.f13062b;
            if (i5 == 0 && "audio/mp4a-latm".equals(str)) {
                Pair pairD = y.d(t12);
                Pair pairD2 = y.d(t13);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new H5.i(this.f13061a, t12, t13, 3, 0);
                    }
                }
            }
            if (!t12.b(t13)) {
                i5 |= 32;
            }
            if ("audio/opus".equals(str)) {
                i5 |= 2;
            }
            if (i5 == 0) {
                return new H5.i(this.f13061a, t12, t13, 1, 0);
            }
        }
        return new H5.i(this.f13061a, t12, t13, 0, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(E5.T r18) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.n.c(E5.T):boolean");
    }

    public final boolean d(T t10) {
        if (this.f13068h) {
            return this.f13065e;
        }
        Pair pairD = y.d(t10);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    public final boolean e(int i5, int i10, double d3) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f13064d;
        if (codecCapabilities == null) {
            f("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            f("sizeAndRate.vCaps");
            return false;
        }
        if (u6.v.f46721a >= 29) {
            int iA = m.a(videoCapabilities, i5, i10, d3);
            if (iA == 2) {
                return true;
            }
            if (iA == 1) {
                StringBuilder sbH = R8.v.h("sizeAndRate.cover, ", i5, "x", i10, "@");
                sbH.append(d3);
                f(sbH.toString());
                return false;
            }
        }
        if (!a(videoCapabilities, i5, i10, d3)) {
            if (i5 < i10) {
                String str = this.f13061a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(u6.v.f46722b)) && a(videoCapabilities, i10, i5, d3)) {
                    StringBuilder sbH2 = R8.v.h("sizeAndRate.rotated, ", i5, "x", i10, "@");
                    sbH2.append(d3);
                    StringBuilder sbR = AbstractC0279p0.r("AssumedSupport [", sbH2.toString(), "] [", str, ", ");
                    sbR.append(this.f13062b);
                    sbR.append("] [");
                    sbR.append(u6.v.f46725e);
                    sbR.append("]");
                    AbstractC4256a.n("MediaCodecInfo", sbR.toString());
                }
            }
            StringBuilder sbH3 = R8.v.h("sizeAndRate.support, ", i5, "x", i10, "@");
            sbH3.append(d3);
            f(sbH3.toString());
            return false;
        }
        return true;
    }

    public final void f(String str) {
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("NoSupport [", str, "] [");
        sbW.append(this.f13061a);
        sbW.append(", ");
        sbW.append(this.f13062b);
        sbW.append("] [");
        sbW.append(u6.v.f46725e);
        sbW.append("]");
        AbstractC4256a.n("MediaCodecInfo", sbW.toString());
    }

    public final String toString() {
        return this.f13061a;
    }
}
