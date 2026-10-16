package com.google.android.gms.ads.internal.offline.buffering;

import D6.C0370f;
import D6.C0388o;
import D6.C0392q;
import E6.a;
import J3.m;
import J3.p;
import android.content.Context;
import android.os.RemoteException;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzbzb;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: b, reason: collision with root package name */
    public final zzbzb f26304b;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C0388o c0388o = C0392q.f2477g.f2479b;
        zzbvf zzbvfVar = new zzbvf();
        c0388o.getClass();
        this.f26304b = (zzbzb) new C0370f(c0388o, context, zzbvfVar).d(context, false);
    }

    @Override // androidx.work.Worker
    public final p doWork() {
        try {
            this.f26304b.zzj(new BinderC3877b(getApplicationContext()), new a(getInputData().b("uri"), getInputData().b("gws_query_id"), getInputData().b("image_url")));
            return p.a();
        } catch (RemoteException unused) {
            return new m();
        }
    }
}
