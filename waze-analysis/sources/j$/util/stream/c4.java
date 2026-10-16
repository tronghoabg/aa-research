package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class c4 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    public final m2 f50350a;

    /* renamed from: b, reason: collision with root package name */
    public final int f50351b;

    public c4(m2 m2Var) {
        this.f50350a = m2Var;
        this.f50351b = 0;
    }

    public abstract void a();

    public abstract c4 b(int i2, int i3);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i2;
        while (this.f50350a.s() != 0) {
            this.setPendingCount(this.f50350a.s() - 1);
            int i3 = 0;
            int iCount = 0;
            while (true) {
                int iS = this.f50350a.s() - 1;
                i2 = this.f50351b;
                if (i3 < iS) {
                    c4 c4VarB = this.b(i3, i2 + iCount);
                    iCount = (int) (c4VarB.f50350a.count() + iCount);
                    c4VarB.fork();
                    i3++;
                }
            }
            this = this.b(i3, i2 + iCount);
        }
        this.a();
        this.propagateCompletion();
    }

    public c4(c4 c4Var, m2 m2Var, int i2) {
        super(c4Var);
        this.f50350a = m2Var;
        this.f50351b = i2;
    }
}
