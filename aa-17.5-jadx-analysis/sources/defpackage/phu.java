package defpackage;

/* loaded from: classes2.dex */
public final class phu implements pae {
    public static final yph a = yph.c("GH.WPP.TRANSPORT");
    public static final yph b = yph.c("Wifi.GalMonitor");
    public final phz c;
    public final paa d;

    public phu(phz phzVar, paa paaVar) {
        this.c = phzVar;
        this.d = paaVar;
    }

    public static String a(int i) {
        xpr xprVarB = xpr.b(i);
        return xprVarB != null ? xprVarB.name() : String.valueOf(i);
    }

    public static boolean b(int i) {
        return ygr.p(8, 9).contains(Integer.valueOf(i));
    }

    public final void c(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            this.d.b();
        } else {
            if (i2 != 2) {
                return;
            }
            this.d.c();
        }
    }

    public final boolean d(par parVar, int i) {
        if (parVar == par.WPP_READ_WRITE_MESSAGE_RAND) {
            koo.m().h(par.WPP_READ_WRITE_MESSAGE_RAND_DELAY);
        }
        return ((Boolean) koo.m().b(parVar, new koe(this, i, 2))).booleanValue();
    }

    public final String toString() {
        return "WifiProjectionProtocolTransportImpl";
    }
}
