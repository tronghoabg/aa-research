package Dd;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import wd.C4402c;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C4402c f2636a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2637b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2638c;

    /* renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.service_locator.h f2639d;

    public b(Nd.a key, C4402c client, Object pluginConfig) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(client, "client");
        AbstractC3340k.e(pluginConfig, "pluginConfig");
        this.f2636a = client;
        this.f2637b = pluginConfig;
        this.f2638c = new ArrayList();
        this.f2639d = new com.moloco.sdk.service_locator.h(14);
    }

    public final void a(a aVar, AbstractC3471j abstractC3471j) {
        this.f2638c.add(new e(aVar, abstractC3471j));
    }
}
