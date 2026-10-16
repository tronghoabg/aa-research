package androidx.compose.material3;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSizeKt;
import h.ab;
import h.c.b.a.f;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ExposedDropdownMenuKt {
    private static final float ExposedDropdownMenuItemHorizontalPadding = 16.0f;

    public static /* synthetic */ boolean $r8$lambda$dJGnAxnepMHhyYy5NJJtdsajb0I(a aVar, String str, SoftwareKeyboardController softwareKeyboardController) {
        expandable_3_2CpT8$lambda$0$0(aVar, str, softwareKeyboardController);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ExposedDropdownMenuBox(boolean r26, final h.g.a.l<? super java.lang.Boolean, h.ab> r27, androidx.compose.ui.Modifier r28, h.g.a.q<? super androidx.compose.material3.ExposedDropdownMenuBoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, h.ab> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt.ExposedDropdownMenuBox(boolean, h.g.a.l, androidx.compose.ui.Modifier, h.g.a.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenuBox$lambda$14$0(WindowBoundsCalculator windowBoundsCalculator, int i2, MutableState mutableState, MutableIntState mutableIntState, MutableIntState mutableIntState2, LayoutCoordinates layoutCoordinates) {
        mutableState.setValue(layoutCoordinates);
        mutableIntState.setIntValue((int) (layoutCoordinates.mo9743getSizeYbymL2g() >> 32));
        mutableIntState2.setIntValue(calculateMaxHeight(windowBoundsCalculator.getVisibleWindowBounds(), getAnchorBounds(ExposedDropdownMenuBox$lambda$2(mutableState)), i2));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenuBox$lambda$16$0(WindowBoundsCalculator windowBoundsCalculator, int i2, MutableState mutableState, MutableIntState mutableIntState) {
        mutableIntState.setIntValue(calculateMaxHeight(windowBoundsCalculator.getVisibleWindowBounds(), getAnchorBounds(ExposedDropdownMenuBox$lambda$2(mutableState)), i2));
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenuBox$lambda$17$0(boolean z, FocusRequester focusRequester) {
        if (z) {
            FocusRequester.m7885requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab ExposedDropdownMenuBox$lambda$18$0(l lVar) {
        lVar.invoke(false);
        return ab.f48028a;
    }

    static final ab ExposedDropdownMenuBox$lambda$19(boolean z, l lVar, Modifier modifier, q qVar, int i2, int i3, Composer composer, int i4) {
        ExposedDropdownMenuBox(z, lVar, modifier, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return ab.f48028a;
    }

    private static final LayoutCoordinates ExposedDropdownMenuBox$lambda$2(MutableState<LayoutCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$5(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ExposedDropdownMenuBox$lambda$8(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    private static final int calculateMaxHeight(IntRect intRect, Rect rect, int i2) {
        if (rect == null) {
            return 0;
        }
        int top = intRect.getTop() + i2;
        int bottom = intRect.getBottom() - i2;
        return Math.max((rect.getTop() > ((float) intRect.getBottom()) || rect.getBottom() < ((float) intRect.getTop())) ? bottom - top : h.h.a.b(Math.max(rect.getTop() - top, bottom - rect.getBottom())), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: expandable-3-2CpT8, reason: not valid java name */
    public static final Modifier m4828expandable32CpT8(Modifier modifier, final boolean z, final a<ab> aVar, final String str, final MutableState<Boolean> mutableState, final String str2, final String str3, final String str4, final SoftwareKeyboardController softwareKeyboardController) {
        return SemanticsModifierKt.semantics(KeyInputModifierKt.onPreviewKeyEvent(SuspendingPointerInputFilterKt.pointerInput(modifier, aVar, new PointerInputEventHandler() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1, reason: invalid class name */
            final class AnonymousClass1 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
                final /* synthetic */ String $anchorType;
                final /* synthetic */ a<ab> $onExpandedChange;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(String str, a<ab> aVar, e<? super AnonymousClass1> eVar) {
                    super(2, eVar);
                    this.$anchorType = str;
                    this.$onExpandedChange = aVar;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$anchorType, this.$onExpandedChange, eVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // h.g.a.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                    return ((AnonymousClass1) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
                
                    if (r11 != r0) goto L18;
                 */
                @Override // h.c.b.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        h.c.a.a r0 = h.c.a.a.f48038a
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L20
                        if (r1 == r3) goto L18
                        if (r1 != r2) goto L10
                        e.b.c.b(r11)
                        goto L5e
                    L10:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r11)
                        throw r10
                    L18:
                        java.lang.Object r1 = r10.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        e.b.c.b(r11)
                        goto L3b
                    L20:
                        e.b.c.b(r11)
                        java.lang.Object r11 = r10.L$0
                        r4 = r11
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                        androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r7 = r10
                        h.c.e r7 = (h.c.e) r7
                        r10.L$0 = r4
                        r10.label = r3
                        r8 = 1
                        r9 = 0
                        r5 = 0
                        java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                        if (r11 == r0) goto L6a
                        r1 = r4
                    L3b:
                        java.lang.String r3 = r10.$anchorType
                        androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                        androidx.compose.material3.ExposedDropdownMenuAnchorType$Companion r4 = androidx.compose.material3.ExposedDropdownMenuAnchorType.Companion
                        java.lang.String r4 = r4.m4810getSecondaryEditableoYjWRB4()
                        boolean r3 = androidx.compose.material3.ExposedDropdownMenuAnchorType.m4804equalsimpl0(r3, r4)
                        if (r3 == 0) goto L4e
                        r11.consume()
                    L4e:
                        androidx.compose.ui.input.pointer.PointerEventPass r11 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r3 = r10
                        h.c.e r3 = (h.c.e) r3
                        r4 = 0
                        r10.L$0 = r4
                        r10.label = r2
                        java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(r1, r11, r3)
                        if (r11 == r0) goto L6a
                    L5e:
                        androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
                        if (r11 == 0) goto L67
                        h.g.a.a<h.ab> r10 = r10.$onExpandedChange
                        r10.invoke()
                    L67:
                        h.ab r10 = h.ab.f48028a
                        return r10
                    L6a:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuKt$expandable$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new AnonymousClass1(str, aVar, null), eVar);
                return objAwaitEachGesture == h.c.a.a.f48038a ? objAwaitEachGesture : ab.f48028a;
            }
        }), new l<KeyEvent, Boolean>() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$expandable$2
            @Override // h.g.a.l
            public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                return m4832invokeZmokQxo(keyEvent.m9424unboximpl());
            }

            /* renamed from: invoke-ZmokQxo, reason: not valid java name */
            public final Boolean m4832invokeZmokQxo(android.view.KeyEvent keyEvent) {
                if (ExposedDropdownMenuKt.m4830isClickZmokQxo(keyEvent)) {
                    if (!ExposedDropdownMenuAnchorType.m4804equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m4808getPrimaryEditableoYjWRB4())) {
                        aVar.invoke();
                    } else if (ExposedDropdownMenuKt.m4831isEnterMinusSpacebarZmokQxo(keyEvent)) {
                        aVar.invoke();
                        return true;
                    }
                }
                if (ExposedDropdownMenuAnchorType.m4804equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m4808getPrimaryEditableoYjWRB4()) && z && (Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9363getTabEK5gGoQ()) || Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9189getDirectionDownEK5gGoQ()) || Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9194getDirectionUpEK5gGoQ()))) {
                    mutableState.setValue(true);
                    return true;
                }
                mutableState.setValue(false);
                return false;
            }
        }), 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), new l() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ExposedDropdownMenuKt.expandable_3_2CpT8$lambda$0(str, z, str2, str3, str4, aVar, softwareKeyboardController, (SemanticsPropertyReceiver) obj);
            }
        });
    }

    static final ab expandable_3_2CpT8$lambda$0(final String str, boolean z, String str2, String str3, String str4, final a aVar, final SoftwareKeyboardController softwareKeyboardController, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (ExposedDropdownMenuAnchorType.m4804equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m4810getSecondaryEditableoYjWRB4())) {
            SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10316getButtono7Vup1c());
            if (true != z) {
                str2 = str3;
            }
            SemanticsPropertiesKt.setStateDescription(semanticsPropertyReceiver, str2);
            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str4);
        } else {
            SemanticsPropertiesKt.m10335setRolekuIjeqM(semanticsPropertyReceiver, Role.Companion.m10319getDropdownListo7Vup1c());
        }
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.material3.ExposedDropdownMenuKt$$ExternalSyntheticLambda6
            @Override // h.g.a.a
            public final Object invoke() {
                ExposedDropdownMenuKt.$r8$lambda$dJGnAxnepMHhyYy5NJJtdsajb0I(aVar, str, softwareKeyboardController);
                return true;
            }
        }, 1, null);
        return ab.f48028a;
    }

    private static final boolean expandable_3_2CpT8$lambda$0$0(a aVar, String str, SoftwareKeyboardController softwareKeyboardController) {
        aVar.invoke();
        if (!ExposedDropdownMenuAnchorType.m4804equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m4808getPrimaryEditableoYjWRB4()) || softwareKeyboardController == null) {
            return true;
        }
        softwareKeyboardController.show();
        return true;
    }

    private static final Rect getAnchorBounds(LayoutCoordinates layoutCoordinates) {
        return (layoutCoordinates == null || !layoutCoordinates.isAttached()) ? Rect.Companion.getZero() : RectKt.m8020Recttz77jQw(LayoutCoordinatesKt.positionInWindow(layoutCoordinates), IntSizeKt.m11351toSizeozmzZPI(layoutCoordinates.mo9743getSizeYbymL2g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hasGreaterOrEqualPriorityThan-vVDBVkM, reason: not valid java name */
    public static final boolean m4829hasGreaterOrEqualPriorityThanvVDBVkM(String str, String str2) {
        if (ExposedDropdownMenuAnchorType.m4804equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m4809getPrimaryNotEditableoYjWRB4()) || ExposedDropdownMenuAnchorType.m4804equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m4808getPrimaryEditableoYjWRB4())) {
            return true;
        }
        if (ExposedDropdownMenuAnchorType.m4804equalsimpl0(str, ExposedDropdownMenuAnchorType.Companion.m4810getSecondaryEditableoYjWRB4())) {
            return ExposedDropdownMenuAnchorType.m4804equalsimpl0(str2, ExposedDropdownMenuAnchorType.Companion.m4810getSecondaryEditableoYjWRB4());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isClick-ZmokQxo, reason: not valid java name */
    public static final boolean m4830isClickZmokQxo(android.view.KeyEvent keyEvent) {
        if (KeyEventType.m9428equalsimpl0(KeyEvent_androidKt.m9436getTypeZmokQxo(keyEvent), KeyEventType.Companion.m9433getKeyUpCS__XNY())) {
            return m4831isEnterMinusSpacebarZmokQxo(keyEvent) || Key.m9115equalsimpl0(KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent), Key.Companion.m9350getSpacebarEK5gGoQ());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: isEnterMinusSpacebar-ZmokQxo, reason: not valid java name */
    public static final boolean m4831isEnterMinusSpacebarZmokQxo(android.view.KeyEvent keyEvent) {
        long jM9435getKeyZmokQxo = KeyEvent_androidKt.m9435getKeyZmokQxo(keyEvent);
        return Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9188getDirectionCenterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9202getEnterEK5gGoQ()) || Key.m9115equalsimpl0(jM9435getKeyZmokQxo, Key.Companion.m9299getNumPadEnterEK5gGoQ());
    }

    public static /* synthetic */ void MenuAnchorType$annotations() {
    }
}
