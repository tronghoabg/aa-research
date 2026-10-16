package androidx.compose.material;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ContentAlphaKt {
    private static final ProvidableCompositionLocal<Float> LocalContentAlpha = CompositionLocalKt.compositionLocalOf$default(null, new a() { // from class: androidx.compose.material.ContentAlphaKt$$ExternalSyntheticLambda0
        @Override // h.g.a.a
        public final Object invoke() {
            int i2 = ContentAlphaKt.f1656a;
            return Float.valueOf(1.0f);
        }
    }, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1656a = 0;

    static final float LocalContentAlpha$lambda$0() {
        return 1.0f;
    }

    public static final ProvidableCompositionLocal<Float> getLocalContentAlpha() {
        return LocalContentAlpha;
    }
}
