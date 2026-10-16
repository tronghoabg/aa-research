package com.waze.uid.state_impl.g;

import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s extends com.waze.tide.s {

    /* renamed from: a, reason: collision with root package name */
    private final InstallParameters.Result f44696a;

    /* renamed from: b, reason: collision with root package name */
    private final InstallParameters.Community f44697b;

    public s(InstallParameters.Result result, InstallParameters.Community community) {
        super((byte[]) null);
        this.f44696a = result;
        this.f44697b = community;
    }

    public final InstallParameters.Community a() {
        return this.f44697b;
    }

    public final InstallParameters.Result b() {
        return this.f44696a;
    }
}
