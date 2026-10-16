package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidResourceFontLoaderHelper {
    public static final AndroidResourceFontLoaderHelper INSTANCE = new AndroidResourceFontLoaderHelper();

    private AndroidResourceFontLoaderHelper() {
    }

    public final Typeface create(Context context, int i2) {
        return context.getResources().getFont(i2);
    }
}
