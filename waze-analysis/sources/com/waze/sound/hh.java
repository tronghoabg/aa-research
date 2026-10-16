package com.waze.sound;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.Objects;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class hh implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f40136a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f40137b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f40138c;

    hh(el elVar, CompletableDeferred completableDeferred, int i2) {
        this.f40138c = i2;
        this.f40137b = elVar;
        this.f40136a = completableDeferred;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.media3.exoplayer.ExoPlayer, java.lang.Object] */
    @Override // kotlinx.coroutines.b.l
    public final /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        int i2 = this.f40138c;
        if (i2 == 0) {
            byte[] bArr = (byte[]) obj;
            hl hlVar = (hl) this.f40136a;
            com.waze.shared_infra.i.e eVar2 = hlVar.f40154d;
            int length = bArr.length;
            ExoPlayer exoPlayer = hlVar.f40157g;
            eVar2.a("enqueue : chunk.size=" + length + " | player.playbackState=" + (exoPlayer != null ? new Integer(exoPlayer.getPlaybackState()) : null));
            ((gu) this.f40137b).a(bArr);
            return h.ab.f48028a;
        }
        if (i2 != 1) {
            ((hl) this.f40136a).s(this.f40137b, ((Boolean) obj).booleanValue());
            return h.ab.f48028a;
        }
        com.waze.a.af afVar = (com.waze.a.af) obj;
        com.waze.shared_infra.i.e eVar3 = ((el) this.f40137b).f39934d;
        Objects.toString(afVar);
        eVar3.a("event was received from silence detector: ".concat(String.valueOf(afVar)));
        if (h.g.b.x.n(afVar, com.waze.h.b.h.f24324a) || h.g.b.x.n(afVar, com.waze.h.b.g.f24323a)) {
            this.f40136a.a(ed.f39888b);
        } else {
            if (!(afVar instanceof com.waze.h.b.f)) {
                throw new h.i();
            }
            this.f40136a.a(ed.f39889c);
        }
        return h.ab.f48028a;
    }

    hh(hl hlVar, Object obj, int i2) {
        this.f40138c = i2;
        this.f40136a = hlVar;
        this.f40137b = obj;
    }
}
