package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class TypedArrayApi26ImplKt {
    public static final TypedArrayApi26ImplKt INSTANCE = new TypedArrayApi26ImplKt();

    private TypedArrayApi26ImplKt() {
    }

    public static final Typeface getFont(TypedArray typedArray, int i2) {
        x.f(typedArray, "typedArray");
        Typeface font = typedArray.getFont(i2);
        x.c(font);
        return font;
    }
}
