package com.waze.cb;

import com.waze.sharedui.profile.UserProfile;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f22113a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f22114b;

    q(s sVar, af afVar) {
        this.f22113a = sVar;
        this.f22114b = afVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        UserProfile userProfile = (UserProfile) obj;
        x.c(userProfile);
        s.f(this.f22113a, userProfile, this.f22114b);
        return ab.f48028a;
    }
}
