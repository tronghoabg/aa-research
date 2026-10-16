package defpackage;

/* loaded from: classes3.dex */
public class afgu implements Iterable, afgc {
    public final char a;
    public final char b;
    private final int c = 1;

    public afgu(char c, char c2) {
        this.a = c;
        this.b = (char) affa.o(c, c2, 1);
    }

    @Override // java.lang.Iterable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final afbc iterator() {
        return new afbc(this.a, this.b);
    }

    public boolean b() {
        return this.a > this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof afgu) {
            if (b() && ((afgu) obj).b()) {
                return true;
            }
            afgu afguVar = (afgu) obj;
            if (this.a != afguVar.a || this.b != afguVar.b) {
                return false;
            }
            int i = afguVar.c;
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (b()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + 1;
    }

    public String toString() {
        return this.a + ".." + this.b + " step 1";
    }
}
