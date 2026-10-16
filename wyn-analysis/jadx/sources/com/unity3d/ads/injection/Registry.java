package com.unity3d.ads.injection;

import Hf.InterfaceC0592c0;
import Hf.k0;
import Hf.x0;
import ef.C2527k;
import ef.InterfaceC2525i;
import ff.AbstractC2640A;
import ff.AbstractC2641B;
import ff.w;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.jetbrains.annotations.NotNull;
import tf.a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\n\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\f\u001a\u00020\t\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\b\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000bJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u00042\u0006\u0010\r\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0012\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0004\u0018\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0086\b¢\u0006\u0004\b\u0014\u0010\u0013R*\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R!\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00168F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"Lcom/unity3d/ads/injection/Registry;", "", "<init>", "()V", "T", "", "named", "Lkotlin/Function0;", "instance", "Lcom/unity3d/ads/injection/EntryKey;", "single", "(Ljava/lang/String;Ltf/a;)Lcom/unity3d/ads/injection/EntryKey;", "factory", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "Lef/i;", "Lef/C;", "add", "(Lcom/unity3d/ads/injection/EntryKey;Lef/i;)V", "get", "(Ljava/lang/String;)Ljava/lang/Object;", "getOrNull", "LHf/c0;", "", "_services", "LHf/c0;", "getServices", "()Ljava/util/Map;", "services", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Registry {

    @NotNull
    private final InterfaceC0592c0 _services = k0.c(w.f35433a);

    public static EntryKey factory$default(Registry registry, String named, a instance, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(instance, "instance");
        AbstractC3340k.l();
        throw null;
    }

    public static Object get$default(Registry registry, String named, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        AbstractC3340k.e(named, "named");
        AbstractC3340k.l();
        throw null;
    }

    public static Object getOrNull$default(Registry registry, String named, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        AbstractC3340k.e(named, "named");
        AbstractC3340k.l();
        throw null;
    }

    public static EntryKey single$default(Registry registry, String named, a instance, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            named = "";
        }
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(instance, "instance");
        AbstractC3340k.l();
        throw null;
    }

    public final <T> void add(@NotNull EntryKey key, @NotNull InterfaceC2525i instance) {
        x0 x0Var;
        Object value;
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(instance, "instance");
        if (getServices().containsKey(key)) {
            throw new IllegalStateException("Cannot have identical entries.");
        }
        InterfaceC0592c0 interfaceC0592c0 = this._services;
        do {
            x0Var = (x0) interfaceC0592c0;
            value = x0Var.getValue();
        } while (!x0Var.i(value, AbstractC2640A.T((Map) value, AbstractC2641B.E(new C2527k(key, instance)))));
    }

    public final <T> EntryKey factory(String named, a instance) {
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

    @NotNull
    public final Map<EntryKey, InterfaceC2525i> getServices() {
        return (Map) ((x0) this._services).getValue();
    }

    public final <T> EntryKey single(String named, a instance) {
        AbstractC3340k.e(named, "named");
        AbstractC3340k.e(instance, "instance");
        AbstractC3340k.l();
        throw null;
    }
}
