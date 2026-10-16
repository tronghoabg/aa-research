package com.waze.reports_v2.presentation;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends aa {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.w.b.ab f35079a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.waze.ui.w.b.ab abVar) {
        super(null);
        h.g.b.x.f(abVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        this.f35079a = abVar;
    }

    public final com.waze.ui.w.b.ab a() {
        return this.f35079a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.f35079a == ((w) obj).f35079a;
    }

    public final int hashCode() {
        return this.f35079a.hashCode();
    }

    public final String toString() {
        return "NotifyError(type=" + this.f35079a + ")";
    }

    public w() {
        this(com.waze.ui.w.b.ab.f43566a);
    }
}
