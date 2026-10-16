package com.waze.search.v2;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class br extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f36196a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36197b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f36198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(String str, boolean z, Set set) {
        super(null);
        h.g.b.x.f(str, "connectorId");
        h.g.b.x.f(set, "enabledConnectors");
        this.f36196a = str;
        this.f36197b = z;
        this.f36198c = set;
    }

    public final String a() {
        return this.f36196a;
    }

    public final Set b() {
        return this.f36198c;
    }

    public final boolean c() {
        return this.f36197b;
    }
}
