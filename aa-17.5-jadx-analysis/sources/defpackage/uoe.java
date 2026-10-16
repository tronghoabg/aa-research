package defpackage;

/* loaded from: classes3.dex */
public final class uoe {
    public final tmb a;
    public final abgl b;
    public long c = (long) (Math.random() * 5000.0d);
    public long d;

    public uoe(tmb tmbVar, abgl abglVar) {
        this.a = tmbVar;
        this.b = abglVar;
        this.d = tmbVar.f().toEpochMilli() + this.c;
        ((ynz) ((ynz) uof.a.d()).ai(9492)).L("Backing off request for %s tile for %d ms", abglVar.name(), this.c);
    }
}
