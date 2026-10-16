package N9;

import E5.C0441b;
import com.google.firebase.inappmessaging.model.MessageType;

/* loaded from: classes4.dex */
public final class i extends h {

    /* renamed from: c, reason: collision with root package name */
    public final l f8624c;

    /* renamed from: d, reason: collision with root package name */
    public final l f8625d;

    /* renamed from: e, reason: collision with root package name */
    public final f f8626e;

    /* renamed from: f, reason: collision with root package name */
    public final a f8627f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8628g;

    public i(C0441b c0441b, l lVar, l lVar2, f fVar, a aVar, String str) {
        super(c0441b, MessageType.MODAL);
        this.f8624c = lVar;
        this.f8625d = lVar2;
        this.f8626e = fVar;
        this.f8627f = aVar;
        this.f8628g = str;
    }

    @Override // N9.h
    public final f a() {
        return this.f8626e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (hashCode() != iVar.hashCode()) {
            return false;
        }
        l lVar = iVar.f8625d;
        l lVar2 = this.f8625d;
        if ((lVar2 == null && lVar != null) || (lVar2 != null && !lVar2.equals(lVar))) {
            return false;
        }
        a aVar = iVar.f8627f;
        a aVar2 = this.f8627f;
        if ((aVar2 == null && aVar != null) || (aVar2 != null && !aVar2.equals(aVar))) {
            return false;
        }
        f fVar = iVar.f8626e;
        f fVar2 = this.f8626e;
        return (fVar2 != null || fVar == null) && (fVar2 == null || fVar2.equals(fVar)) && this.f8624c.equals(iVar.f8624c) && this.f8628g.equals(iVar.f8628g);
    }

    public final int hashCode() {
        l lVar = this.f8625d;
        int iHashCode = lVar != null ? lVar.hashCode() : 0;
        a aVar = this.f8627f;
        int iHashCode2 = aVar != null ? aVar.hashCode() : 0;
        f fVar = this.f8626e;
        return this.f8628g.hashCode() + this.f8624c.hashCode() + iHashCode + iHashCode2 + (fVar != null ? fVar.f8619a.hashCode() : 0);
    }
}
