package com.waze.sound.c;

import android.media.MediaCodec;
import h.g.b.ap;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f39614a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f39615b;

    /* renamed from: c, reason: collision with root package name */
    int f39616c;

    /* renamed from: d, reason: collision with root package name */
    MediaCodec f39617d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.h.c.a f39618e;

    /* renamed from: f, reason: collision with root package name */
    ap f39619f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(n nVar, h.c.e eVar) {
        super(eVar);
        this.f39615b = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39614a = obj;
        this.f39616c |= Integer.MIN_VALUE;
        return n.g(this.f39615b, null, null, null, this);
    }
}
