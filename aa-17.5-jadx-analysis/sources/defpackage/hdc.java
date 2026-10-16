package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hdc implements hju {
    public final List a;
    public final gcb b;

    static {
        int i = gcb.c;
    }

    public hdc(List list, gcb gcbVar) {
        list.getClass();
        this.a = list;
        this.b = gcbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdc)) {
            return false;
        }
        hdc hdcVar = (hdc) obj;
        return affa.f(this.a, hdcVar.a) && affa.f(this.b, hdcVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        gcb gcbVar = this.b;
        return iHashCode + (gcbVar == null ? 0 : gcbVar.hashCode());
    }

    public final String toString() {
        return "RowBelowUiModel(actions=" + this.a + ", progressIndicator=" + this.b + ")";
    }

    public hdc() {
        this((List) null, 3);
    }

    public /* synthetic */ hdc(List list, int i) {
        this((i & 1) != 0 ? afbe.a : list, (gcb) null);
    }
}
