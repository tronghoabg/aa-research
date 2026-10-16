package com.waze.navigate;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.contextaware.ContextAware;
import com.waze.navigate.location_preview.LocationPreviewActivity;
import com.waze.reports.AddPlaceFlowActivity;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class gn implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f31439a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f31440b;

    public /* synthetic */ gn(Object obj, int i2) {
        this.f31440b = i2;
        this.f31439a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.waze.g.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlinx.coroutines.b.bn] */
    @Override // h.g.a.a
    public final Object invoke() {
        Bundle extras;
        com.waze.navigate.location_preview.az azVar;
        ?? r1;
        Object objD;
        switch (this.f31440b) {
            case 0:
                return gw.b(this.f31439a);
            case 1:
                LocationPreviewActivity locationPreviewActivity = (LocationPreviewActivity) this.f31439a;
                Intent intent = locationPreviewActivity.getIntent();
                if (intent != null && (extras = intent.getExtras()) != null && (azVar = (com.waze.navigate.location_preview.az) extras.getParcelable("params_extra")) != null) {
                    return com.waze.ch.a.a.f.g(azVar);
                }
                org.a.d.h.a aVarG = com.waze.ch.a.a.f.g(new com.waze.navigate.location_preview.az(new AddressItem(0, 0, ""), false, false, false, false, false, null, false, null, null, null, "", null, false, false));
                com.waze.shared_infra.i.h.g("No parameters passed to LocationPreviewActivity");
                locationPreviewActivity.finish();
                return aVarG;
            case 2:
                int i2 = com.waze.navigate.location_preview.r.f31751a;
                return com.waze.ch.a.a.f.g(this.f31439a);
            case 3:
                break;
            case 4:
                Object obj = this.f31439a;
                int i3 = com.waze.network.r.f32404a;
                return a.a.z((org.a.d.k.b) obj);
            case 5:
                Object obj2 = this.f31439a;
                int i4 = com.waze.network.r.f32404a;
                return a.a.z((org.a.d.k.b) obj2);
            case 6:
                int i5 = com.waze.network.d.s.f32220a;
                return ((com.waze.g.c) this.f31439a.e().d()).b();
            case 7:
                int i6 = com.waze.network.d.s.f32220a;
                String userName = ((com.waze.sharedui.profile.b) this.f31439a).b().getUserName();
                return userName.length() != 0 ? userName : null;
            case 8:
                return a.a.k(this.f31439a);
            case 9:
                int i7 = com.waze.parking.h.f32960g;
                return com.waze.ch.a.a.f.g(new com.waze.parking.s((com.waze.shared_infra.h.c) this.f31439a, (com.waze.map.b.ai) null));
            case 10:
                this.f31439a.invoke(false);
                return h.ab.f48028a;
            case 11:
                a.a.q(this.f31439a).invoke(false);
                return h.ab.f48028a;
            case 12:
                return com.waze.ch.a.a.f.g(this.f31439a);
            case 13:
                ContextAware parentFragment = ((android.support.v4.app.ar) this.f31439a).getParentFragment();
                com.waze.settings.ce ceVar = parentFragment instanceof com.waze.settings.ce ? (com.waze.settings.ce) parentFragment : null;
                if (ceVar != null) {
                    return ceVar.a();
                }
                return null;
            case 14:
                return kotlinx.coroutines.bo.f((Executor) this.f31439a);
            case 15:
                this.f31439a.run();
                return h.ab.f48028a;
            case 16:
                kotlinx.coroutines.br brVar = ((com.waze.reports_v2.c.db) this.f31439a).f34397j;
                if (brVar != null) {
                    brVar.s(null);
                }
                return h.ab.f48028a;
            case 17:
                this.f31439a.a(com.waze.reports_v2.presentation.a.f34610c);
                return h.ab.f48028a;
            case 18:
                ?? r0 = this.f31439a;
                if (r0 != 0) {
                    r0.run();
                }
                return h.ab.f48028a;
            case 19:
                ((com.waze.reports.dr) this.f31439a).D();
                return h.ab.f48028a;
            default:
                Context context = (Context) this.f31439a;
                context.startActivity(AddPlaceFlowActivity.n(context));
                return h.ab.f48028a;
        }
        do {
            r1 = this.f31439a;
            objD = r1.d();
        } while (!r1.f(objD, com.waze.ui.m.dl.y((com.waze.ui.m.dl) objD, null, null, null, false, 16711679)));
        return h.ab.f48028a;
    }
}
