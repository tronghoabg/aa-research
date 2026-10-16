package androidx.constraintlayout.compose;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.MotionLayoutScope;
import androidx.constraintlayout.compose.carousel.FractionalThreshold;
import androidx.constraintlayout.compose.carousel.ThresholdConfig;
import com.waze.strings.DisplayStrings;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.a.r;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MotionCarouselKt {
    public static final void ItemHolder(final int i2, final String str, final boolean z, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i3) {
        int i4;
        int i5 = i3 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1902286410);
        if (i5 == 0) {
            i4 = (true != composerStartRestartGroup.changed(i2) ? 2 : 4) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(str) ? 16 : 32;
        }
        if ((i3 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changed(z) ? 128 : 256;
        }
        if ((i3 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if ((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1902286410, i4, -1, "androidx.constraintlayout.compose.ItemHolder (MotionCarousel.kt:251)");
            }
            Modifier modifierLayoutId$default = ConstraintLayoutTagKt.layoutId$default(Modifier.Companion, str + i2, null, 2, null);
            if (z) {
                modifierLayoutId$default = BorderKt.m1983borderxT4_qwU(ClipKt.clip(modifierLayoutId$default, RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(20.0f)), 2.0f, ColorKt.Color(0, 0, 0, 60), RoundedCornerShapeKt.m3086RoundedCornerShape0680j_4(20.0f));
            }
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierLayoutId$default);
            a<ComposeUiNode> constructor = ComposeUiNode.Companion.getConstructor();
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Updater.m7351setimpl(composerStartRestartGroup, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.getSetMeasurePolicy());
            Updater.m7351setimpl(composerStartRestartGroup, currentCompositionLocalMap, ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, ab> setCompositeKeyHash = ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (composerStartRestartGroup.getInserting() || !x.n(composerStartRestartGroup.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                Integer numValueOf = Integer.valueOf(currentCompositeKeyHash);
                composerStartRestartGroup.updateRememberedValue(numValueOf);
                composerStartRestartGroup.apply(numValueOf, setCompositeKeyHash);
            }
            Updater.m7351setimpl(composerStartRestartGroup, modifierMaterializeModifier, ComposeUiNode.Companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            pVar.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 9) & 14));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return MotionCarouselKt.ItemHolder$lambda$1(i2, str, z, pVar, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ItemHolder$lambda$1(int i2, String str, boolean z, p pVar, int i3, Composer composer, int i4) {
        ItemHolder(i2, str, z, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1));
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MotionCarousel(final androidx.constraintlayout.compose.MotionScene r38, final int r39, final int r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, boolean r44, final h.g.a.l<? super androidx.constraintlayout.compose.MotionCarouselScope, h.ab> r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionCarouselKt.MotionCarousel(androidx.constraintlayout.compose.MotionScene, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float MotionCarousel$lambda$1(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ThresholdConfig MotionCarousel$lambda$12$0(String str, String str2) {
        return new FractionalThreshold(0.3f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab MotionCarousel$lambda$13$0(MutableFloatState mutableFloatState, IntSize intSize) {
        mutableFloatState.setFloatValue(IntSize.m11339getWidthimpl(intSize.m11343unboximpl()));
        return ab.f48028a;
    }

    static final ab MotionCarousel$lambda$15(MotionScene motionScene, int i2, int i3, String str, String str2, String str3, boolean z, l lVar, int i4, int i5, Composer composer, int i6) {
        MotionCarousel(motionScene, i2, i3, str, str2, str3, z, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i4 | 1), i5);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CarouselState MotionCarousel$lambda$4(MutableState<CarouselState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MotionCarousel$lambda$7(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    public static final <T> void items(MotionCarouselScope motionCarouselScope, final List<? extends T> list, final q<? super T, ? super Composer, ? super Integer, ab> qVar) {
        motionCarouselScope.items(list.size(), ComposableLambdaKt.composableLambdaInstance(1960316425, true, new q<Integer, Composer, Integer, ab>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt.items.1
            public final void invoke(int i2, Composer composer, int i3) {
                if ((i3 & 6) == 0) {
                    i3 |= true != composer.changed(i2) ? 2 : 4;
                }
                if ((i3 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1960316425, i3, -1, "androidx.constraintlayout.compose.items.<anonymous> (MotionCarousel.kt:279)");
                }
                qVar.invoke(list.get(i2), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // h.g.a.q
            public /* bridge */ /* synthetic */ ab invoke(Integer num, Composer composer, Integer num2) {
                invoke(num.intValue(), composer, num2.intValue());
                return ab.f48028a;
            }
        }));
    }

    public static final <T> void itemsWithProperties(MotionCarouselScope motionCarouselScope, final List<? extends T> list, final r<? super T, ? super androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>, ? super Composer, ? super Integer, ab> rVar) {
        motionCarouselScope.itemsWithProperties(list.size(), ComposableLambdaKt.composableLambdaInstance(-1933855757, true, new r<Integer, androidx.compose.runtime.State<? extends MotionLayoutScope.MotionProperties>, Composer, Integer, ab>() { // from class: androidx.constraintlayout.compose.MotionCarouselKt.itemsWithProperties.1
            public final void invoke(int i2, androidx.compose.runtime.State<MotionLayoutScope.MotionProperties> state, Composer composer, int i3) {
                int i4;
                if ((i3 & 6) == 0) {
                    i4 = (true != composer.changed(i2) ? 2 : 4) | i3;
                } else {
                    i4 = i3;
                }
                if ((i3 & 48) == 0) {
                    i4 |= true != composer.changed(state) ? 16 : 32;
                }
                if ((i4 & 147) == 146 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1933855757, i4, -1, "androidx.constraintlayout.compose.itemsWithProperties.<anonymous> (MotionCarousel.kt:303)");
                }
                rVar.invoke(list.get(i2), state, composer, Integer.valueOf(i4 & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            @Override // h.g.a.r
            public /* bridge */ /* synthetic */ ab invoke(Integer num, androidx.compose.runtime.State<? extends MotionLayoutScope.MotionProperties> state, Composer composer, Integer num2) {
                invoke(num.intValue(), (androidx.compose.runtime.State<MotionLayoutScope.MotionProperties>) state, composer, num2.intValue());
                return ab.f48028a;
            }
        }));
    }

    private static final androidx.compose.runtime.State<MotionItemsProvider> rememberStateOfItemsProvider(l<? super MotionCarouselScope, ab> lVar, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507876322, i2, -1, "androidx.constraintlayout.compose.rememberStateOfItemsProvider (MotionCarousel.kt:308)");
        }
        final androidx.compose.runtime.State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, i2 & 14);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.Companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new a() { // from class: androidx.constraintlayout.compose.MotionCarouselKt$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return MotionCarouselKt.rememberStateOfItemsProvider$lambda$0$0(stateRememberUpdatedState);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        androidx.compose.runtime.State<MotionItemsProvider> state = (androidx.compose.runtime.State) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MotionCarouselScopeImpl rememberStateOfItemsProvider$lambda$0$0(androidx.compose.runtime.State state) {
        MotionCarouselScopeImpl motionCarouselScopeImpl = new MotionCarouselScopeImpl();
        ((l) state.getValue()).invoke(motionCarouselScopeImpl);
        return motionCarouselScopeImpl;
    }
}
