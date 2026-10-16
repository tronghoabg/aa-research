package com.waze.network.b;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f32069b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32070c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(byte[] bArr) {
        super("ENONET");
        h.g.b.x.f("ENONET", "searchPattern");
        this.f32069b = DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_4;
        this.f32070c = "ENONET (Machine is not on the network)";
        this.f32071d = "ENONET";
    }

    @Override // com.waze.network.b.q
    public final int a() {
        return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_NEW_USER_4;
    }

    @Override // com.waze.network.b.q
    public final String b() {
        return this.f32070c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        int i2 = jVar.f32069b;
        return h.g.b.x.n(this.f32070c, jVar.f32070c) && h.g.b.x.n(this.f32071d, jVar.f32071d);
    }

    public final int hashCode() {
        return ((this.f32070c.hashCode() + 6603) * 31) + this.f32071d.hashCode();
    }

    public final String toString() {
        return "MachineIsNotOnNetwork(errorCode=213, errorMessage=" + this.f32070c + ", searchPattern=" + this.f32071d + ")";
    }

    public j() {
        this(null);
    }
}
