package com.google.android.datatransport.cct.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p extends z {

    /* renamed from: a, reason: collision with root package name */
    private final y f4049a;

    /* renamed from: b, reason: collision with root package name */
    private final b f4050b;

    /* synthetic */ p(y yVar, b bVar) {
        this.f4049a = yVar;
        this.f4050b = bVar;
    }

    @Override // com.google.android.datatransport.cct.a.z
    public final b a() {
        return this.f4050b;
    }

    @Override // com.google.android.datatransport.cct.a.z
    public final y b() {
        return this.f4049a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            y yVar = this.f4049a;
            if (yVar != null ? yVar.equals(zVar.b()) : zVar.b() == null) {
                b bVar = this.f4050b;
                if (bVar != null ? bVar.equals(zVar.a()) : zVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        y yVar = this.f4049a;
        int iHashCode = yVar == null ? 0 : yVar.hashCode();
        b bVar = this.f4050b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        b bVar = this.f4050b;
        return "ClientInfo{clientType=" + String.valueOf(this.f4049a) + ", androidClientInfo=" + String.valueOf(bVar) + "}";
    }
}
