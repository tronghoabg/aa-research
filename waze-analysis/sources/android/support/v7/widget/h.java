package android.support.v7.widget;

import android.content.Context;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class h extends View {
    h(Context context) {
        super(context);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public final int getWindowSystemUiVisibility() {
        return 0;
    }
}
