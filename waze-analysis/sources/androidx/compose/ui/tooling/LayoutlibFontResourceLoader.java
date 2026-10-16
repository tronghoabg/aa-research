package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LayoutlibFontResourceLoader implements Font.ResourceLoader {
    public static final int $stable = 8;
    private final Context context;

    public LayoutlibFontResourceLoader(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    public Typeface load(Font font) {
        if (!(font instanceof ResourceFont)) {
            throw new IllegalArgumentException("Unknown font type: ".concat(String.valueOf(font.getClass().getName())));
        }
        return ResourceFontHelper.INSTANCE.load(this.context, (ResourceFont) font);
    }
}
