package androidx.compose.ui.text.font;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public interface PlatformResolveInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ FontFamily interceptFontFamily(FontFamily fontFamily) {
                return fontFamily;
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontStyle-T2F_aPo */
            public /* synthetic */ int mo10610interceptFontStyleT2F_aPo(int i2) {
                return i2;
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            /* renamed from: interceptFontSynthesis-Mscr08Y */
            public /* synthetic */ int mo10611interceptFontSynthesisMscr08Y(int i2) {
                return i2;
            }

            @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
            public /* synthetic */ FontWeight interceptFontWeight(FontWeight fontWeight) {
                return fontWeight;
            }
        };

        private Companion() {
        }

        public final PlatformResolveInterceptor getDefault$ui_text() {
            return Default;
        }
    }

    FontFamily interceptFontFamily(FontFamily fontFamily);

    /* renamed from: interceptFontStyle-T2F_aPo */
    int mo10610interceptFontStyleT2F_aPo(int i2);

    /* renamed from: interceptFontSynthesis-Mscr08Y */
    int mo10611interceptFontSynthesisMscr08Y(int i2);

    FontWeight interceptFontWeight(FontWeight fontWeight);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.font.PlatformResolveInterceptor$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static FontFamily $default$interceptFontFamily(PlatformResolveInterceptor platformResolveInterceptor, FontFamily fontFamily) {
            return fontFamily;
        }

        /* renamed from: $default$interceptFontStyle-T2F_aPo, reason: not valid java name */
        public static int m10687$default$interceptFontStyleT2F_aPo(PlatformResolveInterceptor platformResolveInterceptor, int i2) {
            return i2;
        }

        /* renamed from: $default$interceptFontSynthesis-Mscr08Y, reason: not valid java name */
        public static int m10688$default$interceptFontSynthesisMscr08Y(PlatformResolveInterceptor platformResolveInterceptor, int i2) {
            return i2;
        }

        public static FontWeight $default$interceptFontWeight(PlatformResolveInterceptor platformResolveInterceptor, FontWeight fontWeight) {
            return fontWeight;
        }
    }
}
