package defpackage;

/* loaded from: classes3.dex */
public final class uep implements Comparable {
    public akce a = new akce(null);
    public final too b;
    private final toc c;

    public uep(toc tocVar, too tooVar) {
        this.c = tocVar;
        this.b = tooVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((uep) obj).a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uep)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.c.equals(((uep) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
