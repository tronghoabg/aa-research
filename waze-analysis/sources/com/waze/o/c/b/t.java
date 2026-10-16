package com.waze.o.c.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class t implements w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f32828a;

    public t(boolean z) {
        this.f32828a = z;
    }

    @Override // com.waze.t.b.cb
    public final boolean e() {
        return this.f32828a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && this.f32828a == ((t) obj).f32828a;
    }

    public final int hashCode() {
        return a.a.a(this.f32828a);
    }

    public final String toString() {
        return "SendUserLogsResult(success=" + this.f32828a + ")";
    }
}
