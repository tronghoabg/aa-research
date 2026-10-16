package androidx.media3.extractor.mp4;

import androidx.media3.extractor.TrackOutput;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class TrackEncryptionBox {
    private static final String TAG = "TrackEncryptionBox";
    public final TrackOutput.CryptoData cryptoData;
    public final byte[] defaultInitializationVector;
    public final boolean isEncrypted;
    public final int perSampleIvSize;
    public final String schemeType;

    public TrackEncryptionBox(boolean z, String str, int i2, byte[] bArr, int i3, int i4, byte[] bArr2) {
        an.l((bArr2 == null) ^ (i2 == 0));
        this.isEncrypted = z;
        this.schemeType = str;
        this.perSampleIvSize = i2;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i3, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r3.equals(androidx.media3.common.C.CENC_TYPE_cenc) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r3.equals(androidx.media3.common.C.CENC_TYPE_cens) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int schemeToCryptoMode(java.lang.String r3) {
        /*
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.hashCode()
            switch(r1) {
                case 3046605: goto L27;
                case 3046671: goto L1e;
                case 3049879: goto L15;
                case 3049895: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L31
        Lc:
            java.lang.String r1 = "cens"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L31
            goto L1d
        L15:
            java.lang.String r1 = "cenc"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L31
        L1d:
            return r0
        L1e:
            java.lang.String r1 = "cbcs"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L31
            goto L2f
        L27:
            java.lang.String r1 = "cbc1"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L31
        L2f:
            r3 = 2
            return r3
        L31:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported protection scheme type '"
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "'. Assuming AES-CTR crypto mode."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "TrackEncryptionBox"
            androidx.media3.common.util.Log.w(r1, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.TrackEncryptionBox.schemeToCryptoMode(java.lang.String):int");
    }
}
