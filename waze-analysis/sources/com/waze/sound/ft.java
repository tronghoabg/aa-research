package com.waze.sound;

import androidx.media3.exoplayer.ExoPlayer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ft extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f40041a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gb f40042b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ExoPlayer f40043c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f40044d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ft(boolean z, gb gbVar, ExoPlayer exoPlayer, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f40041a = z;
        this.f40042b = gbVar;
        this.f40043c = exoPlayer;
        this.f40044d = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ft(this.f40041a, this.f40042b, this.f40043c, this.f40044d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ft) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        boolean z = this.f40041a;
        gb gbVar = this.f40042b;
        if (z) {
            gbVar.f40074g.a("Volume has been muted.");
            this.f40043c.setVolume(0.0f);
        } else {
            gbVar.f40074g.a("Volume has been unmuted.");
            this.f40043c.setVolume((float) ((Math.pow(10.0d, this.f40044d / 100.0d) - 1.0d) / (Math.pow(10.0d, 1.0d) - 1.0d)));
        }
        return h.ab.f48028a;
    }
}
