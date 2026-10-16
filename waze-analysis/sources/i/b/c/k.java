package i.b.c;

import com.google.v.dm;
import com.google.v.fj;
import i.b.s;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class k extends dm<l, k> implements fj {
    /* synthetic */ k(byte[] bArr) {
        super(l.DEFAULT_INSTANCE);
    }

    public final void a(s sVar) {
        copyOnWrite();
        ((l) this.instance).setCurrentLocation(sVar);
    }

    public final void b(s sVar) {
        copyOnWrite();
        ((l) this.instance).setDestination(sVar);
    }

    public final void c(String str) {
        copyOnWrite();
        ((l) this.instance).setDestinationVenueId(str);
    }

    public final void d(long j2) {
        copyOnWrite();
        ((l) this.instance).setParkingTimeMillis(j2);
    }

    private k() {
        throw null;
    }
}
