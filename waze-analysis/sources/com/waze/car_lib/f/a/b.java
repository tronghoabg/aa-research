package com.waze.car_lib.f.a;

import h.ab;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class b extends u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19334a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2) {
        super(0, obj, f.class, "navigationSettingsCloseClicked", "navigationSettingsCloseClicked()V", 0);
        this.f19334a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f19334a;
        Object obj = this.receiver;
        if (i2 != 0) {
            ((f) obj).c();
            return ab.f48028a;
        }
        ((f) obj).d();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2, byte[] bArr) {
        super(0, obj, f.class, "navigationSettingsBackClicked", "navigationSettingsBackClicked()V", 0);
        this.f19334a = i2;
    }
}
