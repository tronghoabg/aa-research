package com.waze.sound.c;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f39591a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ MediaCodec f39592b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f39593c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f39594d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f39595e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f39596f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(MediaMuxer mediaMuxer, MediaFormat mediaFormat, n nVar, MediaCodec mediaCodec, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39596f = i2;
        this.f39593c = mediaMuxer;
        this.f39594d = mediaFormat;
        this.f39595e = nVar;
        this.f39592b = mediaCodec;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f39596f;
        Object obj2 = this.f39593c;
        if (i2 != 0) {
            return new h((n) obj2, this.f39592b, (kotlinx.coroutines.b.k) this.f39595e, (com.waze.h.c.a) this.f39594d, eVar, 1);
        }
        Object obj3 = this.f39594d;
        return new h((MediaMuxer) obj2, (MediaFormat) obj3, (n) this.f39595e, this.f39592b, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f39596f != 0 ? ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((h) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlinx.coroutines.b.k] */
    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f39596f != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            if (this.f39591a != 0) {
                e.b.c.b(obj);
            } else {
                e.b.c.b(obj);
                Object obj2 = this.f39593c;
                MediaCodec mediaCodec = this.f39592b;
                ?? r3 = this.f39595e;
                Object obj3 = this.f39594d;
                this.f39591a = 1;
                if (n.g((n) obj2, mediaCodec, r3, (com.waze.h.c.a) obj3, this) == aVar) {
                    return aVar;
                }
            }
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f39591a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            MediaMuxer mediaMuxer = (MediaMuxer) this.f39593c;
            int iAddTrack = mediaMuxer.addTrack((MediaFormat) this.f39594d);
            mediaMuxer.start();
            Object obj4 = this.f39595e;
            this.f39591a = 1;
            if (n.f((n) obj4, this.f39592b, mediaMuxer, iAddTrack, this) == aVar2) {
                return aVar2;
            }
        }
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(n nVar, MediaCodec mediaCodec, kotlinx.coroutines.b.k kVar, com.waze.h.c.a aVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f39596f = i2;
        this.f39593c = nVar;
        this.f39592b = mediaCodec;
        this.f39595e = kVar;
        this.f39594d = aVar;
    }
}
