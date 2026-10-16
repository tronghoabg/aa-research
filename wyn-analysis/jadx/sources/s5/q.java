package s5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q extends AbstractC3997C {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f45029a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f45030b;

    public q(byte[] bArr, byte[] bArr2) {
        this.f45029a = bArr;
        this.f45030b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3997C) {
            AbstractC3997C abstractC3997C = (AbstractC3997C) obj;
            boolean z2 = abstractC3997C instanceof q;
            if (Arrays.equals(this.f45029a, z2 ? ((q) abstractC3997C).f45029a : ((q) abstractC3997C).f45029a)) {
                if (Arrays.equals(this.f45030b, z2 ? ((q) abstractC3997C).f45030b : ((q) abstractC3997C).f45030b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f45029a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f45030b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f45029a) + ", encryptedBlob=" + Arrays.toString(this.f45030b) + "}";
    }
}
