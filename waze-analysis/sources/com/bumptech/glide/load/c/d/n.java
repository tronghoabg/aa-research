package com.bumptech.glide.load.c.d;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.a.aw;
import com.bumptech.glide.load.s;
import com.bumptech.glide.load.u;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n implements u {

    /* renamed from: a, reason: collision with root package name */
    private final List f3440a;

    /* renamed from: b, reason: collision with root package name */
    private final u f3441b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.a.a.j f3442c;

    public n(List list, u uVar, com.bumptech.glide.load.a.a.j jVar) {
        this.f3440a = list;
        this.f3441b = uVar;
        this.f3442c = jVar;
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ aw a(Object obj, int i2, int i3, s sVar) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i4 = inputStream.read(bArr);
                if (i4 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i4);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e2) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e2);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f3441b.a(ByteBuffer.wrap(byteArray), i2, i3, sVar);
    }

    @Override // com.bumptech.glide.load.u
    public final /* bridge */ /* synthetic */ boolean b(Object obj, s sVar) {
        return !((Boolean) sVar.b(m.f3439b)).booleanValue() && com.bumptech.glide.load.n.f(this.f3440a, (InputStream) obj, this.f3442c) == ImageHeaderParser$ImageType.GIF;
    }
}
