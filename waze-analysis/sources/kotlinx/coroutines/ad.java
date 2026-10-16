package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ad extends h.c.a implements dc {

    /* renamed from: a, reason: collision with root package name */
    public static final h.c.f f51338a = new h.c.f(null);

    /* renamed from: b, reason: collision with root package name */
    private final long f51339b;

    public ad(long j2) {
        super(f51338a);
        this.f51339b = j2;
    }

    public final long a() {
        return this.f51339b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ad) && this.f51339b == ((ad) obj).f51339b;
    }

    public final int hashCode() {
        return a.a.b(this.f51339b);
    }

    @Override // kotlinx.coroutines.dc
    public final /* bridge */ /* synthetic */ void restoreThreadContext(h.c.j jVar, Object obj) {
        Thread.currentThread().setName((String) obj);
    }

    public final String toString() {
        return "CoroutineId(" + this.f51339b + ")";
    }

    @Override // kotlinx.coroutines.dc
    public final /* bridge */ /* synthetic */ Object updateThreadContext(h.c.j jVar) {
        String strA;
        ae aeVar = (ae) jVar.get(ae.f51340a);
        if (aeVar == null || (strA = aeVar.a()) == null) {
            strA = "coroutine";
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        int iAm = h.n.o.am(name, " @");
        if (iAm < 0) {
            iAm = name.length();
        }
        StringBuilder sb = new StringBuilder(strA.length() + iAm + 10);
        String strSubstring = name.substring(0, iAm);
        h.g.b.x.e(strSubstring, "substring(...)");
        sb.append(strSubstring);
        sb.append(" @");
        sb.append(strA);
        sb.append('#');
        sb.append(this.f51339b);
        threadCurrentThread.setName(sb.toString());
        return name;
    }
}
