package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NavigationRailOverrideScope {
    public static final int $stable = 0;
    private final long containerColor;
    private final q<ColumnScope, Composer, Integer, ab> content;
    private final long contentColor;
    private final q<ColumnScope, Composer, Integer, ab> header;
    private final Modifier modifier;
    private final WindowInsets windowInsets;

    public /* synthetic */ NavigationRailOverrideScope(Modifier.Companion companion, long j2, long j3, q qVar, WindowInsets windowInsets, q qVar2, int i2, o oVar) {
        this((i2 & 1) != 0 ? Modifier.Companion : companion, j2, j3, qVar, windowInsets, qVar2, null);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5341getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    public final q<ColumnScope, Composer, Integer, ab> getContent() {
        return this.content;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m5342getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final q<ColumnScope, Composer, Integer, ab> getHeader() {
        return this.header;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public /* synthetic */ NavigationRailOverrideScope(Modifier modifier, long j2, long j3, q qVar, WindowInsets windowInsets, q qVar2, o oVar) {
        this(modifier, j2, j3, qVar, windowInsets, qVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NavigationRailOverrideScope(Modifier modifier, long j2, long j3, q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar, WindowInsets windowInsets, q<? super ColumnScope, ? super Composer, ? super Integer, ab> qVar2) {
        this.modifier = modifier;
        this.containerColor = j2;
        this.contentColor = j3;
        this.header = qVar;
        this.windowInsets = windowInsets;
        this.content = qVar2;
    }
}
