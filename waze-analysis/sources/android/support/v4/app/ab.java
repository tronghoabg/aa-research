package android.support.v4.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class ab extends ar implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private Observer<LifecycleOwner> mObserver;
    private DialogInterface.OnCancelListener mOnCancelListener;
    private DialogInterface.OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;

    public ab() {
        this.mDismissRunnable = new r(this, 2);
        this.mOnCancelListener = new x(this);
        this.mOnDismissListener = new y(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new z(this);
        this.mDialogCreated = false;
    }

    private void dismissInternal(boolean z, boolean z2, boolean z3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    onDismiss(this.mDialog);
                } else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (z3) {
                getParentFragmentManager().bc(this.mBackStackId);
            } else {
                getParentFragmentManager().ba(this.mBackStackId, z);
            }
            this.mBackStackId = -1;
            return;
        }
        a aVar = new a(getParentFragmentManager());
        aVar.A();
        aVar.n(this);
        if (z3) {
            aVar.f();
        } else if (z) {
            aVar.l();
        } else {
            aVar.a();
        }
    }

    private void prepareDialog(Bundle bundle) {
        if (this.mShowsDialog && !this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                Dialog dialogOnCreateDialog = onCreateDialog(bundle);
                this.mDialog = dialogOnCreateDialog;
                if (this.mShowsDialog) {
                    setupDialog(dialogOnCreateDialog, this.mStyle);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity) context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                } else {
                    this.mDialog = null;
                }
            } finally {
                this.mCreatingDialog = false;
            }
        }
    }

    @Override // android.support.v4.app.ar
    ay createFragmentContainer() {
        return new aa(this, super.createFragmentContainer());
    }

    public void dismiss() {
        dismissInternal(false, false, false);
    }

    public void dismissAllowingStateLoss() {
        dismissInternal(true, false, false);
    }

    public void dismissNow() {
        dismissInternal(false, false, true);
    }

    public Dialog getDialog() {
        return this.mDialog;
    }

    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }

    public int getTheme() {
        return this.mTheme;
    }

    public boolean isCancelable() {
        return this.mCancelable;
    }

    @Override // android.support.v4.app.ar
    @Deprecated
    /* renamed from: onActivityCreated */
    public void m35lambda$performActivityCreated$8$androidsupportv4appFragment(Bundle bundle) {
        super.m35lambda$performActivityCreated$8$androidsupportv4appFragment(bundle);
    }

    @Override // android.support.v4.app.ar
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().observeForever(this.mObserver);
        if (this.mShownByMe) {
            return;
        }
        this.mDismissed = false;
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = this.mContainerId == 0;
        if (bundle != null) {
            this.mStyle = bundle.getInt(SAVED_STYLE, 0);
            this.mTheme = bundle.getInt(SAVED_THEME, 0);
            this.mCancelable = bundle.getBoolean(SAVED_CANCELABLE, true);
            this.mShowsDialog = bundle.getBoolean(SAVED_SHOWS_DIALOG, this.mShowsDialog);
            this.mBackStackId = bundle.getInt(SAVED_BACK_STACK_ID, -1);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (bv.aM(3)) {
            toString();
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment ".concat(toString()));
        }
        return new ComponentDialog(requireContext(), getTheme());
    }

    @Override // android.support.v4.app.ar
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = true;
            dialog.setOnDismissListener(null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                onDismiss(this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }

    @Override // android.support.v4.app.ar
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        getViewLifecycleOwnerLiveData().removeObserver(this.mObserver);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.mViewDestroyed) {
            return;
        }
        if (bv.aM(3)) {
            toString();
            Log.d("FragmentManager", "onDismiss called for DialogFragment ".concat(toString()));
        }
        dismissInternal(true, true, false);
    }

    View onFindViewById(int i2) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    @Override // android.support.v4.app.ar
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            prepareDialog(bundle);
            if (bv.aM(2)) {
                Log.d("FragmentManager", k.e(this, "get layout inflater for DialogFragment ", " from dialog context"));
            }
            Dialog dialog = this.mDialog;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (bv.aM(2)) {
            toString();
            String strConcat = "getting layout inflater for DialogFragment ".concat(toString());
            if (!this.mShowsDialog) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(strConcat));
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(strConcat));
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    boolean onHasView() {
        return this.mDialogCreated;
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public void m47x22bc4f96(Bundle bundle) {
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(SAVED_INTERNAL_DIALOG_SHOWING, false);
            bundle.putBundle(SAVED_DIALOG_STATE_TAG, bundleOnSaveInstanceState);
        }
        int i2 = this.mStyle;
        if (i2 != 0) {
            bundle.putInt(SAVED_STYLE, i2);
        }
        int i3 = this.mTheme;
        if (i3 != 0) {
            bundle.putInt(SAVED_THEME, i3);
        }
        if (!this.mCancelable) {
            bundle.putBoolean(SAVED_CANCELABLE, false);
        }
        if (!this.mShowsDialog) {
            bundle.putBoolean(SAVED_SHOWS_DIALOG, false);
        }
        int i4 = this.mBackStackId;
        if (i4 != -1) {
            bundle.putInt(SAVED_BACK_STACK_ID, i4);
        }
    }

    @Override // android.support.v4.app.ar
    public void onStart() {
        super.onStart();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            this.mViewDestroyed = false;
            dialog.show();
            View decorView = this.mDialog.getWindow().getDecorView();
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            ViewTreeSavedStateRegistryOwner.set(decorView, this);
        }
    }

    @Override // android.support.v4.app.ar
    public void onStop() {
        super.onStop();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onViewStateRestored */
    public void m53lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        Bundle bundle2;
        super.m53lambda$restoreViewState$0$androidsupportv4appFragment(bundle);
        if (this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    @Override // android.support.v4.app.ar
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.mDialog == null || bundle == null || (bundle2 = bundle.getBundle(SAVED_DIALOG_STATE_TAG)) == null) {
            return;
        }
        this.mDialog.onRestoreInstanceState(bundle2);
    }

    public final ComponentDialog requireComponentDialog() {
        Dialog dialogRequireDialog = requireDialog();
        if (dialogRequireDialog instanceof ComponentDialog) {
            return (ComponentDialog) dialogRequireDialog;
        }
        throw new IllegalStateException(k.f(dialogRequireDialog, this, "DialogFragment ", " did not return a ComponentDialog instance from requireDialog(). The actual Dialog is "));
    }

    public final Dialog requireDialog() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException(k.e(this, "DialogFragment ", " does not have a Dialog."));
    }

    public void setCancelable(boolean z) {
        this.mCancelable = z;
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void setShowsDialog(boolean z) {
        this.mShowsDialog = z;
    }

    public void setStyle(int i2, int i3) {
        if (bv.aM(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i2 + ", " + i3);
        }
        this.mStyle = i2;
        if (i2 == 2 || i2 == 3) {
            this.mTheme = R.style.Theme.Panel;
        }
        if (i3 != 0) {
            this.mTheme = i3;
        }
    }

    public void setupDialog(Dialog dialog, int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void show(bv bvVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        a aVar = new a(bvVar);
        aVar.A();
        aVar.s(this, str);
        aVar.a();
    }

    public void showNow(bv bvVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        a aVar = new a(bvVar);
        aVar.A();
        aVar.s(this, str);
        aVar.f();
    }

    public int show(ch chVar, String str) {
        this.mDismissed = false;
        this.mShownByMe = true;
        chVar.s(this, str);
        this.mViewDestroyed = false;
        int iA = chVar.a();
        this.mBackStackId = iA;
        return iA;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    public ab(int i2) {
        super(i2);
        this.mDismissRunnable = new r(this, 2);
        this.mOnCancelListener = new x(this);
        this.mOnDismissListener = new y(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new z(this);
        this.mDialogCreated = false;
    }
}
