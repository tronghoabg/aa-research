package com.waze.main_screen.c.c;

import android.content.res.Resources;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.waze.car_lib.login.LoginController$LoginState;
import com.waze.car_lib.login.h;
import com.waze.jni.protos.settings.SettingsValueListProto;
import com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.i;
import com.waze.main_screen.g.b.d;
import com.waze.navbar.p;
import com.waze.settings.a.a.b.f;
import com.waze.view.anim.g;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26164a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26165b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f26166c;

    public /* synthetic */ b(Object obj, boolean z, int i2) {
        this.f26166c = i2;
        this.f26165b = obj;
        this.f26164a = z;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) throws Resources.NotFoundException {
        switch (this.f26166c) {
            case 0:
                LayoutCoordinates layoutCoordinates = (LayoutCoordinates) obj;
                x.f(layoutCoordinates, "it");
                if (this.f26164a) {
                    this.f26165b.setValue(Offset.m7969boximpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates)));
                }
                return ab.f48028a;
            case 1:
                LoginController$LoginState loginController$LoginState = (LoginController$LoginState) obj;
                x.f(loginController$LoginState, "it");
                return loginController$LoginState.copy(new h(this.f26164a, (String) this.f26165b));
            case 2:
                d dVar = (d) obj;
                x.f(dVar, "it");
                dVar.f((com.waze.bv.h) this.f26165b.getValue());
                if (this.f26164a) {
                    dVar.clearAnimation();
                    dVar.setVisibility(0);
                    g.d(dVar).translationX(0.0f).setListener(null);
                } else {
                    g.d(dVar).translationX(-dVar.getMeasuredWidth()).setListener(g.b(dVar));
                }
                return ab.f48028a;
            case 3:
                return com.waze.main_screen.p.a.b.a.ab.b(this.f26164a, this.f26165b, (i) obj);
            case 4:
                p pVar = (p) obj;
                x.f(pVar, "it");
                pVar.A((com.waze.ui.r.a.e.b.a) this.f26165b);
                if (this.f26164a) {
                    pVar.B();
                } else {
                    pVar.C(true);
                }
                return ab.f48028a;
            case 5:
                com.waze.design_components.a.d dVar2 = (com.waze.design_components.a.d) obj;
                x.f(dVar2, TypedValues.CycleType.S_WAVE_OFFSET);
                this.f26165b.invoke(Boolean.valueOf(this.f26164a), dVar2);
                return ab.f48028a;
            case 6:
                return f.c(this.f26164a, (f) this.f26165b, (DisposableEffectScope) obj);
            default:
                return com.waze.utils.d.b((com.waze.utils.d) this.f26165b, this.f26164a, (SettingsValueListProto) obj);
        }
    }

    public /* synthetic */ b(boolean z, Object obj, int i2) {
        this.f26166c = i2;
        this.f26164a = z;
        this.f26165b = obj;
    }
}
