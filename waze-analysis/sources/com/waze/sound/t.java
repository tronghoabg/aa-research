package com.waze.sound;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.core.content.ContextCompat;
import com.waze.gw.AudioMixPolicy;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class t implements p, com.waze.ifs.ui.y {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.h.i f40417a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f40418b;

    /* renamed from: c, reason: collision with root package name */
    private final fc f40419c;

    /* renamed from: d, reason: collision with root package name */
    private final AudioManager f40420d;

    /* renamed from: e, reason: collision with root package name */
    private final int f40421e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.b.bn f40422f;

    /* renamed from: g, reason: collision with root package name */
    private final AudioManager.OnAudioFocusChangeListener f40423g;

    public t(Context context, com.waze.ifs.ui.z zVar, com.waze.h.i iVar, com.waze.shared_infra.i.e eVar, fc fcVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(zVar, "shutdownManager");
        h.g.b.x.f(iVar, "audioAttributes");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(fcVar, "soundOutputRoutingManager");
        this.f40417a = iVar;
        this.f40418b = eVar;
        this.f40419c = fcVar;
        Object systemService = ContextCompat.getSystemService(context, AudioManager.class);
        if (systemService == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AudioManager audioManager = (AudioManager) systemService;
        this.f40420d = audioManager;
        this.f40421e = audioManager.getMode();
        this.f40422f = kotlinx.coroutines.b.ck.b(s.f40416a);
        this.f40423g = new AudioManager.OnAudioFocusChangeListener() { // from class: com.waze.sound.q
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i2) {
                t.c(this.f40414a, i2);
            }
        };
        zVar.b(this);
    }

    static final void c(t tVar, int i2) {
        if (i2 > 0) {
            tVar.f40418b.a("Audio focus is lost. State: " + i2);
            return;
        }
        if ((i2 & 1) > 0) {
            tVar.f40418b.a("Audio focus is gained. State: " + i2);
            return;
        }
        tVar.f40418b.a("Audio focus unknown state: " + i2);
    }

    private final void d() {
        this.f40420d.setMode(this.f40421e);
    }

    @Override // com.waze.sound.p
    public final void a() {
        Object objD;
        kotlinx.coroutines.b.bn bnVar = this.f40422f;
        com.waze.sharedrive.a.s sVar = (com.waze.sharedrive.a.s) bnVar.d();
        s sVar2 = s.f40416a;
        if (h.g.b.x.n(sVar, sVar2)) {
            return;
        }
        if (!(sVar instanceof r)) {
            throw new h.i();
        }
        int iAbandonAudioFocusRequest = this.f40420d.abandonAudioFocusRequest(((r) sVar).l());
        this.f40418b.a("Audio focus is abandoned with state: " + iAbandonAudioFocusRequest);
        d();
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, sVar2));
    }

    @Override // com.waze.sound.p
    public final boolean b() {
        Object objD;
        Object objD2;
        if (AudioMixPolicy.shouldBypassWazeAudioFocus() || AudioMixPolicy.consumeWazeTtsFocusBypass()) {
            return true;
        }
        kotlinx.coroutines.b.bn bnVar = this.f40422f;
        if (bnVar.d() instanceof r) {
            return true;
        }
        boolean zC = this.f40419c.c();
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(3).setAudioAttributes(com.waze.app_nav.hub.b.m.d(this.f40417a)).setOnAudioFocusChangeListener(this.f40423g).build();
        h.g.b.x.e(audioFocusRequestBuild, "build(...)");
        int iRequestAudioFocus = this.f40420d.requestAudioFocus(audioFocusRequestBuild);
        com.waze.shared_infra.i.e eVar = this.f40418b;
        if (iRequestAudioFocus == 1) {
            eVar.a("Audio focus is granted");
            do {
                objD2 = bnVar.d();
            } while (!bnVar.f(objD2, new r(audioFocusRequestBuild)));
            if (!zC) {
                d();
            }
        } else {
            eVar.g("Problem gaining the audio focus. Result: " + iRequestAudioFocus);
            do {
                objD = bnVar.d();
            } while (!bnVar.f(objD, s.f40416a));
        }
        return bnVar.d() instanceof r;
    }

    @Override // com.waze.ifs.ui.y
    public final void onShutdown() {
        d();
    }
}
