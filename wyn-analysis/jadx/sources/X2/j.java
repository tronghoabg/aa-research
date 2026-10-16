package X2;

import A.AbstractC0213f;
import A.d0;
import A7.C0252g0;
import E4.F;
import E5.Q;
import Ef.H;
import Hf.Z;
import Hf.e0;
import Hf.k0;
import Hf.n0;
import Hf.v0;
import Hf.x0;
import J9.C0665y;
import N1.Y;
import P2.l;
import Va.M6;
import Y2.B;
import a2.C1323c;
import a2.v;
import a9.C1341a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.Surface;
import androidx.fragment.app.X;
import b2.p;
import c7.C1566b;
import c7.C1568d;
import c7.ExecutorC1572h;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzga;
import com.google.android.gms.internal.play_billing.zzge;
import com.google.android.gms.internal.play_billing.zzgt;
import com.google.android.gms.internal.play_billing.zzgu;
import com.google.android.gms.internal.play_billing.zzhd;
import com.google.android.gms.internal.play_billing.zzhe;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.C1913b;
import com.moloco.sdk.internal.r;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.AbstractC1983b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1999j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.A;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.D;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.z;
import com.wynauto.wyn.R;
import f4.C2556c;
import f4.C2557d;
import f4.C2559f;
import f4.InterfaceC2561h;
import f4.InterfaceC2562i;
import h6.C2783b;
import h6.InterfaceC2787f;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import ka.C3258n1;
import kc.x;
import kotlin.jvm.internal.AbstractC3340k;
import me.C3558a;
import ne.C3618a;
import o1.C3641c;
import o2.o;
import p7.AbstractC3772b;
import p9.u;
import q2.C3860d;
import q5.C3868c;
import q5.InterfaceC3871f;
import r5.C3924a;
import r9.InterfaceC3940A;
import r9.InterfaceC3944a;
import r9.InterfaceC3949f;
import r9.K;
import s8.q;
import s9.m;
import t5.C4123r;
import tc.C4155a;
import u6.AbstractC4256a;

/* loaded from: classes.dex */
public final class j implements l, s2.g, p, Continuation, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g, d2.j, InterfaceC2561h, OnCompleteListener, x, InterfaceC2787f, o4.f, InterfaceC3940A, InterfaceC3944a {

    /* renamed from: d, reason: collision with root package name */
    public static j f16073d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16074a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16075b;

    /* renamed from: c, reason: collision with root package name */
    public Object f16076c;

    public /* synthetic */ j(int i5, Object obj, Object obj2) {
        this.f16074a = i5;
        this.f16075b = obj;
        this.f16076c = obj2;
    }

    @Override // r9.InterfaceC3944a
    public o9.j A(String str) {
        C3618a c3618aG0 = ((K) this.f16075b).g0("SELECT read_time_seconds, read_time_nanos, bundled_query_proto FROM named_queries WHERE name = ?");
        c3618aG0.b(str);
        return (o9.j) c3618aG0.e(new aa.f(23, this, str));
    }

    @Override // r9.InterfaceC3940A
    public s9.k B(s9.h hVar) {
        s9.k kVar = (s9.k) ((c9.c) this.f16075b).b(hVar);
        return kVar != null ? kVar.f() : s9.k.g(hVar);
    }

