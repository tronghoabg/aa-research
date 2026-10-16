package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ir extends com.waze.beacons.n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f19726a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ir() {
        byte[] bArr = null;
        super(bArr, bArr);
        this.f19726a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir)) {
            return false;
        }
        boolean z = ((ir) obj).f19726a;
        return true;
    }

    public final int hashCode() {
        return a.a.a(false);
    }

    public final String toString() {
        return "ShowLoginSucceededScreen(showGuestUserDisclaimer=false)";
    }
}
