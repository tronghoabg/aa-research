package bf;

import java.util.concurrent.Callable;

/* renamed from: bf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class CallableC1527b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19473a;

    public /* synthetic */ CallableC1527b(int i5) {
        this.f19473a = i5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f19473a) {
            case 0:
                return AbstractC1526a.f19472a;
            case 1:
                return AbstractC1528c.f19474a;
            case 2:
                return AbstractC1529d.f19475a;
            default:
                return AbstractC1530e.f19476a;
        }
    }
}
