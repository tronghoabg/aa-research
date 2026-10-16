package U1;

import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;
import n2.C3583f;
import n2.C3586i;

/* renamed from: U1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0846p implements Q1.g, n2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3586i f12113a;

    public /* synthetic */ C0846p(C3586i c3586i) {
        this.f12113a = c3586i;
    }

    @Override // n2.l
    public e0 c(int i5, N1.O o7, int[] iArr) {
        C3406H c3406hI = AbstractC3409K.i();
        int i10 = 0;
        while (i10 < o7.f8073a) {
            int i11 = i5;
            N1.O o10 = o7;
            c3406hI.a(new C3583f(i11, o10, i10, this.f12113a, iArr[i10]));
            i10++;
            i5 = i11;
            o7 = o10;
        }
        return c3406hI.g();
    }

    @Override // Q1.g
    public void invoke(Object obj) {
        ((N1.H) obj).n(this.f12113a);
    }
}
