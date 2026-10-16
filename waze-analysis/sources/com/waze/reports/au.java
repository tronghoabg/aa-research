package com.waze.reports;

import android.graphics.Bitmap;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class au extends com.waze.utils.m {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f33643a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f33644b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f33645c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ EditPlaceFlowActivity f33646d;

    au(EditPlaceFlowActivity editPlaceFlowActivity, String str, String str2, String str3) {
        this.f33643a = str;
        this.f33644b = str2;
        this.f33645c = str3;
        Objects.requireNonNull(editPlaceFlowActivity);
        this.f33646d = editPlaceFlowActivity;
    }

    @Override // com.waze.utils.m
    public final void a(Bitmap bitmap) {
        EditPlaceFlowActivity editPlaceFlowActivity = this.f33646d;
        editPlaceFlowActivity.m.M(editPlaceFlowActivity.u, this.f33643a, this.f33644b);
        editPlaceFlowActivity.m.K(this.f33645c);
        editPlaceFlowActivity.u = null;
        editPlaceFlowActivity.aF(new at(this));
    }
}
