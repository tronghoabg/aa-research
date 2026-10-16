package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class spe extends defpackage.ijw implements defpackage.spf {
    private int a;

    protected spe(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new java.lang.IllegalArgumentException();
        }
        this.a = java.util.Arrays.hashCode(bArr);
    }

    public static byte[] d(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1);
    }

    @Override // defpackage.spf
    public final int b() {
        return this.a;
    }

    @Override // defpackage.spf
    public final defpackage.srh c() {
        return new defpackage.srg(fw());
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.spf)) {
            return false;
        }
        try {
            defpackage.spf spfVar = (defpackage.spf) obj;
            if (spfVar.b() != this.a) {
                return false;
            }
            return java.util.Arrays.equals(fw(), (byte[]) defpackage.srg.a(spfVar.c()));
        } catch (android.os.RemoteException e) {
            android.util.Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            return false;
        }
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            defpackage.srh srhVarC = c();
            parcel2.writeNoException();
            defpackage.ijx.i(parcel2, srhVarC);
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

    public abstract byte[] fw();

    public final int hashCode() {
        return this.a;
    }
}
