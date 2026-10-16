package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class gtb implements gmo {
    public final CarText a;
    public final CarText b;
    public final fzy c;
    public final gte d;
    public final List e;
    private final int f;

    public gtb(int i, CarText carText, CarText carText2, fzy fzyVar, gte gteVar, List list) {
        this.f = i;
        this.a = carText;
        this.b = carText2;
        this.c = fzyVar;
        this.d = gteVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtb)) {
            return false;
        }
        gtb gtbVar = (gtb) obj;
        return this.f == gtbVar.f && affa.f(this.a, gtbVar.a) && affa.f(this.b, gtbVar.b) && affa.f(this.c, gtbVar.c) && affa.f(this.d, gtbVar.d) && affa.f(this.e, gtbVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f * 31) + this.a.hashCode();
        CarText carText = this.b;
        int iHashCode2 = ((iHashCode * 31) + (carText == null ? 0 : carText.hashCode())) * 31;
        fzy fzyVar = this.c;
        return ((((iHashCode2 + (fzyVar != null ? fzyVar.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AlertInternal(id=" + this.f + ", title=" + this.a + ", subtitle=" + this.b + ", icon=" + this.c + ", mode=" + this.d + ", actions=" + this.e + ")";
    }
}
