package uc;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import qf.C3893a;

/* renamed from: uc.x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4287x implements InterfaceC4282s {

    /* renamed from: b, reason: collision with root package name */
    public static final C4287x f46768b = new C4287x(C4286w.f46765a);

    /* renamed from: a, reason: collision with root package name */
    public final C4286w f46769a;

    public C4287x(C4286w c4286w) {
        this.f46769a = c4286w;
    }

    @Override // uc.InterfaceC4282s
    public final C4278o a(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        C4286w c4286w = this.f46769a;
        Object objE = c4286w.e(byteBuffer);
        Object objE2 = c4286w.e(byteBuffer);
        if (!(objE instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new C4278o((String) objE, objE2);
    }

    @Override // uc.InterfaceC4282s
    public final ByteBuffer b(Object obj) throws IOException {
        C3893a c3893a = new C3893a();
        c3893a.write(0);
        this.f46769a.k(c3893a, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c3893a.size());
        byteBufferAllocateDirect.put(c3893a.a(), 0, c3893a.size());
        return byteBufferAllocateDirect;
    }

    @Override // uc.InterfaceC4282s
    public final Object c(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b5 = byteBuffer.get();
        C4286w c4286w = this.f46769a;
        if (b5 != 0) {
            if (b5 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objE = c4286w.e(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objE;
        }
        Object objE2 = c4286w.e(byteBuffer);
        Object objE3 = c4286w.e(byteBuffer);
        Object objE4 = c4286w.e(byteBuffer);
        if ((objE2 instanceof String) && ((objE3 == null || (objE3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new C4274k((String) objE2, (String) objE3, objE4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    @Override // uc.InterfaceC4282s
    public final ByteBuffer d(C4278o c4278o) {
        C3893a c3893a = new C3893a();
        C4286w c4286w = this.f46769a;
        c4286w.k(c3893a, c4278o.f46759a);
        c4286w.k(c3893a, c4278o.f46760b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c3893a.size());
        byteBufferAllocateDirect.put(c3893a.a(), 0, c3893a.size());
        return byteBufferAllocateDirect;
    }

    @Override // uc.InterfaceC4282s
    public final ByteBuffer e(String str, String str2) throws IOException {
        C3893a c3893a = new C3893a();
        c3893a.write(1);
        C4286w c4286w = this.f46769a;
        c4286w.k(c3893a, "error");
        c4286w.k(c3893a, str);
        c4286w.k(c3893a, null);
        c4286w.k(c3893a, str2);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c3893a.size());
        byteBufferAllocateDirect.put(c3893a.a(), 0, c3893a.size());
        return byteBufferAllocateDirect;
    }

    @Override // uc.InterfaceC4282s
    public final ByteBuffer f(String str, String str2, Object obj) throws IOException {
        C3893a c3893a = new C3893a();
        c3893a.write(1);
        C4286w c4286w = this.f46769a;
        c4286w.k(c3893a, str);
        c4286w.k(c3893a, str2);
        if (obj instanceof Throwable) {
            c4286w.k(c3893a, Log.getStackTraceString((Throwable) obj));
        } else {
            c4286w.k(c3893a, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(c3893a.size());
        byteBufferAllocateDirect.put(c3893a.a(), 0, c3893a.size());
        return byteBufferAllocateDirect;
    }
}
