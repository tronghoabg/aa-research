package androidx.compose.foundation.text;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.foundation.contextmenu.ContextMenuAreaKt;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuStateKt;
import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.contextmenu.modifier.TextContextMenuGesturesModifierKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionStateKt;
import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Modifier;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.c.k;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CommonContextMenuAreaKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1, reason: invalid class name and case insensitive filesystem */
    final class C03051 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C03051(e<? super C03051> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonContextMenuAreaKt.getContextMenuItemsAvailability((TextFieldSelectionState) null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2, reason: invalid class name and case insensitive filesystem */
    final class C03062 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C03062(e<? super C03062> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonContextMenuAreaKt.getContextMenuItemsAvailability((TextFieldSelectionManager) null, this);
        }
    }

    public static final void CommonContextMenuArea(final TextFieldSelectionState textFieldSelectionState, final boolean z, final p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        Modifier.Companion companionShowTextContextMenuOnSecondaryClick;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1442752422);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changed(z) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1442752422, i3, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:75)");
            }
            if (ComposeFoundationFlags.isNewContextMenuEnabled) {
                composerStartRestartGroup.startReplaceGroup(-1299459355);
                if (z) {
                    composerStartRestartGroup.startReplaceGroup(-1299415211);
                    Modifier.Companion companion = Modifier.Companion;
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                    CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1 commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1RememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1RememberedValue == Composer.Companion.getEmpty()) {
                        commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1RememberedValue = new CommonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1(textFieldSelectionState, null);
                        composerStartRestartGroup.updateRememberedValue(commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1RememberedValue);
                    }
                    companionShowTextContextMenuOnSecondaryClick = TextContextMenuGesturesModifierKt.showTextContextMenuOnSecondaryClick(companion, (p) commonContextMenuAreaKt$CommonContextMenuArea$modifier$1$1RememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1298836224);
                    composerStartRestartGroup.endReplaceGroup();
                    companionShowTextContextMenuOnSecondaryClick = Modifier.Companion;
                }
                PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(companionShowTextContextMenuOnSecondaryClick, pVar, composerStartRestartGroup, (i3 >> 3) & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1298667367);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new ContextMenuState(null, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final af afVar = (af) objRememberedValue2;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m3349boximpl(MenuItemsAvailability.Companion.m3362getNoneJKCFgKw()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final MutableState mutableState = (MutableState) objRememberedValue3;
                MutableState mutableState2 = mutableState;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(afVar);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new p() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda5
                        @Override // h.g.a.p
                        public final Object invoke(Object obj, Object obj2) {
                            return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$8$0(afVar, (TextFieldSelectionState) obj, (TextContextMenuItems) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                l<ContextMenuScope, ab> lVarContextMenuBuilder = TextFieldSelectionStateKt.contextMenuBuilder(textFieldSelectionState, contextMenuState, mutableState2, (p) objRememberedValue4);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new a() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda6
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$9$0(contextMenuState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                a aVar = (a) objRememberedValue5;
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue6 == Composer.Companion.getEmpty()) {
                    objRememberedValue6 = new a() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda7
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$10$0(afVar, mutableState, textFieldSelectionState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                ContextMenuAreaKt.ContextMenuArea(contextMenuState, aVar, lVarContextMenuBuilder, null, z, (a) objRememberedValue6, pVar, composerStartRestartGroup, ((i3 << 9) & 57344) | 54 | ((i3 << 12) & 3670016), 8);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda8
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$11(textFieldSelectionState, z, pVar, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonContextMenuArea$lambda$10$0(af afVar, MutableState mutableState, TextFieldSelectionState textFieldSelectionState) {
        aj.z(afVar, null, ag.f51345d, new CommonContextMenuAreaKt$CommonContextMenuArea$5$1$1(mutableState, textFieldSelectionState, null), 1);
        return ab.f48028a;
    }

    static final ab CommonContextMenuArea$lambda$11(TextFieldSelectionState textFieldSelectionState, boolean z, p pVar, int i2, Composer composer, int i3) {
        CommonContextMenuArea(textFieldSelectionState, z, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonContextMenuArea$lambda$13$0(ContextMenuState contextMenuState) {
        ContextMenuStateKt.close(contextMenuState);
        return ab.f48028a;
    }

    static final ab CommonContextMenuArea$lambda$14(SelectionManager selectionManager, p pVar, int i2, Composer composer, int i3) {
        CommonContextMenuArea(selectionManager, (p<? super Composer, ? super Integer, ab>) pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonContextMenuArea$lambda$2$0(ContextMenuState contextMenuState) {
        ContextMenuStateKt.close(contextMenuState);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonContextMenuArea$lambda$3$0(af afVar, MutableState mutableState, TextFieldSelectionManager textFieldSelectionManager) {
        aj.z(afVar, null, ag.f51345d, new CommonContextMenuAreaKt$CommonContextMenuArea$2$1$1(mutableState, textFieldSelectionManager, null), 1);
        return ab.f48028a;
    }

    static final ab CommonContextMenuArea$lambda$4(TextFieldSelectionManager textFieldSelectionManager, p pVar, int i2, Composer composer, int i3) {
        CommonContextMenuArea(textFieldSelectionManager, (p<? super Composer, ? super Integer, ab>) pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonContextMenuArea$lambda$8$0(af afVar, TextFieldSelectionState textFieldSelectionState, TextContextMenuItems textContextMenuItems) {
        aj.z(afVar, null, ag.f51345d, new CommonContextMenuAreaKt$CommonContextMenuArea$menuBuilder$1$1$1(textContextMenuItems, textFieldSelectionState, null), 1);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab CommonContextMenuArea$lambda$9$0(ContextMenuState contextMenuState) {
        ContextMenuStateKt.close(contextMenuState);
        return ab.f48028a;
    }

    public static final void TextItem(ContextMenuScope contextMenuScope, ContextMenuState contextMenuState, TextContextMenuItems textContextMenuItems, boolean z, a<ab> aVar) {
        if (z) {
            ContextMenuScope.item$default(contextMenuScope, new AnonymousClass1(textContextMenuItems), null, false, null, new AnonymousClass2(aVar, contextMenuState), 14, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getContextMenuItemsAvailability(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4, h.c.e<? super androidx.compose.foundation.text.MenuItemsAvailability> r5) {
        /*
            boolean r0 = r5 instanceof androidx.compose.foundation.text.CommonContextMenuAreaKt.C03051
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 r0 = (androidx.compose.foundation.text.CommonContextMenuAreaKt.C03051) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1 r0 = new androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState) r4
            e.b.c.b(r5)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.updateClipboardEntry(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            boolean r5 = r4.canShowCopyMenuItem()
            boolean r0 = r4.canShowPasteMenuItem()
            boolean r1 = r4.canShowCutMenuItem()
            boolean r2 = r4.canShowSelectAllMenuItem()
            boolean r4 = r4.canShowAutofillMenuItem()
            int r4 = androidx.compose.foundation.text.MenuItemsAvailability.m3351constructorimpl(r5, r0, r1, r2, r4)
            androidx.compose.foundation.text.MenuItemsAvailability r4 = androidx.compose.foundation.text.MenuItemsAvailability.m3349boximpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CommonContextMenuAreaKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$2, reason: invalid class name */
    public final class AnonymousClass2 implements a<ab> {
        final /* synthetic */ a<ab> $operation;
        final /* synthetic */ ContextMenuState $state;

        public AnonymousClass2(a<ab> aVar, ContextMenuState contextMenuState) {
            this.$operation = aVar;
            this.$state = contextMenuState;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$operation.invoke();
            ContextMenuStateKt.close(this.$state);
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.CommonContextMenuAreaKt$TextItem$1, reason: invalid class name */
    public final class AnonymousClass1 implements p<Composer, Integer, String> {
        final /* synthetic */ TextContextMenuItems $label;

        public AnonymousClass1(TextContextMenuItems textContextMenuItems) {
            this.$label = textContextMenuItems;
        }

        public final String invoke(Composer composer, int i2) {
            composer.startReplaceGroup(-35972707);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-35972707, i2, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (CommonContextMenuArea.kt:190)");
            }
            String strResolvedString = this.$label.resolvedString(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return strResolvedString;
        }

        @Override // h.g.a.p
        public /* bridge */ /* synthetic */ String invoke(Composer composer, Integer num) {
            return invoke(composer, num.intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object getContextMenuItemsAvailability(androidx.compose.foundation.text.selection.TextFieldSelectionManager r4, h.c.e<? super androidx.compose.foundation.text.MenuItemsAvailability> r5) {
        /*
            boolean r0 = r5 instanceof androidx.compose.foundation.text.CommonContextMenuAreaKt.C03062
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 r0 = (androidx.compose.foundation.text.CommonContextMenuAreaKt.C03062) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 r0 = new androidx.compose.foundation.text.CommonContextMenuAreaKt$getContextMenuItemsAvailability$2
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.L$0
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r4 = (androidx.compose.foundation.text.selection.TextFieldSelectionManager) r4
            e.b.c.b(r5)
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            e.b.c.b(r5)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.updateClipboardEntry$foundation(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            boolean r5 = r4.canShowCopyMenuItem$foundation()
            boolean r0 = r4.canShowPasteMenuItem$foundation()
            boolean r1 = r4.canShowCutMenuItem$foundation()
            boolean r2 = r4.canShowSelectAllMenuItem$foundation()
            boolean r4 = r4.canShowAutofillMenuItem$foundation()
            int r4 = androidx.compose.foundation.text.MenuItemsAvailability.m3351constructorimpl(r5, r0, r1, r2, r4)
            androidx.compose.foundation.text.MenuItemsAvailability r4 = androidx.compose.foundation.text.MenuItemsAvailability.m3349boximpl(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CommonContextMenuAreaKt.getContextMenuItemsAvailability(androidx.compose.foundation.text.selection.TextFieldSelectionManager, h.c.e):java.lang.Object");
    }

    public static final void CommonContextMenuArea(final SelectionManager selectionManager, p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        final p<? super Composer, ? super Integer, ab> pVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(-614342087);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(selectionManager) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-614342087, i3, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:131)");
            }
            if (ComposeFoundationFlags.isNewContextMenuEnabled) {
                composerStartRestartGroup.startReplaceGroup(-1009319487);
                PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(selectionManager.getContextMenuAreaModifier(), pVar, composerStartRestartGroup, i3 & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
                pVar2 = pVar;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1009204043);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new ContextMenuState(null, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = new a() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda3
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$13$0(contextMenuState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                pVar2 = pVar;
                ContextMenuAreaKt.ContextMenuArea(contextMenuState, (a) objRememberedValue2, SelectionManagerKt.contextMenuBuilder(selectionManager, contextMenuState), null, false, null, pVar2, composerStartRestartGroup, ((i3 << 15) & 3670016) | 54, 56);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pVar2 = pVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda4
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$14(selectionManager, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CommonContextMenuArea(final TextFieldSelectionManager textFieldSelectionManager, p<? super Composer, ? super Integer, ab> pVar, Composer composer, final int i2) {
        int i3;
        final p<? super Composer, ? super Integer, ab> pVar2;
        int i4 = i2 & 6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1533506138);
        if (i4 == 0) {
            i3 = (true != composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != composerStartRestartGroup.changedInstance(pVar) ? 16 : 32;
        }
        if (composerStartRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1533506138, i3, -1, "androidx.compose.foundation.text.CommonContextMenuArea (CommonContextMenuArea.kt:46)");
            }
            if (ComposeFoundationFlags.isNewContextMenuEnabled) {
                composerStartRestartGroup.startReplaceGroup(-885604480);
                PlatformDefaultTextContextMenuProviders_androidKt.ProvideDefaultPlatformTextContextMenuProviders(textFieldSelectionManager.getContextMenuAreaModifier(), pVar, composerStartRestartGroup, i3 & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
                pVar2 = pVar;
            } else {
                composerStartRestartGroup.startReplaceGroup(-885475365);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.Companion.getEmpty()) {
                    objRememberedValue = new ContextMenuState(null, 1, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final ContextMenuState contextMenuState = (ContextMenuState) objRememberedValue;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.Companion.getEmpty()) {
                    objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(k.f48060a, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final af afVar = (af) objRememberedValue2;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == Composer.Companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MenuItemsAvailability.m3349boximpl(MenuItemsAvailability.Companion.m3362getNoneJKCFgKw()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                final MutableState mutableState = (MutableState) objRememberedValue3;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == Composer.Companion.getEmpty()) {
                    objRememberedValue4 = new a() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda0
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$2$0(contextMenuState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                a aVar = (a) objRememberedValue4;
                l<ContextMenuScope, ab> lVarContextMenuBuilder = TextFieldSelectionManagerKt.contextMenuBuilder(textFieldSelectionManager, contextMenuState, mutableState);
                boolean enabled = textFieldSelectionManager.getEnabled();
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(afVar) | composerStartRestartGroup.changedInstance(textFieldSelectionManager);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == Composer.Companion.getEmpty()) {
                    objRememberedValue5 = new a() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda1
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$3$0(afVar, mutableState, textFieldSelectionManager);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                pVar2 = pVar;
                ContextMenuAreaKt.ContextMenuArea(contextMenuState, aVar, lVarContextMenuBuilder, null, enabled, (a) objRememberedValue5, pVar2, composerStartRestartGroup, ((i3 << 15) & 3670016) | 54, 8);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pVar2 = pVar;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.text.CommonContextMenuAreaKt$$ExternalSyntheticLambda2
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return CommonContextMenuAreaKt.CommonContextMenuArea$lambda$4(textFieldSelectionManager, pVar2, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
