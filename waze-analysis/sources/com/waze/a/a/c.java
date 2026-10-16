package com.waze.a.a;

import com.waze.sharedui.profile.UserProfile;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f13577a;

    c(e eVar) {
        this.f13577a = eVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        UserProfile userProfile = (UserProfile) obj;
        x.c(userProfile);
        Object objA = e.a(this.f13577a, userProfile, eVar);
        return objA == h.c.a.a.f48038a ? objA : ab.f48028a;
    }
}
