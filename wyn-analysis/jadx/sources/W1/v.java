package W1;

import A7.V1;
import J9.C0656o;
import N1.C0754c;
import N1.C0755d;
import N1.C0765n;
import N1.F;
import U1.C0835e;
import U1.C0840j;
import U1.C0851v;
import U1.D;
import U1.Y;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.core.device.MimeTypes;
import j$.util.Objects;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v extends d2.q implements D {

    /* renamed from: C0, reason: collision with root package name */
    public final Context f15100C0;

    /* renamed from: D0, reason: collision with root package name */
    public final S3.s f15101D0;

    /* renamed from: E0, reason: collision with root package name */
    public final t f15102E0;

    /* renamed from: F0, reason: collision with root package name */
    public final Dd.c f15103F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f15104G0;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f15105H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f15106I0;

    /* renamed from: J0, reason: collision with root package name */
    public C0765n f15107J0;

    /* renamed from: K0, reason: collision with root package name */
    public C0765n f15108K0;

    /* renamed from: L0, reason: collision with root package name */
    public long f15109L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f15110M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f15111N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f15112O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f15113P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, d2.i iVar, Handler handler, U1.r rVar, t tVar) {
        super(1, iVar, 44100.0f);
        Dd.c cVar = Q1.x.f9724a >= 35 ? new Dd.c(22) : null;
        this.f15100C0 = context.getApplicationContext();
        this.f15102E0 = tVar;
        this.f15103F0 = cVar;
        this.f15113P0 = -1000;
        this.f15101D0 = new S3.s(27, handler, rVar);
        tVar.f15089r = new xa.d(this, 24);
    }

    @Override // d2.q
    public final boolean B0(C0765n c0765n) {
        Y y10 = this.f12033d;
        y10.getClass();
        if (y10.f12014a != 0) {
            int iG0 = G0(c0765n);
            if ((iG0 & 512) != 0) {
                Y y11 = this.f12033d;
                y11.getClass();
                if (y11.f12014a == 2 || (iG0 & Segment.SHARE_MINIMUM) != 0 || (c0765n.f8213F == 0 && c0765n.f8214G == 0)) {
                    return true;
                }
            }
        }
        return this.f15102E0.i(c0765n) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ac  */
    @Override // d2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int C0(d2.h r17, N1.C0765n r18) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.v.C0(d2.h, N1.n):int");
    }

    @Override // d2.q, U1.AbstractC0834d
    public final void D() {
        S3.s sVar = this.f15101D0;
        this.f15111N0 = true;
        this.f15107J0 = null;
        try {
            this.f15102E0.g();
            try {
                super.D();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.D();
                throw th;
            } finally {
            }
        }
    }

    @Override // U1.AbstractC0834d
    public final void E(boolean z2, boolean z10) throws IllegalStateException {
        H5.e eVar = new H5.e(1);
        this.f34065x0 = eVar;
        S3.s sVar = this.f15101D0;
        Handler handler = (Handler) sVar.f11009b;
        if (handler != null) {
            handler.post(new f(sVar, eVar, 0));
        }
        Y y10 = this.f12033d;
        y10.getClass();
        boolean z11 = y10.f12015b;
        t tVar = this.f15102E0;
        if (z11) {
            Q1.k.g(tVar.f15060W);
            if (!tVar.f15065a0) {
                tVar.f15065a0 = true;
                tVar.g();
            }
        } else if (tVar.f15065a0) {
            tVar.f15065a0 = false;
            tVar.g();
        }
        V1.k kVar = this.f12035f;
        kVar.getClass();
        tVar.f15088q = kVar;
        Q1.q qVar = this.f12036g;
        qVar.getClass();
        tVar.f15076g.f14987I = qVar;
    }

    @Override // d2.q, U1.AbstractC0834d
    public final void F(long j8, boolean z2) throws IllegalStateException {
        super.F(j8, z2);
        this.f15102E0.g();
        this.f15109L0 = j8;
        this.f15112O0 = false;
        this.f15110M0 = true;
    }

    @Override // U1.AbstractC0834d
    public final void G() {
        Dd.c cVar;
        c cVar2;
        C0656o c0656o = this.f15102E0.f15095x;
        if (c0656o != null && c0656o.f5961a) {
            c0656o.f5968h = null;
            int i5 = Q1.x.f9724a;
            Context context = (Context) c0656o.f5962b;
            if (i5 >= 23 && (cVar2 = (c) c0656o.f5965e) != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(cVar2);
            }
            context.unregisterReceiver((V1) c0656o.f5966f);
            d dVar = (d) c0656o.f5967g;
            if (dVar != null) {
                dVar.f14951a.unregisterContentObserver(dVar);
            }
            c0656o.f5961a = false;
        }
        if (Q1.x.f9724a < 35 || (cVar = this.f15103F0) == null) {
            return;
        }
        ((HashSet) cVar.f2642b).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) cVar.f2644d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public final int G0(C0765n c0765n) {
        e eVarH = this.f15102E0.h(c0765n);
        if (!eVarH.f14955a) {
            return 0;
        }
        int i5 = eVarH.f14956b ? 1536 : 512;
        return eVarH.f14957c ? i5 | 2048 : i5;
    }

    @Override // U1.AbstractC0834d
    public final void H() throws IllegalStateException {
        t tVar = this.f15102E0;
        this.f15112O0 = false;
        try {
            try {
                P();
                t0();
                S3.l lVar = this.f34015E;
                if (lVar != null) {
                    lVar.s(null);
                }
                this.f34015E = null;
            } catch (Throwable th) {
                S3.l lVar2 = this.f34015E;
                if (lVar2 != null) {
                    lVar2.s(null);
                }
                this.f34015E = null;
                throw th;
            }
        } finally {
            if (this.f15111N0) {
                this.f15111N0 = false;
                tVar.u();
            }
        }
    }

    public final int H0(d2.m mVar, C0765n c0765n) {
        int i5;
        if (!"OMX.google.raw.decoder".equals(mVar.f33992a) || (i5 = Q1.x.f9724a) >= 24 || (i5 == 23 && Q1.x.I(this.f15100C0))) {
            return c0765n.f8233o;
        }
        return -1;
    }

    @Override // U1.AbstractC0834d
    public final void I() throws IllegalStateException {
        this.f15102E0.r();
    }

    public final void I0() {
        long jMax;
        ArrayDeque arrayDeque;
        long j8;
        boolean zB = b();
        t tVar = this.f15102E0;
        if (!tVar.o() || tVar.f15050M) {
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(tVar.f15076g.a(zB), Q1.x.Q(tVar.f15091t.f15019e, tVar.k()));
            while (true) {
                arrayDeque = tVar.f15078h;
                if (arrayDeque.isEmpty() || jMin < ((o) arrayDeque.getFirst()).f15028c) {
                    break;
                } else {
                    tVar.f15040B = (o) arrayDeque.remove();
                }
            }
            o oVar = tVar.f15040B;
            long jS = jMin - oVar.f15028c;
            long jW = Q1.x.w(jS, oVar.f15026a.f8032a);
            boolean zIsEmpty = arrayDeque.isEmpty();
            b7.k kVar = tVar.f15066b;
            if (zIsEmpty) {
                O1.g gVar = (O1.g) kVar.f19398d;
                if (gVar.isActive()) {
                    if (gVar.f8848o >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
                        long j10 = gVar.f8847n;
                        gVar.f8844j.getClass();
                        long j11 = j10 - ((r12.k * r12.f8815b) * 2);
                        int i5 = gVar.f8842h.f8802a;
                        int i10 = gVar.f8841g.f8802a;
                        jS = i5 == i10 ? Q1.x.S(jS, j11, gVar.f8848o, RoundingMode.DOWN) : Q1.x.S(jS, j11 * i5, gVar.f8848o * i10, RoundingMode.DOWN);
                    } else {
                        jS = (long) (gVar.f8837c * jS);
                    }
                }
                o oVar2 = tVar.f15040B;
                j8 = oVar2.f15027b + jS;
                oVar2.f15029d = jS - jW;
            } else {
                o oVar3 = tVar.f15040B;
                j8 = oVar3.f15027b + jW + oVar3.f15029d;
            }
            long j12 = ((x) kVar.f19397c).f15126q;
            jMax = Q1.x.Q(tVar.f15091t.f15019e, j12) + j8;
            long j13 = tVar.f15077g0;
            if (j12 > j13) {
                long jQ = Q1.x.Q(tVar.f15091t.f15019e, j12 - j13);
                tVar.f15077g0 = j12;
                tVar.f15079h0 += jQ;
                if (tVar.f15081i0 == null) {
                    tVar.f15081i0 = new Handler(Looper.myLooper());
                }
                tVar.f15081i0.removeCallbacksAndMessages(null);
                tVar.f15081i0.postDelayed(new C8.g(tVar, 17), 100L);
            }
        }
        if (jMax != Long.MIN_VALUE) {
            if (!this.f15110M0) {
                jMax = Math.max(this.f15109L0, jMax);
            }
            this.f15109L0 = jMax;
            this.f15110M0 = false;
        }
    }

    @Override // U1.AbstractC0834d
    public final void J() throws IllegalStateException {
        I0();
        t tVar = this.f15102E0;
        tVar.f15059V = false;
        if (tVar.o()) {
            l lVar = tVar.f15076g;
            lVar.d();
            if (lVar.f15010x == -9223372036854775807L) {
                G5.v vVar = lVar.f14992e;
                vVar.getClass();
                vVar.a();
            } else {
                lVar.f15012z = lVar.b();
                if (!t.p(tVar.f15093v)) {
                    return;
                }
            }
            tVar.f15093v.pause();
        }
    }

    @Override // d2.q
    public final C0835e N(d2.m mVar, C0765n c0765n, C0765n c0765n2) {
        C0835e c0835eB = mVar.b(c0765n, c0765n2);
        boolean z2 = this.f34015E == null && B0(c0765n2);
        int i5 = c0835eB.f12050e;
        if (z2) {
            i5 |= 32768;
        }
        if (H0(mVar, c0765n2) > this.f15104G0) {
            i5 |= 64;
        }
        int i10 = i5;
        return new C0835e(mVar.f33992a, c0765n, c0765n2, i10 == 0 ? c0835eB.f12049d : 0, i10);
    }

    @Override // d2.q
    public final float Y(float f10, C0765n[] c0765nArr) {
        int iMax = -1;
        for (C0765n c0765n : c0765nArr) {
            int i5 = c0765n.f8211D;
            if (i5 != -1) {
                iMax = Math.max(iMax, i5);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // d2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList Z(d2.h r5, N1.C0765n r6, boolean r7) {
        /*
            r4 = this;
            r0 = 1
            java.lang.String r1 = r6.f8232n
            if (r1 != 0) goto L8
            l8.e0 r5 = l8.e0.f40101e
            goto L30
        L8:
            W1.t r1 = r4.f15102E0
            int r1 = r1.i(r6)
            r2 = 0
            if (r1 == 0) goto L2c
            java.lang.String r1 = "audio/raw"
            java.util.List r1 = d2.v.e(r1, r2, r2)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L1f
            r1 = 0
            goto L25
        L1f:
            java.lang.Object r1 = r1.get(r2)
            d2.m r1 = (d2.m) r1
        L25:
            if (r1 == 0) goto L2c
            l8.e0 r5 = l8.AbstractC3409K.n(r1)
            goto L30
        L2c:
            l8.e0 r5 = d2.v.g(r5, r6, r7, r2)
        L30:
            java.util.HashMap r7 = d2.v.f34073a
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r5)
            com.unity3d.services.core.webview.b r5 = new com.unity3d.services.core.webview.b
            r5.<init>(r6, r0)
            V5.s r6 = new V5.s
            r6.<init>(r5, r0)
            java.util.Collections.sort(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.v.Z(d2.h, N1.n, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d4  */
    @Override // d2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final C6.l a0(d2.m r12, N1.C0765n r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.v.a0(d2.m, N1.n, android.media.MediaCrypto, float):C6.l");
    }

    @Override // U1.AbstractC0834d, U1.W
    public final boolean b() {
        if (!this.f34058t0) {
            return false;
        }
        t tVar = this.f15102E0;
        if (tVar.o()) {
            return tVar.f15056S && !tVar.m();
        }
        return true;
    }

    @Override // d2.q
    public final void b0(T1.d dVar) {
        C0765n c0765n;
        n nVar;
        if (Q1.x.f9724a < 29 || (c0765n = dVar.f11356c) == null || !Objects.equals(c0765n.f8232n, "audio/opus") || !this.f34042g0) {
            return;
        }
        ByteBuffer byteBuffer = dVar.f11361h;
        byteBuffer.getClass();
        C0765n c0765n2 = dVar.f11356c;
        c0765n2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i5 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            t tVar = this.f15102E0;
            AudioTrack audioTrack = tVar.f15093v;
            if (audioTrack == null || !t.p(audioTrack) || (nVar = tVar.f15091t) == null || !nVar.k) {
                return;
            }
            tVar.f15093v.setOffloadDelayPadding(c0765n2.f8213F, i5);
        }
    }

    @Override // U1.AbstractC0834d, U1.S
    public final void c(int i5, Object obj) throws IllegalStateException {
        Y9.c cVar;
        Dd.c cVar2;
        t tVar = this.f15102E0;
        if (i5 == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (tVar.f15052O != fFloatValue) {
                tVar.f15052O = fFloatValue;
                if (tVar.o()) {
                    tVar.f15093v.setVolume(tVar.f15052O);
                    return;
                }
                return;
            }
            return;
        }
        if (i5 == 3) {
            C0754c c0754c = (C0754c) obj;
            c0754c.getClass();
            if (tVar.f15097z.equals(c0754c)) {
                return;
            }
            tVar.f15097z = c0754c;
            if (tVar.f15065a0) {
                return;
            }
            C0656o c0656o = tVar.f15095x;
            if (c0656o != null) {
                c0656o.f5970j = c0754c;
                c0656o.g(b.b((Context) c0656o.f5962b, c0754c, (Y9.c) c0656o.f5969i));
            }
            tVar.g();
            return;
        }
        if (i5 == 6) {
            C0755d c0755d = (C0755d) obj;
            c0755d.getClass();
            if (tVar.f15062Y.equals(c0755d)) {
                return;
            }
            if (tVar.f15093v != null) {
                tVar.f15062Y.getClass();
            }
            tVar.f15062Y = c0755d;
            return;
        }
        if (i5 == 12) {
            if (Q1.x.f9724a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    cVar = null;
                } else {
                    tVar.getClass();
                    cVar = new Y9.c(audioDeviceInfo, 24);
                }
                tVar.f15063Z = cVar;
                C0656o c0656o2 = tVar.f15095x;
                if (c0656o2 != null) {
                    c0656o2.h(audioDeviceInfo);
                }
                AudioTrack audioTrack = tVar.f15093v;
                if (audioTrack != null) {
                    Y9.c cVar3 = tVar.f15063Z;
                    audioTrack.setPreferredDevice(cVar3 != null ? (AudioDeviceInfo) cVar3.f16739b : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i5 == 16) {
            obj.getClass();
            this.f15113P0 = ((Integer) obj).intValue();
            d2.j jVar = this.f34021K;
            if (jVar != null && Q1.x.f9724a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.f15113P0));
                jVar.c(bundle);
                return;
            }
            return;
        }
        if (i5 == 9) {
            obj.getClass();
            tVar.f15042D = ((Boolean) obj).booleanValue();
            o oVar = new o(tVar.x() ? F.f8031d : tVar.f15041C, -9223372036854775807L, -9223372036854775807L);
            if (tVar.o()) {
                tVar.f15039A = oVar;
                return;
            } else {
                tVar.f15040B = oVar;
                return;
            }
        }
        if (i5 != 10) {
            if (i5 == 11) {
                this.f34016F = (C0851v) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int iIntValue = ((Integer) obj).intValue();
        if (tVar.f15061X != iIntValue) {
            tVar.f15061X = iIntValue;
            tVar.f15060W = iIntValue != 0;
            tVar.g();
        }
        if (Q1.x.f9724a < 35 || (cVar2 = this.f15103F0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) cVar2.f2644d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            cVar2.f2644d = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(iIntValue, p8.n.f43298a, new d2.g(cVar2));
        cVar2.f2644d = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) cVar2.f2642b).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // U1.D
    /* renamed from: e */
    public final F mo3e() {
        return this.f15102E0.f15041C;
    }

    @Override // U1.D, u6.j
    public final long g() {
        if (this.f12037h == 2) {
            I0();
        }
        return this.f15109L0;
    }

    @Override // d2.q
    public final void g0(Exception exc) {
        Q1.k.l("MediaCodecAudioRenderer", "Audio codec error", exc);
        S3.s sVar = this.f15101D0;
        Handler handler = (Handler) sVar.f11009b;
        if (handler != null) {
            handler.post(new f(sVar, exc, 3));
        }
    }

    @Override // U1.W, U1.X
    public final String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // d2.q
    public final void h0(long j8, long j10, String str) {
        S3.s sVar = this.f15101D0;
        Handler handler = (Handler) sVar.f11009b;
        if (handler != null) {
            handler.post(new f(sVar, str, j8, j10));
        }
    }

    @Override // d2.q
    public final void i0(String str) {
        S3.s sVar = this.f15101D0;
        Handler handler = (Handler) sVar.f11009b;
        if (handler != null) {
            handler.post(new f(sVar, str, 7));
        }
    }

    @Override // d2.q, U1.W
    public final boolean isReady() {
        return this.f15102E0.m() || super.isReady();
    }

    @Override // d2.q
    public final C0835e j0(S3.c cVar) {
        C0765n c0765n = (C0765n) cVar.f10937c;
        c0765n.getClass();
        this.f15107J0 = c0765n;
        C0835e c0835eJ0 = super.j0(cVar);
        S3.s sVar = this.f15101D0;
        Handler handler = (Handler) sVar.f11009b;
        if (handler != null) {
            handler.post(new f(sVar, c0765n, c0835eJ0));
        }
        return c0835eJ0;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0104 A[Catch: h -> 0x0102, TryCatch #0 {h -> 0x0102, blocks: (B:42:0x00d9, B:45:0x00e1, B:47:0x00e5, B:49:0x00ee, B:53:0x00fc, B:56:0x0104, B:60:0x010b, B:61:0x0110), top: B:65:0x00d9 }] */
    @Override // d2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k0(N1.C0765n r14, android.media.MediaFormat r15) throws U1.C0840j {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.v.k0(N1.n, android.media.MediaFormat):void");
    }

    @Override // d2.q
    public final void l0() {
        this.f15102E0.getClass();
    }

    @Override // U1.D
    public final boolean n() {
        boolean z2 = this.f15112O0;
        this.f15112O0 = false;
        return z2;
    }

    @Override // d2.q
    public final void n0() {
        this.f15102E0.L = true;
    }

    @Override // U1.D
    public final void q(F f10) {
        t tVar = this.f15102E0;
        tVar.getClass();
        tVar.f15041C = new F(Q1.x.h(f10.f8032a, 0.1f, 8.0f), Q1.x.h(f10.f8033b, 0.1f, 8.0f));
        if (tVar.x()) {
            tVar.v();
            return;
        }
        o oVar = new o(f10, -9223372036854775807L, -9223372036854775807L);
        if (tVar.o()) {
            tVar.f15039A = oVar;
        } else {
            tVar.f15040B = oVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    @Override // d2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r0(long r1, long r3, d2.j r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, long r10, boolean r12, boolean r13, N1.C0765n r14) throws U1.C0840j {
        /*
            r0 = this;
            r6.getClass()
            N1.n r1 = r0.f15108K0
            r2 = 1
            if (r1 == 0) goto L13
            r1 = r8 & 2
            if (r1 == 0) goto L13
            r5.getClass()
            r5.G(r7)
            return r2
        L13:
            W1.t r1 = r0.f15102E0
            if (r12 == 0) goto L26
            if (r5 == 0) goto L1c
            r5.G(r7)
        L1c:
            H5.e r3 = r0.f34065x0
            int r4 = r3.f4910g
            int r4 = r4 + r9
            r3.f4910g = r4
            r1.L = r2
            return r2
        L26:
            boolean r1 = r1.l(r10, r9, r6)     // Catch: W1.j -> L3b W1.i -> L55
            if (r1 == 0) goto L39
            if (r5 == 0) goto L31
            r5.G(r7)
        L31:
            H5.e r1 = r0.f34065x0
            int r3 = r1.f4909f
            int r3 = r3 + r9
            r1.f4909f = r3
            return r2
        L39:
            r1 = 0
            return r1
        L3b:
            r1 = move-exception
            boolean r2 = r0.f34042g0
            if (r2 == 0) goto L4c
            U1.Y r2 = r0.f12033d
            r2.getClass()
            int r2 = r2.f12014a
            if (r2 == 0) goto L4c
            r2 = 5003(0x138b, float:7.01E-42)
            goto L4e
        L4c:
            r2 = 5002(0x138a, float:7.009E-42)
        L4e:
            boolean r3 = r1.f14970b
            U1.j r1 = r0.C(r1, r14, r3, r2)
            throw r1
        L55:
            r1 = move-exception
            N1.n r2 = r0.f15107J0
            boolean r3 = r0.f34042g0
            if (r3 == 0) goto L68
            U1.Y r3 = r0.f12033d
            r3.getClass()
            int r3 = r3.f12014a
            if (r3 == 0) goto L68
            r3 = 5004(0x138c, float:7.012E-42)
            goto L6a
        L68:
            r3 = 5001(0x1389, float:7.008E-42)
        L6a:
            boolean r4 = r1.f14968b
            U1.j r1 = r0.C(r1, r2, r4, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.v.r0(long, long, d2.j, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, N1.n):boolean");
    }

    @Override // d2.q
    public final void u0() throws IllegalStateException, C0840j {
        try {
            t tVar = this.f15102E0;
            if (!tVar.f15056S && tVar.o() && tVar.f()) {
                tVar.s();
                tVar.f15056S = true;
            }
        } catch (j e7) {
            throw C(e7, e7.f14971c, e7.f14970b, this.f34042g0 ? 5003 : 5002);
        }
    }

    @Override // U1.AbstractC0834d, U1.W
    public final D B() {
        return this;
    }
}
