package y1;

import Va.X7;
import java.nio.ByteBuffer;
import org.apache.tika.utils.StringUtils;
import z1.C4608a;
import z1.C4609b;

/* renamed from: y1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4528i {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f47933d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f47934a;

    /* renamed from: b, reason: collision with root package name */
    public final X7 f47935b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f47936c = 0;

    public C4528i(X7 x72, int i5) {
        this.f47935b = x72;
        this.f47934a = i5;
    }

    public final int a(int i5) {
        C4608a c4608aB = b();
        int iA = c4608aB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c4608aB.f35893d;
        int i10 = iA + c4608aB.f35890a;
        return byteBuffer.getInt((i5 * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final C4608a b() {
        ThreadLocal threadLocal = f47933d;
        C4608a c4608a = (C4608a) threadLocal.get();
        if (c4608a == null) {
            c4608a = new C4608a();
            threadLocal.set(c4608a);
        }
        C4609b c4609b = (C4609b) this.f47935b.f13841a;
        int iA = c4609b.a(6);
        if (iA != 0) {
            int i5 = iA + c4609b.f35890a;
            int i10 = (this.f47934a * 4) + ((ByteBuffer) c4609b.f35893d).getInt(i5) + i5 + 4;
            int i11 = ((ByteBuffer) c4609b.f35893d).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) c4609b.f35893d;
            c4608a.f35893d = byteBuffer;
            if (byteBuffer != null) {
                c4608a.f35890a = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                c4608a.f35891b = i12;
                c4608a.f35892c = ((ByteBuffer) c4608a.f35893d).getShort(i12);
                return c4608a;
            }
            c4608a.f35890a = 0;
            c4608a.f35891b = 0;
            c4608a.f35892c = 0;
        }
        return c4608a;
    }

    public final String toString() {
        int i5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        C4608a c4608aB = b();
        int iA = c4608aB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) c4608aB.f35893d).getInt(iA + c4608aB.f35890a) : 0));
        sb2.append(", codepoints:");
        C4608a c4608aB2 = b();
        int iA2 = c4608aB2.a(16);
        if (iA2 != 0) {
            int i10 = iA2 + c4608aB2.f35890a;
            i5 = ((ByteBuffer) c4608aB2.f35893d).getInt(((ByteBuffer) c4608aB2.f35893d).getInt(i10) + i10);
        } else {
            i5 = 0;
        }
        for (int i11 = 0; i11 < i5; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(StringUtils.SPACE);
        }
        return sb2.toString();
    }
}
