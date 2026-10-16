package com.waze.ui.e;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.waze.ui.af;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class i implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f42214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f42215b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f42216c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f42217d;

    public /* synthetic */ i(float f2, MutableState mutableState, MutableState mutableState2, int i2) {
        this.f42217d = i2;
        this.f42214a = f2;
        this.f42215b = mutableState;
        this.f42216c = mutableState2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f42217d != 0) {
            int iIntValue = ((Integer) obj2).intValue();
            float f2 = this.f42214a;
            Object obj3 = this.f42215b;
            return af.b((com.waze.ui.c) this.f42216c, (ModalBottomSheetState) obj3, f2, (Composer) obj, iIntValue);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        h.g.b.x.f(pointerInputChange, "change");
        pointerInputChange.consume();
        w.h(this.f42214a, pointerInputChange.m9608getPositionF1C5BW0());
        Iterator it = w.u(this.f42215b).iterator();
        if (it.hasNext()) {
            throw null;
        }
        ?? r2 = this.f42216c;
        if (!h.g.b.x.n(null, w.t(r2))) {
            r2.setValue(null);
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ i(com.waze.ui.c cVar, ModalBottomSheetState modalBottomSheetState, float f2, int i2) {
        this.f42217d = i2;
        this.f42216c = cVar;
        this.f42215b = modalBottomSheetState;
        this.f42214a = f2;
    }
}
