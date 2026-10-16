package com.waze.z.a;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.ui.unit.Density;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class ah implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f45631a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45632b;

    public /* synthetic */ ah(float f2, int i2) {
        this.f45632b = i2;
        this.f45631a = f2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        int i2 = this.f45632b;
        if (i2 == 0) {
            DraggableAnchorsConfig draggableAnchorsConfig = (DraggableAnchorsConfig) obj;
            draggableAnchorsConfig.at(ae.f45619a, 0.0f);
            draggableAnchorsConfig.at(ae.f45620b, -this.f45631a);
            return h.ab.f48028a;
        }
        if (i2 == 1) {
            return aj.g(this.f45631a, (Density) obj);
        }
        if (i2 != 2) {
            DraggableAnchorsConfig draggableAnchorsConfig2 = (DraggableAnchorsConfig) obj;
            h.g.b.x.f(draggableAnchorsConfig2, "$this$DraggableAnchors");
            draggableAnchorsConfig2.at(com.waze.ui.w.b.bd.f43641a, 0.0f);
            draggableAnchorsConfig2.at(com.waze.ui.w.b.bd.f43643c, this.f45631a);
            return h.ab.f48028a;
        }
        DraggableAnchorsConfig draggableAnchorsConfig3 = (DraggableAnchorsConfig) obj;
        h.g.b.x.f(draggableAnchorsConfig3, "$this$DraggableAnchors");
        draggableAnchorsConfig3.at(com.waze.notifications.c.a.f32573b, -this.f45631a);
        draggableAnchorsConfig3.at(com.waze.notifications.c.a.f32572a, 0.0f);
        return h.ab.f48028a;
    }
}
