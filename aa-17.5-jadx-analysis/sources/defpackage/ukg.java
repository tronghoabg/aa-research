package defpackage;

import android.util.SparseIntArray;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ukg {
    public uje a;
    public int b = 0;
    public final boolean c;
    private final List d;
    private ByteBuffer e;

    public ukg(boolean z) {
        ujf ujfVar = ujf.c;
        this.a = new uje();
        this.d = new ArrayList();
        this.e = null;
        this.c = z;
    }

    public final ukf a(long j, SparseIntArray sparseIntArray) {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            return new ukf(j, null, null, sparseIntArray, this.c);
        }
        List list = this.d;
        return new ukf(j, (ujf[]) list.toArray(new ujf[0]), byteBuffer.array(), sparseIntArray, this.c);
    }

    public final void b(int i) {
        uje ujeVar = this.a;
        ujeVar.v = this.b;
        this.d.add(new ujf(ujeVar));
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.put((byte) i);
        }
    }

    public final void c(int i) {
        ujf ujfVar = ujf.c;
        this.a = new uje();
        this.d.clear();
        this.e = ByteBuffer.allocate(i);
        this.b = 0;
    }
}
