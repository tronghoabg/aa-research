package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C1409a;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1699m {
    protected final InterfaceC1700n mLifecycleFragment;

    public AbstractC1699m(InterfaceC1700n interfaceC1700n) {
        this.mLifecycleFragment = interfaceC1700n;
    }

    public static InterfaceC1700n getFragment(Activity activity) {
        return getFragment(new C1698l(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity activityU = this.mLifecycleFragment.u();
        AbstractC1732v.i(activityU);
        return activityU;
    }

    public void onActivityResult(int i5, int i10, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public abstract void onStop();

    public static InterfaceC1700n getFragment(C1698l c1698l) {
        h0 h0Var;
        i0 i0Var;
        Activity activity = c1698l.f26547a;
        if (!(activity instanceof FragmentActivity)) {
            if (!(activity instanceof Activity)) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = h0.f26525b;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (h0Var = (h0) weakReference.get()) != null) {
                return h0Var;
            }
            try {
                h0 h0Var2 = (h0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (h0Var2 == null || h0Var2.isRemoving()) {
                    h0Var2 = new h0();
                    activity.getFragmentManager().beginTransaction().add(h0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(h0Var2));
                return h0Var2;
            } catch (ClassCastException e7) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e7);
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        WeakHashMap weakHashMap2 = i0.f26545b;
        androidx.fragment.app.e0 supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        WeakHashMap weakHashMap3 = i0.f26545b;
        WeakReference weakReference2 = (WeakReference) weakHashMap3.get(fragmentActivity);
        if (weakReference2 != null && (i0Var = (i0) weakReference2.get()) != null) {
            return i0Var;
        }
        try {
            i0 i0Var2 = (i0) supportFragmentManager.C("SLifecycleFragmentImpl");
            if (i0Var2 == null || i0Var2.isRemoving()) {
                i0Var2 = new i0();
                C1409a c1409a = new C1409a(supportFragmentManager);
                c1409a.e(0, i0Var2, "SLifecycleFragmentImpl", 1);
                c1409a.d(true);
            }
            weakHashMap3.put(fragmentActivity, new WeakReference(i0Var2));
            return i0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    public static InterfaceC1700n getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
