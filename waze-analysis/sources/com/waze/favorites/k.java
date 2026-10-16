package com.waze.favorites;

import androidx.autofill.HintConstants;
import com.waze.an.c.w;
import com.waze.navigate.DriveToNativeManager;
import com.waze.navigate.bt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final FavoritesNativeManager f23806a;

    /* renamed from: b, reason: collision with root package name */
    private final DriveToNativeManager f23807b;

    public k(FavoritesNativeManager favoritesNativeManager, DriveToNativeManager driveToNativeManager) {
        x.f(favoritesNativeManager, "favoritesNativeManager");
        x.f(driveToNativeManager, "driveToNativeManager");
        this.f23806a = favoritesNativeManager;
        this.f23807b = driveToNativeManager;
    }

    public final void a(com.waze.jni.a aVar) {
        x.f(aVar, "callback");
        this.f23806a.getFavorites(new com.waze.app_nav.hub.c.h(aVar, 12));
    }

    public final void b(com.waze.jni.a aVar) {
        x.f(aVar, "callback");
        this.f23806a.getHome(new com.waze.app_nav.hub.c.h(aVar, 14));
    }

    public final void c(com.waze.jni.a aVar) {
        x.f(aVar, "callback");
        this.f23806a.getWork(new com.waze.app_nav.hub.c.h(aVar, 13));
    }

    public final void d(com.waze.jni.a aVar) {
        x.f(aVar, "callback");
        this.f23806a.isHomeWorkSet(new com.waze.app_nav.hub.c.h(aVar, 11));
    }

    public final void e(com.waze.places.f fVar, String str) {
        x.f(fVar, "place");
        x.f(str, HintConstants.AUTOFILL_HINT_NAME);
        o.addFavorite$default(this.f23806a, com.waze.notifications.c.k.e(fVar), str, true, null, 8, null);
    }

    public final void f(w wVar, w wVar2) {
        x.f(wVar, "favorite");
        bt.moveFavoriteAddressItem$default(this.f23807b, wVar.c(), wVar2 != null ? wVar2.c() : -1, null, 4, null);
    }
}
