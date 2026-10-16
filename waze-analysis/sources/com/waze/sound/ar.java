package com.waze.sound;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ar {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f39457a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f39458b;

    /* renamed from: c, reason: collision with root package name */
    private AudioFocusRequest f39459c;

    public ar(Context context, com.waze.shared_infra.i.e eVar) {
        h.g.b.x.f(context, "context");
        h.g.b.x.f(eVar, "logger");
        this.f39457a = eVar;
        this.f39458b = h.g.a(new com.waze.reports_v2.presentation.bq(context, 15));
    }

    static final void a(ar arVar, h.g.a.a aVar, int i2) {
        arVar.f39457a.a("audio focus state changed to: " + i2);
        if (i2 == -2 || i2 == -1) {
            aVar.invoke();
        }
    }

    private final AudioManager d() {
        return (AudioManager) this.f39458b.getValue();
    }

    public final boolean b(final h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onAudioFocusLost");
        this.f39457a.a("requestAudioFocus()");
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(4).setAudioAttributes(com.waze.app_nav.hub.b.m.d(com.waze.h.i.f24357b)).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: com.waze.sound.aq
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i2) {
                ar.a(this.f39455a, aVar, i2);
            }
        }).build();
        h.g.b.x.e(audioFocusRequestBuild, "build(...)");
        synchronized (this) {
            if (this.f39459c != null) {
                this.f39457a.b("already requested, bad state-management by the caller");
                return false;
            }
            int iRequestAudioFocus = d().requestAudioFocus(audioFocusRequestBuild);
            if (iRequestAudioFocus == 1) {
                this.f39459c = audioFocusRequestBuild;
                return true;
            }
            this.f39457a.b("Failed to acquire audio focus. Result code: " + iRequestAudioFocus);
            return false;
        }
    }

    public final void c() {
        AudioFocusRequest audioFocusRequest;
        synchronized (this) {
            audioFocusRequest = this.f39459c;
            this.f39459c = null;
        }
        if (audioFocusRequest == null) {
            return;
        }
        int iAbandonAudioFocusRequest = d().abandonAudioFocusRequest(audioFocusRequest);
        this.f39457a.a("abandonAudioFocus() : result=" + iAbandonAudioFocusRequest);
    }
}
