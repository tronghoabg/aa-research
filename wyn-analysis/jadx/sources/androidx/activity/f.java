package androidx.activity;

import X0.AbstractC1274b;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import h.AbstractC2762a;

/* loaded from: classes.dex */
public final class f extends g.h {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f17704h;

    public f(ComponentActivity componentActivity) {
        this.f17704h = componentActivity;
    }

    @Override // g.h
    public final void b(int i5, AbstractC2762a abstractC2762a, Object obj) {
        Bundle bundleExtra;
        int i10;
        ComponentActivity componentActivity = this.f17704h;
        R.e eVarB = abstractC2762a.b(componentActivity, obj);
        if (eVarB != null) {
            new Handler(Looper.getMainLooper()).post(new M3.i(this, i5, eVarB, 3));
            return;
        }
        Intent intentA = abstractC2762a.a(componentActivity, obj);
        if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
            intentA.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentA.getAction())) {
            String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC1274b.a(componentActivity, stringArrayExtra, i5);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentA.getAction())) {
            componentActivity.startActivityForResult(intentA, i5, bundle);
            return;
        }
        g.j jVar = (g.j) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i10 = i5;
            try {
                componentActivity.startIntentSenderForResult(jVar.f35475a, i10, jVar.f35476b, jVar.f35477c, jVar.f35478d, 0, bundle);
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                new Handler(Looper.getMainLooper()).post(new M3.i(this, i10, e, 4));
            }
        } catch (IntentSender.SendIntentException e10) {
            e = e10;
            i10 = i5;
        }
    }
}
