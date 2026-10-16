package androidx.compose.ui.text.font;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    public static final int $stable = 0;
    private final int fontWeightAdjustment;

    public AndroidFontResolveInterceptor(int i2) {
        this.fontWeightAdjustment = i2;
    }

    private final int component1() {
        return this.fontWeightAdjustment;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = androidFontResolveInterceptor.fontWeightAdjustment;
        }
        return androidFontResolveInterceptor.copy(i2);
    }

    public final AndroidFontResolveInterceptor copy(int i2) {
        return new AndroidFontResolveInterceptor(i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) obj).fontWeightAdjustment;
    }

    public int hashCode() {
        return this.fontWeightAdjustment;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public FontWeight interceptFontWeight(FontWeight fontWeight) {
        int i2 = this.fontWeightAdjustment;
        if (i2 == 0 || i2 == Integer.MAX_VALUE) {
            return fontWeight;
        }
        int weight = fontWeight.getWeight() + this.fontWeightAdjustment;
        if (weight <= 0) {
            weight = 1;
        } else if (weight > 1000) {
            weight = 1000;
        }
        return new FontWeight(weight);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.fontWeightAdjustment + ')';
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public /* synthetic */ FontFamily interceptFontFamily(FontFamily fontFamily) {
        return fontFamily;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    /* renamed from: interceptFontStyle-T2F_aPo, reason: not valid java name */
    public /* synthetic */ int mo10610interceptFontStyleT2F_aPo(int i2) {
        return i2;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    /* renamed from: interceptFontSynthesis-Mscr08Y, reason: not valid java name */
    public /* synthetic */ int mo10611interceptFontSynthesisMscr08Y(int i2) {
        return i2;
    }
}
