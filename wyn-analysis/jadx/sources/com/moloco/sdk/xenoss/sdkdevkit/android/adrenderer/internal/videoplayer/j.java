package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import A7.V1;
import E5.C0446d0;
import E5.C0447e;
import E5.C0469t;
import E5.E0;
import E5.I;
import E5.P;
import E5.q0;
import Ef.H;
import Ef.H0;
import Ef.S;
import Hf.Z;
import Hf.k0;
import Hf.x0;
import android.content.Context;
import android.media.AudioTrack;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.view.InflateException;
import android.view.Surface;
import android.view.View;
import androidx.lifecycle.AbstractC1451o;
import ba.C1521a;
import com.moloco.sdk.internal.MolocoLogger;
import com.unity3d.services.UnityAdsConstants;
import f6.AbstractC2588a;
import f6.C2600m;
import h6.C2784c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3409K;
import l8.e0;
import s6.C;
import t6.C4136d;
import t6.InterfaceC4137e;
import t6.p;
import u6.AbstractC4256a;
import u6.s;
import u6.v;

/* loaded from: classes4.dex */
public final class j implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f32231a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32232b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o f32233c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f32234d;

    /* renamed from: e, reason: collision with root package name */
    public final Kd.a f32235e;

    /* renamed from: f, reason: collision with root package name */
    public final x0 f32236f;

    /* renamed from: g, reason: collision with root package name */
    public final x0 f32237g;

    /* renamed from: h, reason: collision with root package name */
    public final x0 f32238h;

    /* renamed from: i, reason: collision with root package name */
    public final x0 f32239i;

    /* renamed from: j, reason: collision with root package name */
    public final x0 f32240j;
    public final x0 k;

    /* renamed from: l, reason: collision with root package name */
    public final C f32241l;

    /* renamed from: m, reason: collision with root package name */
    public String f32242m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f32243n;

    /* renamed from: o, reason: collision with root package name */
    public final Looper f32244o;

    /* renamed from: p, reason: collision with root package name */
    public I f32245p;

    /* renamed from: q, reason: collision with root package name */
    public d f32246q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f32247r;

    /* renamed from: s, reason: collision with root package name */
    public final h f32248s;

    /* renamed from: t, reason: collision with root package name */
    public final C1521a f32249t;

    /* renamed from: u, reason: collision with root package name */
    public long f32250u;

    /* renamed from: v, reason: collision with root package name */
    public H0 f32251v;

    public j(Context context, boolean z2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o mediaCacheRepository, AbstractC1451o lifecycle, com.moloco.sdk.acm.recorder.c cVar) {
        C c10;
        int i5 = 0;
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(mediaCacheRepository, "mediaCacheRepository");
        AbstractC3340k.e(lifecycle, "lifecycle");
        this.f32231a = context;
        this.f32232b = z2;
        this.f32233c = mediaCacheRepository;
        this.f32234d = cVar;
        Lf.e eVar = S.f3698a;
        this.f32235e = H.c(Jf.n.f6132a);
        x0 x0VarC = k0.c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m.f32073a);
        this.f32236f = x0VarC;
        this.f32237g = x0VarC;
        x0 x0VarC2 = k0.c(new a(false, true, true));
        this.f32238h = x0VarC2;
        this.f32239i = x0VarC2;
        x0 x0VarC3 = k0.c(null);
        this.f32240j = x0VarC3;
        this.k = x0VarC3;
        try {
            c10 = new C(context);
            c10.setUseController(false);
        } catch (InflateException e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "ExoPlayerView could not be instantiated.", e7, false, 8, null);
            x0 x0Var = this.f32240j;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f30172b;
            x0Var.getClass();
            x0Var.k(null, lVar);
            c10 = null;
        }
        this.f32241l = c10;
        this.f32244o = Looper.getMainLooper();
        k0.u(new Z(this.f32239i, new e(this, null), i5), this.f32235e);
        this.f32248s = new h(this);
        this.f32249t = new C1521a(lifecycle, new S8.d(0, this, j.class, "initOrResumeExoPlayer", "initOrResumeExoPlayer()V", 0, 21), new S8.d(0, this, j.class, "disposeExoPlayer", "disposeExoPlayer()V", 0, 22));
    }

    public static void b(I i5, boolean z2) {
        float f10 = z2 ? 0.0f : 1.0f;
        i5.Q0();
        float fG = v.g(f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        if (i5.f3073b0 == fG) {
            return;
        }
        i5.f3073b0 = fG;
        i5.F0(1, 2, Float.valueOf(i5.f3046A.f3314e * fG));
        i5.f3091l.p(22, new C0469t(fG, 0));
    }

    public final void a(I i5, String str) {
        if (str == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "URI Source is empty", null, false, 12, null);
            return;
        }
        try {
            if (this.f32232b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Streaming is enabled", null, false, 12, null);
                AbstractC2588a abstractC2588aA = new C2600m(new aa.f(8, str, this), new J5.i()).a(C0446d0.a(str));
                i5.Q0();
                List listSingletonList = Collections.singletonList(abstractC2588aA);
                i5.Q0();
                i5.G0(listSingletonList);
            } else {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Streaming is disabled", null, false, 12, null);
                C0446d0 c0446d0A = C0446d0.a(str);
                i5.getClass();
                e0 e0VarN = AbstractC3409K.n(c0446d0A);
                i5.Q0();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < e0VarN.f40103d; i10++) {
                    arrayList.add(i5.f3097q.a((C0446d0) e0VarN.get(i10)));
                }
                i5.G0(arrayList);
            }
            i5.B0();
        } catch (Exception e7) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "ExoPlayer setMediaItem exception", e7, false, 8, null);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f30173c;
            x0 x0Var = this.f32240j;
            x0Var.getClass();
            x0Var.k(null, lVar);
        }
    }

    public final void c() {
        String str;
        AudioTrack audioTrack;
        int i5 = 4;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "Disposing exo player", null, false, 12, null);
        C c10 = this.f32241l;
        if (c10 != null) {
            View view = c10.f45056d;
            if (view instanceof GLSurfaceView) {
                ((GLSurfaceView) view).onPause();
            }
            c10.setPlayer(null);
        }
        I i10 = this.f32245p;
        long jR0 = i10 != null ? i10.r0() : 0L;
        I i11 = this.f32245p;
        boolean z2 = jR0 - (i11 != null ? i11.m0() : 0L) > 0;
        I i12 = this.f32245p;
        if (i12 != null) {
            this.f32250u = i12.m0();
            i12.C0(this.f32248s);
            StringBuilder sb2 = new StringBuilder("Release ");
            sb2.append(Integer.toHexString(System.identityHashCode(i12)));
            sb2.append(" [ExoPlayerLib/2.18.2] [");
            sb2.append(v.f46725e);
            sb2.append("] [");
            HashSet hashSet = P.f3188a;
            synchronized (P.class) {
                str = P.f3189b;
            }
            sb2.append(str);
            sb2.append("]");
            AbstractC4256a.u("ExoPlayerImpl", sb2.toString());
            i12.Q0();
            if (v.f46721a < 21 && (audioTrack = i12.f3061Q) != null) {
                audioTrack.release();
                i12.f3061Q = null;
            }
            i12.f3106z.l();
            E0 e02 = i12.f3047B;
            V1 v1 = e02.f3026e;
            if (v1 != null) {
                try {
                    e02.f3022a.unregisterReceiver(v1);
                } catch (RuntimeException e7) {
                    AbstractC4256a.D(e7, "StreamVolumeManager", "Error unregistering stream volume receiver");
                }
                e02.f3026e = null;
            }
            i12.f3048C.getClass();
            i12.f3049D.getClass();
            C0447e c0447e = i12.f3046A;
            c0447e.f3312c = null;
            c0447e.a();
            if (!i12.k.x()) {
                i12.f3091l.p(10, new A5.f(i5));
            }
            K8.H h10 = i12.f3091l;
            CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) h10.f6586e;
            Iterator it = copyOnWriteArraySet.iterator();
            while (it.hasNext()) {
                u6.i iVar = (u6.i) it.next();
                iVar.f46681d = true;
                if (iVar.f46680c) {
                    iVar.f46680c = false;
                    ((u6.h) h10.f6585d).a(iVar.f46678a, iVar.f46679b.c());
                }
            }
            copyOnWriteArraySet.clear();
            h10.f6582a = true;
            i12.f3086i.f46716a.removeCallbacksAndMessages(null);
            InterfaceC4137e interfaceC4137e = i12.f3100t;
            F5.f fVar = i12.f3098r;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) ((p) interfaceC4137e).f45895b.f17156b;
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                C4136d c4136d = (C4136d) it2.next();
                if (c4136d.f45860b == fVar) {
                    c4136d.f45861c = true;
                    copyOnWriteArrayList.remove(c4136d);
                }
            }
            q0 q0VarF = i12.f3089j0.f(1);
            i12.f3089j0 = q0VarF;
            q0 q0VarA = q0VarF.a(q0VarF.f3500b);
            i12.f3089j0 = q0VarA;
            q0VarA.f3513p = q0VarA.f3515r;
            i12.f3089j0.f3514q = 0L;
            F5.f fVar2 = i12.f3098r;
            s sVar = fVar2.f3898h;
            AbstractC4256a.j(sVar);
            sVar.f46716a.post(new C8.g(fVar2, i5));
            i12.f3084h.a();
            i12.D0();
            Surface surface = i12.f3063S;
            if (surface != null) {
                surface.release();
                i12.f3063S = null;
            }
            i12.f3077d0 = C2784c.f36184b;
        }
        this.f32245p = null;
        x0 x0Var = this.f32238h;
        a aVar = new a(false, false, z2);
        x0Var.getClass();
        x0Var.k(null, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        H.j(this.f32235e, null);
        this.f32249t.destroy();
        c();
    }
}
