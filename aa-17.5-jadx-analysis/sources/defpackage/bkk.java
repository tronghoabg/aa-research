package defpackage;

/* loaded from: classes.dex */
public final class bkk {
    public final bkj a;
    public final bkj b;
    public final boolean c;

    public bkk(bkj bkjVar, bkj bkjVar2, boolean z) {
        this.a = bkjVar;
        this.b = bkjVar2;
        this.c = z;
    }

    public static /* synthetic */ bkk a(bkk bkkVar, bkj bkjVar, bkj bkjVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            bkjVar = bkkVar.a;
        }
        if ((i & 2) != 0) {
            bkjVar2 = bkkVar.b;
        }
        return new bkk(bkjVar, bkjVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkk)) {
            return false;
        }
        bkk bkkVar = (bkk) obj;
        return affa.f(this.a, bkkVar.a) && affa.f(this.b, bkkVar.b) && this.c == bkkVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.f(this.c);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ")";
    }
}
