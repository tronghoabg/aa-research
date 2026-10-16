package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.text.ClipboardEventsHandler_jvmAndAndroidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.waze.strings.DisplayStrings;
import h.a.i;
import h.ab;
import h.c.e;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SelectionContainerKt {
    public static final void DisableSelection(final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162635549);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(pVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162635549, i3, -1, "androidx.compose.foundation.text.selection.DisableSelection (SelectionContainer.kt:73)");
            }
            CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(null), pVar, composerStartRestartGroup, ((i3 << 3) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda0
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionContainerKt.DisableSelection$lambda$0(pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab DisableSelection$lambda$0(p pVar, int i2, Composer composer, int i3) {
        DisableSelection(pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    public static final void SelectionContainer(Modifier modifier, final Selection selection, final l<? super Selection, ab> lVar, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2, final int i3) {
        int i4;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-917932944);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(selection) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if ((i2 & DisplayStrings.DS_AAOS_ETA_BAR_TOLL_PRICE_PS) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 1024 : 2048;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & DisplayStrings.DS_DONT_SHOW_AGAIN) != 1170, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-917932944, i4, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:93)");
            }
            Object[] objArr = new Object[0];
            Saver<SelectionRegistrarImpl, Long> saver = SelectionRegistrarImpl.Companion.getSaver();
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new a() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return SelectionContainerKt.SelectionContainer$lambda$5$0();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SelectionRegistrarImpl selectionRegistrarImpl = (SelectionRegistrarImpl) RememberSaveableKt.m7615rememberSaveable(objArr, (Saver) saver, (a) objRememberedValue, composerStartRestartGroup, 384);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new SelectionManager(selectionRegistrarImpl);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SelectionManager selectionManager = (SelectionManager) objRememberedValue2;
            final Clipboard clipboard = (Clipboard) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalClipboard());
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final af afVar = (af) objRememberedValue3;
            selectionManager.setHapticFeedBack((HapticFeedback) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalHapticFeedback()));
            boolean zChanged = composerStartRestartGroup.changed(afVar) | composerStartRestartGroup.changed(clipboard);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.Companion.getEmpty()) {
                objRememberedValue4 = new l() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda2
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SelectionContainerKt.SelectionContainer$lambda$7$0(afVar, clipboard, (AnnotatedString) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            selectionManager.setOnCopyHandler((l) objRememberedValue4);
            selectionManager.setTextToolbar((TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar()));
            selectionManager.setOnSelectionChange(lVar);
            selectionManager.setSelection(selection);
            if (ComposeFoundationFlags.isSmartSelectionEnabled) {
                composerStartRestartGroup.startReplaceGroup(-82280708);
                selectionManager.setPlatformSelectionBehaviors$foundation(PlatformSelectionBehaviors_androidKt.rememberPlatformSelectionBehaviors(SelectedTextType.StaticText, null, composerStartRestartGroup, 54));
                selectionManager.setCoroutineScope$foundation(afVar);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-82105806);
                composerStartRestartGroup.endReplaceGroup();
            }
            selectionManager.isNonEmptySelection$foundation();
            ClipboardEventsHandler_jvmAndAndroidKt.AnonymousClass1 anonymousClass1 = ClipboardEventsHandler_jvmAndAndroidKt.AnonymousClass1.INSTANCE;
            ClipboardEventsHandler_jvmAndAndroidKt.AnonymousClass3 anonymousClass3 = ClipboardEventsHandler_jvmAndAndroidKt.AnonymousClass3.INSTANCE;
            selectionManager.setShouldIgnoreCopyKeyEvent$foundation(false);
            SimpleLayoutKt.SimpleLayout(modifier.then(selectionManager.getModifier()), ComposableLambdaKt.rememberComposableLambda(-1799563674, true, new p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionContainerKt.SelectionContainer$lambda$9(selectionManager, selectionRegistrarImpl, pVar, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48, 0);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(selectionManager);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
                objRememberedValue5 = new l() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda5
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SelectionContainerKt.SelectionContainer$lambda$10$0(selectionManager, (DisposableEffectScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.DisposableEffect(selectionManager, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda6
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionContainerKt.SelectionContainer$lambda$11(modifier2, selection, lVar, pVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final Selection SelectionContainer$lambda$1(MutableState<Selection> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SelectionContainer$lambda$10$0(final SelectionManager selectionManager, DisposableEffectScope disposableEffectScope) {
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$lambda$10$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                selectionManager.onRelease();
                selectionManager.setHasFocus(false);
            }
        };
    }

    static final ab SelectionContainer$lambda$11(Modifier modifier, Selection selection, l lVar, p pVar, int i2, int i3, Composer composer, int i4) {
        SelectionContainer(modifier, selection, lVar, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SelectionContainer$lambda$3$0(MutableState mutableState, Selection selection) {
        mutableState.setValue(selection);
        return ab.f48028a;
    }

    static final ab SelectionContainer$lambda$4(Modifier modifier, p pVar, int i2, int i3, Composer composer, int i4) {
        SelectionContainer(modifier, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionRegistrarImpl SelectionContainer$lambda$5$0() {
        return new SelectionRegistrarImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SelectionContainer$lambda$7$0(af afVar, Clipboard clipboard, AnnotatedString annotatedString) {
        aj.z(afVar, null, ag.f51345d, new SelectionContainerKt$SelectionContainer$3$1$1(clipboard, annotatedString, null), 1);
        return ab.f48028a;
    }

    static final ab SelectionContainer$lambda$9(final SelectionManager selectionManager, final SelectionRegistrarImpl selectionRegistrarImpl, final p pVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1799563674, i2, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous> (SelectionContainer.kt:136)");
            }
            ContextMenu_androidKt.ContextMenuArea(selectionManager, ComposableLambdaKt.rememberComposableLambda(-284825865, true, new p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda9
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionContainerKt.SelectionContainer$lambda$9$0(selectionRegistrarImpl, pVar, selectionManager, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SelectionContainer$lambda$9$0(SelectionRegistrarImpl selectionRegistrarImpl, final p pVar, final SelectionManager selectionManager, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-284825865, i2, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous> (SelectionContainer.kt:137)");
            }
            CompositionLocalKt.CompositionLocalProvider(SelectionRegistrarKt.getLocalSelectionRegistrar().provides(selectionRegistrarImpl), ComposableLambdaKt.rememberComposableLambda(610483127, true, new p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda12
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionContainerKt.SelectionContainer$lambda$9$0$0(pVar, selectionManager, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab SelectionContainer$lambda$9$0$0(p pVar, final SelectionManager selectionManager, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(610483127, i2, -1, "androidx.compose.foundation.text.selection.SelectionContainer.<anonymous>.<anonymous>.<anonymous> (SelectionContainer.kt:138)");
            }
            pVar.invoke(composer, 0);
            if (selectionManager.isInTouchMode() && selectionManager.getHasFocus() && !selectionManager.isTriviallyCollapsedSelection$foundation()) {
                composer.startReplaceGroup(-1736224054);
                Selection selection = selectionManager.getSelection();
                if (selection == null) {
                    composer.startReplaceGroup(2011629175);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(2011629176);
                    composer.startReplaceGroup(-1736222526);
                    List listI = i.i(true, false);
                    int size = listI.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        boolean zBooleanValue = ((Boolean) listI.get(i3)).booleanValue();
                        boolean zChanged = composer.changed(zBooleanValue);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                            objRememberedValue = selectionManager.handleDragObserver(zBooleanValue);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        final TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
                        boolean zChanged2 = composer.changed(zBooleanValue);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.Companion.getEmpty()) {
                            objRememberedValue2 = zBooleanValue ? new a() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda10
                                @Override // h.g.a.a
                                public final Object invoke() {
                                    return SelectionContainerKt.SelectionContainer$lambda$9$0$0$0$0$1$0(selectionManager);
                                }
                            } : new a() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda11
                                @Override // h.g.a.a
                                public final Object invoke() {
                                    return SelectionContainerKt.SelectionContainer$lambda$9$0$0$0$0$1$1(selectionManager);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        a aVar = (a) objRememberedValue2;
                        ResolvedTextDirection direction = zBooleanValue ? selection.getStart().getDirection() : selection.getEnd().getDirection();
                        float startHandleLineHeight = zBooleanValue ? selectionManager.getStartHandleLineHeight() : selectionManager.getEndHandleLineHeight();
                        SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0 = new SelectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0(aVar);
                        boolean handlesCrossed = selection.getHandlesCrossed();
                        Modifier.Companion companion = Modifier.Companion;
                        boolean zChangedInstance = composer.changedInstance(textDragObserver);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.Companion.getEmpty()) {
                            objRememberedValue3 = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$5$1$1$1$1$1$1
                                @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                                public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                                    Object objDetectDownAndDragGesturesWithObserver = LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, eVar);
                                    return objDetectDownAndDragGesturesWithObserver == h.c.a.a.f48038a ? objDetectDownAndDragGesturesWithObserver : ab.f48028a;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        AndroidSelectionHandles_androidKt.m3840SelectionHandlewLIcFTc(selectionContainerKt$sam$androidx_compose_foundation_text_selection_OffsetProvider$0, zBooleanValue, direction, handlesCrossed, 0L, startHandleLineHeight, SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (PointerInputEventHandler) objRememberedValue3), composer, 0, 16);
                    }
                    composer.endReplaceGroup();
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(2013602667);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset SelectionContainer$lambda$9$0$0$0$0$1$0(SelectionManager selectionManager) {
        Offset offsetM3891getStartHandlePosition_m7T9E = selectionManager.m3891getStartHandlePosition_m7T9E();
        return Offset.m7969boximpl(offsetM3891getStartHandlePosition_m7T9E != null ? offsetM3891getStartHandlePosition_m7T9E.m7990unboximpl() : Offset.Companion.m7995getUnspecifiedF1C5BW0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset SelectionContainer$lambda$9$0$0$0$0$1$1(SelectionManager selectionManager) {
        Offset offsetM3890getEndHandlePosition_m7T9E = selectionManager.m3890getEndHandlePosition_m7T9E();
        return Offset.m7969boximpl(offsetM3890getEndHandlePosition_m7T9E != null ? offsetM3890getEndHandlePosition_m7T9E.m7990unboximpl() : Offset.Companion.m7995getUnspecifiedF1C5BW0());
    }

    public static final void SelectionContainer(final Modifier modifier, p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2, final int i3) {
        int i4;
        final p<? super Composer, ? super Integer, ab> pVar2;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1949207773);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 19) != 18, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949207773, i4, -1, "androidx.compose.foundation.text.selection.SelectionContainer (SelectionContainer.kt:56)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            int i6 = i4;
            Selection selectionSelectionContainer$lambda$1 = SelectionContainer$lambda$1(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                objRememberedValue2 = new l() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda7
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return SelectionContainerKt.SelectionContainer$lambda$3$0(mutableState, (Selection) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            pVar2 = pVar;
            SelectionContainer(modifier2, selectionSelectionContainer$lambda$1, (l) objRememberedValue2, pVar2, composerStartRestartGroup, (i6 & 14) | 384 | ((i6 << 6) & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            pVar2 = pVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.selection.SelectionContainerKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return SelectionContainerKt.SelectionContainer$lambda$4(modifier, pVar2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
