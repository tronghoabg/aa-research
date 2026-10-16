package defpackage;

import android.net.wifi.WifiInfo;
import android.os.Bundle;

/* loaded from: classes2.dex */
public final class knd implements pah {
    final /* synthetic */ ogz a;

    public knd(ogz ogzVar) {
        this.a = ogzVar;
    }

    @Override // defpackage.pah
    public final void c(pag pagVar, Bundle bundle) {
        yxk yxkVar = (yxk) knc.b.getOrDefault(pagVar, yxk.UNKNOWN_REASON);
        Object obj = this.a.b;
        knc kncVar = (knc) obj;
        if (!kncVar.f) {
            kncVar.c.post(new jlh(obj, pagVar, 18, (byte[]) null));
        } else {
            ((ype) knc.a.l().ai((char) 3247)).M("Cannot process setup event: %s (%s), SetupDataSource has been already been torn down.", pagVar.name(), yxkVar.name());
        }
    }

    @Override // defpackage.pah
    public final void b() {
    }

    @Override // defpackage.pah
    public final void a(String str, int i, WifiInfo wifiInfo, int i2, int i3) {
    }
}
