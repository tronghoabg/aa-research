package com.waze.tide;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b extends com.waze.bz.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40928a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40929b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2) {
        super(null, null);
        h.g.b.x.f(str, "deviceName");
        h.g.b.x.f(str2, "deviceType");
        this.f40928a = str;
        this.f40929b = str2;
    }

    public final String a() {
        return this.f40928a;
    }

    public final String b() {
        return this.f40929b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.g.b.x.n(this.f40928a, bVar.f40928a) && h.g.b.x.n(this.f40929b, bVar.f40929b);
    }

    public final int hashCode() {
        return (this.f40928a.hashCode() * 31) + this.f40929b.hashCode();
    }

    public final String toString() {
        return "BluetoothDeviceNameAndType(deviceName=" + this.f40928a + ", deviceType=" + this.f40929b + ")";
    }
}
