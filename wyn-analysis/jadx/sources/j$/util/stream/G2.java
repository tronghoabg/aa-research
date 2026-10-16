package j$.util.stream;

import java.util.Comparator;

/* loaded from: classes2.dex */
abstract class G2 extends AbstractC2992n2 {

    /* renamed from: b, reason: collision with root package name */
    protected final Comparator f37994b;

    /* renamed from: c, reason: collision with root package name */
    protected boolean f37995c;

    G2(InterfaceC3011r2 interfaceC3011r2, Comparator comparator) {
        super(interfaceC3011r2);
        this.f37994b = comparator;
    }

    @Override // j$.util.stream.AbstractC2992n2, j$.util.stream.InterfaceC3011r2
    public final boolean n() {
        this.f37995c = true;
        return false;
    }
}
