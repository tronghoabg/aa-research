package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ao extends com.google.android.a.a implements IInterface {
    ao(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    public final Account a() {
        Parcel parcelTransactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
        Account account = (Account) com.google.android.a.c.a(parcelTransactAndReadException, Account.CREATOR);
        parcelTransactAndReadException.recycle();
        return account;
    }
}
