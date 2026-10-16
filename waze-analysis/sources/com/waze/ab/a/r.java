package com.waze.ab.a;

import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends x {

    /* renamed from: a, reason: collision with root package name */
    private final Uri f13745a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f13746b;

    /* renamed from: c, reason: collision with root package name */
    private final q f13747c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Uri uri, Uri uri2, q qVar) {
        super(null);
        h.g.b.x.f(uri, "inputUri");
        h.g.b.x.f(uri2, "outputUri");
        h.g.b.x.f(qVar, "params");
        this.f13745a = uri;
        this.f13746b = uri2;
        this.f13747c = qVar;
    }

    public final Uri a() {
        return this.f13745a;
    }

    public final Uri b() {
        return this.f13746b;
    }

    public final q c() {
        return this.f13747c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return h.g.b.x.n(this.f13745a, rVar.f13745a) && h.g.b.x.n(this.f13746b, rVar.f13746b) && h.g.b.x.n(this.f13747c, rVar.f13747c);
    }

    public final int hashCode() {
        return (((this.f13745a.hashCode() * 31) + this.f13746b.hashCode()) * 31) + this.f13747c.hashCode();
    }

    public final String toString() {
        return "CropImage(inputUri=" + this.f13745a + ", outputUri=" + this.f13746b + ", params=" + this.f13747c + ")";
    }
}
