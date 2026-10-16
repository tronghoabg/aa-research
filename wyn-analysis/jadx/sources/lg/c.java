package lg;

import com.applovin.shadow.okio.Segment;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c extends OutputStream {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f40290f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f40291a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f40292b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f40293c;

    /* renamed from: d, reason: collision with root package name */
    public int f40294d;

    /* renamed from: e, reason: collision with root package name */
    public int f40295e;

    public c() {
        a(Segment.SIZE);
    }

    public final void a(int i5) {
        int i10 = this.f40294d;
        ArrayList arrayList = this.f40291a;
        if (i10 < arrayList.size() - 1) {
            this.f40295e += this.f40293c.length;
            int i11 = this.f40294d + 1;
            this.f40294d = i11;
            this.f40293c = (byte[]) arrayList.get(i11);
            return;
        }
        byte[] bArr = this.f40293c;
        if (bArr == null) {
            this.f40295e = 0;
        } else {
            i5 = Math.max(bArr.length << 1, i5 - this.f40295e);
            this.f40295e += this.f40293c.length;
        }
        this.f40294d++;
        byte[] bArr2 = gg.c.f35914a;
        byte[] bArr3 = new byte[i5];
        this.f40293c = bArr3;
        arrayList.add(bArr3);
    }

    public final byte[] b() {
        int i5 = this.f40292b;
        if (i5 == 0) {
            return gg.c.f35914a;
        }
        byte[] bArr = gg.c.f35914a;
        byte[] bArr2 = new byte[i5];
        Iterator it = this.f40291a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            byte[] bArr3 = (byte[]) it.next();
            int iMin = Math.min(bArr3.length, i5);
            System.arraycopy(bArr3, 0, bArr2, i10, iMin);
            i10 += iMin;
            i5 -= iMin;
            if (i5 == 0) {
                break;
            }
        }
        return bArr2;
    }

    public final String toString() {
        return new String(b(), Charset.defaultCharset());
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i5, int i10) {
        int i11;
        if (i5 < 0 || i5 > bArr.length || i10 < 0 || (i11 = i5 + i10) > bArr.length || i11 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i5), Integer.valueOf(i10)));
        }
        if (i10 == 0) {
            return;
        }
        int i12 = this.f40292b;
        int i13 = i12 + i10;
        int i14 = i12 - this.f40295e;
        while (i10 > 0) {
            int iMin = Math.min(i10, this.f40293c.length - i14);
            System.arraycopy(bArr, i11 - i10, this.f40293c, i14, iMin);
            i10 -= iMin;
            if (i10 > 0) {
                a(i13);
                i14 = 0;
            }
        }
        this.f40292b = i13;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i5) {
        int i10 = this.f40292b;
        int i11 = i10 - this.f40295e;
        if (i11 == this.f40293c.length) {
            a(i10 + 1);
            i11 = 0;
        }
        this.f40293c[i11] = (byte) i5;
        this.f40292b++;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
