package com.waze.ifs.ui;

import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ar implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ as f24526a;

    ar(as asVar) {
        Objects.requireNonNull(asVar);
        this.f24526a = asVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        com.waze.shared_infra.i.h.a("ITEM CLICKED " + this.f24526a.f24529c);
    }
}
