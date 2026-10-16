package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final x f4359a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4360b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.b f4361c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.f f4362d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.datatransport.a f4363e;

    /* synthetic */ v(x xVar, String str, com.google.android.datatransport.b bVar, com.google.android.datatransport.f fVar, com.google.android.datatransport.a aVar) {
        this.f4359a = xVar;
        this.f4360b = str;
        this.f4361c = bVar;
        this.f4362d = fVar;
        this.f4363e = aVar;
    }

    public final com.google.android.datatransport.a a() {
        return this.f4363e;
    }

    final com.google.android.datatransport.b b() {
        return this.f4361c;
    }

    final com.google.android.datatransport.f c() {
        return this.f4362d;
    }

    public final x d() {
        return this.f4359a;
    }

    public final String e() {
        return this.f4360b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f4359a.equals(vVar.f4359a) && this.f4360b.equals(vVar.f4360b) && this.f4361c.equals(vVar.f4361c) && this.f4362d.equals(vVar.f4362d) && this.f4363e.equals(vVar.f4363e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.f4359a.hashCode() ^ 1000003) * 1000003) ^ this.f4360b.hashCode()) * 1000003) ^ this.f4361c.hashCode()) * 1000003) ^ this.f4362d.hashCode();
        return this.f4363e.hashCode() ^ (iHashCode * 1000003);
    }

    public final String toString() {
        com.google.android.datatransport.a aVar = this.f4363e;
        com.google.android.datatransport.f fVar = this.f4362d;
        com.google.android.datatransport.b bVar = this.f4361c;
        return "SendRequest{transportContext=" + String.valueOf(this.f4359a) + ", transportName=" + this.f4360b + ", event=" + String.valueOf(bVar) + ", transformer=" + String.valueOf(fVar) + ", encoding=" + String.valueOf(aVar) + "}";
    }

    v() {
        throw null;
    }
}
