package uc;

import java.nio.ByteBuffer;
import ka.AbstractC3230e0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: uc.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4276m implements InterfaceC4282s {

    /* renamed from: a, reason: collision with root package name */
    public static final C4276m f46758a = new C4276m();

    @Override // uc.InterfaceC4282s
    public C4278o a(ByteBuffer byteBuffer) throws JSONException {
        Object objNextValue;
        Object obj = null;
        try {
            if (byteBuffer == null) {
                objNextValue = null;
            } else {
                try {
                    C4288y.f46771b.getClass();
                    JSONTokener jSONTokener = new JSONTokener(C4288y.c(byteBuffer));
                    objNextValue = jSONTokener.nextValue();
                    if (jSONTokener.more()) {
                        throw new IllegalArgumentException("Invalid JSON");
                    }
                } catch (JSONException e7) {
                    throw new IllegalArgumentException("Invalid JSON", e7);
                }
            }
            if (objNextValue instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) objNextValue;
                Object obj2 = jSONObject.get("method");
                Object objOpt = jSONObject.opt("args");
                if (objOpt != JSONObject.NULL) {
                    obj = objOpt;
                }
                if (obj2 instanceof String) {
                    return new C4278o((String) obj2, obj);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + objNextValue);
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // uc.InterfaceC4282s
    public ByteBuffer b(Object obj) throws JSONException {
        JSONArray jSONArrayPut = new JSONArray().put(AbstractC3230e0.A(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objA = AbstractC3230e0.A(jSONArrayPut);
        if (objA instanceof String) {
            C4288y c4288y = C4288y.f46771b;
            String strQuote = JSONObject.quote((String) objA);
            c4288y.getClass();
            return C4288y.d(strQuote);
        }
        C4288y c4288y2 = C4288y.f46771b;
        String string = objA.toString();
        c4288y2.getClass();
        return C4288y.d(string);
    }

    @Override // uc.InterfaceC4282s
    public Object c(ByteBuffer byteBuffer) throws JSONException {
        try {
            try {
                C4288y.f46771b.getClass();
                JSONTokener jSONTokener = new JSONTokener(C4288y.c(byteBuffer));
                Object objNextValue = jSONTokener.nextValue();
                if (jSONTokener.more()) {
                    throw new IllegalArgumentException("Invalid JSON");
                }
                if (objNextValue instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) objNextValue;
                    Object obj = null;
                    if (jSONArray.length() == 1) {
                        Object objOpt = jSONArray.opt(0);
                        if (objOpt == JSONObject.NULL) {
                            return null;
                        }
                        return objOpt;
                    }
                    if (jSONArray.length() == 3) {
                        Object obj2 = jSONArray.get(0);
                        Object objOpt2 = jSONArray.opt(1);
                        Object obj3 = JSONObject.NULL;
                        if (objOpt2 == obj3) {
                            objOpt2 = null;
                        }
                        Object objOpt3 = jSONArray.opt(2);
                        if (objOpt3 != obj3) {
                            obj = objOpt3;
                        }
                        if ((obj2 instanceof String) && (objOpt2 == null || (objOpt2 instanceof String))) {
                            throw new C4274k((String) obj2, (String) objOpt2, obj);
                        }
                    }
                }
                throw new IllegalArgumentException("Invalid envelope: " + objNextValue);
            } catch (JSONException e7) {
                throw new IllegalArgumentException("Invalid JSON", e7);
            }
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Invalid JSON", e10);
        }
    }

    @Override // uc.InterfaceC4282s
    public ByteBuffer d(C4278o c4278o) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", c4278o.f46759a);
            jSONObject.put("args", AbstractC3230e0.A(c4278o.f46760b));
            Object objA = AbstractC3230e0.A(jSONObject);
            if (objA instanceof String) {
                C4288y c4288y = C4288y.f46771b;
                String strQuote = JSONObject.quote((String) objA);
                c4288y.getClass();
                return C4288y.d(strQuote);
            }
            C4288y c4288y2 = C4288y.f46771b;
            String string = objA.toString();
            c4288y2.getClass();
            return C4288y.d(string);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // uc.InterfaceC4282s
    public ByteBuffer e(String str, String str2) throws JSONException {
        JSONArray jSONArrayPut = new JSONArray().put("error").put(AbstractC3230e0.A(str)).put(JSONObject.NULL).put(AbstractC3230e0.A(str2));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objA = AbstractC3230e0.A(jSONArrayPut);
        if (objA instanceof String) {
            C4288y c4288y = C4288y.f46771b;
            String strQuote = JSONObject.quote((String) objA);
            c4288y.getClass();
            return C4288y.d(strQuote);
        }
        C4288y c4288y2 = C4288y.f46771b;
        String string = objA.toString();
        c4288y2.getClass();
        return C4288y.d(string);
    }

    @Override // uc.InterfaceC4282s
    public ByteBuffer f(String str, String str2, Object obj) throws JSONException {
        JSONArray jSONArrayPut = new JSONArray().put(str).put(AbstractC3230e0.A(str2)).put(AbstractC3230e0.A(obj));
        if (jSONArrayPut == null) {
            return null;
        }
        Object objA = AbstractC3230e0.A(jSONArrayPut);
        if (objA instanceof String) {
            C4288y c4288y = C4288y.f46771b;
            String strQuote = JSONObject.quote((String) objA);
            c4288y.getClass();
            return C4288y.d(strQuote);
        }
        C4288y c4288y2 = C4288y.f46771b;
        String string = objA.toString();
        c4288y2.getClass();
        return C4288y.d(string);
    }
}
