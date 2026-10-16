package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* loaded from: classes3.dex */
final class adrb extends adrh {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final adiv b = new adiv("cronet-annotation", null);
    static final adiv c = new adiv("cronet-annotations", null);
    static final adiv d = new adiv("cronet-read-buffer-size", 4096);
    public final String e;
    public final String f;
    public final adzv g;
    public final Executor h;
    public final admc i;
    public final adrd j;
    public final Runnable k;
    public BidirectionalStream l;
    public final boolean m;
    public final Object n;
    public final Collection o;
    public final adra p;
    final int q;
    public sm r;
    private final adqz w;

    public adrb(String str, String str2, Executor executor, admc admcVar, adrd adrdVar, Runnable runnable, Object obj, admf admfVar, adzv adzvVar, adiw adiwVar, aeac aeacVar) {
        super(new aebm(1), adzvVar, aeacVar, admcVar, adiwVar);
        this.w = new adqz(this);
        this.e = str;
        this.f = str2;
        this.g = adzvVar;
        this.h = executor;
        this.i = admcVar;
        this.j = adrdVar;
        this.k = runnable;
        this.m = admfVar.a == adme.a;
        this.n = adiwVar.g(b);
        this.o = (Collection) adiwVar.g(c);
        this.p = new adra(this, adzvVar, obj, aeacVar);
        this.q = ((Integer) adiwVar.g(d)).intValue();
        f();
    }

    @Override // defpackage.adsh
    public final adis a() {
        return adis.a;
    }

    @Override // defpackage.adrh
    protected final /* synthetic */ adrg p() {
        return this.w;
    }

    @Override // defpackage.adrh, defpackage.adrk
    protected final /* synthetic */ adrj q() {
        return this.p;
    }

    public final void r(adnq adnqVar) {
        this.j.a(this, adnqVar);
    }

    public final void s(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (this.l == null) {
            return;
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "BidirectionalStream.write");
        }
        this.l.write(byteBuffer, z);
        if (z2) {
            if (Log.isLoggable("grpc-java-cronet", 2)) {
                Log.v("grpc-java-cronet", "BidirectionalStream.flush");
            }
            this.l.flush();
        }
    }

    @Override // defpackage.adrh
    protected final /* synthetic */ adrj t() {
        return this.p;
    }
}
