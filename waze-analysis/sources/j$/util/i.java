package j$.util;

import java.util.RandomAccess;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class i extends g implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new g(this.f50247c);
    }

    @Override // j$.util.g, java.util.List
    public final java.util.List subList(int i2, int i3) {
        i iVar;
        synchronized (this.f50226b) {
            iVar = new i(this.f50247c.subList(i2, i3), this.f50226b);
        }
        return iVar;
    }
}
