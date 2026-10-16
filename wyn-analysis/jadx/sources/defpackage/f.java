package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.C4286w;

/* loaded from: classes.dex */
public final class f extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public static final f f34728d = new f();

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        if (b5 == -128) {
            Object objE = e(byteBuffer);
            List list = objE instanceof List ? (List) objE : null;
            if (list != null) {
                return new a((Boolean) list.get(0));
            }
        } else {
            if (b5 != -127) {
                return super.f(b5, byteBuffer);
            }
            Object objE2 = e(byteBuffer);
            List list2 = objE2 instanceof List ? (List) objE2 : null;
            if (list2 != null) {
                return new b((Boolean) list2.get(0));
            }
        }
        return null;
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream stream, Object obj) {
        AbstractC3340k.e(stream, "stream");
        if (obj instanceof a) {
            stream.write(128);
            k(stream, AbstractC3935e.C(((a) obj).f17090a));
        } else if (!(obj instanceof b)) {
            super.k(stream, obj);
        } else {
            stream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
            k(stream, AbstractC3935e.C(((b) obj).f19095a));
        }
    }
}
