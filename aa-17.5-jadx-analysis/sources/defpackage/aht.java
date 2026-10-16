package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* loaded from: classes2.dex */
public final class aht extends ahl {
    private final int a;
    private final int b;
    private final int c;
    private final List d;
    private final int e;
    private final int f;

    public aht(int i, int i2, int i3, int i4, List list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.f = i4;
        this.d = list;
        this.e = i3 == -1 ? Alert.DURATION_SHOW_INDEFINITELY : (i * (i3 + 1)) + i2;
    }

    @Override // defpackage.ahl
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ahl
    public final void c(aan aanVar, int i, int i2) {
        List list = this.d;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            tv tvVar = (tv) list.get(i3);
            if (!(tvVar instanceof ahy)) {
                if (tvVar instanceof aib) {
                    Object obj = ((aib) tvVar).a;
                    ahr ahrVar = (ahr) aanVar.a(obj);
                    if (ahrVar == null) {
                        ahrVar = new ahr();
                    }
                    ahr ahrVar2 = ahrVar;
                    ahrVar2.a.add(new aig(i2 + this.b, this.a, this.c, this.f, tvVar));
                    aanVar.m(obj, ahrVar2);
                } else if (tvVar instanceof ahz) {
                    Object obj2 = ((ahz) tvVar).a;
                    ahn ahnVar = (ahn) aanVar.a(obj2);
                    if (ahnVar == null) {
                        ahnVar = new ahn();
                    }
                    ahn ahnVar2 = ahnVar;
                    ahnVar2.a.add(new aig(i2 + this.b, this.a, this.c, this.f, tvVar));
                    aanVar.m(obj2, ahnVar2);
                } else if (tvVar instanceof aid) {
                    Object obj3 = ((aid) tvVar).a;
                    ahv ahvVar = (ahv) aanVar.a(obj3);
                    if (ahvVar == null) {
                        ahvVar = new ahv();
                    }
                    ahv ahvVar2 = ahvVar;
                    ahvVar2.a.add(new aig(i2 + this.b, this.a, this.c, this.f, tvVar));
                    aanVar.m(obj3, ahvVar2);
                } else if (!(tvVar instanceof aic)) {
                    throw new aezs();
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aht)) {
            return false;
        }
        aht ahtVar = (aht) obj;
        return this.a == ahtVar.a && this.b == ahtVar.b && this.c == ahtVar.c && this.f == ahtVar.f && affa.f(this.d, ahtVar.d);
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.f) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectAnimator(duration=");
        sb.append(this.a);
        sb.append(", startDelay=");
        sb.append(this.b);
        sb.append(", repeatCount=");
        sb.append(this.c);
        sb.append(", repeatMode=");
        sb.append((Object) (this.f != 1 ? "Reverse" : "Restart"));
        sb.append(", holders=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
