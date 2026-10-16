package com.google.android.datatransport;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3902a;

    /* renamed from: b, reason: collision with root package name */
    private final c f3903b;

    /* renamed from: c, reason: collision with root package name */
    private final d f3904c;

    b(Object obj, c cVar, d dVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f3902a = obj;
        if (cVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f3903b = cVar;
        this.f3904c = dVar;
    }

    public static b a(Object obj) {
        return new b(obj, c.f3905a, null);
    }

    public static b b(Object obj, d dVar) {
        return new b(obj, c.f3905a, dVar);
    }

    public static b c(Object obj) {
        return new b(obj, c.f3907c, null);
    }

    public final c d() {
        return this.f3903b;
    }

    public final d e() {
        return this.f3904c;
    }

    public final boolean equals(Object obj) {
        d dVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f3902a.equals(bVar.f3902a) && this.f3903b.equals(bVar.f3903b) && ((dVar = this.f3904c) != null ? dVar.equals(bVar.f3904c) : bVar.f3904c == null)) {
                return true;
            }
        }
        return false;
    }

    public final Object f() {
        return this.f3902a;
    }

    public final int hashCode() {
        int iHashCode = ((this.f3902a.hashCode() ^ (-721379959)) * 1000003) ^ this.f3903b.hashCode();
        d dVar = this.f3904c;
        return ((dVar == null ? 0 : dVar.hashCode()) ^ (iHashCode * 1000003)) * 1000003;
    }

    public final String toString() {
        d dVar = this.f3904c;
        c cVar = this.f3903b;
        return "Event{code=null, payload=" + this.f3902a.toString() + ", priority=" + cVar.toString() + ", productData=" + String.valueOf(dVar) + ", eventContext=null}";
    }

    public b() {
        throw null;
    }
}
