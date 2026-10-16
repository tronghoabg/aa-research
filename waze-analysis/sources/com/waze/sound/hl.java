package com.waze.sound;

import android.app.Application;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MimeTypes;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import java.io.Closeable;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hl implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final Application f40151a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.b f40152b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.h.i f40153c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40154d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.ab f40155e;

    /* renamed from: f, reason: collision with root package name */
    private final fc f40156f;

    /* renamed from: g, reason: collision with root package name */
    private ExoPlayer f40157g;

    /* renamed from: h, reason: collision with root package name */
    private ha f40158h;

    /* renamed from: i, reason: collision with root package name */
    private final h.f f40159i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f40160j;

    /* renamed from: k, reason: collision with root package name */
    private final kotlinx.coroutines.b.ch f40161k;

    /* renamed from: l, reason: collision with root package name */
    private final he f40162l;

    public hl(Application application, com.waze.shared_infra.i.b bVar, com.waze.h.i iVar, com.waze.shared_infra.i.e eVar, kotlinx.coroutines.ab abVar, fc fcVar) {
        h.g.b.x.f(application, MimeTypes.BASE_TYPE_APPLICATION);
        h.g.b.x.f(bVar, "exceptionReporter");
        h.g.b.x.f(iVar, "audioAttributes");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(abVar, "mainDispatcher");
        h.g.b.x.f(fcVar, "soundOutputRoutingManager");
        this.f40151a = application;
        this.f40152b = bVar;
        this.f40153c = iVar;
        this.f40154d = eVar;
        this.f40155e = abVar;
        this.f40156f = fcVar;
        this.f40159i = h.g.a(new gv(this, 0));
        kotlinx.coroutines.b.bn bnVarB = kotlinx.coroutines.b.ck.b(com.waze.h.a.f.f24312a);
        this.f40160j = bnVarB;
        this.f40161k = kotlinx.coroutines.b.ai.U(bnVarB);
        this.f40162l = new he(this);
    }

    static final AudioManager b(hl hlVar) {
        return (AudioManager) hlVar.f40151a.getSystemService(AudioManager.class);
    }

    public static final /* synthetic */ ExoPlayer c(hl hlVar, Context context) {
        DefaultLoadControl.Builder builder = new DefaultLoadControl.Builder();
        builder.setBufferDurationsMs(500, 1000, 100, 100);
        DefaultLoadControl defaultLoadControlBuild = builder.build();
        h.g.b.x.e(defaultLoadControlBuild, "build(...)");
        ExoPlayer.Builder builder2 = new ExoPlayer.Builder(context, new hd(context, new hc(hlVar)));
        builder2.setAudioAttributes(com.waze.app_nav.hub.b.m.e(hlVar.f40153c), false);
        builder2.setLoadControl(defaultLoadControlBuild);
        ExoPlayer exoPlayerBuild = builder2.build();
        exoPlayerBuild.addListener(hlVar.f40162l);
        exoPlayerBuild.setVolume(1.0f);
        hlVar.s(exoPlayerBuild, hlVar.f40156f.c());
        h.g.b.x.e(exoPlayerBuild, "apply(...)");
        return exoPlayerBuild;
    }

    public static final /* synthetic */ ha f(hl hlVar) {
        ha haVar = new ha(hlVar, kotlinx.coroutines.bo.j());
        ha haVar2 = hlVar.f40158h;
        if (haVar2 != null) {
            haVar2.b();
        }
        hlVar.f40158h = haVar;
        hlVar.u(com.waze.h.a.h.f24314a, true);
        return haVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(com.waze.sound.hl r4, com.waze.sound.ha r5, h.c.e r6) {
        /*
            boolean r0 = r6 instanceof com.waze.sound.hb
            if (r0 == 0) goto L13
            r0 = r6
            com.waze.sound.hb r0 = (com.waze.sound.hb) r0
            int r1 = r0.f40127d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40127d = r1
            goto L18
        L13:
            com.waze.sound.hb r0 = new com.waze.sound.hb
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f40125b
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.f40127d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f40124a
            com.waze.sound.ha r5 = (com.waze.sound.ha) r5
            e.b.c.b(r6)     // Catch: java.lang.Throwable -> L2b
            goto L4a
        L2b:
            r6 = move-exception
            goto L4d
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            e.b.c.b(r6)
            r6 = r4
            com.waze.sound.hl r6 = (com.waze.sound.hl) r6     // Catch: java.lang.Throwable -> L2b
            kotlinx.coroutines.CompletableDeferred r6 = r5.a()     // Catch: java.lang.Throwable -> L2b
            r0.f40124a = r5     // Catch: java.lang.Throwable -> L2b
            r0.f40127d = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r6.c(r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L4a
            return r1
        L4a:
            com.waze.app_nav.hub.b.m r6 = (com.waze.app_nav.hub.b.m) r6     // Catch: java.lang.Throwable -> L2b
            goto L51
        L4d:
            java.lang.Object r6 = e.b.c.a(r6)
        L51:
            java.lang.Throwable r0 = h.m.c(r6)
            if (r0 == 0) goto L7f
            boolean r6 = r0 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L6b
            com.waze.sound.ha r6 = r4.f40158h
            if (r6 != r5) goto L65
            r5 = 0
            r4.f40158h = r5
            r4.r()
        L65:
            com.waze.h.a.b r5 = com.waze.h.a.b.f24308a
            r6 = r5
            com.waze.app_nav.hub.b.m r6 = (com.waze.app_nav.hub.b.m) r6
            goto L7f
        L6b:
            com.waze.shared_infra.i.e r5 = r4.f40154d
            java.lang.String r6 = "Error during playback"
            r5.c(r6, r0)
            com.waze.shared_infra.i.b r5 = r4.f40152b
            com.waze.shared_infra.h.b.f(r5, r0)
            com.waze.h.a.c r5 = new com.waze.h.a.c
            r5.<init>(r0)
            r6 = r5
            com.waze.app_nav.hub.b.m r6 = (com.waze.app_nav.hub.b.m) r6
        L7f:
            java.lang.Throwable r5 = h.m.c(r6)
            if (r5 == 0) goto L99
            com.waze.shared_infra.i.e r6 = r4.f40154d
            java.lang.String r0 = "Error during recover"
            r6.c(r0, r5)
            com.waze.shared_infra.i.b r4 = r4.f40152b
            com.waze.shared_infra.h.b.f(r4, r5)
            com.waze.h.a.c r4 = new com.waze.h.a.c
            r4.<init>(r5)
            com.waze.app_nav.hub.b.m r4 = (com.waze.app_nav.hub.b.m) r4
            return r4
        L99:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.sound.hl.g(com.waze.sound.hl, com.waze.sound.ha, h.c.e):java.lang.Object");
    }

    public static final /* synthetic */ Object h(hl hlVar, ExoPlayer exoPlayer, h.c.e eVar) {
        Object objCollect = hlVar.f40156f.a().collect(new hh(hlVar, exoPlayer, 2), eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : h.ab.f48028a;
    }

    private final Object q(gz gzVar, h.c.e eVar) {
        return kotlinx.coroutines.aj.v(this.f40155e, new hj(this, gzVar, null), eVar);
    }

    private final void r() {
        ExoPlayer exoPlayer = this.f40157g;
        if (exoPlayer != null) {
            exoPlayer.stop();
        }
        u(com.waze.h.a.f.f24312a, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(ExoPlayer exoPlayer, boolean z) {
        AudioDeviceInfo audioDeviceInfo = null;
        if (!z) {
            exoPlayer.setPreferredAudioDevice(null);
            return;
        }
        AudioDeviceInfo[] devices = ((AudioManager) this.f40159i.getValue()).getDevices(2);
        h.g.b.x.e(devices, "getDevices(...)");
        AudioDeviceInfo[] audioDeviceInfoArr = devices;
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            AudioDeviceInfo audioDeviceInfo2 = audioDeviceInfoArr[i2];
            if (audioDeviceInfo2.getType() == 2) {
                audioDeviceInfo = audioDeviceInfo2;
                break;
            }
            i2++;
        }
        exoPlayer.setPreferredAudioDevice(audioDeviceInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(com.waze.app_nav.hub.b.m mVar) {
        ha haVar = this.f40158h;
        if (haVar == null) {
            return;
        }
        this.f40158h = null;
        com.waze.shared_infra.i.e eVar = this.f40154d;
        Objects.toString(mVar);
        eVar.a("stopPlayback: result=".concat(mVar.toString()));
        r();
        eVar.a("stopPlayback: resuming deferred");
        haVar.a().a(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(com.waze.i.a aVar, boolean z) {
        Object objD;
        kotlinx.coroutines.b.bn bnVar = this.f40160j;
        if (h.g.b.x.n(aVar, bnVar.d())) {
            return;
        }
        if (z) {
            this.f40154d.a("setStateTo : " + bnVar.d() + " -> " + aVar);
        }
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, aVar));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f40154d.a("close");
        t(com.waze.h.a.b.f24308a);
        ExoPlayer exoPlayer = this.f40157g;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this.f40162l);
        }
        ExoPlayer exoPlayer2 = this.f40157g;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        this.f40157g = null;
    }

    public final Object i(String str, h.c.e eVar) {
        this.f40154d.a("play: filePath=".concat(str));
        final MediaItem mediaItemFromUri = MediaItem.fromUri(str);
        h.g.b.x.e(mediaItemFromUri, "fromUri(...)");
        return q(new gz() { // from class: com.waze.sound.gw
            @Override // com.waze.sound.gz
            public final void a(kotlinx.coroutines.af afVar, ExoPlayer exoPlayer) {
                h.g.b.x.f(afVar, "$this$play");
                h.g.b.x.f(exoPlayer, "activePlayer");
                exoPlayer.setMediaItem(mediaItemFromUri);
            }
        }, eVar);
    }

    public final Object j(final kotlinx.coroutines.b.k kVar, h.c.e eVar) {
        this.f40154d.a("play: audio flow");
        final gu guVar = new gu();
        final ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new gt(guVar)).createMediaSource(MediaItem.fromUri(Uri.EMPTY));
        h.g.b.x.e(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
        return q(new gz() { // from class: com.waze.sound.gx
            @Override // com.waze.sound.gz
            public final void a(kotlinx.coroutines.af afVar, ExoPlayer exoPlayer) {
                h.g.b.x.f(afVar, "$this$play");
                h.g.b.x.f(exoPlayer, "activePlayer");
                exoPlayer.setMediaSource(progressiveMediaSourceCreateMediaSource);
                kotlinx.coroutines.aj.z(afVar, null, null, new hk(this, kVar, guVar, (h.c.e) null, 0), 3);
            }
        }, eVar);
    }

    public final kotlinx.coroutines.b.ch k() {
        return this.f40161k;
    }
}
