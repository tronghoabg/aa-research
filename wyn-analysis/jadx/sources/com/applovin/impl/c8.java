package com.applovin.impl;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class c8 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private List f21218a;

    /* renamed from: b, reason: collision with root package name */
    private List f21219b;

    /* renamed from: c, reason: collision with root package name */
    private int f21220c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f21221d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f21222e;

    /* renamed from: f, reason: collision with root package name */
    private v7 f21223f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f21224g;

    private c8() {
        List list = Collections.EMPTY_LIST;
        this.f21218a = list;
        this.f21219b = list;
        this.f21222e = new HashSet();
        this.f21224g = new HashMap();
    }

    public static c8 a(q8 q8Var, c8 c8Var, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        q8 q8VarC;
        v7 v7VarA;
        List listA;
        q8 q8VarC2;
        List listA2;
        q8 q8VarC3;
        int iA;
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (t7Var == null) {
            throw new IllegalArgumentException("No context specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        if (c8Var == null) {
            try {
                c8Var = new c8(t7Var);
            } catch (Throwable th) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("VastVideoCreative", "Error occurred while initializing", th);
                }
                kVar.D().a("VastVideoCreative", th);
                return null;
            }
        }
        if (c8Var.f21220c == 0 && (q8VarC3 = q8Var.c("Duration")) != null && (iA = a(q8VarC3.d(), kVar)) > 0) {
            c8Var.f21220c = iA;
        }
        q8 q8VarC4 = q8Var.c("MediaFiles");
        if (q8VarC4 != null && (listA2 = a(q8VarC4, kVar)) != null && listA2.size() > 0) {
            List list = c8Var.f21218a;
            if (list != null) {
                listA2.addAll(list);
            }
            c8Var.f21218a = listA2;
        }
        q8 q8VarC5 = q8Var.c("VideoClicks");
        if (q8VarC5 != null) {
            if (c8Var.f21221d == null && (q8VarC2 = q8VarC5.c("ClickThrough")) != null) {
                String strD = q8VarC2.d();
                if (StringUtils.isValidString(strD)) {
                    c8Var.f21221d = Uri.parse(strD);
                }
            }
            b8.a(q8VarC5.a("ClickTracking"), c8Var.f21222e, t7Var, kVar);
        }
        q8 q8VarC6 = q8Var.c("Icons");
        if (q8VarC6 != null && (v7VarA = v7.a((q8VarC = q8VarC6.c("Icon")), kVar)) != null) {
            q8 q8VarC7 = q8VarC.c("IconClicks");
            if (q8VarC7 != null && (listA = q8VarC7.a("IconClickTracking")) != null) {
                b8.a(listA, v7VarA.f23407a, t7Var, kVar);
            }
            List listA3 = q8VarC.a("IconViewTracking");
            if (listA3 != null) {
                b8.a(listA3, v7VarA.f23408b, t7Var, kVar);
            }
            c8Var.f21223f = v7VarA;
        }
        b8.a(q8Var, c8Var.f21224g, t7Var, kVar);
        return c8Var;
    }

    public Uri c() {
        return this.f21221d;
    }

    public int d() {
        return this.f21220c;
    }

    public Map e() {
        return this.f21224g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        if (this.f21220c != c8Var.f21220c) {
            return false;
        }
        List list = this.f21218a;
        if (list == null ? c8Var.f21218a != null : !list.equals(c8Var.f21218a)) {
            return false;
        }
        Uri uri = this.f21221d;
        if (uri == null ? c8Var.f21221d != null : !uri.equals(c8Var.f21221d)) {
            return false;
        }
        Set set = this.f21222e;
        if (set == null ? c8Var.f21222e != null : !set.equals(c8Var.f21222e)) {
            return false;
        }
        Map map = this.f21224g;
        Map map2 = c8Var.f21224g;
        return map != null ? map.equals(map2) : map2 == null;
    }

    public v7 f() {
        return this.f21223f;
    }

    public List g() {
        return this.f21218a;
    }

    public int hashCode() {
        List list = this.f21218a;
        int iHashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f21220c) * 31;
        Uri uri = this.f21221d;
        int iHashCode2 = (iHashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        Set set = this.f21222e;
        int iHashCode3 = (iHashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        Map map = this.f21224g;
        return iHashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "VastVideoCreative{videoFiles=" + this.f21218a + ", durationSeconds=" + this.f21220c + ", destinationUri=" + this.f21221d + ", clickTrackers=" + this.f21222e + ", eventTrackers=" + this.f21224g + ", industryIcon=" + this.f21223f + '}';
    }

    public Set b() {
        return this.f21222e;
    }

    private c8(t7 t7Var) {
        List list = Collections.EMPTY_LIST;
        this.f21218a = list;
        this.f21219b = list;
        this.f21222e = new HashSet();
        this.f21224g = new HashMap();
        this.f21219b = t7Var.f();
    }

    private static int a(String str, com.applovin.impl.sdk.k kVar) {
        try {
            if (CollectionUtils.explode(str, TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER).size() == 3) {
                return (int) (TimeUnit.HOURS.toSeconds(StringUtils.parseInt(r1.get(0))) + TimeUnit.MINUTES.toSeconds(StringUtils.parseInt(r1.get(1))) + StringUtils.parseInt(r1.get(2)));
            }
        } catch (Throwable unused) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().b("VastVideoCreative", "Unable to parse duration from \"" + str + "\"");
            }
        }
        return 0;
    }

    private static List a(q8 q8Var, com.applovin.impl.sdk.k kVar) {
        List listA = q8Var.a("MediaFile");
        ArrayList arrayList = new ArrayList(listA.size());
        List<String> listExplode = CollectionUtils.explode((String) kVar.a(y4.f23700T4));
        List<String> listExplode2 = CollectionUtils.explode((String) kVar.a(y4.S4));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            d8 d8VarA = d8.a((q8) it.next(), kVar);
            if (d8VarA != null) {
                try {
                    String strC = d8VarA.c();
                    if (StringUtils.isValidString(strC) && !listExplode.contains(strC)) {
                        arrayList.add(d8VarA);
                    } else {
                        if (((Boolean) kVar.a(y4.f23708U4)).booleanValue()) {
                            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(d8VarA.e().toString());
                            if (StringUtils.isValidString(fileExtensionFromUrl) && !listExplode2.contains(fileExtensionFromUrl)) {
                                arrayList.add(d8VarA);
                            }
                        }
                        kVar.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            kVar.O().k("VastVideoCreative", "Video file not supported: " + d8VarA);
                        }
                    }
                } catch (Throwable th) {
                    kVar.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        kVar.O().a("VastVideoCreative", "Failed to validate video file: " + d8VarA, th);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    public d8 a(long j8) {
        List list = this.f21218a;
        d8 d8Var = null;
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(3);
        for (String str : this.f21219b) {
            for (d8 d8Var2 : this.f21218a) {
                String strC = d8Var2.c();
                if (StringUtils.isValidString(strC) && str.equalsIgnoreCase(strC)) {
                    arrayList.add(d8Var2);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList<d8> arrayList2 = arrayList;
        if (zIsEmpty) {
            arrayList2 = this.f21218a;
        }
        Collections.sort(arrayList2, new A0.f(11));
        for (d8 d8Var3 : arrayList2) {
            if (d8Var3.b() > j8) {
                break;
            }
            d8Var = d8Var3;
        }
        return d8Var != null ? d8Var : (d8) arrayList2.get(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(d8 d8Var, d8 d8Var2) {
        return Long.compare(d8Var.b(), d8Var2.b());
    }

    public static c8 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        c8 c8Var = new c8();
        JSONArray jSONArrayM = AbstractC1593a.m("video_files", jSONObject);
        c8Var.f21218a = new ArrayList();
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            d8 d8VarA = d8.a(JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null), kVar);
            if (d8VarA != null) {
                c8Var.f21218a.add(d8VarA);
            }
        }
        c8Var.f21219b = JsonUtils.getStringList(jSONObject, "preferred_video_file_types", Collections.EMPTY_LIST);
        c8Var.f21220c = JsonUtils.getInt(jSONObject, "duration_seconds", 0);
        String string = JsonUtils.getString(jSONObject, "destination_uri", null);
        c8Var.f21221d = StringUtils.isValidString(string) ? Uri.parse(string) : null;
        JSONArray jSONArrayM2 = AbstractC1593a.m("click_trackers", jSONObject);
        for (int i10 = 0; i10 < jSONArrayM2.length(); i10++) {
            z7 z7VarA = z7.a(JsonUtils.getJSONObject(jSONArrayM2, i10, (JSONObject) null), kVar);
            if (z7VarA != null) {
                c8Var.f21222e.add(z7VarA);
            }
        }
        c8Var.f21223f = v7.a(JsonUtils.getJSONObject(jSONObject, "industry_icon", (JSONObject) null), kVar);
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "event_trackers", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            HashSet hashSet = new HashSet();
            String next = itKeys.next();
            JSONArray jSONArrayM3 = AbstractC1593a.m(next, jSONObject2);
            for (int i11 = 0; i11 < jSONArrayM3.length(); i11++) {
                z7 z7VarA2 = z7.a(JsonUtils.getJSONObject(jSONArrayM3, i11, (JSONObject) null), kVar);
                if (z7VarA2 != null) {
                    hashSet.add(z7VarA2);
                }
            }
            c8Var.f21224g.put(next, hashSet);
        }
        return c8Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        List list = this.f21218a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((d8) it.next()).a());
            }
        }
        JsonUtils.putJsonArray(jSONObject, "video_files", jSONArray);
        JsonUtils.putJsonArray(jSONObject, "preferred_video_file_types", new JSONArray((Collection) this.f21219b));
        JsonUtils.putInt(jSONObject, "duration_seconds", this.f21220c);
        Uri uri = this.f21221d;
        JsonUtils.putString(jSONObject, "destination_uri", uri == null ? null : uri.toString());
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f21222e.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(((z7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray2);
        v7 v7Var = this.f21223f;
        if (v7Var != null) {
            JsonUtils.putJSONObject(jSONObject, "industry_icon", v7Var.a());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.f21224g.keySet()) {
            Set set = (Set) this.f21224g.get(str);
            if (set != null) {
                JSONArray jSONArray3 = new JSONArray();
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    jSONArray3.put(((z7) it3.next()).a());
                }
                JsonUtils.putJsonArray(jSONObject2, str, jSONArray3);
            }
        }
        JsonUtils.putJSONObject(jSONObject, "event_trackers", jSONObject2);
        return jSONObject;
    }
}
