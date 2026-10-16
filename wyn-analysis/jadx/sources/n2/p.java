package n2;

import N1.O;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final O f40893a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f40894b;

    public p(O o7, int[] iArr) {
        if (iArr.length == 0) {
            Q1.k.l("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f40893a = o7;
        this.f40894b = iArr;
    }
}
