package com.waze.ui.z;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintSetScope;
import androidx.media3.muxer.MuxerUtil;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class k implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f43969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f43970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f43971c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f43972d;

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ int f43973e;

    public /* synthetic */ k(float f2, List list, float f3, State state, int i2) {
        this.f43973e = i2;
        this.f43969a = f2;
        this.f43971c = list;
        this.f43970b = f3;
        this.f43972d = state;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f43973e != 0) {
            ConstraintSetScope constraintSetScope = (ConstraintSetScope) obj;
            h.g.b.x.f(constraintSetScope, "$this$ConstraintSet");
            ConstrainedLayoutReference constrainedLayoutReferenceCreateRefFor = constraintSetScope.createRefFor("slot1");
            ConstrainedLayoutReference constrainedLayoutReferenceCreateRefFor2 = constraintSetScope.createRefFor("slot2");
            float f2 = this.f43969a;
            Object obj2 = this.f43971c;
            Object obj3 = this.f43972d;
            constraintSetScope.constrain(constrainedLayoutReferenceCreateRefFor, new com.waze.ui.f.e(obj3, obj2, f2, 2));
            constraintSetScope.constrain(constrainedLayoutReferenceCreateRefFor2, new com.waze.ui.f.e(obj2, obj3, this.f43970b, 3));
            return h.ab.f48028a;
        }
        DrawScope drawScope = (DrawScope) obj;
        h.g.b.x.f(drawScope, "$this$onDrawBehind");
        float fFloatValue = ((Number) this.f43972d.getValue()).floatValue();
        float f3 = this.f43969a;
        float f4 = fFloatValue * f3;
        float f5 = (f4 + f4) - f3;
        DrawScope.CC.m8835drawRectAsUm42w$default(drawScope, Brush.Companion.m8177linearGradientmHitzGk$default(Brush.Companion, (List) this.f43971c, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(0.0f) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), (Float.floatToRawIntBits(f5 + f3) << 32) | (Float.floatToRawIntBits(this.f43970b) & MuxerUtil.UNSIGNED_INT_MAX_VALUE), 0, 8, (Object) null), 0L, 0L, 0.0f, null, null, 0, 126, null);
        return h.ab.f48028a;
    }

    public /* synthetic */ k(com.waze.ui.l.ad adVar, com.waze.ui.l.ad adVar2, float f2, float f3, int i2) {
        this.f43973e = i2;
        this.f43972d = adVar;
        this.f43971c = adVar2;
        this.f43969a = f2;
        this.f43970b = f3;
    }
}
