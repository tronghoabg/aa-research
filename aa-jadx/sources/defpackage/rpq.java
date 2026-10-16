package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rpq extends android.view.Window {
    public final android.widget.FrameLayout a;
    private final android.widget.FrameLayout b;

    public rpq(android.content.Context context) {
        super(context);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        this.a = frameLayout;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.windowBackground});
        typedArrayObtainStyledAttributes.getClass();
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        if (drawable != null) {
            frameLayout.setBackground(drawable);
        }
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
        frameLayout2.setId(android.R.id.content);
        this.b = frameLayout2;
        frameLayout.addView(frameLayout2, -1, -1);
    }

    @Override // android.view.Window
    public final void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        throw new java.lang.UnsupportedOperationException("addContentView is not supported");
    }

    @Override // android.view.Window
    public final android.view.View getCurrentFocus() {
        return null;
    }

    @Override // android.view.Window
    public final android.view.View getDecorView() {
        return this.a;
    }

    @Override // android.view.Window
    public final android.view.LayoutInflater getLayoutInflater() {
        android.view.LayoutInflater layoutInflaterFrom = android.view.LayoutInflater.from(getContext());
        layoutInflaterFrom.getClass();
        return layoutInflaterFrom;
    }

    @Override // android.view.Window
    public final int getNavigationBarColor() {
        return 0;
    }

    @Override // android.view.Window
    public final android.window.OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.a.findOnBackInvokedDispatcher();
        if (onBackInvokedDispatcherFindOnBackInvokedDispatcher != null) {
            return onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        }
        throw new java.lang.IllegalStateException("DecorView not attached or lacking BackDispatcher");
    }

    @Override // android.view.Window
    public final int getStatusBarColor() {
        return 0;
    }

    @Override // android.view.Window
    public final int getVolumeControlStream() {
        return 0;
    }

    @Override // android.view.Window
    public final boolean isFloating() {
        return false;
    }

    @Override // android.view.Window
    public final boolean isShortcutKey(int i, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window
    protected final void onActive() {
        throw new java.lang.UnsupportedOperationException("onActive is not supported");
    }

    @Override // android.view.Window
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        throw new java.lang.UnsupportedOperationException("onConfigurationChanged is not supported");
    }

    @Override // android.view.Window
    public final android.view.View peekDecorView() {
        return this.a;
    }

    @Override // android.view.Window
    public final boolean performContextMenuIdentifierAction(int i, int i2) {
        return false;
    }

    @Override // android.view.Window
    public final boolean performPanelIdentifierAction(int i, int i2, int i3) {
        return false;
    }

    @Override // android.view.Window
    public final boolean performPanelShortcut(int i, int i2, android.view.KeyEvent keyEvent, int i3) {
        return false;
    }

    @Override // android.view.Window
    public final void restoreHierarchyState(android.os.Bundle bundle) {
        android.util.SparseArray sparseParcelableArray;
        if (bundle == null || (sparseParcelableArray = bundle.getSparseParcelableArray("ScvhWindow_hierarchyState")) == null) {
            return;
        }
        this.a.restoreHierarchyState(sparseParcelableArray);
    }

    @Override // android.view.Window
    public final android.os.Bundle saveHierarchyState() {
        android.os.Bundle bundle = new android.os.Bundle();
        android.util.SparseArray<? extends android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
        this.a.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("ScvhWindow_hierarchyState", sparseArray);
        return bundle;
    }

    @Override // android.view.Window
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("setBackgroundDrawable is not supported");
    }

    @Override // android.view.Window
    public final void setChildDrawable(int i, android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("setChildDrawable is not supported");
    }

    @Override // android.view.Window
    public final void setChildInt(int i, int i2) {
        throw new java.lang.UnsupportedOperationException("setChildInt is not supported");
    }

    @Override // android.view.Window
    public final void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        android.widget.FrameLayout frameLayout = this.b;
        frameLayout.removeAllViews();
        if (layoutParams != null) {
            frameLayout.addView(view, layoutParams);
        } else {
            frameLayout.addView(view);
        }
    }

    @Override // android.view.Window
    public final void setDecorCaptionShade(int i) {
        throw new java.lang.UnsupportedOperationException("setDecorCaptionShade is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureDrawable(int i, android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("setFeatureDrawable is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureDrawableAlpha(int i, int i2) {
        throw new java.lang.UnsupportedOperationException("setFeatureDrawableAlpha is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureDrawableResource(int i, int i2) {
        throw new java.lang.UnsupportedOperationException("setFeatureDrawableResource is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureDrawableUri(int i, android.net.Uri uri) {
        throw new java.lang.UnsupportedOperationException("setFeatureDrawableUri is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureInt(int i, int i2) {
        throw new java.lang.UnsupportedOperationException("setFeatureInt is not supported");
    }

    @Override // android.view.Window
    public final void setResizingCaptionDrawable(android.graphics.drawable.Drawable drawable) {
        throw new java.lang.UnsupportedOperationException("setResizingCaptionDrawable is not supported");
    }

    @Override // android.view.Window
    public final void setVolumeControlStream(int i) {
        throw new java.lang.UnsupportedOperationException("setVolumeControlStream is not supported");
    }

    @Override // android.view.Window
    public final boolean superDispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        return this.a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        keyEvent.getClass();
        return this.a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchTouchEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window
    public final void takeInputQueue(android.view.InputQueue.Callback callback) {
        throw new java.lang.UnsupportedOperationException("takeInputQueue is not supported");
    }

    @Override // android.view.Window
    public final void takeKeyEvents(boolean z) {
        throw new java.lang.UnsupportedOperationException("takeKeyEvents is not supported");
    }

    @Override // android.view.Window
    public final void takeSurface(android.view.SurfaceHolder.Callback2 callback2) {
        throw new java.lang.UnsupportedOperationException("takeSurface is not supported");
    }

    @Override // android.view.Window
    public final void setContentView(android.view.View view) {
        view.getClass();
        setContentView(view, null);
    }

    @Override // android.view.Window
    public final void closeAllPanels() {
    }

    @Override // android.view.Window
    public final void setContentView(int i) {
        throw new java.lang.UnsupportedOperationException("setContentView(Int) is not supported");
    }

    @Override // android.view.Window
    public final void closePanel(int i) {
    }

    @Override // android.view.Window
    public final void invalidatePanelMenu(int i) {
    }

    @Override // android.view.Window
    public final void setNavigationBarColor(int i) {
    }

    @Override // android.view.Window
    public final void setStatusBarColor(int i) {
    }

    @Override // android.view.Window
    public final void setTitle(java.lang.CharSequence charSequence) {
    }

    @Override // android.view.Window
    public final void setTitleColor(int i) {
    }

    @Override // android.view.Window
    public final void openPanel(int i, android.view.KeyEvent keyEvent) {
    }

    @Override // android.view.Window
    public final void togglePanel(int i, android.view.KeyEvent keyEvent) {
    }
}
