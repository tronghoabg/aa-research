package androidx.core.util;

import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PairKt {
    public static final <F, S> F component1(android.util.Pair<F, S> pair) {
        x.f(pair, "<this>");
        return (F) pair.first;
    }

    public static final <F, S> S component2(android.util.Pair<F, S> pair) {
        x.f(pair, "<this>");
        return (S) pair.second;
    }

    public static final <F, S> android.util.Pair<F, S> toAndroidPair(k<? extends F, ? extends S> kVar) {
        x.f(kVar, "<this>");
        return new android.util.Pair<>(kVar.c(), kVar.d());
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(k<? extends F, ? extends S> kVar) {
        x.f(kVar, "<this>");
        return new Pair<>(kVar.c(), kVar.d());
    }

    public static final <F, S> k<F, S> toKotlinPair(android.util.Pair<F, S> pair) {
        x.f(pair, "<this>");
        return new k<>(pair.first, pair.second);
    }

    public static final <F, S> F component1(Pair<F, S> pair) {
        x.f(pair, "<this>");
        return pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        x.f(pair, "<this>");
        return pair.second;
    }

    public static final <F, S> k<F, S> toKotlinPair(Pair<F, S> pair) {
        x.f(pair, "<this>");
        return new k<>(pair.first, pair.second);
    }
}
