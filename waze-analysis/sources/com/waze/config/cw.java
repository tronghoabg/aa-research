package com.waze.config;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ed;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class cw extends ed {

    /* renamed from: a, reason: collision with root package name */
    boolean f22593a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ DebugConfigListActivity f22594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cw(DebugConfigListActivity debugConfigListActivity) {
        super(null);
        Objects.requireNonNull(debugConfigListActivity);
        this.f22594b = debugConfigListActivity;
    }

    @Override // android.support.v7.widget.ed
    public final void f(RecyclerView recyclerView, int i2) {
        boolean z;
        if (i2 == 0) {
            z = false;
        } else {
            if (i2 != 1 || this.f22593a) {
                return;
            }
            com.waze.sharedui.utils.f.j(this.f22594b);
            z = true ^ this.f22593a;
        }
        this.f22593a = z;
    }
}
