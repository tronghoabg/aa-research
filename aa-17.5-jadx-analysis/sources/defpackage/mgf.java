package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class mgf implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ebf.j().F(rrc.h(yxy.FRX, yzz.PREFLIGHT_CAR_INTRO, yzy.hQ).l());
        Context context = mki.a.c;
        context.getClass();
        if (acvh.z()) {
            context.sendBroadcast(new Intent("com.google.android.apps.auto.components.preflight.phone.RESTORE_PHONE_NOTIFICATION").setPackage(context.getPackageName()));
        }
        Intent intent = new Intent(context, (Class<?>) PreflightPhoneWelcomeActivity.class);
        intent.addFlags(335544320);
        context.startActivity(intent, luk.d());
    }
}
