package uc;

import java.nio.ByteBuffer;
import ka.AbstractC3230e0;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: uc.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4275l implements InterfaceC4277n {

    /* renamed from: a, reason: collision with root package name */
    public static final C4275l f46757a = new C4275l();

    @Override // uc.InterfaceC4277n
    public final ByteBuffer a(Object obj) throws JSONException {
        if (obj == null) {
            return null;
        }
        Object objA = AbstractC3230e0.A(obj);
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

    @Override // uc.InterfaceC4277n
    public final Object b(ByteBuffer byteBuffer) throws JSONException {
        if (byteBuffer == null) {
            return null;
        }
        try {
            C4288y.f46771b.getClass();
            JSONTokener jSONTokener = new JSONTokener(C4288y.c(byteBuffer));
            Object objNextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return objNextValue;
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }
}
