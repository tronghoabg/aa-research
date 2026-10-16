package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AndroidFontResourceLoaderHelper {
    public static final AndroidFontResourceLoaderHelper INSTANCE = new AndroidFontResourceLoaderHelper();

    private AndroidFontResourceLoaderHelper() {
    }

    public final Typeface create(Context context, int i2) {
        return context.getResources().getFont(i2);
    }
}
