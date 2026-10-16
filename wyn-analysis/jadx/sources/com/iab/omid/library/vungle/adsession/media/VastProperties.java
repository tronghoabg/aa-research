package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class VastProperties {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f28096a;

    /* renamed from: b, reason: collision with root package name */
    private final Float f28097b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28098c;

    /* renamed from: d, reason: collision with root package name */
    private final Position f28099d;

    private VastProperties(boolean z2, Float f10, boolean z10, Position position) {
        this.f28096a = z2;
        this.f28097b = f10;
        this.f28098c = z10;
        this.f28099d = position;
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
            jSONObject.put("skippable", this.f28096a);
            if (this.f28096a) {
                jSONObject.put("skipOffset", this.f28097b);
            }
            jSONObject.put("autoPlay", this.f28098c);
            jSONObject.put("position", this.f28099d);
            return jSONObject;
        } catch (JSONException e7) {
            d.a("VastProperties: JSON error", e7);
            return jSONObject;
        }
    }

    public Position getPosition() {
        return this.f28099d;
    }

    public Float getSkipOffset() {
        return this.f28097b;
    }

    public boolean isAutoPlay() {
        return this.f28098c;
    }

    public boolean isSkippable() {
        return this.f28096a;
    }
}
