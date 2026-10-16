package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import h.g.a.t;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$1 extends u implements t<Float, Float, Float, Size, Boolean, Path, Path> {
    IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$1(Object obj) {
        super(6, obj, IndeterminateCircularWavyProgressNode.class, "progressPathProvider", "progressPathProvider-wzdHmys(FFFJZLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", 0);
    }

    @Override // h.g.a.t
    public /* bridge */ /* synthetic */ Path invoke(Float f2, Float f3, Float f4, Size size, Boolean bool, Path path) {
        return m6275invokewzdHmys(f2.floatValue(), f3.floatValue(), f4.floatValue(), size.m8054unboximpl(), bool.booleanValue(), path);
    }

    /* renamed from: invoke-wzdHmys, reason: not valid java name */
    public final Path m6275invokewzdHmys(float f2, float f3, float f4, long j2, boolean z, Path path) {
        ((IndeterminateCircularWavyProgressNode) this.receiver).m6212progressPathProviderwzdHmys(f2, f3, f4, j2, z, path);
        return path;
    }
}
