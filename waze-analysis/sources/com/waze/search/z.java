package com.waze.search;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class z implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.waze.search.e.p f36664a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36665b;

    public /* synthetic */ z(com.waze.search.e.p pVar, int i2) {
        this.f36665b = i2;
        this.f36664a = pVar;
    }

    @Override // h.g.a.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (this.f36665b != 0) {
            Composer composer = (Composer) obj2;
            int iIntValue = ((Integer) obj3).intValue();
            h.g.b.x.f((ColumnScope) obj, "$this$CellWithDivider");
            if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-94160310, iIntValue, -1, "com.waze.search.DestinationCellListItem.<anonymous> (SearchList.kt:247)");
                }
                com.waze.search.e.p pVar = this.f36664a;
                PaddingValues paddingValuesM2751PaddingValuesa9UjIt4 = PaddingKt.m2751PaddingValuesa9UjIt4(16.0f, 16.0f, 16.0f, 16.0f);
                boolean zChangedInstance = composer.changedInstance(pVar);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (h.l.f) new j((Object) pVar, 4, (int[]) null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                h.g.a.a aVar = (h.g.a.a) objRememberedValue;
                boolean zChangedInstance2 = composer.changedInstance(pVar);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = (h.l.f) new j(pVar, 5, (boolean[]) null);
                    composer.updateRememberedValue(objRememberedValue2);
                }
                com.waze.search.e.g.c(pVar, false, null, paddingValuesM2751PaddingValuesa9UjIt4, aVar, (h.g.a.a) objRememberedValue2, composer, 0, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return h.ab.f48028a;
        }
        Composer composer2 = (Composer) obj2;
        int iIntValue2 = ((Integer) obj3).intValue();
        h.g.b.x.f((BoxScope) obj, "$this$SwipeableContentActions");
        if (composer2.shouldExecute((iIntValue2 & 17) != 16, iIntValue2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1344085682, iIntValue2, -1, "com.waze.search.SwipeableDestinationCellListItem.<anonymous>.<anonymous> (SearchList.kt:329)");
            }
            com.waze.search.e.p pVar2 = this.f36664a;
            PaddingValues paddingValuesM2751PaddingValuesa9UjIt42 = PaddingKt.m2751PaddingValuesa9UjIt4(16.0f, 16.0f, 16.0f, 16.0f);
            boolean zChangedInstance3 = composer2.changedInstance(pVar2);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (h.l.f) new j((Object) pVar2, 7, (int[]) null);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            h.g.a.a aVar2 = (h.g.a.a) objRememberedValue3;
            boolean zChangedInstance4 = composer2.changedInstance(pVar2);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = (h.l.f) new j(pVar2, 8, (boolean[]) null);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            com.waze.search.e.g.c(pVar2, false, null, paddingValuesM2751PaddingValuesa9UjIt42, aVar2, (h.g.a.a) objRememberedValue4, composer2, 0, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }
}
