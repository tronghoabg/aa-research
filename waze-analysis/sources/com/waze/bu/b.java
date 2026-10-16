package com.waze.bu;

import com.waze.sharedui.h.k;
import com.waze.sharedui.profile.UserProfile;
import h.ab;
import h.g.b.x;
import kotlinx.coroutines.b.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.i.e f17477a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f17478b;

    b(com.waze.shared_infra.i.e eVar, f fVar) {
        this.f17477a = eVar;
        this.f17478b = fVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        final UserProfile userProfile = (UserProfile) obj;
        this.f17477a.e("profile updated");
        this.f17478b.f17486a.d(new com.waze.shared_infra.n.d() { // from class: com.waze.bu.a
            @Override // com.waze.shared_infra.n.d
            public final Object a(Object obj2) {
                k kVar = (k) obj2;
                x.f(kVar, "it");
                return k.c(kVar, false, userProfile, 1);
            }
        });
        return ab.f48028a;
    }
}
