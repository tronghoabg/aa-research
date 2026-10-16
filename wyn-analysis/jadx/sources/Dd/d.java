package Dd;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC3340k;
import tf.l;

/* loaded from: classes5.dex */
public final class d implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Nd.a f2645a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2646b;

    /* renamed from: c, reason: collision with root package name */
    public final l f2647c;

    /* renamed from: d, reason: collision with root package name */
    public tf.a f2648d;

    public d(Nd.a key, Object config, l lVar) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(config, "config");
        this.f2645a = key;
        this.f2646b = config;
        this.f2647c = lVar;
        this.f2648d = new com.moloco.sdk.service_locator.h(14);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2648d.invoke();
    }
}
