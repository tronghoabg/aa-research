package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class i0 extends androidx.fragment.app.F implements InterfaceC1700n {

    /* renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f26545b = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final E4.n f26546a = new E4.n(11, (char) 0);

    @Override // androidx.fragment.app.F
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.f26546a.f2939c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC1699m) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1700n
    public final void g(String str, AbstractC1699m abstractC1699m) {
        this.f26546a.z(str, abstractC1699m);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1700n
    public final AbstractC1699m j(Class cls, String str) {
        return (AbstractC1699m) cls.cast(((Map) this.f26546a.f2939c).get(str));
    }

    @Override // androidx.fragment.app.F
    public final void onActivityResult(int i5, int i10, Intent intent) {
        super.onActivityResult(i5, i10, intent);
        Iterator it = ((Map) this.f26546a.f2939c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC1699m) it.next()).onActivityResult(i5, i10, intent);
        }
    }

    @Override // androidx.fragment.app.F
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f26546a.A(bundle);
    }

    @Override // androidx.fragment.app.F
    public final void onDestroy() {
        super.onDestroy();
        E4.n nVar = this.f26546a;
        nVar.f2938b = 5;
        Iterator it = ((Map) nVar.f2939c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC1699m) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.F
    public final void onResume() {
        super.onResume();
        E4.n nVar = this.f26546a;
        nVar.f2938b = 3;
        Iterator it = ((Map) nVar.f2939c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC1699m) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.F
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f26546a.B(bundle);
    }

    @Override // androidx.fragment.app.F
    public final void onStart() {
        super.onStart();
        E4.n nVar = this.f26546a;
        nVar.f2938b = 2;
        Iterator it = ((Map) nVar.f2939c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC1699m) it.next()).onStart();
        }
    }

    @Override // androidx.fragment.app.F
    public final void onStop() {
        super.onStop();
        E4.n nVar = this.f26546a;
        nVar.f2938b = 4;
        Iterator it = ((Map) nVar.f2939c).values().iterator();
        while (it.hasNext()) {
            ((AbstractC1699m) it.next()).onStop();
        }
    }
}
