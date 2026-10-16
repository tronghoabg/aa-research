package com.waze.sound;

import android.media.AudioDeviceInfo;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ga extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gb f40065a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f40066b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ExoPlayer f40067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ga(gb gbVar, boolean z, ExoPlayer exoPlayer, h.c.e eVar) {
        super(2, eVar);
        this.f40065a = gbVar;
        this.f40066b = z;
        this.f40067c = exoPlayer;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ga(this.f40065a, this.f40066b, this.f40067c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ga) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        gb gbVar = this.f40065a;
        com.waze.shared_infra.i.e eVar = gbVar.f40074g;
        StringBuilder sb = new StringBuilder("updateRouteSoundToSpeaker: shouldRouteToSpeaker=");
        boolean z = this.f40066b;
        sb.append(z);
        eVar.a(sb.toString());
        AudioDeviceInfo audioDeviceInfo = null;
        if (z) {
            AudioDeviceInfo[] devices = gbVar.f40071d.getDevices(2);
            com.waze.shared_infra.i.e eVar2 = gbVar.f40074g;
            h.g.b.x.c(devices);
            eVar2.a("updateRouteSoundToSpeaker - Available output devices: ".concat(h.a.c.aE(devices, null, null, null, new df(4), 31)));
            h.g.b.x.c(devices);
            int length = devices.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                AudioDeviceInfo audioDeviceInfo2 = devices[i2];
                if (audioDeviceInfo2.getType() == 2) {
                    audioDeviceInfo = audioDeviceInfo2;
                    break;
                }
                i2++;
            }
            gbVar.f40074g.a("speakerOutputDevice found: " + (audioDeviceInfo != null));
            this.f40067c.setPreferredAudioDevice(audioDeviceInfo);
            gbVar.f40074g.a("setPreferredAudioDevice called with speaker");
        } else {
            this.f40067c.setPreferredAudioDevice(null);
            gbVar.f40074g.a("setPreferredAudioDevice called with null");
        }
        return h.ab.f48028a;
    }
}
