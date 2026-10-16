package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.ui.text.font.FontVariation;
import h.c.e;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final TypefaceLoader typefaceLoader;
    private final FontVariation.Settings variationSettings;

    /* compiled from: WazeSource */
    public interface TypefaceLoader {
        Object awaitLoad(Context context, AndroidFont androidFont, e<? super android.graphics.Typeface> eVar);

        android.graphics.Typeface loadBlocking(Context context, AndroidFont androidFont);
    }

    private AndroidFont(int i2, TypefaceLoader typefaceLoader) {
        this(i2, typefaceLoader, new FontVariation.Settings(new FontVariation.Setting[0]), null);
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo10603getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    public /* synthetic */ AndroidFont(int i2, TypefaceLoader typefaceLoader, FontVariation.Settings settings, o oVar) {
        this(i2, typefaceLoader, settings);
    }

    public /* synthetic */ AndroidFont(int i2, TypefaceLoader typefaceLoader, o oVar) {
        this(i2, typefaceLoader);
    }

    private AndroidFont(int i2, TypefaceLoader typefaceLoader, FontVariation.Settings settings) {
        this.loadingStrategy = i2;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = settings;
    }
}
