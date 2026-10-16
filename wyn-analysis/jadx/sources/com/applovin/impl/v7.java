package com.applovin.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import android.widget.ImageView;
import cb.AbstractC1593a;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class v7 implements q4 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f23407a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set f23408b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private Uri f23409c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f23410d;

    /* renamed from: e, reason: collision with root package name */
    private int f23411e;

    /* renamed from: f, reason: collision with root package name */
    private int f23412f;

    public static v7 a(q8 q8Var, com.applovin.impl.sdk.k kVar) throws NumberFormatException {
        if (q8Var == null) {
            throw new IllegalArgumentException("No node specified.");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        q8 q8VarC = q8Var.c("StaticResource");
        if (q8VarC == null || !URLUtil.isValidUrl(q8VarC.d())) {
            kVar.O();
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            kVar.O().b("VastIndustryIcon", "Unable to create industry icon.  No valid image URL found.");
            return null;
        }
        v7 v7Var = new v7();
        v7Var.f23409c = Uri.parse(q8VarC.d());
        q8 q8VarB = q8Var.b("IconClickThrough");
        if (q8VarB != null && URLUtil.isValidUrl(q8VarB.d())) {
            v7Var.f23410d = Uri.parse(q8VarB.d());
        }
        String str = (String) q8Var.a().get("width");
        int i5 = 0;
        int i10 = (str == null || Integer.parseInt(str) <= 0) ? 0 : Integer.parseInt(str);
        String str2 = (String) q8Var.a().get("height");
        if (str2 != null && Integer.parseInt(str2) > 0) {
            i5 = Integer.parseInt(str2);
        }
        int iIntValue = ((Integer) kVar.a(y4.f23732X4)).intValue();
        if (i10 <= 0 || i5 <= 0) {
            v7Var.f23412f = iIntValue;
            v7Var.f23411e = iIntValue;
            return v7Var;
        }
        double d3 = i10 / i5;
        int iMin = Math.min(Math.max(i10, i5), iIntValue);
        if (i10 >= i5) {
            v7Var.f23411e = iMin;
            v7Var.f23412f = (int) (iMin / d3);
            return v7Var;
        }
        v7Var.f23412f = iMin;
        v7Var.f23411e = (int) (iMin * d3);
        return v7Var;
    }

    public Set b() {
        return this.f23407a;
    }

    public Uri c() {
        return this.f23410d;
    }

    public int d() {
        return this.f23412f;
    }

    public Uri e() {
        return this.f23409c;
    }

    public Set f() {
        return this.f23408b;
    }

    public int g() {
        return this.f23411e;
    }

    public String toString() {
        return "VastIndustryIcon{imageUri='" + e() + "', clickUri='" + c() + "', width=" + g() + ", height=" + d() + "}";
    }

    public static ImageView a(Uri uri, Context context, com.applovin.impl.sdk.k kVar) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setClickable(true);
        imageView.setVisibility(8);
        ImageViewUtils.setImageUri(imageView, uri, kVar);
        return imageView;
    }

    public static v7 a(JSONObject jSONObject, com.applovin.impl.sdk.k kVar) {
        z7 z7VarA;
        z7 z7VarA2;
        if (jSONObject == null) {
            return null;
        }
        v7 v7Var = new v7();
        String string = JsonUtils.getString(jSONObject, "image_uri", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        v7Var.f23409c = Uri.parse(string);
        JSONArray jSONArrayM = AbstractC1593a.m("click_trackers", jSONObject);
        for (int i5 = 0; i5 < jSONArrayM.length(); i5++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayM, i5, (JSONObject) null);
            if (jSONObject2 != null && (z7VarA2 = z7.a(jSONObject2, kVar)) != null) {
                v7Var.f23407a.add(z7VarA2);
            }
        }
        JSONArray jSONArrayM2 = AbstractC1593a.m("view_trackers", jSONObject);
        for (int i10 = 0; i10 < jSONArrayM2.length(); i10++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayM2, i10, (JSONObject) null);
            if (jSONObject3 != null && (z7VarA = z7.a(jSONObject3, kVar)) != null) {
                v7Var.f23408b.add(z7VarA);
            }
        }
        String string2 = JsonUtils.getString(jSONObject, "click_uri", null);
        v7Var.f23410d = StringUtils.isValidString(string2) ? Uri.parse(string2) : null;
        v7Var.f23411e = JsonUtils.getInt(jSONObject, "width", 0);
        v7Var.f23412f = JsonUtils.getInt(jSONObject, "height", 0);
        return v7Var;
    }

    @Override // com.applovin.impl.q4
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f23407a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((z7) it.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "click_trackers", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = this.f23408b.iterator();
        while (it2.hasNext()) {
            jSONArray.put(((z7) it2.next()).a());
        }
        JsonUtils.putJsonArray(jSONObject, "view_trackers", jSONArray2);
        Uri uri = this.f23409c;
        JsonUtils.putString(jSONObject, "image_uri", uri == null ? null : uri.toString());
        Uri uri2 = this.f23410d;
        JsonUtils.putString(jSONObject, "click_uri", uri2 != null ? uri2.toString() : null);
        JsonUtils.putInt(jSONObject, "width", this.f23411e);
        JsonUtils.putInt(jSONObject, "height", this.f23412f);
        return jSONObject;
    }
}
