package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Velocity;
import androidx.media3.common.C$$ExternalSyntheticApiModelOutline0;
import androidx.media3.muxer.MuxerUtil;
import h.ab;
import h.c.a.h;
import h.c.e;
import h.c.j;
import h.d.b;
import h.g.a.q;
import h.g.b.x;
import h.k.n;
import kotlinx.coroutines.br;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class WindowInsetsNestedScrollConnection implements NestedScrollConnection, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private br animationJob;
    private final CancellationSignal cancellationSignal = new CancellationSignal();
    private k<? super WindowInsetsAnimationController> continuation;
    private final Density density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final SideCalculator sideCalculator;
    private final View view;
    private final AndroidWindowInsets windowInsets;

    public WindowInsetsNestedScrollConnection(AndroidWindowInsets androidWindowInsets, View view, SideCalculator sideCalculator, Density density) {
        this.windowInsets = androidWindowInsets;
        this.view = view;
        this.sideCalculator = sideCalculator;
        this.density = density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float f2) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(windowInsetsAnimationController.getCurrentInsets(), Math.round(f2)), 1.0f, 0.0f);
        }
    }

    private final void animationEnded() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.animationController) != null) {
            windowInsetsAnimationController.finish(this.windowInsets.isVisible());
        }
        this.animationController = null;
        k<? super WindowInsetsAnimationController> kVar = this.continuation;
        if (kVar != null) {
            kVar.d(null, new q() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.animationEnded.1
                @Override // h.g.a.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return ab.f48028a;
                }

                public final void invoke(Throwable th, Void r2, j jVar) {
                }
            });
        }
        this.continuation = null;
        br brVar = this.animationJob;
        if (brVar != null) {
            brVar.s(new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2852flinghuYlsQE(long r20, float r22, boolean r23, h.c.e<? super androidx.compose.ui.unit.Velocity> r24) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.m2852flinghuYlsQE(long, float, boolean, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(e<? super WindowInsetsAnimationController> eVar) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            return windowInsetsAnimationController;
        }
        l lVar = new l(h.d(eVar), 1);
        lVar.u();
        this.continuation = lVar;
        requestAnimationController();
        Object objJ = lVar.j();
        if (objJ == h.c.a.a.f48038a) {
            b.c(eVar);
        }
        return objJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        WindowInsetsController windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            AndroidWindowInsets androidWindowInsets = this.windowInsets;
            windowInsetsController.controlWindowInsetsAnimation(androidWindowInsets.getType$foundation_layout(), -1L, null, this.cancellationSignal, C$$ExternalSyntheticApiModelOutline0.m12013m((Object) this));
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m2853scroll8S9VItk(long j2, float f2) {
        br brVar = this.animationJob;
        if (brVar != null) {
            brVar.s(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (f2 != 0.0f) {
            if (this.windowInsets.isVisible() != (f2 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.partialConsumption = 0.0f;
                    requestAnimationController();
                    return this.sideCalculator.mo2803consumedOffsetsMKHz9U(j2);
                }
                int iValueOf = this.sideCalculator.valueOf(windowInsetsAnimationController.getHiddenStateInsets());
                int iValueOf2 = this.sideCalculator.valueOf(windowInsetsAnimationController.getShownStateInsets());
                SideCalculator sideCalculator = this.sideCalculator;
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iValueOf3 = sideCalculator.valueOf(currentInsets);
                if (iValueOf3 == (f2 > 0.0f ? iValueOf2 : iValueOf)) {
                    this.partialConsumption = 0.0f;
                    return Offset.Companion.m7996getZeroF1C5BW0();
                }
                float f3 = iValueOf3 + f2 + this.partialConsumption;
                int iJ = n.j(Math.round(f3), iValueOf, iValueOf2);
                this.partialConsumption = f3 - Math.round(f3);
                if (iJ != iValueOf3) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.sideCalculator.adjustInsets(currentInsets, iJ), 1.0f, 0.0f);
                }
                return this.sideCalculator.mo2803consumedOffsetsMKHz9U(j2);
            }
        }
        return Offset.Companion.m7996getZeroF1C5BW0();
    }

    public final void dispose() {
        k<? super WindowInsetsAnimationController> kVar = this.continuation;
        if (kVar != null) {
            kVar.d(null, new q() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection.dispose.1
                @Override // h.g.a.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return ab.f48028a;
                }

                public final void invoke(Throwable th, Void r2, j jVar) {
                }
            });
        }
        br brVar = this.animationJob;
        if (brVar != null) {
            brVar.s(null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!x.n(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }

    public final Density getDensity() {
        return this.density;
    }

    public final SideCalculator getSideCalculator() {
        return this.sideCalculator;
    }

    public final View getView() {
        return this.view;
    }

    public final AndroidWindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public void onCancelled(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    public void onFinished(WindowInsetsAnimationController windowInsetsAnimationController) {
        animationEnded();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo2297onPostFlingRZ2iAVY(long j2, long j3, e<? super Velocity> eVar) {
        return m2852flinghuYlsQE(j3, this.sideCalculator.showMotion(Velocity.m11406getXimpl(j3), Velocity.m11407getYimpl(j3)), true, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo2298onPostScrollDzOQY0M(long j2, long j3, int i2) {
        return m2853scroll8S9VItk(j3, this.sideCalculator.showMotion(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j3))));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo2299onPreFlingQWom1Mo(long j2, e<? super Velocity> eVar) {
        return m2852flinghuYlsQE(j2, this.sideCalculator.hideMotion(Velocity.m11406getXimpl(j2), Velocity.m11407getYimpl(j2)), false, eVar);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo2300onPreScrollOzD1aCk(long j2, int i2) {
        return m2853scroll8S9VItk(j2, this.sideCalculator.hideMotion(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & j2))));
    }

    public void onReady(WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
        this.animationController = windowInsetsAnimationController;
        this.isControllerRequested = false;
        k<? super WindowInsetsAnimationController> kVar = this.continuation;
        if (kVar != null) {
            kVar.d(windowInsetsAnimationController, new q() { // from class: androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection$$ExternalSyntheticLambda0
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C$$ExternalSyntheticApiModelOutline0.m12014m(obj2);
                    return ab.f48028a;
                }
            });
        }
        this.continuation = null;
    }
}
