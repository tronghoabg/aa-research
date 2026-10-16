package N9;

import E5.C0441b;
import com.google.firebase.inappmessaging.model.MessageType;

/* loaded from: classes4.dex */
public final class c extends h {

    /* renamed from: c, reason: collision with root package name */
    public final l f8605c;

    /* renamed from: d, reason: collision with root package name */
    public final l f8606d;

    /* renamed from: e, reason: collision with root package name */
    public final f f8607e;

    /* renamed from: f, reason: collision with root package name */
    public final a f8608f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8609g;

    public c(C0441b c0441b, l lVar, l lVar2, f fVar, a aVar, String str) {
        super(c0441b, MessageType.BANNER);
        this.f8605c = lVar;
        this.f8606d = lVar2;
        this.f8607e = fVar;
        this.f8608f = aVar;
        this.f8609g = str;
    }

    @Override // N9.h
    public final f a() {
        return this.f8607e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (hashCode() != cVar.hashCode()) {
            return false;
        }
        l lVar = cVar.f8606d;
        l lVar2 = this.f8606d;
        if ((lVar2 == null && lVar != null) || (lVar2 != null && !lVar2.equals(lVar))) {
            return false;
        }
        f fVar = cVar.f8607e;
        f fVar2 = this.f8607e;
        if ((fVar2 == null && fVar != null) || (fVar2 != null && !fVar2.equals(fVar))) {
            return false;
        }
        a aVar = cVar.f8608f;
        a aVar2 = this.f8608f;
        return (aVar2 != null || aVar == null) && (aVar2 == null || aVar2.equals(aVar)) && this.f8605c.equals(cVar.f8605c) && this.f8609g.equals(cVar.f8609g);
    }

    public final int hashCode() {
        l lVar = this.f8606d;
        int iHashCode = lVar != null ? lVar.hashCode() : 0;
        f fVar = this.f8607e;
        int iHashCode2 = fVar != null ? fVar.f8619a.hashCode() : 0;
        a aVar = this.f8608f;
        return this.f8609g.hashCode() + this.f8605c.hashCode() + iHashCode + iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }
}
