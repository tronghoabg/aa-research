package zd;

import Ef.D;
import kotlin.jvm.internal.H;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import wd.C4403d;

/* loaded from: classes5.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final D f48488a = new D("call-context");

    /* renamed from: b, reason: collision with root package name */
    public static final Nd.a f48489b;

    static {
        KType kTypeC;
        KClass orCreateKotlinClass = H.f39741a.getOrCreateKotlinClass(C4403d.class);
        try {
            kTypeC = H.c(C4403d.class, KTypeProjection.INSTANCE.getSTAR());
        } catch (Throwable unused) {
            kTypeC = null;
        }
        f48489b = new Nd.a("client-config", new Sd.a(orCreateKotlinClass, kTypeC));
    }
}
