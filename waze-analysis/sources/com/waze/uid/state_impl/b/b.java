package com.waze.uid.state_impl.b;

import com.waze.tide.s;
import com.waze.uid.state_impl.util.InstallParameters;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends s {

    /* renamed from: a, reason: collision with root package name */
    private final InstallParameters.Community f44604a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InstallParameters.Community community) {
        super((byte[]) null);
        x.f(community, "community");
        this.f44604a = community;
    }

    public final InstallParameters.Community a() {
        return this.f44604a;
    }
}
