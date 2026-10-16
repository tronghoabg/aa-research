package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f4748a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n f4749b;

    aj(n nVar, Dialog dialog) {
        this.f4748a = dialog;
        Objects.requireNonNull(nVar);
        this.f4749b = nVar;
    }

    public final void a() {
        this.f4749b.f4840a.j();
        Dialog dialog = this.f4748a;
        if (dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
