package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ewu {
    private final ewv a;
    private final List b;
    private final List c;
    private final int d;
    private List e;

    public ewu(ewv ewvVar, List list, List list2, int i) {
        this.a = ewvVar;
        this.b = list;
        this.c = list2;
        this.d = i;
    }

    public final List a() {
        List listF = this.e;
        if (listF == null) {
            afbt afbtVar = new afbt(10);
            afbtVar.addAll(this.b);
            ewv ewvVar = this.a;
            if (ewvVar != null) {
                afbtVar.add(ewvVar);
            }
            afbtVar.addAll(this.c);
            listF = afbtVar.f();
            this.e = listF;
        }
        listF.getClass();
        return listF;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ewu ewuVar = (ewu) obj;
        return this.d == ewuVar.d && affa.f(a(), ewuVar.a());
    }

    public final int hashCode() {
        return (this.d * 31) + a().hashCode();
    }

    public final String toString() {
        return "NavigationEventHistory(currentIndex=" + this.d + ", mergedHistory=" + a() + ")";
    }

    public ewu() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ewu(byte[] bArr) {
        afbe afbeVar = afbe.a;
        this(null, afbeVar, afbeVar, -1);
    }
}
