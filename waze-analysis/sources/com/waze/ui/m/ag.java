package com.waze.ui.m;

import androidx.activity.result.ActivityResult;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ag extends cb {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityResult f42783a;

    /* renamed from: b, reason: collision with root package name */
    private final z f42784b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ActivityResult activityResult, z zVar) {
        super(null);
        h.g.b.x.f(activityResult, "result");
        h.g.b.x.f(zVar, "launcherId");
        this.f42783a = activityResult;
        this.f42784b = zVar;
    }

    public final ActivityResult a() {
        return this.f42783a;
    }

    public final z b() {
        return this.f42784b;
    }
}
