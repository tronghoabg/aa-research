package androidx.compose.foundation.text.input.internal;

import android.view.KeyEvent;
import androidx.compose.foundation.FocusableNode;
import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.TransferableContent_androidKt;
import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.AutofillHighlightKt;
import androidx.compose.foundation.text.AutofillHighlight_androidKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyCommand;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.KeyboardActionHandler;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.DragAndDropHoverInteraction;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.autofill.FillableData;
import androidx.compose.ui.autofill.FillableData_androidKt;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDropTargetModifierNode;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.focus.FocusPropertiesModifierNode;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.KeyInputModifierNode;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.modifier.EmptyMap;
import androidx.compose.ui.modifier.ModifierLocal;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.TouchBoundsExpansion;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.PlatformTextInputModifierNode;
import androidx.compose.ui.platform.PlatformTextInputModifierNodeKt;
import androidx.compose.ui.platform.PlatformTextInputSessionScope;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.InputTextSuggestionState;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardType;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.x;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode extends DelegatingNode implements DrawModifierNode, PlatformTextInputModifierNode, SemanticsModifierNode, GlobalPositionAwareModifierNode, PointerInputModifierNode, KeyInputModifierNode, CompositionLocalConsumerModifierNode, ModifierLocalModifierNode, ObserverModifierNode, LayoutAwareModifierNode, FocusPropertiesModifierNode {
    public static final int $stable = 8;
    private final MutableState autofillHighlightOn$delegate;
    private final p<? super KeyCommand, ? super Boolean, ? extends ab> clipboardKeyCommandsHandler;
    private final DragAndDropTargetModifierNode dragAndDropNode;
    private DragAndDropHoverInteraction.Enter dragEnterEvent;
    private boolean enabled;
    private InputTransformation filter;
    private final FocusableNode focusableNode;
    private br inputSessionJob;
    private MutableInteractionSource interactionSource;
    private boolean isPassword;
    private KeyboardActionHandler keyboardActionHandler;
    private final TextFieldDecoratorModifierNode$keyboardActionScope$1 keyboardActionScope;
    private KeyboardOptions keyboardOptions;
    private final SuspendingPointerInputModifierNode pointerInputNode;
    private boolean readOnly;
    private final a<ReceiveContentConfiguration> receiveContentConfigurationProvider;
    private boolean singleLine;
    private bm<ab> stylusHandwritingTrigger;
    private final TextFieldKeyEventHandler textFieldKeyEventHandler;
    private TextFieldSelectionState textFieldSelectionState;
    private TransformedTextFieldState textFieldState;
    private TextLayoutState textLayoutState;
    private br toolbarAndHandlesVisibilityObserverJob;
    private WindowInfo windowInfo;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$onIsFocusedUpdated$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return TextFieldDecoratorModifierNode.this.new AnonymousClass1(eVar);
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
                c.b(obj);
                this.label = 1;
                if (TextFieldDecoratorModifierNode.this.getTextFieldSelectionState().startToolbarAndHandlesVisibilityObserver(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1, reason: invalid class name and case insensitive filesystem */
    final class C03081 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1, reason: invalid class name and collision with other inner class name */
        final class C00481 extends g implements p<PlatformTextInputSessionScope, e<?>, Object> {
            final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TextFieldDecoratorModifierNode this$0;

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1, reason: invalid class name and collision with other inner class name */
            final /* synthetic */ class C00491 extends h.g.b.a implements l<ImeAction, ab> {
                C00491(Object obj) {
                    super(1, obj, TextFieldDecoratorModifierNode.class, "onImeActionPerformed", "onImeActionPerformed-KlQnJC8(I)Z", 8);
                }

                @Override // h.g.a.l
                public /* bridge */ /* synthetic */ ab invoke(ImeAction imeAction) {
                    m3672invokeKlQnJC8(imeAction.m10720unboximpl());
                    return ab.f48028a;
                }

                /* renamed from: invoke-KlQnJC8, reason: not valid java name */
                public final void m3672invokeKlQnJC8(int i2) {
                    ((TextFieldDecoratorModifierNode) this.receiver).m3670onImeActionPerformedKlQnJC8(i2);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00481(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ReceiveContentConfiguration receiveContentConfiguration, e<? super C00481> eVar) {
                super(2, eVar);
                this.this$0 = textFieldDecoratorModifierNode;
                this.$receiveContentConfiguration = receiveContentConfiguration;
            }

            static final ab invokeSuspend$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
                textFieldDecoratorModifierNode.getTextFieldSelectionState().updateTextToolbarState(TextToolbarState.Selection);
                return ab.f48028a;
            }

            static final ab invokeSuspend$lambda$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, boolean z) {
                textFieldDecoratorModifierNode.getTextFieldSelectionState().setInTouchMode(z);
                return ab.f48028a;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                C00481 c00481 = new C00481(this.this$0, this.$receiveContentConfiguration, eVar);
                c00481.L$0 = obj;
                return c00481;
            }

            @Override // h.g.a.p
            public final Object invoke(PlatformTextInputSessionScope platformTextInputSessionScope, e<?> eVar) {
                return ((C00481) create(platformTextInputSessionScope, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 == 0) {
                    c.b(obj);
                    PlatformTextInputSessionScope platformTextInputSessionScope = (PlatformTextInputSessionScope) this.L$0;
                    TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    TransformedTextFieldState textFieldState = textFieldDecoratorModifierNode.getTextFieldState();
                    TextLayoutState textLayoutState = textFieldDecoratorModifierNode.getTextLayoutState();
                    ImeOptions imeOptions$foundation = textFieldDecoratorModifierNode.getKeyboardOptions().toImeOptions$foundation(textFieldDecoratorModifierNode.getSingleLine());
                    ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode2 = this.this$0;
                    C00491 c00491 = new C00491(textFieldDecoratorModifierNode2);
                    a aVar2 = new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$$ExternalSyntheticLambda0
                        @Override // h.g.a.a
                        public final Object invoke() {
                            return TextFieldDecoratorModifierNode.C03081.C00481.invokeSuspend$lambda$0(textFieldDecoratorModifierNode2);
                        }
                    };
                    bm<ab> stylusHandwritingTrigger = textFieldDecoratorModifierNode2.getStylusHandwritingTrigger();
                    ViewConfiguration viewConfiguration = (ViewConfiguration) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode2, CompositionLocalsKt.getLocalViewConfiguration());
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode3 = this.this$0;
                    this.label = 1;
                    if (AndroidTextInputSession_androidKt.platformSpecificTextInputSession(platformTextInputSessionScope, textFieldState, textLayoutState, imeOptions$foundation, receiveContentConfiguration, c00491, aVar2, stylusHandwritingTrigger, viewConfiguration, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$$ExternalSyntheticLambda1
                        @Override // h.g.a.l
                        public final Object invoke(Object obj2) {
                            return TextFieldDecoratorModifierNode.C03081.C00481.invokeSuspend$lambda$1(textFieldDecoratorModifierNode3, ((Boolean) obj2).booleanValue());
                        }
                    }, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                throw new h.e();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03081(ReceiveContentConfiguration receiveContentConfiguration, e<? super C03081> eVar) {
            super(2, eVar);
            this.$receiveContentConfiguration = receiveContentConfiguration;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return TextFieldDecoratorModifierNode.this.new C03081(this.$receiveContentConfiguration, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03081) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = TextFieldDecoratorModifierNode.this;
                this.label = 1;
                if (PlatformTextInputModifierNodeKt.establishTextInputSession(textFieldDecoratorModifierNode, new C00481(textFieldDecoratorModifierNode, this.$receiveContentConfiguration, null), this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            throw new h.e();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$updateNode$1, reason: invalid class name and case insensitive filesystem */
    final class C03091 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ TextFieldSelectionState $textFieldSelectionState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03091(TextFieldSelectionState textFieldSelectionState, e<? super C03091> eVar) {
            super(2, eVar);
            this.$textFieldSelectionState = textFieldSelectionState;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new C03091(this.$textFieldSelectionState, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((C03091) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.$textFieldSelectionState.startToolbarAndHandlesVisibilityObserver(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    public TextFieldDecoratorModifierNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource, boolean z4, bm<ab> bmVar) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z4;
        this.stylusHandwritingTrigger = bmVar;
        textFieldSelectionState.setRequestAutofillAction(new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda14
            @Override // h.g.a.a
            public final Object invoke() {
                return TextFieldDecoratorModifierNode._init_$lambda$0(this.f$0);
            }
        });
        this.focusableNode = new FocusableNode(this.interactionSource, 0, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda16
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldDecoratorModifierNode.focusableNode$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, 2, null);
        SuspendingPointerInputModifierNode SuspendingPointerInputModifierNode = SuspendingPointerInputFilterKt.SuspendingPointerInputModifierNode(new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1, reason: invalid class name */
            final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
                final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ TextFieldDecoratorModifierNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, PointerInputScope pointerInputScope, e<? super AnonymousClass1> eVar) {
                    super(2, eVar);
                    this.this$0 = textFieldDecoratorModifierNode;
                    this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final ab invokeSuspend$lambda$0$0(TextFieldSelectionState textFieldSelectionState, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
                    if (!textFieldSelectionState.isFocused()) {
                        textFieldDecoratorModifierNode.requestFocus();
                    }
                    return ab.f48028a;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_SuspendingPointerInputModifierNode, eVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // h.g.a.p
                public final Object invoke(af afVar, e<? super ab> eVar) {
                    return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    h.c.a.a aVar = h.c.a.a.f48038a;
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                    af afVar = (af) this.L$0;
                    final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
                    PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
                    final TextFieldSelectionState textFieldSelectionState = textFieldDecoratorModifierNode.getTextFieldSelectionState();
                    a aVar2 = 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0017: CONSTRUCTOR (r4v0 'aVar2' h.g.a.a) = 
                          (r2v0 'textFieldSelectionState' androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState A[DONT_INLINE])
                          (r1v0 'textFieldDecoratorModifierNode' androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode A[DONT_INLINE])
                         A[DECLARE_VAR, MD:(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void (m)] (LINE:24) call: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode):void type: CONSTRUCTOR in method: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                        	... 19 more
                        */
                    /*
                        this = this;
                        h.c.a.a r0 = h.c.a.a.f48038a
                        int r0 = r8.label
                        if (r0 != 0) goto L40
                        e.b.c.b(r9)
                        java.lang.Object r9 = r8.L$0
                        kotlinx.coroutines.af r9 = (kotlinx.coroutines.af) r9
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode r1 = r8.this$0
                        androidx.compose.ui.input.pointer.PointerInputScope r3 = r8.$this_SuspendingPointerInputModifierNode
                        androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r2 = r1.getTextFieldSelectionState()
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$$ExternalSyntheticLambda0 r4 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$$ExternalSyntheticLambda0
                        r4.<init>(r2, r1)
                        kotlinx.coroutines.ag r8 = kotlinx.coroutines.ag.f51345d
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1 r0 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$1
                        r6 = 0
                        r0.<init>(r2, r3, r6)
                        h.g.a.p r0 = (h.g.a.p) r0
                        r7 = 1
                        kotlinx.coroutines.aj.z(r9, r6, r8, r0, r7)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 r0 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2
                        r5 = 0
                        r0.<init>(r1, r2, r3, r4, r5)
                        h.g.a.p r0 = (h.g.a.p) r0
                        kotlinx.coroutines.aj.z(r9, r6, r8, r0, r7)
                        androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3 r0 = new androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$3
                        r0.<init>(r2, r3, r4, r6)
                        h.g.a.p r0 = (h.g.a.p) r0
                        kotlinx.coroutines.aj.z(r9, r6, r8, r0, r7)
                        h.ab r8 = h.ab.f48028a
                        return r8
                    L40:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                Object objD = aj.d(new AnonymousClass1(this.this$0, pointerInputScope, null), eVar);
                return objD == h.c.a.a.f48038a ? objD : ab.f48028a;
            }
        });
        delegate(SuspendingPointerInputModifierNode);
        this.pointerInputNode = SuspendingPointerInputModifierNode;
        DragAndDropTargetModifierNode dragAndDropTargetModifierNodeTextFieldDragAndDropNode$default = TextFieldDragAndDropNode_androidKt.textFieldDragAndDropNode$default(new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda17
            @Override // h.g.a.a
            public final Object invoke() {
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$0(this.f$0);
            }
        }, new p() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda18
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                TextFieldDecoratorModifierNode.dragAndDropNode$lambda$1(this.f$0, (ClipEntry) obj, (ClipMetadata) obj2);
                return true;
            }
        }, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda19
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$2(this.f$0, (DragAndDropEvent) obj);
            }
        }, null, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda20
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$3(this.f$0, (DragAndDropEvent) obj);
            }
        }, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda21
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$4(this.f$0, (Offset) obj);
            }
        }, null, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda22
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$5(this.f$0, (DragAndDropEvent) obj);
            }
        }, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda23
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return TextFieldDecoratorModifierNode.dragAndDropNode$lambda$6(this.f$0, (DragAndDropEvent) obj);
            }
        }, 72, null);
        delegate(dragAndDropTargetModifierNodeTextFieldDragAndDropNode$default);
        this.dragAndDropNode = dragAndDropTargetModifierNodeTextFieldDragAndDropNode$default;
        this.textFieldKeyEventHandler = TextFieldKeyEventHandler_androidKt.createTextFieldKeyEventHandler();
        this.keyboardActionScope = new TextFieldDecoratorModifierNode$keyboardActionScope$1(this);
        this.clipboardKeyCommandsHandler = new p() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda24
            @Override // h.g.a.p
            public final Object invoke(Object obj, Object obj2) {
                return TextFieldDecoratorModifierNode.clipboardKeyCommandsHandler$lambda$0(this.f$0, (KeyCommand) obj, ((Boolean) obj2).booleanValue());
            }
        };
        this.receiveContentConfigurationProvider = new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda15
            @Override // h.g.a.a
            public final Object invoke() {
                return ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.f$0);
            }
        };
        this.autofillHighlightOn$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    static final ab _init_$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        DelegatableNodeKt.requestAutofill(textFieldDecoratorModifierNode);
        return ab.f48028a;
    }

    static final boolean applySemantics$lambda$1(boolean z, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, FillableData fillableData) {
        if (!z) {
            return false;
        }
        CharSequence textValue = fillableData.getTextValue();
        if (textValue != null) {
            textFieldDecoratorModifierNode.textFieldState.replaceAll(textValue);
        }
        textFieldDecoratorModifierNode.setAutofillHighlightOn(true);
        aj.z(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$2$2(textFieldDecoratorModifierNode, null), 3);
        return true;
    }

    static final boolean applySemantics$lambda$10(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        aj.z(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$11$1(textFieldDecoratorModifierNode, null), 3);
        return true;
    }

    static final boolean applySemantics$lambda$11(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        aj.z(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$12$1(textFieldDecoratorModifierNode, null), 3);
        return true;
    }

    static final boolean applySemantics$lambda$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, List list) {
        TextLayoutResult layoutResult = textFieldDecoratorModifierNode.textLayoutState.getLayoutResult();
        if (layoutResult != null) {
            return list.add(layoutResult);
        }
        return false;
    }

    static final boolean applySemantics$lambda$3(boolean z, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, AnnotatedString annotatedString) {
        if (!z) {
            return false;
        }
        textFieldDecoratorModifierNode.textFieldState.replaceAll(annotatedString);
        return true;
    }

    static final boolean applySemantics$lambda$4(boolean z, TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, AnnotatedString annotatedString) {
        if (!z) {
            return false;
        }
        TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode.textFieldState, annotatedString, true, null, false, false, 28, null);
        return true;
    }

    static final boolean applySemantics$lambda$5(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i2, int i3, boolean z) {
        TextFieldCharSequence untransformedText = z ? textFieldDecoratorModifierNode.textFieldState.getUntransformedText() : textFieldDecoratorModifierNode.textFieldState.getVisualText();
        long jM3484getSelectiond9O1mEE = untransformedText.m3484getSelectiond9O1mEE();
        if (!textFieldDecoratorModifierNode.enabled || Math.min(i2, i3) < 0 || Math.max(i2, i3) > untransformedText.length()) {
            return false;
        }
        if (i2 == TextRange.m10546getStartimpl(jM3484getSelectiond9O1mEE) && i3 == TextRange.m10541getEndimpl(jM3484getSelectiond9O1mEE)) {
            return true;
        }
        long jTextRange = TextRangeKt.TextRange(i2, i3);
        if (z || i2 == i3) {
            textFieldDecoratorModifierNode.textFieldSelectionState.updateTextToolbarState(TextToolbarState.None);
        } else {
            textFieldDecoratorModifierNode.textFieldSelectionState.updateTextToolbarState(TextToolbarState.Selection);
        }
        if (z) {
            textFieldDecoratorModifierNode.textFieldState.m3716selectUntransformedCharsIn5zctL8(jTextRange);
        } else {
            textFieldDecoratorModifierNode.textFieldState.m3715selectCharsIn5zctL8(jTextRange);
        }
        return true;
    }

    static final boolean applySemantics$lambda$6(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i2) {
        textFieldDecoratorModifierNode.m3670onImeActionPerformedKlQnJC8(i2);
        return true;
    }

    static final boolean applySemantics$lambda$7(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        if (!textFieldDecoratorModifierNode.isFocused()) {
            textFieldDecoratorModifierNode.requestFocus();
            return true;
        }
        if (textFieldDecoratorModifierNode.readOnly) {
            return true;
        }
        textFieldDecoratorModifierNode.requireKeyboardController().show();
        return true;
    }

    static final boolean applySemantics$lambda$8(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        if (!textFieldDecoratorModifierNode.isFocused()) {
            textFieldDecoratorModifierNode.requestFocus();
        }
        textFieldDecoratorModifierNode.textFieldSelectionState.updateTextToolbarState(TextToolbarState.Selection);
        return true;
    }

    static final boolean applySemantics$lambda$9(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        aj.z(textFieldDecoratorModifierNode.getCoroutineScope(), null, null, new TextFieldDecoratorModifierNode$applySemantics$10$1(textFieldDecoratorModifierNode, null), 3);
        return true;
    }

    static final ab clipboardKeyCommandsHandler$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, KeyCommand keyCommand, boolean z) {
        aj.z(textFieldDecoratorModifierNode.getCoroutineScope(), null, ag.f51345d, new TextFieldDecoratorModifierNode$clipboardKeyCommandsHandler$1$1(keyCommand, textFieldDecoratorModifierNode, z, null), 1);
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: defaultKeyboardActionWithResult-KlQnJC8, reason: not valid java name */
    public final boolean m3669defaultKeyboardActionWithResultKlQnJC8(int i2) {
        if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10733getNexteUduSuo())) {
            ((FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager())).mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7863getNextdhqQ8s());
            return true;
        }
        if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10735getPreviouseUduSuo())) {
            ((FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager())).mo7869moveFocus3ESFkO8(FocusDirection.Companion.m7864getPreviousdhqQ8s());
            return true;
        }
        if (!ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10731getDoneeUduSuo())) {
            return false;
        }
        requireKeyboardController().hide();
        return true;
    }

    private final void disposeInputSession() {
        br brVar = this.inputSessionJob;
        if (brVar != null) {
            brVar.s(null);
        }
        this.inputSessionJob = null;
        bm<ab> bmVar = this.stylusHandwritingTrigger;
        if (bmVar != null) {
            bmVar.b();
        }
    }

    static final Set dragAndDropNode$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        return ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode) != null ? TextFieldDecoratorModifierKt.MediaTypesAll : TextFieldDecoratorModifierKt.MediaTypesText;
    }

    static final boolean dragAndDropNode$lambda$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, ClipEntry clipEntry, ClipMetadata clipMetadata) {
        ClipEntry clipEntry2;
        textFieldDecoratorModifierNode.emitDragExitEvent();
        textFieldDecoratorModifierNode.textFieldSelectionState.clearHandleDragging();
        String plainText = TransferableContent_androidKt.readPlainText(clipEntry);
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
        if (receiveContentConfiguration != null) {
            TransferableContent transferableContentOnReceive = receiveContentConfiguration.getReceiveContentListener().onReceive(new TransferableContent(clipEntry, clipMetadata, TransferableContent.Source.Companion.m2085getDragAndDropkB6V9T0(), null, 8, null));
            plainText = null;
            if (transferableContentOnReceive != null && (clipEntry2 = transferableContentOnReceive.getClipEntry()) != null) {
                plainText = TransferableContent_androidKt.readPlainText(clipEntry2);
            }
        }
        if (plainText == null) {
            return true;
        }
        TransformedTextFieldState.replaceSelectedText$default(textFieldDecoratorModifierNode.textFieldState, plainText, false, null, false, false, 30, null);
        return true;
    }

    static final ab dragAndDropNode$lambda$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, DragAndDropEvent dragAndDropEvent) {
        if (ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode) != null) {
            DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(textFieldDecoratorModifierNode, dragAndDropEvent);
        }
        return ab.f48028a;
    }

    static final ab dragAndDropNode$lambda$3(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, DragAndDropEvent dragAndDropEvent) {
        ReceiveContentListener receiveContentListener;
        DragAndDropHoverInteraction.Enter enter = new DragAndDropHoverInteraction.Enter();
        textFieldDecoratorModifierNode.interactionSource.tryEmit(enter);
        textFieldDecoratorModifierNode.dragEnterEvent = enter;
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
        if (receiveContentConfiguration != null && (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) != null) {
            receiveContentListener.onDragEnter();
        }
        return ab.f48028a;
    }

    static final ab dragAndDropNode$lambda$4(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, Offset offset) {
        long jM3694fromWindowToDecorationUv8p0NA = TextLayoutStateKt.m3694fromWindowToDecorationUv8p0NA(textFieldDecoratorModifierNode.textLayoutState, offset.m7990unboximpl());
        int iM3687getOffsetForPosition3MmeM6k = textFieldDecoratorModifierNode.textLayoutState.m3687getOffsetForPosition3MmeM6k(jM3694fromWindowToDecorationUv8p0NA, false | (!((2 & 2) == 0)));
        if (iM3687getOffsetForPosition3MmeM6k >= 0) {
            textFieldDecoratorModifierNode.textFieldState.m3715selectCharsIn5zctL8(TextRangeKt.TextRange(iM3687getOffsetForPosition3MmeM6k));
        }
        textFieldDecoratorModifierNode.textFieldSelectionState.m3759updateHandleDraggingUv8p0NA(Handle.Cursor, jM3694fromWindowToDecorationUv8p0NA);
        return ab.f48028a;
    }

    static final ab dragAndDropNode$lambda$5(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, DragAndDropEvent dragAndDropEvent) {
        ReceiveContentListener receiveContentListener;
        textFieldDecoratorModifierNode.emitDragExitEvent();
        textFieldDecoratorModifierNode.textFieldSelectionState.clearHandleDragging();
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(textFieldDecoratorModifierNode);
        if (receiveContentConfiguration != null && (receiveContentListener = receiveContentConfiguration.getReceiveContentListener()) != null) {
            receiveContentListener.onDragExit();
        }
        return ab.f48028a;
    }

    static final ab dragAndDropNode$lambda$6(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, DragAndDropEvent dragAndDropEvent) {
        textFieldDecoratorModifierNode.emitDragExitEvent();
        return ab.f48028a;
    }

    private final void emitDragExitEvent() {
        DragAndDropHoverInteraction.Enter enter = this.dragEnterEvent;
        if (enter != null) {
            this.interactionSource.tryEmit(new DragAndDropHoverInteraction.Exit(enter));
            this.dragEnterEvent = null;
        }
    }

    static final ab focusableNode$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, boolean z) {
        boolean z2 = textFieldDecoratorModifierNode.enabled && !textFieldDecoratorModifierNode.readOnly;
        if (!z) {
            textFieldDecoratorModifierNode.disposeInputSession();
            TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.textFieldState;
            TextFieldState textFieldState = transformedTextFieldState.textFieldState;
            InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
            TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer$foundation().getChangeTracker$foundation().clearChanges();
            TextFieldBuffer mainBuffer$foundation = textFieldState.getMainBuffer$foundation();
            mainBuffer$foundation.commitComposition$foundation();
            transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation);
            textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
            textFieldState.setUserCommit(true);
            textFieldDecoratorModifierNode.textFieldState.collapseSelectionToMax();
        } else if (z2) {
            textFieldDecoratorModifierNode.startInputSession(false);
        }
        textFieldDecoratorModifierNode.updateWindowFocus();
        return ab.f48028a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean getAutofillHighlightOn() {
        return ((Boolean) this.autofillHighlightOn$delegate.getValue()).booleanValue();
    }

    private final boolean isFocused() {
        WindowInfo windowInfo;
        return this.focusableNode.getFocusState().isFocused() && (windowInfo = this.windowInfo) != null && windowInfo.isWindowFocused();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object observeUntransformedTextChanges(e<? super ab> eVar) {
        Object objCollect = ai.Z(ai.X(SnapshotStateKt.snapshotFlow(new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.textFieldState.getUntransformedText().toString();
            }
        }))).collect(new kotlinx.coroutines.b.l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode.observeUntransformedTextChanges.3
            public final Object emit(String str, e<? super ab> eVar2) {
                TextFieldDecoratorModifierNode.this.setAutofillHighlightOn(false);
                return ab.f48028a;
            }

            @Override // kotlinx.coroutines.b.l
            public /* bridge */ /* synthetic */ Object emit(Object obj, e eVar2) {
                return emit((String) obj, (e<? super ab>) eVar2);
            }
        }, eVar);
        return objCollect == h.c.a.a.f48038a ? objCollect : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onImeActionPerformed-KlQnJC8, reason: not valid java name */
    public final boolean m3670onImeActionPerformedKlQnJC8(final int i2) {
        KeyboardActionHandler keyboardActionHandler;
        if (ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10734getNoneeUduSuo()) || ImeAction.m10717equalsimpl0(i2, ImeAction.Companion.m10730getDefaulteUduSuo()) || (keyboardActionHandler = this.keyboardActionHandler) == null) {
            return m3669defaultKeyboardActionWithResultKlQnJC8(i2);
        }
        keyboardActionHandler.onKeyboardAction(new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda26
            @Override // h.g.a.a
            public final Object invoke() {
                return TextFieldDecoratorModifierNode.onImeActionPerformed_KlQnJC8$lambda$0(this.f$0, i2);
            }
        });
        return true;
    }

    static final ab onImeActionPerformed_KlQnJC8$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, int i2) {
        textFieldDecoratorModifierNode.keyboardActionScope.mo3322defaultKeyboardActionKlQnJC8(i2);
        return ab.f48028a;
    }

    private final void onIsFocusedUpdated() {
        this.textFieldSelectionState.setFocused(isFocused());
        if (isFocused() && this.toolbarAndHandlesVisibilityObserverJob == null) {
            this.toolbarAndHandlesVisibilityObserverJob = aj.z(getCoroutineScope(), null, null, new AnonymousClass1(null), 3);
        } else {
            if (isFocused()) {
                return;
            }
            br brVar = this.toolbarAndHandlesVisibilityObserverJob;
            if (brVar != null) {
                brVar.s(null);
            }
            this.toolbarAndHandlesVisibilityObserverJob = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestFocus() {
        if (this.focusableNode.isAttached()) {
            this.focusableNode.requestFocus();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SoftwareKeyboardController requireKeyboardController() {
        SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalSoftwareKeyboardController());
        if (softwareKeyboardController != null) {
            return softwareKeyboardController;
        }
        throw new IllegalStateException("No software keyboard controller");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAutofillHighlightOn(boolean z) {
        this.autofillHighlightOn$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startInputSession(boolean z) {
        if (z || this.keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation()) {
            this.inputSessionJob = aj.z(getCoroutineScope(), null, null, new C03081(ReceiveContentConfigurationKt.getReceiveContentConfiguration(this), null), 3);
        }
    }

    static final ab updateNode$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        DelegatableNodeKt.requestAutofill(textFieldDecoratorModifierNode);
        return ab.f48028a;
    }

    private final void updateWindowFocus() {
        ObserverModifierNodeKt.observeReads(this, new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda12
            @Override // h.g.a.a
            public final Object invoke() {
                return TextFieldDecoratorModifierNode.updateWindowFocus$lambda$0(this.f$0);
            }
        });
    }

    static final ab updateWindowFocus$lambda$0(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        textFieldDecoratorModifierNode.windowInfo = (WindowInfo) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, CompositionLocalsKt.getLocalWindowInfo());
        textFieldDecoratorModifierNode.onIsFocusedUpdated();
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public void applyFocusProperties(FocusProperties focusProperties) {
        focusProperties.setFocusRect(this.textFieldSelectionState.getFocusRect());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextFieldCharSequence outputText = this.textFieldState.getOutputText();
        long jM3484getSelectiond9O1mEE = outputText.m3484getSelectiond9O1mEE();
        SemanticsPropertiesKt.setInputText(semanticsPropertyReceiver, new AnnotatedString(this.textFieldState.getUntransformedText().toString(), null, 2, null));
        SemanticsPropertiesKt.setEditableText(semanticsPropertyReceiver, new AnnotatedString(outputText.toString(), null, 2, null));
        SemanticsPropertiesKt.m10337setTextSelectionRangeFDrldGo(semanticsPropertyReceiver, jM3484getSelectiond9O1mEE);
        SemanticsPropertiesKt.m10336setTextCompositionRangepsREZIo(semanticsPropertyReceiver, this.textFieldState.m3708getUntransformedCompositionMzsxiRA());
        SemanticsPropertiesKt.setInputTextSuggestionState(semanticsPropertyReceiver, new InputTextSuggestionState(this.textFieldState.getUserCommit()));
        if (!this.enabled) {
            SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
        }
        if (this.isPassword) {
            SemanticsPropertiesKt.password(semanticsPropertyReceiver);
        }
        final boolean z = false;
        final boolean z2 = true;
        if (this.enabled && !this.readOnly) {
            z = true;
        }
        SemanticsPropertiesKt.setEditable(semanticsPropertyReceiver, z);
        SemanticsPropertiesKt.setContentDataType(semanticsPropertyReceiver, ContentDataType.Companion.getText());
        SemanticsPropertiesKt.setFillableData(semanticsPropertyReceiver, FillableData_androidKt.createFromText(FillableData.Companion, outputText));
        SemanticsPropertiesKt.onFillData$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$1(z, this, (FillableData) obj));
            }
        }, 1, null);
        int iM3337getKeyboardTypePjHm6EE = this.keyboardOptions.m3337getKeyboardTypePjHm6EE();
        if (KeyboardType.m10770equalsimpl0(iM3337getKeyboardTypePjHm6EE, KeyboardType.Companion.m10807getEmailPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getEmailAddress());
        } else if (KeyboardType.m10770equalsimpl0(iM3337getKeyboardTypePjHm6EE, KeyboardType.Companion.m10815getPasswordPjHm6EE()) || KeyboardType.m10770equalsimpl0(iM3337getKeyboardTypePjHm6EE, KeyboardType.Companion.m10812getNumberPasswordPjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPassword());
        } else if (KeyboardType.m10770equalsimpl0(iM3337getKeyboardTypePjHm6EE, KeyboardType.Companion.m10818getPhonePjHm6EE())) {
            SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.getPhoneNumber());
        }
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda3
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$2(this.f$0, (List) obj));
            }
        }, 1, null);
        if (z) {
            SemanticsPropertiesKt.setText$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$3(z2, this, (AnnotatedString) obj));
                }
            }, 1, null);
            SemanticsPropertiesKt.insertTextAtCursor$default(semanticsPropertyReceiver, null, new l() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda5
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$4(z2, this, (AnnotatedString) obj));
                }
            }, 1, null);
        }
        SemanticsPropertiesKt.setSelection$default(semanticsPropertyReceiver, null, new q() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda6
            @Override // h.g.a.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$5(this.f$0, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
            }
        }, 1, null);
        final int iM3336getImeActionOrDefaulteUduSuo$foundation = this.keyboardOptions.m3336getImeActionOrDefaulteUduSuo$foundation();
        SemanticsPropertiesKt.m10332onImeAction9UiTYpY$default(semanticsPropertyReceiver, iM3336getImeActionOrDefaulteUduSuo$foundation, null, new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda7
            @Override // h.g.a.a
            public final Object invoke() {
                TextFieldDecoratorModifierNode.applySemantics$lambda$6(this.f$0, iM3336getImeActionOrDefaulteUduSuo$foundation);
                return true;
            }
        }, 2, null);
        SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda8
            @Override // h.g.a.a
            public final Object invoke() {
                TextFieldDecoratorModifierNode.applySemantics$lambda$7(this.f$0);
                return true;
            }
        }, 1, null);
        SemanticsPropertiesKt.onLongClick$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda9
            @Override // h.g.a.a
            public final Object invoke() {
                TextFieldDecoratorModifierNode.applySemantics$lambda$8(this.f$0);
                return true;
            }
        }, 1, null);
        if (!TextRange.m10540getCollapsedimpl(jM3484getSelectiond9O1mEE) && !this.isPassword) {
            SemanticsPropertiesKt.copyText$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda10
                @Override // h.g.a.a
                public final Object invoke() {
                    TextFieldDecoratorModifierNode.applySemantics$lambda$9(this.f$0);
                    return true;
                }
            }, 1, null);
            if (this.enabled && !this.readOnly) {
                SemanticsPropertiesKt.cutText$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda11
                    @Override // h.g.a.a
                    public final Object invoke() {
                        TextFieldDecoratorModifierNode.applySemantics$lambda$10(this.f$0);
                        return true;
                    }
                }, 1, null);
            }
        }
        if (z) {
            SemanticsPropertiesKt.pasteText$default(semanticsPropertyReceiver, null, new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    TextFieldDecoratorModifierNode.applySemantics$lambda$11(this.f$0);
                    return true;
                }
            }, 1, null);
        }
        InputTransformation inputTransformation = this.filter;
        if (inputTransformation != null) {
            inputTransformation.applySemantics(semanticsPropertyReceiver);
        }
        if (this.enabled) {
            this.focusableNode.applySemantics(semanticsPropertyReceiver);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        if (getAutofillHighlightOn()) {
            TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this;
            DrawScope.CC.m8835drawRectAsUm42w$default(contentDrawScope, AutofillHighlightKt.m3205resolveAutofillHighlightWkMShQ((Brush) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, AutofillHighlightKt.getLocalAutofillHighlightBrush()), ((Color) CompositionLocalConsumerModifierNodeKt.currentValueOf(textFieldDecoratorModifierNode, AutofillHighlightKt.getLocalAutofillHighlightColor())).m8238unboximpl(), AutofillHighlight_androidKt.autofillHighlightColor()), 0L, 0L, 0.0f, null, null, 0, 126, null);
        }
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode, androidx.compose.ui.modifier.ModifierLocalReadScope
    public /* synthetic */ Object getCurrent(ModifierLocal modifierLocal) {
        return ModifierLocalModifierNode.CC.$default$getCurrent(this, modifierLocal);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final InputTransformation getFilter() {
        return this.filter;
    }

    public final MutableInteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    public final KeyboardActionHandler getKeyboardActionHandler() {
        return this.keyboardActionHandler;
    }

    public final KeyboardOptions getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ ModifierLocalMap getProvidedValues() {
        return EmptyMap.INSTANCE;
    }

    public final boolean getReadOnly() {
        return this.readOnly;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public boolean getShouldMergeDescendantSemantics() {
        return true;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public final bm<ab> getStylusHandwritingTrigger() {
        return this.stylusHandwritingTrigger;
    }

    public final TextFieldSelectionState getTextFieldSelectionState() {
        return this.textFieldSelectionState;
    }

    public final TransformedTextFieldState getTextFieldState() {
        return this.textFieldState;
    }

    public final TextLayoutState getTextLayoutState() {
        return this.textLayoutState;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: getTouchBoundsExpansion-RZrCHBk */
    public /* synthetic */ long mo1935getTouchBoundsExpansionRZrCHBk() {
        return TouchBoundsExpansion.Companion.m10170getNoneRZrCHBk();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return false;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean isImportantForBounds() {
        return true;
    }

    public final boolean isPassword() {
        return this.isPassword;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
        this.textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
        if (this.enabled) {
            delegate(this.focusableNode);
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        this.pointerInputNode.onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node, androidx.compose.ui.node.DelegatableNode, androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onDensityChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeInputSession();
        this.textFieldSelectionState.setReceiveContentConfiguration(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setDecoratorNodeCoordinates(layoutCoordinates);
        if (this.enabled) {
            this.focusableNode.onGloballyPositioned(layoutCoordinates);
        }
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onKeyEvent-ZmokQxo */
    public boolean mo1939onKeyEventZmokQxo(KeyEvent keyEvent) {
        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
        TextLayoutState textLayoutState = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState = this.textFieldSelectionState;
        SoftwareKeyboardController softwareKeyboardControllerRequireKeyboardController = requireKeyboardController();
        boolean z = false;
        if (this.enabled && !this.readOnly) {
            z = true;
        }
        p<? super KeyCommand, ? super Boolean, ? extends ab> pVar = this.clipboardKeyCommandsHandler;
        return this.textFieldKeyEventHandler.mo3511onKeyEvent8zsqlwg(keyEvent, transformedTextFieldState, textLayoutState, textFieldSelectionState, pVar, softwareKeyboardControllerRequireKeyboardController, z, this.singleLine, new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda25
            @Override // h.g.a.a
            public final Object invoke() {
                TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f$0;
                return Boolean.valueOf(textFieldDecoratorModifierNode.m3670onImeActionPerformedKlQnJC8(textFieldDecoratorModifierNode.keyboardOptions.m3336getImeActionOrDefaulteUduSuo$foundation()));
            }
        });
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        updateWindowFocus();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    public void onPlaced(LayoutCoordinates layoutCoordinates) {
        this.dragAndDropNode.onPlaced(layoutCoordinates);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* renamed from: onPointerEvent-H0pRuoY */
    public void mo1940onPointerEventH0pRuoY(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2) {
        this.pointerInputNode.mo1940onPointerEventH0pRuoY(pointerEvent, pointerEventPass, j2);
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    /* renamed from: onPreKeyEvent-ZmokQxo */
    public boolean mo1941onPreKeyEventZmokQxo(KeyEvent keyEvent) {
        return this.textFieldKeyEventHandler.m3675onPreKeyEventMyFupTE(keyEvent, this.textFieldState, this.textFieldSelectionState, (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFocusManager()), requireKeyboardController());
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode, androidx.compose.ui.node.MeasuredSizeAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo2116onRemeasuredozmzZPI(long j2) {
        this.dragAndDropNode.mo2116onRemeasuredozmzZPI(j2);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ void onViewConfigurationChange() {
        onCancelPointerInput();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    public /* synthetic */ void provide(ModifierLocal modifierLocal, Object obj) {
        ModifierLocalModifierNode.CC.$default$provide(this, modifierLocal, obj);
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setFilter(InputTransformation inputTransformation) {
        this.filter = inputTransformation;
    }

    public final void setInteractionSource(MutableInteractionSource mutableInteractionSource) {
        this.interactionSource = mutableInteractionSource;
    }

    public final void setKeyboardActionHandler(KeyboardActionHandler keyboardActionHandler) {
        this.keyboardActionHandler = keyboardActionHandler;
    }

    public final void setKeyboardOptions(KeyboardOptions keyboardOptions) {
        this.keyboardOptions = keyboardOptions;
    }

    public final void setPassword(boolean z) {
        this.isPassword = z;
    }

    public final void setReadOnly(boolean z) {
        this.readOnly = z;
    }

    public final void setSingleLine(boolean z) {
        this.singleLine = z;
    }

    public final void setStylusHandwritingTrigger(bm<ab> bmVar) {
        this.stylusHandwritingTrigger = bmVar;
    }

    public final void setTextFieldSelectionState(TextFieldSelectionState textFieldSelectionState) {
        this.textFieldSelectionState = textFieldSelectionState;
    }

    public final void setTextFieldState(TransformedTextFieldState transformedTextFieldState) {
        this.textFieldState = transformedTextFieldState;
    }

    public final void setTextLayoutState(TextLayoutState textLayoutState) {
        this.textLayoutState = textLayoutState;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public /* synthetic */ boolean sharePointerInputWithSiblings() {
        return false;
    }

    public final void updateNode(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, TextFieldSelectionState textFieldSelectionState, InputTransformation inputTransformation, boolean z, boolean z2, KeyboardOptions keyboardOptions, KeyboardActionHandler keyboardActionHandler, boolean z3, MutableInteractionSource mutableInteractionSource, boolean z4, bm<ab> bmVar) {
        TextFieldSelectionState textFieldSelectionState2;
        boolean z5;
        br brVar;
        boolean z6 = this.enabled;
        boolean z7 = z6 && !this.readOnly;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        KeyboardOptions keyboardOptions2 = this.keyboardOptions;
        TextFieldSelectionState textFieldSelectionState3 = this.textFieldSelectionState;
        MutableInteractionSource mutableInteractionSource2 = this.interactionSource;
        boolean z8 = this.isPassword;
        bm<ab> bmVar2 = this.stylusHandwritingTrigger;
        if (!z || z2) {
            textFieldSelectionState2 = textFieldSelectionState3;
            z5 = false;
        } else {
            textFieldSelectionState2 = textFieldSelectionState3;
            z5 = true;
        }
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.filter = inputTransformation;
        this.enabled = z;
        this.readOnly = z2;
        this.keyboardOptions = keyboardOptions;
        this.keyboardActionHandler = keyboardActionHandler;
        this.singleLine = z3;
        this.interactionSource = mutableInteractionSource;
        this.isPassword = z4;
        this.stylusHandwritingTrigger = bmVar;
        if (z5 != z7 || !x.n(transformedTextFieldState, transformedTextFieldState2) || !x.n(keyboardOptions, keyboardOptions2) || !x.n(bmVar, bmVar2)) {
            if (z5 && (isFocused() || this.inputSessionJob != null)) {
                startInputSession(false);
            } else if (!z5) {
                disposeInputSession();
            }
        }
        if (z != z6 || z5 != z7 || !ImeAction.m10717equalsimpl0(keyboardOptions.m3336getImeActionOrDefaulteUduSuo$foundation(), keyboardOptions2.m3336getImeActionOrDefaulteUduSuo$foundation()) || z4 != z8) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (!x.n(textFieldSelectionState, textFieldSelectionState2)) {
            this.pointerInputNode.resetPointerInputHandler();
            if (isAttached()) {
                textFieldSelectionState.setReceiveContentConfiguration(this.receiveContentConfigurationProvider);
                if (isFocused() && (brVar = this.toolbarAndHandlesVisibilityObserverJob) != null) {
                    brVar.s(null);
                    this.toolbarAndHandlesVisibilityObserverJob = aj.z(getCoroutineScope(), null, null, new C03091(textFieldSelectionState, null), 3);
                }
            }
            textFieldSelectionState.setRequestAutofillAction(new a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda13
                @Override // h.g.a.a
                public final Object invoke() {
                    return TextFieldDecoratorModifierNode.updateNode$lambda$0(this.f$0);
                }
            });
        }
        if (!x.n(mutableInteractionSource, mutableInteractionSource2)) {
            this.pointerInputNode.resetPointerInputHandler();
            if (this.focusableNode.isAttached()) {
                this.focusableNode.update(mutableInteractionSource);
            }
        }
        if (z != z6) {
            FocusableNode focusableNode = this.focusableNode;
            if (!z) {
                undelegate(focusableNode);
            } else {
                delegate(focusableNode);
                this.focusableNode.update(mutableInteractionSource);
            }
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }
}
