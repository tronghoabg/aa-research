package androidx.compose.foundation.gestures;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerEvent_androidKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.b.a.f;
import h.c.e;
import h.c.j;
import h.g.a.l;
import h.g.a.p;
import java.util.List;
import kotlinx.coroutines.a.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TransformableKt {
    public static final float SCROLL_FACTOR = 545.0f;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2, reason: invalid class name */
    final class AnonymousClass2 extends f implements p<AwaitPointerEventScope, e<? super ab>, Object> {
        final /* synthetic */ o<TransformEvent> $channel;
        final /* synthetic */ j $currentContext;
        final /* synthetic */ ScrollConfig $scrollConfig;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(j jVar, ScrollConfig scrollConfig, o<TransformEvent> oVar, e<? super AnonymousClass2> eVar) {
            super(2, eVar);
            this.$currentContext = jVar;
            this.$scrollConfig = scrollConfig;
            this.$channel = oVar;
        }

        static final boolean invokeSuspend$lambda$0(PointerInputChange pointerInputChange) {
            return true;
        }

        static final boolean invokeSuspend$lambda$1(PointerInputChange pointerInputChange) {
            return true;
        }

        static final boolean invokeSuspend$lambda$3(PointerInputChange pointerInputChange) {
            return true;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentContext, this.$scrollConfig, this.$channel, eVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // h.g.a.p
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, e<? super ab> eVar) {
            return ((AnonymousClass2) create(awaitPointerEventScope, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        
            if (r9 != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
        
            if (r9 == r0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0110, code lost:
        
            if (r9 == r0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x015a, code lost:
        
            if (r9 == r0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0172, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:58:0x017b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007c -> B:27:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d4 -> B:54:0x0169). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00d6 -> B:35:0x008b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0118 -> B:54:0x0169). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011a -> B:42:0x00e9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x015a -> B:50:0x015c). Please report as a decompilation issue!!! */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 382
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.gestures.TransformableKt$detectZoom$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        float F$0;
        float F$1;
        float F$2;
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return TransformableKt.detectZoom(null, false, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset consumePointerEventAsCtrlScrollOrNull(AwaitPointerEventScope awaitPointerEventScope, PointerEvent pointerEvent, ScrollConfig scrollConfig) {
        long jM7996getZeroF1C5BW0;
        if (!PointerEvent_androidKt.m9572isCtrlPressed5xRPYO0(pointerEvent.m9540getKeyboardModifiersk7X9c1A())) {
            return null;
        }
        if (!PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9563getScroll7fucELk()) && !PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9557getPanStart7fucELk()) && !PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9556getPanMove7fucELk()) && !PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9555getPanEnd7fucELk())) {
            return null;
        }
        long jMo2148calculateMouseWheelScroll8xgXZGE = scrollConfig.mo2148calculateMouseWheelScroll8xgXZGE(awaitPointerEventScope, pointerEvent, awaitPointerEventScope.mo9479getSizeYbymL2g());
        PointerInputChange pointerInputChange = (PointerInputChange) i.R(pointerEvent.getChanges());
        if (pointerInputChange != null) {
            long jM9607getPanOffsetF1C5BW0 = pointerInputChange.m9607getPanOffsetF1C5BW0() ^ (-9223372034707292160L);
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            Offset offsetM7969boximpl = Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0());
            int size = historical.size();
            for (int i2 = 0; i2 < size; i2++) {
                offsetM7969boximpl = Offset.m7969boximpl(Offset.m7984minusMKHz9U(offsetM7969boximpl.m7990unboximpl(), historical.get(i2).m9508getPanOffsetF1C5BW0()));
            }
            jM7996getZeroF1C5BW0 = Offset.m7985plusMKHz9U(jM9607getPanOffsetF1C5BW0, offsetM7969boximpl.m7990unboximpl());
        } else {
            jM7996getZeroF1C5BW0 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        long jM7985plusMKHz9U = Offset.m7985plusMKHz9U(jMo2148calculateMouseWheelScroll8xgXZGE, jM7996getZeroF1C5BW0);
        if (Offset.m7977equalsimpl0(jM7985plusMKHz9U, Offset.Companion.m7996getZeroF1C5BW0())) {
            return null;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size2 = changes.size();
        for (int i3 = 0; i3 < size2; i3++) {
            changes.get(i3).consume();
        }
        return Offset.m7969boximpl(jM7985plusMKHz9U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Offset consumePointerEventAsPanOrNull(AwaitPointerEventScope awaitPointerEventScope, PointerEvent pointerEvent) {
        long jM7996getZeroF1C5BW0;
        if (!PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9557getPanStart7fucELk()) && !PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9556getPanMove7fucELk()) && !PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9555getPanEnd7fucELk())) {
            return null;
        }
        PointerInputChange pointerInputChange = (PointerInputChange) i.R(pointerEvent.getChanges());
        if (pointerInputChange != null) {
            long jM9607getPanOffsetF1C5BW0 = pointerInputChange.m9607getPanOffsetF1C5BW0() ^ (-9223372034707292160L);
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            Offset offsetM7969boximpl = Offset.m7969boximpl(Offset.Companion.m7996getZeroF1C5BW0());
            int size = historical.size();
            for (int i2 = 0; i2 < size; i2++) {
                offsetM7969boximpl = Offset.m7969boximpl(Offset.m7984minusMKHz9U(offsetM7969boximpl.m7990unboximpl(), historical.get(i2).m9508getPanOffsetF1C5BW0()));
            }
            jM7996getZeroF1C5BW0 = Offset.m7985plusMKHz9U(jM9607getPanOffsetF1C5BW0, offsetM7969boximpl.m7990unboximpl());
        } else {
            jM7996getZeroF1C5BW0 = Offset.Companion.m7996getZeroF1C5BW0();
        }
        if (Offset.m7977equalsimpl0(jM7996getZeroF1C5BW0, Offset.Companion.m7996getZeroF1C5BW0())) {
            return null;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size2 = changes.size();
        for (int i3 = 0; i3 < size2; i3++) {
            changes.get(i3).consume();
        }
        return Offset.m7969boximpl(jM7996getZeroF1C5BW0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float consumePointerEventAsScaleOrNull(AwaitPointerEventScope awaitPointerEventScope, PointerEvent pointerEvent) {
        if (!PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9562getScaleStart7fucELk()) && !PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9560getScaleChange7fucELk()) && !PointerEventType.m9548equalsimpl0(pointerEvent.m9541getType7fucELk(), PointerEventType.Companion.m9561getScaleEnd7fucELk())) {
            return null;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        float scaleFactor = 1.0f;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            scaleFactor *= pointerInputChange.getScaleFactor();
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size2 = historical.size();
            for (int i3 = 0; i3 < size2; i3++) {
                scaleFactor *= historical.get(i3).getScaleFactor();
            }
        }
        if (scaleFactor == 1.0f) {
            return null;
        }
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size3 = changes2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            changes2.get(i4).consume();
        }
        return Float.valueOf(scaleFactor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectNonTouchGestures(PointerInputScope pointerInputScope, o<TransformEvent> oVar, ScrollConfig scrollConfig, e<? super ab> eVar) {
        Object objAwaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new AnonymousClass2(eVar.getContext(), scrollConfig, oVar, null), eVar);
        return objAwaitPointerEventScope == a.f48038a ? objAwaitPointerEventScope : ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0315, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0151, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r0.m9541getType7fucELk(), androidx.compose.ui.input.pointer.PointerEventType.Companion.m9557getPanStart7fucELk()) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0161, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r0.m9541getType7fucELk(), androidx.compose.ui.input.pointer.PointerEventType.Companion.m9556getPanMove7fucELk()) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0171, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r0.m9541getType7fucELk(), androidx.compose.ui.input.pointer.PointerEventType.Companion.m9555getPanEnd7fucELk()) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0181, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r0.m9541getType7fucELk(), androidx.compose.ui.input.pointer.PointerEventType.Companion.m9562getScaleStart7fucELk()) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0191, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r0.m9541getType7fucELk(), androidx.compose.ui.input.pointer.PointerEventType.Companion.m9560getScaleChange7fucELk()) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a1, code lost:
    
        if (androidx.compose.ui.input.pointer.PointerEventType.m9548equalsimpl0(r0.m9541getType7fucELk(), androidx.compose.ui.input.pointer.PointerEventType.Companion.m9561getScaleEnd7fucELk()) != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01a4, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0313, code lost:
    
        if (r6 != 0) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x031a A[EDGE_INSN: B:115:0x031a->B:102:0x031a BREAK  A[LOOP:0: B:96:0x0305->B:101:0x0317], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0143 A[EDGE_INSN: B:119:0x0143->B:30:0x0143 BREAK  A[LOOP:2: B:25:0x0131->B:29:0x0140], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0307  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x02e5 -> B:95:0x02f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r30, boolean r31, kotlinx.coroutines.a.o<androidx.compose.foundation.gestures.TransformEvent> r32, h.g.a.l<? super androidx.compose.ui.geometry.Offset, java.lang.Boolean> r33, h.c.e<? super h.ab> r34) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, kotlinx.coroutines.a.o, h.g.a.l, h.c.e):java.lang.Object");
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, l<? super Offset, Boolean> lVar, boolean z, boolean z2) {
        return modifier.then(new TransformableElement(transformableState, lVar, z, z2));
    }

    static final boolean transformable$lambda$0(Offset offset) {
        return true;
    }

    public static final Modifier transformable(Modifier modifier, TransformableState transformableState, boolean z, boolean z2) {
        return transformable(modifier, transformableState, new l() { // from class: androidx.compose.foundation.gestures.TransformableKt$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return true;
            }
        }, z, z2);
    }
}
