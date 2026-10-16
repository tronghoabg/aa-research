package com.vungle.ads.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vungle.ads.internal.y0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class a {
    public static final String a(Intent intent) {
        y0 y0Var = l.f33730h;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString("request_eventId");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String b(Intent intent) {
        y0 y0Var = l.f33730h;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString("request");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(com.vungle.ads.internal.presenter.a aVar) {
        l.f33731i = aVar;
    }

    public static void a(y0 y0Var) {
        l.f33730h = y0Var;
    }

    public static Intent a(Context context, String placement, String str) {
        AbstractC3340k.e(placement, "placement");
        Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        Bundle bundle = new Bundle();
        bundle.putString("request", placement);
        bundle.putString("request_eventId", str);
        intent.putExtras(bundle);
        return intent;
    }
}
