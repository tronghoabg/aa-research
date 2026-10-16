package Pc;

import A.AbstractC0213f;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import uc.C4286w;

/* loaded from: classes5.dex */
public final class r extends C4286w {

    /* renamed from: e, reason: collision with root package name */
    public static final r f9437e = new r(0);

    /* renamed from: f, reason: collision with root package name */
    public static final r f9438f = new r(1);

    /* renamed from: g, reason: collision with root package name */
    public static final r f9439g = new r(2);

    /* renamed from: h, reason: collision with root package name */
    public static final r f9440h = new r(3);

    /* renamed from: i, reason: collision with root package name */
    public static final r f9441i = new r(4);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9442d;

    public /* synthetic */ r(int i5) {
        this.f9442d = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        B b10;
        B b11;
        switch (this.f9442d) {
            case 0:
                switch (b5) {
                    case -128:
                        return C0797m.a((ArrayList) e(byteBuffer));
                    case -127:
                        return A.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList = (ArrayList) e(byteBuffer);
                        B b12 = new B();
                        b12.f9300a = (String) arrayList.get(0);
                        b12.f9301b = (String) arrayList.get(1);
                        b10 = b12;
                        break;
                    case -125:
                        return C.a((ArrayList) e(byteBuffer));
                    case -124:
                        return D.a((ArrayList) e(byteBuffer));
                    case -123:
                        return E.a((ArrayList) e(byteBuffer));
                    case -122:
                        return F.a((ArrayList) e(byteBuffer));
                    case -121:
                        return G.a((ArrayList) e(byteBuffer));
                    case -120:
                        return H.a((ArrayList) e(byteBuffer));
                    case -119:
                        ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                        I i5 = new I();
                        String str = (String) arrayList2.get(0);
                        if (str == null) {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                        i5.f9335a = str;
                        b10 = i5;
                        break;
                    case -118:
                        return J.a((ArrayList) e(byteBuffer));
                    case -117:
                        return K.a((ArrayList) e(byteBuffer));
                    case -116:
                        return L.a((ArrayList) e(byteBuffer));
                    case -115:
                        return M.a((ArrayList) e(byteBuffer));
                    case -114:
                        return N.a((ArrayList) e(byteBuffer));
                    case -113:
                        return O.a((ArrayList) e(byteBuffer));
                    case -112:
                        return P.a((ArrayList) e(byteBuffer));
                    case -111:
                        return Q.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b5, byteBuffer);
                }
                return b10;
            case 1:
                switch (b5) {
                    case -128:
                        return C0797m.a((ArrayList) e(byteBuffer));
                    case -127:
                        return A.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                        B b13 = new B();
                        b13.f9300a = (String) arrayList3.get(0);
                        b13.f9301b = (String) arrayList3.get(1);
                        b11 = b13;
                        break;
                    case -125:
                        return C.a((ArrayList) e(byteBuffer));
                    case -124:
                        return D.a((ArrayList) e(byteBuffer));
                    case -123:
                        return E.a((ArrayList) e(byteBuffer));
                    case -122:
                        return F.a((ArrayList) e(byteBuffer));
                    case -121:
                        return G.a((ArrayList) e(byteBuffer));
                    case -120:
                        return H.a((ArrayList) e(byteBuffer));
                    case -119:
                        ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                        I i10 = new I();
                        String str2 = (String) arrayList4.get(0);
                        if (str2 == null) {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                        i10.f9335a = str2;
                        b11 = i10;
                        break;
                    case -118:
                        return J.a((ArrayList) e(byteBuffer));
                    case -117:
                        return K.a((ArrayList) e(byteBuffer));
                    case -116:
                        return L.a((ArrayList) e(byteBuffer));
                    case -115:
                        return M.a((ArrayList) e(byteBuffer));
                    case -114:
                        return N.a((ArrayList) e(byteBuffer));
                    case -113:
                        return O.a((ArrayList) e(byteBuffer));
                    case -112:
                        return P.a((ArrayList) e(byteBuffer));
                    case -111:
                        return Q.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b5, byteBuffer);
                }
                return b11;
            case 2:
                switch (b5) {
                    case -128:
                        return D.a((ArrayList) e(byteBuffer));
                    case -127:
                        return E.a((ArrayList) e(byteBuffer));
                    case -126:
                        return J.a((ArrayList) e(byteBuffer));
                    case -125:
                        return M.a((ArrayList) e(byteBuffer));
                    case -124:
                        return N.a((ArrayList) e(byteBuffer));
                    case -123:
                        return O.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b5, byteBuffer);
                }
            case 3:
                return b5 != -128 ? super.f(b5, byteBuffer) : L.a((ArrayList) e(byteBuffer));
            default:
                switch (b5) {
                    case -128:
                        return C0797m.a((ArrayList) e(byteBuffer));
                    case -127:
                        return H.a((ArrayList) e(byteBuffer));
                    case -126:
                        ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                        I i11 = new I();
                        String str3 = (String) arrayList5.get(0);
                        if (str3 == null) {
                            throw new IllegalStateException("Nonnull field \"id\" is null.");
                        }
                        i11.f9335a = str3;
                        return i11;
                    case -125:
                        return J.a((ArrayList) e(byteBuffer));
                    default:
                        return super.f(b5, byteBuffer);
                }
        }
    }

    @Override // uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        switch (this.f9442d) {
            case 0:
                if (obj instanceof C0797m) {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((C0797m) obj).b());
                    return;
                }
                if (obj instanceof A) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
                    A a5 = (A) obj;
                    a5.getClass();
                    ArrayList arrayList = new ArrayList(2);
                    int i5 = a5.f9298a;
                    arrayList.add(i5 == 0 ? null : Integer.valueOf(AbstractC0213f.f(i5)));
                    arrayList.add(a5.f9299b);
                    k(byteArrayOutputStream, arrayList);
                    return;
                }
                if (obj instanceof B) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
                    B b5 = (B) obj;
                    b5.getClass();
                    ArrayList arrayList2 = new ArrayList(2);
                    arrayList2.add(b5.f9300a);
                    arrayList2.add(b5.f9301b);
                    k(byteArrayOutputStream, arrayList2);
                    return;
                }
                if (obj instanceof C) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
                    k(byteArrayOutputStream, ((C) obj).b());
                    return;
                }
                if (obj instanceof D) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
                    k(byteArrayOutputStream, ((D) obj).b());
                    return;
                }
                if (obj instanceof E) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                    k(byteArrayOutputStream, ((E) obj).b());
                    return;
                }
                if (obj instanceof F) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE);
                    k(byteArrayOutputStream, ((F) obj).b());
                    return;
                }
                if (obj instanceof G) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE);
                    k(byteArrayOutputStream, ((G) obj).b());
                    return;
                }
                if (obj instanceof H) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
                    k(byteArrayOutputStream, ((H) obj).b());
                    return;
                }
                if (obj instanceof I) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
                    I i10 = (I) obj;
                    i10.getClass();
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(i10.f9335a);
                    k(byteArrayOutputStream, arrayList3);
                    return;
                }
                if (obj instanceof J) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE);
                    k(byteArrayOutputStream, ((J) obj).b());
                    return;
                }
                if (obj instanceof K) {
                    byteArrayOutputStream.write(139);
                    K k = (K) obj;
                    k.getClass();
                    ArrayList arrayList4 = new ArrayList(3);
                    arrayList4.add(k.f9338a);
                    arrayList4.add(k.f9339b);
                    arrayList4.add(k.f9340c);
                    k(byteArrayOutputStream, arrayList4);
                    return;
                }
                if (obj instanceof L) {
                    byteArrayOutputStream.write(140);
                    k(byteArrayOutputStream, ((L) obj).b());
                    return;
                }
                if (obj instanceof M) {
                    byteArrayOutputStream.write(141);
                    k(byteArrayOutputStream, ((M) obj).b());
                    return;
                }
                if (obj instanceof N) {
                    byteArrayOutputStream.write(142);
                    k(byteArrayOutputStream, ((N) obj).b());
                    return;
                }
                if (obj instanceof O) {
                    byteArrayOutputStream.write(143);
                    k(byteArrayOutputStream, ((O) obj).b());
                    return;
                }
                if (!(obj instanceof P)) {
                    if (!(obj instanceof Q)) {
                        super.k(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(145);
                        k(byteArrayOutputStream, ((Q) obj).b());
                        return;
                    }
                }
                byteArrayOutputStream.write(144);
                P p10 = (P) obj;
                p10.getClass();
                ArrayList arrayList5 = new ArrayList(4);
                arrayList5.add(p10.f9362a);
                arrayList5.add(p10.f9363b);
                arrayList5.add(p10.f9364c);
                arrayList5.add(p10.f9365d);
                k(byteArrayOutputStream, arrayList5);
                return;
            case 1:
                if (obj instanceof C0797m) {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((C0797m) obj).b());
                    return;
                }
                if (obj instanceof A) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
                    A a10 = (A) obj;
                    a10.getClass();
                    ArrayList arrayList6 = new ArrayList(2);
                    int i11 = a10.f9298a;
                    arrayList6.add(i11 == 0 ? null : Integer.valueOf(AbstractC0213f.f(i11)));
                    arrayList6.add(a10.f9299b);
                    k(byteArrayOutputStream, arrayList6);
                    return;
                }
                if (obj instanceof B) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
                    B b10 = (B) obj;
                    b10.getClass();
                    ArrayList arrayList7 = new ArrayList(2);
                    arrayList7.add(b10.f9300a);
                    arrayList7.add(b10.f9301b);
                    k(byteArrayOutputStream, arrayList7);
                    return;
                }
                if (obj instanceof C) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
                    k(byteArrayOutputStream, ((C) obj).b());
                    return;
                }
                if (obj instanceof D) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
                    k(byteArrayOutputStream, ((D) obj).b());
                    return;
                }
                if (obj instanceof E) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                    k(byteArrayOutputStream, ((E) obj).b());
                    return;
                }
                if (obj instanceof F) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE);
                    k(byteArrayOutputStream, ((F) obj).b());
                    return;
                }
                if (obj instanceof G) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE);
                    k(byteArrayOutputStream, ((G) obj).b());
                    return;
                }
                if (obj instanceof H) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
                    k(byteArrayOutputStream, ((H) obj).b());
                    return;
                }
                if (obj instanceof I) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
                    I i12 = (I) obj;
                    i12.getClass();
                    ArrayList arrayList8 = new ArrayList(1);
                    arrayList8.add(i12.f9335a);
                    k(byteArrayOutputStream, arrayList8);
                    return;
                }
                if (obj instanceof J) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE);
                    k(byteArrayOutputStream, ((J) obj).b());
                    return;
                }
                if (obj instanceof K) {
                    byteArrayOutputStream.write(139);
                    K k5 = (K) obj;
                    k5.getClass();
                    ArrayList arrayList9 = new ArrayList(3);
                    arrayList9.add(k5.f9338a);
                    arrayList9.add(k5.f9339b);
                    arrayList9.add(k5.f9340c);
                    k(byteArrayOutputStream, arrayList9);
                    return;
                }
                if (obj instanceof L) {
                    byteArrayOutputStream.write(140);
                    k(byteArrayOutputStream, ((L) obj).b());
                    return;
                }
                if (obj instanceof M) {
                    byteArrayOutputStream.write(141);
                    k(byteArrayOutputStream, ((M) obj).b());
                    return;
                }
                if (obj instanceof N) {
                    byteArrayOutputStream.write(142);
                    k(byteArrayOutputStream, ((N) obj).b());
                    return;
                }
                if (obj instanceof O) {
                    byteArrayOutputStream.write(143);
                    k(byteArrayOutputStream, ((O) obj).b());
                    return;
                }
                if (!(obj instanceof P)) {
                    if (!(obj instanceof Q)) {
                        super.k(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(145);
                        k(byteArrayOutputStream, ((Q) obj).b());
                        return;
                    }
                }
                byteArrayOutputStream.write(144);
                P p11 = (P) obj;
                p11.getClass();
                ArrayList arrayList10 = new ArrayList(4);
                arrayList10.add(p11.f9362a);
                arrayList10.add(p11.f9363b);
                arrayList10.add(p11.f9364c);
                arrayList10.add(p11.f9365d);
                k(byteArrayOutputStream, arrayList10);
                return;
            case 2:
                if (obj instanceof D) {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((D) obj).b());
                    return;
                }
                if (obj instanceof E) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
                    k(byteArrayOutputStream, ((E) obj).b());
                    return;
                }
                if (obj instanceof J) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
                    k(byteArrayOutputStream, ((J) obj).b());
                    return;
                }
                if (obj instanceof M) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
                    k(byteArrayOutputStream, ((M) obj).b());
                    return;
                } else if (obj instanceof N) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
                    k(byteArrayOutputStream, ((N) obj).b());
                    return;
                } else if (!(obj instanceof O)) {
                    super.k(byteArrayOutputStream, obj);
                    return;
                } else {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                    k(byteArrayOutputStream, ((O) obj).b());
                    return;
                }
            case 3:
                if (!(obj instanceof L)) {
                    super.k(byteArrayOutputStream, obj);
                    return;
                } else {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((L) obj).b());
                    return;
                }
            default:
                if (obj instanceof C0797m) {
                    byteArrayOutputStream.write(128);
                    k(byteArrayOutputStream, ((C0797m) obj).b());
                    return;
                }
                if (obj instanceof H) {
                    byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
                    k(byteArrayOutputStream, ((H) obj).b());
                    return;
                }
                if (!(obj instanceof I)) {
                    if (!(obj instanceof J)) {
                        super.k(byteArrayOutputStream, obj);
                        return;
                    } else {
                        byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
                        k(byteArrayOutputStream, ((J) obj).b());
                        return;
                    }
                }
                byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
                I i13 = (I) obj;
                i13.getClass();
                ArrayList arrayList11 = new ArrayList(1);
                arrayList11.add(i13.f9335a);
                k(byteArrayOutputStream, arrayList11);
                return;
        }
    }
}
