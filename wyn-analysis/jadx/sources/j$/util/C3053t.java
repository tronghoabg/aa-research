package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3053t extends C2919n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.C2919n, java.util.List
    public final java.util.List subList(int i5, int i10) {
        return new C3053t(this.f37925b.subList(i5, i10));
    }

    private Object writeReplace() {
        return new C2919n(this.f37925b);
    }
}
