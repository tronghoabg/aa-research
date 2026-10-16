package com.bytedance.sdk.component.uef;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class xs {
    private zjm uef;

    private xs(zjm zjmVar) {
        this.uef = zjmVar;
    }

    public static xs uef(zjm zjmVar) {
        return new xs(zjmVar);
    }

    public <T> T uef(String str, Type type) throws JSONException {
        uef(str);
        return (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) ? (T) new JSONObject(str) : (T) this.uef.uef(str, type);
    }

    public <T> String uef(T t10) {
        String string;
        if (t10 == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t10 instanceof JSONObject) && !(t10 instanceof JSONArray)) {
            string = this.uef.uef(t10);
        } else {
            string = t10.toString();
        }
        uef(string);
        return string;
    }

    private static void uef(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        bcc.uef(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
