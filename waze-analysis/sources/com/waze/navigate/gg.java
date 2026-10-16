package com.waze.navigate;

import com.waze.AlerterController$Alerter$Type;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gg {

    /* renamed from: a, reason: collision with root package name */
    private final TrafficSeverity f31425a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31426b;

    /* renamed from: c, reason: collision with root package name */
    private final AlerterController$Alerter$Type f31427c;

    public gg(TrafficSeverity trafficSeverity, int i2, AlerterController$Alerter$Type alerterController$Alerter$Type) {
        h.g.b.x.f(trafficSeverity, "severity");
        h.g.b.x.f(alerterController$Alerter$Type, "alertType");
        this.f31425a = trafficSeverity;
        this.f31426b = i2;
        this.f31427c = alerterController$Alerter$Type;
    }

    public final int a() {
        return this.f31426b;
    }

    public final AlerterController$Alerter$Type b() {
        return this.f31427c;
    }

    public final TrafficSeverity c() {
        return this.f31425a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gg)) {
            return false;
        }
        gg ggVar = (gg) obj;
        return this.f31425a == ggVar.f31425a && this.f31426b == ggVar.f31426b && this.f31427c == ggVar.f31427c;
    }

    public final int hashCode() {
        return (((this.f31425a.hashCode() * 31) + this.f31426b) * 31) + this.f31427c.hashCode();
    }

    public final String toString() {
        return "TrafficJam(severity=" + this.f31425a + ", lengthMeters=" + this.f31426b + ", alertType=" + this.f31427c + ")";
    }
}
