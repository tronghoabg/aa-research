package androidx.compose.ui.text;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {
    public static final Companion Companion = new Companion(null);
    private static MutableScatterMap<FontFamily.Resolver, Font.ResourceLoader> cache = ScatterMapKt.mutableScatterMapOf();
    private static final SynchronizedObject lock = new SynchronizedObject();
    private final FontFamily.Resolver fontFamilyResolver;

    private DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    public Object load(Font font) {
        return FontFamily.Resolver.CC.m10634resolveDPcqOEQ$default(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.mo10613getStyle_LCdwA(), 0, 8, null).getValue();
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final Font.ResourceLoader from(FontFamily.Resolver resolver) {
            synchronized (getLock()) {
                Font.ResourceLoader resourceLoader = DeprecatedBridgeFontResourceLoader.Companion.getCache().get(resolver);
                if (resourceLoader != null) {
                    return resourceLoader;
                }
                DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new DeprecatedBridgeFontResourceLoader(resolver, null);
                DeprecatedBridgeFontResourceLoader.Companion.getCache().set(resolver, deprecatedBridgeFontResourceLoader);
                return deprecatedBridgeFontResourceLoader;
            }
        }

        public final MutableScatterMap<FontFamily.Resolver, Font.ResourceLoader> getCache() {
            return DeprecatedBridgeFontResourceLoader.cache;
        }

        public final SynchronizedObject getLock() {
            return DeprecatedBridgeFontResourceLoader.lock;
        }

        public final void setCache(MutableScatterMap<FontFamily.Resolver, Font.ResourceLoader> mutableScatterMap) {
            DeprecatedBridgeFontResourceLoader.cache = mutableScatterMap;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver, o oVar) {
        this(resolver);
    }
}
