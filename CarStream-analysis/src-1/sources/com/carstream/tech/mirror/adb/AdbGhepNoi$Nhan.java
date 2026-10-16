package com.carstream.tech.mirror.adb;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.t;
import defpackage.u;
import defpackage.u5;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class AdbGhepNoi$Nhan extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CharSequence charSequence;
        Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
        String strTrim = (resultsFromIntent == null || (charSequence = resultsFromIntent.getCharSequence("ma")) == null) ? null : charSequence.toString().trim();
        if (strTrim == null) {
            strTrim = intent.getStringExtra("ma");
        }
        if (strTrim != null && strTrim.length() >= 6) {
            Context applicationContext = context.getApplicationContext();
            int i = u.a;
            u.a(applicationContext, "Đang ghép nối…");
            new Thread(new t(i, applicationContext, strTrim), "adb-ghep-noi").start();
            return;
        }
        int length = strTrim == null ? 0 : strTrim.length();
        u.d = "Mã phải đủ 6 số (bạn gõ " + length + " số). Gõ lại giúp tôi.";
        u5.d("GHEP NOI: ma khong hop le (dai " + length + ") — doi 6 so");
        u.a(context.getApplicationContext(), "Mã phải đủ 6 số — bạn vừa gõ " + length + " số. Gõ lại.");
    }
}
