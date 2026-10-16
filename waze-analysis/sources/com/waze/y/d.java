package com.waze.y;

import com.waze.z.a.b.n;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class d extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f45548a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str) {
        super((byte[]) null);
        x.f(str, "campaignId");
        this.f45548a = str;
    }

    public final String a() {
        return this.f45548a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && x.n(this.f45548a, ((d) obj).f45548a);
    }

    public final int hashCode() {
        return this.f45548a.hashCode();
    }

    public final String toString() {
        return "CopilotCampaign(campaignId=" + this.f45548a + ")";
    }
}
