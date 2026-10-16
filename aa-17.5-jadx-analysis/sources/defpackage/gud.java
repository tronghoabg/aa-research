package defpackage;

/* loaded from: classes2.dex */
public final class gud implements hju {
    public static final int a;
    public final gfa b;
    public final deu c;
    public final hjw d;
    public final deu e;
    public final hjw f;
    public final gfa g;
    public final gab h;
    public final fwm i;
    public final boolean j;
    public final int k;

    static {
        hjw hjwVar = hjw.a;
        a = 8;
    }

    public /* synthetic */ gud(gfa gfaVar, deu deuVar, hjw hjwVar, deu deuVar2, hjw hjwVar2, gfa gfaVar2, gab gabVar, fwm fwmVar, int i, boolean z, int i2) {
        gfaVar = (i2 & 1) != 0 ? gey.b : gfaVar;
        deuVar = (i2 & 2) != 0 ? null : deuVar;
        hjwVar = (i2 & 4) != 0 ? null : hjwVar;
        deuVar2 = (i2 & 8) != 0 ? null : deuVar2;
        hjwVar2 = (i2 & 16) != 0 ? null : hjwVar2;
        gfaVar2 = (i2 & 32) != 0 ? gey.b : gfaVar2;
        gabVar = (i2 & 64) != 0 ? null : gabVar;
        fwmVar = (i2 & 128) != 0 ? null : fwmVar;
        i = (i2 & 256) != 0 ? 1 : i;
        boolean z2 = z & ((i2 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0);
        gfaVar.getClass();
        gfaVar2.getClass();
        if (i == 0) {
            throw null;
        }
        this.b = gfaVar;
        this.c = deuVar;
        this.d = hjwVar;
        this.e = deuVar2;
        this.f = hjwVar2;
        this.g = gfaVar2;
        this.h = gabVar;
        this.i = fwmVar;
        this.k = i;
        this.j = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gud)) {
            return false;
        }
        gud gudVar = (gud) obj;
        return affa.f(this.b, gudVar.b) && affa.f(this.c, gudVar.c) && affa.f(this.d, gudVar.d) && affa.f(this.e, gudVar.e) && affa.f(this.f, gudVar.f) && affa.f(this.g, gudVar.g) && affa.f(this.h, gudVar.h) && affa.f(this.i, gudVar.i) && this.k == gudVar.k && this.j == gudVar.j;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        deu deuVar = this.c;
        int iHashCode2 = (iHashCode + (deuVar == null ? 0 : deuVar.hashCode())) * 31;
        hjw hjwVar = this.d;
        int iHashCode3 = (iHashCode2 + (hjwVar == null ? 0 : hjwVar.hashCode())) * 31;
        deu deuVar2 = this.e;
        int iHashCode4 = (iHashCode3 + (deuVar2 == null ? 0 : deuVar2.hashCode())) * 31;
        hjw hjwVar2 = this.f;
        int iHashCode5 = (((iHashCode4 + (hjwVar2 == null ? 0 : hjwVar2.hashCode())) * 31) + this.g.hashCode()) * 31;
        gab gabVar = this.h;
        int iHashCode6 = (iHashCode5 + (gabVar == null ? 0 : gabVar.hashCode())) * 31;
        fwm fwmVar = this.i;
        return ((((iHashCode6 + (fwmVar != null ? fwmVar.hashCode() : 0)) * 31) + this.k) * 31) + a.f(this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EtaCardUiModel(eta=");
        sb.append(this.b);
        sb.append(", distanceRemaining=");
        sb.append((Object) this.c);
        sb.append(", distanceRemainingColor=");
        sb.append(this.d);
        sb.append(", timeRemaining=");
        sb.append((Object) this.e);
        sb.append(", timeRemainingColor=");
        sb.append(this.f);
        sb.append(", tripInfo=");
        sb.append(this.g);
        sb.append(", tripIcon=");
        sb.append(this.h);
        sb.append(", dismissButton=");
        sb.append(this.i);
        sb.append(", type=");
        int i = this.k;
        sb.append((Object) (i != 1 ? i != 2 ? "MINIMIZED_COMPACT" : "MINIMIZED" : "EXPANDED"));
        sb.append(", hideTripInfo=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }

    public gud() {
        this(null, null, null, null, null, null, null, null, 0, false, 1023);
    }
}