    @Override // r9.InterfaceC3940A
    public HashMap C(u uVar, s9.b bVar, Set set, R1.i iVar) {
        HashMap map = new HashMap();
        m mVar = uVar.f43415f;
        Iterator itH = ((c9.c) this.f16075b).h(new s9.h((m) mVar.a("")));
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            s9.k kVar = (s9.k) entry.getValue();
            s9.h hVar = (s9.h) entry.getKey();
            if (!mVar.i(hVar.f45375a)) {
                break;
            }
            if (hVar.f45375a.f45369a.size() <= mVar.f45369a.size() + 1 && s9.b.b(kVar).compareTo(bVar) > 0) {
                s9.h hVar2 = kVar.f45380a;
                if (set.contains(hVar2) || uVar.g(kVar)) {
                    map.put(hVar2, kVar.f());
                }
            }
        }
        return map;
    }

    @Override // b2.p
    public o D() {
        return new B(13, ((X) this.f16075b).D(), (List) this.f16076c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x03a6, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0123, code lost:
    
        r3 = r5;
        r1 = 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    @Override // P2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void E(byte[] r20, int r21, int r22, P2.k r23, Q1.c r24) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.j.E(byte[], int, int, P2.k, Q1.c):void");
    }

    @Override // r9.InterfaceC3940A
    public void F(s9.k kVar, s9.o oVar) {
        A6.c.z(((InterfaceC3949f) this.f16076c) != null, "setIndexManager() not called", new Object[0]);
        A6.c.z(!oVar.equals(s9.o.f45389b), "Cannot add document to the RemoteDocumentCache with a read time of zero", new Object[0]);
        c9.c cVar = (c9.c) this.f16075b;
        s9.k kVarF = kVar.f();
        kVarF.f45383d = oVar;
        s9.h hVar = kVar.f45380a;
        this.f16075b = cVar.g(hVar, kVarF);
        ((InterfaceC3949f) this.f16076c).u(hVar.d());
    }

    @Override // d2.j
    public void G(int i5) {
        ((MediaCodec) this.f16075b).releaseOutputBuffer(i5, false);
    }

    @Override // P2.l
    public /* synthetic */ P2.d H(int i5, int i10, byte[] bArr) {
        return N0.a.a(this, bArr, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118 A[EDGE_INSN: B:68:0x0118->B:52:0x0118 BREAK  A[LOOP:1: B:38:0x00df->B:51:0x0107], SYNTHETIC] */
    @Override // s2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public s2.f I(s2.j r17, long r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X2.j.I(s2.j, long):s2.f");
    }

    @Override // d2.j
    public /* synthetic */ boolean J(v vVar) {
        return false;
    }

    @Override // r9.InterfaceC3940A
    public void K(InterfaceC3949f interfaceC3949f) {
        this.f16076c = interfaceC3949f;
    }

    @Override // d2.j
    public void L(C3860d c3860d, Handler handler) {
        ((MediaCodec) this.f16075b).setOnFrameRenderedListener(new V5.a(this, c3860d, 3), handler);
    }

    @Override // r9.InterfaceC3944a
    public void M(o9.j jVar) {
        o9.i iVar = jVar.f41459b;
        C3258n1 c3258n1J = ((v9.o) ((v) this.f16076c).f17322b).j(iVar.f41456a);
        ja.b bVarH = ja.d.h();
        bVarH.a(AbstractC0213f.b(iVar.f41457b, 1) ? ja.c.FIRST : ja.c.LAST);
        bVarH.b(c3258n1J.e());
        bVarH.c(c3258n1J.f());
        ja.d dVar = (ja.d) bVarH.build();
        q qVar = jVar.f41460c.f45390a;
        ((K) this.f16075b).f0("INSERT OR REPLACE INTO named_queries (name, read_time_seconds, read_time_nanos, bundled_query_proto) VALUES (?, ?, ?, ?)", jVar.f41458a, Long.valueOf(qVar.f45352a), Integer.valueOf(qVar.f45353b), dVar.toByteArray());
    }

    @Override // b2.p
    public o N(b2.l lVar, b2.i iVar) {
        ((X) this.f16075b).getClass();
        return new B(13, new b2.o(lVar, iVar), (List) this.f16076c);
    }

    @Override // f4.InterfaceC2561h
    public void O(C2556c c2556c, Bitmap bitmap, Map map) {
        int iT = AbstractC3772b.t(bitmap);
        C0252g0 c0252g0 = (C0252g0) this.f16076c;
        if (iT <= c0252g0.maxSize()) {
            c0252g0.put(c2556c, new C2559f(bitmap, map, iT));
        } else {
            c0252g0.remove(c2556c);
            ((InterfaceC2562i) this.f16075b).r(c2556c, bitmap, map, iT);
        }
    }

    @Override // P2.l
    public int P() {
        return 1;
    }

    @Override // r9.InterfaceC3944a
    public void Q(o9.e eVar) {
        Integer numValueOf = Integer.valueOf(eVar.f41440b);
        q qVar = eVar.f41441c.f45390a;
        ((K) this.f16075b).f0("INSERT OR REPLACE INTO bundles (bundle_id, schema_version, create_time_seconds, create_time_nanos, total_documents, total_bytes) VALUES (?, ?, ?, ?, ?, ?)", eVar.f41439a, numValueOf, Long.valueOf(qVar.f45352a), Integer.valueOf(qVar.f45353b), Integer.valueOf(eVar.f41442d), Long.valueOf(eVar.f41443e));
    }

    public void R(r internalError) {
        AbstractC3340k.e(internalError, "internalError");
        ((C1913b) this.f16075b).a(internalError);
    }

    public void S(H5.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f16075b;
        if (handler != null) {
            handler.post(new ng.a(10, this, eVar));
        }
    }

    public String T(String str) {
        String str2 = (String) this.f16076c;
        Resources resources = (Resources) this.f16075b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void U(String str, String str2) {
        int i5 = 0;
        d0 d0Var = (d0) this.f16076c;
        d0Var.getClass();
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i11 = 0; i11 < length2; i11++) {
            char cCharAt2 = str2.charAt(i11);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i11), str2));
            }
        }
        while (true) {
            ArrayList arrayList = d0Var.f140a;
            if (i5 >= arrayList.size()) {
                arrayList.add(str);
                arrayList.add(str2.trim());
                return;
            } else {
                if (str.equalsIgnoreCase((String) arrayList.get(i5))) {
                    arrayList.remove(i5);
                    arrayList.remove(i5);
                    i5 -= 2;
                }
                i5 += 2;
            }
        }
    }

    public void V(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        ((C1913b) this.f16075b).c(molocoAd);
    }

    public void W(MolocoAd molocoAd) {
        AbstractC3340k.e(molocoAd, "molocoAd");
        ((C1913b) this.f16075b).d(molocoAd);
    }

    public void X(h1.g gVar) {
        int i5 = gVar.f35953b;
        Y4.g gVar2 = (Y4.g) this.f16076c;
        v vVar = (v) this.f16075b;
        if (i5 != 0) {
            gVar2.execute(new R3.c(vVar, i5, 3));
        } else {
            gVar2.execute(new L7.b(18, vVar, gVar.f35952a));
        }
    }

    public void Y(Y y10) {
        Handler handler = (Handler) this.f16075b;
        if (handler != null) {
            handler.post(new ng.a(8, this, y10));
        }
    }

    public void Z(zzga zzgaVar) {
        if (zzgaVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn((zzgu) this.f16075b);
            zzhdVarZzy.zzl(zzgaVar);
            ((F) this.f16076c).x((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void a() {
        switch (this.f16074a) {
            case 10:
                ((C1913b) this.f16075b).getClass();
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "InternalAdShowListenerImpl", "onCloseOrSkipButtonShown triggered in InternalAdShowListenerImpl", false, 4, null);
                break;
            case 11:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.f16075b;
                if (gVar != null) {
                    gVar.a();
                    break;
                }
                break;
            default:
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebviewAd", "Ad load successful, start collecting playlist item displaying events", null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c) this.f16075b;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.i iVar = cVar.f30576c;
                com.bumptech.glide.f mraidCommunicationHub = cVar.f30575b;
                iVar.getClass();
                AbstractC3340k.e(mraidCommunicationHub, "mraidCommunicationHub");
                H.D(iVar.f30728d, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.h(iVar, mraidCommunicationHub, null), 3);
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.f16076c).a();
                break;
        }
    }

    public void a0(zzga zzgaVar, int i5) {
        try {
            zzgt zzgtVar = (zzgt) ((zzgu) this.f16075b).zzi();
            zzgtVar.zzl(i5);
            this.f16075b = (zzgu) zzgtVar.zzf();
            Z(zzgaVar);
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // f4.InterfaceC2561h
    public void b(int i5) {
        C0252g0 c0252g0 = (C0252g0) this.f16076c;
        if (i5 >= 40) {
            c0252g0.evictAll();
        } else {
            if (10 > i5 || i5 >= 20) {
                return;
            }
            c0252g0.trimToSize(c0252g0.size() / 2);
        }
    }

    public void b0(zzge zzgeVar) {
        if (zzgeVar == null) {
            return;
        }
        try {
            zzhd zzhdVarZzy = zzhe.zzy();
            zzhdVarZzy.zzn((zzgu) this.f16075b);
            zzhdVarZzy.zzm(zzgeVar);
            ((F) this.f16076c).x((zzhe) zzhdVarZzy.zzf());
        } catch (Throwable th) {
            zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // d2.j
    public void c(Bundle bundle) {
        ((MediaCodec) this.f16075b).setParameters(bundle);
    }

    @Override // d2.j
    public void d(int i5, int i10, long j8, int i11) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f16075b).queueInputBuffer(i5, 0, i10, j8, i11);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
        switch (this.f16074a) {
            case 11:
                AbstractC3340k.e(internalError, "internalError");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.f16075b).e(internalError);
                break;
            default:
                AbstractC3340k.e(internalError, "internalError");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.f16076c).e(internalError);
                break;
        }
    }

    @Override // d2.j
    public MediaFormat f() {
        return ((MediaCodec) this.f16075b).getOutputFormat();
    }

    @Override // d2.j
    public void flush() {
        ((MediaCodec) this.f16075b).flush();
    }

    @Override // h6.InterfaceC2787f
    public List g(long j8) {
        C2783b c2783b;
        int iE = u6.v.e((long[]) this.f16076c, j8, false);
        return (iE == -1 || (c2783b = ((C2783b[]) this.f16075b)[iE]) == C2783b.f36166r) ? Collections.EMPTY_LIST : Collections.singletonList(c2783b);
    }

    @Override // d2.j
    public void h(int i5) {
        ((MediaCodec) this.f16075b).setVideoScalingMode(i5);
    }

    @Override // d2.j
    public ByteBuffer i(int i5) {
        return ((MediaCodec) this.f16075b).getInputBuffer(i5);
    }

    @Override // d2.j
    public void j(Surface surface) {
        ((MediaCodec) this.f16075b).setOutputSurface(surface);
    }

    @Override // h6.InterfaceC2787f
    public long k(int i5) {
        AbstractC4256a.e(i5 >= 0);
        long[] jArr = (long[]) this.f16076c;
        AbstractC4256a.e(i5 < jArr.length);
        return jArr[i5];
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public v0 l() {
        D d3 = (D) ((x0) this.f16075b).getValue();
        if (d3 instanceof z) {
            return (e0) ((z) d3).f31664a.f31691h.f2940d;
        }
        if (d3 instanceof A) {
            return (e0) ((A) d3).f31602a.f31972d.f2940d;
        }
        if (d3 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.B) {
            return (x0) ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.B) d3).f31603a.f32050y.f10162f;
        }
        if (d3 instanceof C) {
            return ((C) d3).f31604a.l();
        }
        if (d3 == null) {
            return (x0) this.f16076c;
        }
        throw new Q((byte) 0, 9);
    }

    @Override // f4.InterfaceC2561h
    public C2557d m(C2556c c2556c) {
        C2559f c2559f = (C2559f) ((C0252g0) this.f16076c).get(c2556c);
        if (c2559f != null) {
            return new C2557d(c2559f.f34815a, c2559f.f34816b);
        }
        return null;
    }

    @Override // d2.j
    public void n(int i5, long j8) {
        ((MediaCodec) this.f16075b).releaseOutputBuffer(i5, j8);
    }

    @Override // d2.j
    public int o() {
        return ((MediaCodec) this.f16075b).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        i8.d dVar = (i8.d) this.f16075b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f16076c;
        synchronized (dVar.f36897f) {
            dVar.f36896e.remove(taskCompletionSource);
        }
    }

    @Override // h6.InterfaceC2787f
    public int p() {
        return ((long[]) this.f16076c).length;
    }

    @Override // d2.j
    public int q(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f16075b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // d2.j
    public ByteBuffer r(int i5) {
        return ((MediaCodec) this.f16075b).getOutputBuffer(i5);
    }

    @Override // d2.j
    public void release() {
        Dd.c cVar = (Dd.c) this.f16076c;
        MediaCodec mediaCodec = (MediaCodec) this.f16075b;
        try {
            int i5 = Q1.x.f9724a;
            if (i5 >= 30 && i5 < 33) {
                mediaCodec.stop();
            }
            if (i5 >= 35 && cVar != null) {
                cVar.P(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th) {
            if (Q1.x.f9724a >= 35 && cVar != null) {
                cVar.P(mediaCodec);
            }
            mediaCodec.release();
            throw th;
        }
    }

    @Override // P2.l
    public /* synthetic */ void reset() {
    }

    @Override // s2.g
    public void s() {
        byte[] bArr = Q1.x.f9729f;
        Q1.o oVar = (Q1.o) this.f16075b;
        oVar.getClass();
        oVar.E(bArr.length, bArr);
    }

    @Override // kc.x
    public void t(KeyEvent keyEvent, F f10) {
        int action = keyEvent.getAction();
        if (action != 0 && action != 1) {
            f10.k(false);
            return;
        }
        Character chB = ((R1.i) this.f16076c).b(keyEvent.getUnicodeChar());
        boolean z2 = action != 0;
        com.unity3d.services.core.webview.b bVar = new com.unity3d.services.core.webview.b(f10, 12);
        C4155a c4155a = (C4155a) this.f16075b;
        HashMap map = new HashMap();
        map.put("type", z2 ? "keyup" : "keydown");
        map.put("keymap", "android");
        map.put("flags", Integer.valueOf(keyEvent.getFlags()));
        map.put("plainCodePoint", Integer.valueOf(keyEvent.getUnicodeChar(0)));
        map.put("codePoint", Integer.valueOf(keyEvent.getUnicodeChar()));
        map.put("keyCode", Integer.valueOf(keyEvent.getKeyCode()));
        map.put("scanCode", Integer.valueOf(keyEvent.getScanCode()));
        map.put("metaState", Integer.valueOf(keyEvent.getMetaState()));
        map.put("character", chB.toString());
        map.put("source", Integer.valueOf(keyEvent.getSource()));
        map.put("deviceId", Integer.valueOf(keyEvent.getDeviceId()));
        map.put("repeatCount", Integer.valueOf(keyEvent.getRepeatCount()));
        c4155a.f45973a.m(map, new C3641c(bVar, 5));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Bundle bundle;
        C1566b c1566b = (C1566b) this.f16075b;
        c1566b.getClass();
        return (task.isSuccessful() && (bundle = (Bundle) task.getResult()) != null && bundle.containsKey("google.messenger")) ? c1566b.a((Bundle) this.f16076c).onSuccessTask(ExecutorC1572h.f19689c, C1568d.f19684d) : task;
    }

    @Override // r9.InterfaceC3944a
    public o9.e u(String str) {
        C3618a c3618aG0 = ((K) this.f16075b).g0("SELECT schema_version, create_time_seconds, create_time_nanos, total_documents,  total_bytes FROM bundles WHERE bundle_id = ?");
        c3618aG0.b(str);
        return (o9.e) c3618aG0.e(new C0665y(str, 5));
    }

    @Override // d2.j
    public void v() {
        ((MediaCodec) this.f16075b).detachOutputSurface();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public void w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar) {
        switch (this.f16074a) {
            case 11:
                C1999j0 c1999j0 = (C1999j0) this.f16076c;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l creativeType = c1999j0.getCreativeType();
                int i5 = creativeType == null ? -1 : AbstractC1983b0.f30055a[creativeType.ordinal()];
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.f16075b;
                switch (i5) {
                    case -1:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, c1999j0.f30207p, "creativeType is null", new Throwable(), false, 8, null);
                        return;
                    case 0:
                    default:
                        throw new Q((byte) 0, 9);
                    case 1:
                        gVar.w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f30094g);
                        return;
                    case 2:
                        gVar.w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f30095h);
                        return;
                    case 3:
                        gVar.w(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f30096i);
                        return;
                    case 4:
                    case 5:
                    case 6:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, c1999j0.f30207p, "Template creative types should not be used with AggregatedBanner. Use TemplateBannerView instead.", null, false, 12, null);
                        return;
                    case 7:
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, c1999j0.f30207p, "Unknown creative type for timeout error", null, false, 12, null);
                        return;
                }
            default:
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g) this.f16076c).w(aVar);
                return;
        }
    }

    @Override // r9.InterfaceC3940A
    public Map x(String str, s9.b bVar, int i5) {
        throw new UnsupportedOperationException("getAll(String, IndexOffset, int) is not supported.");
    }

    @Override // r9.InterfaceC3940A
    public HashMap y(Iterable iterable) {
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            s9.h hVar = (s9.h) it.next();
            map.put(hVar, B(hVar));
        }
        return map;
    }

    @Override // r9.InterfaceC3940A
    public void z(ArrayList arrayList) {
        A6.c.z(((InterfaceC3949f) this.f16076c) != null, "setIndexManager() not called", new Object[0]);
        c9.c cVarG = s9.g.f45372a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            s9.h hVar = (s9.h) it.next();
            this.f16075b = ((c9.c) this.f16075b).i(hVar);
            cVarG = cVarG.g(hVar, s9.k.h(hVar, s9.o.f45389b));
        }
        ((InterfaceC3949f) this.f16076c).n(cVarG);
    }

    public /* synthetic */ j(int i5, boolean z2) {
        this.f16074a = i5;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i5) {
        this.f16074a = i5;
        this.f16075b = obj2;
        this.f16076c = obj3;
    }

    public j(x0 x0Var, Kd.a aVar) {
        this.f16074a = 13;
        this.f16075b = x0Var;
        k0.x(new Z(x0Var, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.e(2, null), 0), aVar, n0.f5168a, null);
        this.f16076c = k0.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e.f31979a);
    }

    public j(Context context) {
        this.f16074a = 8;
        AbstractC1732v.i(context);
        Resources resources = context.getResources();
        this.f16075b = resources;
        this.f16076c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    @Override // h6.InterfaceC2787f
    public int a(long j8) {
        long[] jArr = (long[]) this.f16076c;
        int iB = u6.v.b(jArr, j8, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public j(Context context, zzgu zzguVar) {
        this.f16074a = 23;
        F f10 = new F(13);
        try {
            C4123r.b(context);
            f10.f2854c = C4123r.a().c(C3924a.f44362e).a("PLAY_BILLING_LIBRARY", new C3868c("proto"), new InterfaceC3871f() { // from class: com.android.billingclient.api.zzci
                @Override // q5.InterfaceC3871f, k8.InterfaceC3199h
                public final Object apply(Object obj) {
                    return ((zzhe) obj).zzc();
                }
            });
        } catch (Throwable unused) {
            f10.f2853b = true;
        }
        this.f16076c = f10;
        this.f16075b = zzguVar;
    }

    @Override // d2.j
    public void l(int i5, H5.c cVar, long j8, int i10) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f16075b).queueSecureInputBuffer(i5, 0, cVar.f4902i, j8, i10);
    }

    public j(com.moloco.sdk.internal.services.k timeProviderService, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.c httpClient) {
        this.f16074a = 9;
        AbstractC3340k.e(timeProviderService, "timeProviderService");
        AbstractC3340k.e(httpClient, "httpClient");
        this.f16075b = timeProviderService;
        this.f16076c = httpClient;
    }

    public j(AdShowListener adShowListener, com.moloco.sdk.internal.services.u uVar, com.moloco.sdk.internal.services.events.c cVar, com.moloco.sdk.internal.publisher.d0 d0Var, com.moloco.sdk.internal.publisher.d0 d0Var2, AdFormatType adFormatType, com.moloco.sdk.acm.recorder.c cVar2, com.moloco.sdk.internal.publisher.d0 d0Var3) {
        this.f16074a = 10;
        AbstractC3340k.e(adShowListener, "adShowListener");
        AbstractC3340k.e(adFormatType, "adFormatType");
        this.f16075b = tg.b.a(adShowListener, uVar, cVar, d0Var, d0Var2, adFormatType, cVar2, d0Var3, 608);
        this.f16076c = adShowListener;
    }

    public j(C1341a c1341a, C1323c c1323c, C3618a c3618a, C3558a c3558a, j jVar, W9.u uVar) {
        this.f16074a = 19;
        this.f16075b = c3558a;
        this.f16076c = uVar;
    }

    public j(C4155a c4155a) {
        this.f16074a = 20;
        this.f16076c = new R1.i();
        this.f16075b = c4155a;
    }

    public j(md.k0 k0Var, Object obj) {
        this.f16074a = 21;
        Fe.e.t(k0Var, "status");
        this.f16075b = k0Var;
        this.f16076c = obj;
    }

    public j(O9.b bVar) {
        this.f16074a = 4;
        this.f16076c = M6.v();
        this.f16075b = bVar;
    }

    public j(int i5, InterfaceC2562i interfaceC2562i) {
        this.f16074a = 15;
        this.f16075b = interfaceC2562i;
        this.f16076c = new C0252g0(i5, this);
    }

    public j(int i5) {
        this.f16074a = i5;
        switch (i5) {
            case 2:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f16075b = byteArrayOutputStream;
                this.f16076c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.f16075b = new Q1.o();
                this.f16076c = new b();
                break;
        }
    }

    public j(Q1.u uVar) {
        this.f16074a = 1;
        this.f16076c = uVar;
        this.f16075b = new Q1.o();
    }

    public j(MediaCodec mediaCodec, Dd.c cVar) {
        this.f16074a = 14;
        this.f16075b = mediaCodec;
        this.f16076c = cVar;
        if (Q1.x.f9724a < 35 || cVar == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) cVar.f2644d;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            Q1.k.g(((HashSet) cVar.f2642b).add(mediaCodec));
        }
    }
}
