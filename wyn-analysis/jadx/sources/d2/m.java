package d2;

import J5.y;
import N1.C;
import N1.C0757f;
import N1.C0765n;
import Q1.x;
import U1.C0835e;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.core.device.MimeTypes;
import j$.util.Objects;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final String f33992a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33993b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33994c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f33995d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33996e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f33997f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f33998g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f33999h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f34000i;

    public m(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z2, boolean z10, boolean z11, boolean z12) {
        str.getClass();
        this.f33992a = str;
        this.f33993b = str2;
        this.f33994c = str3;
        this.f33995d = codecCapabilities;
        this.f33998g = z2;
        this.f33996e = z10;
        this.f33997f = z11;
        this.f33999h = z12;
        this.f34000i = C.l(str2);
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i5, int i10, double d3) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(x.f(i5, widthAlignment) * widthAlignment, x.f(i10, heightAlignment) * heightAlignment);
        int i11 = point.x;
        int i12 = point.y;
        return (d3 == -1.0d || d3 < 1.0d) ? videoCapabilities.isSizeSupported(i11, i12) : videoCapabilities.areSizeAndRateSupported(i11, i12, Math.floor(d3));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static d2.m h(java.lang.String r9, java.lang.String r10, java.lang.String r11, android.media.MediaCodecInfo.CodecCapabilities r12, boolean r13, boolean r14) {
        /*
            d2.m r0 = new d2.m
            r1 = 0
            r2 = 1
            if (r12 == 0) goto L39
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r12.isFeatureSupported(r3)
            if (r3 == 0) goto L39
            int r3 = Q1.x.f9724a
            r4 = 22
            if (r3 > r4) goto L37
            java.lang.String r3 = Q1.x.f9727d
            java.lang.String r4 = "ODROID-XU3"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L26
            java.lang.String r4 = "Nexus 10"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L37
        L26:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L39
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L37
            goto L39
        L37:
            r6 = r2
            goto L3a
        L39:
            r6 = r1
        L3a:
            if (r12 == 0) goto L42
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r12.isFeatureSupported(r3)
        L42:
            if (r14 != 0) goto L51
            if (r12 == 0) goto L4f
            java.lang.String r14 = "secure-playback"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L4f
            goto L51
        L4f:
            r7 = r1
            goto L52
        L51:
            r7 = r2
        L52:
            int r14 = Q1.x.f9724a
            r3 = 35
            if (r14 < r3) goto L69
            if (r12 == 0) goto L69
            java.lang.String r14 = "detached-surface"
            boolean r14 = r12.isFeatureSupported(r14)
            if (r14 == 0) goto L69
            r8 = r2
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r13
            r2 = r10
            goto L6f
        L69:
            r8 = r1
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1 = r9
        L6f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.m.h(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):d2.m");
    }

    public final C0835e b(C0765n c0765n, C0765n c0765n2) {
        C0765n c0765n3;
        C0765n c0765n4;
        String str = c0765n.f8232n;
        String str2 = c0765n2.f8232n;
        int i5 = x.f9724a;
        int i10 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.f34000i) {
            if (c0765n.f8242x != c0765n2.f8242x) {
                i10 |= Segment.SHARE_MINIMUM;
            }
            if (!this.f33996e && (c0765n.f8239u != c0765n2.f8239u || c0765n.f8240v != c0765n2.f8240v)) {
                i10 |= 512;
            }
            C0757f c0757f = c0765n.f8209B;
            boolean zE = C0757f.e(c0757f);
            C0757f c0757f2 = c0765n2.f8209B;
            if ((!zE || !C0757f.e(c0757f2)) && !Objects.equals(c0757f, c0757f2)) {
                i10 |= 2048;
            }
            if (x.f9727d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.f33992a) && !c0765n.b(c0765n2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C0835e(this.f33992a, c0765n, c0765n2, c0765n.b(c0765n2) ? 3 : 2, 0);
            }
            c0765n3 = c0765n;
            c0765n4 = c0765n2;
        } else {
            c0765n3 = c0765n;
            c0765n4 = c0765n2;
            if (c0765n3.f8210C != c0765n4.f8210C) {
                i10 |= 4096;
            }
            if (c0765n3.f8211D != c0765n4.f8211D) {
                i10 |= Segment.SIZE;
            }
            if (c0765n3.f8212E != c0765n4.f8212E) {
                i10 |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            String str3 = this.f33993b;
            if (i10 == 0 && "audio/mp4a-latm".equals(str3)) {
                Pair pairD = v.d(c0765n3);
                Pair pairD2 = v.d(c0765n4);
                if (pairD != null && pairD2 != null) {
                    int iIntValue = ((Integer) pairD.first).intValue();
                    int iIntValue2 = ((Integer) pairD2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C0835e(this.f33992a, c0765n3, c0765n4, 3, 0);
                    }
                }
            }
            if (!c0765n3.b(c0765n4)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(str3)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new C0835e(this.f33992a, c0765n3, c0765n4, 1, 0);
            }
        }
        return new C0835e(this.f33992a, c0765n3, c0765n4, 0, i10);
    }

    public final boolean c(C0765n c0765n, boolean z2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pair;
        String strB;
        Pair pairC;
        int i5 = 4;
        int i10 = 3;
        Pair pairD = v.d(c0765n);
        String str = this.f33994c;
        String str2 = c0765n.f8232n;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String strM = C.m(str);
            if (strM.equals("video/mv-hevc")) {
                return true;
            }
            if (strM.equals(MimeTypes.VIDEO_H265)) {
                List list = c0765n.f8235q;
                int i11 = 0;
                loop0: while (true) {
                    if (i11 >= list.size()) {
                        pair = null;
                        strB = null;
                        break;
                    }
                    byte[] bArr = (byte[]) list.get(i11);
                    int length = bArr.length;
                    if (length > i10) {
                        boolean[] zArr = new boolean[i10];
                        C3406H c3406hI = AbstractC3409K.i();
                        int i12 = 0;
                        while (i12 < bArr.length) {
                            int iB = R1.n.b(bArr, i12, bArr.length, zArr);
                            if (iB != bArr.length) {
                                c3406hI.a(Integer.valueOf(iB));
                            }
                            i12 = iB + 3;
                        }
                        e0 e0VarG = c3406hI.g();
                        for (int i13 = 0; i13 < e0VarG.f40103d; i13++) {
                            if (((Integer) e0VarG.get(i13)).intValue() + i10 < length) {
                                y yVar = new y(((Integer) e0VarG.get(i13)).intValue() + i10, bArr, length, i10);
                                D9.n nVarD = R1.n.d(yVar);
                                if (nVarD.f2592b == 33 && nVarD.f2593c == 0) {
                                    yVar.t(4);
                                    int i14 = yVar.i(3);
                                    yVar.s();
                                    pair = null;
                                    R1.g gVarE = R1.n.e(yVar, true, i14, null);
                                    strB = Q1.a.b(gVarE.f10105a, gVarE.f10106b, gVarE.f10107c, gVarE.f10108d, gVarE.f10109e, gVarE.f10110f);
                                    break loop0;
                                }
                                i10 = 3;
                            }
                        }
                    }
                    i11++;
                }
                if (strB == null) {
                    pairC = pair;
                } else {
                    String strTrim = strB.trim();
                    int i15 = x.f9724a;
                    pairC = Q1.a.c(strB, strTrim.split("\\.", -1), c0765n.f8209B);
                }
                pairD = pairC;
            }
        }
        if (pairD == null) {
            return true;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        int iIntValue2 = ((Integer) pairD.second).intValue();
        boolean zEquals = "video/dolby-vision".equals(str2);
        String str3 = this.f33993b;
        if (zEquals) {
            if (MimeTypes.VIDEO_H264.equals(str3)) {
                iIntValue = 8;
            } else if (MimeTypes.VIDEO_H265.equals(str3)) {
                iIntValue = 2;
            }
            iIntValue2 = 0;
        }
        if (!this.f34000i && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f33995d;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
        }
        if (x.f9724a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i5 = Segment.SHARE_MINIMUM;
            } else if (iIntValue3 >= 120000000) {
                i5 = 512;
            } else if (iIntValue3 >= 60000000) {
                i5 = 256;
            } else if (iIntValue3 >= 30000000) {
                i5 = 128;
            } else if (iIntValue3 >= 18000000) {
                i5 = 64;
            } else if (iIntValue3 >= 12000000) {
                i5 = 32;
            } else if (iIntValue3 >= 7200000) {
                i5 = 16;
            } else if (iIntValue3 >= 3600000) {
                i5 = 8;
            } else if (iIntValue3 < 1800000) {
                i5 = iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i5;
            codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z2)) {
                if (!MimeTypes.VIDEO_H265.equals(str3) || 2 != iIntValue) {
                    return true;
                }
                String str4 = x.f9725b;
                if (!"sailfish".equals(str4) && !"marlin".equals(str4)) {
                    return true;
                }
            }
        }
        g("codec.profileLevel, " + c0765n.k + ", " + str);
        return false;
    }

    public final boolean d(C0765n c0765n) {
        int i5;
        String str = c0765n.f8232n;
        String str2 = this.f33993b;
        if (!(str2.equals(str) || str2.equals(v.b(c0765n))) || !c(c0765n, true)) {
            return false;
        }
        if (this.f34000i) {
            int i10 = c0765n.f8239u;
            if (i10 > 0 && (i5 = c0765n.f8240v) > 0) {
                return f(i10, i5, c0765n.f8241w);
            }
        } else {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f33995d;
            int i11 = c0765n.f8211D;
            if (i11 != -1) {
                if (codecCapabilities == null) {
                    g("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    g("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i11)) {
                    g("sampleRate.support, " + i11);
                    return false;
                }
            }
            int i12 = c0765n.f8210C;
            if (i12 != -1) {
                if (codecCapabilities == null) {
                    g("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    g("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && ((x.f9724a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                    int i13 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
                    Q1.k.w("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + this.f33992a + ", [" + maxInputChannelCount + " to " + i13 + "]");
                    maxInputChannelCount = i13;
                }
                if (maxInputChannelCount < i12) {
                    g("channelCount.support, " + i12);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean e(C0765n c0765n) {
        if (this.f34000i) {
            return this.f33996e;
        }
        Pair pairD = v.d(c0765n);
        return pairD != null && ((Integer) pairD.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(int r12, int r13, double r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.m.f(int, int, double):boolean");
    }

    public final void g(String str) {
        StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("NoSupport [", str, "] [");
        sbW.append(this.f33992a);
        sbW.append(", ");
        sbW.append(this.f33993b);
        sbW.append("] [");
        sbW.append(x.f9728e);
        sbW.append("]");
        Q1.k.j("MediaCodecInfo", sbW.toString());
    }

    public final String toString() {
        return this.f33992a;
    }
}
