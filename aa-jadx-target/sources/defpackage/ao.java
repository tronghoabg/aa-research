package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ao extends android.support.v4.app.Fragment implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener {
    public android.app.Dialog e;
    private android.os.Handler g;
    private boolean l;
    private boolean n;
    private boolean o;
    private boolean p;
    private final java.lang.Runnable h = new defpackage.ap(this, 1, null);
    private final android.content.DialogInterface.OnCancelListener i = new defpackage.ak(this);
    public final android.content.DialogInterface.OnDismissListener a = new defpackage.al(this);
    private int j = 0;
    public int b = 0;
    public boolean c = true;
    public boolean d = true;
    private int k = -1;
    private final defpackage.eqt m = new defpackage.am(this);
    public boolean f = false;

    public final android.app.Dialog b() {
        android.app.Dialog dialog = this.e;
        if (dialog != null) {
            return dialog;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bl(this, "DialogFragment ", " does not have a Dialog."));
    }

    public void c() {
        g(false, false);
    }

    @Override // android.support.v4.app.Fragment
    public final defpackage.be createFragmentContainer() {
        return new defpackage.an(this, super.createFragmentContainer());
    }

    public void d(android.app.Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            android.view.Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public final void dismissAllowingStateLoss() {
        g(true, false);
    }

    public final void e(defpackage.bt btVar, java.lang.String str) {
        this.o = false;
        this.p = true;
        defpackage.w wVar = new defpackage.w(btVar);
        wVar.s();
        wVar.e(0, this, str, 1);
        wVar.i(false, true);
    }

    public final void f(defpackage.bt btVar, java.lang.String str) {
        this.o = false;
        this.p = true;
        defpackage.w wVar = new defpackage.w(btVar);
        wVar.s();
        wVar.e(0, this, str, 1);
        wVar.c();
    }

    public android.app.Dialog fv(android.os.Bundle bundle) {
        if (defpackage.bt.ac(3)) {
            toString();
            android.util.Log.d("FragmentManager", "onCreateDialog called for DialogFragment ".concat(toString()));
        }
        return new defpackage.of(requireContext(), this.b);
    }

    public final void g(boolean z, boolean z2) {
        if (this.o) {
            return;
        }
        this.o = true;
        this.p = false;
        android.app.Dialog dialog = this.e;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.e.dismiss();
            if (!z2) {
                if (android.os.Looper.myLooper() == this.g.getLooper()) {
                    onDismiss(this.e);
                } else {
                    this.g.post(this.h);
                }
            }
        }
        this.n = true;
        if (this.k >= 0) {
            defpackage.bt parentFragmentManager = getParentFragmentManager();
            int i = this.k;
            if (i < 0) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bo(i, "Bad id: "));
            }
            parentFragmentManager.J(new bp(parentFragmentManager, (java.lang.String) null, i, 1), z);
            this.k = -1;
            return;
        }
        defpackage.w wVar = new defpackage.w(getParentFragmentManager());
        wVar.s();
        wVar.k(this);
        if (z) {
            wVar.i(true, true);
        } else {
            wVar.i(false, true);
        }
    }

    public final android.app.Dialog getDialog() {
        return this.e;
    }

    public final boolean getShowsDialog() {
        return this.d;
    }

    @Override // android.support.v4.app.Fragment
    public final void onAttach(android.content.Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().i(this.m);
        if (this.p) {
            return;
        }
        this.o = false;
    }

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onCreate */
    public void m6lambda$performCreate$3$androidsupportv4appFragment(android.os.Bundle bundle) {
        super.m6lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.g = new android.os.Handler();
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
        android.app.Dialog dialog = this.e;
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
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.n) {
            return;
        }
        if (defpackage.bt.ac(3)) {
            toString();
            android.util.Log.d("FragmentManager", "onDismiss called for DialogFragment ".concat(toString()));
        }
        g(true, true);
    }

    @Override // android.support.v4.app.Fragment
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle bundle) {
        android.view.LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.d && !this.l) {
            if (!this.f) {
                try {
                    this.l = true;
                    android.app.Dialog dialogFv = fv(bundle);
                    this.e = dialogFv;
                    if (this.d) {
                        d(dialogFv, this.j);
                        android.content.Context context = getContext();
                        if (context instanceof android.app.Activity) {
                            this.e.setOwnerActivity((android.app.Activity) context);
                        }
                        this.e.setCancelable(this.c);
                        this.e.setOnCancelListener(this.i);
                        this.e.setOnDismissListener(this.a);
                        this.f = true;
                    } else {
                        this.e = null;
                    }
                    this.l = false;
                } catch (java.lang.Throwable th) {
                    this.l = false;
                    throw th;
                }
            }
            if (defpackage.bt.ac(2)) {
                android.util.Log.d("FragmentManager", defpackage.a.bl(this, "get layout inflater for DialogFragment ", " from dialog context"));
            }
            android.app.Dialog dialog = this.e;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (defpackage.bt.ac(2)) {
            toString();
            java.lang.String strConcat = "getting layout inflater for DialogFragment ".concat(toString());
            if (!this.d) {
                android.util.Log.d("FragmentManager", "mShowsDialog = false: ".concat(strConcat));
                return layoutInflaterOnGetLayoutInflater;
            }
            android.util.Log.d("FragmentManager", "mCreatingDialog = true: ".concat(strConcat));
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onSaveInstanceState */
    public void m16x22bc4f96(android.os.Bundle bundle) {
        android.app.Dialog dialog = this.e;
        if (dialog != null) {
            android.os.Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
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
        android.app.Dialog dialog = this.e;
        if (dialog != null) {
            this.n = false;
            dialog.show();
            android.view.View decorView = this.e.getWindow().getDecorView();
            defpackage.edd.d(decorView, this);
            defpackage.epv.i(decorView, this);
            defpackage.ebq.g(decorView, this);
        }
    }

    @Override // android.support.v4.app.Fragment
    public void onStop() {
        super.onStop();
        android.app.Dialog dialog = this.e;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onViewStateRestored */
    public final void m22lambda$restoreViewState$0$androidsupportv4appFragment(android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.m22lambda$restoreViewState$0$androidsupportv4appFragment(bundle);
        if (this.e == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.e.onRestoreInstanceState(bundle2);
    }

    @Override // android.support.v4.app.Fragment
    public final void performCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.os.Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.e == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.e.onRestoreInstanceState(bundle2);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
    }
}
