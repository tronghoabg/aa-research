package com.waze.reports_v2.presentation;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.media.AudioManager;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.ModalBottomSheetState;
import com.waze.sound.ih;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class bq implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f34901a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f34902b;

    public bq(ComponentCallbacks componentCallbacks, int i2) {
        this.f34902b = i2;
        this.f34901a = componentCallbacks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v35, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v37, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v41, types: [com.waze.h.b.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r3v52, types: [com.waze.sound.ig, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f34902b) {
            case 0:
                return bw.j((bw) this.f34901a);
            case 1:
                return aq.b((aq) this.f34901a);
            case 2:
                org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(this.f34901a);
                int i2 = h.g.b.ar.f48106a;
                return bVarD.a(new h.g.b.m(com.waze.sound.m.class), null, null);
            case 3:
                org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(this.f34901a);
                int i3 = h.g.b.ar.f48106a;
                return bVarD2.a(new h.g.b.m(com.waze.speech.w.class), null, null);
            case 4:
                org.a.d.k.b bVarD3 = org.chromium.support_lib_boundary.a.b.d(this.f34901a);
                int i4 = h.g.b.ar.f48106a;
                return bVarD3.a(new h.g.b.m(al.class), null, null);
            case 5:
                org.a.d.k.b bVarD4 = org.chromium.support_lib_boundary.a.b.d(this.f34901a);
                int i5 = h.g.b.ar.f48106a;
                return bVarD4.a(new h.g.b.m(com.waze.reports_v2.c.bs.class), null, null);
            case 6:
                org.a.d.k.b bVarD5 = org.chromium.support_lib_boundary.a.b.d(this.f34901a);
                int i6 = h.g.b.ar.f48106a;
                return bVarD5.a(new h.g.b.m(com.waze.reports_v2.c.ca.class), null, null);
            case 7:
                org.a.d.k.b bVarD6 = org.chromium.support_lib_boundary.a.b.d(this.f34901a);
                int i7 = h.g.b.ar.f48106a;
                return bVarD6.a(new h.g.b.m(com.waze.reports_v2.c.ch.class), null, null);
            case 8:
                int i8 = com.waze.sharedrive.g.ag.f38615a;
                return Boolean.valueOf(((LazyListState) this.f34901a).getCanScrollForward());
            case 9:
                return a.a.k(this.f34901a);
            case 10:
                return Boolean.valueOf(((ModalBottomSheetState) this.f34901a).isVisible());
            case 11:
                this.f34901a.invoke(com.waze.sharedui.web.t.f39369a);
                return h.ab.f48028a;
            case 12:
                this.f34901a.invoke(com.waze.sharedui.web.w.f39372a);
                return h.ab.f48028a;
            case 13:
                this.f34901a.invoke(com.waze.sharedui.web.u.f39370a);
                return h.ab.f48028a;
            case 14:
                this.f34901a.d();
                return h.ab.f48028a;
            case 15:
                return (AudioManager) ((Context) this.f34901a).getApplicationContext().getSystemService(AudioManager.class);
            case 16:
                return com.waze.sound.ax.e((com.waze.sound.ax) this.f34901a);
            case 17:
                ?? r3 = this.f34901a;
                h.ab abVar = h.ab.f48028a;
                r3.a(abVar);
                return abVar;
            case 18:
                ih.a().e(this.f34901a);
                return h.ab.f48028a;
            case 19:
                return new com.waze.sound.e.j((com.waze.sound.e.m) this.f34901a, false);
            default:
                ((com.waze.sound.e.j) this.f34901a).c();
                return h.ab.f48028a;
        }
    }

    public /* synthetic */ bq(Object obj, int i2) {
        this.f34902b = i2;
        this.f34901a = obj;
    }
}
