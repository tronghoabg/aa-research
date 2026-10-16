package com.waze.ui.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah extends aq {

    /* renamed from: a, reason: collision with root package name */
    private final String f42005a;

    public ah(String str) {
        super(null);
        this.f42005a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ah) && h.g.b.x.n(this.f42005a, ((ah) obj).f42005a);
    }

    public final int hashCode() {
        String str = this.f42005a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return "LicensePlateRestriction(areaName=" + this.f42005a + ")";
    }
}
