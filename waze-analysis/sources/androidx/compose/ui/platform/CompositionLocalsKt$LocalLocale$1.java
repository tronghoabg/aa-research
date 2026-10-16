package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.ui.text.intl.Locale;
import h.a.i;
import h.g.a.l;
import h.g.b.y;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class CompositionLocalsKt$LocalLocale$1 extends y implements l<CompositionLocalAccessorScope, Locale> {
    public static final CompositionLocalsKt$LocalLocale$1 INSTANCE = new CompositionLocalsKt$LocalLocale$1();

    CompositionLocalsKt$LocalLocale$1() {
        super(1);
    }

    @Override // h.g.a.l
    public final Locale invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
        return (Locale) i.O((Iterable) compositionLocalAccessorScope.getCurrentValue(CompositionLocalsKt.getLocalLocaleList()));
    }
}
