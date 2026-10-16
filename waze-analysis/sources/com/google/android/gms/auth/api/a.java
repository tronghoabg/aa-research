package com.google.android.gms.auth.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.c;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.p;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends com.google.android.gms.common.api.a {
    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ h a(Context context, Looper looper, p pVar, Object obj, r rVar, s sVar) {
        return new c(context, looper, pVar, (GoogleSignInOptions) obj, rVar, sVar);
    }
}
