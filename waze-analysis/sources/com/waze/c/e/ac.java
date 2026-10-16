package com.waze.c.e;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.unit.Density;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ac implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f18490a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ al f18491b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Density f18492c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f18493d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bi f18494e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f18495f;

    public ac(List list, al alVar, Density density, h.g.a.a aVar, bi biVar, h.g.a.a aVar2) {
        this.f18490a = list;
        this.f18491b = alVar;
        this.f18492c = density;
        this.f18493d = aVar;
        this.f18494e = biVar;
        this.f18495f = aVar2;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        Modifier.Companion companionOnGloballyPositioned;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        boolean z = true;
        if ((iIntValue2 & 6) == 0) {
            i2 = (true != composer.changed(lazyItemScope) ? 2 : 4) | iIntValue2;
        } else {
            i2 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i2 |= true != composer.changed(iIntValue) ? 16 : 32;
        }
        if (composer.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2039820996, i2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            com.waze.ui.b.bc bcVar = (com.waze.ui.b.bc) this.f18490a.get(iIntValue);
            composer.startReplaceGroup(-1443441461);
            Modifier.Companion companion = Modifier.Companion;
            if (iIntValue == 0) {
                composer.startReplaceGroup(-1443316873);
                Modifier.Companion companion2 = Modifier.Companion;
                al alVar = this.f18491b;
                boolean zChanged = composer.changed(alVar);
                Density density = this.f18492c;
                boolean zChanged2 = zChanged | composer.changed(density);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged2 || objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = (h.g.a.l) new aa(alVar, density, 1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                companionOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(companion2, (h.g.a.l) objRememberedValue);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1443066362);
                composer.endReplaceGroup();
                companionOnGloballyPositioned = Modifier.Companion;
            }
            companion.then(companionOnGloballyPositioned);
            Modifier modifierPadding = PaddingKt.padding(lazyItemScope.animateItem(companionOnGloballyPositioned, null, com.waze.z.a.aa.c(com.waze.z.a.x.f46210a), null), PaddingKt.m2752PaddingValuesa9UjIt4$default(16.0f, 0.0f, 16.0f, 16.0f, 2, null));
            h.g.a.a aVar = this.f18493d;
            bi biVar = this.f18494e;
            int i3 = i2 & 126;
            boolean zChanged3 = composer.changed(biVar) | composer.changed(bcVar);
            if ((((i2 & 112) ^ 48) <= 32 || !composer.changed(iIntValue)) && (i2 & 48) != 32) {
                z = false;
            }
            boolean z2 = zChanged3 | z;
            h.g.a.a aVar2 = this.f18495f;
            boolean zChanged4 = z2 | composer.changed(aVar2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = (h.g.a.a) new z(biVar, bcVar, iIntValue, aVar2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            al alVar2 = this.f18491b;
            h.g.a.a aVar3 = (h.g.a.a) objRememberedValue2;
            boolean zChanged5 = composer.changed(alVar2) | composer.changed(bcVar);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged5 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = (h.g.a.l) new aa(alVar2, bcVar, 0);
                composer.updateRememberedValue(objRememberedValue3);
            }
            com.waze.ui.b.z.h(iIntValue, bcVar, modifierPadding, aVar, aVar3, (h.g.a.l) objRememberedValue3, composer, (i3 >> 3) & 14);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }
}
