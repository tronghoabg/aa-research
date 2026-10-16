package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import h.ab;
import h.g.a.p;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ShortNavigationBarOverrideScope {
    public static final int $stable = 0;
    private final int arrangement;
    private final long containerColor;
    private final p<Composer, Integer, ab> content;
    private final long contentColor;
    private final Modifier modifier;
    private final WindowInsets windowInsets;

    /* JADX WARN: Multi-variable type inference failed */
    private ShortNavigationBarOverrideScope(Modifier modifier, long j2, long j3, WindowInsets windowInsets, int i2, p<? super Composer, ? super Integer, ab> pVar) {
        this.modifier = modifier;
        this.containerColor = j2;
        this.contentColor = j3;
        this.windowInsets = windowInsets;
        this.arrangement = i2;
        this.content = pVar;
    }

    /* renamed from: getArrangement-LnnQw40, reason: not valid java name */
    public final int m5554getArrangementLnnQw40() {
        return this.arrangement;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m5555getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    public final p<Composer, Integer, ab> getContent() {
        return this.content;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name */
    public final long m5556getContentColor0d7_KjU() {
        return this.contentColor;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final WindowInsets getWindowInsets() {
        return this.windowInsets;
    }

    public /* synthetic */ ShortNavigationBarOverrideScope(Modifier modifier, long j2, long j3, WindowInsets windowInsets, int i2, p pVar, o oVar) {
        this(modifier, j2, j3, windowInsets, i2, pVar);
    }
}
