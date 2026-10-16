package com.waze.c.e;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.media3.common.util.WavUtil;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class cj implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18657a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18658b;

    public /* synthetic */ cj(int i2, int i3) {
        this.f18658b = i3;
        this.f18657a = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f18658b;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            return cl.b(this.f18657a, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            com.waze.ui.l.bh.g((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f18657a | 1));
            return h.ab.f48028a;
        }
        if (i2 == 2) {
            ((Integer) obj2).intValue();
            com.waze.cb.i.j((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f18657a | 1));
            return h.ab.f48028a;
        }
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1434310666, iIntValue, -1, "com.waze.ui.shared_drive.ShareDriveErrorDialog.<anonymous> (ShareDriveErrorDialog.kt:63)");
            }
            TextKt.m4275Text4IGK_g(com.waze.ui.r.a.c.c.b(this.f18657a, composer, 0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (h.g.a.l<? super TextLayoutResult, h.ab>) null, com.waze.bz.a.h(composer).a(), composer, 0, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }
}
