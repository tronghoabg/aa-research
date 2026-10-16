package com.waze.sound;

import com.waze.jni.protos.sound.VoiceAssetRequest;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class id extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40218a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ie f40219b;

    /* renamed from: c, reason: collision with root package name */
    int f40220c;

    /* renamed from: d, reason: collision with root package name */
    VoiceAssetRequest f40221d;

    /* renamed from: e, reason: collision with root package name */
    ak f40222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    id(ie ieVar, h.c.e eVar) {
        super(eVar);
        this.f40219b = ieVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40218a = obj;
        this.f40220c |= Integer.MIN_VALUE;
        return this.f40219b.a(null, this);
    }
}
