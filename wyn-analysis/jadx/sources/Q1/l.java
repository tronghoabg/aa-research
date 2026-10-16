package Q1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9689a;

    /* renamed from: b, reason: collision with root package name */
    public int f9690b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f9691c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(byte b5, int i5) {
        this(32);
        this.f9689a = i5;
        switch (i5) {
            case 1:
                this.f9691c = new long[32];
                break;
            default:
                break;
        }
    }

    public final void a(long j8) {
        switch (this.f9689a) {
            case 0:
                int i5 = this.f9690b;
                long[] jArr = this.f9691c;
                if (i5 == jArr.length) {
                    this.f9691c = Arrays.copyOf(jArr, i5 * 2);
                }
                long[] jArr2 = this.f9691c;
                int i10 = this.f9690b;
                this.f9690b = i10 + 1;
                jArr2[i10] = j8;
                break;
            default:
                int i11 = this.f9690b;
                long[] jArr3 = this.f9691c;
                if (i11 == jArr3.length) {
                    this.f9691c = Arrays.copyOf(jArr3, i11 * 2);
                }
                long[] jArr4 = this.f9691c;
                int i12 = this.f9690b;
                this.f9690b = i12 + 1;
                jArr4[i12] = j8;
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.f9690b + jArr.length;
        long[] jArr2 = this.f9691c;
        if (length > jArr2.length) {
            this.f9691c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f9691c, this.f9690b, jArr.length);
        this.f9690b = length;
    }

    public final long c(int i5) {
        switch (this.f9689a) {
            case 0:
                if (i5 >= 0 && i5 < this.f9690b) {
                    return this.f9691c[i5];
                }
                StringBuilder sbL = pd.f.l(i5, "Invalid index ", ", size is ");
                sbL.append(this.f9690b);
                throw new IndexOutOfBoundsException(sbL.toString());
            default:
                if (i5 >= 0 && i5 < this.f9690b) {
                    return this.f9691c[i5];
                }
                StringBuilder sbL2 = pd.f.l(i5, "Invalid index ", ", size is ");
                sbL2.append(this.f9690b);
                throw new IndexOutOfBoundsException(sbL2.toString());
        }
    }

    public l(int i5) {
        this.f9689a = 0;
        this.f9691c = new long[i5];
    }
}
