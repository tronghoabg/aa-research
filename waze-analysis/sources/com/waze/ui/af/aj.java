package com.waze.ui.af;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aj implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f41831a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f41832b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41833c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ y f41834d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f41835e;

    aj(int i2, List list, String str, y yVar, h.g.a.l lVar) {
        this.f41831a = i2;
        this.f41832b = list;
        this.f41833c = str;
        this.f41834d = yVar;
        this.f41835e = lVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        h.g.b.x.f((BoxScope) obj, "$this$SwipeableContentActions");
        if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1376227312, iIntValue, -1, "com.waze.ui.voices.userRecordedVoiceList.<anonymous>.<anonymous> (VoiceSettingsScreen.kt:522)");
            }
            boolean z = false;
            int i2 = this.f41831a;
            if (i2 != this.f41832b.size() - 1) {
                z = true;
            }
            String str = this.f41833c;
            y yVar = this.f41834d;
            boolean zN = h.g.b.x.n(str, yVar.c());
            h.g.a.l lVar = this.f41835e;
            y yVar2 = yVar;
            boolean zChanged = composer.changed(lVar) | composer.changed(yVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (h.g.a.a) new ao(lVar, yVar, 1);
                composer.updateRememberedValue(objRememberedValue);
            }
            ap.H(yVar2, i2, z, zN, false, (h.g.a.a) objRememberedValue, composer, 24576);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }
}
