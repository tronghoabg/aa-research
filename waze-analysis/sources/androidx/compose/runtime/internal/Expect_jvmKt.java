package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.p;
import h.g.b.au;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class Expect_jvmKt {
    public static final void invokeComposable(Composer composer, p<? super Composer, ? super Integer, ab> pVar) {
        x.d(pVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        au.h(pVar, 2);
        pVar.invoke(composer, 1);
    }
}
