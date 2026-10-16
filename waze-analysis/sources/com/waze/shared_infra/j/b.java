package com.waze.shared_infra.j;

import android.content.Context;
import androidx.core.content.ContextCompat;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f37900a;

    public b(Context context) {
        x.f(context, "context");
        this.f37900a = context;
    }

    @Override // com.waze.shared_infra.j.a
    public final boolean a(String str) {
        x.f(str, "permission");
        return ContextCompat.checkSelfPermission(this.f37900a, str) == 0;
    }
}
