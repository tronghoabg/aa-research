package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzfht {
    public static void zza(AtomicReference atomicReference, zzfhs zzfhsVar) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            zzfhsVar.zza(obj);
        } catch (RemoteException e7) {
            int i5 = G6.L.f4523b;
            H6.l.i("#007 Could not call remote method.", e7);
        } catch (NullPointerException e10) {
            int i10 = G6.L.f4523b;
            H6.l.g("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }
}
