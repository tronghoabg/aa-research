package com.waze.main_screen.a.a;

import com.waze.navigate.ek;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final ek f25547a;

    public g(ek ekVar) {
        this.f25547a = ekVar;
    }

    public final ek a() {
        return this.f25547a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f25547a == ((g) obj).f25547a;
    }

    public final int hashCode() {
        ek ekVar = this.f25547a;
        if (ekVar == null) {
            return 0;
        }
        return ekVar.hashCode();
    }

    public final String toString() {
        return "AapMidDriveScreenState(stoppedNavigationReason=" + this.f25547a + ")";
    }
}
