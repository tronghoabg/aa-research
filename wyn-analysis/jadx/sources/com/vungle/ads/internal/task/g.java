package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class g extends j {

    /* renamed from: e, reason: collision with root package name */
    public static final String f33689e = "g";

    /* renamed from: a, reason: collision with root package name */
    public final f f33690a;

    /* renamed from: b, reason: collision with root package name */
    public final e f33691b;

    /* renamed from: c, reason: collision with root package name */
    public final h f33692c;

    /* renamed from: d, reason: collision with root package name */
    public final n f33693d;

    public g(f jobinfo, e creator, h jobRunner, n nVar) {
        AbstractC3340k.e(jobinfo, "jobinfo");
        AbstractC3340k.e(creator, "creator");
        AbstractC3340k.e(jobRunner, "jobRunner");
        this.f33690a = jobinfo;
        this.f33691b = creator;
        this.f33692c = jobRunner;
        this.f33693d = nVar;
    }

    @Override // com.vungle.ads.internal.task.j
    public final int a() {
        return this.f33690a.f33688e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f33693d;
        if (nVar != null) {
            try {
                int iA = ((i) nVar).a(this.f33690a);
                Process.setThreadPriority(iA);
                boolean z2 = u.f33874a;
                String TAG = f33689e;
                AbstractC3340k.d(TAG, "TAG");
                t.a(TAG, "Setting process thread prio = " + iA + " for " + this.f33690a.d());
            } catch (Throwable unused) {
                boolean z10 = u.f33874a;
                String TAG2 = f33689e;
                AbstractC3340k.d(TAG2, "TAG");
                t.b(TAG2, "Error on setting process thread priority");
            }
        }
        try {
            String strD = this.f33690a.d();
            Bundle bundleC = this.f33690a.c();
            boolean z11 = u.f33874a;
            String TAG3 = f33689e;
            AbstractC3340k.d(TAG3, "TAG");
            t.a(TAG3, "Start job " + strD + "Thread " + Thread.currentThread().getName());
            int iA2 = ((p) this.f33691b).a(strD).a(bundleC, this.f33692c);
            t.a(TAG3, "On job finished " + strD + " with result " + iA2);
            if (iA2 == 2) {
                this.f33690a.getClass();
            }
        } catch (Exception e7) {
            boolean z12 = u.f33874a;
            String TAG4 = f33689e;
            AbstractC3340k.d(TAG4, "TAG");
            t.b(TAG4, "Cannot create job" + e7.getLocalizedMessage());
        }
    }
}
