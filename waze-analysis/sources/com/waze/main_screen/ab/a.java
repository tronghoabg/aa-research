package com.waze.main_screen.ab;

import com.waze.jni.protos.rtalerts.RtAlertItem;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private final RtAlertItem f25621a;

    /* renamed from: b, reason: collision with root package name */
    private final int f25622b;

    public a(RtAlertItem rtAlertItem, int i2) {
        x.f(rtAlertItem, "alertData");
        this.f25621a = rtAlertItem;
        this.f25622b = i2;
    }

    public final int a() {
        return this.f25622b;
    }

    public final RtAlertItem b() {
        return this.f25621a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return x.n(this.f25621a, aVar.f25621a) && this.f25622b == aVar.f25622b;
    }

    public final int hashCode() {
        return (this.f25621a.hashCode() * 31) + this.f25622b;
    }

    public final String toString() {
        return "AlertPopup(alertData=" + this.f25621a + ", timeout=" + this.f25622b + ")";
    }
}
