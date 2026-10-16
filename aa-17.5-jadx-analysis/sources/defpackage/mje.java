package defpackage;

import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;

/* loaded from: classes2.dex */
public final class mje extends kfn {
    final /* synthetic */ RadioMediaBrowserService a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mje(RadioMediaBrowserService radioMediaBrowserService) {
        super(null);
        this.a = radioMediaBrowserService;
    }

    @Override // defpackage.kfn
    public final void a(qrn qrnVar) {
        RadioMediaBrowserService radioMediaBrowserService = this.a;
        if (radioMediaBrowserService.h == null) {
            ((ype) ((ype) RadioMediaBrowserService.g.e()).ai((char) 4992)).u("Stopped before connected");
        } else {
            kgq.d(new mjc(radioMediaBrowserService, qrnVar, 2, null), "GH.Radio", yzz.RADIO_APP, yzy.LT, "Could not create a connection to CarRadioManager", new Object[0]);
        }
    }

    @Override // defpackage.kfn
    public final void b() {
        yph yphVar = RadioMediaBrowserService.g;
        this.a.l();
    }
}
