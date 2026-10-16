package com.applovin.impl;

import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class q7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f22623a;

    /* renamed from: b, reason: collision with root package name */
    private final List f22624b;

    /* renamed from: c, reason: collision with root package name */
    private final String f22625c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f22626d;

    private q7(String str, List list, String str2, Set set) {
        this.f22623a = str;
        this.f22624b = list;
        this.f22625c = str2;
        this.f22626d = set;
    }

    public static q7 a(q8 q8Var, t7 t7Var, com.applovin.impl.sdk.k kVar) {
        try {
            String str = (String) q8Var.a().get("vendor");
            q8 q8VarB = q8Var.b("VerificationParameters");
            String strD = q8VarB != null ? q8VarB.d() : null;
            List listA = q8Var.a("JavaScriptResource");
            ArrayList arrayList = new ArrayList(listA.size());
            Iterator it = listA.iterator();
            while (it.hasNext()) {
                w7 w7VarA = w7.a((q8) it.next(), kVar);
                if (w7VarA != null) {
                    arrayList.add(w7VarA);
                }
            }
            HashMap map = new HashMap();
            b8.a(q8Var, map, t7Var, kVar);
            return new q7(str, arrayList, strD, (Set) map.get("verificationNotExecuted"));
        } catch (Throwable th) {
            kVar.O();
            if (com.applovin.impl.sdk.o.a()) {
                kVar.O().a("VastAdVerification", "Error occurred while initializing", th);
            }
            kVar.D().a("VastAdVerification", th);
            return null;
        }
    }

    public Set b() {
        return this.f22626d;
    }

    public List c() {
        return this.f22624b;
    }

    public String d() {
        return this.f22623a;
    }

    public String e() {
        return this.f22625c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            q7 q7Var = (q7) obj;
            String str = this.f22623a;
            if (str == null ? q7Var.f22623a != null : !str.equals(q7Var.f22623a)) {
                return false;
            }
            List list = this.f22624b;
            if (list == null ? q7Var.f22624b != null : !list.equals(q7Var.f22624b)) {
                return false;
            }
            String str2 = this.f22625c;
            if (str2 == null ? q7Var.f22625c != null : !str2.equals(q7Var.f22625c)) {
                return false;
            }
            Set set = this.f22626d;
            Set set2 = q7Var.f22626d;
            if (set != null) {
                return set.equals(set2);
            }
            if (set2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f22623a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        List list = this.f22624b;
        int iHashCode2 = (iHashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.f22625c;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Set set = this.f22626d;
        return iHashCode3 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "VastAdVerification{vendorId='" + this.f22623a + "'javascriptResources='" + this.f22624b + "'verificationParameters='" + this.f22625c + "'errorEventTrackers='" + this.f22626d + "'}";
    }

    public static q7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        if (jSONObject == null) {
            return null;
        }
        String string = JsonUtils.getString(jSONObject, "vendor_id", null);
        JSONArray jSONArrayM = AbstractC1593a.m("javascript_resources", jSONObject);
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            w7 w7VarA = w7.a(JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null), kVar);
            if (w7VarA != null) {
                arrayList.add(w7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "verification_parameters", null);
        JSONArray jSONArrayM2 = AbstractC1593a.m("error_event_trackers", jSONObject);
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArrayM2.length(); i10++) {
            z7 z7VarA = z7.a(JsonUtils.getJSONObject(jSONArrayM2, i10, (JSONObject) null), kVar);
            if (z7VarA != null) {
                hashSet.add(z7VarA);
            }
        }
        return new q7(string, arrayList, string2, hashSet);
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "vendor_id", this.f22623a);
        if (this.f22624b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f22624b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((w7) it.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "javascript_resources", jSONArray);
        }
        JsonUtils.putString(jSONObject, "verification_parameters", this.f22625c);
        if (this.f22626d != null) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.f22626d.iterator();
            while (it2.hasNext()) {
                jSONArray2.put(((z7) it2.next()).a());
            }
            JsonUtils.putJsonArray(jSONObject, "error_event_trackers", jSONArray2);
        }
        return jSONObject;
    }
}
