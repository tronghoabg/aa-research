package Cd;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* loaded from: classes5.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final Nd.a f2003a;

    static {
        KType kTypeB;
        KClass orCreateKotlinClass = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(Nd.d.class);
        try {
            kTypeB = kotlin.jvm.internal.H.b(Nd.d.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f2003a = new Nd.a("ApplicationPluginRegistry", new Sd.a(orCreateKotlinClass, kTypeB));
    }
}
