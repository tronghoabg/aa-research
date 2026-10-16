package com.waze.sharedui.f;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.b f38886a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.waze.sharedui.b bVar, String str) {
        super("NetworkError: " + bVar + " responseElementName=" + str);
        x.f(bVar, "cuiError");
        x.f(str, "responseElementName");
        this.f38886a = bVar;
    }

    public final com.waze.sharedui.b a() {
        return this.f38886a;
    }

    public /* synthetic */ b(com.waze.sharedui.b bVar) {
        this(bVar, "");
    }
}
