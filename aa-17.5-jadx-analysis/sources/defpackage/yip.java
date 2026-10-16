package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class yip {
    boolean a;
    int b = -1;
    int c = -1;
    yje d;
    yje e;
    xww f;

    final int a() {
        int i = this.c;
        if (i == -1) {
            return 4;
        }
        return i;
    }

    final int b() {
        int i = this.b;
        if (i == -1) {
            return 16;
        }
        return i;
    }

    public final yje c() {
        return (yje) woy.ap(this.d, yje.a);
    }

    public final yje d() {
        return (yje) woy.ap(this.e, yje.a);
    }

    public final ConcurrentMap e() {
        if (!this.a) {
            return new ConcurrentHashMap(b(), 0.75f, a());
        }
        int i = ykc.k;
        yje yjeVarC = c();
        yje yjeVar = yje.a;
        if (yjeVarC == yjeVar && d() == yjeVar) {
            return new ykc(this, yjh.a);
        }
        if (c() == yjeVar && d() == yje.b) {
            return new ykc(this, yjh.c);
        }
        yje yjeVarC2 = c();
        yje yjeVar2 = yje.b;
        if (yjeVarC2 == yjeVar2 && d() == yjeVar) {
            return new ykc(this, yjh.e);
        }
        if (c() == yjeVar2 && d() == yjeVar2) {
            return new ykc(this, yjh.f);
        }
        throw new AssertionError();
    }

    public final void f(xww xwwVar) {
        xww xwwVar2 = this.f;
        woy.ad(xwwVar2 == null, "key equivalence was already set to %s", xwwVar2);
        xwwVar.getClass();
        this.f = xwwVar;
        this.a = true;
    }

    final void g(yje yjeVar) {
        yje yjeVar2 = this.d;
        woy.ad(yjeVar2 == null, "Key strength was already set to %s", yjeVar2);
        this.d = yjeVar;
        if (yjeVar != yje.a) {
            this.a = true;
        }
    }

    public final void h() {
        g(yje.b);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        int i = this.b;
        if (i != -1) {
            xxgVarAo.f("initialCapacity", i);
        }
        int i2 = this.c;
        if (i2 != -1) {
            xxgVarAo.f("concurrencyLevel", i2);
        }
        yje yjeVar = this.d;
        if (yjeVar != null) {
            xxgVarAo.b("keyStrength", woy.ar(yjeVar.toString()));
        }
        yje yjeVar2 = this.e;
        if (yjeVar2 != null) {
            xxgVarAo.b("valueStrength", woy.ar(yjeVar2.toString()));
        }
        if (this.f != null) {
            xxgVarAo.a("keyEquivalence");
        }
        return xxgVarAo.toString();
    }
}
