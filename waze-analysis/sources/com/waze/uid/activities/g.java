package com.waze.uid.activities;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UidFragmentActivity f44092a;

    g(UidFragmentActivity uidFragmentActivity) {
        this.f44092a = uidFragmentActivity;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        String str = (String) obj;
        UidFragmentActivity uidFragmentActivity = this.f44092a;
        if (str != null) {
            UidFragmentActivity.n(uidFragmentActivity, str);
        } else {
            uidFragmentActivity.s();
        }
        return ab.f48028a;
    }
}
