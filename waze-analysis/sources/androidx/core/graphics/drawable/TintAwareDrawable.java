package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface TintAwareDrawable {
    void setTint(int i2);

    void setTintList(ColorStateList colorStateList);

    void setTintMode(PorterDuff.Mode mode);
}
