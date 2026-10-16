package com.waze;

import com.waze.navigate.DriveToNativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class in implements hw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24629b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f24630c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f24631d;

    public /* synthetic */ in(Object obj, int i2, int i3, int i4) {
        this.f24631d = i4;
        this.f24630c = obj;
        this.f24628a = i2;
        this.f24629b = i3;
    }

    @Override // com.waze.hw
    public final Object a() {
        int i2 = this.f24631d;
        int i3 = this.f24629b;
        if (i2 != 0) {
            return ((DriveToNativeManager) this.f24630c).lambda$getDangerZoneType$1(this.f24628a, i3);
        }
        iu.venueSearch$lambda$0((iu) this.f24630c, this.f24628a, i3);
        return null;
    }
}
