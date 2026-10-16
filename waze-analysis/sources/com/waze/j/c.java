package com.waze.j;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    private final String f24886a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24887b;

    public c(String str) {
        this.f24886a = com.waze.shared_infra.o.b.a().c(R.string.MORE_RESULT_FOR, new Object[0]) + " " + str;
        this.f24887b = str;
    }

    @Override // com.waze.j.d
    public final String b() {
        return this.f24887b;
    }

    @Override // com.waze.j.d
    public final String d() {
        return this.f24886a;
    }

    @Override // com.waze.j.d
    public final int e() {
        return 6;
    }
}
