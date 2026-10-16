package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContextMenuUiKt {
    private static final float DisabledAlpha = 0.38f;
    private static final PopupProperties DefaultPopupProperties = new PopupProperties(true, false, false, false, false, 30, (o) null);
    private static final ContextMenuColors DefaultContextMenuColors = new ContextMenuColors(Color.Companion.m8265getWhite0d7_KjU(), Color.Companion.m8254getBlack0d7_KjU(), Color.Companion.m8254getBlack0d7_KjU(), Color.m8227copywmQWz5c$default(Color.Companion.m8254getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m8227copywmQWz5c$default(Color.Companion.m8254getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuColumn(final androidx.compose.foundation.contextmenu.ContextMenuColors r28, androidx.compose.ui.Modifier r29, final h.g.a.q<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUiKt.ContextMenuColumn(androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ContextMenuColumn$lambda$0(ContextMenuColors contextMenuColors, Modifier modifier, q qVar, int i2, int i3, Composer composer, int i4) {
        ContextMenuColumn(contextMenuColors, modifier, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final void ContextMenuColumnBuilder(Modifier modifier, ContextMenuColors contextMenuColors, final l<? super ContextMenuScope, ab> lVar, Composer composer, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        final ContextMenuColors contextMenuColors2;
        int i5 = i3 & 1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-625529233);
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (true != composerStartRestartGroup.changed(modifier) ? 2 : 4) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= true != composerStartRestartGroup.changed(contextMenuColors) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i4 |= true != composerStartRestartGroup.changedInstance(lVar) ? 128 : 256;
        }
        if (composerStartRestartGroup.shouldExecute((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier3 = modifier;
            if (i6 != 0) {
                contextMenuColors = DefaultContextMenuColors;
            }
            final ContextMenuColors contextMenuColors3 = contextMenuColors;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-625529233, i4, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder (ContextMenuUi.kt:132)");
            }
            ContextMenuColumn(contextMenuColors3, modifier3, ComposableLambdaKt.rememberComposableLambda(-250345048, true, new q() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUiKt$$ExternalSyntheticLambda2
                @Override // h.g.a.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ContextMenuUiKt.ContextMenuColumnBuilder$lambda$0(lVar, contextMenuColors3, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 384 | ((i4 << 3) & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            contextMenuColors2 = contextMenuColors3;
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            contextMenuColors2 = contextMenuColors;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new p() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUiKt$$ExternalSyntheticLambda3
                @Override // h.g.a.p
                public final Object invoke(Object obj, Object obj2) {
                    return ContextMenuUiKt.ContextMenuColumnBuilder$lambda$1(modifier2, contextMenuColors2, lVar, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final ab ContextMenuColumnBuilder$lambda$0(l lVar, ContextMenuColors contextMenuColors, ColumnScope columnScope, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 17) != 16, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-250345048, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuColumnBuilder.<anonymous> (ContextMenuUi.kt:134)");
            }
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new ContextMenuScope(ComposableSingletons$ContextMenuUiKt.INSTANCE.m2088getLambda$1571120048$foundation());
                composer.updateRememberedValue(objRememberedValue);
            }
            ContextMenuScope contextMenuScope = (ContextMenuScope) objRememberedValue;
            contextMenuScope.clear$foundation();
            lVar.invoke(contextMenuScope);
            contextMenuScope.Content$foundation(contextMenuColors, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ContextMenuColumnBuilder$lambda$1(Modifier modifier, ContextMenuColors contextMenuColors, l lVar, int i2, int i3, Composer composer, int i4) {
        ContextMenuColumnBuilder(modifier, contextMenuColors, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuItem(final java.lang.String r24, final boolean r25, final androidx.compose.foundation.contextmenu.ContextMenuColors r26, androidx.compose.ui.Modifier r27, h.g.a.q<? super androidx.compose.ui.graphics.Color, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r28, final h.g.a.a<h.ab> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUiKt.ContextMenuItem(java.lang.String, boolean, androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, h.g.a.q, h.g.a.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ContextMenuItem$lambda$0$0(boolean z, a aVar) {
        if (z) {
            aVar.invoke();
        }
        return ab.f48028a;
    }

    static final ab ContextMenuItem$lambda$2(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, q qVar, a aVar, int i2, int i3, Composer composer, int i4) {
        ContextMenuItem(str, z, contextMenuColors, modifier, qVar, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuPopup(final androidx.compose.ui.window.PopupPositionProvider r14, final h.g.a.a<h.ab> r15, androidx.compose.ui.Modifier r16, final androidx.compose.foundation.contextmenu.ContextMenuColors r17, final h.g.a.l<? super androidx.compose.foundation.contextmenu.ContextMenuScope, h.ab> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUiKt.ContextMenuPopup(androidx.compose.ui.window.PopupPositionProvider, h.g.a.a, androidx.compose.ui.Modifier, androidx.compose.foundation.contextmenu.ContextMenuColors, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }

    static final ab ContextMenuPopup$lambda$0(PopupPositionProvider popupPositionProvider, a aVar, Modifier modifier, l lVar, int i2, int i3, Composer composer, int i4) {
        ContextMenuPopup(popupPositionProvider, aVar, modifier, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    static final ab ContextMenuPopup$lambda$1(Modifier modifier, ContextMenuColors contextMenuColors, l lVar, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271367778, i2, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup.<anonymous> (ContextMenuUi.kt:123)");
            }
            ContextMenuColumnBuilder(modifier, contextMenuColors, lVar, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return ab.f48028a;
    }

    static final ab ContextMenuPopup$lambda$2(PopupPositionProvider popupPositionProvider, a aVar, Modifier modifier, ContextMenuColors contextMenuColors, l lVar, int i2, int i3, Composer composer, int i4) {
        ContextMenuPopup(popupPositionProvider, aVar, modifier, contextMenuColors, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    public static final ContextMenuColors getDefaultContextMenuColors() {
        return DefaultContextMenuColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuPopup(final androidx.compose.ui.window.PopupPositionProvider r14, final h.g.a.a<h.ab> r15, androidx.compose.ui.Modifier r16, final h.g.a.l<? super androidx.compose.foundation.contextmenu.ContextMenuScope, h.ab> r17, androidx.compose.runtime.Composer r18, final int r19, final int r20) {
        /*
            r5 = r19
            r0 = r5 & 6
            r1 = 307841774(0x12594aee, float:6.8565485E-28)
            r2 = r18
            androidx.compose.runtime.Composer r11 = r2.startRestartGroup(r1)
            r2 = 1
            if (r0 != 0) goto L1b
            boolean r0 = r11.changed(r14)
            if (r2 == r0) goto L18
            r0 = 2
            goto L19
        L18:
            r0 = 4
        L19:
            r0 = r0 | r5
            goto L1c
        L1b:
            r0 = r5
        L1c:
            r3 = r5 & 48
            if (r3 != 0) goto L2c
            boolean r3 = r11.changedInstance(r15)
            if (r2 == r3) goto L29
            r3 = 16
            goto L2b
        L29:
            r3 = 32
        L2b:
            r0 = r0 | r3
        L2c:
            r3 = r20 & 4
            if (r3 == 0) goto L33
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L46
        L33:
            r4 = r5 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L46
            r4 = r16
            boolean r6 = r11.changed(r4)
            if (r2 == r6) goto L42
            r6 = 128(0x80, float:1.8E-43)
            goto L44
        L42:
            r6 = 256(0x100, float:3.59E-43)
        L44:
            r0 = r0 | r6
            goto L48
        L46:
            r4 = r16
        L48:
            r6 = r5 & 3072(0xc00, float:4.305E-42)
            r10 = r17
            if (r6 != 0) goto L5a
            boolean r6 = r11.changedInstance(r10)
            if (r2 == r6) goto L57
            r6 = 1024(0x400, float:1.435E-42)
            goto L59
        L57:
            r6 = 2048(0x800, float:2.87E-42)
        L59:
            r0 = r0 | r6
        L5a:
            r6 = r0 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            r8 = 0
            if (r6 == r7) goto L62
            goto L63
        L62:
            r2 = r8
        L63:
            r6 = r0 & 1
            boolean r2 = r11.shouldExecute(r2, r6)
            if (r2 == 0) goto L9f
            if (r3 == 0) goto L72
            androidx.compose.ui.Modifier$Companion r2 = androidx.compose.ui.Modifier.Companion
            androidx.compose.ui.Modifier r2 = (androidx.compose.ui.Modifier) r2
            goto L73
        L72:
            r2 = r4
        L73:
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L7f
            r3 = -1
            java.lang.String r4 = "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.kt:99)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r0, r3, r4)
        L7f:
            androidx.compose.foundation.contextmenu.ContextMenuColors r9 = androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.computeContextMenuColors(r11, r8)
            int r1 = r0 << 3
            r0 = r0 & 1022(0x3fe, float:1.432E-42)
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r12 = r0 | r1
            r13 = 0
            r6 = r14
            r7 = r15
            r8 = r2
            ContextMenuPopup(r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r0 == 0) goto L9d
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L9d:
            r3 = r8
            goto La3
        L9f:
            r11.skipToGroupEnd()
            r3 = r4
        La3:
            androidx.compose.runtime.ScopeUpdateScope r7 = r11.endRestartGroup()
            if (r7 == 0) goto Lb7
            androidx.compose.foundation.contextmenu.ContextMenuUiKt$$ExternalSyntheticLambda4 r0 = new androidx.compose.foundation.contextmenu.ContextMenuUiKt$$ExternalSyntheticLambda4
            r1 = r14
            r2 = r15
            r4 = r17
            r6 = r20
            r0.<init>()
            r7.updateScope(r0)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUiKt.ContextMenuPopup(androidx.compose.ui.window.PopupPositionProvider, h.g.a.a, androidx.compose.ui.Modifier, h.g.a.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
