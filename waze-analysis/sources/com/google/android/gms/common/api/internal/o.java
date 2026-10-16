package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class o extends an implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    protected volatile boolean f4842a;

    /* renamed from: b, reason: collision with root package name */
    protected final AtomicReference f4843b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.google.android.gms.common.h f4844c;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f4845e;

    o(ao aoVar, com.google.android.gms.common.h hVar) {
        super(aoVar);
        this.f4843b = new AtomicReference(null);
        this.f4845e = new com.waze.native_managers.j(Looper.getMainLooper());
        this.f4844c = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(com.google.android.gms.common.d dVar, int i2) {
        this.f4843b.set(null);
        f(dVar, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        this.f4843b.set(null);
        g();
    }

    private static final int o(m mVar) {
        if (mVar == null) {
            return -1;
        }
        return mVar.a();
    }

    public final void c(com.google.android.gms.common.d dVar, int i2) {
        m mVar = new m(dVar, i2);
        if (a.a.g(this.f4843b, mVar)) {
            this.f4845e.post(new n(this, mVar));
        }
    }

    @Override // com.google.android.gms.common.api.internal.an
    public final void d(int i2, int i3, Intent intent) {
        m mVar = (m) this.f4843b.get();
        if (i2 != 1) {
            if (i2 == 2) {
                int iL = this.f4844c.l(n());
                if (iL == 0) {
                    j();
                    return;
                } else {
                    if (mVar == null) {
                        return;
                    }
                    if (mVar.b().a() == 18 && iL == 18) {
                        return;
                    }
                }
            }
        } else if (i3 == -1) {
            j();
            return;
        } else if (i3 == 0) {
            if (mVar != null) {
                i(new com.google.android.gms.common.d(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, mVar.b().toString()), o(mVar));
                return;
            }
            return;
        }
        if (mVar != null) {
            i(mVar.b(), mVar.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.an
    public final void e(Bundle bundle) {
        if (bundle != null) {
            this.f4843b.set(bundle.getBoolean("resolving_error", false) ? new m(new com.google.android.gms.common.d(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void f(com.google.android.gms.common.d dVar, int i2);

    protected abstract void g();

    @Override // com.google.android.gms.common.api.internal.an
    public final void h(Bundle bundle) {
        m mVar = (m) this.f4843b.get();
        if (mVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", mVar.a());
        bundle.putInt("failed_status", mVar.b().a());
        bundle.putParcelable("failed_resolution", mVar.b().b());
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        i(new com.google.android.gms.common.d(13, null), o((m) this.f4843b.get()));
    }
}
