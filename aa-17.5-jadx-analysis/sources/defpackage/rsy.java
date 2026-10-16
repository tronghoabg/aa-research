package defpackage;

import android.content.Context;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class rsy {
    public final xwx a;
    public final xwx b;
    public final xwx c;
    public xyc d;
    public rtu e;
    public rld f;
    public Context g;
    public xyc h;
    public rto i;
    public int j;
    public final mmc k;
    public wyd l;

    public rsy(final InputStream inputStream, final OutputStream outputStream) {
        int i = rvk.a;
        this.j = 1;
        this.h = null;
        this.k = new mmc(null);
        this.a = new xwx() { // from class: rsx
            @Override // defpackage.xwx
            public final Object a(Object obj) {
                rtl rtpVar;
                rsy rsyVar = this.a;
                rta rtaVar = (rta) obj;
                Context context = rsyVar.g;
                int i2 = rsyVar.j;
                rto rtoVar = rsyVar.i;
                ypf ypfVar = rta.a;
                if (i2 == 2) {
                    rtpVar = new rvv();
                } else {
                    ypf ypfVar2 = rtt.a;
                    rtpVar = new rtp();
                }
                OutputStream outputStream2 = outputStream;
                InputStream inputStream2 = inputStream;
                rtpVar.f = new wyd(rtaVar, null);
                rtpVar.e = new wyd(rtaVar, null);
                rtpVar.a = inputStream2;
                rtpVar.b = outputStream2;
                rtpVar.c = rtoVar;
                rtpVar.d = context;
                return rtpVar.a();
            }
        };
        this.b = new kpi(3);
        this.c = new kpi(4);
    }
}
