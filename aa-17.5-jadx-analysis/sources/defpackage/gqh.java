package defpackage;

/* loaded from: classes2.dex */
public final class gqh implements hju {
    public final aiyk a;
    public final aiyk b;
    public final aiyk c;
    public final aiyk d;
    public final gbg e;
    public final gbg f;
    public final boolean g;
    public final aiyk h;
    public final aiyk i;
    public final boolean j;

    public /* synthetic */ gqh(aiyk aiykVar, aiyk aiykVar2, aiyk aiykVar3, aiyk aiykVar4, int i) {
        this((i & 1) != 0 ? ajac.a(null) : aiykVar, (i & 2) != 0 ? ajac.a(null) : aiykVar2, (i & 4) != 0 ? ajac.a(null) : aiykVar3, (i & 8) != 0 ? ajac.a(afbe.a) : aiykVar4, null, null, false, ajac.a(null), ajac.a(false), false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqh)) {
            return false;
        }
        gqh gqhVar = (gqh) obj;
        return affa.f(this.a, gqhVar.a) && affa.f(this.b, gqhVar.b) && affa.f(this.c, gqhVar.c) && affa.f(this.d, gqhVar.d) && affa.f(this.e, gqhVar.e) && affa.f(this.f, gqhVar.f) && this.g == gqhVar.g && affa.f(this.h, gqhVar.h) && affa.f(this.i, gqhVar.i) && this.j == gqhVar.j;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        gbg gbgVar = this.e;
        int iHashCode2 = ((iHashCode * 31) + (gbgVar == null ? 0 : gbgVar.hashCode())) * 31;
        gbg gbgVar2 = this.f;
        return ((((((((iHashCode2 + (gbgVar2 != null ? gbgVar2.hashCode() : 0)) * 31) + a.f(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a.f(this.j);
    }

    public final String toString() {
        return "PlaybackControlsUiModel(playPauseStopButtonFlow=" + this.a + ", skipPrevButtonFlow=" + this.b + ", skipNextButtonFlow=" + this.c + ", customActionsFlow=" + this.d + ", overflowButtonIcon=" + this.e + ", closeButtonIcon=" + this.f + ", isLightDarkThemingEnabled=" + this.g + ", playPauseColorsFlow=" + this.h + ", isPlayingFlow=" + this.i + ", useActiveStyling=" + this.j + ")";
    }

    public gqh(aiyk aiykVar, aiyk aiykVar2, aiyk aiykVar3, aiyk aiykVar4, gbg gbgVar, gbg gbgVar2, boolean z, aiyk aiykVar5, aiyk aiykVar6, boolean z2) {
        aiykVar.getClass();
        aiykVar2.getClass();
        aiykVar3.getClass();
        aiykVar4.getClass();
        aiykVar5.getClass();
        this.a = aiykVar;
        this.b = aiykVar2;
        this.c = aiykVar3;
        this.d = aiykVar4;
        this.e = gbgVar;
        this.f = gbgVar2;
        this.g = z;
        this.h = aiykVar5;
        this.i = aiykVar6;
        this.j = z2;
    }

    public gqh() {
        this(null, null, null, null, 1023);
    }
}
