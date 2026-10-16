package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ak extends ao {

    /* renamed from: a, reason: collision with root package name */
    private final String f33193a;

    public ak(String str) {
        super(null);
        this.f33193a = str;
    }

    public final String a() {
        return this.f33193a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ak) && h.g.b.x.n(this.f33193a, ((ak) obj).f33193a);
    }

    public final int hashCode() {
        String str = this.f33193a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "HeaderItem(title=" + this.f33193a + ")";
    }
}
