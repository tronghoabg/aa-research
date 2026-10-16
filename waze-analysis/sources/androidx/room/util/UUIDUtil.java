package androidx.room.util;

import h.g.b.x;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class UUIDUtil {
    public static final UUID convertByteToUUID(byte[] bArr) {
        x.f(bArr, "bytes");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    public static final byte[] convertUUIDToByte(UUID uuid) {
        x.f(uuid, "uuid");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        x.e(bArrArray, "array(...)");
        return bArrArray;
    }
}
