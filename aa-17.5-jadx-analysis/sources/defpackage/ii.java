package defpackage;

import android.content.Context;
import android.view.View;

/* loaded from: classes2.dex */
public final class ii extends View {
    public ii(Context context) {
        super(context);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final int getWindowSystemUiVisibility() {
        return 0;
    }
}
