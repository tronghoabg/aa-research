package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bs extends by {

    /* renamed from: a, reason: collision with root package name */
    private final String f29921a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(String str) {
        super(null);
        h.g.b.x.f(str, "missingPassName");
        this.f29921a = str;
    }

    public final String a() {
        return this.f29921a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs) && h.g.b.x.n(this.f29921a, ((bs) obj).f29921a);
    }

    public final int hashCode() {
        return this.f29921a.hashCode();
    }

    public final String toString() {
        return "MissingPass(missingPassName=" + this.f29921a + ")";
    }
}
