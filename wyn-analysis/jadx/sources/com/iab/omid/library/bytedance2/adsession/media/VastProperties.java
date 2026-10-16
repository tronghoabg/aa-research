package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f27969a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f27970b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27971c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f27972d;

    private VastProperties(boolean z2, Float f10, boolean z10, Position position) {
        this.f27969a = z2;
        this.f27970b = f10;
        this.f27971c = z10;
        this.f27972d = position;
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
            jSONObject.put("skippable", this.f27969a);
            if (this.f27969a) {
                jSONObject.put("skipOffset", this.f27970b);
            }
            jSONObject.put("autoPlay", this.f27971c);
            jSONObject.put("position", this.f27972d);
            return jSONObject;
        } catch (JSONException e7) {
            d.a("VastProperties: JSON error", e7);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f27972d;
    }

    public Float getSkipOffset() {
        return this.f27970b;
    }

    public boolean isAutoPlay() {
        return this.f27971c;
    }

    public boolean isSkippable() {
        return this.f27969a;
    }
}
