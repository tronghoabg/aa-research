package R8;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final String f10453b = g.h(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicLong f10454c = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f10455a;

    public e() {
        long time = new Date().getTime();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) (time / 1000));
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        byte[] bArrArray = byteBufferAllocate.array();
        byte b5 = bArrArray[0];
        byte b10 = bArrArray[1];
        byte b11 = bArrArray[2];
        byte b12 = bArrArray[3];
        byte[] bArrA = a(time % 1000);
        byte b13 = bArrA[0];
        byte b14 = bArrA[1];
        byte[] bArrA2 = a(f10454c.incrementAndGet());
        byte b15 = bArrA2[0];
        byte b16 = bArrA2[1];
        byte[] bArrA3 = a(Integer.valueOf(Process.myPid()).shortValue());
        String strE = g.e(new byte[]{b5, b10, b11, b12, b13, b14, b15, b16, bArrA3[0], bArrA3[1]});
        Locale locale = Locale.US;
        this.f10455a = String.format(locale, "%s%s%s%s", strE.substring(0, 12), strE.substring(12, 16), strE.subSequence(16, 20), f10453b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j8) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j8);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public final String toString() {
        return this.f10455a;
    }
}
