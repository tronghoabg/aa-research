package gd;

import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import uc.C4286w;

/* renamed from: gd.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2748c extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public static final C2748c f35869d = new C2748c();

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        if (b5 != -127) {
            if (b5 != -126) {
                return super.f(b5, byteBuffer);
            }
            ArrayList arrayList = (ArrayList) e(byteBuffer);
            C2746a c2746a = new C2746a();
            Boolean bool = (Boolean) arrayList.get(0);
            if (bool == null) {
                throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
            }
            c2746a.f35867a = bool;
            return c2746a;
        }
        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
        C2750e c2750e = new C2750e();
        Boolean bool2 = (Boolean) arrayList2.get(0);
        if (bool2 == null) {
            throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
        }
        c2750e.f35872a = bool2;
        Boolean bool3 = (Boolean) arrayList2.get(1);
        if (bool3 == null) {
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        c2750e.f35873b = bool3;
        Map map = (Map) arrayList2.get(2);
        if (map == null) {
            throw new IllegalStateException("Nonnull field \"headers\" is null.");
        }
        c2750e.f35874c = map;
        return c2750e;
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof C2750e) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
            C2750e c2750e = (C2750e) obj;
            c2750e.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(c2750e.f35872a);
            arrayList.add(c2750e.f35873b);
            arrayList.add(c2750e.f35874c);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof C2746a)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
        C2746a c2746a = (C2746a) obj;
        c2746a.getClass();
        ArrayList arrayList2 = new ArrayList(1);
        arrayList2.add(c2746a.f35867a);
        k(byteArrayOutputStream, arrayList2);
    }
}
