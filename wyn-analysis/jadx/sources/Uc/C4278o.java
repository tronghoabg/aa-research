package uc;

import java.util.Map;
import org.json.JSONObject;

/* renamed from: uc.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4278o {

    /* renamed from: a, reason: collision with root package name */
    public final String f46759a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f46760b;

    public C4278o(String str, Object obj) {
        this.f46759a = str;
        this.f46760b = obj;
    }

    public final Object a(String str) {
        Object obj = this.f46760b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }
}
