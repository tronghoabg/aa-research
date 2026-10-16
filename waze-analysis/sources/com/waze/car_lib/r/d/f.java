package com.waze.car_lib.r.d;

import com.waze.jni.protos.modules.navigation.StartNavigationResponse;
import com.waze.jni.protos.navigate.DriveTo;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements com.waze.jni.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21276b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f21277c;

    public /* synthetic */ f(Object obj, Object obj2, int i2) {
        this.f21277c = i2;
        this.f21275a = obj;
        this.f21276b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // com.waze.jni.a
    public final void a(Object obj) {
        if (this.f21277c == 0) {
            ?? r0 = this.f21276b;
            x.w((x) this.f21275a, r0, (StartNavigationResponse) obj);
        } else {
            Object obj2 = this.f21276b;
            SideMenuAutoCompleteRecycler.aL((SideMenuAutoCompleteRecycler) this.f21275a, (AddressItem) obj2, (DriveTo.DangerZoneType) obj);
        }
    }
}
