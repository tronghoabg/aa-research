package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeViewContext$callback$1 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    final /* synthetic */ ComposeViewContext this$0;

    ComposeViewContext$callback$1(ComposeViewContext composeViewContext) {
        this.this$0 = composeViewContext;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.this$0.onConfigurationChanged$ui(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.this$0.getImageVectorCache$ui().clear();
        this.this$0.getResourceIdCache$ui().clear();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        this.this$0.getImageVectorCache$ui().clear();
        this.this$0.getResourceIdCache$ui().clear();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z) {
        this.this$0.getWindowInfo$ui().setWindowFocused(z);
    }
}
