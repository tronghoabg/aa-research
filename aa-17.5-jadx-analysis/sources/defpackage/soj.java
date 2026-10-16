package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class soj extends ijo implements sok {
    private int a;

    protected soj(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] d(String str) {
        return str.getBytes(StandardCharsets.ISO_8859_1);
    }

    @Override // defpackage.sok
    public final int b() {
        return this.a;
    }

    @Override // defpackage.sok
    public final sqj c() {
        return new sqi(go());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sok)) {
            return false;
        }
        try {
            sok sokVar = (sok) obj;
            if (sokVar.b() != this.a) {
                return false;
            }
            return Arrays.equals(go(), (byte[]) sqi.a(sokVar.c()));
        } catch (RemoteException e) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            sqj sqjVarC = c();
            parcel2.writeNoException();
            ijp.i(parcel2, sqjVarC);
        } else {
            if (i != 2) {
                return false;
            }
            int i2 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i2);
        }
        return true;
    }

    public abstract byte[] go();

    public final int hashCode() {
        return this.a;
    }
}
