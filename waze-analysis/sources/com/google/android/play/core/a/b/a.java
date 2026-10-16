package com.google.android.play.core.a.b;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.android.a.a implements c {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    @Override // com.google.android.play.core.a.b.c
    public final void a(Bundle bundle, e eVar) {
        Parcel parcelObtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
        com.google.android.a.c.b(parcelObtainAndWriteInterfaceToken, bundle);
        com.google.android.a.c.c(parcelObtainAndWriteInterfaceToken, eVar);
        transactOneway(2, parcelObtainAndWriteInterfaceToken);
    }
}
