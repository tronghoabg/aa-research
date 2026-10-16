package Fd;

import kotlin.jvm.internal.H;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Nd.a f4077a;

    static {
        KType kTypeB;
        KClass orCreateKotlinClass = H.f39741a.getOrCreateKotlinClass(Sd.a.class);
        try {
            kTypeB = H.b(Sd.a.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f4077a = new Nd.a("BodyTypeAttributeKey", new Sd.a(orCreateKotlinClass, kTypeB));
    }
}
