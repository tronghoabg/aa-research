package com.waze.reports_v2.a.a.a;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.waze.authentication.as;
import com.waze.navigate.location_preview.ba;
import com.waze.network.ah;
import com.waze.reports_v2.c.an;
import com.waze.reports_v2.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class d {
    public /* synthetic */ d(byte[] bArr) {
    }

    public static b a(an anVar, Composer composer) {
        x.f(anVar, "stateHolder");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-16348410, 0, -1, "com.waze.reports_v2.conversational_reporting.activation.presentation.rememberConversationalReportingActivationDialogState (ConversationalReportingActivationDialogState.kt:131)");
        }
        boolean zChanged = composer.changed(anVar);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = new c(anVar);
            composer.updateRememberedValue(objRememberedValue);
        }
        c cVar = (c) objRememberedValue;
        Object[] objArr = {anVar};
        x.f(anVar, "stateHolder");
        x.f(cVar, "events");
        byte[] bArr = null;
        Saver saverListSaver = ListSaverKt.listSaver(new l(14), new as(anVar, cVar, 7, bArr));
        boolean zChanged2 = composer.changed(anVar) | composer.changed(cVar);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
            objRememberedValue2 = new com.waze.car_lib.i.b.d(anVar, cVar, 4, bArr);
            composer.updateRememberedValue(objRememberedValue2);
        }
        b bVar = (b) RememberSaveableKt.m7615rememberSaveable(objArr, saverListSaver, (h.g.a.a) objRememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bVar;
    }

    public static /* synthetic */ boolean b(ba baVar, com.waze.shared_infra.h.b bVar) {
        return (baVar instanceof ah) && bVar.i();
    }

    private d() {
        throw null;
    }
}
