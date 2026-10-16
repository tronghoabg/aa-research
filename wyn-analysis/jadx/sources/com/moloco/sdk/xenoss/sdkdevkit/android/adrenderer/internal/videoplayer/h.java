package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import A7.AbstractC0279p0;
import E5.C0446d0;
import E5.C0450f0;
import E5.C0464n;
import E5.C0465o;
import E5.I;
import E5.L0;
import E5.Q;
import E5.r0;
import E5.s0;
import E5.t0;
import E5.u0;
import E5.v0;
import Hf.x0;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p;
import h6.C2784c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r6.r;

/* loaded from: classes4.dex */
public final class h implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f32228a;

    public h(j jVar) {
        this.f32228a = jVar;
    }

    @Override // E5.u0
    public final /* synthetic */ void B() {
    }

    @Override // E5.u0
    public final /* synthetic */ void E(C0446d0 c0446d0, int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void F(C2784c c2784c) {
    }

    @Override // E5.u0
    public final /* synthetic */ void G(C0465o c0465o) {
    }

    @Override // E5.u0
    public final /* synthetic */ void I(C0450f0 c0450f0) {
    }

    @Override // E5.u0
    public final /* synthetic */ void a(int i5) {
    }

    @Override // E5.u0
    public final void b(int i5) {
        String strValueOf = i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? String.valueOf(i5) : "ENDED" : "READY" : "BUFFERING" : "IDLE";
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        j jVar = this.f32228a;
        jVar.getClass();
        StringBuilder sb2 = new StringBuilder("onPlaybackStateChanged: ");
        sb2.append(strValueOf);
        sb2.append(" pos=");
        I i10 = jVar.f32245p;
        sb2.append(i10 != null ? Long.valueOf(i10.m0()) : null);
        sb2.append(" dur=");
        I i11 = jVar.f32245p;
        sb2.append(i11 != null ? Long.valueOf(i11.r0()) : null);
        MolocoLogger.info$default(molocoLogger, "SimplifiedExoPlayer", sb2.toString(), null, false, 12, null);
        if (i5 == 4) {
            I i12 = jVar.f32245p;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l lVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l(i12 != null ? i12.r0() : 1L);
            x0 x0Var = jVar.f32236f;
            x0Var.getClass();
            x0Var.k(null, lVar);
            jVar.f32247r = false;
            jVar.f32250u = 0L;
        }
    }

    @Override // E5.u0
    public final /* synthetic */ void c(boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void d(int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void e(boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void f(List list) {
    }

    @Override // E5.u0
    public final /* synthetic */ void g(int i5, int i10) {
    }

    @Override // E5.u0
    public final /* synthetic */ void h(boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void i(int i5, boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void j(float f10) {
    }

    @Override // E5.u0
    public final /* synthetic */ void k(int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void l(int i5, boolean z2) {
    }

    @Override // E5.u0
    public final void m(boolean z2) {
        j jVar = this.f32228a;
        I i5 = jVar.f32245p;
        long jR0 = i5 != null ? i5.r0() : 0L;
        I i10 = jVar.f32245p;
        boolean z10 = jR0 - (i10 != null ? i10.m0() : 0L) > 0;
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "SimplifiedExoPlayer", "onIsPlayingChanged hasMore= " + z10, null, false, 12, null);
        a aVar = new a(z2, true, z10);
        x0 x0Var = jVar.f32238h;
        x0Var.getClass();
        x0Var.k(null, aVar);
    }

    @Override // E5.u0
    public final /* synthetic */ void n(t0 t0Var) {
    }

    @Override // E5.u0
    public final /* synthetic */ void p(v0 v0Var, v0 v0Var2, int i5) {
    }

    @Override // E5.u0
    public final /* synthetic */ void q(s0 s0Var) {
    }

    @Override // E5.u0
    public final /* synthetic */ void r(r0 r0Var) {
    }

    @Override // E5.u0
    public final /* synthetic */ void s(C0464n c0464n) {
    }

    @Override // E5.u0
    public final /* synthetic */ void t(int i5, boolean z2) {
    }

    @Override // E5.u0
    public final /* synthetic */ void u(L0 l02) {
    }

    @Override // E5.u0
    public final /* synthetic */ void v(r rVar) {
    }

    @Override // E5.u0
    public final void w() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        j jVar = this.f32228a;
        jVar.getClass();
        StringBuilder sb2 = new StringBuilder("onRenderedFirstFrame pos=");
        I i5 = jVar.f32245p;
        sb2.append(i5 != null ? Long.valueOf(i5.m0()) : null);
        MolocoLogger.info$default(molocoLogger, "SimplifiedExoPlayer", sb2.toString(), null, false, 12, null);
    }

    @Override // E5.u0
    public final /* synthetic */ void x(v6.o oVar) {
    }

    @Override // E5.u0
    public final void y(C0465o error) {
        String str;
        String str2;
        d dVar;
        AbstractC3340k.e(error, "error");
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        j jVar = this.f32228a;
        jVar.getClass();
        StringBuilder sb2 = new StringBuilder("Exoplayer error (streaming enabled = ");
        boolean z2 = jVar.f32232b;
        MolocoLogger.error$default(molocoLogger, "SimplifiedExoPlayer", AbstractC0279p0.p(sb2, z2, ')'), error, false, 8, null);
        com.moloco.sdk.acm.recorder.c cVar = jVar.f32234d;
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        com.moloco.sdk.acm.h hVar = new com.moloco.sdk.acm.h("exoplayer_error");
        int i5 = error.f3483a;
        hVar.a("error_code", String.valueOf(i5));
        if (i5 == 5001) {
            str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
        } else if (i5 != 5002) {
            switch (i5) {
                case 1000:
                    str = "ERROR_CODE_UNSPECIFIED";
                    break;
                case 1001:
                    str = "ERROR_CODE_REMOTE_ERROR";
                    break;
                case BackupConstant.SCENE_BACKUP_RENDER_FAIL /* 1002 */:
                    str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    break;
                case BackupConstant.SCENE_CLOSED_WITHOUT_SHOW /* 1003 */:
                    str = "ERROR_CODE_TIMEOUT";
                    break;
                case 1004:
                    str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    break;
                default:
                    switch (i5) {
                        case 2000:
                            str = "ERROR_CODE_IO_UNSPECIFIED";
                            break;
                        case 2001:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            break;
                        case 2002:
                            str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            break;
                        case 2003:
                            str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            break;
                        case 2004:
                            str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            break;
                        case 2005:
                            str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                            break;
                        case 2006:
                            str = "ERROR_CODE_IO_NO_PERMISSION";
                            break;
                        case 2007:
                            str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            break;
                        case 2008:
                            str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            break;
                        default:
                            switch (i5) {
                                case 3001:
                                    str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    break;
                                case 3002:
                                    str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    break;
                                case BANNER_AUTO_REDIRECT_NOT_OVERRIDE_URL_VALUE:
                                    str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    break;
                                case INLINE_INSTALL_STATUS_VALUE:
                                    str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    break;
                                default:
                                    switch (i5) {
                                        case 4001:
                                            str = "ERROR_CODE_DECODER_INIT_FAILED";
                                            break;
                                        case 4002:
                                            str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                            break;
                                        case 4003:
                                            str = "ERROR_CODE_DECODING_FAILED";
                                            break;
                                        case 4004:
                                            str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            break;
                                        case 4005:
                                            str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            break;
                                        default:
                                            switch (i5) {
                                                case 6000:
                                                    str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                    break;
                                                case 6001:
                                                    str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                    break;
                                                case 6002:
                                                    str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                    break;
                                                case 6003:
                                                    str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                    break;
                                                case 6004:
                                                    str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                    break;
                                                case 6005:
                                                    str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                    break;
                                                case 6006:
                                                    str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                    break;
                                                case 6007:
                                                    str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                    break;
                                                case 6008:
                                                    str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                    break;
                                                default:
                                                    if (i5 < 1000000) {
                                                        str = "invalid error code";
                                                        break;
                                                    } else {
                                                        str = "custom error code";
                                                        break;
                                                    }
                                            }
                                    }
                            }
                    }
            }
        } else {
            str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        hVar.a("error_code_name", str);
        d dVar2 = jVar.f32246q;
        hVar.a("has_streaming_error", String.valueOf(dVar2 != null && dVar2.f32220f));
        x0 x0Var = jVar.f32236f;
        p pVar = (p) x0Var.getValue();
        if (pVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m) {
            str2 = "not_available";
        } else if (pVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) {
            str2 = "preparing";
        } else if (pVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n) {
            str2 = "position";
        } else {
            if (!(pVar instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l)) {
                throw new Q((byte) 0, 9);
            }
            str2 = "finished";
        }
        hVar.a("playback_progress", str2);
        cVar.a(hVar);
        if (z2 && (dVar = jVar.f32246q) != null && dVar.f32220f) {
            p pVar2 = (p) x0Var.getValue();
            if ((pVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l) || (pVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n)) {
                MolocoLogger.info$default(molocoLogger, "SimplifiedExoPlayer", "Ignoring exoplayer streaming error as the user has viewed some of the ad already", null, false, 12, null);
                return;
            } else {
                if (!(pVar2 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o) && !AbstractC3340k.a(pVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.m.f32073a)) {
                    throw new Q((byte) 0, 9);
                }
                MolocoLogger.info$default(molocoLogger, "SimplifiedExoPlayer", "Exoplayer streaming failed before any playback started, so report that as error", null, false, 12, null);
            }
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l lVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f30171a;
        x0 x0Var2 = jVar.f32240j;
        x0Var2.getClass();
        x0Var2.k(null, lVar);
    }

    @Override // E5.u0
    public final /* synthetic */ void z(W5.c cVar) {
    }
}
