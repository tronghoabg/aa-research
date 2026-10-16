package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ka.AbstractC3256n;

/* renamed from: androidx.fragment.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC1430t extends F implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final DialogInterfaceOnCancelListenerC1428q f18535a;

    /* renamed from: b, reason: collision with root package name */
    public final r f18536b;

    /* renamed from: c, reason: collision with root package name */
    public int f18537c;

    /* renamed from: d, reason: collision with root package name */
    public int f18538d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18539e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18540f;

    /* renamed from: g, reason: collision with root package name */
    public int f18541g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18542h;

    /* renamed from: i, reason: collision with root package name */
    public final A f18543i;

    /* renamed from: j, reason: collision with root package name */
    public Dialog f18544j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18545l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18546m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18547n;

    public DialogInterfaceOnCancelListenerC1430t() {
        new RunnableC1427p(this, 0);
        this.f18535a = new DialogInterfaceOnCancelListenerC1428q(this);
        this.f18536b = new r(this);
        this.f18537c = 0;
        this.f18538d = 0;
        this.f18539e = true;
        this.f18540f = true;
        this.f18541g = -1;
        this.f18543i = new A(this, 1);
        this.f18547n = false;
    }

    public Dialog G() {
        if (e0.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.m(requireContext(), this.f18538d);
    }

    @Override // androidx.fragment.app.F
    public final M createFragmentContainer() {
        return new C1429s(this, super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.F
    public final void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().e(this.f18543i);
        if (this.f18546m) {
            return;
        }
        this.f18545l = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.F
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new Handler();
        this.f18540f = this.mContainerId == 0;
        if (bundle != null) {
            this.f18537c = bundle.getInt("android:style", 0);
            this.f18538d = bundle.getInt("android:theme", 0);
            this.f18539e = bundle.getBoolean("android:cancelable", true);
            this.f18540f = bundle.getBoolean("android:showsDialog", this.f18540f);
            this.f18541g = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f18544j;
        if (dialog != null) {
            this.k = true;
            dialog.setOnDismissListener(null);
            this.f18544j.dismiss();
            if (!this.f18545l) {
                onDismiss(this.f18544j);
            }
            this.f18544j = null;
            this.f18547n = false;
        }
    }

    @Override // androidx.fragment.app.F
    public final void onDetach() {
        super.onDetach();
        if (!this.f18546m && !this.f18545l) {
            this.f18545l = true;
        }
        getViewLifecycleOwnerLiveData().i(this.f18543i);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.k) {
            return;
        }
        if (e0.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f18545l) {
            return;
        }
        this.f18545l = true;
        this.f18546m = false;
        Dialog dialog = this.f18544j;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f18544j.dismiss();
        }
        this.k = true;
        if (this.f18541g >= 0) {
            e0 parentFragmentManager = getParentFragmentManager();
            int i5 = this.f18541g;
            parentFragmentManager.getClass();
            if (i5 < 0) {
                throw new IllegalArgumentException(AbstractC3256n.g(i5, "Bad id: "));
            }
            parentFragmentManager.x(new C1414c0(parentFragmentManager, i5, 1), true);
            this.f18541g = -1;
            return;
        }
        e0 parentFragmentManager2 = getParentFragmentManager();
        parentFragmentManager2.getClass();
        C1409a c1409a = new C1409a(parentFragmentManager2);
        c1409a.f18364p = true;
        e0 e0Var = this.mFragmentManager;
        if (e0Var == null || e0Var == c1409a.f18365q) {
            c1409a.b(new n0(this, 3));
            c1409a.d(true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:29:0x0050, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0068), top: B:49:0x001a }] */
    @Override // androidx.fragment.app.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater onGetLayoutInflater(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.onGetLayoutInflater(r8)
            boolean r0 = r7.f18540f
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L9a
            boolean r3 = r7.f18542h
            if (r3 == 0) goto L11
            goto L9a
        L11:
            if (r0 != 0) goto L14
            goto L71
        L14:
            boolean r0 = r7.f18547n
            if (r0 != 0) goto L71
            r0 = 0
            r3 = 1
            r7.f18542h = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.G()     // Catch: java.lang.Throwable -> L4e
            r7.f18544j = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f18540f     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L68
            int r5 = r7.f18537c     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4e
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4e
        L3e:
            android.content.Context r4 = r7.getContext()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            android.app.Dialog r5 = r7.f18544j     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r4 = r7.f18544j     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.f18539e     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f18544j     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.q r5 = r7.f18535a     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.f18544j     // Catch: java.lang.Throwable -> L4e
            androidx.fragment.app.r r5 = r7.f18536b     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.f18547n = r3     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r3 = 0
            r7.f18544j = r3     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.f18542h = r0
            goto L71
        L6e:
            r7.f18542h = r0
            throw r8
        L71:
            boolean r0 = androidx.fragment.app.e0.J(r2)
            if (r0 == 0) goto L8d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8d:
            android.app.Dialog r0 = r7.f18544j
            if (r0 == 0) goto Ld5
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L9a:
            boolean r0 = androidx.fragment.app.e0.J(r2)
            if (r0 == 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f18540f
            if (r2 != 0) goto Lc4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r8
        Lc4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld5:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DialogInterfaceOnCancelListenerC1430t.onGetLayoutInflater(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // androidx.fragment.app.F
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f18544j;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i5 = this.f18537c;
        if (i5 != 0) {
            bundle.putInt("android:style", i5);
        }
        int i10 = this.f18538d;
        if (i10 != 0) {
            bundle.putInt("android:theme", i10);
        }
        boolean z2 = this.f18539e;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z10 = this.f18540f;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i11 = this.f18541g;
        if (i11 != -1) {
            bundle.putInt("android:backStackId", i11);
        }
    }

    @Override // androidx.fragment.app.F
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f18544j;
        if (dialog != null) {
            this.k = false;
            dialog.show();
            View decorView = this.f18544j.getWindow().getDecorView();
            androidx.lifecycle.V.h(decorView, this);
            androidx.lifecycle.V.i(decorView, this);
            tg.b.O(decorView, this);
        }
    }

    @Override // androidx.fragment.app.F
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f18544j;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.F
    public final void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f18544j == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f18544j.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.F
    public final void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f18544j == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f18544j.onRestoreInstanceState(bundle2);
    }
}
