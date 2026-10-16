package com.waze.reports;

import android.content.DialogInterface;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bt implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bu f33731a;

    bt(bu buVar) {
        Objects.requireNonNull(buVar);
        this.f33731a = buVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f33731a.f33734c.f33736b.f33754h = null;
    }
}
