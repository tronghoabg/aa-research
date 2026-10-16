package com.waze.design_components.g;

import android.content.Context;
import androidx.webkit.ProxyConfig;
import h.g.b.x;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class a implements com.waze.shared_infra.o.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23461a;

    public a(Context context) {
        x.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        x.e(applicationContext, "getApplicationContext(...)");
        this.f23461a = applicationContext;
    }

    @Override // com.waze.shared_infra.o.a
    public final /* synthetic */ String a() {
        return "en";
    }

    @Override // com.waze.shared_infra.o.a
    public final /* synthetic */ String b(String str) {
        x.f(str, "resName");
        return d(str, false);
    }

    @Override // com.waze.shared_infra.o.a
    public final String c(int i2, Object... objArr) {
        x.f(objArr, "args");
        String string = this.f23461a.getString(i2, Arrays.copyOf(objArr, objArr.length));
        x.e(string, "getString(...)");
        return string;
    }

    @Override // com.waze.shared_infra.o.a
    public final String d(String str, boolean z) {
        x.f(str, "resName");
        return ProxyConfig.MATCH_ALL_SCHEMES.concat(String.valueOf(str));
    }

    @Override // com.waze.shared_infra.o.a
    public final /* synthetic */ void e() {
    }

    @Override // com.waze.shared_infra.o.a
    public final void f(String str, HashSet hashSet) {
        x.f(str, "language");
        x.f(hashSet, "overrideIds");
    }
}
