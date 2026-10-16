package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class js implements jr {

    /* renamed from: a, reason: collision with root package name */
    private final ih f40345a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f40346b;

    public js(ih ihVar) {
        h.g.b.x.f(ihVar, "voiceAssistantManager");
        this.f40345a = ihVar;
        this.f40346b = kotlinx.coroutines.b.ai.n(new aj(this, (h.c.e) null, 4));
    }

    @Override // com.waze.sound.jr
    public final kotlinx.coroutines.b.k a() {
        return this.f40346b;
    }
}
