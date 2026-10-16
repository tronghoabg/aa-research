package o9;

import A.AbstractC0213f;
import p9.C3776A;

/* loaded from: classes4.dex */
public final class i implements c {

    /* renamed from: a, reason: collision with root package name */
    public final C3776A f41456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41457b;

    public i(C3776A c3776a, int i5) {
        this.f41456a = c3776a;
        this.f41457b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f41456a.equals(iVar.f41456a) && this.f41457b == iVar.f41457b;
    }

    public final int hashCode() {
        return AbstractC0213f.f(this.f41457b) + (this.f41456a.hashCode() * 31);
    }
}
