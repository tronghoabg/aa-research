package Cd;

import ef.C2515C;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* renamed from: Cd.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0345m {

    /* renamed from: a, reason: collision with root package name */
    public static final Nd.a f2136a;

    /* renamed from: b, reason: collision with root package name */
    public static final vg.b f2137b;

    static {
        KType kTypeB;
        KClass orCreateKotlinClass = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(C2515C.class);
        try {
            kTypeB = kotlin.jvm.internal.H.b(C2515C.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f2136a = new Nd.a("ValidateMark", new Sd.a(orCreateKotlinClass, kTypeB));
        f2137b = vg.d.c("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
