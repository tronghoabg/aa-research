package defpackage;

/* loaded from: classes.dex */
public class afgy implements Iterable, afgc {
    public final int a;
    public final int b;
    public final int c;

    public afgy(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        this.a = i;
        this.b = affa.o(i, i2, i3);
        this.c = i3;
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final afbk iterator() {
        return new afgz(this.a, this.b, this.c);
    }

    public boolean b() {
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        return i > 0 ? i2 > i3 : i2 < i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof afgy) {
            if (b() && ((afgy) obj).b()) {
                return true;
            }
            afgy afgyVar = (afgy) obj;
            return this.a == afgyVar.a && this.b == afgyVar.b && this.c == afgyVar.c;
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            str = "..";
        } else {
            i = -i;
            sb = new StringBuilder();
            sb.append(i2);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i3);
        sb.append(" step ");
        sb.append(i);
        return sb.toString();
    }
}
