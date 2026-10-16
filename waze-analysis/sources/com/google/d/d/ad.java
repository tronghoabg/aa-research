package com.google.d.d;

import j$.util.Objects;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ad<F, T> extends eq<F> implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    final com.google.d.b.t f7405a;

    /* renamed from: b, reason: collision with root package name */
    final eq f7406b;

    ad(com.google.d.b.t tVar, eq eqVar) {
        this.f7405a = tVar;
        this.f7406b = eqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.d.d.eq, java.util.Comparator
    public final int compare(F f2, F f3) {
        com.google.d.b.t tVar = this.f7405a;
        return this.f7406b.compare(tVar.apply(f2), tVar.apply(f3));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ad) {
            ad adVar = (ad) obj;
            if (this.f7405a.equals(adVar.f7405a) && this.f7406b.equals(adVar.f7406b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7405a, this.f7406b);
    }

    public final String toString() {
        com.google.d.b.t tVar = this.f7405a;
        return this.f7406b.toString() + ".onResultOf(" + tVar.toString() + ")";
    }
}
