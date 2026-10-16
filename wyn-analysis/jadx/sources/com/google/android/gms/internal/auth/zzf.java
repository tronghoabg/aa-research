package com.google.android.gms.internal.auth;

import T6.b;
import T6.c;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes3.dex */
public interface zzf extends IInterface {
    Bundle zzd(String str, Bundle bundle) throws RemoteException;

    Bundle zze(Account account, String str, Bundle bundle) throws RemoteException;

    Bundle zzf(Account account) throws RemoteException;

    Bundle zzg(String str) throws RemoteException;

    c zzh(b bVar) throws RemoteException;
}
