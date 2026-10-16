package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class qpp implements qps {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ qpp(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.qps
    public final int a(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            int i3 = this.a;
            ypf ypfVar = qpt.a;
            return roc.T(i3, i);
        }
        if (i2 == 1) {
            int i4 = this.a;
            ypf ypfVar2 = qpt.a;
            return roc.S(i4, i);
        }
        int i5 = this.a;
        if (i2 != 2) {
            ypf ypfVar3 = qpt.a;
            return roc.T(i5, i);
        }
        ypf ypfVar4 = qpt.a;
        return roc.S(i5, i);
    }
}
