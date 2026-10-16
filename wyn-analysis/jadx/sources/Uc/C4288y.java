package uc;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: uc.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4288y implements InterfaceC4277n {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f46770a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final C4288y f46771b = new C4288y();

    public static String c(ByteBuffer byteBuffer) {
        byte[] bArrArray;
        int iArrayOffset;
        if (byteBuffer == null) {
            return null;
        }
        int iRemaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            iArrayOffset = byteBuffer.arrayOffset();
        } else {
            bArrArray = new byte[iRemaining];
            byteBuffer.get(bArrArray);
            iArrayOffset = 0;
        }
        return new String(bArrArray, iArrayOffset, iRemaining, f46770a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f46770a);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bytes.length);
        byteBufferAllocateDirect.put(bytes);
        return byteBufferAllocateDirect;
    }

    @Override // uc.InterfaceC4277n
    public final /* bridge */ /* synthetic */ ByteBuffer a(Object obj) {
        return d((String) obj);
    }

    @Override // uc.InterfaceC4277n
    public final /* bridge */ /* synthetic */ Object b(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }
}
