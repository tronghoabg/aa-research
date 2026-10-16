package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.common.zzg;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class N extends zzg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1717f f26606a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(AbstractC1717f abstractC1717f, Looper looper) {
        super(looper);
        Objects.requireNonNull(abstractC1717f);
        this.f26606a = abstractC1717f;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        G g9;
        AbstractC1717f abstractC1717f = this.f26606a;
        if (abstractC1717f.zzd.get() != message.arg1) {
            int i5 = message.what;
            if ((i5 == 2 || i5 == 1 || i5 == 7) && (g9 = (G) message.obj) != null) {
                g9.c();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !abstractC1717f.enableLocalFallback()) || message.what == 5)) && !abstractC1717f.isConnecting()) {
            G g10 = (G) message.obj;
            if (g10 != null) {
                g10.c();
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            abstractC1717f.zzn(new d7.b(message.arg2, null, null));
            if (abstractC1717f.zzg() && !abstractC1717f.zzo()) {
                abstractC1717f.zzd(3, null);
                return;
            }
            d7.b bVarZzm = abstractC1717f.zzm() != null ? abstractC1717f.zzm() : new d7.b(8, null, null);
            abstractC1717f.zzc.b(bVarZzm);
            abstractC1717f.onConnectionFailed(bVarZzm);
            return;
        }
        if (i11 == 5) {
            d7.b bVarZzm2 = abstractC1717f.zzm() != null ? abstractC1717f.zzm() : new d7.b(8, null, null);
            abstractC1717f.zzc.b(bVarZzm2);
            abstractC1717f.onConnectionFailed(bVarZzm2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            d7.b bVar = new d7.b(message.arg2, null, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            abstractC1717f.zzc.b(bVar);
            abstractC1717f.onConnectionFailed(bVar);
            return;
        }
        if (i11 == 6) {
            abstractC1717f.zzd(5, null);
            if (abstractC1717f.zzk() != null) {
                abstractC1717f.zzk().onConnectionSuspended(message.arg2);
            }
            abstractC1717f.onConnectionSuspended(message.arg2);
            abstractC1717f.zze(5, 1, null);
            return;
        }
        if (i11 == 2 && !abstractC1717f.isConnected()) {
            G g11 = (G) message.obj;
            if (g11 != null) {
                g11.c();
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            Log.wtf("GmsClient", N0.a.d(i12, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i12).length() + 34)), new Exception());
            return;
        }
        G g12 = (G) message.obj;
        synchronized (g12) {
            try {
                bool = g12.f26596a;
                if (g12.f26597b) {
                    String string = g12.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(string);
                    sb2.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC1717f abstractC1717f2 = g12.f26601f;
            int i13 = g12.f26599d;
            if (i13 != 0) {
                abstractC1717f2.zzd(1, null);
                Bundle bundle = g12.f26600e;
                g12.b(new d7.b(i13, null, bundle != null ? (PendingIntent) bundle.getParcelable(AbstractC1717f.KEY_PENDING_INTENT) : null));
            } else if (!g12.a()) {
                abstractC1717f2.zzd(1, null);
                g12.b(new d7.b(8, null, null));
            }
        }
        synchronized (g12) {
            g12.f26597b = true;
        }
        g12.c();
    }
}
