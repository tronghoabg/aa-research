package Y2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f16475f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f16476a;

    /* renamed from: b, reason: collision with root package name */
    public int f16477b;

    /* renamed from: c, reason: collision with root package name */
    public int f16478c;

    /* renamed from: d, reason: collision with root package name */
    public int f16479d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f16480e;

    public final void a(int i5, int i10, byte[] bArr) {
        if (this.f16476a) {
            int i11 = i10 - i5;
            byte[] bArr2 = this.f16480e;
            int length = bArr2.length;
            int i12 = this.f16478c + i11;
            if (length < i12) {
                this.f16480e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i5, this.f16480e, this.f16478c, i11);
            this.f16478c += i11;
        }
    }
}
