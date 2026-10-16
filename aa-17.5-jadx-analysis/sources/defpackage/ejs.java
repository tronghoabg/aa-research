package defpackage;

/* loaded from: classes2.dex */
public class ejs {
    protected volatile eke a;
    public volatile eip b;
    private volatile boolean c;

    public final int a() {
        int iC = this.b != null ? this.b.c() : this.a != null ? this.a.h() : 0;
        boolean z = eiw.e;
        return ((352 - (Integer.numberOfLeadingZeros(iC) * 9)) >>> 6) + iC;
    }

    public final eip b() {
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b != null) {
                return this.b;
            }
            if (this.a == null) {
                this.b = eip.b;
            } else {
                this.b = this.a.d();
            }
            return this.b;
        }
    }

    public final eke c(eke ekeVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = ekeVar;
                        this.b = eip.b;
                    } catch (ejp unused) {
                        this.c = true;
                        this.a = ekeVar;
                        this.b = eip.b;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejs)) {
            return false;
        }
        ejs ejsVar = (ejs) obj;
        eke ekeVar = this.a;
        eke ekeVar2 = ejsVar.a;
        return (ekeVar == null && ekeVar2 == null) ? b().equals(ejsVar.b()) : (ekeVar == null || ekeVar2 == null) ? ekeVar != null ? ekeVar.equals(ejsVar.c(ekeVar.f())) : c(ekeVar2.f()).equals(ekeVar2) : ekeVar.equals(ekeVar2);
    }

    public int hashCode() {
        return 1;
    }
}
