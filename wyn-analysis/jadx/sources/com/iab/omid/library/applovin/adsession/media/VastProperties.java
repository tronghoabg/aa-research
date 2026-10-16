package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27836a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f27837b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27838c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f27839d;

    private VastProperties(boolean z2, Float f10, boolean z10, Position position) {
        this.f27836a = z2;
        this.f27837b = f10;
        this.f27838c = z10;
        this.f27839d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z2, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z2, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z2, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z2, position);
    }

    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f27836a);
            if (this.f27836a) {
                jSONObject.put("skipOffset", this.f27837b);
            }
            jSONObject.put("autoPlay", this.f27838c);
            jSONObject.put("position", this.f27839d);
            return jSONObject;
        } catch (JSONException e7) {
            d.a("VastProperties: JSON error", e7);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f27839d;
    }

    public Float getSkipOffset() {
        return this.f27837b;
    }

    public boolean isAutoPlay() {
        return this.f27838c;
    }

    public boolean isSkippable() {
        return this.f27836a;
    }
}
