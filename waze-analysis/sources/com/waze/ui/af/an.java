package com.waze.ui.af;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class an implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f41844a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f41845b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f41846c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f41847d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f41848e;

    public an(List list, List list2, String str, boolean z, h.g.a.l lVar) {
        this.f41844a = list;
        this.f41845b = list2;
        this.f41846c = str;
        this.f41847d = z;
        this.f41848e = lVar;
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i2;
        Object obj5 = (LazyItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i2 = (true != composer.changed(obj5) ? 2 : 4) | iIntValue2;
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
            q qVar = (q) this.f41844a.get(iIntValue);
            composer.startReplaceGroup(-1888329460);
            boolean z = iIntValue != this.f41845b.size() + (-1);
            boolean zN = h.g.b.x.n(this.f41846c, qVar.c());
            boolean z2 = this.f41847d;
            h.g.a.l lVar = this.f41848e;
            boolean zChanged = composer.changed(lVar) | composer.changed(qVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = (h.g.a.a) new ao(lVar, qVar, 0);
                composer.updateRememberedValue(objRememberedValue);
            }
            ap.H(qVar, iIntValue, z, zN, z2, (h.g.a.a) objRememberedValue, composer, i2 & 112);
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
