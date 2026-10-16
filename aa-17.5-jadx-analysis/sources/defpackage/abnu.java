package defpackage;

/* loaded from: classes.dex */
public final class abnu implements Comparable {
    final aboa a;
    public final int b;
    public final abqd c;
    public final boolean d;

    public abnu(aboa aboaVar, int i, abqd abqdVar, boolean z) {
        this.a = aboaVar;
        this.b = i;
        this.c = abqdVar;
        this.d = z;
    }

    public static final void b(Object obj, Object obj2) {
        ((abnp) obj).w((abnv) obj2);
    }

    public final abqe a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((abnu) obj).b;
    }
}
