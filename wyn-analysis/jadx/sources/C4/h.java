package C4;

import L4.y;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class h implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1790a;

    public /* synthetic */ h(int i5) {
        this.f1790a = i5;
    }

    @Override // C4.f
    public final g a(Object obj) {
        switch (this.f1790a) {
            case 0:
                return new i(obj, 1);
            case 1:
                return new i((ParcelFileDescriptor) obj);
            default:
                return new y((ByteBuffer) obj);
        }
    }

    @Override // C4.f
    public final Class b() {
        switch (this.f1790a) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }
}
