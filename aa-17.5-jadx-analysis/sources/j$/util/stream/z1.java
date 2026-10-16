package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* compiled from: r8-map-id-0db545a1816f6522bd043bab0833a69201cd7549f2fc493bab6c5617a32b09e4 */
/* loaded from: classes4.dex */
public abstract class z1 extends CountedCompleter {
    public final j0 a;
    public final int b;

    public z1(j0 j0Var) {
        this.a = j0Var;
        this.b = 0;
    }

    public abstract void a();

    public abstract z1 b(int i, int i2);

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        int i;
        while (this.a.l() != 0) {
            this.setPendingCount(this.a.l() - 1);
            int i2 = 0;
            int iCount = 0;
            while (true) {
                int iL = this.a.l() - 1;
                i = this.b;
                if (i2 < iL) {
                    z1 z1VarB = this.b(i2, i + iCount);
                    iCount = (int) (z1VarB.a.count() + iCount);
                    z1VarB.fork();
                    i2++;
                }
            }
            this = this.b(i2, i + iCount);
        }
        this.a();
        this.propagateCompletion();
    }

    public z1(z1 z1Var, j0 j0Var, int i) {
        super(z1Var);
        this.a = j0Var;
        this.b = i;
    }
}
