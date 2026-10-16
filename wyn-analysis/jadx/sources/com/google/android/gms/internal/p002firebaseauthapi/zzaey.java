package com.google.android.gms.internal.p002firebaseauthapi;

import R8.v;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes.dex */
final class zzaey implements OnFailureListener {
    public zzaey(zzaew zzaewVar) {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        zzaew.zza.c(v.f("SmsRetrieverClient failed to start: ", exc.getMessage()), new Object[0]);
    }
}
