package com.waze.car_lib.m;

import androidx.car.app.OnRequestPermissionsListener;
import h.g.b.x;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements OnRequestPermissionsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CompletableDeferred f20326a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20327b;

    public /* synthetic */ a(CompletableDeferred completableDeferred, int i2) {
        this.f20327b = i2;
        this.f20326a = completableDeferred;
    }

    @Override // androidx.car.app.OnRequestPermissionsListener
    public final void onRequestPermissionsResult(List list, List list2) {
        if (this.f20327b != 0) {
            x.c(list);
            this.f20326a.a(Boolean.valueOf(!list.isEmpty()));
        } else {
            x.c(list);
            this.f20326a.a(Boolean.valueOf(!list.isEmpty()));
        }
    }
}
