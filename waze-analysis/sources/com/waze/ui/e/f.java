package com.waze.ui.e;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.media3.muxer.MuxerUtil;
import com.waze.sharedrive.g.ag;
import java.util.Iterator;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class f implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f42201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f42205e;

    /* renamed from: f, reason: collision with root package name */
    private final /* synthetic */ int f42206f;

    public /* synthetic */ f(h.g.a.a aVar, Brush brush, float f2, h.g.a.a aVar2, Brush brush2, int i2) {
        this.f42206f = i2;
        this.f42203c = aVar;
        this.f42204d = brush;
        this.f42201a = f2;
        this.f42202b = aVar2;
        this.f42205e = brush2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.af] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        if (this.f42206f == 0) {
            aj.z(this.f42202b, null, null, new j((v) this.f42203c, (h.c.e) null, 1, (byte[]) null), 3);
            w.h(this.f42201a, ((Offset) obj).m7990unboximpl());
            Iterator it = w.u(this.f42204d).iterator();
            if (it.hasNext()) {
                throw null;
            }
            this.f42205e.setValue(null);
            return h.ab.f48028a;
        }
        ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
        float f2 = this.f42201a;
        int i2 = ag.f38615a;
        h.g.b.x.f(contentDrawScope, "$this$onDrawWithContent");
        contentDrawScope.drawContent();
        if (((Boolean) this.f42203c.invoke()).booleanValue()) {
            DrawScope.CC.m8835drawRectAsUm42w$default(contentDrawScope, (Brush) this.f42204d, 0L, Size.m8042copyxjbvk4A$default(contentDrawScope.mo8751getSizeNHjbRc(), f2, 0.0f, 2, null), 0.0f, null, null, 0, 122, null);
        }
        if (((Boolean) this.f42202b.invoke()).booleanValue()) {
            DrawScope.CC.m8835drawRectAsUm42w$default(contentDrawScope, (Brush) this.f42205e, (Float.floatToRawIntBits(Float.intBitsToFloat((int) (contentDrawScope.mo8751getSizeNHjbRc() >> 32)) - f2) << 32) | (MuxerUtil.UNSIGNED_INT_MAX_VALUE & Float.floatToRawIntBits(0.0f)), Size.m8042copyxjbvk4A$default(contentDrawScope.mo8751getSizeNHjbRc(), f2, 0.0f, 2, null), 0.0f, null, null, 0, 120, null);
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ f(af afVar, float f2, v vVar, MutableState mutableState, MutableState mutableState2, int i2) {
        this.f42206f = i2;
        this.f42202b = afVar;
        this.f42201a = f2;
        this.f42203c = vVar;
        this.f42204d = mutableState;
        this.f42205e = mutableState2;
    }
}
