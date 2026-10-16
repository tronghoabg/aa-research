package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwt extends defpackage.vwr implements defpackage.vqw, defpackage.vsw {
    public final android.content.Context a;
    public final defpackage.aclm b;
    public final defpackage.aclm d;
    public final defpackage.afak e;
    public final defpackage.rkq h;
    private final defpackage.vsu i;
    private final defpackage.zhw j;
    public final java.lang.Object c = new java.lang.Object();
    public java.util.ArrayList f = new java.util.ArrayList(0);
    public final java.util.concurrent.atomic.AtomicInteger g = new java.util.concurrent.atomic.AtomicInteger();

    public vwt(defpackage.wde wdeVar, android.content.Context context, defpackage.vra vraVar, defpackage.zhw zhwVar, defpackage.aclm aclmVar, defpackage.aclm aclmVar2, defpackage.afak afakVar, java.util.concurrent.Executor executor, defpackage.rkq rkqVar) {
        this.h = rkqVar;
        this.i = wdeVar.d(executor, aclmVar, afakVar);
        this.a = context;
        this.j = zhwVar;
        this.b = aclmVar;
        this.d = aclmVar2;
        this.e = afakVar;
        vraVar.a(this);
    }

    @Override // defpackage.vwr
    public final void a(defpackage.vwp vwpVar) {
        java.lang.String strGroup;
        java.lang.String str;
        int i;
        if (vwpVar.b <= 0 && vwpVar.c <= 0 && vwpVar.d <= 0 && vwpVar.e <= 0 && (i = vwpVar.v) != 3 && i != 4 && vwpVar.p <= 0) {
            ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9872)).u("skip logging NetworkEvent due to empty bandwidth/latency data");
            defpackage.zhs zhsVar = defpackage.zho.a;
            return;
        }
        defpackage.vsu vsuVar = this.i;
        java.lang.String str2 = vwpVar.g;
        if (str2 == null || !vwpVar.h) {
            strGroup = vwpVar.f;
        } else {
            strGroup = str2 + "/" + vwpVar.f;
        }
        java.lang.String str3 = vwpVar.k;
        java.util.regex.Pattern pattern = defpackage.vwq.a;
        int i2 = 1;
        if (defpackage.ysr.bw(strGroup)) {
            strGroup = "";
        } else {
            java.util.regex.Matcher matcher = defpackage.vwq.a.matcher(strGroup);
            if (matcher.find()) {
                strGroup = matcher.group(1);
            } else {
                java.util.regex.Matcher matcher2 = defpackage.vwq.c.matcher(strGroup);
                if (matcher2.find()) {
                    strGroup = matcher2.group(1);
                } else {
                    java.util.regex.Matcher matcher3 = defpackage.vwq.b.matcher(strGroup);
                    if (matcher3.find() && str3 != null && !str3.startsWith("application/")) {
                        strGroup = matcher3.group(1);
                    }
                }
            }
        }
        int i3 = vwpVar.s;
        if (i3 != 0) {
            switch (i3) {
                case 1:
                    str = "NONE";
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    str = "MOBILE";
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    str = "WIFI";
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    str = "MOBILE_MMS";
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    str = "MOBILE_SUPL";
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "MOBILE_DUN";
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "MOBILE_HIPRI";
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
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
        defpackage.xyj xyjVar = new defpackage.xyj(":");
        defpackage.vzf vzfVarE = vsuVar.e(new defpackage.xyg(xyjVar, xyjVar, "").e(strGroup, vwpVar.k, str, vwpVar.i));
        if (vzfVarE.f()) {
            defpackage.zhs zhsVar2 = defpackage.zho.a;
        } else {
            this.g.incrementAndGet();
            defpackage.ysr.cu(new defpackage.whj(this, vwpVar, vzfVarE, i2), this.j);
        }
    }

    public final defpackage.zhs b(ajht ajhtVar) {
        try {
            defpackage.xyn xynVar = ((defpackage.vwo) this.b.a()).c;
        } catch (java.lang.Exception e) {
            ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) vmf.a.h()).p(e)).ai((char) 9873)).u("Exception while getting network metric extension!");
        }
        defpackage.vsu vsuVar = this.i;
        defpackage.vsp vspVarA = defpackage.vsq.a();
        vspVarA.g(ajhtVar);
        vspVarA.b = null;
        return vsuVar.a(vspVarA.a());
    }

    public final defpackage.zhs c() {
        int i = 0;
        if (this.g.get() > 0) {
            return defpackage.ysr.cr(new defpackage.vws(this, i), 1L, java.util.concurrent.TimeUnit.SECONDS, this.j);
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                return defpackage.zho.a;
            }
            java.util.ArrayList arrayList = this.f;
            this.f = new java.util.ArrayList(0);
            return defpackage.ysr.cu(new jof(this, arrayList, 2), this.j);
        }
    }

    @Override // defpackage.vqw
    public final void g(defpackage.vlu vluVar) {
        c();
    }

    @Override // defpackage.vsw
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.vqw
    public final /* synthetic */ void j(defpackage.vlu vluVar) {
    }
}
