package com.google.e.a.e;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class h extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final String f8443a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.e.a.s f8444b;

    /* synthetic */ h(String str, com.google.e.a.s sVar) {
        this.f8443a = str;
        this.f8444b = sVar;
    }

    @Override // com.google.d.m.a.a.b
    public final boolean c() {
        return this.f8444b != com.google.e.a.s.f8785d;
    }

    public final String toString() {
        return String.format("(typeUrl=%s, outputPrefixType=%s)", this.f8443a, this.f8444b.toString());
    }
}
