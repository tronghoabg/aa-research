package com.moloco.sdk.acm.services;

import ad.r;
import java.util.concurrent.atomic.AtomicLong;
import od.InterfaceC3734w0;

/* loaded from: classes4.dex */
public final class f implements InterfaceC3734w0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f28475a;

    public f(r rVar) {
        this.f28475a = new AtomicLong(0L);
    }

    @Override // od.InterfaceC3734w0
    public void a() {
        this.f28475a.getAndAdd(1L);
    }

    public f() {
        this.f28475a = new AtomicLong();
    }
}
