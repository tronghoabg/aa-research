package com.waze.network.b;

import android.net.DnsResolver;
import android.net.DnsResolver$Callback;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements DnsResolver$Callback {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f32035d = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f32036a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f32037b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f32038c;

    c(f fVar, String str, CompletableDeferred completableDeferred) {
        this.f32036a = fVar;
        this.f32037b = str;
        this.f32038c = completableDeferred;
    }

    public final /* bridge */ /* synthetic */ void onAnswer(Object obj, int i2) throws IOException {
        List list = (List) obj;
        h.g.b.x.f(list, "answer");
        this.f32036a.f32058g.a("DNS resolved hostname='" + this.f32037b + "', address=" + h.a.i.aM(list, ",", null, null, 0, new com.waze.navigate.location_preview.q(2), 30));
        this.f32038c.a(list);
    }

    public final void onError(DnsResolver.DnsException dnsException) {
        h.g.b.x.f(dnsException, "error");
        this.f32036a.f32058g.g("DNS failed hostname='" + this.f32037b + "', error=" + dnsException);
        this.f32038c.b(new UnknownHostException(String.valueOf(dnsException)));
    }
}
