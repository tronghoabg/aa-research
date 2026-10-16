package Fe;

import A.AbstractC0213f;
import A.AbstractC0226t;
import A.F;
import A7.AbstractC0279p0;
import E5.Q;
import Ef.C0502n;
import G6.L;
import K.v;
import L8.t;
import N.C0729i0;
import N.C0740o;
import Wf.k0;
import X0.E;
import Xf.o;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.A1;
import com.moloco.sdk.B1;
import com.moloco.sdk.C1;
import com.moloco.sdk.D1;
import ea.C2502q;
import ef.C2529m;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import jf.C3109i;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r7.AbstractC3935e;
import tf.p;
import x0.C4437g;
import x0.C4447q;
import y3.C4552j;
import za.C4658a;

/* loaded from: classes5.dex */
public abstract class e {
    public static void A(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i5 = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (L8.j jVar : (Set) it2.next()) {
                        for (L8.l lVar : jVar.f7012a.f6992c) {
                            if (lVar.f7019c == 0) {
                                Set<L8.j> set = (Set) map.get(new L8.k(lVar.f7017a, lVar.f7018b == 2));
                                if (set != null) {
                                    for (L8.j jVar2 : set) {
                                        jVar.f7013b.add(jVar2);
                                        jVar2.f7014c.add(jVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    L8.j jVar3 = (L8.j) it4.next();
                    if (jVar3.f7014c.isEmpty()) {
                        hashSet2.add(jVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    L8.j jVar4 = (L8.j) hashSet2.iterator().next();
                    hashSet2.remove(jVar4);
                    i5++;
                    Iterator it5 = jVar4.f7013b.iterator();
                    while (it5.hasNext()) {
                        L8.j jVar5 = (L8.j) it5.next();
                        jVar5.f7014c.remove(jVar4);
                        if (jVar5.f7014c.isEmpty()) {
                            hashSet2.add(jVar5);
                        }
                    }
                }
                if (i5 == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    L8.j jVar6 = (L8.j) it6.next();
                    if (!jVar6.f7014c.isEmpty() && !jVar6.f7013b.isEmpty()) {
                        arrayList2.add(jVar6.f7012a);
                    }
                }
                throw new L8.m("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()), 3);
            }
            L8.b bVar = (L8.b) it.next();
            L8.j jVar7 = new L8.j(bVar);
            for (t tVar : bVar.f6991b) {
                boolean z2 = bVar.f6994e == 0;
                L8.k kVar = new L8.k(tVar, !z2);
                if (!map.containsKey(kVar)) {
                    map.put(kVar, new HashSet());
                }
                Set set2 = (Set) map.get(kVar);
                if (!set2.isEmpty() && z2) {
                    throw new IllegalArgumentException("Multiple components provide " + tVar + ".");
                }
                set2.add(jVar7);
            }
        }
    }

    public static Object B(InterfaceC3106f interfaceC3106f, Object obj, p operation) {
        AbstractC3340k.e(operation, "operation");
        return operation.invoke(obj, interfaceC3106f);
    }

    public static InterfaceC3106f C(InterfaceC3106f interfaceC3106f, InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        if (AbstractC3340k.a(interfaceC3106f.getKey(), key)) {
            return interfaceC3106f;
        }
        return null;
    }

    public static final KClass D(SerialDescriptor serialDescriptor) {
        AbstractC3340k.e(serialDescriptor, "<this>");
        if (serialDescriptor instanceof Uf.b) {
            return ((Uf.b) serialDescriptor).f12802b;
        }
        if (serialDescriptor instanceof k0) {
            return D(((k0) serialDescriptor).f15611a);
        }
        return null;
    }

    public static final Object F(C4437g c4437g, C4447q key) {
        AbstractC3340k.e(c4437g, "<this>");
        AbstractC3340k.e(key, "key");
        Object obj = c4437g.f47593a.get(key);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static final String G(String str, Map map) {
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public static final boolean H(E[] eArr, int i5) {
        return eArr[i5] != null;
    }

    public static final long I(long j8) {
        if (j8 < 0) {
            Cf.h hVar = Cf.a.f2200b;
            return Cf.a.f2202d;
        }
        Cf.h hVar2 = Cf.a.f2200b;
        return Cf.a.f2201c;
    }

    public static final int J(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int K(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 == 3) {
            return 4;
        }
        if (i5 == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i5 != 5) {
            throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final int L(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final int M(int i5) {
        if (i5 == 0) {
            return 1;
        }
        if (i5 == 1) {
            return 2;
        }
        if (i5 == 2) {
            return 3;
        }
        if (i5 == 3) {
            return 4;
        }
        if (i5 == 4) {
            return 5;
        }
        if (i5 == 5) {
            return 6;
        }
        throw new IllegalArgumentException(AbstractC0279p0.i(i5, "Could not convert ", " to State"));
    }

    public static InterfaceC3108h N(InterfaceC3106f interfaceC3106f, InterfaceC3107g key) {
        AbstractC3340k.e(key, "key");
        return AbstractC3340k.a(interfaceC3106f.getKey(), key) ? C3109i.f38759a : interfaceC3106f;
    }

    public static InterfaceC3108h O(InterfaceC3106f interfaceC3106f, InterfaceC3108h context) {
        AbstractC3340k.e(context, "context");
        return c.B(interfaceC3106f, context);
    }

    public static void P(AtomicLong atomicLong, long j8) {
        long j10;
        long j11;
        do {
            j10 = atomicLong.get();
            if (j10 == Long.MAX_VALUE) {
                return;
            }
            j11 = j10 - j8;
            if (j11 < 0) {
                S3.f.A(new IllegalStateException(AbstractC0279p0.k(j11, "More produced than requested: ")));
                j11 = 0;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
    }

    public static void Q(Runnable runnable) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long R(long r33, long r35, Cf.c r37) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.e.R(long, long, Cf.c):long");
    }

    public static final long S(long j8, long j10, Cf.c cVar) {
        long j11 = j8 - j10;
        if (((j11 ^ j8) & (~(j11 ^ j10))) >= 0) {
            return b.T(j11, cVar);
        }
        Cf.c cVar2 = Cf.c.f2207c;
        if (cVar.compareTo(cVar2) >= 0) {
            return Cf.a.k(I(j11));
        }
        long jO = c.o(1L, cVar2, cVar);
        long j12 = (j8 / jO) - (j10 / jO);
        long j13 = (j8 % jO) - (j10 % jO);
        Cf.h hVar = Cf.a.f2200b;
        return Cf.a.g(b.T(j12, cVar2), b.T(j13, cVar));
    }

    public static final int T(int i5) {
        AbstractC3256n.m(i5, "state");
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            return 0;
        }
        int i10 = 1;
        if (iF != 1) {
            i10 = 2;
            if (iF != 2) {
                i10 = 3;
                if (iF != 3) {
                    i10 = 4;
                    if (iF != 4) {
                        if (iF == 5) {
                            return 5;
                        }
                        throw new Q((byte) 0, 9);
                    }
                }
            }
        }
        return i10;
    }

    public static final void U(Object obj) {
        if (obj instanceof C2529m) {
            throw ((C2529m) obj).f34673a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object V(java.net.HttpURLConnection r4, Fd.d r5, Ad.b r6, lf.AbstractC3464c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof Ad.i
            if (r0 == 0) goto L13
            r0 = r7
            Ad.i r0 = (Ad.i) r0
            int r1 = r0.f1286d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1286d = r1
            goto L18
        L13:
            Ad.i r0 = new Ad.i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1285c
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1286d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r4 = r0.f1284b
            Fd.d r5 = r0.f1283a
            U(r7)
            goto L49
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            U(r7)
            java.lang.Object r4 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L3b
            return r4
        L3b:
            r4 = move-exception
            r0.f1283a = r5
            r0.f1284b = r4
            r0.f1286d = r3
            java.lang.Object r6 = Ef.H.T(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            boolean r6 = r4 instanceof java.net.SocketTimeoutException
            if (r6 != 0) goto L64
            boolean r6 = r4 instanceof java.net.ConnectException
            r7 = 0
            if (r6 == 0) goto L63
            java.lang.String r6 = r4.getMessage()
            if (r6 == 0) goto L5f
            java.lang.String r0 = "timed out"
            boolean r6 = Bf.k.n0(r6, r0, r7)
            goto L60
        L5f:
            r6 = r7
        L60:
            if (r6 == 0) goto L63
            goto L64
        L63:
            r3 = r7
        L64:
            if (r3 == 0) goto Lae
            vg.b r6 = Cd.q0.f2162a
            java.lang.String r6 = "request"
            kotlin.jvm.internal.AbstractC3340k.e(r5, r6)
            Bd.a r6 = new Bd.a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Connect timeout has expired [url="
            r7.<init>(r0)
            Jd.H r0 = r5.f4051a
            r7.append(r0)
            java.lang.String r0 = ", connect_timeout="
            r7.append(r0)
            Cd.m0 r0 = Cd.m0.f2138a
            Nd.a r1 = zd.g.f48487a
            Nd.d r5 = r5.f4056f
            java.lang.Object r5 = r5.d(r1)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 == 0) goto L93
            java.lang.Object r5 = r5.get(r0)
            goto L94
        L93:
            r5 = 0
        L94:
            Cd.n0 r5 = (Cd.n0) r5
            if (r5 == 0) goto L9c
            java.lang.Long r5 = r5.f2143b
            if (r5 != 0) goto L9e
        L9c:
            java.lang.String r5 = "unknown"
        L9e:
            r7.append(r5)
            java.lang.String r5 = " ms]"
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5, r4)
            r4 = r6
        Lae:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.e.V(java.net.HttpURLConnection, Fd.d, Ad.b, lf.c):java.lang.Object");
    }

    public static List W(JSONArray jSONArray, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (jSONArray != null) {
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                arrayList.add(jSONArray.getString(i5));
            }
        }
        return arrayList;
    }

    public static ArrayList X(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(jsonReader.nextString());
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static JSONObject Y(JsonReader jsonReader) throws JSONException, IOException {
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, Z(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, Y(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONObject.put(strNextName, jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONObject.put(strNextName, jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return jSONObject;
    }

    public static JSONArray Z(JsonReader jsonReader) throws JSONException, IOException {
        JSONArray jSONArray = new JSONArray();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            JsonToken jsonTokenPeek = jsonReader.peek();
            if (JsonToken.BEGIN_ARRAY.equals(jsonTokenPeek)) {
                jSONArray.put(Z(jsonReader));
            } else if (JsonToken.BEGIN_OBJECT.equals(jsonTokenPeek)) {
                jSONArray.put(Y(jsonReader));
            } else if (JsonToken.BOOLEAN.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextBoolean());
            } else if (JsonToken.NUMBER.equals(jsonTokenPeek)) {
                jSONArray.put(jsonReader.nextDouble());
            } else {
                if (!JsonToken.STRING.equals(jsonTokenPeek)) {
                    throw new IllegalStateException("unexpected json token: ".concat(String.valueOf(jsonTokenPeek)));
                }
                jSONArray.put(jsonReader.nextString());
            }
        }
        jsonReader.endArray();
        return jSONArray;
    }

    public static o a(tf.l builderAction) {
        Xf.b from = Xf.c.f16251d;
        AbstractC3340k.e(from, "from");
        AbstractC3340k.e(builderAction, "builderAction");
        Xf.f fVar = new Xf.f();
        Xf.h hVar = from.f16252a;
        fVar.f16260a = hVar.f16270a;
        fVar.f16261b = hVar.f16275f;
        fVar.f16262c = hVar.f16271b;
        fVar.f16263d = hVar.f16272c;
        fVar.f16264e = hVar.f16274e;
        String str = hVar.f16276g;
        fVar.f16265f = str;
        fVar.f16266g = hVar.f16277h;
        fVar.f16267h = hVar.f16279j;
        fVar.f16268i = hVar.f16278i;
        fVar.f16269j = hVar.f16273d;
        fVar.k = from.f16253b;
        builderAction.invoke(fVar);
        if (fVar.f16264e) {
            if (!AbstractC3340k.a(str, "    ")) {
                for (int i5 = 0; i5 < str.length(); i5++) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had ".concat(str).toString());
                    }
                }
            }
        } else if (!AbstractC3340k.a(str, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        Xf.h hVar2 = new Xf.h(fVar.f16260a, fVar.f16262c, fVar.f16263d, fVar.f16269j, fVar.f16264e, fVar.f16261b, fVar.f16265f, fVar.f16266g, fVar.f16268i, fVar.f16267h);
        C4658a module = fVar.k;
        AbstractC3340k.e(module, "module");
        o oVar = new o(hVar2, module);
        if (module.equals(Zf.a.f17089a)) {
            return oVar;
        }
        Xf.a aVar = Xf.a.f16248a;
        return oVar;
    }

    public static void a0(JsonWriter jsonWriter, JSONObject jSONObject) throws JSONException, IOException {
        try {
            jsonWriter.beginObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof String) {
                    jsonWriter.name(next).value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.name(next).value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.name(next).value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    a0(jsonWriter.name(next), (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("unable to write field: ");
                        sb2.append(strValueOf);
                        throw new JSONException(sb2.toString());
                    }
                    b0(jsonWriter.name(next), (JSONArray) obj);
                }
            }
            jsonWriter.endObject();
        } catch (JSONException e7) {
            throw new IOException(e7);
        }
    }

    public static final void b(V.d dVar, C0740o c0740o, int i5) {
        int i10;
        c0740o.N(-1322912246);
        if ((i5 & 14) == 0) {
            i10 = (c0740o.e(dVar) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i10 & 11) == 2 && c0740o.x()) {
            c0740o.I();
        } else {
            dVar.invoke(c0740o, Integer.valueOf(i10 & 14));
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new v(dVar, i5, 1);
    }

    public static void b0(JsonWriter jsonWriter, JSONArray jSONArray) throws JSONException, IOException {
        try {
            jsonWriter.beginArray();
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                Object obj = jSONArray.get(i5);
                if (obj instanceof String) {
                    jsonWriter.value((String) obj);
                } else if (obj instanceof Number) {
                    jsonWriter.value((Number) obj);
                } else if (obj instanceof Boolean) {
                    jsonWriter.value(((Boolean) obj).booleanValue());
                } else if (obj instanceof JSONObject) {
                    a0(jsonWriter, (JSONObject) obj);
                } else {
                    if (!(obj instanceof JSONArray)) {
                        String strValueOf = String.valueOf(obj);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 23);
                        sb2.append("unable to write field: ");
                        sb2.append(strValueOf);
                        throw new JSONException(sb2.toString());
                    }
                    b0(jsonWriter, (JSONArray) obj);
                }
            }
            jsonWriter.endArray();
        } catch (JSONException e7) {
            throw new IOException(e7);
        }
    }

    public static float c(int i5) {
        return i5 / Resources.getSystem().getDisplayMetrics().density;
    }

    public static JSONObject c0(String str, JSONObject jSONObject) throws JSONException {
        try {
            return jSONObject.getJSONObject(str);
        } catch (JSONException unused) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        }
    }

    public static final B1 d(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g gVar) {
        AbstractC3340k.e(gVar, "<this>");
        A1 a1D = B1.d();
        a1D.a(gVar.f32420a);
        a1D.b(gVar.f32421b);
        GeneratedMessageLite generatedMessageLiteBuild = a1D.build();
        AbstractC3340k.d(generatedMessageLiteBuild, "build(...)");
        return (B1) generatedMessageLiteBuild;
    }

    public static Bundle d0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                if (objOpt instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) objOpt).booleanValue());
                } else if (objOpt instanceof Double) {
                    bundle.putDouble(next, ((Double) objOpt).doubleValue());
                } else if (objOpt instanceof Integer) {
                    bundle.putInt(next, ((Integer) objOpt).intValue());
                } else if (objOpt instanceof Long) {
                    bundle.putLong(next, ((Long) objOpt).longValue());
                } else if (objOpt instanceof String) {
                    bundle.putString(next, (String) objOpt);
                } else if (objOpt instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objOpt;
                    if (jSONArray.length() != 0) {
                        int length = jSONArray.length();
                        int i5 = 0;
                        Object objOpt2 = null;
                        for (int i10 = 0; objOpt2 == null && i10 < length; i10++) {
                            objOpt2 = !jSONArray.isNull(i10) ? jSONArray.opt(i10) : null;
                        }
                        if (objOpt2 == null) {
                            String strValueOf = String.valueOf(next);
                            int i11 = L.f4523b;
                            H6.l.f("Expected JSONArray with at least 1 non-null element for key:".concat(strValueOf));
                        } else if (objOpt2 instanceof JSONObject) {
                            Bundle[] bundleArr = new Bundle[length];
                            while (i5 < length) {
                                bundleArr[i5] = !jSONArray.isNull(i5) ? d0(jSONArray.optJSONObject(i5)) : null;
                                i5++;
                            }
                            bundle.putParcelableArray(next, bundleArr);
                        } else if (objOpt2 instanceof Number) {
                            double[] dArr = new double[jSONArray.length()];
                            while (i5 < length) {
                                dArr[i5] = jSONArray.optDouble(i5);
                                i5++;
                            }
                            bundle.putDoubleArray(next, dArr);
                        } else if (objOpt2 instanceof CharSequence) {
                            String[] strArr = new String[length];
                            while (i5 < length) {
                                strArr[i5] = !jSONArray.isNull(i5) ? jSONArray.optString(i5) : null;
                                i5++;
                            }
                            bundle.putStringArray(next, strArr);
                        } else if (objOpt2 instanceof Boolean) {
                            boolean[] zArr = new boolean[length];
                            while (i5 < length) {
                                zArr[i5] = jSONArray.optBoolean(i5);
                                i5++;
                            }
                            bundle.putBooleanArray(next, zArr);
                        } else {
                            String strH = N0.a.h("JSONArray with unsupported type ", objOpt2.getClass().getCanonicalName(), " for key:", next);
                            int i12 = L.f4523b;
                            H6.l.f(strH);
                        }
                    }
                } else if (objOpt instanceof JSONObject) {
                    bundle.putBundle(next, d0((JSONObject) objOpt));
                } else {
                    String strValueOf2 = String.valueOf(next);
                    int i13 = L.f4523b;
                    H6.l.f("Unsupported type for key:".concat(strValueOf2));
                }
            }
        }
        return bundle;
    }

    public static final D1 e(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h hVar) {
        AbstractC3340k.e(hVar, "<this>");
        C1 c1D = D1.d();
        c1D.b(hVar.f32422a);
        c1D.a(hVar.f32423b);
        GeneratedMessageLite generatedMessageLiteBuild = c1D.build();
        AbstractC3340k.d(generatedMessageLiteBuild, "build(...)");
        return (D1) generatedMessageLiteBuild;
    }

    public static String e0(zzfks zzfksVar) throws JSONException, IOException {
        if (zzfksVar == null) {
            return null;
        }
        StringWriter stringWriter = new StringWriter();
        try {
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            f0(jsonWriter, zzfksVar);
            jsonWriter.close();
            return stringWriter.toString();
        } catch (IOException e7) {
            int i5 = L.f4523b;
            H6.l.d("Error when writing JSON.", e7);
            return null;
        }
    }

    public static long f(AtomicLong atomicLong, long j8) {
        long j10;
        do {
            j10 = atomicLong.get();
            if (j10 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j10, h(j10, j8)));
        return j10;
    }

    public static void f0(JsonWriter jsonWriter, Object obj) throws JSONException, IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return;
        }
        if (obj instanceof Boolean) {
            jsonWriter.value(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            jsonWriter.value((String) obj);
            return;
        }
        if (obj instanceof zzfks) {
            a0(jsonWriter, ((zzfks) obj).zzd);
            return;
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                f0(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.beginObject();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            if (key instanceof String) {
                f0(jsonWriter.name((String) key), entry.getValue());
            }
        }
        jsonWriter.endObject();
    }

    public static final void g(E[] eArr, E e7, int i5) {
        e7.f15790d = eArr[i5];
        eArr[i5] = e7;
    }

    public static JSONObject g0(JSONObject jSONObject, String[] strArr) {
        for (int i5 = 0; i5 < strArr.length - 1; i5 = 1) {
            if (jSONObject == null) {
                return null;
            }
            jSONObject = jSONObject.optJSONObject(strArr[0]);
        }
        return jSONObject;
    }

    public static long h(long j8, long j10) {
        long j11 = j8 + j10;
        if (j11 < 0) {
            return Long.MAX_VALUE;
        }
        return j11;
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, Object obj, int i5, int i10) {
        for (Object obj2 : spannableStringBuilder.getSpans(i5, i10, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i5 && spannableStringBuilder.getSpanEnd(obj2) == i10 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i5, i10, 33);
    }

    public static Z.k j(Z.k kVar) {
        F fI = AbstractC0226t.i(7, null);
        AbstractC3340k.e(kVar, "<this>");
        return AbstractC3935e.n(kVar, new G.f(fI, 6));
    }

    public static final Object k(Task task, C2502q c2502q) throws Exception {
        if (!task.isComplete()) {
            C0502n c0502n = new C0502n(1, A6.h.A(c2502q));
            c0502n.t();
            task.addOnCompleteListener(Of.a.f8963a, new C4552j(c0502n, 19));
            Object objS = c0502n.s();
            kf.a aVar = kf.a.f39711a;
            return objS;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static String l(int i5, int i10, String str) {
        if (i5 < 0) {
            return g.E("%s (%s) must not be negative", str, Integer.valueOf(i5));
        }
        if (i10 >= 0) {
            return g.E("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i5), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
    }

    public static final LinkedHashSet m(byte[] bytes) throws IOException {
        ObjectInputStream objectInputStream;
        AbstractC3340k.e(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length != 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                try {
                    int i5 = objectInputStream.readInt();
                    for (int i10 = 0; i10 < i5; i10++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z2 = objectInputStream.readBoolean();
                        AbstractC3340k.d(uri, "uri");
                        linkedHashSet.add(new J3.c(z2, uri));
                    }
                    objectInputStream.close();
                    byteArrayInputStream.close();
                } finally {
                }
            } finally {
            }
        }
        return linkedHashSet;
    }

    public static void n(int i5, String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(g.E(str, Integer.valueOf(i5)));
        }
    }

    public static void o(String str, long j8, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(g.E(str, Long.valueOf(j8)));
        }
    }

    public static void p(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void q(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static void r(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(g.E(str, obj));
        }
    }

    public static void s(int i5, int i10) {
        String strE;
        if (i5 < 0 || i5 >= i10) {
            if (i5 < 0) {
                strE = g.E("%s (%s) must not be negative", "index", Integer.valueOf(i5));
            } else {
                if (i10 < 0) {
                    throw new IllegalArgumentException(AbstractC3256n.g(i10, "negative size: "));
                }
                strE = g.E("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i5), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strE);
        }
    }

    public static void t(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void u(int i5, int i10) {
        if (i5 < 0 || i5 > i10) {
            throw new IndexOutOfBoundsException(l(i5, i10, "index"));
        }
    }

    public static void v(int i5, int i10, int i11) {
        if (i5 < 0 || i10 < i5 || i10 > i11) {
            throw new IndexOutOfBoundsException((i5 < 0 || i5 > i11) ? l(i5, i11, "start index") : (i10 < 0 || i10 > i11) ? l(i10, i11, "end index") : g.E("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i5)));
        }
    }

    public static void w(String str, boolean z2) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void x(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    public static void y(boolean z2, String str, Object obj) {
        if (!z2) {
            throw new IllegalStateException(g.E(str, obj));
        }
    }

    public static final C2529m z(Throwable exception) {
        AbstractC3340k.e(exception, "exception");
        return new C2529m(exception);
    }

    public abstract void E(c8.t tVar, float f10, float f11);
}
