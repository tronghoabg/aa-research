package com.waze.search.v2;

import java.util.Collection;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bq extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final String f36193a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36194b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection f36195c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq(String str, boolean z, Collection collection) {
        super(null);
        h.g.b.x.f(str, "networkId");
        h.g.b.x.f(collection, "selectedNetworks");
        this.f36193a = str;
        this.f36194b = z;
        this.f36195c = collection;
    }

    public final String a() {
        return this.f36193a;
    }

    public final Collection b() {
        return this.f36195c;
    }

    public final boolean c() {
        return this.f36194b;
    }
}
