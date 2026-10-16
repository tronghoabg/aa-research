package androidx.credentials.provider.utils;

import h.g.b.o;
import h.g.b.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class RequestValidationUtil {
    public static final Companion Companion = new Companion(null);

    public static final boolean isValidJSON(String str) {
        return Companion.isValidJSON(str);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final boolean isValidJSON(String str) throws JSONException {
            x.f(str, "jsonString");
            if (str.length() == 0) {
                return false;
            }
            try {
                Object objNextValue = new JSONTokener(str).nextValue();
                if (objNextValue instanceof JSONObject) {
                    return true;
                }
                return objNextValue instanceof JSONArray;
            } catch (Exception unused) {
                return false;
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
