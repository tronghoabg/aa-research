package T5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f11534e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f11535a;

    /* renamed from: b, reason: collision with root package name */
    public int f11536b;

    /* renamed from: c, reason: collision with root package name */
    public int f11537c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f11538d;

    public final void a(int i5, int i10, byte[] bArr) {
        if (this.f11535a) {
            int i11 = i10 - i5;
            byte[] bArr2 = this.f11538d;
            int length = bArr2.length;
            int i12 = this.f11536b + i11;
            if (length < i12) {
                this.f11538d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i5, this.f11538d, this.f11536b, i11);
            this.f11536b += i11;
        }
    }
}
