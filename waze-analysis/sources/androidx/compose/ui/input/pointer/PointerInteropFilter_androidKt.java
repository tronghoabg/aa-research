package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PointerInteropFilter_androidKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$3, reason: invalid class name */
    final class AnonymousClass3 extends y implements l<MotionEvent, Boolean> {
        final /* synthetic */ AndroidViewHolder $view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(AndroidViewHolder androidViewHolder) {
            super(1);
            this.$view = androidViewHolder;
        }

        @Override // h.g.a.l
        public final Boolean invoke(MotionEvent motionEvent) {
            boolean zDispatchTouchEvent;
            int actionMasked = motionEvent.getActionMasked();
            AndroidViewHolder androidViewHolder = this.$view;
            switch (actionMasked) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    zDispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                    break;
                default:
                    zDispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                    break;
            }
            return Boolean.valueOf(zDispatchTouchEvent);
        }
    }

    public static final Modifier motionEventSpy(Modifier modifier, final l<? super MotionEvent, ab> lVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, lVar, new PointerInputEventHandler() { // from class: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.motionEventSpy.1

            /* compiled from: WazeSource */
            /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1, reason: invalid class name and collision with other inner class name */
            final class C00891 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
                final /* synthetic */ l<MotionEvent, ab> $watcher;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C00891(l<? super MotionEvent, ab> lVar, e<? super C00891> eVar) {
                    super(2, eVar);
                    this.$watcher = lVar;
                }

                @Override // h.c.b.a.a
                public final e<ab> create(Object obj, e<?> eVar) {
                    C00891 c00891 = new C00891(this.$watcher, eVar);
                    c00891.L$0 = obj;
                    return c00891;
                }

                @Override // h.g.a.p
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
                    return ((C00891) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0030 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
                @Override // h.c.b.a.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                    /*
                        r4 = this;
                        h.c.a.a r0 = h.c.a.a.f48038a
                        int r1 = r4.label
                        r2 = 1
                        if (r1 == 0) goto L19
                        if (r1 != r2) goto L11
                        java.lang.Object r1 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        e.b.c.b(r5)
                        goto L31
                    L11:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L19:
                        e.b.c.b(r5)
                        java.lang.Object r5 = r4.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r5 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r5
                        r1 = r5
                    L21:
                        androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r3 = r4
                        h.c.e r3 = (h.c.e) r3
                        r4.L$0 = r1
                        r4.label = r2
                        java.lang.Object r5 = r1.awaitPointerEvent(r5, r3)
                        if (r5 != r0) goto L31
                        return r0
                    L31:
                        androidx.compose.ui.input.pointer.PointerEvent r5 = (androidx.compose.ui.input.pointer.PointerEvent) r5
                        android.view.MotionEvent r5 = r5.getMotionEvent()
                        if (r5 == 0) goto L21
                        h.g.a.l<android.view.MotionEvent, h.ab> r3 = r4.$watcher
                        r3.invoke(r5)
                        goto L21
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt.AnonymousClass1.C00891.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, e<? super ab> eVar) {
                pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
                Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new C00891(lVar, null), eVar);
                return objAwaitPointerEventScope == a.f48038a ? objAwaitPointerEventScope : ab.f48028a;
            }
        });
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, AndroidViewHolder androidViewHolder) {
        PointerInteropFilter pointerInteropFilter = new PointerInteropFilter();
        pointerInteropFilter.setOnTouchEvent(new AnonymousClass3(androidViewHolder));
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = new RequestDisallowInterceptTouchEvent();
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(requestDisallowInterceptTouchEvent);
        androidViewHolder.setOnRequestDisallowInterceptTouchEvent$ui(requestDisallowInterceptTouchEvent);
        return modifier.then(pointerInteropFilter);
    }

    public static /* synthetic */ Modifier pointerInteropFilter$default(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, l lVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            requestDisallowInterceptTouchEvent = null;
        }
        return pointerInteropFilter(modifier, requestDisallowInterceptTouchEvent, lVar);
    }

    public static final Modifier pointerInteropFilter(Modifier modifier, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent, l<? super MotionEvent, Boolean> lVar) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new PointerInteropFilter_androidKt$pointerInteropFilter$$inlined$debugInspectorInfo$1(requestDisallowInterceptTouchEvent, lVar) : InspectableValueKt.getNoInspectorInfo(), new AnonymousClass2(lVar, requestDisallowInterceptTouchEvent));
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2, reason: invalid class name */
    final class AnonymousClass2 extends y implements q<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ l<MotionEvent, Boolean> $onTouchEvent;
        final /* synthetic */ RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super MotionEvent, Boolean> lVar, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
            super(3);
            this.$onTouchEvent = lVar;
            this.$requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            composer.startReplaceGroup(374375707);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(374375707, i2, -1, "androidx.compose.ui.input.pointer.pointerInteropFilter.<anonymous> (PointerInteropFilter.android.kt:78)");
            }
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = new PointerInteropFilter();
                composer.updateRememberedValue(objRememberedValue);
            }
            PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) objRememberedValue;
            pointerInteropFilter.setOnTouchEvent(this.$onTouchEvent);
            pointerInteropFilter.setRequestDisallowInterceptTouchEvent(this.$requestDisallowInterceptTouchEvent);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return pointerInteropFilter;
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }
    }
}
