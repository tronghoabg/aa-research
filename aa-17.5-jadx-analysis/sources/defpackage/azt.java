package defpackage;

/* loaded from: classes.dex */
public final class azt {
    public afec a;
    public int d;
    public sji f;
    public final epk e = new epk((byte[]) null);
    public int b = -1;
    public int c = -1;

    public azt(afec afecVar) {
        this.a = afecVar;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [bah, java.lang.Object] */
    public final azs a(int i, long j, boolean z, afec afecVar) {
        sji sjiVar = this.f;
        if (sjiVar == null) {
            return ayl.a;
        }
        epk epkVar = this.e;
        ?? r8 = sjiVar.c;
        boolean z2 = r8 instanceof ayd;
        if (z2) {
        }
        bag bagVar = new bag(sjiVar, i, j, epkVar, afecVar);
        if (!z2) {
            r8.c(bagVar);
        } else if (z) {
            ((ayd) r8).c(bagVar);
        } else {
            ayd aydVar = (ayd) r8;
            aydVar.b.add(new abmz(0, bagVar));
            aydVar.a();
        }
        vs.i("compose:lazy:schedule_prefetch:index", i);
        return bagVar;
    }

    public azt() {
    }
}
