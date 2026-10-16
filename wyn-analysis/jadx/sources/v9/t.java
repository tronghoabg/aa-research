package v9;

import com.google.protobuf.ByteString;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final ByteString f47112a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47113b;

    /* renamed from: c, reason: collision with root package name */
    public final c9.d f47114c;

    /* renamed from: d, reason: collision with root package name */
    public final c9.d f47115d;

    /* renamed from: e, reason: collision with root package name */
    public final c9.d f47116e;

    public t(ByteString byteString, boolean z2, c9.d dVar, c9.d dVar2, c9.d dVar3) {
        this.f47112a = byteString;
        this.f47113b = z2;
        this.f47114c = dVar;
        this.f47115d = dVar2;
        this.f47116e = dVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f47113b == tVar.f47113b && this.f47112a.equals(tVar.f47112a) && this.f47114c.equals(tVar.f47114c) && this.f47115d.equals(tVar.f47115d)) {
            return this.f47116e.equals(tVar.f47116e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f47116e.f19805a.hashCode() + ((this.f47115d.f19805a.hashCode() + ((this.f47114c.f19805a.hashCode() + (((this.f47112a.hashCode() * 31) + (this.f47113b ? 1 : 0)) * 31)) * 31)) * 31);
    }
}
