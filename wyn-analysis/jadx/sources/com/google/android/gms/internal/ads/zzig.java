package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes3.dex */
public class zzig extends zzhs {
    public final int zzb;

    public zzig(zzhv zzhvVar, int i5, int i10) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzig zza(IOException iOException, zzhv zzhvVar, int i5) {
        String message = iOException.getMessage();
        int i10 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !zzgsz.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i10 == 2007 ? new zzif(iOException, zzhvVar) : new zzig(iOException, zzhvVar, i10, i5);
    }

    private static int zzb(int i5, int i10) {
        return i5 == 2000 ? i10 != 1 ? 2000 : 2001 : i5;
    }

    public zzig(IOException iOException, zzhv zzhvVar, int i5, int i10) {
        super(iOException, zzb(i5, i10));
        this.zzb = i10;
    }

    public zzig(String str, zzhv zzhvVar, int i5, int i10) {
        super(str, zzb(i5, i10));
        this.zzb = i10;
    }

    public zzig(String str, IOException iOException, zzhv zzhvVar, int i5, int i10) {
        super(str, iOException, zzb(i5, i10));
        this.zzb = i10;
    }
}
