package Cd;

import Ef.InterfaceC0518y;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class c0 extends IOException implements InterfaceC0518y {

    /* renamed from: a, reason: collision with root package name */
    public final String f2091a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f2092b;

    public c0(String url, Long l10, Throwable th) {
        AbstractC3340k.e(url, "url");
        StringBuilder sb2 = new StringBuilder("Request timeout has expired [url=");
        sb2.append(url);
        sb2.append(", request_timeout=");
        sb2.append(l10 == null ? "unknown" : l10);
        sb2.append(" ms]");
        super(sb2.toString(), th);
        this.f2091a = url;
        this.f2092b = l10;
    }

    @Override // Ef.InterfaceC0518y
    public final Throwable a() {
        return new c0(this.f2091a, this.f2092b, getCause());
    }
}
