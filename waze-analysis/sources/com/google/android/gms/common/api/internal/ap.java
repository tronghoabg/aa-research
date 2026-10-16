package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ap extends Fragment implements ao {

    /* renamed from: a, reason: collision with root package name */
    private static final WeakHashMap f4753a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ar f4754b = new ar();

    public static ap d(Activity activity) {
        ap apVar;
        WeakHashMap weakHashMap = f4753a;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (apVar = (ap) weakReference.get()) != null) {
            return apVar;
        }
        try {
            ap apVar2 = (ap) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (apVar2 == null || apVar2.isRemoving()) {
                apVar2 = new ap();
                activity.getFragmentManager().beginTransaction().add(apVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(apVar2));
            return apVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ao
    public final Activity a() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.ao
    public final void b(an anVar) {
        this.f4754b.j(anVar);
    }

    @Override // com.google.android.gms.common.api.internal.ao
    public final an c(Class cls) {
        return this.f4754b.l(cls);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f4754b.k();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.f4754b.c(i2, i3, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4754b.d(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f4754b.e();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f4754b.f();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f4754b.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f4754b.h();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f4754b.i();
    }
}
