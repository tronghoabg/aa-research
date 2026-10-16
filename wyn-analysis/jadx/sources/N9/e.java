package N9;

import E5.C0441b;
import com.google.firebase.inappmessaging.model.MessageType;

/* loaded from: classes4.dex */
public final class e extends h {

    /* renamed from: c, reason: collision with root package name */
    public final l f8612c;

    /* renamed from: d, reason: collision with root package name */
    public final l f8613d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8614e;

    /* renamed from: f, reason: collision with root package name */
    public final a f8615f;

    /* renamed from: g, reason: collision with root package name */
    public final a f8616g;

    /* renamed from: h, reason: collision with root package name */
    public final f f8617h;

    /* renamed from: i, reason: collision with root package name */
    public final f f8618i;

    public e(C0441b c0441b, l lVar, l lVar2, f fVar, f fVar2, String str, a aVar, a aVar2) {
        super(c0441b, MessageType.CARD);
        this.f8612c = lVar;
        this.f8613d = lVar2;
        this.f8617h = fVar;
        this.f8618i = fVar2;
        this.f8614e = str;
        this.f8615f = aVar;
        this.f8616g = aVar2;
    }

    @Override // N9.h
    public final f a() {
        return this.f8617h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (hashCode() != eVar.hashCode()) {
            return false;
        }
        l lVar = eVar.f8613d;
        l lVar2 = this.f8613d;
        if ((lVar2 == null && lVar != null) || (lVar2 != null && !lVar2.equals(lVar))) {
            return false;
        }
        a aVar = eVar.f8616g;
        a aVar2 = this.f8616g;
        if ((aVar2 == null && aVar != null) || (aVar2 != null && !aVar2.equals(aVar))) {
            return false;
        }
        f fVar = eVar.f8617h;
        f fVar2 = this.f8617h;
        if ((fVar2 == null && fVar != null) || (fVar2 != null && !fVar2.equals(fVar))) {
            return false;
        }
        f fVar3 = eVar.f8618i;
        f fVar4 = this.f8618i;
        return (fVar4 != null || fVar3 == null) && (fVar4 == null || fVar4.equals(fVar3)) && this.f8612c.equals(eVar.f8612c) && this.f8615f.equals(eVar.f8615f) && this.f8614e.equals(eVar.f8614e);
    }

    public final int hashCode() {
        l lVar = this.f8613d;
        int iHashCode = lVar != null ? lVar.hashCode() : 0;
        a aVar = this.f8616g;
        int iHashCode2 = aVar != null ? aVar.hashCode() : 0;
        f fVar = this.f8617h;
        int iHashCode3 = fVar != null ? fVar.f8619a.hashCode() : 0;
        f fVar2 = this.f8618i;
        return this.f8615f.hashCode() + this.f8614e.hashCode() + this.f8612c.hashCode() + iHashCode + iHashCode2 + iHashCode3 + (fVar2 != null ? fVar2.f8619a.hashCode() : 0);
    }
}
