package androidx.compose.ui.text.input;

import androidx.compose.ui.text.intl.LocaleList;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ImeOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    public /* synthetic */ ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList, int i5, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i5 & 1) ^ 1)), (i5 & 2) != 0 ? KeyboardCapitalization.Companion.m10763getNoneIUNYP9k() : i2, (!((i5 & 4) == 0)) | z2, (i5 & 8) != 0 ? KeyboardType.Companion.m10822getTextPjHm6EE() : i3, (i5 & 16) != 0 ? ImeAction.Companion.m10730getDefaulteUduSuo() : i4, (i5 & 32) != 0 ? null : platformImeOptions, (i5 & 64) != 0 ? LocaleList.Companion.getEmpty() : localeList, (o) null);
    }

    /* renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m10739copyYTHSh70$default(ImeOptions imeOptions, boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i5 & 2) != 0) {
            i2 = imeOptions.capitalization;
        }
        if ((i5 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        if ((i5 & 8) != 0) {
            i3 = imeOptions.keyboardType;
        }
        if ((i5 & 16) != 0) {
            i4 = imeOptions.imeAction;
        }
        if ((i5 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        int i6 = i4;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        return imeOptions.m10742copyYTHSh70(z, i2, z2, i3, i6, platformImeOptions2);
    }

    /* renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m10740copyuxg59PA$default(ImeOptions imeOptions, boolean z, int i2, boolean z2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i5 & 2) != 0) {
            i2 = imeOptions.capitalization;
        }
        if ((i5 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        if ((i5 & 8) != 0) {
            i3 = imeOptions.keyboardType;
        }
        if ((i5 & 16) != 0) {
            i4 = imeOptions.imeAction;
        }
        int i6 = i4;
        boolean z3 = z2;
        return imeOptions.m10743copyuxg59PA(z, i2, z3, i3, i6);
    }

    /* renamed from: copy-wBHncE4$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m10741copywBHncE4$default(ImeOptions imeOptions, boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z = imeOptions.singleLine;
        }
        if ((i5 & 2) != 0) {
            i2 = imeOptions.capitalization;
        }
        if ((i5 & 4) != 0) {
            z2 = imeOptions.autoCorrect;
        }
        if ((i5 & 8) != 0) {
            i3 = imeOptions.keyboardType;
        }
        if ((i5 & 16) != 0) {
            i4 = imeOptions.imeAction;
        }
        if ((i5 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        if ((i5 & 64) != 0) {
            localeList = imeOptions.hintLocales;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        LocaleList localeList2 = localeList;
        int i6 = i4;
        boolean z3 = z2;
        return imeOptions.m10744copywBHncE4(z, i2, z3, i3, i6, platformImeOptions2, localeList2);
    }

    /* renamed from: copy-YTHSh70, reason: not valid java name */
    public final /* synthetic */ ImeOptions m10742copyYTHSh70(boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions) {
        return new ImeOptions(z, i2, z2, i3, i4, platformImeOptions, this.hintLocales, (o) null);
    }

    /* renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ ImeOptions m10743copyuxg59PA(boolean z, int i2, boolean z2, int i3, int i4) {
        return new ImeOptions(z, i2, z2, i3, i4, this.platformImeOptions, this.hintLocales, (o) null);
    }

    /* renamed from: copy-wBHncE4, reason: not valid java name */
    public final ImeOptions m10744copywBHncE4(boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        return new ImeOptions(z, i2, z2, i3, i4, platformImeOptions, localeList, (o) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        return this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m10753equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m10770equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m10717equalsimpl0(this.imeAction, imeOptions.imeAction) && x.n(this.platformImeOptions, imeOptions.platformImeOptions) && x.n(this.hintLocales, imeOptions.hintLocales);
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m10745getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m10746getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m10747getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int iHashCode = platformImeOptions != null ? platformImeOptions.hashCode() : 0;
        boolean z = this.singleLine;
        int i2 = this.capitalization;
        boolean z2 = this.autoCorrect;
        return (((((((((((ImeOptions$$ExternalSyntheticBackport0.m(z) * 31) + i2) * 31) + ImeOptions$$ExternalSyntheticBackport0.m(z2)) * 31) + this.keyboardType) * 31) + this.imeAction) * 31) + iHashCode) * 31) + this.hintLocales.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m10755toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m10772toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m10719toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ", hintLocales=" + this.hintLocales + ')';
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList, o oVar) {
        this(z, i2, z2, i3, i4, platformImeOptions, localeList);
    }

    public /* synthetic */ ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, o oVar) {
        this(z, i2, z2, i3, i4, platformImeOptions);
    }

    public /* synthetic */ ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, o oVar) {
        this(z, i2, z2, i3, i4);
    }

    private ImeOptions(boolean z, int i2, boolean z2, int i3, int i4) {
        this(z, i2, z2, i3, i4, null, null, 64, null);
    }

    private ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.singleLine = z;
        this.capitalization = i2;
        this.autoCorrect = z2;
        this.keyboardType = i3;
        this.imeAction = i4;
        this.platformImeOptions = platformImeOptions;
        this.hintLocales = localeList;
    }

    public /* synthetic */ ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, int i5, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i5 & 1) ^ 1)), (i5 & 2) != 0 ? KeyboardCapitalization.Companion.m10763getNoneIUNYP9k() : i2, (!((i5 & 4) == 0)) | z2, (i5 & 8) != 0 ? KeyboardType.Companion.m10822getTextPjHm6EE() : i3, (i5 & 16) != 0 ? ImeAction.Companion.m10730getDefaulteUduSuo() : i4, (o) null);
    }

    private ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions) {
        this(z, i2, z2, i3, i4, platformImeOptions, LocaleList.Companion.getEmpty(), (o) null);
    }

    public /* synthetic */ ImeOptions(boolean z, int i2, boolean z2, int i3, int i4, PlatformImeOptions platformImeOptions, int i5, o oVar) {
        this(1 == ((z ? 1 : 0) & ((i5 & 1) ^ 1)), (i5 & 2) != 0 ? KeyboardCapitalization.Companion.m10763getNoneIUNYP9k() : i2, (!((i5 & 4) == 0)) | z2, (i5 & 8) != 0 ? KeyboardType.Companion.m10822getTextPjHm6EE() : i3, (i5 & 16) != 0 ? ImeAction.Companion.m10730getDefaulteUduSuo() : i4, (i5 & 32) != 0 ? null : platformImeOptions, (o) null);
    }
}
