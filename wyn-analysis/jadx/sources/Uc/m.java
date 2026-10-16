package Uc;

import A.AbstractC0213f;
import com.vungle.ads.internal.protos.Sdk;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class m extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final m f12751e = new m();

    @Override // Uc.c, uc.C4286w
    public final Object f(byte b5, ByteBuffer byteBuffer) {
        Long lValueOf;
        Long lValueOf2;
        Long lValueOf3 = null;
        Long lValueOf4 = null;
        switch (b5) {
            case -128:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                h hVar = new h();
                int i5 = AbstractC0213f.g(3)[((Integer) arrayList.get(0)).intValue()];
                if (i5 == 0) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                hVar.f12738a = i5;
                hVar.f12739b = (String) arrayList.get(1);
                return hVar;
            case -127:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                i iVar = new i();
                iVar.a(AbstractC0213f.g(3)[((Integer) arrayList2.get(0)).intValue()]);
                iVar.f12741b = (String) arrayList2.get(1);
                iVar.f12742c = (Double) arrayList2.get(2);
                return iVar;
            case -126:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                j jVar = new j();
                String str = (String) arrayList3.get(0);
                if (str == null) {
                    throw new IllegalStateException("Nonnull field \"path\" is null.");
                }
                jVar.f12743a = str;
                jVar.f12744b = (Map) arrayList3.get(1);
                Object obj = arrayList3.get(2);
                jVar.f12745c = obj != null ? q.a((ArrayList) obj) : null;
                Object obj2 = arrayList3.get(3);
                jVar.f12746d = obj2 == null ? 0 : AbstractC0213f.g(3)[((Integer) obj2).intValue()];
                Object obj3 = arrayList3.get(4);
                jVar.f12747e = obj3 != null ? AbstractC0213f.g(3)[((Integer) obj3).intValue()] : 0;
                return jVar;
            case -125:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                n nVar = new n();
                String str2 = (String) arrayList4.get(0);
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"appName\" is null.");
                }
                nVar.f12752a = str2;
                Object obj4 = arrayList4.get(1);
                s sVarA = obj4 != null ? s.a((ArrayList) obj4) : null;
                if (sVarA == null) {
                    throw new IllegalStateException("Nonnull field \"settings\" is null.");
                }
                nVar.f12753b = sVarA;
                String str3 = (String) arrayList4.get(2);
                if (str3 == null) {
                    throw new IllegalStateException("Nonnull field \"databaseURL\" is null.");
                }
                nVar.f12754c = str3;
                return nVar;
            case -124:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                p pVar = new p();
                int i10 = AbstractC0213f.g(3)[((Integer) arrayList5.get(0)).intValue()];
                if (i10 == 0) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                pVar.f12757a = i10;
                Object obj5 = arrayList5.get(1);
                r rVarA = obj5 == null ? null : r.a((ArrayList) obj5);
                if (rVarA == null) {
                    throw new IllegalStateException("Nonnull field \"document\" is null.");
                }
                pVar.f12758b = rVarA;
                Object obj6 = arrayList5.get(2);
                if (obj6 == null) {
                    lValueOf = null;
                } else {
                    lValueOf = Long.valueOf(obj6 instanceof Integer ? ((Integer) obj6).intValue() : ((Long) obj6).longValue());
                }
                if (lValueOf == null) {
                    throw new IllegalStateException("Nonnull field \"oldIndex\" is null.");
                }
                pVar.f12759c = lValueOf;
                Object obj7 = arrayList5.get(3);
                if (obj7 != null) {
                    lValueOf4 = Long.valueOf(obj7 instanceof Integer ? ((Integer) obj7).intValue() : ((Long) obj7).longValue());
                }
                if (lValueOf4 == null) {
                    throw new IllegalStateException("Nonnull field \"newIndex\" is null.");
                }
                pVar.f12760d = lValueOf4;
                return pVar;
            case -123:
                return q.a((ArrayList) e(byteBuffer));
            case -122:
                return r.a((ArrayList) e(byteBuffer));
            case -121:
                return s.a((ArrayList) e(byteBuffer));
            case -120:
                ArrayList arrayList6 = (ArrayList) e(byteBuffer);
                t tVar = new t();
                int i11 = AbstractC0213f.g(3)[((Integer) arrayList6.get(0)).intValue()];
                if (i11 == 0) {
                    throw new IllegalStateException("Nonnull field \"source\" is null.");
                }
                tVar.f12771a = i11;
                int i12 = AbstractC0213f.g(3)[((Integer) arrayList6.get(1)).intValue()];
                if (i12 == 0) {
                    throw new IllegalStateException("Nonnull field \"serverTimestampBehavior\" is null.");
                }
                tVar.f12772b = i12;
                return tVar;
            case -119:
                ArrayList arrayList7 = (ArrayList) e(byteBuffer);
                u uVar = new u();
                uVar.f12773a = (List) arrayList7.get(0);
                uVar.f12774b = (List) arrayList7.get(1);
                Object obj8 = arrayList7.get(2);
                if (obj8 == null) {
                    lValueOf2 = null;
                } else {
                    lValueOf2 = Long.valueOf(obj8 instanceof Integer ? ((Integer) obj8).intValue() : ((Long) obj8).longValue());
                }
                uVar.f12775c = lValueOf2;
                Object obj9 = arrayList7.get(3);
                if (obj9 != null) {
                    lValueOf3 = Long.valueOf(obj9 instanceof Integer ? ((Integer) obj9).intValue() : ((Long) obj9).longValue());
                }
                uVar.f12776d = lValueOf3;
                uVar.f12777e = (List) arrayList7.get(4);
                uVar.f12778f = (List) arrayList7.get(5);
                uVar.f12779g = (List) arrayList7.get(6);
                uVar.f12780h = (List) arrayList7.get(7);
                uVar.f12781i = (Map) arrayList7.get(8);
                return uVar;
            case -118:
                ArrayList arrayList8 = (ArrayList) e(byteBuffer);
                v vVar = new v();
                List list = (List) arrayList8.get(0);
                if (list == null) {
                    throw new IllegalStateException("Nonnull field \"documents\" is null.");
                }
                vVar.f12782a = list;
                List list2 = (List) arrayList8.get(1);
                if (list2 == null) {
                    throw new IllegalStateException("Nonnull field \"documentChanges\" is null.");
                }
                vVar.f12783b = list2;
                Object obj10 = arrayList8.get(2);
                w wVarA = obj10 != null ? w.a((ArrayList) obj10) : null;
                if (wVarA == null) {
                    throw new IllegalStateException("Nonnull field \"metadata\" is null.");
                }
                vVar.f12784c = wVarA;
                return vVar;
            case -117:
                return w.a((ArrayList) e(byteBuffer));
            case -116:
                ArrayList arrayList9 = (ArrayList) e(byteBuffer);
                x xVar = new x();
                int i13 = AbstractC0213f.g(4)[((Integer) arrayList9.get(0)).intValue()];
                if (i13 == 0) {
                    throw new IllegalStateException("Nonnull field \"type\" is null.");
                }
                xVar.f12787a = i13;
                String str4 = (String) arrayList9.get(1);
                if (str4 == null) {
                    throw new IllegalStateException("Nonnull field \"path\" is null.");
                }
                xVar.f12788b = str4;
                xVar.f12789c = (Map) arrayList9.get(2);
                Object obj11 = arrayList9.get(3);
                xVar.f12790d = obj11 != null ? q.a((ArrayList) obj11) : null;
                return xVar;
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // Uc.c, uc.C4286w
    public final void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        if (obj instanceof h) {
            byteArrayOutputStream.write(128);
            h hVar = (h) obj;
            hVar.getClass();
            ArrayList arrayList = new ArrayList(2);
            int i5 = hVar.f12738a;
            arrayList.add(i5 != 0 ? Integer.valueOf(AbstractC0213f.f(i5)) : null);
            arrayList.add(hVar.f12739b);
            k(byteArrayOutputStream, arrayList);
            return;
        }
        if (obj instanceof i) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.EMPTY_TPAT_ERROR_VALUE);
            i iVar = (i) obj;
            iVar.getClass();
            ArrayList arrayList2 = new ArrayList(3);
            int i10 = iVar.f12740a;
            arrayList2.add(i10 != 0 ? Integer.valueOf(AbstractC0213f.f(i10)) : null);
            arrayList2.add(iVar.f12741b);
            arrayList2.add(iVar.f12742c);
            k(byteArrayOutputStream, arrayList2);
            return;
        }
        if (obj instanceof j) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR_VALUE);
            j jVar = (j) obj;
            jVar.getClass();
            ArrayList arrayList3 = new ArrayList(5);
            arrayList3.add(jVar.f12743a);
            arrayList3.add(jVar.f12744b);
            q qVar = jVar.f12745c;
            arrayList3.add(qVar == null ? null : qVar.b());
            int i11 = jVar.f12746d;
            arrayList3.add(i11 == 0 ? null : Integer.valueOf(AbstractC0213f.f(i11)));
            int i12 = jVar.f12747e;
            arrayList3.add(i12 != 0 ? Integer.valueOf(AbstractC0213f.f(i12)) : null);
            k(byteArrayOutputStream, arrayList3);
            return;
        }
        if (obj instanceof n) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
            n nVar = (n) obj;
            nVar.getClass();
            ArrayList arrayList4 = new ArrayList(3);
            arrayList4.add(nVar.f12752a);
            s sVar = nVar.f12753b;
            arrayList4.add(sVar != null ? sVar.b() : null);
            arrayList4.add(nVar.f12754c);
            k(byteArrayOutputStream, arrayList4);
            return;
        }
        if (obj instanceof p) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
            k(byteArrayOutputStream, ((p) obj).a());
            return;
        }
        if (obj instanceof q) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
            k(byteArrayOutputStream, ((q) obj).b());
            return;
        }
        if (obj instanceof r) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.STORE_REGION_CODE_ERROR_VALUE);
            k(byteArrayOutputStream, ((r) obj).b());
            return;
        }
        if (obj instanceof s) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE_VALUE);
            k(byteArrayOutputStream, ((s) obj).b());
            return;
        }
        if (obj instanceof t) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);
            t tVar = (t) obj;
            tVar.getClass();
            ArrayList arrayList5 = new ArrayList(2);
            int i13 = tVar.f12771a;
            arrayList5.add(i13 == 0 ? null : Integer.valueOf(AbstractC0213f.f(i13)));
            int i14 = tVar.f12772b;
            arrayList5.add(i14 != 0 ? Integer.valueOf(AbstractC0213f.f(i14)) : null);
            k(byteArrayOutputStream, arrayList5);
            return;
        }
        if (obj instanceof u) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            u uVar = (u) obj;
            uVar.getClass();
            ArrayList arrayList6 = new ArrayList(9);
            arrayList6.add(uVar.f12773a);
            arrayList6.add(uVar.f12774b);
            arrayList6.add(uVar.f12775c);
            arrayList6.add(uVar.f12776d);
            arrayList6.add(uVar.f12777e);
            arrayList6.add(uVar.f12778f);
            arrayList6.add(uVar.f12779g);
            arrayList6.add(uVar.f12780h);
            arrayList6.add(uVar.f12781i);
            k(byteArrayOutputStream, arrayList6);
            return;
        }
        if (obj instanceof v) {
            byteArrayOutputStream.write(Sdk.SDKError.Reason.CONFIG_REFRESH_FAILED_VALUE);
            v vVar = (v) obj;
            vVar.getClass();
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(vVar.f12782a);
            arrayList7.add(vVar.f12783b);
            w wVar = vVar.f12784c;
            arrayList7.add(wVar != null ? wVar.b() : null);
            k(byteArrayOutputStream, arrayList7);
            return;
        }
        if (obj instanceof w) {
            byteArrayOutputStream.write(139);
            k(byteArrayOutputStream, ((w) obj).b());
            return;
        }
        if (!(obj instanceof x)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        byteArrayOutputStream.write(140);
        x xVar = (x) obj;
        xVar.getClass();
        ArrayList arrayList8 = new ArrayList(4);
        int i15 = xVar.f12787a;
        arrayList8.add(i15 == 0 ? null : Integer.valueOf(AbstractC0213f.f(i15)));
        arrayList8.add(xVar.f12788b);
        arrayList8.add(xVar.f12789c);
        q qVar2 = xVar.f12790d;
        arrayList8.add(qVar2 != null ? qVar2.b() : null);
        k(byteArrayOutputStream, arrayList8);
    }
}
