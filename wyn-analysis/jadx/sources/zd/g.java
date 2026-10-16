package zd;

import Cd.m0;
import java.util.Map;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.I;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final Nd.a f48487a;

    static {
        KType kTypeMutableCollectionType;
        I i5 = H.f39741a;
        KClass orCreateKotlinClass = i5.getOrCreateKotlinClass(Map.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            kTypeMutableCollectionType = i5.mutableCollectionType(H.e(companion.invariant(H.c(f.class, companion.getSTAR())), companion.invariant(H.b(Object.class))));
        } catch (Throwable unused) {
            kTypeMutableCollectionType = null;
        }
        f48487a = new Nd.a("EngineCapabilities", new Sd.a(orCreateKotlinClass, kTypeMutableCollectionType));
        tg.b.P(m0.f2138a);
    }
}
