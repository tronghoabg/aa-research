package L4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class y implements B4.e, C4.g {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f6938a;

    public y(ByteBuffer byteBuffer) {
        this.f6938a = byteBuffer;
    }

    @Override // C4.g
    public Object b() {
        ByteBuffer byteBuffer = this.f6938a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // B4.e
    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l10 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f6938a) {
            this.f6938a.position(0);
            messageDigest.update(this.f6938a.putLong(l10.longValue()).array());
        }
    }

    public y() {
        this.f6938a = ByteBuffer.allocate(8);
    }

    @Override // C4.g
    public void a() {
    }
}
