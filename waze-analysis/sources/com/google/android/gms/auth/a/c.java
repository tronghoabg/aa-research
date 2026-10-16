package com.google.android.gms.auth.a;

import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final List f4421a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f4422b = false;

    public c(byte[] bArr) {
    }

    public final d a() {
        return new d(this.f4421a, this.f4422b);
    }

    public final void b() {
        this.f4422b = true;
    }

    public final a c() {
        return new a(this.f4421a, this.f4422b);
    }

    public final void d() {
        this.f4422b = true;
    }

    public c() {
    }
}
