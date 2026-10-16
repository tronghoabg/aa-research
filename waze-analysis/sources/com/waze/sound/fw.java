package com.waze.sound;

import androidx.media3.common.MediaItem;
import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fw extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gb f40050a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gj f40051b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ExoPlayer f40052c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ MediaItem f40053d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fw(gb gbVar, gj gjVar, ExoPlayer exoPlayer, MediaItem mediaItem, h.c.e eVar) {
        super(2, eVar);
        this.f40050a = gbVar;
        this.f40051b = gjVar;
        this.f40052c = exoPlayer;
        this.f40053d = mediaItem;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new fw(this.f40050a, this.f40051b, this.f40052c, this.f40053d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((fw) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.shared_infra.i.e eVar = this.f40050a.f40074g;
        ExoPlayer exoPlayer = this.f40052c;
        eVar.a("playing file " + this.f40051b + " with exoplayer state=" + exoPlayer.getPlaybackState());
        exoPlayer.setMediaItem(this.f40053d);
        exoPlayer.prepare();
        exoPlayer.play();
        return h.ab.f48028a;
    }
}
