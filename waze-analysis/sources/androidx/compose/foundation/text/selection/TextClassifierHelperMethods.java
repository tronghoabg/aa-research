package androidx.compose.foundation.text.selection;

import android.content.Context;
import android.os.LocaleList;
import android.support.v4.app.j$$ExternalSyntheticApiModelOutline1;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import androidx.compose.ui.text.intl.Locale;
import h.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextClassifierHelperMethods {
    public static final int $stable = 0;
    public static final TextClassifierHelperMethods INSTANCE = new TextClassifierHelperMethods();

    /* compiled from: WazeSource */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelectedTextType.values().length];
            try {
                iArr[SelectedTextType.EditableText.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectedTextType.StaticText.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextClassifierHelperMethods() {
    }

    public final TextClassifier createTextClassificationSession(Context context, SelectedTextType selectedTextType) {
        String str;
        TextClassificationManager textClassificationManagerM65m = j$$ExternalSyntheticApiModelOutline1.m65m(context.getSystemService(j$$ExternalSyntheticApiModelOutline1.m80m$1()));
        SelectedTextType selectedTextType2 = SelectedTextType.EditableText;
        int iOrdinal = selectedTextType.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                throw new i();
            }
            str = "textview";
        }
        return textClassificationManagerM65m.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public final boolean hasLegacyAssistItem$foundation(TextClassification textClassification) {
        if (textClassification.getIcon() == null && TextUtils.isEmpty(textClassification.getLabel())) {
            return false;
        }
        return (textClassification.getIntent() == null && textClassification.getOnClickListener() == null) ? false : true;
    }

    public final LocaleList toAndroidLocaleList(androidx.compose.ui.text.intl.LocaleList localeList) {
        androidx.compose.ui.text.intl.LocaleList localeList2 = localeList;
        ArrayList arrayList = new ArrayList(h.a.i.q(localeList2, 10));
        Iterator<Locale> it = localeList2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getPlatformLocale());
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return new LocaleList((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }
}
