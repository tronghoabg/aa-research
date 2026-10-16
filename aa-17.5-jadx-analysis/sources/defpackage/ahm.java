package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ahm extends ahl {
    private final List a;
    private final int b;
    private final int c;

    public ahm(List list, int i) {
        Object obj;
        this.a = list;
        this.c = i;
        int iA = 0;
        if (i - 1 != 0) {
            int size = list.size();
            int iA2 = 0;
            while (iA < size) {
                iA2 += ((ahl) list.get(iA)).a();
                iA++;
            }
            iA = iA2;
        } else {
            if (list.isEmpty()) {
                obj = null;
            } else {
                Object obj2 = list.get(0);
                int iA3 = ((ahl) obj2).a();
                int iBh = woy.bh(list);
                if (iBh > 0) {
                    int i2 = 1;
                    while (true) {
                        Object obj3 = list.get(i2);
                        int iA4 = ((ahl) obj3).a();
                        int i3 = iA3 < iA4 ? iA4 : iA3;
                        obj2 = iA3 < iA4 ? obj3 : obj2;
                        if (i2 == iBh) {
                            break;
                        }
                        i2++;
                        iA3 = i3;
                    }
                }
                obj = obj2;
            }
            ahl ahlVar = (ahl) obj;
            if (ahlVar != null) {
                iA = ahlVar.a();
            }
        }
        this.b = iA;
    }

    @Override // defpackage.ahl
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ahl
    public final void c(aan aanVar, int i, int i2) {
        int i3 = this.c - 1;
        List list = this.a;
        int i4 = 0;
        if (i3 == 0) {
            int size = list.size();
            while (i4 < size) {
                ((ahl) list.get(i4)).c(aanVar, i, i2);
                i4++;
            }
            return;
        }
        int size2 = list.size();
        while (i4 < size2) {
            ahl ahlVar = (ahl) list.get(i4);
            ahlVar.c(aanVar, i, i2);
            i2 += ahlVar.a();
            i4++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahm)) {
            return false;
        }
        ahm ahmVar = (ahm) obj;
        return affa.f(this.a, ahmVar.a) && this.c == ahmVar.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimatorSet(animators=");
        sb.append(this.a);
        sb.append(", ordering=");
        sb.append((Object) (this.c != 1 ? "Sequentially" : "Together"));
        sb.append(")");
        return sb.toString();
    }
}
