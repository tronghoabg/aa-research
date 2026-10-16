package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;

/* loaded from: classes3.dex */
final class adra extends aduh {
    public static final /* synthetic */ int i = 0;
    public final Object a;
    public final Collection b;
    public boolean c;
    public boolean d;
    public adnq e;
    public boolean f;
    public boolean g;
    final /* synthetic */ adrb h;
    private int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adra(adrb adrbVar, adzv adzvVar, Object obj, aeac aeacVar) {
        super(4194304, adzvVar, aeacVar);
        this.h = adrbVar;
        this.b = new ArrayList();
        this.d = false;
        this.a = obj;
    }

    @Override // defpackage.adwj
    public final void a(int i2) {
        adrb adrbVar = this.h;
        adrbVar.l.getClass();
        int i3 = this.u - i2;
        this.u = i3;
        if (i3 != 0 || this.f) {
            return;
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        adrbVar.l.read(ByteBuffer.allocateDirect(adrbVar.q));
    }

    @Override // defpackage.adwj
    public final void b(Throwable th) {
        c(adnq.c(th), true, new admc());
    }

    @Override // defpackage.aduh
    protected final void c(adnq adnqVar, boolean z, admc admcVar) {
        BidirectionalStream bidirectionalStream = this.h.l;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        l(adnqVar, z, admcVar);
    }

    @Override // defpackage.adrj
    protected final void d() {
        super.d();
    }

    @Override // defpackage.adrm
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    public final void f(ByteBuffer byteBuffer) {
        this.u += byteBuffer.remaining();
        adxi adxiVar = adxm.a;
        super.n(new adxl(byteBuffer), false);
    }
}
