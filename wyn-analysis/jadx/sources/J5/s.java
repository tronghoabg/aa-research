package J5;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final u f5678a;

    /* renamed from: b, reason: collision with root package name */
    public final u f5679b;

    public s(u uVar, u uVar2) {
        this.f5678a = uVar;
        this.f5679b = uVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s.class == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f5678a.equals(sVar.f5678a) && this.f5679b.equals(sVar.f5679b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5679b.hashCode() + (this.f5678a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("[");
        u uVar = this.f5678a;
        sb2.append(uVar);
        u uVar2 = this.f5679b;
        if (uVar.equals(uVar2)) {
            str = "";
        } else {
            str = ", " + uVar2;
        }
        return wg.b.c(sb2, str, "]");
    }
}
