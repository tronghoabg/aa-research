package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class aacw {
    public static final Comparator a = new tui(15);
    public static final Comparator b = new tui(16);
    public final trv c;
    public final too d;
    public final String e;
    public final int f;
    public float g;
    public boolean h = false;

    public aacw(trv trvVar, int i, too tooVar, String str) {
        this.c = trvVar;
        this.f = Integer.MIN_VALUE ^ i;
        this.d = tooVar;
        this.e = str;
    }

    public final void a() {
        this.h = true;
    }

    public final void b() {
        this.h = false;
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.e("zWithinGrade", this.f);
        zsaVarA.b("featureLocation", this.d);
        zsaVarA.b("featureId", this.e);
        zsaVarA.d("squaredDistanceToPickLocation", this.g);
        zsaVarA.g("hasBeenSelectedThisCycle", this.h);
        return zsaVarA.toString();
    }
}
