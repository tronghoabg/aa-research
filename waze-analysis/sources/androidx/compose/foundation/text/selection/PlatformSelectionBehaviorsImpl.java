package androidx.compose.foundation.text.selection;

import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.g.a.l;
import h.g.a.p;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.i;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PlatformSelectionBehaviorsImpl implements PlatformSelectionBehaviors {
    public static final int $stable = 8;
    private final Context context;
    private final j coroutineContext;
    private final LocaleList localeList;
    private final SelectedTextType selectedTextType;
    private TextClassifier textClassificationSession;
    private final a mutex = i.c();
    private final MutableState textClassificationResult$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    private final Object AssistantItemKey = new Object();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements p<af, e, Object> {
        final /* synthetic */ p<TextClassifier, e, Object> $block;
        Object L$0;
        Object L$1;
        int label;

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1, reason: invalid class name */
        final class AnonymousClass1 extends g implements p<af, e, Object> {
            final /* synthetic */ p<TextClassifier, e, Object> $block;
            final /* synthetic */ TextClassifier $textClassificationSession;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(TextClassifier textClassifier, p<? super TextClassifier, ? super e, ? extends Object> pVar, e<? super AnonymousClass1> eVar) {
                super(2, eVar);
                this.$textClassificationSession = textClassifier;
                this.$block = pVar;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new AnonymousClass1(this.$textClassificationSession, this.$block, eVar);
            }

            @Override // h.g.a.p
            public final Object invoke(af afVar, e eVar) {
                return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
            }

            @Override // h.c.b.a.a
            public final Object invokeSuspend(Object obj) {
                h.c.a.a aVar = h.c.a.a.f48038a;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                    return obj;
                }
                c.b(obj);
                TextClassifier textClassifier = this.$textClassificationSession;
                if (textClassifier == null) {
                    return null;
                }
                p<TextClassifier, e, Object> pVar = this.$block;
                this.label = 1;
                Object objInvoke = pVar.invoke(textClassifier, this);
                return objInvoke == aVar ? aVar : objInvoke;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(p<? super TextClassifier, ? super e, ? extends Object> pVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$block = pVar;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return PlatformSelectionBehaviorsImpl.this.new AnonymousClass2(this.$block, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e eVar) {
            return ((AnonymousClass2) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[RETURN] */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r9.label
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L34
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                e.b.c.b(r10)
                return r10
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L1c:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.h.a r1 = (kotlinx.coroutines.h.a) r1
                e.b.c.b(r10)     // Catch: java.lang.Throwable -> L24
                goto L78
            L24:
                r9 = move-exception
                goto La6
            L27:
                java.lang.Object r1 = r9.L$1
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl r1 = (androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl) r1
                java.lang.Object r4 = r9.L$0
                kotlinx.coroutines.h.a r4 = (kotlinx.coroutines.h.a) r4
                e.b.c.b(r10)
                r10 = r4
                goto L4c
            L34:
                e.b.c.b(r10)
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl r1 = androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.this
                kotlinx.coroutines.h.a r10 = androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.access$getMutex$p(r1)
                r6 = r9
                h.c.e r6 = (h.c.e) r6
                r9.L$0 = r10
                r9.L$1 = r1
                r9.label = r4
                java.lang.Object r4 = r10.lock(r5, r6)
                if (r4 == r0) goto Laa
            L4c:
                android.view.textclassifier.TextClassifier r4 = androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.access$getTextClassificationSession$p(r1)     // Catch: java.lang.Throwable -> La4
                if (r4 == 0) goto L58
                boolean r6 = android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0.m(r4)     // Catch: java.lang.Throwable -> La4
                if (r6 == 0) goto L7d
            L58:
                h.o.c r4 = h.o.a.f48264a     // Catch: java.lang.Throwable -> La4
                h.o.d r4 = h.o.d.f48272c     // Catch: java.lang.Throwable -> La4
                r6 = 300(0x12c, double:1.48E-321)
                long r6 = h.o.c.j(r6, r4)     // Catch: java.lang.Throwable -> La4
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1 r4 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$textClassificationSession$1$1     // Catch: java.lang.Throwable -> La4
                r4.<init>(r1, r5)     // Catch: java.lang.Throwable -> La4
                h.g.a.p r4 = (h.g.a.p) r4     // Catch: java.lang.Throwable -> La4
                r9.L$0 = r10     // Catch: java.lang.Throwable -> La4
                r9.L$1 = r5     // Catch: java.lang.Throwable -> La4
                r9.label = r3     // Catch: java.lang.Throwable -> La4
                java.lang.Object r1 = kotlinx.coroutines.aj.J(r6, r4, r9)     // Catch: java.lang.Throwable -> La4
                if (r1 == r0) goto Laa
                r8 = r1
                r1 = r10
                r10 = r8
            L78:
                android.view.textclassifier.TextClassifier r4 = android.support.v4.app.j$$ExternalSyntheticApiModelOutline1.m66m(r10)     // Catch: java.lang.Throwable -> L24
                r10 = r1
            L7d:
                r10.unlock(r5)
                h.o.c r10 = h.o.a.f48264a
                r6 = 200(0xc8, double:9.9E-322)
                h.o.d r10 = h.o.d.f48272c
                long r6 = h.o.c.j(r6, r10)
                h.g.a.p<android.view.textclassifier.TextClassifier, h.c.e, java.lang.Object> r10 = r9.$block
                androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1 r1 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$requireTextClassificationSession$2$1
                r1.<init>(r4, r10, r5)
                h.g.a.p r1 = (h.g.a.p) r1
                r10 = r9
                h.c.e r10 = (h.c.e) r10
                r9.L$0 = r5
                r9.L$1 = r5
                r9.label = r2
                java.lang.Object r9 = kotlinx.coroutines.aj.J(r6, r1, r10)
                if (r9 != r0) goto La3
                goto Laa
            La3:
                return r9
            La4:
                r9 = move-exception
                r1 = r10
            La6:
                r1.unlock(r5)
                throw r9
            Laa:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public PlatformSelectionBehaviorsImpl(j jVar, Context context, SelectedTextType selectedTextType, LocaleList localeList) {
        this.coroutineContext = jVar;
        this.context = context;
        this.selectedTextType = selectedTextType;
        this.localeList = localeList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ab, code lost:
    
        if (r7.lock(null, r0) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: classifyText-M8tDOmk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m3857classifyTextM8tDOmk(java.lang.CharSequence r7, long r8, android.view.textclassifier.TextClassifier r10, h.c.e<? super h.ab> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1 r0 = (androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1 r0 = new androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$classifyText$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.h.a r7 = (kotlinx.coroutines.h.a) r7
            java.lang.Object r8 = r0.L$0
            androidx.compose.foundation.text.selection.TextClassificationResult r8 = (androidx.compose.foundation.text.selection.TextClassificationResult) r8
            e.b.c.b(r11)
            goto Lad
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            long r8 = r0.J$0
            java.lang.Object r7 = r0.L$2
            kotlinx.coroutines.h.a r7 = (kotlinx.coroutines.h.a) r7
            java.lang.Object r10 = r0.L$1
            android.view.textclassifier.TextClassifier r10 = android.support.v4.app.j$$ExternalSyntheticApiModelOutline1.m66m(r10)
            java.lang.Object r2 = r0.L$0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            e.b.c.b(r11)
            r11 = r7
            r7 = r2
            goto L67
        L52:
            e.b.c.b(r11)
            kotlinx.coroutines.h.a r11 = r6.mutex
            r0.L$0 = r7
            r0.L$1 = r10
            r0.L$2 = r11
            r0.J$0 = r8
            r0.label = r4
            java.lang.Object r2 = r11.lock(r5, r0)
            if (r2 == r1) goto Lc0
        L67:
            androidx.compose.foundation.text.selection.TextClassificationResult r2 = r6.getTextClassificationResult$foundation()     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto L79
            boolean r2 = androidx.compose.foundation.text.selection.PlatformSelectionBehaviors_androidKt.m3862access$canReuseh5sm0ck(r2, r7, r8)     // Catch: java.lang.Throwable -> Lbb
            if (r2 != r4) goto L79
            h.ab r6 = h.ab.f48028a     // Catch: java.lang.Throwable -> Lbb
            r11.unlock(r5)
            return r6
        L79:
            r11.unlock(r5)
            android.view.textclassifier.TextClassification$Request$Builder r11 = new android.view.textclassifier.TextClassification$Request$Builder
            int r2 = androidx.compose.ui.text.TextRange.m10544getMinimpl(r8)
            int r4 = androidx.compose.ui.text.TextRange.m10543getMaximpl(r8)
            r11.<init>(r7, r2, r4)
            android.os.LocaleList r2 = r6.getAndroidLocalList()
            android.view.textclassifier.TextClassification$Request$Builder r11 = android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0.m(r11, r2)
            android.view.textclassifier.TextClassification$Request r11 = android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0.m(r11)
            android.view.textclassifier.TextClassification r10 = android.support.v7.widget.be$$ExternalSyntheticApiModelOutline0.m(r10, r11)
            androidx.compose.foundation.text.selection.TextClassificationResult r8 = r6.m3858createTextClassificationResultSbBc2M(r7, r8, r10)
            kotlinx.coroutines.h.a r7 = r6.mutex
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r9 = r7.lock(r5, r0)
            if (r9 == r1) goto Lc0
        Lad:
            r6.setTextClassificationResult$foundation(r8)     // Catch: java.lang.Throwable -> Lb6
            r7.unlock(r5)
            h.ab r6 = h.ab.f48028a
            return r6
        Lb6:
            r6 = move-exception
            r7.unlock(r5)
            throw r6
        Lbb:
            r6 = move-exception
            r11.unlock(r5)
            throw r6
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl.m3857classifyTextM8tDOmk(java.lang.CharSequence, long, android.view.textclassifier.TextClassifier, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextClassificationResult-Sb-Bc2M, reason: not valid java name */
    public final TextClassificationResult m3858createTextClassificationResultSbBc2M(CharSequence charSequence, long j2, TextClassification textClassification) {
        Icon icon;
        int size = textClassification.getActions().size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = textClassification.getActions().get(i2);
            RemoteAction remoteActionM = j$$ExternalSyntheticApiModelOutline1.m(obj);
            Drawable drawableLoadDrawable = null;
            if (i2 != 0 && !remoteActionM.shouldShowIcon()) {
                obj = null;
            }
            RemoteAction remoteActionM2 = j$$ExternalSyntheticApiModelOutline1.m(obj);
            if (remoteActionM2 != null && (icon = remoteActionM2.getIcon()) != null) {
                drawableLoadDrawable = icon.loadDrawable(this.context);
            }
            arrayList.add(drawableLoadDrawable);
        }
        return new TextClassificationResult(charSequence, j2, textClassification, arrayList, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.os.LocaleList getAndroidLocalList() {
        LocaleList localeList = this.localeList;
        return localeList != null ? TextClassifierHelperMethods.INSTANCE.toAndroidLocaleList(localeList) : new android.os.LocaleList(Locale.Companion.getCurrent().getPlatformLocale());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onShowContextMenuOrSelectionToolbar-Sb-Bc2M, reason: not valid java name */
    public final Object m3859onShowContextMenuOrSelectionToolbarSbBc2M(CharSequence charSequence, long j2, e<? super ab> eVar) {
        return (charSequence.length() == 0 || TextRange.m10540getCollapsedimpl(j2)) ? ab.f48028a : requireTextClassificationSession(new PlatformSelectionBehaviorsImpl$onShowContextMenuOrSelectionToolbar$2(this, charSequence, j2, null), eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> Object requireTextClassificationSession(p<? super TextClassifier, ? super e<? super T>, ? extends Object> pVar, e<? super T> eVar) {
        return aj.v(this.coroutineContext, new AnonymousClass2(pVar, null), eVar);
    }

    /* renamed from: addSmartSelectionTextContextMenuItems-YmzfRxQ$foundation, reason: not valid java name */
    public final void m3860addSmartSelectionTextContextMenuItemsYmzfRxQ$foundation(TextContextMenuBuilderScope textContextMenuBuilderScope, CharSequence charSequence, long j2, l<? super TextContextMenuBuilderScope, ab> lVar) {
        TextClassificationResult textClassificationResultM3861tryGetTextClassificationResultFDrldGo = m3861tryGetTextClassificationResultFDrldGo(charSequence, j2);
        if (textClassificationResultM3861tryGetTextClassificationResultFDrldGo == null) {
            lVar.invoke(textContextMenuBuilderScope);
            return;
        }
        TextClassification textClassification = textClassificationResultM3861tryGetTextClassificationResultFDrldGo.getTextClassification();
        if (!textClassification.getActions().isEmpty()) {
            TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.AssistantItemKey, textClassification, 0, textClassificationResultM3861tryGetTextClassificationResultFDrldGo.getIcons().get(0));
        } else if (TextClassifierHelperMethods.INSTANCE.hasLegacyAssistItem$foundation(textClassification)) {
            TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.AssistantItemKey, textClassification, -1, textClassification.getIcon());
        }
        lVar.invoke(textContextMenuBuilderScope);
        List actions = textClassification.getActions();
        int size = actions.size();
        for (int i2 = 0; i2 < size; i2++) {
            j$$ExternalSyntheticApiModelOutline1.m(actions.get(i2));
            if (i2 > 0) {
                TextContextMenuBuilderScope_androidKt.textClassificationItem(textContextMenuBuilderScope, this.AssistantItemKey, textClassification, i2, textClassificationResultM3861tryGetTextClassificationResultFDrldGo.getIcons().get(i2));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextClassificationResult getTextClassificationResult$foundation() {
        return (TextClassificationResult) this.textClassificationResult$delegate.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* renamed from: onShowContextMenu-_2OEclM */
    public Object mo3851onShowContextMenu_2OEclM(CharSequence charSequence, long j2, Offset offset, e<? super ab> eVar) {
        Object objM3859onShowContextMenuOrSelectionToolbarSbBc2M = m3859onShowContextMenuOrSelectionToolbarSbBc2M(charSequence, j2, eVar);
        return objM3859onShowContextMenuOrSelectionToolbarSbBc2M == h.c.a.a.f48038a ? objM3859onShowContextMenuOrSelectionToolbarSbBc2M : ab.f48028a;
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* renamed from: onShowSelectionToolbar-Sb-Bc2M */
    public Object mo3852onShowSelectionToolbarSbBc2M(CharSequence charSequence, long j2, e<? super ab> eVar) {
        Object objM3859onShowContextMenuOrSelectionToolbarSbBc2M = m3859onShowContextMenuOrSelectionToolbarSbBc2M(charSequence, j2, eVar);
        return objM3859onShowContextMenuOrSelectionToolbarSbBc2M == h.c.a.a.f48038a ? objM3859onShowContextMenuOrSelectionToolbarSbBc2M : ab.f48028a;
    }

    public final void setTextClassificationResult$foundation(TextClassificationResult textClassificationResult) {
        this.textClassificationResult$delegate.setValue(textClassificationResult);
    }

    @Override // androidx.compose.foundation.text.selection.PlatformSelectionBehaviors
    /* renamed from: suggestSelectionForLongPressOrDoubleClick-pYaCw-w */
    public Object mo3853suggestSelectionForLongPressOrDoubleClickpYaCww(CharSequence charSequence, long j2, e<? super TextRange> eVar) {
        if (charSequence.length() == 0 || TextRange.m10540getCollapsedimpl(j2)) {
            return null;
        }
        return requireTextClassificationSession(new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(charSequence, j2, this, null), eVar);
    }

    /* renamed from: tryGetTextClassificationResult-FDrldGo, reason: not valid java name */
    public final TextClassificationResult m3861tryGetTextClassificationResultFDrldGo(CharSequence charSequence, long j2) {
        TextClassificationResult textClassificationResult = null;
        if (!this.mutex.tryLock(null)) {
            return null;
        }
        TextClassificationResult textClassificationResult$foundation = getTextClassificationResult$foundation();
        if (textClassificationResult$foundation != null && PlatformSelectionBehaviors_androidKt.m3864canReuseh5sm0ck(textClassificationResult$foundation, charSequence, j2)) {
            textClassificationResult = textClassificationResult$foundation;
        }
        this.mutex.unlock(null);
        return textClassificationResult;
    }

    public static /* synthetic */ void getTextClassificationResult$foundation$annotations() {
    }
}
