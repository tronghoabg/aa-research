package defpackage;

/* loaded from: classes2.dex */
public abstract class aked extends akdx {
    private final akcm a;
    final long b;

    public aked(akch akchVar, long j) {
        super(akchVar);
        this.b = j;
        this.a = new akec(this, ((akcg) akchVar).a);
    }

    @Override // defpackage.akdx, defpackage.akcf
    public final akcm q() {
        return this.a;
    }

    public abstract long x(long j, long j2);
}
