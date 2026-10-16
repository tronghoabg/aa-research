package com.waze.tide;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a extends com.waze.bz.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40912a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str) {
        super(null, null);
        h.g.b.x.f(str, "deviceName");
        this.f40912a = str;
    }

    public final String a() {
        return this.f40912a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && h.g.b.x.n(this.f40912a, ((a) obj).f40912a);
    }

    public final int hashCode() {
        return this.f40912a.hashCode();
    }

    public final String toString() {
        return "BluetoothDeviceName(deviceName=" + this.f40912a + ")";
    }
}
