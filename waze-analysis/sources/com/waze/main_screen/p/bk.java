package com.waze.main_screen.p;

import com.waze.navigate.ek;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bk extends com.waze.map.isolated.k {

    /* renamed from: a, reason: collision with root package name */
    private final ek f27201a;

    public bk(ek ekVar) {
        super(null, null);
        this.f27201a = ekVar;
    }

    public final ek a() {
        return this.f27201a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bk) && this.f27201a == ((bk) obj).f27201a;
    }

    public final int hashCode() {
        ek ekVar = this.f27201a;
        if (ekVar == null) {
            return 0;
        }
        return ekVar.hashCode();
    }

    public final String toString() {
        return "NotNavigating(reason=" + this.f27201a + ")";
    }
}
