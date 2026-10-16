package com.waze.ui.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class al extends an {

    /* renamed from: a, reason: collision with root package name */
    private final String f42283a;

    /* renamed from: b, reason: collision with root package name */
    private final int f42284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(String str, int i2) {
        super(null);
        h.g.b.x.f(str, "label");
        this.f42283a = str;
        this.f42284b = i2;
    }

    public static /* synthetic */ al c(al alVar, String str) {
        h.g.b.x.f(str, "label");
        return new al(str, alVar.f42284b);
    }

    public final int a() {
        return this.f42284b;
    }

    @Override // com.waze.ui.f.an
    public final String b() {
        return this.f42283a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        return h.g.b.x.n(this.f42283a, alVar.f42283a) && this.f42284b == alVar.f42284b;
    }

    public final int hashCode() {
        return (this.f42283a.hashCode() * 31) + this.f42284b;
    }

    public final String toString() {
        return "IconUi(label=" + this.f42283a + ", iconResId=" + this.f42284b + ")";
    }
}
