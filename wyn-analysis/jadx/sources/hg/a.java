package hg;

import com.moloco.sdk.internal.publisher.H;
import j$.util.Objects;

/* loaded from: classes5.dex */
public final class a extends H {

    /* renamed from: b, reason: collision with root package name */
    public final Object f36433b;

    public a(byte[] bArr) {
        Objects.requireNonNull(bArr, "origin");
        this.f36433b = bArr;
    }

    public final String toString() {
        return a.class.getSimpleName() + "[" + this.f36433b.toString() + "]";
    }
}
