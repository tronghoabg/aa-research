package defpackage;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class ict implements huo {
    private final List a;
    private final huo b;
    private final hxl c;

    public ict(List list, huo huoVar, hxl hxlVar) {
        this.a = list;
        this.b = huoVar;
        this.c = hxlVar;
    }

    @Override // defpackage.huo
    public final /* bridge */ /* synthetic */ hwx a(Object obj, int i, int i2, hum humVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i3 = inputStream.read(bArr);
                if (i3 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(byteArray), i, i2, humVar);
    }

    @Override // defpackage.huo
    public final /* bridge */ /* synthetic */ boolean b(Object obj, hum humVar) throws IOException {
        return !((Boolean) humVar.b(ics.b)).booleanValue() && hdt.q(this.a, (InputStream) obj, this.c) == ImageHeaderParser.ImageType.GIF;
    }
}
