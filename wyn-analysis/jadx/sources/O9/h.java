package o9;

import java.util.ArrayList;
import s9.o;

/* loaded from: classes4.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final s9.h f41452a;

    /* renamed from: b, reason: collision with root package name */
    public final o f41453b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41454c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f41455d;

    public h(s9.h hVar, o oVar, boolean z2, ArrayList arrayList) {
        this.f41452a = hVar;
        this.f41453b = oVar;
        this.f41454c = z2;
        this.f41455d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f41454c == hVar.f41454c && this.f41452a.equals(hVar.f41452a) && this.f41453b.equals(hVar.f41453b)) {
            return this.f41455d.equals(hVar.f41455d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41455d.hashCode() + ((((this.f41453b.f45390a.hashCode() + (this.f41452a.f45375a.hashCode() * 31)) * 31) + (this.f41454c ? 1 : 0)) * 31);
    }
}
