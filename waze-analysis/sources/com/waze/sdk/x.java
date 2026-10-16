package com.waze.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.waze.R;
import com.waze.dc;
import com.waze.gp;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f35430a;

    /* renamed from: b, reason: collision with root package name */
    private final IntentFilter f35431b;

    /* renamed from: c, reason: collision with root package name */
    private String f35432c;

    /* renamed from: d, reason: collision with root package name */
    private String f35433d;

    /* renamed from: e, reason: collision with root package name */
    private String f35434e;

    x(ae aeVar) {
        Objects.requireNonNull(aeVar);
        this.f35430a = aeVar;
        IntentFilter intentFilter = new IntentFilter();
        this.f35431b = intentFilter;
        intentFilter.addAction("com.waze.sdk.audio.ACTION_OFFLINE_MESSAGE");
        intentFilter.addCategory("android.intent.category.DEFAULT");
    }

    final void a(Context context, String str, String str2, String str3) {
        this.f35432c = str3;
        this.f35433d = str;
        this.f35434e = str2;
        ContextCompat.registerReceiver(context, this, this.f35431b, 2);
    }

    final void b(Context context) {
        try {
            context.unregisterReceiver(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!TextUtils.equals(this.f35432c, intent.getStringExtra("token")) || TextUtils.isEmpty(intent.getStringExtra("errorMessage"))) {
            return;
        }
        ae aeVar = this.f35430a;
        aeVar.getContext().unregisterReceiver(this);
        com.waze.app_nav.hub.b.c cVarC = com.waze.app_nav.hub.b.m.c();
        String str = this.f35433d;
        String stringExtra = intent.getStringExtra("errorMessage");
        String str2 = this.f35434e;
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(aVarA.c(R.string.SDK_ERROR_MESSAGE_POPUP_TITLE, str));
        oVar.P(stringExtra);
        oVar.f13808a = new dc(str2, 13);
        oVar.M(aVarA.c(R.string.SDK_ERROR_MESSAGE_POPUP_MAIN_BUTTON, str));
        oVar.N(aVarA.c(R.string.SDK_ERROR_MESSAGE_POPUP_SECONDARY_BUTTON, new Object[0]));
        oVar.R(true);
        cVarC.b(new com.waze.app_nav.hub.b.k("SdkDialog", new gp(oVar, 20)));
        ap.f35250a.b(this.f35434e);
        aeVar.ap(aeVar.f35223i);
    }
}
