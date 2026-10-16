package androidx.compose.ui.platform;

import androidx.compose.ui.text.intl.LocaleList;
import androidx.core.os.ConfigurationCompat;
import androidx.core.os.LocaleListCompat;
import h.g.a.a;
import h.g.b.x;
import h.g.b.y;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidComposeView$localeList$2 extends y implements a<LocaleList> {
    final /* synthetic */ AndroidComposeView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidComposeView$localeList$2(AndroidComposeView androidComposeView) {
        super(0);
        this.this$0 = androidComposeView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final LocaleList invoke() {
        LocaleListCompat locales = ConfigurationCompat.getLocales(this.this$0.getConfiguration());
        if (locales.isEmpty()) {
            locales = LocaleListCompat.getDefault();
        }
        int size = locales.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            Locale locale = locales.get(i2);
            if (locale == null) {
                x.g();
            }
            arrayList.add(new androidx.compose.ui.text.intl.Locale(locale));
        }
        return new LocaleList(arrayList);
    }
}
