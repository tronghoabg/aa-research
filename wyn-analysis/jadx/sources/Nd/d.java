package Nd;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f8659a = new ConcurrentHashMap();

    public final Object a(a key, tf.a aVar) {
        AbstractC3340k.e(key, "key");
        ConcurrentHashMap concurrentHashMap = this.f8659a;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = aVar.invoke();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(key, objInvoke);
        if (objPutIfAbsent != null) {
            objInvoke = objPutIfAbsent;
        }
        AbstractC3340k.c(objInvoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return objInvoke;
    }

    public final Object b(a key) {
        AbstractC3340k.e(key, "key");
        Object objD = d(key);
        if (objD != null) {
            return objD;
        }
        throw new IllegalStateException("No instance for key " + key);
    }

    public final Map c() {
        return this.f8659a;
    }

    public final Object d(a key) {
        AbstractC3340k.e(key, "key");
        return c().get(key);
    }

    public final void e(a key, Object value) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(value, "value");
        c().put(key, value);
    }
}
