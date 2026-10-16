package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import org.chromium.net.CronetEngine;

/* loaded from: classes.dex */
public final /* synthetic */ class vvx implements zfj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vvx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, zgp] */
    /* JADX WARN: Type inference failed for: r6v26, types: [aezk, java.lang.Object] */
    @Override // defpackage.zfj
    public final zgp a() {
        int i = this.b;
        if (i == 0) {
            return ((vvy) this.a).c();
        }
        if (i != 1) {
            if (i == 2) {
                Object obj = this.a;
                zfk zfkVarB = xur.b(new kew(obj, 14));
                wgt wgtVar = (wgt) obj;
                return wub.Z(zfb.g(wgtVar.a, zfkVarB, wgtVar.b));
            }
            if (i != 3) {
                if (i == 4) {
                    return this.a;
                }
                int i2 = zhw.a;
                return wub.Y((CronetEngine) ((ul) this.a).d.a());
            }
            Object obj2 = this.a;
            wgt wgtVar2 = (wgt) obj2;
            try {
                return wub.Y(((wgt) obj2).b((Uri) wub.af(wgtVar2.a)));
            } catch (IOException e) {
                wgs wgsVar = new wgs(wgtVar2);
                xxh xxhVar = wgtVar2.c;
                return !xxhVar.f() ? new zhc(e) : ((e instanceof wfd) || (e.getCause() instanceof wfd)) ? new zhc(e) : zfb.g(((kwp) xxhVar.b()).f(e, wgsVar), xur.b(new kew(obj2, 13)), wgtVar2.b);
            }
        }
        vsq vsqVar = (vsq) this.a;
        xxh xxhVar2 = (xxh) vsqVar.c.gu();
        boolean zF = xxhVar2.f();
        Object objGu = vsqVar.d.gu();
        if (zF) {
            xxh xxhVar3 = (xxh) objGu;
            if (xxhVar3.f()) {
                vsp vspVar = new vsp((File) xxhVar2.b(), (String) xxhVar3.b());
                int iA = vspVar.a();
                vspVar.b().delete();
                vspVar.b = 0;
                vspVar.c = true;
                if (iA < ((vsr) vsqVar.a.a()).c) {
                    return zgl.a;
                }
                Object obj3 = vsqVar.f;
                vrt vrtVarA = vru.a();
                abnp abnpVarN = ajgu.a.n();
                abnp abnpVarN2 = ajgr.a.n();
                abnpVarN2.t();
                ajgr ajgrVar = (ajgr) abnpVarN2.b;
                ajgrVar.c = 6;
                ajgrVar.b = 1 | ajgrVar.b;
                abnpVarN.t();
                ajgu ajguVar = (ajgu) abnpVarN.b;
                ajgr ajgrVar2 = (ajgr) abnpVarN2.q();
                ajgrVar2.getClass();
                ajguVar.A = ajgrVar2;
                ajguVar.b |= 8388608;
                vrtVarA.g((ajgu) abnpVarN.q());
                return ((vry) obj3).a(vrtVarA.a());
            }
        }
        return zgl.a;
    }
}
