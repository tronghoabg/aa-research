package com.waze.sound.c;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n f39597a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MediaCodec f39598b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f39599c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.h.c.a f39600d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MediaMuxer f39601e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ MediaFormat f39602f;

    /* renamed from: g, reason: collision with root package name */
    private /* synthetic */ Object f39603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(n nVar, MediaCodec mediaCodec, kotlinx.coroutines.b.k kVar, com.waze.h.c.a aVar, MediaMuxer mediaMuxer, MediaFormat mediaFormat, h.c.e eVar) {
        super(2, eVar);
        this.f39597a = nVar;
        this.f39598b = mediaCodec;
        this.f39599c = kVar;
        this.f39600d = aVar;
        this.f39601e = mediaMuxer;
        this.f39602f = mediaFormat;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        i iVar = new i(this.f39597a, this.f39598b, this.f39599c, this.f39600d, this.f39601e, this.f39602f, eVar);
        iVar.f39603g = obj;
        return iVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((i) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        af afVar = (af) this.f39603g;
        n nVar = this.f39597a;
        MediaCodec mediaCodec = this.f39598b;
        aj.z(afVar, null, null, new h(nVar, mediaCodec, this.f39599c, this.f39600d, (h.c.e) null, 1), 3);
        return aj.z(afVar, null, null, new h(this.f39601e, this.f39602f, nVar, mediaCodec, (h.c.e) null, 0), 3);
    }
}
