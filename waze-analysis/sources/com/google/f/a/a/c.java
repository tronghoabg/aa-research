package com.google.f.a.a;

import com.google.v.ei;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements ei {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f8802c;

    /* renamed from: b, reason: collision with root package name */
    static final ei f8801b = new c(1);

    /* renamed from: a, reason: collision with root package name */
    static final ei f8800a = new c(0);

    private c(int i2) {
        this.f8802c = i2;
    }

    @Override // com.google.v.ei
    public final boolean isInRange(int i2) {
        return this.f8802c != 0 ? b.a(i2) != null : d.a(i2) != null;
    }
}
