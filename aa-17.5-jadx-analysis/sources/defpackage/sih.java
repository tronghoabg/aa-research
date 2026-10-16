package defpackage;

/* loaded from: classes2.dex */
public final class sih extends sig {
    private final long b;
    private final long c;

    public sih(int i, int i2, int i3) {
        super(i);
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.sig, defpackage.sid
    public final long a(long j) {
        return super.a(Math.max(Math.min(j, this.c), this.b));
    }

    @Override // defpackage.sig
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sih) && this.a == ((sih) obj).a;
    }
}
