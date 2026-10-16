package z4;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: z4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4614d extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4615e f48361a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4614d(C4615e c4615e, int i5) {
        super(i5);
        this.f48361a = c4615e;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i5 = ((ByteArrayOutputStream) this).count;
        if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
            i5--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i5, this.f48361a.f48363b.name());
        } catch (UnsupportedEncodingException e7) {
            throw new AssertionError(e7);
        }
    }
}
