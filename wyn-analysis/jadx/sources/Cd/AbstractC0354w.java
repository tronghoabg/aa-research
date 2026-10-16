package Cd;

import ef.C2515C;
import ef.C2532p;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* renamed from: Cd.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0354w {

    /* renamed from: a, reason: collision with root package name */
    public static final Nd.a f2181a;

    /* renamed from: b, reason: collision with root package name */
    public static final Nd.a f2182b;

    /* renamed from: c, reason: collision with root package name */
    public static final C2532p f2183c;

    /* renamed from: d, reason: collision with root package name */
    public static final Dd.c f2184d;

    static {
        KType kTypeB;
        KClass orCreateKotlinClass = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(C2515C.class);
        KType kTypeB2 = null;
        try {
            kTypeB = kotlin.jvm.internal.H.b(C2515C.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f2181a = new Nd.a("SkipSaveBody", new Sd.a(orCreateKotlinClass, kTypeB));
        KClass orCreateKotlinClass2 = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(C2515C.class);
        try {
            kTypeB2 = kotlin.jvm.internal.H.b(C2515C.class);
        } catch (Throwable unused2) {
        }
        f2182b = new Nd.a("ResponseBodySaved", new Sd.a(orCreateKotlinClass2, kTypeB2));
        f2183c = Fe.c.z(new C0352u(0));
        f2184d = U8.v0.s("SaveBody", new com.moloco.sdk.service_locator.h(14), new Ad.g(7));
        U8.v0.s("DoubleReceivePlugin", C0353v.f2180a, new Ad.g(8));
    }

    public static final vg.b a() {
        return (vg.b) f2183c.getValue();
    }
}
