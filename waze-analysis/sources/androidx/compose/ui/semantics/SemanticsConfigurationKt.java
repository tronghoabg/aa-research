package androidx.compose.ui.semantics;

import h.g.a.a;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SemanticsConfigurationKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.semantics.SemanticsConfigurationKt$getOrNull$1, reason: invalid class name */
    final class AnonymousClass1 extends y implements a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // h.g.a.a
        public final Object invoke() {
            return null;
        }
    }

    public static final <T> T getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey<T> semanticsPropertyKey) {
        return (T) semanticsConfiguration.getOrElseNullable(semanticsPropertyKey, AnonymousClass1.INSTANCE);
    }
}
