package Y2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f16454e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f16455a;

    /* renamed from: b, reason: collision with root package name */
    public int f16456b;

    /* renamed from: c, reason: collision with root package name */
    public int f16457c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f16458d;

    public final void a(int i5, int i10, byte[] bArr) {
        if (this.f16455a) {
            int i11 = i10 - i5;
            byte[] bArr2 = this.f16458d;
            int length = bArr2.length;
            int i12 = this.f16456b + i11;
            if (length < i12) {
                this.f16458d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i5, this.f16458d, this.f16456b, i11);
            this.f16456b += i11;
        }
    }
}
