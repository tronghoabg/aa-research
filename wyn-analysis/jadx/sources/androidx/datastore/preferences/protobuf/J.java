package androidx.datastore.preferences.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: b, reason: collision with root package name */
    public static final C1401s f18143b = new C1401s(1);

    /* renamed from: a, reason: collision with root package name */
    public final Object f18144a;

    public J(C1393j c1393j) {
        AbstractC1407y.a(c1393j, "output");
        this.f18144a = c1393j;
        c1393j.f18229c = this;
    }

    public void a(int i5, C1390g c1390g) {
        ((C1393j) this.f18144a).G(i5, c1390g);
    }

    public void b(int i5, Object obj, InterfaceC1385b0 interfaceC1385b0) {
        C1393j c1393j = (C1393j) this.f18144a;
        c1393j.R(i5, 3);
        interfaceC1385b0.c((AbstractC1382a) obj, c1393j.f18229c);
        c1393j.R(i5, 4);
    }

    public J() {
        P p10;
        try {
            p10 = (P) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            p10 = f18143b;
        }
        P[] pArr = {C1401s.f18259b, p10};
        I i5 = new I();
        i5.f18142a = pArr;
        Charset charset = AbstractC1407y.f18274a;
        this.f18144a = i5;
    }
}
