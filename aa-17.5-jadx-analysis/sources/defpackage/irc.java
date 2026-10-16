package defpackage;

import com.google.android.gms.car.CarInfo;
import j$.util.stream.Stream;

/* loaded from: classes.dex */
final class irc {
    public final jew a;
    public final boolean b;
    public final boolean c;
    public final tmb d;
    public final long e;
    public final boolean f;

    public irc(CarInfo carInfo, int i, jew jewVar, boolean z) {
        tme tmeVar = new tme();
        this.a = jewVar;
        boolean z2 = i == 3;
        this.b = z2;
        this.c = z;
        this.d = tmeVar;
        Stream streamD = tgx.d(new ilq(5), z2 ? acmj.a.gu().k() : acmj.a.gu().m());
        int i2 = yfq.d;
        long jA = kjf.a((yfq) streamD.collect(ycm.a), carInfo, -1L);
        this.e = jA;
        this.f = jA != -1;
    }
}
