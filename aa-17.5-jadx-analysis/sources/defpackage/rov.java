package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.InputQueue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes2.dex */
public final class rov extends Window {
    public final FrameLayout a;
    private final FrameLayout b;

    public rov(Context context) {
        super(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.a = frameLayout;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.windowBackground});
        typedArrayObtainStyledAttributes.getClass();
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
        if (drawable != null) {
            frameLayout.setBackground(drawable);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setId(R.id.content);
        this.b = frameLayout2;
        frameLayout.addView(frameLayout2, -1, -1);
    }

    @Override // android.view.Window
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        throw new UnsupportedOperationException("addContentView is not supported");
    }

    @Override // android.view.Window
    public final View getCurrentFocus() {
        return null;
    }

    @Override // android.view.Window
    public final View getDecorView() {
        return this.a;
    }

    @Override // android.view.Window
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        layoutInflaterFrom.getClass();
        return layoutInflaterFrom;
    }

    @Override // android.view.Window
    public final int getNavigationBarColor() {
        return 0;
    }

    @Override // android.view.Window
    public final OnBackInvokedDispatcher getOnBackInvokedDispatcher() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.a.findOnBackInvokedDispatcher();
        if (onBackInvokedDispatcherFindOnBackInvokedDispatcher != null) {
            return onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        }
        throw new IllegalStateException("DecorView not attached or lacking BackDispatcher");
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
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window
    protected final void onActive() {
        throw new UnsupportedOperationException("onActive is not supported");
    }

    @Override // android.view.Window
    public final void onConfigurationChanged(Configuration configuration) {
        throw new UnsupportedOperationException("onConfigurationChanged is not supported");
    }

    @Override // android.view.Window
    public final View peekDecorView() {
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
    public final boolean performPanelShortcut(int i, int i2, KeyEvent keyEvent, int i3) {
        return false;
    }

    @Override // android.view.Window
    public final void restoreHierarchyState(Bundle bundle) {
        SparseArray sparseParcelableArray;
        if (bundle == null || (sparseParcelableArray = bundle.getSparseParcelableArray("ScvhWindow_hierarchyState")) == null) {
            return;
        }
        this.a.restoreHierarchyState(sparseParcelableArray);
    }

    @Override // android.view.Window
    public final Bundle saveHierarchyState() {
        Bundle bundle = new Bundle();
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        this.a.saveHierarchyState(sparseArray);
        bundle.putSparseParcelableArray("ScvhWindow_hierarchyState", sparseArray);
        return bundle;
    }

    @Override // android.view.Window
    public final void setBackgroundDrawable(Drawable drawable) {
        throw new UnsupportedOperationException("setBackgroundDrawable is not supported");
    }

    @Override // android.view.Window
    public final void setChildDrawable(int i, Drawable drawable) {
        throw new UnsupportedOperationException("setChildDrawable is not supported");
    }

    @Override // android.view.Window
    public final void setChildInt(int i, int i2) {
        throw new UnsupportedOperationException("setChildInt is not supported");
    }

    @Override // android.view.Window
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        FrameLayout frameLayout = this.b;
        frameLayout.removeAllViews();
        if (layoutParams != null) {
            frameLayout.addView(view, layoutParams);
        } else {
            frameLayout.addView(view);
        }
    }

    @Override // android.view.Window
    public final void setDecorCaptionShade(int i) {
        throw new UnsupportedOperationException("setDecorCaptionShade is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureDrawable(int i, Drawable drawable) {
        throw new UnsupportedOperationException("setFeatureDrawable is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureDrawableAlpha(int i, int i2) {
        throw new UnsupportedOperationException("setFeatureDrawableAlpha is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureDrawableResource(int i, int i2) {
        throw new UnsupportedOperationException("setFeatureDrawableResource is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureDrawableUri(int i, Uri uri) {
        throw new UnsupportedOperationException("setFeatureDrawableUri is not supported");
    }

    @Override // android.view.Window
    public final void setFeatureInt(int i, int i2) {
        throw new UnsupportedOperationException("setFeatureInt is not supported");
    }

    @Override // android.view.Window
    public final void setResizingCaptionDrawable(Drawable drawable) {
        throw new UnsupportedOperationException("setResizingCaptionDrawable is not supported");
    }

    @Override // android.view.Window
    public final void setVolumeControlStream(int i) {
        throw new UnsupportedOperationException("setVolumeControlStream is not supported");
    }

    @Override // android.view.Window
    public final boolean superDispatchGenericMotionEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.a.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        return this.a.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        return this.a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window
    public final boolean superDispatchTrackballEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        return this.a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window
    public final void takeInputQueue(InputQueue.Callback callback) {
        throw new UnsupportedOperationException("takeInputQueue is not supported");
    }

    @Override // android.view.Window
    public final void takeKeyEvents(boolean z) {
        throw new UnsupportedOperationException("takeKeyEvents is not supported");
    }

    @Override // android.view.Window
    public final void takeSurface(SurfaceHolder.Callback2 callback2) {
        throw new UnsupportedOperationException("takeSurface is not supported");
    }

    @Override // android.view.Window
    public final void setContentView(View view) {
        view.getClass();
        setContentView(view, null);
    }

    @Override // android.view.Window
    public final void closeAllPanels() {
    }

    @Override // android.view.Window
    public final void setContentView(int i) {
        throw new UnsupportedOperationException("setContentView(Int) is not supported");
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
    public final void setTitle(CharSequence charSequence) {
    }

    @Override // android.view.Window
    public final void setTitleColor(int i) {
    }

    @Override // android.view.Window
    public final void openPanel(int i, KeyEvent keyEvent) {
    }

    @Override // android.view.Window
    public final void togglePanel(int i, KeyEvent keyEvent) {
    }
}
