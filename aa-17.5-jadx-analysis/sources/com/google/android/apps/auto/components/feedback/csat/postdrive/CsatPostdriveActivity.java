package com.google.android.apps.auto.components.feedback.csat.postdrive;

import android.os.Bundle;
import defpackage.aezu;
import defpackage.bc;
import defpackage.dsg;
import defpackage.lbt;
import defpackage.lco;
import defpackage.lnm;
import defpackage.ype;
import defpackage.yph;
import j$.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/google/android/apps/auto/components/feedback/csat/postdrive/CsatPostdriveActivity;", "Landroid/support/v4/app/FragmentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "java.com.google.android.apps.auto.components.feedback.csat.postdrive_postdrive"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CsatPostdriveActivity extends bc {
    public static final /* synthetic */ int m = 0;
    private static final yph n = yph.c("GH.CsatPostdriveAct");

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("SURVEY_CONTEXT", 0);
        ConcurrentHashMap concurrentHashMap = lbt.a;
        lbt lbtVarP = lnm.P(intExtra);
        if (lbtVarP == null) {
            ((ype) n.h()).w("Could not find survey ID %d", intExtra);
            finish();
        } else if (bundle == null) {
            setRequestedOrientation(12);
            lco lcoVar = new lco();
            lcoVar.setArguments(dsg.z(new aezu("context", Integer.valueOf(lbtVarP.ordinal()))));
            lcoVar.e(a(), "dialog");
        }
    }
}
