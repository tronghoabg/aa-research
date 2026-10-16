package t5;

import java.util.Arrays;
import q5.C3868c;

/* renamed from: t5.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4117l {

    /* renamed from: a, reason: collision with root package name */
    public final C3868c f45785a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f45786b;

    public C4117l(C3868c c3868c, byte[] bArr) {
        if (c3868c == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f45785a = c3868c;
        this.f45786b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4117l)) {
            return false;
        }
        C4117l c4117l = (C4117l) obj;
        if (this.f45785a.equals(c4117l.f45785a)) {
            return Arrays.equals(this.f45786b, c4117l.f45786b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f45785a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f45786b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f45785a + ", bytes=[...]}";
    }
}
