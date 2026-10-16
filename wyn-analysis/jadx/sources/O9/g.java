package o9;

import android.util.Base64;
import com.google.protobuf.ByteString;
import com.google.protobuf.NullValue;
import com.google.protobuf.Timestamp;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import ka.B1;
import ka.C1;
import ka.C3232f;
import ka.C3235g;
import ka.C3257n0;
import ka.C3263p0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s8.q;
import s9.m;
import v9.o;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f41450a;

    /* renamed from: b, reason: collision with root package name */
    public final o f41451b;

    public g(o oVar) {
        this.f41451b = oVar;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        this.f41450a = simpleDateFormat;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.ArrayList r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            java.lang.String r2 = "compositeFilter"
            boolean r3 = r9.has(r2)
            java.lang.String r4 = "op"
            if (r3 == 0) goto L3b
            org.json.JSONObject r9 = r9.getJSONObject(r2)
            java.lang.String r2 = r9.getString(r4)
            java.lang.String r3 = "AND"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L33
            java.lang.String r2 = "filters"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            if (r9 == 0) goto Lfd
        L24:
            int r2 = r9.length()
            if (r1 >= r2) goto Lfd
            org.json.JSONObject r2 = r9.getJSONObject(r1)
            r7.a(r8, r2)
            int r1 = r1 + r0
            goto L24
        L33:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "The Android SDK only supports composite filters of type 'AND'"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.String r2 = "fieldFilter"
            boolean r3 = r9.has(r2)
            java.lang.String r5 = "fieldPath"
            java.lang.String r6 = "field"
            if (r3 == 0) goto L71
            org.json.JSONObject r9 = r9.getJSONObject(r2)
            org.json.JSONObject r0 = r9.getJSONObject(r6)
            java.lang.String r0 = r0.getString(r5)
            s9.j r0 = s9.j.l(r0)
            java.lang.String r1 = r9.getString(r4)
            p9.i r1 = p9.EnumC3788i.valueOf(r1)
            java.lang.String r2 = "value"
            org.json.JSONObject r9 = r9.getJSONObject(r2)
            ka.C1 r9 = r7.f(r9)
            p9.j r9 = p9.C3789j.e(r0, r1, r9)
            r8.add(r9)
            return
        L71:
            java.lang.String r2 = "unaryFilter"
            boolean r3 = r9.has(r2)
            if (r3 == 0) goto Lfd
            org.json.JSONObject r9 = r9.getJSONObject(r2)
            org.json.JSONObject r2 = r9.getJSONObject(r6)
            java.lang.String r2 = r2.getString(r5)
            s9.j r2 = s9.j.l(r2)
            java.lang.String r9 = r9.getString(r4)
            r9.getClass()
            p9.i r3 = p9.EnumC3788i.EQUAL
            p9.i r4 = p9.EnumC3788i.NOT_EQUAL
            r5 = -1
            int r6 = r9.hashCode()
            switch(r6) {
                case -2125479834: goto Lbd;
                case -1465346180: goto Lb4;
                case -244195494: goto La9;
                case 1019893512: goto L9e;
                default: goto L9c;
            }
        L9c:
            r0 = r5
            goto Lc7
        L9e:
            java.lang.String r0 = "IS_NOT_NULL"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto La7
            goto L9c
        La7:
            r0 = 3
            goto Lc7
        La9:
            java.lang.String r0 = "IS_NOT_NAN"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lb2
            goto L9c
        Lb2:
            r0 = 2
            goto Lc7
        Lb4:
            java.lang.String r1 = "IS_NULL"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto Lc7
            goto L9c
        Lbd:
            java.lang.String r0 = "IS_NAN"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto Lc6
            goto L9c
        Lc6:
            r0 = r1
        Lc7:
            switch(r0) {
                case 0: goto Lf4;
                case 1: goto Lea;
                case 2: goto Le0;
                case 3: goto Ld6;
                default: goto Lca;
            }
        Lca:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unexpected unary filter: "
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9)
            throw r8
        Ld6:
            ka.C1 r9 = s9.p.f45392b
            p9.j r9 = p9.C3789j.e(r2, r4, r9)
            r8.add(r9)
            return
        Le0:
            ka.C1 r9 = s9.p.f45391a
            p9.j r9 = p9.C3789j.e(r2, r4, r9)
            r8.add(r9)
            return
        Lea:
            ka.C1 r9 = s9.p.f45392b
            p9.j r9 = p9.C3789j.e(r2, r3, r9)
            r8.add(r9)
            return
        Lf4:
            ka.C1 r9 = s9.p.f45391a
            p9.j r9 = p9.C3789j.e(r2, r3, r9)
            r8.add(r9)
        Lfd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.g.a(java.util.ArrayList, org.json.JSONObject):void");
    }

    public final void b(B1 b12, JSONObject jSONObject) {
        C3257n0 c3257n0F = C3263p0.f();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                c3257n0F.b(next, f(jSONObject.getJSONObject(next)));
            }
        }
        b12.j(c3257n0F);
    }

    public final m c(String str) {
        m mVarL = m.l(str);
        o oVar = this.f41451b;
        if (o.n(mVarL)) {
            String strG = mVarL.g(1);
            s9.f fVar = oVar.f47101a;
            if (strG.equals(fVar.f45370a) && mVarL.g(3).equals(fVar.f45371b)) {
                return (m) mVarL.j();
            }
        }
        throw new IllegalArgumentException("Resource name is not valid for current instance: ".concat(str));
    }

    public final ArrayList d(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("values");
        if (jSONArrayOptJSONArray != null) {
            for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                arrayList.add(f(jSONArrayOptJSONArray.getJSONObject(i5)));
            }
        }
        return arrayList;
    }

    public final q e(Object obj) {
        int iCharAt;
        if (!(obj instanceof String)) {
            if (!(obj instanceof JSONObject)) {
                throw new IllegalArgumentException("Timestamps must be either ISO 8601-formatted strings or JSON objects");
            }
            JSONObject jSONObject = (JSONObject) obj;
            return new q(jSONObject.optLong("seconds"), jSONObject.optInt("nanos"));
        }
        String str = (String) obj;
        try {
            int iIndexOf = str.indexOf(84);
            if (iIndexOf == -1) {
                throw new IllegalArgumentException("Invalid timestamp: ".concat(str));
            }
            int iIndexOf2 = str.indexOf(90, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(43, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(45, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                throw new IllegalArgumentException("Invalid timestamp: Missing valid timezone offset: ".concat(str));
            }
            String strSubstring = str.substring(0, iIndexOf2);
            String strSubstring2 = "";
            int iIndexOf3 = strSubstring.indexOf(46);
            if (iIndexOf3 != -1) {
                String strSubstring3 = strSubstring.substring(0, iIndexOf3);
                strSubstring2 = strSubstring.substring(iIndexOf3 + 1);
                strSubstring = strSubstring3;
            }
            long time = this.f41450a.parse(strSubstring).getTime() / 1000;
            if (strSubstring2.isEmpty()) {
                iCharAt = 0;
            } else {
                iCharAt = 0;
                for (int i5 = 0; i5 < 9; i5++) {
                    iCharAt *= 10;
                    if (i5 < strSubstring2.length()) {
                        if (strSubstring2.charAt(i5) < '0' || strSubstring2.charAt(i5) > '9') {
                            throw new IllegalArgumentException("Invalid nanoseconds: ".concat(strSubstring2));
                        }
                        iCharAt = (strSubstring2.charAt(i5) - '0') + iCharAt;
                    }
                }
            }
            if (str.charAt(iIndexOf2) != 'Z') {
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                int iIndexOf4 = strSubstring4.indexOf(58);
                if (iIndexOf4 == -1) {
                    throw new IllegalArgumentException("Invalid offset value: ".concat(strSubstring4));
                }
                long j8 = (Long.parseLong(strSubstring4.substring(iIndexOf4 + 1)) + (Long.parseLong(strSubstring4.substring(0, iIndexOf4)) * 60)) * 60;
                time = str.charAt(iIndexOf2) == '+' ? time - j8 : time + j8;
            } else if (str.length() != iIndexOf2 + 1) {
                throw new IllegalArgumentException("Invalid timestamp: Invalid trailing data \"" + str.substring(iIndexOf2) + "\"");
            }
            return new q(time, iCharAt);
        } catch (ParseException e7) {
            throw new IllegalArgumentException("Failed to parse timestamp", e7);
        }
    }

    public final C1 f(JSONObject jSONObject) throws JSONException {
        B1 b1W = C1.w();
        if (jSONObject.has("nullValue")) {
            b1W.l(NullValue.NULL_VALUE);
        } else {
            if (jSONObject.has("booleanValue")) {
                b1W.d(jSONObject.optBoolean("booleanValue", false));
            } else if (jSONObject.has("integerValue")) {
                b1W.h(jSONObject.optLong("integerValue"));
            } else if (jSONObject.has("doubleValue")) {
                b1W.f(jSONObject.optDouble("doubleValue"));
            } else if (jSONObject.has("timestampValue")) {
                q qVarE = e(jSONObject.get("timestampValue"));
                b1W.o(Timestamp.newBuilder().setSeconds(qVarE.f45352a).setNanos(qVarE.f45353b));
            } else if (jSONObject.has("stringValue")) {
                b1W.n(jSONObject.optString("stringValue", ""));
            } else if (jSONObject.has("bytesValue")) {
                b1W.e(ByteString.copyFrom(Base64.decode(jSONObject.getString("bytesValue"), 0)));
            } else if (jSONObject.has("referenceValue")) {
                b1W.m(jSONObject.getString("referenceValue"));
            } else if (jSONObject.has("geoPointValue")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("geoPointValue");
                Ia.b bVarG = Ia.c.g();
                bVarG.a(jSONObject2.optDouble("latitude"));
                bVarG.b(jSONObject2.optDouble("longitude"));
                b1W.g(bVarG);
            } else if (jSONObject.has("arrayValue")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.getJSONObject("arrayValue").optJSONArray("values");
                C3232f c3232fG = C3235g.g();
                if (jSONArrayOptJSONArray != null) {
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray.length(); i5++) {
                        c3232fG.b(f(jSONArrayOptJSONArray.getJSONObject(i5)));
                    }
                }
                b1W.b(c3232fG);
            } else {
                if (!jSONObject.has("mapValue")) {
                    throw new IllegalArgumentException("Unexpected value type: " + jSONObject);
                }
                b(b1W, jSONObject.getJSONObject("mapValue").optJSONObject("fields"));
            }
        }
        return (C1) b1W.build();
    }
}
