package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class ibj implements ibl {
    private final ByteBuffer a;
    private final List b;
    private final boolean c;
    private final hxl d;

    public ibj(ByteBuffer byteBuffer, List list, hxl hxlVar, boolean z) {
        this.a = byteBuffer;
        this.b = list;
        this.d = hxlVar;
        this.c = z;
    }

    @Override // defpackage.ibl
    public final int a() throws IOException {
        ByteBuffer byteBufferB = ifl.b(this.a);
        if (byteBufferB == null) {
            return -1;
        }
        return hdt.l(this.b, new hud(byteBufferB, this.d, 1));
    }

    @Override // defpackage.ibl
    public final Bitmap b(BitmapFactory.Options options) {
        boolean z = this.c;
        ByteBuffer byteBuffer = this.a;
        if (!z) {
            return fxp.g(new ifk(ifl.b(byteBuffer)), options, this);
        }
        ifl.b(byteBuffer);
        if (byteBuffer.hasArray() && !byteBuffer.isReadOnly()) {
            return fxp.f(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), options, this);
        }
        byte[] bArrD = ifl.d(byteBuffer);
        return fxp.f(bArrD, 0, bArrD.length, options, this);
    }

    @Override // defpackage.ibl
    public final ImageHeaderParser.ImageType c() throws IOException {
        return hdt.m(this.b, ifl.b(this.a));
    }

    @Override // defpackage.ibl
    public final boolean e() throws IOException {
        ByteBuffer byteBufferB = ifl.b(this.a);
        if (byteBufferB == null) {
            return false;
        }
        return hdt.o(this.b, new hue(byteBufferB, this.d, 1));
    }

    @Override // defpackage.ibl
    public final void d() {
    }
}
