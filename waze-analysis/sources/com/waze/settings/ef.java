package com.waze.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.waze.navigate.HistoryActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ef implements bp {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f37174a;

    public /* synthetic */ ef(int i2) {
        this.f37174a = i2;
    }

    @Override // com.waze.settings.bp
    public final void a(com.waze.reports.ba baVar) {
        Context contextC;
        Context contextC2;
        int i2 = this.f37174a;
        if (i2 == 0) {
            Intent intent = new Intent(baVar != null ? baVar.c() : null, (Class<?>) HistoryActivity.class);
            if (baVar == null || (contextC = baVar.c()) == null) {
                return;
            }
            contextC.startActivity(intent);
            return;
        }
        if (i2 == 1) {
            gu.a();
            return;
        }
        if (i2 == 2) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(com.waze.t.g()));
            intent2.addFlags(268435456);
            if (baVar == null || (contextC2 = baVar.c()) == null) {
                return;
            }
            contextC2.startActivity(intent2);
            return;
        }
        int i3 = com.waze.settings.tree.a.h.f37469a;
        Context contextC3 = baVar != null ? baVar.c() : null;
        Activity activity = contextC3 instanceof Activity ? (Activity) contextC3 : null;
        if (activity == null || com.waze.settings.tree.a.d.b().resolveActivity(activity.getPackageManager()) == null) {
            return;
        }
        activity.startActivityForResult(com.waze.settings.tree.a.d.b(), 0);
    }
}
