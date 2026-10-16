package androidx.compose.ui.text.intl;

import h.g.b.x;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidLocaleDelegateAPI23 implements PlatformLocaleDelegate {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    public LocaleList getCurrent() {
        List listSingletonList = Collections.singletonList(new Locale(java.util.Locale.getDefault()));
        x.e(listSingletonList, "singletonList(...)");
        return new LocaleList((List<Locale>) listSingletonList);
    }
}
