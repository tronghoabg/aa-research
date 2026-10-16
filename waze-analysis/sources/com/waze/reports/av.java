package com.waze.reports;

import androidx.media3.common.C;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class av implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f33647a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f33648b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f33649c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f33650d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f33651e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ com.waze.utils.m f33652f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ EditPlaceFlowActivity f33653g;

    av(EditPlaceFlowActivity editPlaceFlowActivity, String str, String str2, String str3, String str4, String str5, com.waze.utils.m mVar) {
        this.f33647a = str;
        this.f33648b = str2;
        this.f33649c = str3;
        this.f33650d = str4;
        this.f33651e = str5;
        this.f33652f = mVar;
        Objects.requireNonNull(editPlaceFlowActivity);
        this.f33653g = editPlaceFlowActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditPlaceFlowActivity editPlaceFlowActivity = this.f33653g;
        if (editPlaceFlowActivity.u == null) {
            editPlaceFlowActivity.A = null;
            if (editPlaceFlowActivity.p) {
                editPlaceFlowActivity.f33543k.venueUpdate(editPlaceFlowActivity.m, editPlaceFlowActivity.n, this.f33647a, null);
                return;
            }
            return;
        }
        if (editPlaceFlowActivity.u.equals(this.f33648b)) {
            if (!editPlaceFlowActivity.p) {
                com.waze.utils.n.f44897a.c(this.f33650d, this.f33652f, editPlaceFlowActivity);
                if (editPlaceFlowActivity.A != null) {
                    editPlaceFlowActivity.aG(editPlaceFlowActivity.A, C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
                    return;
                }
                return;
            }
            editPlaceFlowActivity.m.M(editPlaceFlowActivity.u, this.f33649c, this.f33650d);
            editPlaceFlowActivity.m.K(this.f33651e);
            editPlaceFlowActivity.u = null;
            editPlaceFlowActivity.f33543k.venueUpdate(editPlaceFlowActivity.m, editPlaceFlowActivity.n, this.f33647a, null);
        }
    }
}
