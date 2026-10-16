package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class s extends n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new n(this.f50276b);
    }

    @Override // j$.util.n, java.util.List
    public final java.util.List subList(int i2, int i3) {
        return new s(this.f50276b.subList(i2, i3));
    }
}
