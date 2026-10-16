package yc;

import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import uc.C4286w;

/* loaded from: classes5.dex */
public final class p extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public static final p f48158d = new p();

    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        switch (b5) {
            case -127:
                Object objE = e(byteBuffer);
                if (objE == null) {
                    return null;
                }
                return r.values()[((Long) objE).intValue()];
            case -126:
                Object objE2 = e(byteBuffer);
                if (objE2 == null) {
                    return null;
                }
                return t.values()[((Long) objE2).intValue()];
            case -125:
                Object objE3 = e(byteBuffer);
                if (objE3 == null) {
                    return null;
                }
                return u.values()[((Long) objE3).intValue()];
            case -124:
                Object objE4 = e(byteBuffer);
                if (objE4 == null) {
                    return null;
                }
                return w.values()[((Long) objE4).intValue()];
            case -123:
                Object objE5 = e(byteBuffer);
                if (objE5 == null) {
                    return null;
                }
                return EnumC4571A.values()[((Long) objE5).intValue()];
            case -122:
                Object objE6 = e(byteBuffer);
                if (objE6 == null) {
                    return null;
                }
                return x.values()[((Long) objE6).intValue()];
            case -121:
                Object objE7 = e(byteBuffer);
                if (objE7 == null) {
                    return null;
                }
                return v.values()[((Long) objE7).intValue()];
            case -120:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                q qVar = new q();
                String str = (String) arrayList.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"name\" is null.");
                }
                qVar.f48159a = str;
                r rVar = (r) arrayList.get(1);
                if (rVar == null) {
                    throw new IllegalStateException("Nonnull field \"lensDirection\" is null.");
                }
                qVar.f48160b = rVar;
                Long l10 = (Long) arrayList.get(2);
                if (l10 == null) {
                    throw new IllegalStateException("Nonnull field \"sensorOrientation\" is null.");
                }
                qVar.f48161c = l10;
                return qVar;
            case -119:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                s sVar = new s();
                C4572B c4572b = (C4572B) arrayList2.get(0);
                if (c4572b == null) {
                    throw new IllegalStateException("Nonnull field \"previewSize\" is null.");
                }
                sVar.f48167a = c4572b;
                u uVar = (u) arrayList2.get(1);
                if (uVar == null) {
                    throw new IllegalStateException("Nonnull field \"exposureMode\" is null.");
                }
                sVar.f48168b = uVar;
                w wVar = (w) arrayList2.get(2);
                if (wVar == null) {
                    throw new IllegalStateException("Nonnull field \"focusMode\" is null.");
                }
                sVar.f48169c = wVar;
                Boolean bool = (Boolean) arrayList2.get(3);
                if (bool == null) {
                    throw new IllegalStateException("Nonnull field \"exposurePointSupported\" is null.");
                }
                sVar.f48170d = bool;
                Boolean bool2 = (Boolean) arrayList2.get(4);
                if (bool2 == null) {
                    throw new IllegalStateException("Nonnull field \"focusPointSupported\" is null.");
                }
                sVar.f48171e = bool2;
                return sVar;
            case -118:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                C4572B c4572b2 = new C4572B();
                Double d3 = (Double) arrayList3.get(0);
                if (d3 == null) {
                    throw new IllegalStateException("Nonnull field \"width\" is null.");
                }
                c4572b2.f48075a = d3;
                Double d5 = (Double) arrayList3.get(1);
                if (d5 == null) {
                    throw new IllegalStateException("Nonnull field \"height\" is null.");
                }
                c4572b2.f48076b = d5;
                return c4572b2;
            case -117:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                z zVar = new z();
                Double d10 = (Double) arrayList4.get(0);
                if (d10 == null) {
                    throw new IllegalStateException("Nonnull field \"x\" is null.");
                }
                zVar.f48195a = d10;
                Double d11 = (Double) arrayList4.get(1);
                if (d11 == null) {
                    throw new IllegalStateException("Nonnull field \"y\" is null.");
                }
                zVar.f48196b = d11;
                return zVar;
            case -116:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                y yVar = new y();
                EnumC4571A enumC4571A = (EnumC4571A) arrayList5.get(0);
                if (enumC4571A == null) {
                    throw new IllegalStateException("Nonnull field \"resolutionPreset\" is null.");
                }
                yVar.f48190a = enumC4571A;
                yVar.f48191b = (Long) arrayList5.get(1);
                yVar.f48192c = (Long) arrayList5.get(2);
                yVar.f48193d = (Long) arrayList5.get(3);
                Boolean bool3 = (Boolean) arrayList5.get(4);
                if (bool3 == null) {
                    throw new IllegalStateException("Nonnull field \"enableAudio\" is null.");
                }
                yVar.f48194e = bool3;
                return yVar;
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof r) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
            k(byteArrayOutputStream, obj != null ? Integer.valueOf(((r) obj).f48166a) : null);
            return;
        }
        if (obj instanceof t) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
            k(byteArrayOutputStream, obj != null ? Integer.valueOf(((t) obj).f48177a) : null);
            return;
        }
        if (obj instanceof u) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            k(byteArrayOutputStream, obj != null ? Integer.valueOf(((u) obj).f48181a) : null);
            return;
        }
        if (obj instanceof w) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            k(byteArrayOutputStream, obj != null ? Integer.valueOf(((w) obj).f48187a) : null);
            return;
        }
        if (obj instanceof EnumC4571A) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            k(byteArrayOutputStream, obj != null ? Integer.valueOf(((EnumC4571A) obj).f48074a) : null);
            return;
        }
        if (obj instanceof x) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE);
            k(byteArrayOutputStream, obj != null ? Integer.valueOf(((x) obj).f48189a) : null);
            return;
        }
        if (obj instanceof v) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE);
            k(byteArrayOutputStream, obj != null ? Integer.valueOf(((v) obj).f48183a) : null);
            return;
        }
        if (obj instanceof q) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            q qVar = (q) obj;
            qVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(qVar.f48159a);
            arrayList.add(qVar.f48160b);
            arrayList.add(qVar.f48161c);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof s) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            s sVar = (s) obj;
            sVar.getClass();
            ArrayList arrayList2 = new ArrayList(5);
            arrayList2.add(sVar.f48167a);
            arrayList2.add(sVar.f48168b);
            arrayList2.add(sVar.f48169c);
            arrayList2.add(sVar.f48170d);
            arrayList2.add(sVar.f48171e);
            k(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof C4572B) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE);
            C4572B c4572b = (C4572B) obj;
            c4572b.getClass();
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(c4572b.f48075a);
            arrayList3.add(c4572b.f48076b);
            k(byteArrayOutputStream, arrayList3);
            return;
        }
        if (obj instanceof z) {
            byteArrayOutputStream.write(139);
            z zVar = (z) obj;
            zVar.getClass();
            ArrayList arrayList4 = new ArrayList(2);
            arrayList4.add(zVar.f48195a);
            arrayList4.add(zVar.f48196b);
            k(byteArrayOutputStream, arrayList4);
            return;
        }
        if (!(obj instanceof y)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(140);
        y yVar = (y) obj;
        yVar.getClass();
        ArrayList arrayList5 = new ArrayList(5);
        arrayList5.add(yVar.f48190a);
        arrayList5.add(yVar.f48191b);
        arrayList5.add(yVar.f48192c);
        arrayList5.add(yVar.f48193d);
        arrayList5.add(yVar.f48194e);
        k(byteArrayOutputStream, arrayList5);
    }
}
