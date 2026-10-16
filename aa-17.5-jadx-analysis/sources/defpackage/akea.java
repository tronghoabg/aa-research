package defpackage;

/* loaded from: classes2.dex */
public class akea extends akdy {
    private static final long serialVersionUID = 8019982251647420015L;
    public final akcm a;

    public akea(akcm akcmVar, akco akcoVar) {
        super(akcoVar);
        if (!akcmVar.f()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.a = akcmVar;
    }

    @Override // defpackage.akcm
    public long a(long j, int i) {
        return this.a.a(j, i);
    }

    @Override // defpackage.akcm
    public long b(long j, long j2) {
        return this.a.b(j, j2);
    }

    @Override // defpackage.akcm
    public long c() {
        return this.a.c();
    }

    @Override // defpackage.akcm
    public final boolean e() {
        return this.a.e();
    }
}
