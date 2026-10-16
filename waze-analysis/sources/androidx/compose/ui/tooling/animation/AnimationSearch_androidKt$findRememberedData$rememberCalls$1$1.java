package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.data.Group;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 implements l<Group, Boolean> {
    public static final AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 INSTANCE = new AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1();

    @Override // h.g.a.l
    public final Boolean invoke(Group group) {
        return Boolean.valueOf(x.n(group.getName(), "remember"));
    }
}
