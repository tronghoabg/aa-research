package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.bv;
import android.support.v4.app.ch;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bl extends android.support.v4.app.ar implements ao {

    /* renamed from: a, reason: collision with root package name */
    private static final WeakHashMap f4805a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final ar f4806b = new ar();

    public static bl d(android.support.v4.app.av avVar) {
        bl blVar;
        bv bvVarBv = avVar.bv();
        WeakHashMap weakHashMap = f4805a;
        WeakReference weakReference = (WeakReference) weakHashMap.get(avVar);
        if (weakReference != null && (blVar = (bl) weakReference.get()) != null) {
            return blVar;
        }
        try {
            bl blVar2 = (bl) bvVarBv.h("SLifecycleFragmentImpl");
            if (blVar2 == null || blVar2.isRemoving()) {
                blVar2 = new bl();
                ch chVarU = bvVarBv.u();
                chVarU.s(blVar2, "SLifecycleFragmentImpl");
                chVarU.l();
            }
            weakHashMap.put(avVar, new WeakReference(blVar2));
            return blVar2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e2);
        }
    }

    @Override // com.google.android.gms.common.api.internal.ao
    public final Activity a() {
        return getActivity();
    }

    @Override // com.google.android.gms.common.api.internal.ao
    public final void b(an anVar) {
        this.f4806b.j(anVar);
    }

    @Override // com.google.android.gms.common.api.internal.ao
    public final an c(Class cls) {
        return this.f4806b.l(cls);
    }

    @Override // android.support.v4.app.ar
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f4806b.k();
    }

    @Override // android.support.v4.app.ar
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.f4806b.c(i2, i3, intent);
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onCreate */
    public final void m37lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m37lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.f4806b.d(bundle);
    }

    @Override // android.support.v4.app.ar
    public final void onDestroy() {
        super.onDestroy();
        this.f4806b.e();
    }

    @Override // android.support.v4.app.ar
    public final void onResume() {
        super.onResume();
        this.f4806b.f();
    }

    @Override // android.support.v4.app.ar
    /* renamed from: onSaveInstanceState */
    public final void m47x22bc4f96(Bundle bundle) {
        this.f4806b.g(bundle);
    }

    @Override // android.support.v4.app.ar
    public final void onStart() {
        super.onStart();
        this.f4806b.h();
    }

    @Override // android.support.v4.app.ar
    public final void onStop() {
        super.onStop();
        this.f4806b.i();
    }
}
