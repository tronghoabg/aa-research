package A7;

import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: A7.x0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class CallableC0302x0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1108b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1109c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1110d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC0287s0 f1111e;

    public /* synthetic */ CallableC0302x0(BinderC0287s0 binderC0287s0, String str, String str2, String str3, int i5) {
        this.f1107a = i5;
        this.f1108b = str;
        this.f1109c = str2;
        this.f1110d = str3;
        this.f1111e = binderC0287s0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        switch (this.f1107a) {
            case 0:
                BinderC0287s0 binderC0287s0 = this.f1111e;
                binderC0287s0.f1045a.Z();
                C0257i c0257i = binderC0287s0.f1045a.f569c;
                L1.m(c0257i);
                return c0257i.U0(this.f1108b, this.f1109c, this.f1110d);
            case 1:
                BinderC0287s0 binderC0287s02 = this.f1111e;
                binderC0287s02.f1045a.Z();
                C0257i c0257i2 = binderC0287s02.f1045a.f569c;
                L1.m(c0257i2);
                return c0257i2.U0(this.f1108b, this.f1109c, this.f1110d);
            case 2:
                BinderC0287s0 binderC0287s03 = this.f1111e;
                binderC0287s03.f1045a.Z();
                C0257i c0257i3 = binderC0287s03.f1045a.f569c;
                L1.m(c0257i3);
                return c0257i3.w0(this.f1108b, this.f1109c, this.f1110d);
            default:
                BinderC0287s0 binderC0287s04 = this.f1111e;
                binderC0287s04.f1045a.Z();
                C0257i c0257i4 = binderC0287s04.f1045a.f569c;
                L1.m(c0257i4);
                return c0257i4.w0(this.f1108b, this.f1109c, this.f1110d);
        }
    }
}
