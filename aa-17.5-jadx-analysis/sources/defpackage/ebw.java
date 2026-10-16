package defpackage;

import android.view.WindowInsetsAnimation;

/* loaded from: classes2.dex */
public final class ebw {
    public final dve a;
    public final dve b;

    public ebw(WindowInsetsAnimation.Bounds bounds) {
        this.a = dve.f(bounds.getLowerBound());
        this.b = dve.f(bounds.getUpperBound());
    }

    public final String toString() {
        return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
    }

    public ebw(dve dveVar, dve dveVar2) {
        this.a = dveVar;
        this.b = dveVar2;
    }
}
