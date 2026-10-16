package T5;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f11555f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f11556a;

    /* renamed from: b, reason: collision with root package name */
    public int f11557b;

    /* renamed from: c, reason: collision with root package name */
    public int f11558c;

    /* renamed from: d, reason: collision with root package name */
    public int f11559d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f11560e;

    public final void a(int i5, int i10, byte[] bArr) {
        if (this.f11556a) {
            int i11 = i10 - i5;
            byte[] bArr2 = this.f11560e;
            int length = bArr2.length;
            int i12 = this.f11558c + i11;
            if (length < i12) {
                this.f11560e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i5, this.f11560e, this.f11558c, i11);
            this.f11558c += i11;
        }
    }
}
