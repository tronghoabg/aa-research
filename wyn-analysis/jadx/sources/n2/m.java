package n2;

import N1.C0765n;
import N1.O;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f40867a;

    /* renamed from: b, reason: collision with root package name */
    public final O f40868b;

    /* renamed from: c, reason: collision with root package name */
    public final int f40869c;

    /* renamed from: d, reason: collision with root package name */
    public final C0765n f40870d;

    public m(int i5, O o7, int i10) {
        this.f40867a = i5;
        this.f40868b = o7;
        this.f40869c = i10;
        this.f40870d = o7.f8076d[i10];
    }

    public abstract int a();

    public abstract boolean b(m mVar);
}
