package com.unity3d.services.core.di;

import ef.InterfaceC2525i;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0013J\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"Lcom/unity3d/services/core/di/ServicesRegistry;", "Lcom/unity3d/services/core/di/IServicesRegistry;", "<init>", "()V", "T", "", "named", "Lkotlin/Function0;", "instance", "Lcom/unity3d/services/core/di/ServiceKey;", "single", "(Ljava/lang/String;Ltf/a;)Lcom/unity3d/services/core/di/ServiceKey;", "factory", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "Lef/i;", "Lef/C;", "updateService", "(Lcom/unity3d/services/core/di/ServiceKey;Lef/i;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "getService", "(Ljava/lang/String;Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getOrNull", "resolveService", "(Lcom/unity3d/services/core/di/ServiceKey;)Ljava/lang/Object;", "resolveServiceOrNull", "j$/util/concurrent/ConcurrentHashMap", "_services", "Lj$/util/concurrent/ConcurrentHashMap;", "", "getServices", "()Ljava/util/Map;", "services", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ServicesRegistry implements IServicesRegistry {

    @NotNull
    private final ConcurrentHashMap<ServiceKey, InterfaceC2525i> _services = new ConcurrentHashMap<>();

    public static ServiceKey factory$default(ServicesRegistry servicesRegistry, String named, a instance, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(instance, "instance");
        AbstractC3340k.l();
        throw null;
    }

    public static Object get$default(ServicesRegistry servicesRegistry, String named, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        AbstractC3340k.e(named, "named");
        AbstractC3340k.l();
        throw null;
    }

    public static Object getOrNull$default(ServicesRegistry servicesRegistry, String named, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        AbstractC3340k.e(named, "named");
        AbstractC3340k.l();
        throw null;
    }

    public static ServiceKey single$default(ServicesRegistry servicesRegistry, String named, a instance, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(instance, "instance");
        AbstractC3340k.l();
        throw null;
    }

    public final <T> ServiceKey factory(String named, a instance) {
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(instance, "instance");
        AbstractC3340k.l();
        throw null;
    }

    public final <T> T get(String named) {
        AbstractC3340k.e(named, "named");
        AbstractC3340k.l();
        throw null;
    }

    public final <T> T getOrNull(String named) {
        AbstractC3340k.e(named, "named");
        AbstractC3340k.l();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T getService(@NotNull String named, @NotNull KClass<?> instance) {
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(instance, "instance");
        return (T) resolveService(new ServiceKey(named, instance));
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @NotNull
    public Map<ServiceKey, InterfaceC2525i> getServices() {
        return this._services;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> T resolveService(@NotNull ServiceKey key) {
        AbstractC3340k.e(key, "key");
        InterfaceC2525i interfaceC2525i = getServices().get(key);
        if (interfaceC2525i != null) {
            return (T) interfaceC2525i.getValue();
        }
        throw new IllegalStateException("No service instance found for " + key);
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    @Nullable
    public <T> T resolveServiceOrNull(@NotNull ServiceKey key) {
        AbstractC3340k.e(key, "key");
        InterfaceC2525i interfaceC2525i = getServices().get(key);
        if (interfaceC2525i == null) {
            return null;
        }
        return (T) interfaceC2525i.getValue();
    }

    public final <T> ServiceKey single(String named, a instance) {
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(instance, "instance");
        AbstractC3340k.l();
        throw null;
    }

    @Override // com.unity3d.services.core.di.IServicesRegistry
    public <T> void updateService(@NotNull ServiceKey key, @NotNull InterfaceC2525i instance) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(instance, "instance");
        if (!getServices().containsKey(key)) {
            this._services.put(key, instance);
        } else {
            throw new IllegalStateException(("Cannot have multiple identical services: " + key).toString());
        }
    }
}
