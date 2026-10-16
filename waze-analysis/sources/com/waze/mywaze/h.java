package com.waze.mywaze;

import com.waze.sharedui.profile.UserProfile;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class h implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f30587a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30588b;

    public /* synthetic */ h(l lVar, int i2) {
        this.f30588b = i2;
        this.f30587a = lVar;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f30588b != 0) {
            return l.f(this.f30587a, (UserProfile) obj);
        }
        return l.g(this.f30587a, (Integer) obj);
    }
}
