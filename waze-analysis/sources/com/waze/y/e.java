package com.waze.y;

import com.waze.z.a.b.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f45549a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str) {
        super((byte[]) null);
        x.f(str, "campaignId");
        this.f45549a = str;
    }

    public final String a() {
        return this.f45549a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && x.n(this.f45549a, ((e) obj).f45549a);
    }

    public final int hashCode() {
        return this.f45549a.hashCode();
    }

    public final String toString() {
        return "CopilotCarCampaign(campaignId=" + this.f45549a + ")";
    }
}
