package com.google.e.a.e;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private static final r f8454a = new r();

    /* renamed from: b, reason: collision with root package name */
    private static final q f8455b = new q();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f8456c = new AtomicReference();

    public static r b() {
        return f8454a;
    }

    public final l a() {
        l lVar = (l) this.f8456c.get();
        return lVar == null ? f8455b : lVar;
    }
}
