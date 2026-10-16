package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class uxi {
    private static final byte[] a = {0};

    public static byte[] a(byte[] bArr, int i) throws IOException {
        Deflater deflater = new Deflater();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr, 0, i);
            deflaterOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } finally {
            deflater.end();
        }
    }

    public static byte[] b(byte[] bArr, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, i);
        try {
            try {
                byte[] bArr2 = new byte[i2];
                inflater.inflate(bArr2);
                return bArr2;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        } finally {
            inflater.end();
        }
    }

    public static void c(byte[] bArr, int i, uxe uxeVar) throws DataFormatException {
        Inflater inflater = new Inflater(true);
        try {
            inflater.setInput(bArr, 0, i);
            uxeVar.d(i * 4);
            int iInflate = inflater.inflate(uxeVar.e(), 0, uxeVar.a());
            boolean z = false;
            while (!inflater.finished()) {
                int iA = uxeVar.a();
                uxeVar.d(iA + iA);
                int iInflate2 = inflater.inflate(uxeVar.e(), iInflate, uxeVar.a() - iInflate);
                if (iInflate2 == 0) {
                    if (!inflater.needsInput() || z) {
                        break;
                    }
                    inflater.setInput(a);
                    z = true;
                    iInflate2 = 0;
                }
                iInflate += iInflate2;
            }
            uxeVar.d(iInflate);
        } finally {
            inflater.end();
        }
    }
}
