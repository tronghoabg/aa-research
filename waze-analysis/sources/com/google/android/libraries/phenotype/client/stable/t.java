package com.google.android.libraries.phenotype.client.stable;

import com.google.d.d.ci;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.d.b.t f6158a;

    /* renamed from: b, reason: collision with root package name */
    private ci f6159b = ci.o();

    /* renamed from: c, reason: collision with root package name */
    private boolean f6160c = false;

    public t(com.google.d.b.t tVar) {
        this.f6158a = tVar;
    }

    public final r a() {
        return new s(new n(this.f6158a, this.f6160c, this.f6159b));
    }

    public final void b() {
        this.f6160c = true;
    }

    public final void c(Set set) {
        this.f6159b = ci.m(set);
    }
}
