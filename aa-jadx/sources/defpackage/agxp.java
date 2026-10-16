package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agxp {
    private agxp() {
    }

    public static long a(java.io.DataInput dataInput) throws java.io.IOException {
        long unsignedByte;
        long j;
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = unsignedByte2 >> 6;
        if (i == 1) {
            unsignedByte = dataInput.readUnsignedByte() | ((unsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8);
            j = 60000;
        } else if (i == 2) {
            unsignedByte = ((((long) unsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else {
            if (i == 3) {
                return dataInput.readLong();
            }
            unsignedByte = (unsignedByte2 << 26) >> 26;
            j = 1800000;
        }
        return unsignedByte * j;
    }

    public static defpackage.akdl b(java.io.DataInput dataInput, java.lang.String str) throws java.io.IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 67) {
            return new defpackage.akgp(defpackage.akgs.n(dataInput, str));
        }
        if (unsignedByte != 70) {
            if (unsignedByte == 80) {
                return defpackage.akgs.n(dataInput, str);
            }
            throw new java.io.IOException("Invalid encoding");
        }
        defpackage.akgv akgvVar = new defpackage.akgv(str, dataInput.readUTF(), (int) a(dataInput), (int) a(dataInput));
        defpackage.akdl akdlVar = defpackage.akdl.a;
        return akgvVar.equals(akdlVar) ? akdlVar : akgvVar;
    }

    public /* synthetic */ agxp(defpackage.affu affuVar) {
        this();
    }
}
