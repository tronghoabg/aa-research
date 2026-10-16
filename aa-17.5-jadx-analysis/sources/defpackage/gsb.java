package defpackage;

import androidx.car.app.model.CarText;
import java.util.List;

/* loaded from: classes2.dex */
public final class gsb implements gmw {
    public final boolean a;
    public final fzg b;
    public final CarText c;
    public final CarText d;
    public final fzy e;
    public final List f;
    public final boolean g;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ gsb(boolean z, fzg fzgVar, CarText carText, List list, int i) {
        List list2 = (i & 32) != 0 ? afbe.a : list;
        int i2 = i & 4;
        int i3 = i & 2;
        int i4 = i & 1;
        CarText carText2 = i2 != 0 ? null : carText;
        this(1 == ((z ? 1 : 0) | i4), i3 == 0 ? fzgVar : null, carText2, null, null, list2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsb)) {
            return false;
        }
        gsb gsbVar = (gsb) obj;
        return this.a == gsbVar.a && affa.f(this.b, gsbVar.b) && affa.f(this.c, gsbVar.c) && affa.f(this.d, gsbVar.d) && affa.f(this.e, gsbVar.e) && affa.f(this.f, gsbVar.f) && this.g == gsbVar.g;
    }

    public final int hashCode() {
        fzg fzgVar = this.b;
        int iHashCode = fzgVar == null ? 0 : fzgVar.hashCode();
        boolean z = this.a;
        CarText carText = this.c;
        int iHashCode2 = carText == null ? 0 : carText.hashCode();
        int iF = (a.f(z) * 31) + iHashCode;
        CarText carText2 = this.d;
        int iHashCode3 = ((((iF * 31) + iHashCode2) * 31) + (carText2 == null ? 0 : carText2.hashCode())) * 31;
        fzy fzyVar = this.e;
        return ((((iHashCode3 + (fzyVar != null ? fzyVar.hashCode() : 0)) * 31) + this.f.hashCode()) * 31) + a.f(this.g);
    }

    public final String toString() {
        return "MessageTemplateInternal(isLongMessage=" + this.a + ", header=" + this.b + ", message=" + this.c + ", debugMessage=" + this.d + ", messageIcon=" + this.e + ", actions=" + this.f + ", isLoading=" + this.g + ")";
    }

    public gsb(boolean z, fzg fzgVar, CarText carText, CarText carText2, fzy fzyVar, List list, boolean z2) {
        list.getClass();
        this.a = z;
        this.b = fzgVar;
        this.c = carText;
        this.d = carText2;
        this.e = fzyVar;
        this.f = list;
        this.g = z2;
    }

    public gsb() {
        this(false, null, null, null, 127);
    }
}
