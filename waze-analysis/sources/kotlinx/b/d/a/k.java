package kotlinx.b.d.a;

import androidx.media3.muxer.MuxerUtil;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends i {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f51165b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v vVar, boolean z) {
        super(vVar);
        h.g.b.x.f(vVar, "writer");
        this.f51165b = z;
    }

    @Override // kotlinx.b.d.a.i
    public final void d(byte b2) throws IOException {
        boolean z = this.f51165b;
        String strB = h.q.b(b2);
        if (z) {
            j(strB);
        } else {
            h(strB);
        }
    }

    @Override // kotlinx.b.d.a.i
    public final void f(int i2) throws IOException {
        boolean z = this.f51165b;
        String string = Long.toString(i2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE, 10);
        if (z) {
            j(string);
        } else {
            h(string);
        }
    }

    @Override // kotlinx.b.d.a.i
    public final void g(long j2) throws IOException {
        if (this.f51165b) {
            j(kotlinx.coroutines.a.ab.h(j2));
        } else {
            h(kotlinx.coroutines.a.ab.h(j2));
        }
    }

    @Override // kotlinx.b.d.a.i
    public final void i(short s) throws IOException {
        boolean z = this.f51165b;
        String strA = h.y.a(s);
        if (z) {
            j(strA);
        } else {
            h(strA);
        }
    }
}
