package androidx.compose.ui.graphics.vector;

import h.ab;
import h.g.a.p;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$1 extends y implements p<PathComponent, String, ab> {
    public static final VectorComposeKt$Path$2$1 INSTANCE = new VectorComposeKt$Path$2$1();

    VectorComposeKt$Path$2$1() {
        super(2);
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ ab invoke(PathComponent pathComponent, String str) {
        invoke2(pathComponent, str);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PathComponent pathComponent, String str) {
        pathComponent.setName(str);
    }
}
