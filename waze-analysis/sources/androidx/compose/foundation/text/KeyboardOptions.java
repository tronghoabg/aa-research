package androidx.compose.foundation.text;

import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.compose.ui.text.intl.LocaleList;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (o) null);
    private static final KeyboardOptions SecureTextField = new KeyboardOptions(0, (Boolean) false, KeyboardType.Companion.m10815getPasswordPjHm6EE(), 0, (PlatformImeOptions) (null == true ? 1 : 0), (Boolean) (null == true ? 1 : 0), (LocaleList) null, 121, (o) null);
    private final Boolean autoCorrectEnabled;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final Boolean showKeyboardOnFocus;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i5, o oVar) {
        int iM10765getUnspecifiedIUNYP9k = (i5 & 1) != 0 ? KeyboardCapitalization.Companion.m10765getUnspecifiedIUNYP9k() : i2;
        Boolean bool3 = (i5 & 2) != 0 ? null : bool;
        int iM10824getUnspecifiedPjHm6EE = (i5 & 4) != 0 ? KeyboardType.Companion.m10824getUnspecifiedPjHm6EE() : i3;
        int iM10738getUnspecifiedeUduSuo = (i5 & 8) != 0 ? ImeAction.Companion.m10738getUnspecifiedeUduSuo() : i4;
        PlatformImeOptions platformImeOptions2 = (i5 & 16) != 0 ? null : platformImeOptions;
        Boolean bool4 = (i5 & 32) != 0 ? null : bool2;
        this(iM10765getUnspecifiedIUNYP9k, bool3, iM10824getUnspecifiedPjHm6EE, iM10738getUnspecifiedeUduSuo, platformImeOptions2, bool4, (i5 & 64) == 0 ? localeList : null, (o) null);
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m3324copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i2, boolean z, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m3330copy3m2b7yw(i2, z, i3, i4);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m3326copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        if ((i5 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i5 & 32) != 0) {
            bool = Boolean.valueOf(keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation());
        }
        if ((i5 & 64) != 0) {
            localeList = keyboardOptions.hintLocales;
        }
        Boolean bool2 = bool;
        LocaleList localeList2 = localeList;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i6 = i3;
        return keyboardOptions.m3332copyINvB4aQ(i2, z, i6, i4, platformImeOptions2, bool2, localeList2);
    }

    /* renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m3327copyij11fho$default(KeyboardOptions keyboardOptions, int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            z = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        if ((i5 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i6 = i3;
        return keyboardOptions.m3333copyij11fho(i2, z, i6, i4, platformImeOptions2);
    }

    private final boolean getAutoCorrectOrDefault() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: getCapitalizationOrDefault-IUNYP9k, reason: not valid java name */
    private final int m3328getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization keyboardCapitalizationM10750boximpl = KeyboardCapitalization.m10750boximpl(this.capitalization);
        if (true == KeyboardCapitalization.m10753equalsimpl0(keyboardCapitalizationM10750boximpl.m10756unboximpl(), KeyboardCapitalization.Companion.m10765getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM10750boximpl = null;
        }
        return keyboardCapitalizationM10750boximpl != null ? keyboardCapitalizationM10750boximpl.m10756unboximpl() : KeyboardCapitalization.Companion.m10763getNoneIUNYP9k();
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.Companion.getEmpty() : localeList;
    }

    /* renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m3329getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType keyboardTypeM10767boximpl = KeyboardType.m10767boximpl(this.keyboardType);
        if (true == KeyboardType.m10770equalsimpl0(keyboardTypeM10767boximpl.m10773unboximpl(), KeyboardType.Companion.m10824getUnspecifiedPjHm6EE())) {
            keyboardTypeM10767boximpl = null;
        }
        return keyboardTypeM10767boximpl != null ? keyboardTypeM10767boximpl.m10773unboximpl() : KeyboardType.Companion.m10822getTextPjHm6EE();
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m10753equalsimpl0(this.capitalization, KeyboardCapitalization.Companion.m10765getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m10770equalsimpl0(this.keyboardType, KeyboardType.Companion.m10824getUnspecifiedPjHm6EE()) && ImeAction.m10717equalsimpl0(this.imeAction, ImeAction.Companion.m10738getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation$default(KeyboardOptions keyboardOptions, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation(z);
    }

    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m3330copy3m2b7yw(int i2, boolean z, int i3, int i4) {
        return new KeyboardOptions(i2, Boolean.valueOf(z), i3, i4, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (o) null);
    }

    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m3332copyINvB4aQ(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        return new KeyboardOptions(i2, Boolean.valueOf(z), i3, i4, platformImeOptions, bool, localeList, (o) null);
    }

    /* renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m3333copyij11fho(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(i2, Boolean.valueOf(z), i3, i4, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (o) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return KeyboardCapitalization.m10753equalsimpl0(this.capitalization, keyboardOptions.capitalization) && x.n(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m10770equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m10717equalsimpl0(this.imeAction, keyboardOptions.imeAction) && x.n(this.platformImeOptions, keyboardOptions.platformImeOptions) && x.n(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && x.n(this.hintLocales, keyboardOptions.hintLocales);
    }

    public final KeyboardOptions fillUnspecifiedValuesWith$foundation(KeyboardOptions keyboardOptions) {
        if (keyboardOptions == null || keyboardOptions.isCompletelyUnspecified() || x.n(keyboardOptions, this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return keyboardOptions;
        }
        KeyboardCapitalization keyboardCapitalizationM10750boximpl = KeyboardCapitalization.m10750boximpl(this.capitalization);
        if (true == KeyboardCapitalization.m10753equalsimpl0(keyboardCapitalizationM10750boximpl.m10756unboximpl(), KeyboardCapitalization.Companion.m10765getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM10750boximpl = null;
        }
        int iM10756unboximpl = keyboardCapitalizationM10750boximpl != null ? keyboardCapitalizationM10750boximpl.m10756unboximpl() : keyboardOptions.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType keyboardTypeM10767boximpl = KeyboardType.m10767boximpl(this.keyboardType);
        if (true == KeyboardType.m10770equalsimpl0(keyboardTypeM10767boximpl.m10773unboximpl(), KeyboardType.Companion.m10824getUnspecifiedPjHm6EE())) {
            keyboardTypeM10767boximpl = null;
        }
        int iM10773unboximpl = keyboardTypeM10767boximpl != null ? keyboardTypeM10767boximpl.m10773unboximpl() : keyboardOptions.keyboardType;
        ImeAction imeActionM10714boximpl = ImeAction.m10714boximpl(this.imeAction);
        ImeAction imeAction = true != ImeAction.m10717equalsimpl0(imeActionM10714boximpl.m10720unboximpl(), ImeAction.Companion.m10738getUnspecifiedeUduSuo()) ? imeActionM10714boximpl : null;
        int iM10720unboximpl = imeAction != null ? imeAction.m10720unboximpl() : keyboardOptions.imeAction;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions == null) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.showKeyboardOnFocus;
        if (bool3 == null) {
            bool3 = keyboardOptions.showKeyboardOnFocus;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.hintLocales;
        if (localeList == null) {
            localeList = keyboardOptions.hintLocales;
        }
        return new KeyboardOptions(iM10756unboximpl, bool2, iM10773unboximpl, iM10720unboximpl, platformImeOptions2, bool4, localeList, (o) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m3334getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m3335getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getImeActionOrDefault-eUduSuo$foundation, reason: not valid java name */
    public final int m3336getImeActionOrDefaulteUduSuo$foundation() {
        ImeAction imeActionM10714boximpl = ImeAction.m10714boximpl(this.imeAction);
        if (true == ImeAction.m10717equalsimpl0(imeActionM10714boximpl.m10720unboximpl(), ImeAction.Companion.m10738getUnspecifiedeUduSuo())) {
            imeActionM10714boximpl = null;
        }
        return imeActionM10714boximpl != null ? imeActionM10714boximpl.m10720unboximpl() : ImeAction.Companion.m10730getDefaulteUduSuo();
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m3337getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final /* synthetic */ boolean getShouldShowKeyboardOnFocus() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Boolean getShowKeyboardOnFocus() {
        return this.showKeyboardOnFocus;
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public int hashCode() {
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = bool != null ? bool.hashCode() : 0;
        int i2 = this.capitalization;
        int i3 = this.keyboardType;
        int i4 = this.imeAction;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int iHashCode2 = platformImeOptions != null ? platformImeOptions.hashCode() : 0;
        int i5 = (((((i2 * 31) + iHashCode) * 31) + i3) * 31) + i4;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode3 = ((((i5 * 31) + iHashCode2) * 31) + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode3 + (localeList != null ? localeList.hashCode() : 0);
    }

    public final KeyboardOptions merge(KeyboardOptions keyboardOptions) {
        return keyboardOptions != null ? keyboardOptions.fillUnspecifiedValuesWith$foundation(this) : this;
    }

    public final ImeOptions toImeOptions$foundation(boolean z) {
        return new ImeOptions(z, m3328getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m3329getKeyboardTypeOrDefaultPjHm6EE(), m3336getImeActionOrDefaulteUduSuo$foundation(), this.platformImeOptions, getHintLocalesOrDefault(), (o) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m10755toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m10772toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m10719toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        public final KeyboardOptions getSecureTextField$foundation() {
            return KeyboardOptions.SecureTextField;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        public static /* synthetic */ void getDefault$annotations() {
        }

        public static /* synthetic */ void getSecureTextField$foundation$annotations() {
        }
    }

    public static /* synthetic */ void getAutoCorrect$annotations() {
    }

    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m3331copyINvB4aQ(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        return new KeyboardOptions(i2, bool, i3, i4, platformImeOptions, bool2, localeList, (o) null);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m3325copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i5, Object obj) {
        LocaleList localeList2;
        Boolean bool3;
        int i6;
        PlatformImeOptions platformImeOptions2;
        Boolean bool4;
        int i7;
        KeyboardOptions keyboardOptions2;
        int i8;
        if ((i5 & 1) != 0) {
            i2 = keyboardOptions.capitalization;
        }
        if ((i5 & 2) != 0) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        if ((i5 & 4) != 0) {
            i3 = keyboardOptions.keyboardType;
        }
        if ((i5 & 8) != 0) {
            i4 = keyboardOptions.imeAction;
        }
        if ((i5 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i5 & 32) != 0) {
            bool2 = null;
        }
        if ((i5 & 64) != 0) {
            localeList2 = null;
            platformImeOptions2 = platformImeOptions;
            bool3 = bool2;
            i7 = i3;
            i6 = i4;
            i8 = i2;
            bool4 = bool;
            keyboardOptions2 = keyboardOptions;
        } else {
            localeList2 = localeList;
            bool3 = bool2;
            i6 = i4;
            platformImeOptions2 = platformImeOptions;
            bool4 = bool;
            i7 = i3;
            keyboardOptions2 = keyboardOptions;
            i8 = i2;
        }
        return keyboardOptions2.m3331copyINvB4aQ(i8, bool4, i7, i6, platformImeOptions2, bool3, localeList2);
    }

    public /* synthetic */ KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, o oVar) {
        this(i2, bool, i3, i4, platformImeOptions, bool2, localeList);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, o oVar) {
        this(i2, z, i3, i4, platformImeOptions);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, o oVar) {
        this(i2, z, i3, i4, platformImeOptions, bool, localeList);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, o oVar) {
        this(i2, z, i3, i4);
    }

    private KeyboardOptions(int i2, Boolean bool, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.capitalization = i2;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i3;
        this.imeAction = i4;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    private KeyboardOptions(int i2, boolean z, int i3, int i4) {
        this(i2, Boolean.valueOf(z), i3, i4, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (o) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, int i5, o oVar) {
        this((i5 & 1) != 0 ? KeyboardCapitalization.Companion.m10765getUnspecifiedIUNYP9k() : i2, (i5 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z, (i5 & 4) != 0 ? KeyboardType.Companion.m10824getUnspecifiedPjHm6EE() : i3, (i5 & 8) != 0 ? ImeAction.Companion.m10730getDefaulteUduSuo() : i4, (o) null);
    }

    private KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions) {
        this(i2, Boolean.valueOf(z), i3, i4, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation()), (LocaleList) null, 64, (o) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, o oVar) {
        this((i5 & 1) != 0 ? KeyboardCapitalization.Companion.m10763getNoneIUNYP9k() : i2, (i5 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z, (i5 & 4) != 0 ? KeyboardType.Companion.m10822getTextPjHm6EE() : i3, (i5 & 8) != 0 ? ImeAction.Companion.m10730getDefaulteUduSuo() : i4, (i5 & 16) != 0 ? null : platformImeOptions, (o) null);
    }

    private KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i2, Boolean.valueOf(z), i3, i4, platformImeOptions, bool, localeList, (o) null);
    }

    public /* synthetic */ KeyboardOptions(int i2, boolean z, int i3, int i4, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i5, o oVar) {
        this((i5 & 1) != 0 ? KeyboardCapitalization.Companion.m10765getUnspecifiedIUNYP9k() : i2, z, (i5 & 4) != 0 ? KeyboardType.Companion.m10824getUnspecifiedPjHm6EE() : i3, (i5 & 8) != 0 ? ImeAction.Companion.m10738getUnspecifiedeUduSuo() : i4, (i5 & 16) != 0 ? null : platformImeOptions, (i5 & 32) != 0 ? null : bool, (i5 & 64) != 0 ? null : localeList, (o) null);
    }
}
