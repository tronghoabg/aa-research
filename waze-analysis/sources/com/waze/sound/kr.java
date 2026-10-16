package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class kr extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40393a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WazeTtsStringsProviderNativeManager f40394b;

    /* renamed from: c, reason: collision with root package name */
    int f40395c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kr(WazeTtsStringsProviderNativeManager wazeTtsStringsProviderNativeManager, h.c.e eVar) {
        super(eVar);
        this.f40394b = wazeTtsStringsProviderNativeManager;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40393a = obj;
        this.f40395c |= Integer.MIN_VALUE;
        return this.f40394b.getTranslatedString(null, this);
    }
}
