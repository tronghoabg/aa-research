package androidx.compose.ui.node;

import h.ab;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class BackwardsCompatNodeKt$onDrawCacheReadsChanged$1 extends y implements l<BackwardsCompatNode, ab> {
    public static final BackwardsCompatNodeKt$onDrawCacheReadsChanged$1 INSTANCE = new BackwardsCompatNodeKt$onDrawCacheReadsChanged$1();

    BackwardsCompatNodeKt$onDrawCacheReadsChanged$1() {
        super(1);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(BackwardsCompatNode backwardsCompatNode) {
        invoke2(backwardsCompatNode);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BackwardsCompatNode backwardsCompatNode) {
        backwardsCompatNode.onDrawCacheReadsChanged$ui();
    }
}
