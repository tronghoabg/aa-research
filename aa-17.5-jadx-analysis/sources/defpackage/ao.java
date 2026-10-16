package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class ao extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Dialog e;
    private Handler g;
    private boolean l;
    private boolean n;
    private boolean o;
    private boolean p;
    private final Runnable h = new ap(this, 1, null);
    private final DialogInterface.OnCancelListener i = new ak(this);
    public final DialogInterface.OnDismissListener a = new al(this);
    private int j = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    private int k = -1;
    private final eqn m = new am(this);
    public boolean f = false;

    public final Dialog b() {
        Dialog dialog = this.e;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException(a.bm(this, "DialogFragment ", " does not have a Dialog."));
    }

    public void c() {
        g(false, false);
    }

    @Override // android.support.v4.app.Fragment
    public final be createFragmentContainer() {
        return new an(this, super.createFragmentContainer());
    }

    public void d(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void dismissAllowingStateLoss() {
        g(true, false);
    }

    public final void e(bt btVar, String str) {
        this.o = false;
        this.p = true;
        w wVar = new w(btVar);
        wVar.s();
        wVar.e(0, this, str, 1);
        wVar.i(false, true);
    }

    public final void f(bt btVar, String str) {
        this.o = false;
        this.p = true;
        w wVar = new w(btVar);
        wVar.s();
        wVar.e(0, this, str, 1);
        wVar.c();
    }

    public final void g(boolean z, boolean z2) {
        if (this.o) {
            return;
        }
        this.o = true;
        this.p = false;
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.e.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.g.getLooper()) {
                    onDismiss(this.e);
                } else {
                    this.g.post(this.h);
                }
            }
        }
        this.n = true;
        if (this.k >= 0) {
            bt parentFragmentManager = getParentFragmentManager();
            int i = this.k;
            if (i < 0) {
                throw new IllegalArgumentException(a.bp(i, "Bad id: "));
            }
            parentFragmentManager.J(new bp(parentFragmentManager, null, i, 1), z);
            this.k = -1;
            return;
        }
        w wVar = new w(getParentFragmentManager());
        wVar.s();
        wVar.k(this);
        if (z) {
            wVar.i(true, true);
        } else {
            wVar.i(false, true);
        }
    }

    public final Dialog getDialog() {
        return this.e;
    }

    public final boolean getShowsDialog() {
        return this.d;
    }

    public Dialog gn(Bundle bundle) {
        if (bt.ac(3)) {
            toString();
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment ".concat(toString()));
        }
        return new oc(requireContext(), this.b);
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().i(this.m);
        if (this.p) {
            return;
        }
        this.o = false;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.g = new Handler();
        this.d = this.mContainerId == 0;
        if (bundle != null) {
            this.j = bundle.getInt("android:style", 0);
            this.b = bundle.getInt("android:theme", 0);
            this.c = bundle.getBoolean("android:cancelable", true);
            this.d = bundle.getBoolean("android:showsDialog", this.d);
            this.k = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.e;
        if (dialog != null) {
            this.n = true;
            dialog.setOnDismissListener(null);
            this.e.dismiss();
            if (!this.o) {
                onDismiss(this.e);
            }
            this.e = null;
            this.f = false;
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (!this.p && !this.o) {
            this.o = true;
        }
        getViewLifecycleOwnerLiveData().k(this.m);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.n) {
            return;
        }
        if (bt.ac(3)) {
            toString();
            Log.d("FragmentManager", "onDismiss called for DialogFragment ".concat(toString()));
        }
        g(true, true);
    }

    @Override // android.support.v4.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.d && !this.l) {
            if (!this.f) {
                try {
                    this.l = true;
                    Dialog dialogGn = gn(bundle);
                    this.e = dialogGn;
                    if (this.d) {
                        d(dialogGn, this.j);
                        Context context = getContext();
                        if (context instanceof Activity) {
                            this.e.setOwnerActivity((Activity) context);
                        }
                        this.e.setCancelable(this.c);
                        this.e.setOnCancelListener(this.i);
                        this.e.setOnDismissListener(this.a);
                        this.f = true;
                    } else {
                        this.e = null;
                    }
                } finally {
                    this.l = false;
                }
            }
            if (bt.ac(2)) {
                Log.d("FragmentManager", a.bm(this, "get layout inflater for DialogFragment ", " from dialog context"));
            }
            Dialog dialog = this.e;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (bt.ac(2)) {
            toString();
            String strConcat = "getting layout inflater for DialogFragment ".concat(toString());
            if (!this.d) {
                Log.d("FragmentManager", "mShowsDialog = false: ".concat(strConcat));
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: ".concat(strConcat));
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public void m117x22bc4f96(Bundle bundle) {
        Dialog dialog = this.e;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.j;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        if (!this.c) {
            bundle.putBoolean("android:cancelable", false);
        }
        if (!this.d) {
            bundle.putBoolean("android:showsDialog", false);
        }
        int i3 = this.k;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = this.e;
        if (dialog != null) {
            this.n = false;
            dialog.show();
            View decorView = this.e.getWindow().getDecorView();
            decorView.getClass();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.getClass();
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.getClass();
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        super.onStop();
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onViewStateRestored */
    public final void m123lambda$restoreViewState$0$androidsupportv4appFragment(Bundle bundle) {
        Bundle bundle2;
        super.m123lambda$restoreViewState$0$androidsupportv4appFragment(bundle);
        if (this.e == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.e.onRestoreInstanceState(bundle2);
    }

    @Override // android.support.v4.app.Fragment
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.e == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.e.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
