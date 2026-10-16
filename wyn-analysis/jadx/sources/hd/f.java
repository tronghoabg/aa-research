package hd;

import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import uc.C4286w;

/* loaded from: classes5.dex */
public final class f extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public static final f f36405d = new f();

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        switch (b5) {
            case -127:
                Object objE = e(byteBuffer);
                if (objE == null) {
                    return null;
                }
                return g.values()[((Long) objE).intValue()];
            case -126:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                h hVar = new h();
                Long l10 = (Long) arrayList.get(0);
                if (l10 == null) {
                    throw new IllegalStateException("Nonnull field \"playerId\" is null.");
                }
                hVar.f36408a = l10;
                return hVar;
            case -125:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                e eVar = new e();
                String str = (String) arrayList2.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"uri\" is null.");
                }
                eVar.f36401a = str;
                eVar.f36402b = (g) arrayList2.get(1);
                Map map = (Map) arrayList2.get(2);
                if (map == null) {
                    throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
                }
                eVar.f36403c = map;
                eVar.f36404d = (String) arrayList2.get(3);
                return eVar;
            case -124:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                j jVar = new j();
                Long l11 = (Long) arrayList3.get(0);
                if (l11 == null) {
                    throw new IllegalStateException("Nonnull field \"playerId\" is null.");
                }
                jVar.f36411a = l11;
                Long l12 = (Long) arrayList3.get(1);
                if (l12 == null) {
                    throw new IllegalStateException("Nonnull field \"textureId\" is null.");
                }
                jVar.f36412b = l12;
                return jVar;
            case -123:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                i iVar = new i();
                Long l13 = (Long) arrayList4.get(0);
                if (l13 == null) {
                    throw new IllegalStateException("Nonnull field \"playPosition\" is null.");
                }
                iVar.f36409a = l13;
                Long l14 = (Long) arrayList4.get(1);
                if (l14 == null) {
                    throw new IllegalStateException("Nonnull field \"bufferPosition\" is null.");
                }
                iVar.f36410b = l14;
                return iVar;
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof g) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
            k(byteArrayOutputStream, obj == null ? null : Integer.valueOf(((g) obj).f36407a));
            return;
        }
        if (obj instanceof h) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
            h hVar = (h) obj;
            hVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(hVar.f36408a);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof e) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            e eVar = (e) obj;
            eVar.getClass();
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(eVar.f36401a);
            arrayList2.add(eVar.f36402b);
            arrayList2.add(eVar.f36403c);
            arrayList2.add(eVar.f36404d);
            k(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof j) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            j jVar = (j) obj;
            jVar.getClass();
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(jVar.f36411a);
            arrayList3.add(jVar.f36412b);
            k(byteArrayOutputStream, arrayList3);
            return;
        }
        if (!(obj instanceof i)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
        i iVar = (i) obj;
        iVar.getClass();
        ArrayList arrayList4 = new ArrayList(2);
        arrayList4.add(iVar.f36409a);
        arrayList4.add(iVar.f36410b);
        k(byteArrayOutputStream, arrayList4);
    }
}
