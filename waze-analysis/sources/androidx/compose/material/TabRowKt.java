package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.k;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.ao;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = 90.0f;
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:120:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4246ScrollableTabRowsKfQg0A(final int r24, androidx.compose.ui.Modifier r25, long r26, long r28, float r30, h.g.a.q<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r32, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.m4246ScrollableTabRowsKfQg0A(int, androidx.compose.ui.Modifier, long, long, float, h.g.a.q, h.g.a.p, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ScrollableTabRow_sKfQg0A$lambda$0(int i2, List list, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-233732148, i3, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:232)");
        }
        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
        tabRowDefaults.m4239Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.Companion, (TabPosition) list.get(i2)), 0.0f, 0L, composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab ScrollableTabRow_sKfQg0A$lambda$1(final float f2, final p pVar, final p pVar2, final q qVar, final int i2, Composer composer, int i3) {
        if (composer.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1575164555, i3, -1, "androidx.compose.material.ScrollableTabRow.<anonymous> (TabRow.kt:238)");
            }
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = EffectsKt.createCompositionCoroutineScope(k.f48060a, composer);
                composer.updateRememberedValue(objRememberedValue);
            }
            af afVar = (af) objRememberedValue;
            boolean zChanged = composer.changed(scrollStateRememberScrollState) | composer.changed(afVar);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new ScrollableTabData(scrollStateRememberScrollState, afVar);
                composer.updateRememberedValue(objRememberedValue2);
            }
            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Alignment.Companion.getCenterStart(), false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null)));
            boolean zChanged2 = composer.changed(f2) | composer.changed(pVar) | composer.changed(pVar2) | composer.changed(qVar) | composer.changedInstance(scrollableTabData) | composer.changed(i2);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == Composer.Companion.getEmpty()) {
                Object obj = new p() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda6
                    @Override // h.g.a.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return TabRowKt.ScrollableTabRow_sKfQg0A$lambda$1$1$0(f2, pVar, pVar2, scrollableTabData, i2, qVar, (SubcomposeMeasureScope) obj2, (Constraints) obj3);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (p) objRememberedValue3, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult ScrollableTabRow_sKfQg0A$lambda$1$1$0(float f2, p pVar, final p pVar2, final ScrollableTabData scrollableTabData, final int i2, final q qVar, final SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        int i3 = subcomposeMeasureScope.mo2121roundToPx0680j_4(ScrollableTabRowMinimumTabWidth);
        final int i4 = subcomposeMeasureScope.mo2121roundToPx0680j_4(f2);
        long jM11097copyZbe2FdA$default = Constraints.m11097copyZbe2FdA$default(constraints.m11113unboximpl(), i3, 0, 0, 0, 14, null);
        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, pVar);
        ArrayList arrayList = new ArrayList(listSubcompose.size());
        int size = listSubcompose.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(listSubcompose.get(i5).mo9741measureBRTryo0(jM11097copyZbe2FdA$default));
        }
        final ArrayList arrayList2 = arrayList;
        final ao aoVar = new ao();
        aoVar.f48103a = i4 + i4;
        final ao aoVar2 = new ao();
        int size2 = arrayList2.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Placeable placeable = (Placeable) arrayList2.get(i6);
            aoVar.f48103a += placeable.getWidth();
            aoVar2.f48103a = Math.max(aoVar2.f48103a, placeable.getHeight());
        }
        return MeasureScope.CC.layout$default(subcomposeMeasureScope, aoVar.f48103a, aoVar2.f48103a, null, new l() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TabRowKt.ScrollableTabRow_sKfQg0A$lambda$1$1$0$2(i4, arrayList2, subcomposeMeasureScope, pVar2, scrollableTabData, i2, constraints, aoVar, aoVar2, qVar, (Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ScrollableTabRow_sKfQg0A$lambda$1$1$0$2(int i2, List list, SubcomposeMeasureScope subcomposeMeasureScope, p pVar, ScrollableTabData scrollableTabData, int i3, Constraints constraints, ao aoVar, ao aoVar2, final q qVar, Placeable.PlacementScope placementScope) {
        final ArrayList arrayList = new ArrayList();
        int size = list.size();
        int width = i2;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
            arrayList.add(new TabPosition(subcomposeMeasureScope.mo2124toDpu2uoSUM(width), subcomposeMeasureScope.mo2124toDpu2uoSUM(placeable.getWidth()), null));
            width += placeable.getWidth();
        }
        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Divider, pVar);
        int size2 = listSubcompose.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Measurable measurable = listSubcompose.get(i5);
            long jM11113unboximpl = constraints.m11113unboximpl();
            int i6 = aoVar.f48103a;
            Placeable placeableMo9741measureBRTryo0 = measurable.mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(jM11113unboximpl, i6, i6, 0, 0, 8, null));
            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo9741measureBRTryo0, 0, aoVar2.f48103a - placeableMo9741measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-43203918, true, new p() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda11
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return TabRowKt.ScrollableTabRow_sKfQg0A$lambda$1$1$0$2$2(qVar, arrayList, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        int size3 = listSubcompose2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose2.get(i7).mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(aoVar.f48103a, aoVar2.f48103a)), 0, 0, 0.0f, 4, null);
        }
        scrollableTabData.onLaidOut(subcomposeMeasureScope, i2, arrayList, i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ScrollableTabRow_sKfQg0A$lambda$1$1$0$2$2(q qVar, List list, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-43203918, i2, -1, "androidx.compose.material.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:292)");
            }
            qVar.invoke(list, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ScrollableTabRow_sKfQg0A$lambda$2(int i2, Modifier modifier, long j2, long j3, float f2, q qVar, p pVar, p pVar2, int i3, int i4, Composer composer, int i5) {
        m4246ScrollableTabRowsKfQg0A(i2, modifier, j2, j3, f2, qVar, pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4247TabRowpAZo6Ak(final int r23, androidx.compose.ui.Modifier r24, long r25, long r27, h.g.a.q<? super java.util.List<androidx.compose.material.TabPosition>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, final h.g.a.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowKt.m4247TabRowpAZo6Ak(int, androidx.compose.ui.Modifier, long, long, h.g.a.q, h.g.a.p, h.g.a.p, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab TabRow_pAZo6Ak$lambda$0(int i2, List list, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896966245, i3, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:141)");
        }
        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
        tabRowDefaults.m4239Indicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.Companion, (TabPosition) list.get(i2)), 0.0f, 0L, composer, DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return ab.f48028a;
    }

    static final ab TabRow_pAZo6Ak$lambda$1(final p pVar, final p pVar2, final q qVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-638448612, i2, -1, "androidx.compose.material.TabRow.<anonymous> (TabRow.kt:151)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null);
            boolean zChanged = composer.changed(pVar) | composer.changed(pVar2) | composer.changed(qVar);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new p() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda3
                    @Override // h.g.a.p
                    public final Object invoke(Object obj, Object obj2) {
                        return TabRowKt.TabRow_pAZo6Ak$lambda$1$0$0(pVar, pVar2, qVar, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (p) objRememberedValue, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult TabRow_pAZo6Ak$lambda$1$0$0(p pVar, final p pVar2, final q qVar, final SubcomposeMeasureScope subcomposeMeasureScope, final Constraints constraints) {
        int i2;
        Object obj;
        final int iM11107getMaxWidthimpl = Constraints.m11107getMaxWidthimpl(constraints.m11113unboximpl());
        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, pVar);
        int size = listSubcompose.size();
        int i3 = iM11107getMaxWidthimpl / size;
        ArrayList arrayList = new ArrayList(listSubcompose.size());
        int size2 = listSubcompose.size();
        int i4 = 0;
        while (i4 < size2) {
            int i5 = i3;
            arrayList.add(listSubcompose.get(i4).mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(constraints.m11113unboximpl(), i5, i5, 0, 0, 12, null)));
            i4++;
            i3 = i5;
            listSubcompose = listSubcompose;
        }
        final int i6 = i3;
        final ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            obj = null;
            i2 = 0;
        } else {
            i2 = 0;
            obj = arrayList2.get(0);
            int height = ((Placeable) obj).getHeight();
            int iE = i.e(arrayList2);
            if (iE > 0) {
                int i7 = 1;
                while (true) {
                    Object obj2 = arrayList2.get(i7);
                    int height2 = ((Placeable) obj2).getHeight();
                    int i8 = height < height2 ? height2 : height;
                    if (height < height2) {
                        obj = obj2;
                    }
                    if (i7 == iE) {
                        break;
                    }
                    i7++;
                    height = i8;
                }
            }
        }
        Placeable placeable = (Placeable) obj;
        int height3 = placeable != null ? placeable.getHeight() : i2;
        ArrayList arrayList3 = new ArrayList(size);
        for (int i9 = i2; i9 < size; i9++) {
            arrayList3.add(new TabPosition(subcomposeMeasureScope.mo2124toDpu2uoSUM(i6) * i9, subcomposeMeasureScope.mo2124toDpu2uoSUM(i6), null));
        }
        final ArrayList arrayList4 = arrayList3;
        final int i10 = height3;
        return MeasureScope.CC.layout$default(subcomposeMeasureScope, iM11107getMaxWidthimpl, i10, null, new l() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda4
            @Override // h.g.a.l
            public final Object invoke(Object obj3) {
                return TabRowKt.TabRow_pAZo6Ak$lambda$1$0$0$3(arrayList2, subcomposeMeasureScope, pVar2, i6, constraints, i10, qVar, arrayList4, iM11107getMaxWidthimpl, (Placeable.PlacementScope) obj3);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TabRow_pAZo6Ak$lambda$1$0$0$3(List list, SubcomposeMeasureScope subcomposeMeasureScope, p pVar, int i2, Constraints constraints, int i3, final q qVar, final List list2, int i4, Placeable.PlacementScope placementScope) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, (Placeable) list.get(i5), i5 * i2, 0, 0.0f, 4, null);
        }
        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Divider, pVar);
        int size2 = listSubcompose.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Placeable placeableMo9741measureBRTryo0 = listSubcompose.get(i6).mo9741measureBRTryo0(Constraints.m11097copyZbe2FdA$default(constraints.m11113unboximpl(), 0, 0, 0, 0, 11, null));
            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo9741measureBRTryo0, 0, i3 - placeableMo9741measureBRTryo0.getHeight(), 0.0f, 4, null);
        }
        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Indicator, ComposableLambdaKt.composableLambdaInstance(-220665376, true, new p() { // from class: androidx.compose.material.TabRowKt$$ExternalSyntheticLambda5
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return TabRowKt.TabRow_pAZo6Ak$lambda$1$0$0$3$2(qVar, list2, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        int size3 = listSubcompose2.size();
        for (int i7 = 0; i7 < size3; i7++) {
            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose2.get(i7).mo9741measureBRTryo0(Constraints.Companion.m11117fixedJhjzzOo(i4, i3)), 0, 0, 0.0f, 4, null);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab TabRow_pAZo6Ak$lambda$1$0$0$3$2(q qVar, List list, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-220665376, i2, -1, "androidx.compose.material.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:176)");
            }
            qVar.invoke(list, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab TabRow_pAZo6Ak$lambda$2(int i2, Modifier modifier, long j2, long j3, q qVar, p pVar, p pVar2, int i3, int i4, Composer composer, int i5) {
        m4247TabRowpAZo6Ak(i2, modifier, j2, j3, qVar, pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return ab.f48028a;
    }
}
