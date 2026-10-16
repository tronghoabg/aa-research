package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class vvy extends vvw implements vqa, vsa {
    public final Context a;
    public final ackk b;
    public final ackk d;
    public final aezk e;
    public final rju h;
    private final vry i;
    private final zgt j;
    public final Object c = new Object();
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public vvy(wci wciVar, Context context, vqe vqeVar, zgt zgtVar, ackk ackkVar, ackk ackkVar2, aezk aezkVar, Executor executor, rju rjuVar) {
        this.h = rjuVar;
        this.i = wciVar.d(executor, ackkVar, aezkVar);
        this.a = context;
        this.j = zgtVar;
        this.b = ackkVar;
        this.d = ackkVar2;
        this.e = aezkVar;
        vqeVar.a(this);
    }

    @Override // defpackage.vvw
    public final void a(vvu vvuVar) {
        String strGroup;
        String str;
        int i;
        if (vvuVar.b <= 0 && vvuVar.c <= 0 && vvuVar.d <= 0 && vvuVar.e <= 0 && (i = vvuVar.v) != 3 && i != 4 && vvuVar.p <= 0) {
            ((ynz) ((ynz) vlj.a.h()).ai((char) 9844)).u("skip logging NetworkEvent due to empty bandwidth/latency data");
            zgp zgpVar = zgl.a;
            return;
        }
        vry vryVar = this.i;
        String str2 = vvuVar.g;
        if (str2 == null || !vvuVar.h) {
            strGroup = vvuVar.f;
        } else {
            strGroup = str2 + "/" + vvuVar.f;
        }
        String str3 = vvuVar.k;
        Pattern pattern = vvv.a;
        int i2 = 1;
        if (woy.am(strGroup)) {
            strGroup = "";
        } else {
            Matcher matcher = vvv.a.matcher(strGroup);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                Matcher matcher2 = vvv.c.matcher(strGroup);
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                } else {
                    Matcher matcher3 = vvv.b.matcher(strGroup);
                    if (matcher3.find() && str3 != null && !str3.startsWith("application/")) {
                        strGroup = matcher3.group(1);
                    }
                }
            }
        }
        int i3 = vvuVar.s;
        if (i3 != 0) {
            switch (i3) {
                case 1:
                    str = "NONE";
                    break;
                case 2:
                    str = "MOBILE";
                    break;
                case 3:
                    str = "WIFI";
                    break;
                case 4:
                    str = "MOBILE_MMS";
                    break;
                case 5:
                    str = "MOBILE_SUPL";
                    break;
                case 6:
                    str = "MOBILE_DUN";
                    break;
                case 7:
                    str = "MOBILE_HIPRI";
                    break;
                case 8:
                    str = "WIMAX";
                    break;
                case 9:
                    str = "BLUETOOTH";
                    break;
                case 10:
                    str = "DUMMY";
                    break;
                case 11:
                    str = "ETHERNET";
                    break;
                case 12:
                    str = "MOBILE_FOTA";
                    break;
                case 13:
                    str = "MOBILE_IMS";
                    break;
                case 14:
                    str = "MOBILE_CBS";
                    break;
                case 15:
                    str = "WIFI_P2P";
                    break;
                case 16:
                    str = "MOBILE_IA";
                    break;
                case 17:
                    str = "MOBILE_EMERGENCY";
                    break;
                case 18:
                    str = "PROXY";
                    break;
                default:
                    str = "VPN";
                    break;
            }
        } else {
            str = null;
        }
        xxd xxdVar = new xxd(":");
        vyk vykVarE = vryVar.e(new xxa(xxdVar, xxdVar, "").e(strGroup, vvuVar.k, str, vvuVar.i));
        if (vykVarE.f()) {
            zgp zgpVar2 = zgl.a;
        } else {
            this.g.incrementAndGet();
            wub.ad(new wgk(this, vvuVar, vykVarE, i2), this.j);
        }
    }

    public final zgp b(ajgu ajguVar) {
        try {
            xxh xxhVar = ((vvt) this.b.a()).c;
        } catch (Exception e) {
            ((ynz) ((ynz) ((ynz) vlj.a.h()).p(e)).ai((char) 9845)).u("Exception while getting network metric extension!");
        }
        vry vryVar = this.i;
        vrt vrtVarA = vru.a();
        vrtVarA.g(ajguVar);
        vrtVarA.b = null;
        return vryVar.a(vrtVarA.a());
    }

    public final zgp c() {
        if (this.g.get() > 0) {
            return wub.aa(new vvx(this, 0), 1L, TimeUnit.SECONDS, this.j);
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                return zgl.a;
            }
            ArrayList arrayList = this.f;
            this.f = new ArrayList(0);
            return wub.ad(new jnx(this, arrayList, 2), this.j);
        }
    }

    @Override // defpackage.vqa
    public final void g(vky vkyVar) {
        c();
    }

    @Override // defpackage.vsa
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.vqa
    public final /* synthetic */ void j(vky vkyVar) {
    }
}
