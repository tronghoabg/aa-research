package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bm;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt {
    private static final String[] ALL_MIME_TYPES = {"*/*", "image/*", "video/*"};
    public static final boolean TIA_DEBUG = false;
    private static final String TIA_TAG = "AndroidTextInputSession";

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2, reason: invalid class name */
    final class AnonymousClass2 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, null, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<af, e<?>, Object> {
        final /* synthetic */ ComposeInputMethodManager $composeImm;
        final /* synthetic */ ImeOptions $imeOptions;
        final /* synthetic */ TextLayoutState $layoutState;
        final /* synthetic */ l<ImeAction, ab> $onImeAction;
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        final /* synthetic */ TransformedTextFieldState $state;
        final /* synthetic */ bm<ab> $stylusHandwritingTrigger;
        final /* synthetic */ PlatformTextInputSession $this_platformSpecificTextInputSession;
        final /* synthetic */ a<ab> $updateSelectionState;
        final /* synthetic */ l<Boolean, ab> $updateTouchMode;
        final /* synthetic */ ViewConfiguration $viewConfiguration;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
            final /* synthetic */ ComposeInputMethodManager $composeImm;
            final /* synthetic */ TransformedTextFieldState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$state = transformedTextFieldState;
                this.$composeImm = composeInputMethodManager;
            }

            static final void invokeSuspend$lambda$0(ComposeInputMethodManager composeInputMethodManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
                long jM3484getSelectiond9O1mEE = textFieldCharSequence.m3484getSelectiond9O1mEE();
                TextRange textRangeM3483getCompositionMzsxiRA = textFieldCharSequence.m3483getCompositionMzsxiRA();
                long jM3484getSelectiond9O1mEE2 = textFieldCharSequence2.m3484getSelectiond9O1mEE();
                TextRange textRangeM3483getCompositionMzsxiRA2 = textFieldCharSequence2.m3483getCompositionMzsxiRA();
                if (z) {
                    composeInputMethodManager.restartInput();
                } else {
                    if (TextRange.m10539equalsimpl0(jM3484getSelectiond9O1mEE, jM3484getSelectiond9O1mEE2) && x.n(textRangeM3483getCompositionMzsxiRA, textRangeM3483getCompositionMzsxiRA2)) {
                        return;
                    }
                    composeInputMethodManager.updateSelection(TextRange.m10544getMinimpl(jM3484getSelectiond9O1mEE2), TextRange.m10543getMaximpl(jM3484getSelectiond9O1mEE2), textRangeM3483getCompositionMzsxiRA2 != null ? TextRange.m10544getMinimpl(textRangeM3483getCompositionMzsxiRA2.m10550unboximpl()) : -1, textRangeM3483getCompositionMzsxiRA2 != null ? TextRange.m10543getMaximpl(textRangeM3483getCompositionMzsxiRA2.m10550unboximpl()) : -1);
                }
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.$state, this.$composeImm, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e<? super ab> eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    e.b.c.b(obj);
                    TransformedTextFieldState transformedTextFieldState = this.$state;
                    final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                    this.label = 1;
                    if (transformedTextFieldState.collectImeNotifications(new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1$$ExternalSyntheticLambda0
                        @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                        public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
                            AndroidTextInputSession_androidKt.AnonymousClass3.AnonymousClass1.invokeSuspend$lambda$0(composeInputMethodManager, textFieldCharSequence, textFieldCharSequence2, z);
                        }
                    }, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.b.c.b(obj);
                }
                throw new h.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(bm<ab> bmVar, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, PlatformTextInputSession platformTextInputSession, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, l<? super ImeAction, ab> lVar, a<ab> aVar, ViewConfiguration viewConfiguration, l<? super Boolean, ab> lVar2, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$stylusHandwritingTrigger = bmVar;
            this.$state = transformedTextFieldState;
            this.$layoutState = textLayoutState;
            this.$composeImm = composeInputMethodManager;
            this.$this_platformSpecificTextInputSession = platformTextInputSession;
            this.$imeOptions = imeOptions;
            this.$receiveContentConfiguration = receiveContentConfiguration;
            this.$onImeAction = lVar;
            this.$updateSelectionState = aVar;
            this.$viewConfiguration = viewConfiguration;
            this.$updateTouchMode = lVar2;
        }

        static final InputConnection invokeSuspend$lambda$1(TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, l lVar, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, a aVar, ViewConfiguration viewConfiguration, l lVar2, EditorInfo editorInfo) {
            AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(new DefaultImeEditCommandScope(transformedTextFieldState), transformedTextFieldState, composeInputMethodManager, lVar, receiveContentConfiguration, cursorAnchorInfoController, textLayoutState, aVar, viewConfiguration, lVar2);
            EditorInfo_androidKt.m3524updatepLxbY9I(editorInfo, transformedTextFieldState.getVisualText(), transformedTextFieldState.getVisualText().m3484getSelectiond9O1mEE(), imeOptions, receiveContentConfiguration != null ? AndroidTextInputSession_androidKt.ALL_MIME_TYPES : null);
            return new StatelessInputConnection(androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1, editorInfo);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$stylusHandwritingTrigger, this.$state, this.$layoutState, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, this.$receiveContentConfiguration, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, this.$updateTouchMode, eVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<?> eVar) {
            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                af afVar = (af) this.L$0;
                aj.z(afVar, null, ag.f51345d, new AnonymousClass1(this.$state, this.$composeImm, null), 1);
                bm<ab> bmVar = this.$stylusHandwritingTrigger;
                if (bmVar != null) {
                    aj.z(afVar, null, null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(bmVar, this.$composeImm, null), 3);
                }
                final CursorAnchorInfoController cursorAnchorInfoController = new CursorAnchorInfoController(this.$state, this.$layoutState, this.$composeImm, afVar);
                PlatformTextInputSession platformTextInputSession = this.$this_platformSpecificTextInputSession;
                final TransformedTextFieldState transformedTextFieldState = this.$state;
                final ImeOptions imeOptions = this.$imeOptions;
                final ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                final l<ImeAction, ab> lVar = this.$onImeAction;
                final TextLayoutState textLayoutState = this.$layoutState;
                final a<ab> aVar2 = this.$updateSelectionState;
                final ViewConfiguration viewConfiguration = this.$viewConfiguration;
                final l<Boolean, ab> lVar2 = this.$updateTouchMode;
                this.label = 1;
                if (platformTextInputSession.startInputMethod(new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$$ExternalSyntheticLambda0
                    @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
                    public final InputConnection createInputConnection(EditorInfo editorInfo) {
                        return AndroidTextInputSession_androidKt.AnonymousClass3.invokeSuspend$lambda$1(transformedTextFieldState, imeOptions, receiveContentConfiguration, composeInputMethodManager, lVar, cursorAnchorInfoController, textLayoutState, aVar2, viewConfiguration, lVar2, editorInfo);
                    }
                }, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            throw new h.e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession r18, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r19, androidx.compose.foundation.text.input.internal.TextLayoutState r20, androidx.compose.ui.text.input.ImeOptions r21, androidx.compose.foundation.content.internal.ReceiveContentConfiguration r22, h.g.a.l<? super androidx.compose.ui.text.input.ImeAction, h.ab> r23, h.g.a.a<h.ab> r24, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r25, kotlinx.coroutines.b.bm<h.ab> r26, androidx.compose.ui.platform.ViewConfiguration r27, h.g.a.l<? super java.lang.Boolean, h.ab> r28, h.c.e<?> r29) {
        /*
            r0 = r29
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.AnonymousClass2
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.AnonymousClass2) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.result
            h.c.a.a r2 = h.c.a.a.f48038a
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 == r4) goto L2d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            e.b.c.b(r0)
            goto L5c
        L31:
            e.b.c.b(r0)
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 r5 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3
            r17 = 0
            r10 = r18
            r7 = r19
            r8 = r20
            r11 = r21
            r12 = r22
            r13 = r23
            r14 = r24
            r9 = r25
            r6 = r26
            r15 = r27
            r16 = r28
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            h.g.a.p r5 = (h.g.a.p) r5
            r1.label = r4
            java.lang.Object r0 = kotlinx.coroutines.aj.d(r5, r1)
            if (r0 != r2) goto L5c
            return r2
        L5c:
            h.e r0 = new h.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, h.g.a.l, h.g.a.a, androidx.compose.foundation.text.input.internal.ComposeInputMethodManager, kotlinx.coroutines.b.bm, androidx.compose.ui.platform.ViewConfiguration, h.g.a.l, h.c.e):java.lang.Object");
    }

    public static /* synthetic */ Object platformSpecificTextInputSession$default(PlatformTextInputSession platformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, l lVar, a aVar, bm bmVar, ViewConfiguration viewConfiguration, l lVar2, e eVar, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            aVar = null;
        }
        if ((i2 & 64) != 0) {
            bmVar = null;
        }
        if ((i2 & 128) != 0) {
            viewConfiguration = null;
        }
        return platformSpecificTextInputSession(platformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, receiveContentConfiguration, lVar, aVar, bmVar, viewConfiguration, lVar2, eVar);
    }

    public static /* synthetic */ void getTIA_DEBUG$annotations() {
    }

    private static final void logDebug(String str, a<String> aVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession r14, androidx.compose.foundation.text.input.internal.TransformedTextFieldState r15, androidx.compose.foundation.text.input.internal.TextLayoutState r16, androidx.compose.ui.text.input.ImeOptions r17, androidx.compose.foundation.content.internal.ReceiveContentConfiguration r18, h.g.a.l<? super androidx.compose.ui.text.input.ImeAction, h.ab> r19, h.g.a.a<h.ab> r20, kotlinx.coroutines.b.bm<h.ab> r21, androidx.compose.ui.platform.ViewConfiguration r22, h.g.a.l<? super java.lang.Boolean, h.ab> r23, h.c.e<?> r24) {
        /*
            r0 = r24
            boolean r1 = r0 instanceof androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.AnonymousClass1
            if (r1 == 0) goto L15
            r1 = r0
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = (androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.AnonymousClass1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 r1 = new androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1
            r1.<init>(r0)
        L1a:
            r13 = r1
            java.lang.Object r0 = r13.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r13.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L2e:
            e.b.c.b(r0)
            goto L58
        L32:
            e.b.c.b(r0)
            android.view.View r0 = r14.getView()
            androidx.compose.foundation.text.input.internal.ComposeInputMethodManager r9 = androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt.ComposeInputMethodManager(r0)
            r13.label = r3
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r21
            r11 = r22
            r12 = r23
            java.lang.Object r14 = platformSpecificTextInputSession(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r1) goto L58
            return r1
        L58:
            h.e r14 = new h.e
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession(androidx.compose.ui.platform.PlatformTextInputSession, androidx.compose.foundation.text.input.internal.TransformedTextFieldState, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.content.internal.ReceiveContentConfiguration, h.g.a.l, h.g.a.a, kotlinx.coroutines.b.bm, androidx.compose.ui.platform.ViewConfiguration, h.g.a.l, h.c.e):java.lang.Object");
    }

    static /* synthetic */ void logDebug$default(String str, a aVar, int i2, Object obj) {
    }
}
