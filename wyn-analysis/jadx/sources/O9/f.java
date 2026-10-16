package o9;

import R8.v;
import com.applovin.shadow.okio.Segment;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import ka.B1;
import ka.C1;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p9.C3782c;
import p9.t;
import p9.u;
import s9.k;
import s9.l;
import s9.m;
import s9.o;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final Charset f41444f = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final g f41445a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteArrayInputStream f41446b;

    /* renamed from: c, reason: collision with root package name */
    public e f41447c;

    /* renamed from: d, reason: collision with root package name */
    public final ByteBuffer f41448d;

    /* renamed from: e, reason: collision with root package name */
    public long f41449e;

    public f(g gVar, ByteArrayInputStream byteArrayInputStream) {
        this.f41445a = gVar;
        this.f41446b = byteArrayInputStream;
        new InputStreamReader(byteArrayInputStream);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(Segment.SHARE_MINIMUM);
        this.f41448d = byteBufferAllocate;
        byteBufferAllocate.flip();
    }

    public final void a(String str) throws IOException {
        this.f41446b.close();
        throw new IllegalArgumentException(v.f("Invalid bundle: ", str));
    }

    public final boolean b() throws IOException {
        ByteBuffer byteBuffer = this.f41448d;
        byteBuffer.compact();
        int i5 = this.f41446b.read(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        boolean z2 = i5 > 0;
        if (z2) {
            byteBuffer.position(byteBuffer.position() + i5);
        }
        byteBuffer.flip();
        return z2;
    }

    public final c c() throws JSONException, NumberFormatException, IOException {
        ByteBuffer byteBuffer;
        int i5;
        String string;
        String string2;
        int i10;
        do {
            byteBuffer = this.f41448d;
            byteBuffer.mark();
            i5 = 0;
            while (true) {
                try {
                    if (i5 >= byteBuffer.remaining()) {
                        byteBuffer.reset();
                        i5 = -1;
                        break;
                    }
                    if (byteBuffer.get() == 123) {
                        break;
                    }
                    i5++;
                } finally {
                    byteBuffer.reset();
                }
            }
            if (i5 != -1) {
                break;
            }
        } while (b());
        int iRemaining = byteBuffer.remaining();
        Charset charset = f41444f;
        if (iRemaining == 0) {
            string = null;
        } else {
            if (i5 == -1) {
                a("Reached the end of bundle when a length string is expected.");
                throw null;
            }
            byte[] bArr = new byte[i5];
            byteBuffer.get(bArr);
            string = charset.decode(ByteBuffer.wrap(bArr)).toString();
        }
        if (string == null) {
            return null;
        }
        int i11 = Integer.parseInt(string);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i12 = i11;
        while (i12 > 0) {
            if (byteBuffer.remaining() == 0 && !b()) {
                a("Reached the end of bundle when more data was expected.");
                throw null;
            }
            int iMin = Math.min(i12, byteBuffer.remaining());
            byteArrayOutputStream.write(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iMin);
            byteBuffer.position(byteBuffer.position() + iMin);
            i12 -= iMin;
        }
        String string3 = byteArrayOutputStream.toString(charset.name());
        this.f41449e += string.getBytes(charset).length + i11;
        JSONObject jSONObject = new JSONObject(string3);
        boolean zHas = jSONObject.has(ExternalParsersConfigReaderMetKeys.METADATA_TAG);
        g gVar = this.f41445a;
        if (zHas) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(ExternalParsersConfigReaderMetKeys.METADATA_TAG);
            gVar.getClass();
            e eVar = new e(jSONObject2.getString("id"), jSONObject2.getInt("version"), new o(gVar.e(jSONObject2.get("createTime"))), jSONObject2.getInt("totalDocuments"), jSONObject2.getLong("totalBytes"));
            Ba.c.p("BundleElement", "BundleMetadata element loaded", 1, new Object[0]);
            return eVar;
        }
        if (!jSONObject.has("namedQuery")) {
            if (jSONObject.has("documentMetadata")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("documentMetadata");
                gVar.getClass();
                s9.h hVar = new s9.h(gVar.c(jSONObject3.getString(MediationMetaData.KEY_NAME)));
                o oVar = new o(gVar.e(jSONObject3.get("readTime")));
                boolean zOptBoolean = jSONObject3.optBoolean("exists", false);
                JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("queries");
                ArrayList arrayList = new ArrayList();
                if (jSONArrayOptJSONArray != null) {
                    for (int i13 = 0; i13 < jSONArrayOptJSONArray.length(); i13++) {
                        arrayList.add(jSONArrayOptJSONArray.getString(i13));
                    }
                }
                h hVar2 = new h(hVar, oVar, zOptBoolean, arrayList);
                Ba.c.p("BundleElement", "Document metadata loaded: " + hVar, 1, new Object[0]);
                return hVar2;
            }
            if (!jSONObject.has("document")) {
                a("Cannot decode unknown Bundle element: " + string3);
                throw null;
            }
            JSONObject jSONObject4 = jSONObject.getJSONObject("document");
            gVar.getClass();
            s9.h hVar3 = new s9.h(gVar.c(jSONObject4.getString(MediationMetaData.KEY_NAME)));
            o oVar2 = new o(gVar.e(jSONObject4.get("updateTime")));
            B1 b1W = C1.w();
            gVar.b(b1W, jSONObject4.getJSONObject("fields"));
            l lVarE = l.e(b1W.a().getFieldsMap());
            k kVar = new k(hVar3);
            kVar.a(oVar2, lVarE);
            C3659b c3659b = new C3659b();
            c3659b.f41431a = kVar;
            Ba.c.p("BundleElement", "Document loaded: " + hVar3, 1, new Object[0]);
            return c3659b;
        }
        JSONObject jSONObject5 = jSONObject.getJSONObject("namedQuery");
        gVar.getClass();
        String string4 = jSONObject5.getString(MediationMetaData.KEY_NAME);
        JSONObject jSONObject6 = jSONObject5.getJSONObject("bundledQuery");
        JSONObject jSONObject7 = jSONObject6.getJSONObject("structuredQuery");
        if (jSONObject7.has("select")) {
            throw new IllegalArgumentException("Queries with 'select' statements are not supported by the Android SDK");
        }
        m mVarC = gVar.c(jSONObject6.getString("parent"));
        JSONArray jSONArray = jSONObject7.getJSONArray("from");
        if (jSONArray.length() != 1) {
            throw new IllegalArgumentException("Only queries with a single 'from' clause are supported by the Android SDK");
        }
        JSONObject jSONObject8 = jSONArray.getJSONObject(0);
        if (jSONObject8.optBoolean("allDescendants", false)) {
            string2 = jSONObject8.getString("collectionId");
        } else {
            mVarC = (m) mVarC.a(jSONObject8.getString("collectionId"));
            string2 = null;
        }
        m mVar = mVarC;
        JSONObject jSONObjectOptJSONObject = jSONObject7.optJSONObject("where");
        ArrayList arrayList2 = new ArrayList();
        if (jSONObjectOptJSONObject != null) {
            gVar.a(arrayList2, jSONObjectOptJSONObject);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject7.optJSONArray("orderBy");
        ArrayList arrayList3 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            int i14 = 0;
            while (i14 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObject9 = jSONArrayOptJSONArray2.getJSONObject(i14);
                int i15 = i14;
                JSONArray jSONArray2 = jSONArrayOptJSONArray2;
                arrayList3.add(new t(jSONObject9.optString("direction", "ASCENDING").equals("ASCENDING") ? 1 : 2, s9.j.l(jSONObject9.getJSONObject("field").getString("fieldPath"))));
                i14 = i15 + 1;
                jSONArrayOptJSONArray2 = jSONArray2;
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject7.optJSONObject("startAt");
        C3782c c3782c = jSONObjectOptJSONObject2 != null ? new C3782c(gVar.d(jSONObjectOptJSONObject2), jSONObjectOptJSONObject2.optBoolean("before", false)) : null;
        JSONObject jSONObjectOptJSONObject3 = jSONObject7.optJSONObject("endAt");
        C3782c c3782c2 = jSONObjectOptJSONObject3 != null ? new C3782c(gVar.d(jSONObjectOptJSONObject3), !jSONObjectOptJSONObject3.optBoolean("before", false)) : null;
        if (jSONObject7.has(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR)) {
            throw new IllegalArgumentException("Queries with offsets are not supported by the Android SDK");
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject7.optJSONObject("limit");
        int iOptInt = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optInt(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, -1) : jSONObject7.optInt("limit", -1);
        String strOptString = jSONObject6.optString("limitType", "FIRST");
        if (strOptString.equals("FIRST")) {
            i10 = 1;
        } else {
            if (!strOptString.equals("LAST")) {
                throw new IllegalArgumentException("Invalid limit type for bundle query: ".concat(strOptString));
            }
            i10 = 2;
        }
        j jVar = new j(string4, new i(new u(mVar, string2, arrayList2, arrayList3, iOptInt, 1, c3782c, c3782c2).i(), i10), new o(gVar.e(jSONObject5.get("readTime"))));
        Ba.c.p("BundleElement", v.f("Query loaded: ", string4), 1, new Object[0]);
        return jVar;
    }
}
