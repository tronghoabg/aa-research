package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qel {
    private final byte[] f(long j, int i, byte[] bArr) throws android.os.RemoteException {
        byte[] bArrB;
        int i2 = 10;
        while (true) {
            try {
                bArrB = b(j, i, bArr);
                if (bArrB != null && bArrB.length != 0) {
                    break;
                }
                android.util.Log.w("BundleCallSender", java.lang.String.format("Call returned null or empty bytes from %s", super.getClass().getName()));
                break;
            } catch (android.os.TransactionTooLargeException e) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    throw e;
                }
                try {
                    java.lang.Thread.sleep(10L);
                } catch (java.lang.InterruptedException e2) {
                    android.util.Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i2 = i3;
            }
        }
        return bArrB;
    }

    private final byte[] g(long j, int i) throws android.os.RemoteException {
        int i2 = 10;
        while (true) {
            try {
                return this.c(j, i);
            } catch (android.os.TransactionTooLargeException e) {
                int i3 = i2 - 1;
                if (i2 <= 0) {
                    throw e;
                }
                try {
                    java.lang.Thread.sleep(10L);
                } catch (java.lang.InterruptedException e2) {
                    android.util.Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i2 = i3;
            }
        }
    }

    private final android.os.Bundle h(long j) throws android.os.RemoteException {
        int i = 10;
        while (true) {
            try {
                android.os.Bundle bundleD = d(j);
                bundleD.setClassLoader(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
                return bundleD;
            } catch (android.os.TransactionTooLargeException e) {
                int i2 = i - 1;
                if (i <= 0) {
                    throw e;
                }
                try {
                    java.lang.Thread.sleep(10L);
                } catch (java.lang.InterruptedException e2) {
                    android.util.Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i = i2;
            }
        }
    }

    private final void i(long j, android.os.Bundle bundle) throws android.os.RemoteException {
        int i = 10;
        while (true) {
            try {
                e(j, bundle);
                return;
            } catch (android.os.TransactionTooLargeException e) {
                int i2 = i - 1;
                if (i <= 0) {
                    throw e;
                }
                try {
                    java.lang.Thread.sleep(10L);
                } catch (java.lang.InterruptedException e2) {
                    android.util.Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i = i2;
            }
        }
    }

    private final void j(long j, int i, int i2, byte[] bArr) throws android.os.RemoteException {
        int i3 = 10;
        while (true) {
            try {
                a(j, i, i2, bArr);
                return;
            } catch (android.os.TransactionTooLargeException e) {
                int i4 = i3 - 1;
                if (i3 <= 0) {
                    throw e;
                }
                try {
                    java.lang.Thread.sleep(10L);
                } catch (java.lang.InterruptedException e2) {
                    android.util.Log.w("BundleCallSender", "Interrupted on prepare retry", e2);
                }
                i3 = i4;
            }
        }
    }

    public abstract void a(long j, int i, int i2, byte[] bArr) throws android.os.RemoteException;

    public abstract byte[] b(long j, int i, byte[] bArr) throws android.os.RemoteException;

    public abstract byte[] c(long j, int i) throws android.os.RemoteException;

    public abstract android.os.Bundle d(long j) throws android.os.RemoteException;

    public abstract void e(long j, android.os.Bundle bundle) throws android.os.RemoteException;

    public android.os.Bundle makeBundleCall(android.os.Bundle bundle) throws defpackage.qei {
        byte[] bArrCopyOfRange;
        int i;
        int i2;
        long mostSignificantBits = java.util.UUID.randomUUID().getMostSignificantBits();
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.setDataPosition(0);
        int i3 = 1;
        try {
            try {
                try {
                    bArrCopyOfRange = parcelObtain.marshall();
                } catch (android.os.RemoteException e) {
                    throw new defpackage.qei("Error passing bundle for call", e);
                }
            } catch (java.lang.AssertionError | java.lang.RuntimeException unused) {
                i(mostSignificantBits, bundle);
                bArrCopyOfRange = new byte[]{2};
            }
            parcelObtain.recycle();
            try {
                int iCeil = (int) java.lang.Math.ceil(((double) bArrCopyOfRange.length) / 250000.0d);
                if (iCeil > 1) {
                    byte[] bArr = new byte[250000];
                    i = 0;
                    while (true) {
                        i2 = i * 250000;
                        if (i >= iCeil - 1) {
                            break;
                        }
                        java.lang.System.arraycopy(bArrCopyOfRange, i2, bArr, 0, 250000);
                        defpackage.qel qelVar = this;
                        qelVar.j(mostSignificantBits, i, bArrCopyOfRange.length, bArr);
                        this = qelVar;
                        i++;
                    }
                    bArrCopyOfRange = java.util.Arrays.copyOfRange(bArrCopyOfRange, i2, bArrCopyOfRange.length);
                } else {
                    i = 0;
                }
                byte[] bArrF = this.f(mostSignificantBits, i, bArrCopyOfRange);
                if (bArrF == null) {
                    throw new java.lang.IllegalStateException("Return bytes are null");
                }
                if (bArrF.length == 0) {
                    android.util.Log.w("BundleCallSender", "Return bytes are empty");
                    return null;
                }
                if (com.google.android.enterprise.connectedapps.internal.BundleCallReceiver.b(bArrF)) {
                    try {
                        return this.h(mostSignificantBits);
                    } catch (android.os.RemoteException e2) {
                        throw new defpackage.qei("Error fetching bundle for response", e2);
                    }
                }
                if (bArrF[0] == 1) {
                    int i4 = java.nio.ByteBuffer.wrap(bArrF).getInt(1);
                    try {
                        byte[] bArr2 = new byte[i4];
                        java.lang.System.arraycopy(bArrF, 5, bArr2, 0, 250000);
                        int iCeil2 = (int) java.lang.Math.ceil(((double) i4) / 250000.0d);
                        while (i3 < iCeil2) {
                            byte[] bArrG = this.g(mostSignificantBits, i3);
                            java.lang.System.arraycopy(bArrG, 0, bArr2, i3 * 250000, bArrG.length);
                            i3++;
                        }
                        i3 = 0;
                        bArrF = bArr2;
                    } catch (android.os.RemoteException e3) {
                        throw new defpackage.qei("Could not access other profile", e3);
                    }
                }
                android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                parcelObtain2.unmarshall(bArrF, i3, bArrF.length - i3);
                parcelObtain2.setDataPosition(0);
                android.os.Bundle bundle2 = new android.os.Bundle(com.google.android.enterprise.connectedapps.internal.Bundler.class.getClassLoader());
                bundle2.readFromParcel(parcelObtain2);
                parcelObtain2.recycle();
                return bundle2;
            } catch (android.os.RemoteException e4) {
                throw new defpackage.qei("Could not access other profile", e4);
            }
        } catch (java.lang.Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}
