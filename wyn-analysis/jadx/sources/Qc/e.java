package Qc;

import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import uc.C4286w;

/* loaded from: classes5.dex */
public final class e extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public static final e f9950d = new e();

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        if (b5 == -128) {
            return f.a((ArrayList) e(byteBuffer));
        }
        if (b5 != -127) {
            return super.f(b5, byteBuffer);
        }
        ArrayList arrayList = (ArrayList) e(byteBuffer);
        g gVar = new g();
        String str = (String) arrayList.get(0);
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }
        gVar.f9964a = str;
        Object obj = arrayList.get(1);
        f fVarA = obj == null ? null : f.a((ArrayList) obj);
        if (fVarA == null) {
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }
        gVar.f9965b = fVarA;
        gVar.f9966c = (Boolean) arrayList.get(2);
        Map map = (Map) arrayList.get(3);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }
        gVar.f9967d = map;
        return gVar;
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof f) {
            byteArrayOutputStream.write(128);
            k(byteArrayOutputStream, ((f) obj).b());
            return;
        }
        if (!(obj instanceof g)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
        g gVar = (g) obj;
        gVar.getClass();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(gVar.f9964a);
        f fVar = gVar.f9965b;
        arrayList.add(fVar == null ? null : fVar.b());
        arrayList.add(gVar.f9966c);
        arrayList.add(gVar.f9967d);
        k(byteArrayOutputStream, arrayList);
    }
}
