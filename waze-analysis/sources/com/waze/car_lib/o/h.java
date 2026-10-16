package com.waze.car_lib.o;

import com.waze.mywaze.MyWazeNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MyWazeNativeManager f20470a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20471b;

    h(MyWazeNativeManager myWazeNativeManager, int i2) {
        this.f20471b = i2;
        this.f20470a = myWazeNativeManager;
    }

    @Override // com.waze.car_lib.o.d
    public final /* synthetic */ Object a() {
        int i2 = this.f20471b;
        MyWazeNativeManager myWazeNativeManager = this.f20470a;
        return i2 != 0 ? Boolean.valueOf(myWazeNativeManager.isInvisible()) : Boolean.valueOf(myWazeNativeManager.isInvisible());
    }

    @Override // com.waze.car_lib.o.d
    public final /* synthetic */ void b(Object obj) {
        if (this.f20471b != 0) {
            com.waze.mywaze.y.setInvisible$default(this.f20470a, ((Boolean) obj).booleanValue(), null, 2, null);
        } else {
            com.waze.mywaze.y.setInvisible$default(this.f20470a, ((Boolean) obj).booleanValue(), null, 2, null);
        }
    }
}
