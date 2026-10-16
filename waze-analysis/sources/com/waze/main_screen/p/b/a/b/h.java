package com.waze.main_screen.p.b.a.b;

import com.waze.navigate.ea;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final ea f27110a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27111b;

    public h(ea eaVar, String str) {
        this.f27110a = eaVar;
        this.f27111b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f27110a == hVar.f27110a && x.n(this.f27111b, hVar.f27111b);
    }

    public final int hashCode() {
        ea eaVar = this.f27110a;
        int iHashCode = eaVar == null ? 0 : eaVar.hashCode();
        String str = this.f27111b;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CurrentInstructionIcon(type=" + this.f27110a + ", text=" + this.f27111b + ")";
    }
}
