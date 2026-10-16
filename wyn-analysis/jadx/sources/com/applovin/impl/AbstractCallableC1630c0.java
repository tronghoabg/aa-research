package com.applovin.impl;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC1630c0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f21171a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f21172b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f21173c;

    /* renamed from: e, reason: collision with root package name */
    protected final AtomicBoolean f21175e = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    private final Context f21174d = com.applovin.impl.sdk.k.o();

    public AbstractCallableC1630c0(String str, com.applovin.impl.sdk.k kVar) {
        this.f21172b = str;
        this.f21171a = kVar;
        this.f21173c = kVar.O();
    }

    public Context a() {
        return this.f21174d;
    }

    public void a(boolean z2) {
        this.f21175e.set(z2);
    }
}
