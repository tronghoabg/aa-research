package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import h.ab;
import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class RectListDebuggerModifierNode extends Modifier.Node implements DrawModifierNode {
    private Paint paint;
    private Object token;

    public RectListDebuggerModifierNode() {
        androidx.compose.ui.graphics.Paint Paint = AndroidPaint_androidKt.Paint();
        Paint.mo8104setColor8_81llA(Color.Companion.m8262getRed0d7_KjU());
        Paint.mo8108setStylek9PVt8s(PaintingStyle.Companion.m8539getStrokeTiuSbCo());
        this.paint = AndroidPaint_androidKt.getNativePaint(Paint);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        RectList rects = DelegatableNodeKt.requireOwner(this).getRectManager().getRects();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(contentDrawScope.getDrawContext().getCanvas());
        Paint paint = this.paint;
        long[] jArr = rects.items;
        int i2 = rects.itemsSize;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            long j2 = jArr[i3];
            long j3 = jArr[i3 + 1];
            long j4 = jArr[i3 + 2];
            nativeCanvas.drawRect((int) (j2 >> 32), (int) j2, (int) (j3 >> 32), (int) j3, paint);
        }
    }

    public final Object getToken() {
        return this.token;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        RectManager rectManager = DelegatableNodeKt.requireOwner(this).getRectManager();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        rectManager.registerOnChangedCallback(anonymousClass1);
        this.token = anonymousClass1;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        DelegatableNodeKt.requireOwner(this).getRectManager().unregisterOnChangedCallback(this.token);
    }

    public final void setToken(Object obj) {
        this.token = obj;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.spatial.RectListDebuggerModifierNode$onAttach$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a<ab> {
        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            DrawModifierNodeKt.invalidateDraw(RectListDebuggerModifierNode.this);
        }

        @Override // h.g.a.a
        public /* bridge */ /* synthetic */ ab invoke() {
            invoke2();
            return ab.f48028a;
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
    }
}
