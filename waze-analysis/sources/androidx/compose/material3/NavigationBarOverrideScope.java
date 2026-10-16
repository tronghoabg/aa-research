package androidx.compose.material3;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.q;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class NavigationBarOverrideScope {
    public static final int $stable = 0;
    private final long containerColor;
    private final q<RowScope, Composer, Integer, ab> content;
    private final long contentColor;
    private final Modifier modifier;
    private final float tonalElevation;
    private final WindowInsets windowInsets;

    public /* synthetic */ NavigationBarOverrideScope(Modifier.Companion companion, long j2, long j3, float f2, WindowInsets windowInsets, q qVar, int i2, o oVar) {
        this((i2 & 1) != 0 ? Modifier.Companion : companion, j2, j3, f2, windowInsets, qVar, null);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5266getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    public final q<RowScope, Composer, Integer, ab> getContent() {
        return this.content;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m5267getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m5268getTonalElevationD9Ej5fM() {
        return this.tonalElevation;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public /* synthetic */ NavigationBarOverrideScope(Modifier modifier, long j2, long j3, float f2, WindowInsets windowInsets, q qVar, o oVar) {
        this(modifier, j2, j3, f2, windowInsets, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NavigationBarOverrideScope(Modifier modifier, long j2, long j3, float f2, WindowInsets windowInsets, q<? super RowScope, ? super Composer, ? super Integer, ab> qVar) {
        this.modifier = modifier;
        this.containerColor = j2;
        this.contentColor = j3;
        this.tonalElevation = f2;
        this.windowInsets = windowInsets;
        this.content = qVar;
    }
}
