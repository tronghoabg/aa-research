package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class b extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f19412a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2) {
        super(0, obj, h.class, "navigationSettingsCloseClicked", "navigationSettingsCloseClicked()V", 0);
        this.f19412a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f19412a;
        if (i2 == 0) {
            ((h) this.receiver).c();
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            ((h) this.receiver).b();
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            ((ej) this.receiver).b();
            return h.ab.f48028a;
        }
        Object obj = this.receiver;
        if (i2 != 3) {
            ((hm) obj).e();
            return h.ab.f48028a;
        }
        ((ej) obj).a();
        return h.ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2, byte[] bArr) {
        super(0, obj, h.class, "navigationSettingsBackClicked", "navigationSettingsBackClicked()V", 0);
        this.f19412a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2, char[] cArr) {
        super(0, obj, ej.class, "requestPermissions", "requestPermissions()V", 0);
        this.f19412a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2, int[] iArr) {
        super(0, obj, hm.class, "openLicensePlateScreen", "openLicensePlateScreen()V", 0);
        this.f19412a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(Object obj, int i2, short[] sArr) {
        super(0, obj, ej.class, "enableBluetooth", "enableBluetooth()V", 0);
        this.f19412a = i2;
    }
}
