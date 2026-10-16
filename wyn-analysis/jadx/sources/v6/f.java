package v6;

import A7.AbstractC0279p0;
import E5.B0;
import E5.F;
import E5.S;
import E5.T;
import G5.C0522c;
import G5.C0535p;
import V5.q;
import V5.r;
import V5.s;
import V5.u;
import V5.y;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.applovin.impl.W;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.C3407I;
import l8.e0;
import o1.C3641c;
import q2.C3857a;
import q2.C3858b;
import q2.C3860d;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class f extends q {

    /* renamed from: n1, reason: collision with root package name */
    public static final int[] f46849n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: o1, reason: collision with root package name */
    public static boolean f46850o1;

    /* renamed from: p1, reason: collision with root package name */
    public static boolean f46851p1;

    /* renamed from: E0, reason: collision with root package name */
    public final Context f46852E0;

    /* renamed from: F0, reason: collision with root package name */
    public final q2.o f46853F0;

    /* renamed from: G0, reason: collision with root package name */
    public final C0535p f46854G0;

    /* renamed from: H0, reason: collision with root package name */
    public final long f46855H0;

    /* renamed from: I0, reason: collision with root package name */
    public final int f46856I0;

    /* renamed from: J0, reason: collision with root package name */
    public final boolean f46857J0;

    /* renamed from: K0, reason: collision with root package name */
    public C0522c f46858K0;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f46859L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f46860M0;

    /* renamed from: N0, reason: collision with root package name */
    public Surface f46861N0;

    /* renamed from: O0, reason: collision with root package name */
    public g f46862O0;

    /* renamed from: P0, reason: collision with root package name */
    public boolean f46863P0;

    /* renamed from: Q0, reason: collision with root package name */
    public int f46864Q0;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f46865R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f46866S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f46867T0;

    /* renamed from: U0, reason: collision with root package name */
    public long f46868U0;

    /* renamed from: V0, reason: collision with root package name */
    public long f46869V0;

    /* renamed from: W0, reason: collision with root package name */
    public long f46870W0;

    /* renamed from: X0, reason: collision with root package name */
    public int f46871X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f46872Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public long f46873a1;

    /* renamed from: b1, reason: collision with root package name */
    public long f46874b1;

    /* renamed from: c1, reason: collision with root package name */
    public long f46875c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f46876d1;

    /* renamed from: e1, reason: collision with root package name */
    public int f46877e1;
    public int f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f46878g1;

    /* renamed from: h1, reason: collision with root package name */
    public float f46879h1;

    /* renamed from: i1, reason: collision with root package name */
    public o f46880i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f46881j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f46882k1;

    /* renamed from: l1, reason: collision with root package name */
    public C3860d f46883l1;

    /* renamed from: m1, reason: collision with root package name */
    public i f46884m1;

    public f(Context context, V5.j jVar, Handler handler, F f10) {
        super(2, jVar, 30.0f);
        this.f46855H0 = 5000L;
        this.f46856I0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f46852E0 = applicationContext;
        this.f46853F0 = new q2.o(applicationContext, 1);
        this.f46854G0 = new C0535p(handler, f10, 1);
        this.f46857J0 = "NVIDIA".equals(v.f46723c);
        this.f46869V0 = -9223372036854775807L;
        this.f46877e1 = -1;
        this.f1 = -1;
        this.f46879h1 = -1.0f;
        this.f46864Q0 = 1;
        this.f46882k1 = 0;
        this.f46880i1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean q0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.f.q0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int r0(V5.n r11, E5.T r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.f.r0(V5.n, E5.T):int");
    }

    public static AbstractC3409K s0(Context context, r rVar, T t10, boolean z2, boolean z10) {
        String str = t10.f3238l;
        if (str == null) {
            C3407I c3407i = AbstractC3409K.f40056b;
            return e0.f40101e;
        }
        rVar.getClass();
        List listE = y.e(str, z2, z10);
        String strB = y.b(t10);
        if (strB == null) {
            return AbstractC3409K.j(listE);
        }
        List listE2 = y.e(strB, z2, z10);
        if (v.f46721a >= 26 && "video/dolby-vision".equals(t10.f3238l) && !listE2.isEmpty() && !e.a(context)) {
            return AbstractC3409K.j(listE2);
        }
        C3406H c3406hI = AbstractC3409K.i();
        c3406hI.d(listE);
        c3406hI.d(listE2);
        return c3406hI.g();
    }

    public static int t0(V5.n nVar, T t10) {
        if (t10.f3239m == -1) {
            return r0(nVar, t10);
        }
        List list = t10.f3240n;
        int size = list.size();
        int length = 0;
        for (int i5 = 0; i5 < size; i5++) {
            length += ((byte[]) list.get(i5)).length;
        }
        return t10.f3239m + length;
    }

    @Override // V5.q
    public final V5.l A(IllegalStateException illegalStateException, V5.n nVar) {
        Surface surface = this.f46861N0;
        C4305d c4305d = new C4305d(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return c4305d;
    }

    public final void A0(V5.k kVar, int i5) {
        AbstractC4256a.b("skipVideoBuffer");
        kVar.x(i5, false);
        AbstractC4256a.q();
        this.f13139z0.f4910g++;
    }

    public final void B0(int i5, int i10) {
        H5.e eVar = this.f13139z0;
        eVar.f4912i += i5;
        int i11 = i5 + i10;
        eVar.f4911h += i11;
        this.f46871X0 += i11;
        int i12 = this.f46872Y0 + i11;
        this.f46872Y0 = i12;
        eVar.f4913j = Math.max(i12, eVar.f4913j);
        int i13 = this.f46856I0;
        if (i13 <= 0 || this.f46871X0 < i13) {
            return;
        }
        u0();
    }

    public final void C0(long j8) {
        H5.e eVar = this.f13139z0;
        eVar.f4914l += j8;
        eVar.f4915m++;
        this.f46875c1 += j8;
        this.f46876d1++;
    }

    @Override // V5.q
    public final boolean I() {
        return this.f46881j1 && v.f46721a < 23;
    }

    @Override // V5.q
    public final float J(float f10, T[] tArr) {
        float fMax = -1.0f;
        for (T t10 : tArr) {
            float f11 = t10.f3245s;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // V5.q
    public final ArrayList K(r rVar, T t10, boolean z2) {
        AbstractC3409K abstractC3409KS0 = s0(this.f46852E0, rVar, t10, z2, this.f46881j1);
        Pattern pattern = y.f13150a;
        ArrayList arrayList = new ArrayList(abstractC3409KS0);
        Collections.sort(arrayList, new s(new S8.b(t10, 10), 0));
        return arrayList;
    }

    @Override // V5.q
    public final V5.i M(V5.n nVar, T t10, MediaCrypto mediaCrypto, float f10) {
        C4303b c4303b;
        int i5;
        C0522c c0522c;
        Point point;
        Point point2;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10;
        int i11;
        char c10;
        boolean z2;
        Pair pairD;
        int iR0;
        g gVar = this.f46862O0;
        if (gVar != null && gVar.f46887a != nVar.f13066f) {
            if (this.f46861N0 == gVar) {
                this.f46861N0 = null;
            }
            gVar.release();
            this.f46862O0 = null;
        }
        String str = nVar.f13063c;
        T[] tArr = this.f3352h;
        tArr.getClass();
        int iMax = t10.f3243q;
        int iT0 = t0(nVar, t10);
        int length = tArr.length;
        float f11 = t10.f3245s;
        int i12 = t10.f3243q;
        C4303b c4303b2 = t10.f3250x;
        int i13 = t10.f3244r;
        if (length == 1) {
            if (iT0 != -1 && (iR0 = r0(nVar, t10)) != -1) {
                iT0 = Math.min((int) (iT0 * 1.5f), iR0);
            }
            c0522c = new C0522c(iMax, i13, iT0);
            c4303b = c4303b2;
            i5 = i13;
        } else {
            int length2 = tArr.length;
            int iMax2 = i13;
            int i14 = 0;
            boolean z10 = false;
            while (i14 < length2) {
                T t11 = tArr[i14];
                T[] tArr2 = tArr;
                if (c4303b2 != null && t11.f3250x == null) {
                    S sA = t11.a();
                    sA.f3216w = c4303b2;
                    t11 = new T(sA);
                }
                if (nVar.b(t10, t11).f4925d != 0) {
                    int i15 = t11.f3244r;
                    i10 = length2;
                    int i16 = t11.f3243q;
                    i11 = i14;
                    c10 = 65535;
                    z10 |= i16 == -1 || i15 == -1;
                    iMax = Math.max(iMax, i16);
                    iMax2 = Math.max(iMax2, i15);
                    iT0 = Math.max(iT0, t0(nVar, t11));
                } else {
                    i10 = length2;
                    i11 = i14;
                    c10 = 65535;
                }
                i14 = i11 + 1;
                tArr = tArr2;
                length2 = i10;
            }
            if (z10) {
                AbstractC4256a.E("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z11 = i13 > i12;
                int i17 = z11 ? i13 : i12;
                boolean z12 = z11;
                int i18 = z11 ? i12 : i13;
                float f12 = i18 / i17;
                int[] iArr = f46849n1;
                c4303b = c4303b2;
                int i19 = 0;
                while (i19 < 9) {
                    int i20 = iArr[i19];
                    int i21 = i19;
                    int i22 = (int) (i20 * f12);
                    if (i20 <= i17 || i22 <= i18) {
                        break;
                    }
                    int i23 = i18;
                    int i24 = i17;
                    if (v.f46721a >= 21) {
                        int i25 = z12 ? i22 : i20;
                        if (!z12) {
                            i20 = i22;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f13064d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(v.f(i25, widthAlignment) * widthAlignment, v.f(i20, heightAlignment) * heightAlignment);
                        }
                        i5 = i13;
                        if (nVar.e(point2.x, point2.y, f11)) {
                            point = point2;
                            break;
                        }
                        i19 = i21 + 1;
                        i13 = i5;
                        i18 = i23;
                        i17 = i24;
                    } else {
                        i5 = i13;
                        try {
                            int iF = v.f(i20, 16) * 16;
                            int iF2 = v.f(i22, 16) * 16;
                            if (iF * iF2 <= y.i()) {
                                int i26 = z12 ? iF2 : iF;
                                if (!z12) {
                                    iF = iF2;
                                }
                                point2 = new Point(i26, iF);
                                point = point2;
                                break;
                            }
                            i19 = i21 + 1;
                            i13 = i5;
                            i18 = i23;
                            i17 = i24;
                        } catch (u unused) {
                        }
                    }
                }
                i5 = i13;
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    S sA2 = t10.a();
                    sA2.f3209p = iMax;
                    sA2.f3210q = iMax2;
                    iT0 = Math.max(iT0, r0(nVar, new T(sA2)));
                    AbstractC4256a.E("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                c4303b = c4303b2;
                i5 = i13;
            }
            c0522c = new C0522c(iMax, iMax2, iT0);
        }
        this.f46858K0 = c0522c;
        int i27 = this.f46881j1 ? this.f46882k1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i12);
        mediaFormat.setInteger("height", i5);
        AbstractC4256a.B(mediaFormat, t10.f3240n);
        if (f11 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f11);
        }
        AbstractC4256a.y(mediaFormat, "rotation-degrees", t10.f3246t);
        if (c4303b != null) {
            C4303b c4303b3 = c4303b;
            AbstractC4256a.y(mediaFormat, "color-transfer", c4303b3.f46842c);
            AbstractC4256a.y(mediaFormat, "color-standard", c4303b3.f46840a);
            AbstractC4256a.y(mediaFormat, "color-range", c4303b3.f46841b);
            byte[] bArr = c4303b3.f46843d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(t10.f3238l) && (pairD = y.d(t10)) != null) {
            AbstractC4256a.y(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", c0522c.f4405a);
        mediaFormat.setInteger("max-height", c0522c.f4406b);
        AbstractC4256a.y(mediaFormat, "max-input-size", c0522c.f4407c);
        if (v.f46721a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.f46857J0) {
            z2 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z2 = true;
        }
        if (i27 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z2);
            mediaFormat.setInteger("audio-session-id", i27);
        }
        if (this.f46861N0 == null) {
            if (!z0(nVar)) {
                throw new IllegalStateException();
            }
            if (this.f46862O0 == null) {
                this.f46862O0 = g.f(this.f46852E0, nVar.f13066f);
            }
            this.f46861N0 = this.f46862O0;
        }
        return new V5.i(nVar, mediaFormat, t10, this.f46861N0, mediaCrypto);
    }

    @Override // V5.q
    public final void N(H5.h hVar) {
        if (this.f46860M0) {
            ByteBuffer byteBuffer = hVar.f4920g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b5 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b5 == -75 && s10 == 60 && s11 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        V5.k kVar = this.f13084I;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        kVar.c(bundle);
                    }
                }
            }
        }
    }

    @Override // V5.q
    public final void R(Exception exc) {
        AbstractC4256a.p("MediaCodecVideoRenderer", "Video codec error", exc);
        C0535p c0535p = this.f46854G0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new n(c0535p, exc, 2));
        }
    }

    @Override // V5.q
    public final void S(long j8, long j10, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C0535p c0535p = this.f46854G0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            str2 = str;
            handler.post(new n(c0535p, str2, j8, j10));
        } else {
            str2 = str;
        }
        this.f46859L0 = q0(str2);
        V5.n nVar = this.f13090P;
        nVar.getClass();
        boolean z2 = false;
        if (v.f46721a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f13062b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f13064d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i5].profile == 16384) {
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        this.f46860M0 = z2;
        if (v.f46721a < 23 || !this.f46881j1) {
            return;
        }
        V5.k kVar = this.f13084I;
        kVar.getClass();
        this.f46883l1 = new C3860d(this, kVar);
    }

    @Override // V5.q
    public final void T(String str) {
        C0535p c0535p = this.f46854G0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new n(c0535p, str, 1));
        }
    }

    @Override // V5.q
    public final H5.i U(S3.s sVar) {
        H5.i iVarU = super.U(sVar);
        T t10 = (T) sVar.f11010c;
        C0535p c0535p = this.f46854G0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new n(c0535p, t10, iVarU));
        }
        return iVarU;
    }

    @Override // V5.q
    public final void V(T t10, MediaFormat mediaFormat) {
        V5.k kVar = this.f13084I;
        if (kVar != null) {
            kVar.h(this.f46864Q0);
        }
        if (this.f46881j1) {
            this.f46877e1 = t10.f3243q;
            this.f1 = t10.f3244r;
        } else {
            mediaFormat.getClass();
            boolean z2 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            this.f46877e1 = z2 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            this.f1 = z2 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        }
        float f10 = t10.f3247u;
        this.f46879h1 = f10;
        int i5 = v.f46721a;
        int i10 = t10.f3246t;
        if (i5 < 21) {
            this.f46878g1 = i10;
        } else if (i10 == 90 || i10 == 270) {
            int i11 = this.f46877e1;
            this.f46877e1 = this.f1;
            this.f1 = i11;
            this.f46879h1 = 1.0f / f10;
        }
        float f11 = t10.f3245s;
        q2.o oVar = this.f46853F0;
        oVar.f44087d = f11;
        C3858b c3858b = (C3858b) oVar.f44098p;
        ((C3857a) c3858b.f43985d).c();
        ((C3857a) c3858b.f43986e).c();
        c3858b.f43982a = false;
        c3858b.f43983b = -9223372036854775807L;
        c3858b.f43984c = 0;
        oVar.c();
    }

    @Override // V5.q
    public final void X(long j8) {
        super.X(j8);
        if (this.f46881j1) {
            return;
        }
        this.Z0--;
    }

    @Override // V5.q
    public final void Y() {
        p0();
    }

    @Override // V5.q
    public final void Z(H5.h hVar) {
        boolean z2 = this.f46881j1;
        if (!z2) {
            this.Z0++;
        }
        if (v.f46721a >= 23 || !z2) {
            return;
        }
        long j8 = hVar.f4919f;
        o0(j8);
        w0();
        this.f13139z0.f4909f++;
        v0();
        X(j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    @Override // V5.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b0(long r32, long r34, V5.k r36, java.nio.ByteBuffer r37, int r38, int r39, int r40, long r41, boolean r43, boolean r44, E5.T r45) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v6.f.b0(long, long, V5.k, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, E5.T):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [android.view.Surface] */
    @Override // E5.AbstractC0449f, E5.x0
    public final void c(int i5, Object obj) throws Exception {
        Handler handler;
        Handler handler2;
        int iIntValue;
        q2.o oVar = this.f46853F0;
        if (i5 != 1) {
            if (i5 == 7) {
                this.f46884m1 = (i) obj;
                return;
            }
            if (i5 == 10) {
                int iIntValue2 = ((Integer) obj).intValue();
                if (this.f46882k1 != iIntValue2) {
                    this.f46882k1 = iIntValue2;
                    if (this.f46881j1) {
                        d0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i5 != 4) {
                if (i5 == 5 && oVar.f44091h != (iIntValue = ((Integer) obj).intValue())) {
                    oVar.f44091h = iIntValue;
                    oVar.d(true);
                    return;
                }
                return;
            }
            int iIntValue3 = ((Integer) obj).intValue();
            this.f46864Q0 = iIntValue3;
            V5.k kVar = this.f13084I;
            if (kVar != null) {
                kVar.h(iIntValue3);
                return;
            }
            return;
        }
        g gVarF = obj instanceof Surface ? (Surface) obj : null;
        if (gVarF == null) {
            g gVar = this.f46862O0;
            if (gVar != null) {
                gVarF = gVar;
            } else {
                V5.n nVar = this.f13090P;
                if (nVar != null && z0(nVar)) {
                    gVarF = g.f(this.f46852E0, nVar.f13066f);
                    this.f46862O0 = gVarF;
                }
            }
        }
        Surface surface = this.f46861N0;
        C0535p c0535p = this.f46854G0;
        if (surface == gVarF) {
            if (gVarF == null || gVarF == this.f46862O0) {
                return;
            }
            o oVar2 = this.f46880i1;
            if (oVar2 != null && (handler = c0535p.f4433b) != null) {
                handler.post(new ng.a(17, c0535p, oVar2));
            }
            if (this.f46863P0) {
                Surface surface2 = this.f46861N0;
                Handler handler3 = c0535p.f4433b;
                if (handler3 != null) {
                    handler3.post(new W(c0535p, surface2, SystemClock.elapsedRealtime(), 3));
                    return;
                }
                return;
            }
            return;
        }
        this.f46861N0 = gVarF;
        oVar.getClass();
        g gVar2 = gVarF instanceof g ? null : gVarF;
        if (oVar.f44086c != gVar2) {
            oVar.b();
            oVar.f44086c = gVar2;
            oVar.d(true);
        }
        this.f46863P0 = false;
        int i10 = this.f3350f;
        V5.k kVar2 = this.f13084I;
        if (kVar2 != null) {
            if (v.f46721a < 23 || gVarF == null || this.f46859L0) {
                d0();
                P();
            } else {
                kVar2.j(gVarF);
            }
        }
        if (gVarF == null || gVarF == this.f46862O0) {
            this.f46880i1 = null;
            p0();
            return;
        }
        o oVar3 = this.f46880i1;
        if (oVar3 != null && (handler2 = c0535p.f4433b) != null) {
            handler2.post(new ng.a(17, c0535p, oVar3));
        }
        p0();
        if (i10 == 2) {
            long j8 = this.f46855H0;
            this.f46869V0 = j8 > 0 ? SystemClock.elapsedRealtime() + j8 : -9223372036854775807L;
        }
    }

    @Override // E5.AbstractC0449f
    public final String f() {
        return "MediaCodecVideoRenderer";
    }

    @Override // V5.q
    public final void f0() {
        super.f0();
        this.Z0 = 0;
    }

    @Override // V5.q, E5.AbstractC0449f
    public final boolean j() {
        g gVar;
        if (super.j() && (this.f46865R0 || (((gVar = this.f46862O0) != null && this.f46861N0 == gVar) || this.f13084I == null || this.f46881j1))) {
            this.f46869V0 = -9223372036854775807L;
            return true;
        }
        if (this.f46869V0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f46869V0) {
            return true;
        }
        this.f46869V0 = -9223372036854775807L;
        return false;
    }

    @Override // V5.q
    public final boolean j0(V5.n nVar) {
        return this.f46861N0 != null || z0(nVar);
    }

    @Override // V5.q, E5.AbstractC0449f
    public final void k() {
        C0535p c0535p = this.f46854G0;
        this.f46880i1 = null;
        p0();
        this.f46863P0 = false;
        this.f46883l1 = null;
        try {
            super.k();
            H5.e eVar = this.f13139z0;
            c0535p.getClass();
            synchronized (eVar) {
            }
            Handler handler = c0535p.f4433b;
            if (handler != null) {
                handler.post(new ng.a(18, c0535p, eVar));
            }
        } catch (Throwable th) {
            c0535p.a(this.f13139z0);
            throw th;
        }
    }

    @Override // E5.AbstractC0449f
    public final void l(boolean z2, boolean z10) {
        this.f13139z0 = new H5.e(0);
        B0 b02 = this.f3347c;
        b02.getClass();
        boolean z11 = b02.f3010a;
        AbstractC4256a.i((z11 && this.f46882k1 == 0) ? false : true);
        if (this.f46881j1 != z11) {
            this.f46881j1 = z11;
            d0();
        }
        H5.e eVar = this.f13139z0;
        C0535p c0535p = this.f46854G0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new n(c0535p, eVar, 4));
        }
        this.f46866S0 = z10;
        this.f46867T0 = false;
    }

    @Override // V5.q
    public final int l0(r rVar, T t10) {
        boolean z2;
        int i5 = 0;
        if (!u6.k.i(t10.f3238l)) {
            return AbstractC0279p0.e(0, 0, 0);
        }
        boolean z10 = t10.f3241o != null;
        Context context = this.f46852E0;
        AbstractC3409K abstractC3409KS0 = s0(context, rVar, t10, z10, false);
        if (z10 && abstractC3409KS0.isEmpty()) {
            abstractC3409KS0 = s0(context, rVar, t10, false, false);
        }
        if (abstractC3409KS0.isEmpty()) {
            return AbstractC0279p0.e(1, 0, 0);
        }
        int i10 = t10.f3226E;
        if (i10 != 0 && i10 != 2) {
            return AbstractC0279p0.e(2, 0, 0);
        }
        V5.n nVar = (V5.n) abstractC3409KS0.get(0);
        boolean zC = nVar.c(t10);
        if (zC) {
            z2 = true;
        } else {
            for (int i11 = 1; i11 < abstractC3409KS0.size(); i11++) {
                V5.n nVar2 = (V5.n) abstractC3409KS0.get(i11);
                if (nVar2.c(t10)) {
                    zC = true;
                    z2 = false;
                    nVar = nVar2;
                    break;
                }
            }
            z2 = true;
        }
        int i12 = zC ? 4 : 3;
        int i13 = nVar.d(t10) ? 16 : 8;
        int i14 = nVar.f13067g ? 64 : 0;
        int i15 = z2 ? 128 : 0;
        if (v.f46721a >= 26 && "video/dolby-vision".equals(t10.f3238l) && !e.a(context)) {
            i15 = 256;
        }
        if (zC) {
            AbstractC3409K abstractC3409KS02 = s0(context, rVar, t10, z10, true);
            if (!abstractC3409KS02.isEmpty()) {
                Pattern pattern = y.f13150a;
                ArrayList arrayList = new ArrayList(abstractC3409KS02);
                Collections.sort(arrayList, new s(new S8.b(t10, 10), i5));
                V5.n nVar3 = (V5.n) arrayList.get(0);
                if (nVar3.c(t10) && nVar3.d(t10)) {
                    i5 = 32;
                }
            }
        }
        return i12 | i13 | i5 | i14 | i15;
    }

    @Override // V5.q, E5.AbstractC0449f
    public final void m(long j8, boolean z2) {
        super.m(j8, z2);
        p0();
        q2.o oVar = this.f46853F0;
        oVar.k = 0L;
        oVar.f44096n = -1L;
        oVar.f44094l = -1L;
        this.f46873a1 = -9223372036854775807L;
        this.f46868U0 = -9223372036854775807L;
        this.f46872Y0 = 0;
        if (!z2) {
            this.f46869V0 = -9223372036854775807L;
        } else {
            long j10 = this.f46855H0;
            this.f46869V0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : -9223372036854775807L;
        }
    }

    @Override // E5.AbstractC0449f
    public final void n() {
        try {
            try {
                B();
                d0();
                A.e0 e0Var = this.f13077C;
                if (e0Var != null) {
                    e0Var.y(null);
                }
                this.f13077C = null;
            } catch (Throwable th) {
                A.e0 e0Var2 = this.f13077C;
                if (e0Var2 != null) {
                    e0Var2.y(null);
                }
                this.f13077C = null;
                throw th;
            }
        } finally {
            g gVar = this.f46862O0;
            if (gVar != null) {
                if (this.f46861N0 == gVar) {
                    this.f46861N0 = null;
                }
                gVar.release();
                this.f46862O0 = null;
            }
        }
    }

    @Override // E5.AbstractC0449f
    public final void o() {
        this.f46871X0 = 0;
        this.f46870W0 = SystemClock.elapsedRealtime();
        this.f46874b1 = SystemClock.elapsedRealtime() * 1000;
        this.f46875c1 = 0L;
        this.f46876d1 = 0;
        q2.o oVar = this.f46853F0;
        oVar.f44085b = true;
        oVar.k = 0L;
        oVar.f44096n = -1L;
        oVar.f44094l = -1L;
        k kVar = (k) oVar.f44099q;
        if (kVar != null) {
            m mVar = (m) oVar.f44100r;
            mVar.getClass();
            mVar.f46893b.sendEmptyMessage(1);
            kVar.a(new C3641c(oVar, 6));
        }
        oVar.d(false);
    }

    @Override // E5.AbstractC0449f
    public final void p() {
        this.f46869V0 = -9223372036854775807L;
        u0();
        int i5 = this.f46876d1;
        if (i5 != 0) {
            long j8 = this.f46875c1;
            C0535p c0535p = this.f46854G0;
            Handler handler = c0535p.f4433b;
            if (handler != null) {
                handler.post(new n(c0535p, j8, i5));
            }
            this.f46875c1 = 0L;
            this.f46876d1 = 0;
        }
        q2.o oVar = this.f46853F0;
        oVar.f44085b = false;
        k kVar = (k) oVar.f44099q;
        if (kVar != null) {
            kVar.b();
            m mVar = (m) oVar.f44100r;
            mVar.getClass();
            mVar.f46893b.sendEmptyMessage(2);
        }
        oVar.b();
    }

    public final void p0() {
        V5.k kVar;
        this.f46865R0 = false;
        if (v.f46721a < 23 || !this.f46881j1 || (kVar = this.f13084I) == null) {
            return;
        }
        this.f46883l1 = new C3860d(this, kVar);
    }

    public final void u0() {
        if (this.f46871X0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j8 = jElapsedRealtime - this.f46870W0;
            int i5 = this.f46871X0;
            C0535p c0535p = this.f46854G0;
            Handler handler = c0535p.f4433b;
            if (handler != null) {
                handler.post(new n(c0535p, i5, j8));
            }
            this.f46871X0 = 0;
            this.f46870W0 = jElapsedRealtime;
        }
    }

    @Override // V5.q, E5.AbstractC0449f
    public final void v(float f10, float f11) throws Exception {
        super.v(f10, f11);
        q2.o oVar = this.f46853F0;
        oVar.f44090g = f10;
        oVar.k = 0L;
        oVar.f44096n = -1L;
        oVar.f44094l = -1L;
        oVar.d(false);
    }

    public final void v0() {
        this.f46867T0 = true;
        if (this.f46865R0) {
            return;
        }
        this.f46865R0 = true;
        Surface surface = this.f46861N0;
        C0535p c0535p = this.f46854G0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new W(c0535p, surface, SystemClock.elapsedRealtime(), 3));
        }
        this.f46863P0 = true;
    }

    public final void w0() {
        int i5 = this.f46877e1;
        if (i5 == -1 && this.f1 == -1) {
            return;
        }
        o oVar = this.f46880i1;
        if (oVar != null && oVar.f46899a == i5 && oVar.f46900b == this.f1 && oVar.f46901c == this.f46878g1 && oVar.f46902d == this.f46879h1) {
            return;
        }
        o oVar2 = new o(i5, this.f46879h1, this.f1, this.f46878g1);
        this.f46880i1 = oVar2;
        C0535p c0535p = this.f46854G0;
        Handler handler = c0535p.f4433b;
        if (handler != null) {
            handler.post(new ng.a(17, c0535p, oVar2));
        }
    }

    public final void x0(V5.k kVar, int i5) {
        w0();
        AbstractC4256a.b("releaseOutputBuffer");
        kVar.x(i5, true);
        AbstractC4256a.q();
        this.f46874b1 = SystemClock.elapsedRealtime() * 1000;
        this.f13139z0.f4909f++;
        this.f46872Y0 = 0;
        v0();
    }

    public final void y0(V5.k kVar, int i5, long j8) {
        w0();
        AbstractC4256a.b("releaseOutputBuffer");
        kVar.n(i5, j8);
        AbstractC4256a.q();
        this.f46874b1 = SystemClock.elapsedRealtime() * 1000;
        this.f13139z0.f4909f++;
        this.f46872Y0 = 0;
        v0();
    }

    @Override // V5.q
    public final H5.i z(V5.n nVar, T t10, T t11) {
        H5.i iVarB = nVar.b(t10, t11);
        C0522c c0522c = this.f46858K0;
        int i5 = c0522c.f4405a;
        int i10 = iVarB.f4926e;
        if (t11.f3243q > i5 || t11.f3244r > c0522c.f4406b) {
            i10 |= 256;
        }
        if (t0(nVar, t11) > this.f46858K0.f4407c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new H5.i(nVar.f13061a, t10, t11, i11 != 0 ? 0 : iVarB.f4925d, i11);
    }

    public final boolean z0(V5.n nVar) {
        if (v.f46721a < 23 || this.f46881j1 || q0(nVar.f13061a)) {
            return false;
        }
        return !nVar.f13066f || g.e(this.f46852E0);
    }
}
