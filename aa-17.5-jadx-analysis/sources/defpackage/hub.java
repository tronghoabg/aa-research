package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class hub implements huh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hub(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.huh
    public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
        int i = this.b;
        Object obj = this.a;
        if (i != 0) {
            try {
                return imageHeaderParser.a((InputStream) obj);
            } finally {
                ((InputStream) this.a).reset();
            }
        }
        try {
            return imageHeaderParser.b((ByteBuffer) obj);
        } finally {
            ifl.b((ByteBuffer) this.a);
        }
    }
}
