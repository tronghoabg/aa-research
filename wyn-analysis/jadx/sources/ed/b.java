package ed;

import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import uc.C4286w;

/* loaded from: classes5.dex */
public final class b extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public static final b f34647d = new b();

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        if (b5 != -127) {
            return super.f(b5, byteBuffer);
        }
        Object objE = e(byteBuffer);
        if (objE == null) {
            return null;
        }
        return c.values()[((Long) objE).intValue()];
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (!(obj instanceof c)) {
            super.k(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
            k(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((c) obj).f34649a));
        }
    }
}
