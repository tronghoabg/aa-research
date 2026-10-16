package od;

import java.util.Map;
import md.AbstractC3556y;

/* renamed from: od.m1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3706m1 extends md.P {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f42015a;

    static {
        f42015a = !Fe.c.D(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST")) && Boolean.parseBoolean(System.getenv("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST"));
    }

    @Override // md.P
    public final String a() {
        return "pick_first";
    }

    @Override // md.P
    public final md.O b(AbstractC3556y abstractC3556y) {
        return f42015a ? new C3691h1(abstractC3556y) : new C3703l1(abstractC3556y);
    }

    @Override // md.P
    public final md.d0 c(Map map) {
        try {
            return new md.d0(new C3697j1(AbstractC3719r0.b("shuffleAddressList", map)));
        } catch (RuntimeException e7) {
            return new md.d0(md.k0.f40682n.g(e7).h("Failed parsing configuration for pick_first"));
        }
    }
}
