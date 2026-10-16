package com.waze.navigate;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gi extends com.waze.realtime_report_feedback.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f31429a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31430b;

    /* renamed from: c, reason: collision with root package name */
    private final List f31431c;

    /* JADX WARN: Illegal instructions before constructor call */
    public gi(int i2, int i3, List list) {
        h.g.b.x.f(list, "jams");
        byte[] bArr = null;
        super(bArr, bArr);
        this.f31429a = i2;
        this.f31430b = i3;
        this.f31431c = list;
    }

    public final int a() {
        return this.f31429a;
    }

    public final int b() {
        return this.f31430b;
    }

    public final List c() {
        return this.f31431c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi)) {
            return false;
        }
        gi giVar = (gi) obj;
        return this.f31429a == giVar.f31429a && this.f31430b == giVar.f31430b && h.g.b.x.n(this.f31431c, giVar.f31431c);
    }

    public final int hashCode() {
        return (((this.f31429a * 31) + this.f31430b) * 31) + this.f31431c.hashCode();
    }

    public final String toString() {
        return "Traffic(percent=" + this.f31429a + ", totalTimeSeconds=" + this.f31430b + ", jams=" + this.f31431c + ")";
    }
}
