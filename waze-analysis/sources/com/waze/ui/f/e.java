package com.waze.ui.f;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.media3.muxer.MuxerUtil;
import com.waze.search.v2.cu;
import com.waze.ui.l.bh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class e implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f42295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42297c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42298d;

    public /* synthetic */ e(h.g.a.l lVar, Density density, float f2, int i2) {
        this.f42298d = i2;
        this.f42297c = lVar;
        this.f42296b = density;
        this.f42295a = f2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11, types: [com.waze.ui.l.ad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v13, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v9, types: [com.waze.ui.l.ad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.ui.l.ad, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.waze.ui.l.ad, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) throws Throwable {
        DrawScope drawScope;
        int i2 = this.f42298d;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = cu.f36302a;
                this.f42297c.invoke(Dp.m11162boximpl(this.f42296b.mo2124toDpu2uoSUM((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & ((IntSize) obj).m11343unboximpl())) + this.f42295a));
                return h.ab.f48028a;
            }
            if (i2 == 2) {
                float f2 = this.f42295a;
                return bh.a(this.f42296b, this.f42297c, f2, (ConstrainScope) obj);
            }
            if (i2 != 3) {
                this.f42296b.setValue(Dp.m11162boximpl(this.f42297c.mo2124toDpu2uoSUM((int) (MuxerUtil.UNSIGNED_INT_MAX_VALUE & ((IntSize) obj).m11343unboximpl())) + this.f42295a));
                return h.ab.f48028a;
            }
            float f3 = this.f42295a;
            return bh.b(this.f42296b, this.f42297c, f3, (ConstrainScope) obj);
        }
        DrawScope drawScope2 = (DrawScope) obj;
        h.g.b.x.f(drawScope2, "$this$onDrawBehind");
        float fFloatValue = ((Number) this.f42296b.getValue()).floatValue() * Float.intBitsToFloat((int) (drawScope2.mo8751getSizeNHjbRc() >> 32));
        drawScope2.getDrawContext().getTransform().translate(fFloatValue, 0.0f);
        float f4 = this.f42295a;
        Object obj2 = this.f42297c;
        float f5 = -fFloatValue;
        try {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope2.mo8751getSizeNHjbRc() & MuxerUtil.UNSIGNED_INT_MAX_VALUE));
            drawScope = drawScope2;
            try {
                DrawScope.CC.m8835drawRectAsUm42w$default(drawScope, (Brush) obj2, 0L, (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(fIntBitsToFloat)) | (Float.floatToRawIntBits(f4) << 32), 0.0f, null, null, 0, 122, null);
                drawScope.getDrawContext().getTransform().translate(f5, 0.0f);
                return h.ab.f48028a;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                drawScope.getDrawContext().getTransform().translate(f5, 0.0f);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            drawScope = drawScope2;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, float f2, int i2) {
        this.f42298d = i2;
        this.f42296b = obj;
        this.f42297c = obj2;
        this.f42295a = f2;
    }
}
