package com.google.d.d;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class av extends ay {
    private static final long serialVersionUID = 0;

    av(Comparable comparable) {
        super(comparable);
    }

    @Override // com.google.d.d.ay
    final void d(StringBuilder sb) {
        sb.append('(');
        sb.append(this.f7442a);
    }

    @Override // com.google.d.d.ay
    final void e(StringBuilder sb) {
        sb.append(this.f7442a);
        sb.append(']');
    }

    @Override // com.google.d.d.ay
    final boolean f(Comparable comparable) {
        return er.a(this.f7442a, comparable) < 0;
    }

    @Override // com.google.d.d.ay
    public final int hashCode() {
        return ~this.f7442a.hashCode();
    }

    public final String toString() {
        return DomExceptionUtils.SEPARATOR + this.f7442a.toString() + "\\";
    }
}
