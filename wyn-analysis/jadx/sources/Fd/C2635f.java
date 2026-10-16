package fd;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.C4286w;

/* renamed from: fd.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2635f extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public static final C2635f f35333d = new C2635f();

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        if (b5 != -128) {
            return super.f(b5, byteBuffer);
        }
        Object objE = e(byteBuffer);
        List list = objE instanceof List ? (List) objE : null;
        if (list != null) {
            return new C2636g((String) list.get(0));
        }
        return null;
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream stream, Object obj) {
        AbstractC3340k.e(stream, "stream");
        if (!(obj instanceof C2636g)) {
            super.k(stream, obj);
        } else {
            stream.write(128);
            k(stream, AbstractC3935e.C(((C2636g) obj).f35334a));
        }
    }
}
