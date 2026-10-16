package androidx.compose.material3.internal;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import h.g.a.s;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$2 extends u implements s<Float, Float, Float, Size, Path, Path> {
    IndeterminateCircularWavyProgressNode$cacheDrawNode$1$1$2(Object obj) {
        super(5, obj, IndeterminateCircularWavyProgressNode.class, "trackPathProvider", "trackPathProvider-yzxVdVo(FFFJLandroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", 0);
    }

    @Override // h.g.a.s
    public /* bridge */ /* synthetic */ Path invoke(Float f2, Float f3, Float f4, Size size, Path path) {
        Path path2 = path;
        m6276invokeyzxVdVo(f2.floatValue(), f3.floatValue(), f4.floatValue(), size.m8054unboximpl(), path2);
        return path2;
    }

    /* renamed from: invoke-yzxVdVo, reason: not valid java name */
    public final Path m6276invokeyzxVdVo(float f2, float f3, float f4, long j2, Path path) {
        ((IndeterminateCircularWavyProgressNode) this.receiver).m6218trackPathProvideryzxVdVo(f2, f3, f4, j2, path);
        return path;
    }
}
