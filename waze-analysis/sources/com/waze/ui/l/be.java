package com.waze.ui.l;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class be implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Measurer2 f42572a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f42573b;

    public be(Measurer2 measurer2, int i2) {
        this.f42573b = i2;
        this.f42572a = measurer2;
    }

    @Override // h.g.a.l
    public final /* synthetic */ Object invoke(Object obj) {
        if (this.f42573b != 0) {
            ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, this.f42572a);
            return h.ab.f48028a;
        }
        ToolingUtilsKt.setDesignInfoProvider((SemanticsPropertyReceiver) obj, this.f42572a);
        return h.ab.f48028a;
    }
}
