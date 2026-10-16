package com.waze.tide;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c extends com.waze.bz.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40930a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str) {
        super(null, null);
        h.g.b.x.f(str, "deviceType");
        this.f40930a = str;
    }

    public final String a() {
        return this.f40930a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && h.g.b.x.n(this.f40930a, ((c) obj).f40930a);
    }

    public final int hashCode() {
        return this.f40930a.hashCode();
    }

    public final String toString() {
        return "BluetoothDeviceType(deviceType=" + this.f40930a + ")";
    }
}
