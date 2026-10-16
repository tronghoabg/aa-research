package com.waze.web;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.waze.favorites.FavoritesActivity;
import com.waze.modules.navigation.ah;
import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c implements com.waze.app_nav.l {

    /* renamed from: a, reason: collision with root package name */
    private Object f45483a;

    /* renamed from: b, reason: collision with root package name */
    private Object f45484b;

    public final com.waze.app_nav.p a() {
        Bundle bundle = new Bundle();
        bundle.putString("webViewTitle", (String) this.f45483a);
        bundle.putString("webViewURL", (String) this.f45484b);
        bundle.putLong("cb", 0L);
        bundle.putBoolean("webViewShowClose", true);
        return new com.waze.app_nav.p(i.class, bundle);
    }

    public final void b(String str) {
        this.f45484b = str;
    }

    public final void c(String str) {
        this.f45483a = str;
    }

    public final Intent d(Context context) {
        x.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) FavoritesActivity.class);
        Bundle bundle = new Bundle();
        Object obj = this.f45483a;
        if (obj != null && (obj == com.waze.bt.e.f17463b || obj == com.waze.bt.e.f17464c)) {
            bundle.putSerializable("mode", (Serializable) obj);
        }
        Object obj2 = this.f45484b;
        if (obj2 != null) {
            bundle.putString("caller", ((ah) obj2).name());
        }
        intent.putExtras(bundle);
        return intent;
    }

    public final void e(ah ahVar) {
        x.f(ahVar, "caller");
        this.f45484b = ahVar;
    }

    public final void f(com.waze.bt.e eVar) {
        x.f(eVar, "mode");
        this.f45483a = eVar;
    }
}
