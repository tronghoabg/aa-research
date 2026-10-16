package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ViewLayerContainer extends DrawChildContainer {
    public static final int $stable = 8;

    public ViewLayerContainer(Context context) {
        super(context);
    }

    @Override // androidx.compose.ui.platform.DrawChildContainer, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    protected final void dispatchGetDisplayList() {
    }
}
