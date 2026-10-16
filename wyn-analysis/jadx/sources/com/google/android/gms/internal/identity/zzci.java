package com.google.android.gms.internal.identity;

import Lc.b;
import U8.v0;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.internal.C1701o;
import com.google.android.gms.common.api.internal.C1703q;
import com.google.android.gms.common.api.internal.C1707v;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;
import x7.C4495g;
import x7.InterfaceC4494f;

/* loaded from: classes.dex */
public final class zzci extends l {
    public static final /* synthetic */ int zza = 0;

    public zzci(Activity activity) {
        super(activity, activity, zzbi.zzb, e.f26433X8, k.f26561c);
    }

    @Override // com.google.android.gms.common.api.l
    public final String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final Task<Void> removeOrientationUpdates(InterfaceC4494f interfaceC4494f) {
        return doUnregisterEventListener(v0.w(interfaceC4494f, InterfaceC4494f.class.getSimpleName()), 2440).continueWith(zzcm.zza, zzck.zza);
    }

    public final Task<Void> requestOrientationUpdates(final C4495g c4495g, Executor executor, InterfaceC4494f interfaceC4494f) {
        final C1703q c1703qV = v0.v(interfaceC4494f, InterfaceC4494f.class.getSimpleName(), executor);
        InterfaceC1708w interfaceC1708w = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzcl
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                ((zzdz) obj).zzC(c1703qV, c4495g, (TaskCompletionSource) obj2);
            }
        };
        InterfaceC1708w interfaceC1708w2 = new InterfaceC1708w() { // from class: com.google.android.gms.internal.location.zzcj
            @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
            public final void accept(Object obj, Object obj2) throws RemoteException {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                C1701o c1701o = c1703qV.f26552c;
                if (c1701o != null) {
                    zzdzVar.zzD(c1701o, taskCompletionSource);
                }
            }
        };
        b bVarA = C1707v.a();
        bVarA.f7076c = interfaceC1708w;
        bVarA.f7077d = interfaceC1708w2;
        bVarA.f7078e = c1703qV;
        bVarA.f7075b = 2434;
        return doRegisterEventListener(bVarA.b());
    }

    public zzci(Context context) {
        super(context, null, zzbi.zzb, e.f26433X8, k.f26561c);
    }
}
