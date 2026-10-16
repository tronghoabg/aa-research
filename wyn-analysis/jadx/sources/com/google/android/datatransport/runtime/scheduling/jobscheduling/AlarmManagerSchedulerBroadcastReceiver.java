package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D5.a;
import Rc.b;
import Uc.e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import ne.C3618a;
import t5.C4114i;
import t5.C4123r;
import z5.f;

/* loaded from: classes3.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26261a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_EXTRAS);
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i5 = intent.getExtras().getInt("attemptNumber");
        C4123r.b(context);
        C3618a c3618aA = C4114i.a();
        c3618aA.h(queryParameter);
        c3618aA.f41022c = a.b(iIntValue);
        if (queryParameter2 != null) {
            c3618aA.f41021b = Base64.decode(queryParameter2, 0);
        }
        f fVar = C4123r.a().f45802d;
        C4114i c4114iC = c3618aA.c();
        b bVar = new b(4);
        fVar.getClass();
        fVar.f48387e.execute(new e(i5, 3, fVar, c4114iC, bVar));
    }
}
