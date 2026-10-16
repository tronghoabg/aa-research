package kg;

import j$.util.Objects;

/* loaded from: classes5.dex */
public final class g extends hg.d {

    /* renamed from: c, reason: collision with root package name */
    public int f39730c;

    public final void A0(byte[] bArr) {
        Objects.requireNonNull(bArr, "origin");
        this.f39730c = bArr.length;
        this.f36434b = new hg.a(bArr);
    }

    public final h z0() {
        hg.a aVar = this.f36434b;
        if (aVar != null) {
            return new h((byte[]) aVar.f36433b, this.f39730c);
        }
        throw new IllegalStateException("origin == null");
    }
}
