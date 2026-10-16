package Uc;

import A.AbstractC0213f;
import A7.AbstractC0279p0;
import A7.X;
import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m9.AbstractC3524x;
import m9.C3508g;
import m9.C3510i;
import m9.C3514m;
import m9.C3516o;
import m9.C3519s;
import m9.C3520t;
import m9.C3522v;
import m9.C3526z;
import m9.EnumC3515n;
import m9.H;
import m9.J;
import m9.O;
import m9.Q;
import m9.S;
import m9.T;
import m9.W;
import m9.Y;
import m9.b0;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import p9.C3782c;
import p9.EnumC3788i;
import uc.C4286w;

/* loaded from: classes5.dex */
public class c extends C4286w {

    /* renamed from: d, reason: collision with root package name */
    public static final c f12715d = new c();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m9.AbstractC3501A l(java.util.Map r8) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Uc.c.l(java.util.Map):m9.A");
    }

    public static Object[] m(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(AbstractC0279p0.l("java.util.List was expected, unable to convert '", obj.getClass().getCanonicalName(), "' to an object array"));
    }

    @Override // uc.C4286w
    public Object f(byte b5, ByteBuffer byteBuffer) {
        switch (b5) {
            case -76:
                return new Date(byteBuffer.getLong());
            case -75:
                C4286w.c(8, byteBuffer);
                return new J(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -74:
                return ((FirebaseFirestore) e(byteBuffer)).d((String) e(byteBuffer));
            case -73:
                byte[] bArr = new byte[C4286w.d(byteBuffer)];
                byteBuffer.get(bArr);
                return new C3508g(ByteString.copyFrom(bArr));
            case -72:
                return new C3520t(Arrays.asList(m(e(byteBuffer))));
            case -71:
                return new C3519s(Arrays.asList(m(e(byteBuffer))));
            case -70:
                return AbstractC3524x.f40512a;
            case -69:
                return AbstractC3524x.f40513b;
            case -68:
                return new s8.q(byteBuffer.getLong(), byteBuffer.getInt());
            case -67:
                return new C3522v(Double.valueOf(((Number) e(byteBuffer)).doubleValue()));
            case -66:
                return new C3522v(Long.valueOf(((Number) e(byteBuffer)).intValue()));
            case -65:
                return m9.r.f40507c;
            case -64:
                int iD = C4286w.d(byteBuffer);
                ArrayList arrayList = new ArrayList(iD);
                for (int i5 = 0; i5 < iD; i5++) {
                    arrayList.add(e(byteBuffer));
                }
                return m9.r.b((String[]) arrayList.toArray(new String[0]));
            case -63:
                return Double.valueOf(Double.NaN);
            case -62:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -61:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -60:
                String str = (String) e(byteBuffer);
                String str2 = (String) e(byteBuffer);
                H h10 = (H) e(byteBuffer);
                synchronized (f.f12728h) {
                    try {
                        FirebaseFirestore firebaseFirestoreD = f.d(str, str2);
                        if (firebaseFirestoreD != null) {
                            return firebaseFirestoreD;
                        }
                        FirebaseFirestore firebaseFirestoreE = FirebaseFirestore.e(s8.g.f(str), str2);
                        firebaseFirestoreE.h(h10);
                        f.i(firebaseFirestoreE, str2);
                        return firebaseFirestoreE;
                    } finally {
                    }
                }
            case -59:
                try {
                    Map map = (Map) e(byteBuffer);
                    Object obj = map.get("firestore");
                    Objects.requireNonNull(obj);
                    FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
                    Object obj2 = map.get("path");
                    Objects.requireNonNull(obj2);
                    String str3 = (String) obj2;
                    boolean zBooleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
                    Map map2 = (Map) map.get("parameters");
                    W wC = zBooleanValue ? firebaseFirestore.c(str3) : firebaseFirestore.b(str3);
                    if (map2 == null) {
                        return wC;
                    }
                    if (map2.containsKey("filters")) {
                        Object obj3 = map2.get("filters");
                        Objects.requireNonNull(obj3);
                        wC = wC.j(l((Map) obj3));
                    }
                    Object obj4 = map2.get("where");
                    Objects.requireNonNull(obj4);
                    for (List list : (List) obj4) {
                        m9.r rVar = (m9.r) list.get(0);
                        String str4 = (String) list.get(1);
                        Object obj5 = list.get(2);
                        if ("==".equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.EQUAL, obj5));
                        } else if ("!=".equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.NOT_EQUAL, obj5));
                        } else if ("<".equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.LESS_THAN, obj5));
                        } else if ("<=".equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.LESS_THAN_OR_EQUAL, obj5));
                        } else if (">".equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.GREATER_THAN, obj5));
                        } else if (">=".equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.GREATER_THAN_OR_EQUAL, obj5));
                        } else if ("array-contains".equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.ARRAY_CONTAINS, obj5));
                        } else if ("array-contains-any".equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.ARRAY_CONTAINS_ANY, (List) obj5));
                        } else if (ScarConstants.IN_SIGNAL_KEY.equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.IN, (List) obj5));
                        } else if ("not-in".equals(str4)) {
                            wC.getClass();
                            wC = wC.j(new C3526z(rVar, EnumC3788i.NOT_IN, (List) obj5));
                        } else {
                            Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str4 + " was received but not handled.");
                        }
                    }
                    Number number = (Number) map2.get("limit");
                    if (number != null) {
                        wC = wC.d(number.longValue());
                    }
                    Number number2 = (Number) map2.get("limitToLast");
                    if (number2 != null) {
                        wC = wC.e(number2.longValue());
                    }
                    List<List> list2 = (List) map2.get("orderBy");
                    if (list2 == null) {
                        return wC;
                    }
                    for (List list3 : list2) {
                        wC = wC.f((m9.r) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? 2 : 1);
                    }
                    List list4 = (List) map2.get("startAt");
                    if (list4 != null) {
                        Object[] array = list4.toArray();
                        Objects.requireNonNull(array);
                        C3782c c3782cB = wC.b(true, "startAt", array);
                        p9.u uVar = wC.f40456a;
                        wC = new W(new p9.u(uVar.f43415f, uVar.f43416g, uVar.f43414e, uVar.f43410a, uVar.f43417h, uVar.f43418i, c3782cB, uVar.k), wC.f40457b);
                    }
                    List list5 = (List) map2.get("startAfter");
                    if (list5 != null) {
                        Object[] array2 = list5.toArray();
                        Objects.requireNonNull(array2);
                        C3782c c3782cB2 = wC.b(false, "startAfter", array2);
                        p9.u uVar2 = wC.f40456a;
                        wC = new W(new p9.u(uVar2.f43415f, uVar2.f43416g, uVar2.f43414e, uVar2.f43410a, uVar2.f43417h, uVar2.f43418i, c3782cB2, uVar2.k), wC.f40457b);
                    }
                    List list6 = (List) map2.get("endAt");
                    if (list6 != null) {
                        Object[] array3 = list6.toArray();
                        Objects.requireNonNull(array3);
                        C3782c c3782cB3 = wC.b(true, "endAt", array3);
                        p9.u uVar3 = wC.f40456a;
                        wC = new W(new p9.u(uVar3.f43415f, uVar3.f43416g, uVar3.f43414e, uVar3.f43410a, uVar3.f43417h, uVar3.f43418i, uVar3.f43419j, c3782cB3), wC.f40457b);
                    }
                    List list7 = (List) map2.get("endBefore");
                    if (list7 == null) {
                        return wC;
                    }
                    Object[] array4 = list7.toArray();
                    Objects.requireNonNull(array4);
                    C3782c c3782cB4 = wC.b(false, "endBefore", array4);
                    p9.u uVar4 = wC.f40456a;
                    return new W(new p9.u(uVar4.f43415f, uVar4.f43416g, uVar4.f43414e, uVar4.f43410a, uVar4.f43417h, uVar4.f43418i, uVar4.f43419j, c3782cB4), wC.f40457b);
                } catch (Exception e7) {
                    Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e7);
                    return null;
                }
            case -58:
                Map map3 = (Map) e(byteBuffer);
                X x5 = new X();
                if (map3.get("persistenceEnabled") != null) {
                    if (Boolean.TRUE.equals((Boolean) map3.get("persistenceEnabled"))) {
                        long jLongValue = 104857600;
                        if (map3.get("cacheSizeBytes") != null) {
                            Long lValueOf = 104857600L;
                            Object obj6 = map3.get("cacheSizeBytes");
                            if (obj6 instanceof Long) {
                                lValueOf = (Long) obj6;
                            } else if (obj6 instanceof Integer) {
                                lValueOf = Long.valueOf(((Integer) obj6).intValue());
                            }
                            jLongValue = lValueOf.longValue() == -1 ? -1L : lValueOf.longValue();
                        }
                        x5.b(new T(jLongValue));
                    } else {
                        S s10 = new S(0);
                        Q q4 = new Q();
                        q4.f40453a = s10;
                        x5.b(q4);
                    }
                }
                if (map3.get("host") != null) {
                    Object obj7 = map3.get("host");
                    Objects.requireNonNull(obj7);
                    x5.f741a = (String) obj7;
                    if (map3.get("sslEnabled") != null) {
                        Object obj8 = map3.get("sslEnabled");
                        Objects.requireNonNull(obj8);
                        x5.f742b = ((Boolean) obj8).booleanValue();
                    }
                }
                return x5.a();
            default:
                return super.f(b5, byteBuffer);
        }
    }

    @Override // uc.C4286w
    public void k(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        String str;
        Object obj2;
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-76);
            C4286w.i(byteArrayOutputStream, ((Date) obj).getTime());
            return;
        }
        if (obj instanceof s8.q) {
            byteArrayOutputStream.write(-68);
            s8.q qVar = (s8.q) obj;
            C4286w.i(byteArrayOutputStream, qVar.f45352a);
            C4286w.h(byteArrayOutputStream, qVar.f45353b);
            return;
        }
        if (obj instanceof J) {
            byteArrayOutputStream.write(-75);
            C4286w.g(byteArrayOutputStream, 8);
            J j8 = (J) obj;
            C4286w.i(byteArrayOutputStream, Double.doubleToLongBits(j8.f40437a));
            C4286w.i(byteArrayOutputStream, Double.doubleToLongBits(j8.f40438b));
            return;
        }
        if (obj instanceof C3514m) {
            byteArrayOutputStream.write(-74);
            C3514m c3514m = (C3514m) obj;
            FirebaseFirestore firebaseFirestore = c3514m.f40496b;
            s8.g gVar = firebaseFirestore.f27328g;
            gVar.a();
            k(byteArrayOutputStream, gVar.f45329b);
            k(byteArrayOutputStream, c3514m.d());
            synchronized (f.f12728h) {
                obj2 = f.b(firebaseFirestore).f12714b;
            }
            k(byteArrayOutputStream, obj2);
            return;
        }
        String str2 = null;
        if (obj instanceof C3516o) {
            C3516o c3516o = (C3516o) obj;
            HashMap map = new HashMap();
            s9.h hVar = c3516o.f40503b;
            hVar.getClass();
            map.put("path", hVar.f45375a.c());
            if (c3516o.f40504c != null) {
                EnumC3515n enumC3515n = (EnumC3515n) f.f12729i.get(Integer.valueOf(c3516o.hashCode()));
                if (enumC3515n != null) {
                    map.put(JsonStorageKeyNames.DATA_KEY, c3516o.a(enumC3515n));
                } else {
                    map.put(JsonStorageKeyNames.DATA_KEY, c3516o.b());
                }
            } else {
                map.put(JsonStorageKeyNames.DATA_KEY, null);
            }
            map.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, c3516o.f40505d);
            f.f12729i.remove(Integer.valueOf(c3516o.hashCode()));
            k(byteArrayOutputStream, map);
            return;
        }
        if (obj instanceof Y) {
            Y y10 = (Y) obj;
            ArrayList arrayList = new ArrayList();
            HashMap map2 = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            EnumC3515n enumC3515n2 = (EnumC3515n) f.f12729i.get(Integer.valueOf(y10.hashCode()));
            Iterator it = y10.b().iterator();
            while (it.hasNext()) {
                C3516o c3516o2 = (C3516o) it.next();
                s9.h hVar2 = c3516o2.f40503b;
                hVar2.getClass();
                arrayList.add(hVar2.f45375a.c());
                if (enumC3515n2 != null) {
                    arrayList2.add(c3516o2.a(enumC3515n2));
                } else {
                    arrayList2.add(c3516o2.b());
                }
                arrayList3.add(c3516o2.f40505d);
            }
            map2.put("paths", arrayList);
            map2.put("documents", arrayList2);
            map2.put("metadatas", arrayList3);
            map2.put("documentChanges", y10.a());
            map2.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, y10.f40463f);
            f.f12729i.remove(Integer.valueOf(y10.hashCode()));
            k(byteArrayOutputStream, map2);
            return;
        }
        if (obj instanceof C3510i) {
            C3510i c3510i = (C3510i) obj;
            HashMap map3 = new HashMap();
            int iF = AbstractC0213f.f(c3510i.f40483a);
            if (iF == 0) {
                str2 = "DocumentChangeType.added";
            } else if (iF == 1) {
                str2 = "DocumentChangeType.modified";
            } else if (iF == 2) {
                str2 = "DocumentChangeType.removed";
            }
            map3.put("type", str2);
            m9.X x5 = c3510i.f40484b;
            map3.put(JsonStorageKeyNames.DATA_KEY, x5.b());
            s9.h hVar3 = x5.f40503b;
            hVar3.getClass();
            map3.put("path", hVar3.f45375a.c());
            map3.put("oldIndex", Integer.valueOf(c3510i.f40485c));
            map3.put("newIndex", Integer.valueOf(c3510i.f40486d));
            map3.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, x5.f40505d);
            k(byteArrayOutputStream, map3);
            return;
        }
        if (obj instanceof O) {
            O o7 = (O) obj;
            HashMap map4 = new HashMap();
            map4.put("bytesLoaded", Long.valueOf(o7.f40449c));
            map4.put("documentsLoaded", Integer.valueOf(o7.f40447a));
            map4.put("totalBytes", Long.valueOf(o7.f40450d));
            map4.put("totalDocuments", Integer.valueOf(o7.f40448b));
            int iF2 = AbstractC0213f.f(o7.f40451e);
            if (iF2 != 0) {
                str = "running";
                if (iF2 != 1 && iF2 == 2) {
                    str = "success";
                }
            } else {
                str = "error";
            }
            map4.put("taskState", str);
            k(byteArrayOutputStream, map4);
            return;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            HashMap map5 = new HashMap();
            map5.put("hasPendingWrites", Boolean.valueOf(b0Var.f40468a));
            map5.put("isFromCache", Boolean.valueOf(b0Var.f40469b));
            k(byteArrayOutputStream, map5);
            return;
        }
        if (obj instanceof C3508g) {
            byteArrayOutputStream.write(-73);
            byte[] byteArray = ((C3508g) obj).f40481a.toByteArray();
            C4286w.j(byteArrayOutputStream, byteArray.length);
            byteArrayOutputStream.write(byteArray, 0, byteArray.length);
            return;
        }
        if (!(obj instanceof Double)) {
            super.k(byteArrayOutputStream, obj);
            return;
        }
        Double d3 = (Double) obj;
        if (Double.isNaN(d3.doubleValue())) {
            byteArrayOutputStream.write(-63);
            return;
        }
        if (d3.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
            byteArrayOutputStream.write(-61);
        } else if (d3.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
            byteArrayOutputStream.write(-62);
        } else {
            super.k(byteArrayOutputStream, obj);
        }
    }
}
