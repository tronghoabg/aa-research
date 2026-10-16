package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.b.l;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    private final ComposeInputMethodManager composeImm;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private boolean monitorEnabled;
    private br monitorJob;
    private final af monitorScope;
    private final TransformedTextFieldState textFieldState;
    private final TextLayoutState textLayoutState;
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    private final float[] matrix = Matrix.m8492constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CursorAnchorInfoController.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final CursorAnchorInfoController cursorAnchorInfoController = CursorAnchorInfoController.this;
                k kVarD = ai.D(ai.X(SnapshotStateKt.snapshotFlow(new h.g.a.a() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return cursorAnchorInfoController.calculateCursorAnchorInfo();
                    }
                })));
                final CursorAnchorInfoController cursorAnchorInfoController2 = CursorAnchorInfoController.this;
                this.label = 1;
                if (kVarD.collect(new l() { // from class: androidx.compose.foundation.text.input.internal.CursorAnchorInfoController.startOrStopMonitoring.1.2
                    public final Object emit(CursorAnchorInfo cursorAnchorInfo, e<? super ab> eVar) {
                        cursorAnchorInfoController2.composeImm.updateCursorAnchorInfo(cursorAnchorInfo);
                        return ab.f48028a;
                    }

                    @Override // kotlinx.coroutines.b.l
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, e eVar) {
                        return emit((CursorAnchorInfo) obj2, (e<? super ab>) eVar);
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
            return ab.f48028a;
        }
    }

    public CursorAnchorInfoController(TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, af afVar) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.composeImm = composeInputMethodManager;
        this.monitorScope = afVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo calculateCursorAnchorInfo() {
        LayoutCoordinates coreNodeCoordinates;
        LayoutCoordinates decoratorNodeCoordinates;
        TextLayoutResult layoutResult;
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (true != textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (coreNodeCoordinates = this.textLayoutState.getCoreNodeCoordinates()) != null) {
                if (true != coreNodeCoordinates.isAttached()) {
                    coreNodeCoordinates = null;
                }
                if (coreNodeCoordinates != null && (decoratorNodeCoordinates = this.textLayoutState.getDecoratorNodeCoordinates()) != null) {
                    if (true != decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates != null && (layoutResult = this.textLayoutState.getLayoutResult()) != null) {
                        TransformedTextFieldState transformedTextFieldState = this.textFieldState;
                        float[] fArr = this.matrix;
                        TextFieldCharSequence visualText = transformedTextFieldState.getVisualText();
                        Matrix.m8501resetimpl(fArr);
                        textLayoutNodeCoordinates.mo9751transformToScreen58bKbWc(this.matrix);
                        AndroidMatrixConversions_androidKt.m8095setFromEL8BTi8(this.androidMatrix, this.matrix);
                        return CursorAnchorInfoBuilder_androidKt.m3522buildvxqZcH0(this.builder, visualText, visualText.m3484getSelectiond9O1mEE(), visualText.m3483getCompositionMzsxiRA(), layoutResult, this.androidMatrix, SelectionManagerKt.visibleBounds(coreNodeCoordinates).m8017translatek4lQ0M(textLayoutNodeCoordinates.mo9744localPositionOfR5De75A(coreNodeCoordinates, Offset.Companion.m7996getZeroF1C5BW0())), SelectionManagerKt.visibleBounds(decoratorNodeCoordinates).m8017translatek4lQ0M(textLayoutNodeCoordinates.mo9744localPositionOfR5De75A(decoratorNodeCoordinates, Offset.Companion.m7996getZeroF1C5BW0())), this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds);
                    }
                }
            }
        }
        return null;
    }

    private final void startOrStopMonitoring() {
        boolean z = this.monitorEnabled;
        br brVar = this.monitorJob;
        if (!z) {
            if (brVar != null) {
                brVar.s(null);
            }
            this.monitorJob = null;
        } else if (brVar == null || !brVar.bZ()) {
            this.monitorJob = aj.z(this.monitorScope, null, ag.f51345d, new AnonymousClass1(null), 1);
        }
    }

    public final void requestUpdates(int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z5 = (i2 & 16) != 0;
            boolean z6 = (i2 & 8) != 0;
            boolean z7 = (i2 & 4) != 0;
            boolean z8 = Build.VERSION.SDK_INT >= 34 && (i2 & 32) != 0;
            if (z5 || z6 || z7 || z8) {
                z3 = z5;
                z4 = z6;
                z = z7;
            } else {
                z3 = true;
                z4 = true;
                z = true;
                if (Build.VERSION.SDK_INT >= 34) {
                    z2 = true;
                }
            }
            z2 = z8;
        } else {
            z = false;
            z2 = false;
            z3 = true;
            z4 = true;
        }
        requestUpdates(1 == (i2 & 1), (i2 & 2) != 0, z3, z4, z, z2);
    }

    private final void requestUpdates(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.includeInsertionMarker = z3;
        this.includeCharacterBounds = z4;
        this.includeEditorBounds = z5;
        this.includeLineBounds = z6;
        if (z) {
            this.hasPendingImmediateRequest = true;
            CursorAnchorInfo cursorAnchorInfoCalculateCursorAnchorInfo = calculateCursorAnchorInfo();
            if (cursorAnchorInfoCalculateCursorAnchorInfo != null) {
                this.composeImm.updateCursorAnchorInfo(cursorAnchorInfoCalculateCursorAnchorInfo);
            }
        }
        this.monitorEnabled = z2;
        startOrStopMonitoring();
    }
}
