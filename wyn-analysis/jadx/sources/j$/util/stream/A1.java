package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
class A1 extends CountedCompleter {

    /* renamed from: a, reason: collision with root package name */
    protected final K0 f37947a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f37948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37949c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f37950d;

    public A1(K0 k02, Object obj, int i5) {
        this.f37949c = i5;
        this.f37947a = k02;
        this.f37948b = 0;
        this.f37950d = obj;
    }

    A1(A1 a12, K0 k02, int i5, byte b5) {
        super(a12);
        this.f37947a = k02;
        this.f37948b = i5;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        A1 a1A = this;
        while (a1A.f37947a.q() != 0) {
            a1A.setPendingCount(a1A.f37947a.q() - 1);
            int i5 = 0;
            int iCount = 0;
            while (i5 < a1A.f37947a.q() - 1) {
                A1 a1A2 = a1A.a(i5, a1A.f37948b + iCount);
                iCount = (int) (iCount + a1A2.f37947a.count());
                a1A2.fork();
                i5++;
            }
            a1A = a1A.a(i5, a1A.f37948b + iCount);
        }
        switch (a1A.f37949c) {
            case 0:
                ((J0) a1A.f37947a).r(a1A.f37948b, a1A.f37950d);
                break;
            default:
                a1A.f37947a.i((Object[]) a1A.f37950d, a1A.f37948b);
                break;
        }
        a1A.propagateCompletion();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, K0 k02, int i5) {
        this(a12, k02, i5, (byte) 0);
        this.f37949c = 1;
        this.f37950d = (Object[]) a12.f37950d;
    }

    final A1 a(int i5, int i10) {
        switch (this.f37949c) {
            case 0:
                return new A1(this, ((J0) this.f37947a).b(i5), i10);
            default:
                return new A1(this, this.f37947a.b(i5), i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a12, J0 j02, int i5) {
        this(a12, j02, i5, (byte) 0);
        this.f37949c = 0;
        this.f37950d = a12.f37950d;
    }
}
