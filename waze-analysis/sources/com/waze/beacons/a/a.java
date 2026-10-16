package com.waze.beacons.a;

import androidx.navigation.NavController;
import com.waze.NativeManager;
import com.waze.ab.z;
import com.waze.an.a.i;
import com.waze.install.g;
import com.waze.reports_v2.presentation.a.au;
import h.ab;
import h.g.b.ar;
import h.g.b.m;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16237a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f16238b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f16238b = i2;
        this.f16237a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v29, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v48, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v50, types: [com.waze.main_screen.w.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v52, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v63, types: [com.waze.main_screen.d.a.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v65, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f16238b) {
            case 0:
                return f.d((f) this.f16237a);
            case 1:
                return Boolean.valueOf(f.m((f) this.f16237a));
            case 2:
                return f.f((f) this.f16237a);
            case 3:
                Object obj = this.f16237a;
                if (obj != null) {
                    ((i) obj).i().invoke();
                }
                return ab.f48028a;
            case 4:
                Object obj2 = this.f16237a;
                int i2 = g.f24774a;
                return a.a.z((org.a.d.k.b) obj2);
            case 5:
                org.a.d.k.b bVarC = ((org.a.d.k.b) this.f16237a).e().a().c();
                int i3 = ar.f48106a;
                ((NativeManager) bVarC.a(new m(NativeManager.class), null, null)).shutDown();
                return ab.f48028a;
            case 6:
                return com.waze.ui.r.a.d.d.e(new a(this.f16237a, 7), new z(5));
            case 7:
                return a.a.k(this.f16237a);
            case 8:
                return com.waze.at.b.d.c((com.waze.at.b.d) this.f16237a);
            case 9:
                return com.waze.at.b.d.d((com.waze.at.b.d) this.f16237a);
            case 10:
                ((NavController) this.f16237a).popBackStack();
                return ab.f48028a;
            case 11:
                return com.waze.ch.a.a.f.g(new com.waze.reports_v2.presentation.a.f((au) this.f16237a));
            case 12:
                ((NavController) this.f16237a).popBackStack();
                return ab.f48028a;
            case 13:
                ?? r3 = this.f16237a;
                r3.setValue(new a(r3, 15));
                return ab.f48028a;
            case 14:
                this.f16237a.b();
                return ab.f48028a;
            case 15:
                this.f16237a.setValue(null);
                return ab.f48028a;
            case 16:
                ((com.waze.main_screen.a.b.a.g) this.f16237a).f();
                return ab.f48028a;
            case 17:
                return com.waze.main_screen.bottom_bars.scrollable_eta.d.a((com.waze.main_screen.bottom_bars.scrollable_eta.d) this.f16237a);
            case 18:
                return com.waze.main_screen.bottom_bars.scrollable_eta.d.b((com.waze.main_screen.bottom_bars.scrollable_eta.d) this.f16237a);
            case 19:
                this.f16237a.b();
                return ab.f48028a;
            default:
                return a.a.k(this.f16237a);
        }
    }
}
