package dd;

import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import uc.C4286w;

/* renamed from: dd.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2430i extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public static final C2430i f34276d = new C2430i();

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        switch (b5) {
            case -127:
                Object objE = e(byteBuffer);
                if (objE == null) {
                    return null;
                }
                return k.values()[((Long) objE).intValue()];
            case -126:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                C2429h c2429h = new C2429h();
                List list = (List) arrayList.get(0);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"scopes\" is null.");
                }
                c2429h.f34270a = list;
                k kVar = (k) arrayList.get(1);
                if (kVar == null) {
                    throw new IllegalStateException("Nonnull field \"signInType\" is null.");
                }
                c2429h.f34271b = kVar;
                c2429h.f34272c = (String) arrayList.get(2);
                c2429h.f34273d = (String) arrayList.get(3);
                c2429h.f34274e = (String) arrayList.get(4);
                Boolean bool = (Boolean) arrayList.get(5);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"forceCodeForRefreshToken\" is null.");
                }
                c2429h.f34275f = bool;
                return c2429h;
            case -125:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                l lVar = new l();
                lVar.f34279a = (String) arrayList2.get(0);
                String str = (String) arrayList2.get(1);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"email\" is null.");
                }
                lVar.f34280b = str;
                String str2 = (String) arrayList2.get(2);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                lVar.f34281c = str2;
                lVar.f34282d = (String) arrayList2.get(3);
                lVar.f34283e = (String) arrayList2.get(4);
                lVar.f34284f = (String) arrayList2.get(5);
                return lVar;
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof k) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
            k(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((k) obj).f34278a));
            return;
        }
        if (obj instanceof C2429h) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
            C2429h c2429h = (C2429h) obj;
            c2429h.getClass();
            ArrayList arrayList = new ArrayList(6);
            arrayList.add(c2429h.f34270a);
            arrayList.add(c2429h.f34271b);
            arrayList.add(c2429h.f34272c);
            arrayList.add(c2429h.f34273d);
            arrayList.add(c2429h.f34274e);
            arrayList.add(c2429h.f34275f);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (!(obj instanceof l)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
        l lVar = (l) obj;
        lVar.getClass();
        ArrayList arrayList2 = new ArrayList(6);
        arrayList2.add(lVar.f34279a);
        arrayList2.add(lVar.f34280b);
        arrayList2.add(lVar.f34281c);
        arrayList2.add(lVar.f34282d);
        arrayList2.add(lVar.f34283e);
        arrayList2.add(lVar.f34284f);
        k(byteArrayOutputStream, arrayList2);
    }
}
