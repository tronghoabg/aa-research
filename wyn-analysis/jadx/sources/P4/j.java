package P4;

import E4.B;
import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import ka.AbstractC3230e0;

/* loaded from: classes.dex */
public final class j implements B4.i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9142a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9143b;

    /* renamed from: c, reason: collision with root package name */
    public final F4.f f9144c;

    public j(ArrayList arrayList, a aVar, F4.f fVar) {
        this.f9142a = arrayList;
        this.f9143b = aVar;
        this.f9144c = fVar;
    }

    @Override // B4.i
    public final B a(Object obj, int i5, int i10, B4.g gVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e7);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f9143b.a(ByteBuffer.wrap(byteArray), i5, i10, gVar);
    }

    @Override // B4.i
    public final boolean b(Object obj, B4.g gVar) {
        InputStream inputStream = (InputStream) obj;
        if (((Boolean) gVar.c(i.f9141b)).booleanValue()) {
            return false;
        }
        return AbstractC3230e0.t(this.f9144c, inputStream, this.f9142a) == ImageHeaderParser$ImageType.GIF;
    }
}
