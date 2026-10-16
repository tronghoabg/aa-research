package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes2.dex */
public abstract class qdo {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final byte[] f(long r8, int r10, byte[] r11) throws java.lang.InterruptedException, android.os.RemoteException {
        /*
            r7 = this;
            java.lang.String r0 = "BundleCallSender"
            r1 = 10
        L4:
            byte[] r2 = r7.b(r8, r10, r11)     // Catch: android.os.TransactionTooLargeException -> L25
            if (r2 == 0) goto Ld
            int r3 = r2.length     // Catch: android.os.TransactionTooLargeException -> L25
            if (r3 != 0) goto L24
        Ld:
            java.lang.String r3 = "Call returned null or empty bytes from %s"
            java.lang.Class r4 = super.getClass()     // Catch: android.os.TransactionTooLargeException -> L25
            java.lang.String r4 = r4.getName()     // Catch: android.os.TransactionTooLargeException -> L25
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: android.os.TransactionTooLargeException -> L25
            r6 = 0
            r5[r6] = r4     // Catch: android.os.TransactionTooLargeException -> L25
            java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch: android.os.TransactionTooLargeException -> L25
            android.util.Log.w(r0, r3)     // Catch: android.os.TransactionTooLargeException -> L25
        L24:
            return r2
        L25:
            r2 = move-exception
            int r3 = r1 + (-1)
            if (r1 <= 0) goto L38
            r1 = 10
            java.lang.Thread.sleep(r1)     // Catch: java.lang.InterruptedException -> L30
            goto L36
        L30:
            r1 = move-exception
            java.lang.String r2 = "Interrupted on prepare retry"
            android.util.Log.w(r0, r2, r1)
        L36:
            r1 = r3
            goto L4
        L38:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qdo.f(long, int, byte[]):byte[]");
    }

    private final byte[] g(long j, int i) throws InterruptedException, RemoteException {
        int i2 = 10;
        while (true) {
            try {
                return this.c(j, i);
            } catch (TransactionTooLargeException e) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    throw e;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i2 = i3;
            }
        }
    }

    private final Bundle h(long j) throws InterruptedException, RemoteException {
        int i = 10;
        while (true) {
            try {
                Bundle bundleD = d(j);
                bundleD.setClassLoader(Bundler.class.getClassLoader());
                return bundleD;
            } catch (TransactionTooLargeException e) {
                int i2 = i - 1;
                if (i <= 0) {
                    throw e;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i = i2;
            }
        }
    }

    private final void i(long j, Bundle bundle) throws InterruptedException, RemoteException {
        int i = 10;
        while (true) {
            try {
                e(j, bundle);
                return;
            } catch (TransactionTooLargeException e) {
                int i2 = i - 1;
                if (i <= 0) {
                    throw e;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i = i2;
            }
        }
    }

    private final void j(long j, int i, int i2, byte[] bArr) throws InterruptedException, RemoteException {
        int i3 = 10;
        while (true) {
            try {
                a(j, i, i2, bArr);
                return;
            } catch (TransactionTooLargeException e) {
                int i4 = i3 - 1;
                if (i3 <= 0) {
                    throw e;
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException e2) {
                    Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i3 = i4;
            }
        }
    }

    public abstract void a(long j, int i, int i2, byte[] bArr) throws RemoteException;

    public abstract byte[] b(long j, int i, byte[] bArr) throws RemoteException;

    public abstract byte[] c(long j, int i) throws RemoteException;

    public abstract Bundle d(long j) throws RemoteException;

    public abstract void e(long j, Bundle bundle) throws RemoteException;

    public Bundle makeBundleCall(Bundle bundle) throws InterruptedException, qdl {
        byte[] bArrCopyOfRange;
        int i;
        int i2;
        long mostSignificantBits = UUID.randomUUID().getMostSignificantBits();
        Parcel parcelObtain = Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        int i3 = 1;
        try {
            try {
                try {
                    bArrCopyOfRange = parcelObtain.marshall();
                } catch (RemoteException e) {
                    throw new qdl("Error passing bundle for call", e);
                }
            } catch (AssertionError | RuntimeException unused) {
                i(mostSignificantBits, bundle);
                bArrCopyOfRange = new byte[]{2};
            }
            parcelObtain.recycle();
            try {
                int iCeil = (int) Math.ceil(bArrCopyOfRange.length / 250000.0d);
                if (iCeil > 1) {
                    byte[] bArr = new byte[250000];
                    i = 0;
                    while (true) {
                        i2 = i * 250000;
                        if (i >= iCeil - 1) {
                            break;
                        }
                        System.arraycopy(bArrCopyOfRange, i2, bArr, 0, 250000);
                        qdo qdoVar = this;
                        qdoVar.j(mostSignificantBits, i, bArrCopyOfRange.length, bArr);
                        this = qdoVar;
                        i++;
                    }
                    bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, i2, bArrCopyOfRange.length);
                } else {
                    i = 0;
                }
                byte[] bArrF = this.f(mostSignificantBits, i, bArrCopyOfRange);
                if (bArrF == null) {
                    throw new IllegalStateException("Return bytes are null");
                }
                if (bArrF.length == 0) {
                    Log.w("BundleCallSender", "Return bytes are empty");
                    return null;
                }
                if (BundleCallReceiver.b(bArrF)) {
                    try {
                        return this.h(mostSignificantBits);
                    } catch (RemoteException e2) {
                        throw new qdl("Error fetching bundle for response", e2);
                    }
                }
                if (bArrF[0] == 1) {
                    int i4 = ByteBuffer.wrap(bArrF).getInt(1);
                    try {
                        byte[] bArr2 = new byte[i4];
                        System.arraycopy(bArrF, 5, bArr2, 0, 250000);
                        int iCeil2 = (int) Math.ceil(i4 / 250000.0d);
                        while (i3 < iCeil2) {
                            byte[] bArrG = this.g(mostSignificantBits, i3);
                            System.arraycopy(bArrG, 0, bArr2, i3 * 250000, bArrG.length);
                            i3++;
                        }
                        i3 = 0;
                        bArrF = bArr2;
                    } catch (RemoteException e3) {
                        throw new qdl("Could not access other profile", e3);
                    }
                }
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.unmarshall(bArrF, i3, bArrF.length - i3);
                parcelObtain2.setDataPosition(0);
                Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
                bundle2.readFromParcel(parcelObtain2);
                parcelObtain2.recycle();
                return bundle2;
            } catch (RemoteException e4) {
                throw new qdl("Could not access other profile", e4);
            }
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
