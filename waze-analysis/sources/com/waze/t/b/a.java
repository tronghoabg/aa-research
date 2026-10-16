package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40647a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f40648b;

    public a(String str, Object obj) {
        this.f40647a = str;
        this.f40648b = obj;
    }

    public static /* synthetic */ a b(a aVar, String str, Object obj, int i2) {
        if ((i2 & 1) != 0) {
            str = aVar.f40647a;
        }
        if ((i2 & 2) != 0) {
            obj = aVar.f40648b;
        }
        return new a(str, obj);
    }

    public final String a() {
        return this.f40647a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.g.b.x.n(this.f40647a, aVar.f40647a) && h.g.b.x.n(this.f40648b, aVar.f40648b);
    }

    public final int hashCode() {
        String str = this.f40647a;
        int iHashCode = str == null ? 0 : str.hashCode();
        Object obj = this.f40648b;
        return (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "ConversationAdditionalData(displayText=" + this.f40647a + ", featureData=" + this.f40648b + ")";
    }
}
