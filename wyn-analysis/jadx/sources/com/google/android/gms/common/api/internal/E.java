package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import x.C4413f;

/* loaded from: classes3.dex */
public final class E extends AbstractC1699m implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f26445a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f26446b;

    /* renamed from: c, reason: collision with root package name */
    public final zau f26447c;

    /* renamed from: d, reason: collision with root package name */
    public final d7.e f26448d;

    /* renamed from: e, reason: collision with root package name */
    public final C4413f f26449e;

    /* renamed from: f, reason: collision with root package name */
    public final C1695i f26450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(InterfaceC1700n interfaceC1700n, C1695i c1695i) {
        super(interfaceC1700n);
        d7.e eVar = d7.e.f34127d;
        this.f26446b = new AtomicReference(null);
        this.f26447c = new zau(Looper.getMainLooper());
        this.f26448d = eVar;
        this.f26449e = new C4413f(0);
        this.f26450f = c1695i;
        this.mLifecycleFragment.g("ConnectionlessLifecycleHelper", this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1699m
    public final void onActivityResult(int i5, int i10, Intent intent) {
        AtomicReference atomicReference = this.f26446b;
        d0 d0Var = (d0) atomicReference.get();
        C1695i c1695i = this.f26450f;
        if (i5 != 1) {
            if (i5 == 2) {
                int iD = this.f26448d.d(getActivity(), d7.f.f34128a);
                if (iD == 0) {
                    atomicReference.set(null);
                    zau zauVar = c1695i.f26543n;
                    zauVar.sendMessage(zauVar.obtainMessage(3));
                    return;
                } else {
                    if (d0Var == null) {
                        return;
                    }
                    if (d0Var.f26519b.f34115b == 18 && iD == 18) {
                        return;
                    }
                }
            }
        } else if (i10 == -1) {
            atomicReference.set(null);
            zau zauVar2 = c1695i.f26543n;
            zauVar2.sendMessage(zauVar2.obtainMessage(3));
            return;
        } else if (i10 == 0) {
            if (d0Var != null) {
                d7.b bVar = new d7.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, d0Var.f26519b.toString(), null);
                atomicReference.set(null);
                c1695i.j(bVar, d0Var.f26518a);
                return;
            }
            return;
        }
        if (d0Var != null) {
            atomicReference.set(null);
            c1695i.j(d0Var.f26519b, d0Var.f26518a);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        d7.b bVar = new d7.b(13, null, null);
        AtomicReference atomicReference = this.f26446b;
        d0 d0Var = (d0) atomicReference.get();
        int i5 = d0Var == null ? -1 : d0Var.f26518a;
        atomicReference.set(null);
        this.f26450f.j(bVar, i5);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1699m
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f26446b.set(bundle.getBoolean("resolving_error", false) ? new d0(new d7.b(bundle.getInt("failed_status"), null, (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1699m
    public final void onResume() {
        super.onResume();
        if (this.f26449e.isEmpty()) {
            return;
        }
        this.f26450f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1699m
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        d0 d0Var = (d0) this.f26446b.get();
        if (d0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", d0Var.f26518a);
        d7.b bVar = d0Var.f26519b;
        bundle.putInt("failed_status", bVar.f34115b);
        bundle.putParcelable("failed_resolution", bVar.f34116c);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1699m
    public final void onStart() {
        super.onStart();
        this.f26445a = true;
        if (this.f26449e.isEmpty()) {
            return;
        }
        this.f26450f.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1699m
    public final void onStop() {
        this.f26445a = false;
        C1695i c1695i = this.f26450f;
        c1695i.getClass();
        synchronized (C1695i.f26529r) {
            try {
                if (c1695i.k == this) {
                    c1695i.k = null;
                    c1695i.f26541l.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
