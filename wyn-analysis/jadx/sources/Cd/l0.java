package Cd;

import java.util.ArrayList;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0334b f2133b = new C0334b(8);

    /* renamed from: c, reason: collision with root package name */
    public static final Nd.a f2134c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2135a = new ArrayList();

    static {
        KType kTypeB;
        KClass orCreateKotlinClass = kotlin.jvm.internal.H.f39741a.getOrCreateKotlinClass(l0.class);
        try {
            kTypeB = kotlin.jvm.internal.H.b(l0.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f2134c = new Nd.a("HttpSend", new Sd.a(orCreateKotlinClass, kTypeB));
    }
}
