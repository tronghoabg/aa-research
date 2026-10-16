package defpackage;

/* loaded from: classes2.dex */
public final class guu extends guw {
    public final gab a;
    public final gab b;
    public final gfa c;
    public final gfa d;
    public final boolean e;
    private final boolean f;

    public /* synthetic */ guu(gab gabVar, gab gabVar2, gfa gfaVar, gfa gfaVar2, boolean z, int i) {
        gfaVar = (i & 4) != 0 ? gey.b : gfaVar;
        gfaVar2 = (i & 8) != 0 ? gey.b : gfaVar2;
        int i2 = i & 1;
        gabVar2 = (i & 2) != 0 ? null : gabVar2;
        gabVar = 1 == i2 ? null : gabVar;
        boolean z2 = (i & 16) == 0;
        gfaVar.getClass();
        gfaVar2.getClass();
        this.a = gabVar;
        this.b = gabVar2;
        this.c = gfaVar;
        this.d = gfaVar2;
        this.e = z & z2;
        this.f = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof guu)) {
            return false;
        }
        guu guuVar = (guu) obj;
        if (!affa.f(this.a, guuVar.a) || !affa.f(this.b, guuVar.b) || !affa.f(this.c, guuVar.c) || !affa.f(this.d, guuVar.d) || this.e != guuVar.e) {
            return false;
        }
        boolean z = guuVar.f;
        return true;
    }

    public final int hashCode() {
        gab gabVar = this.a;
        int iHashCode = gabVar == null ? 0 : gabVar.hashCode();
        gab gabVar2 = this.b;
        return (((((((((iHashCode * 31) + (gabVar2 == null ? 0 : gabVar2.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a.f(this.e)) * 31) + a.f(false);
    }

    public final String toString() {
        return "MinimizedTurnCardUiModel(laneImage=" + this.a + ", turnImage=" + this.b + ", turnDistance=" + this.c + ", cueText=" + this.d + ", horizontallyFlipTurnImage=" + this.e + ", showTurnDistanceAndCueOnSeparateLines=false)";
    }

    public guu() {
        this(null, null, null, null, false, 63);
    }
}
