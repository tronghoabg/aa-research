package com.waze.uid.state_impl.username_login;

import com.waze.tide.s;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class q extends s {

    /* renamed from: a, reason: collision with root package name */
    private final String f44715a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44716b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, int i2) {
        super((byte[]) null);
        x.f(str, "usernameOrEmail");
        this.f44715a = str;
        this.f44716b = i2;
    }

    public final int a() {
        return this.f44716b;
    }

    public final String b() {
        return this.f44715a;
    }
}
