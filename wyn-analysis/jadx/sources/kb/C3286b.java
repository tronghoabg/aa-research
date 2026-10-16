package kb;

import a.AbstractC1304a;
import java.util.Map;
import org.json.JSONObject;
import uc.C4278o;
import uc.InterfaceC4280q;

/* renamed from: kb.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3286b extends AbstractC1304a {

    /* renamed from: b, reason: collision with root package name */
    public final com.dexterous.flutterlocalnotifications.b f39446b;

    /* renamed from: c, reason: collision with root package name */
    public final C4278o f39447c;

    public C3286b(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        super(19);
        this.f39447c = c4278o;
        this.f39446b = new com.dexterous.flutterlocalnotifications.b(interfaceC4280q);
    }

    @Override // a.AbstractC1304a
    public final Object q(String str) {
        return this.f39447c.a(str);
    }

    @Override // a.AbstractC1304a
    public final String s() {
        return this.f39447c.f46759a;
    }

    @Override // a.AbstractC1304a
    public final InterfaceC3287c u() {
        return this.f39446b;
    }

    @Override // a.AbstractC1304a
    public final boolean z() {
        Object obj = this.f39447c.f46760b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey("transactionId");
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has("transactionId");
        }
        throw new ClassCastException();
    }
}
