package e.a.d;

import j$.util.Objects;
import java.io.OutputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gk extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gm f47030a;

    /* synthetic */ gk(gm gmVar) {
        Objects.requireNonNull(gmVar);
        this.f47030a = gmVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        write(new byte[]{(byte) i2}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        this.f47030a.l(bArr, i2, i3);
    }
}
