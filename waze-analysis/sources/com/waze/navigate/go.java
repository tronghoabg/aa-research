package com.waze.navigate;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class go implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred f31441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f31442b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f31443c;

    public /* synthetic */ go(gm gmVar, CompletableDeferred completableDeferred, int i2) {
        this.f31443c = i2;
        this.f31442b = gmVar;
        this.f31441a = completableDeferred;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        if (this.f31443c != 0) {
            return gw.a((gm) this.f31442b, this.f31441a);
        }
        return gw.c(this.f31441a, this.f31442b);
    }

    public /* synthetic */ go(CompletableDeferred completableDeferred, h.g.a.a aVar, int i2) {
        this.f31443c = i2;
        this.f31441a = completableDeferred;
        this.f31442b = aVar;
    }
}
