package com.waze.z.a.a;

import androidx.compose.material.RadioButtonColors;
import androidx.compose.material.RadioButtonDefaults;
import androidx.compose.material.RadioButtonKt;
import androidx.compose.material.SwitchDefaults;
import androidx.compose.material.SwitchKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.p;
import h.g.b.aq;
import h.g.b.x;
import kotlinx.coroutines.w;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class g implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f45606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45607b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f45608c;

    public /* synthetic */ g(aq aqVar, boolean z, int i2) {
        this.f45608c = i2;
        this.f45607b = aqVar;
        this.f45606a = z;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f45608c;
        if (i2 == 0) {
            Composer composer = (Composer) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (composer.shouldExecute((iIntValue & 3) != 2, iIntValue & 1)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1413898492, iIntValue, -1, "com.waze.design_components_compose.components.action_cell.ActionCellSwitch.<anonymous> (ActionCell.kt:287)");
                }
                SwitchKt.Switch(this.f45606a, this.f45607b, com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.z, null), false, null, com.waze.ui.r.a.d.d.d(SwitchDefaults.INSTANCE, composer, SwitchDefaults.$stable), composer, 384, 24);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composer.skipToGroupEnd();
            }
            return ab.f48028a;
        }
        if (i2 != 1) {
            h.c.j jVar = (h.c.j) obj;
            h.c.h hVar = (h.c.h) obj2;
            if (!(hVar instanceof w)) {
                return jVar.plus(hVar);
            }
            aq aqVar = (aq) this.f45607b;
            if (((h.c.j) aqVar.f48105a).get(hVar.getKey()) == null) {
                return jVar.plus(this.f45606a ? ((w) hVar).a() : (w) hVar);
            }
            aqVar.f48105a = ((h.c.j) aqVar.f48105a).minusKey(hVar.getKey());
            return jVar.plus(((w) hVar).b());
        }
        Composer composer2 = (Composer) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        if (composer2.shouldExecute((iIntValue2 & 3) != 2, iIntValue2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2017489402, iIntValue2, -1, "com.waze.design_components_compose.components.action_cell.ActionCellRadio.<anonymous> (ActionCell.kt:345)");
            }
            Modifier modifierA = com.waze.ui.r.a.d.d.a(Modifier.Companion, com.waze.ui.r.a.d.c.B, null);
            RadioButtonDefaults radioButtonDefaults = RadioButtonDefaults.INSTANCE;
            int i3 = RadioButtonDefaults.$stable;
            x.f(radioButtonDefaults, "<this>");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1979449220, i3, -1, "com.waze.ui.mobile.infra.theme.colors.wazeColors (WazeComponentColors.kt:33)");
            }
            RadioButtonColors radioButtonColorsM4164colorsRGew2ao = radioButtonDefaults.m4164colorsRGew2ao(com.waze.bz.a.d(composer2, 6).G(), com.waze.bz.a.d(composer2, 6).z(), com.waze.bz.a.d(composer2, 6).s(), composer2, ((i3 << 9) & 7168) | (RadioButtonDefaults.$stable << 9), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            RadioButtonKt.RadioButton(this.f45606a, this.f45607b, modifierA, false, null, radioButtonColorsM4164colorsRGew2ao, composer2, 384, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    public /* synthetic */ g(boolean z, Object obj, int i2) {
        this.f45608c = i2;
        this.f45606a = z;
        this.f45607b = obj;
    }
}
