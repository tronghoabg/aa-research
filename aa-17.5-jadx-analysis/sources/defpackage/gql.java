package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gql implements hju {
    public final aiyk a;
    public final aiyk b;
    public final aiyk c;
    public final aiyk d;
    public final aiyk e;
    public final aiyk f;
    public final boolean g;

    public gql() {
        this(ajac.a(null), ajac.a(Float.valueOf(BitmapDescriptorFactory.HUE_RED)), ajac.a(new dww((afck) null, 3, (short[]) null)), ajac.a(new gqm(null, null)), ajac.a(true), ajac.a(false), false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gql)) {
            return false;
        }
        gql gqlVar = (gql) obj;
        return affa.f(this.a, gqlVar.a) && affa.f(this.b, gqlVar.b) && affa.f(this.c, gqlVar.c) && affa.f(this.d, gqlVar.d) && affa.f(this.e, gqlVar.e) && affa.f(this.f, gqlVar.f) && this.g == gqlVar.g;
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + a.f(this.g);
    }

    public final String toString() {
        return "PlaybackProgressUiModel(timeFlow=" + this.a + ", progressFlow=" + this.b + ", seekActionFlow=" + this.c + ", seekbarColorsFlow=" + this.d + ", isSeekableFlow=" + this.e + ", isPlayingFlow=" + this.f + ", expressive=" + this.g + ")";
    }

    public gql(aiyk aiykVar, aiyk aiykVar2, aiyk aiykVar3, aiyk aiykVar4, aiyk aiykVar5, aiyk aiykVar6, boolean z) {
        aiykVar.getClass();
        aiykVar2.getClass();
        aiykVar3.getClass();
        aiykVar4.getClass();
        aiykVar5.getClass();
        this.a = aiykVar;
        this.b = aiykVar2;
        this.c = aiykVar3;
        this.d = aiykVar4;
        this.e = aiykVar5;
        this.f = aiykVar6;
        this.g = z;
    }
}
