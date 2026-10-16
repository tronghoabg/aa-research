package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes2.dex */
final class hsx extends ByteArrayOutputStream {
    final /* synthetic */ hsy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsx(hsy hsyVar, int i) {
        super(i);
        this.a = hsyVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        try {
            return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, this.a.a.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
