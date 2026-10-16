package com.waze.av.b;

import com.waze.places.PlacesNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final /* synthetic */ class ac extends h.g.b.a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f15849a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(Object obj, int i2) {
        super(0, obj, PlacesNativeManager.class, "registerPlacesUpdateHook", "registerPlacesUpdateHook(Lkotlin/jvm/functions/Function1;)V", 0);
        this.f15849a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f15849a;
        Object obj = this.receiver;
        if (i2 != 0) {
            com.waze.places.ab.registerPlacesUpdateHook$default((PlacesNativeManager) obj, null, 1, null);
            return h.ab.f48028a;
        }
        com.waze.places.ab.registerPlacesUpdateHook$default((PlacesNativeManager) obj, null, 1, null);
        return h.ab.f48028a;
    }
}
