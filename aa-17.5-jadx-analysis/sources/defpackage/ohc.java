package defpackage;

import android.net.Uri;
import android.telecom.Call;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
public final /* synthetic */ class ohc implements ogx {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ohc(ogz ogzVar, Uri uri, int i) {
        this.c = i;
        this.b = ogzVar;
        this.a = uri;
    }

    @Override // defpackage.ogx
    public final void a(ajmd ajmdVar) {
        if (this.c != 0) {
            ogp ogpVar = (ogp) ajmdVar.a;
            ogc ogcVar = ogpVar.b;
            ogcVar.getClass();
            Call call = (Call) ((ogz) this.b).a;
            CarCall carCallC = ogcVar.c(call);
            carCallC.getClass();
            ((ype) ((ype) ogp.a.f()).ai(5885)).w("onVoipCallIconChanged for call: %s", carCallC.a);
            call.registerCallback(ogpVar.c);
            ogpVar.a(new ogl(carCallC, this.a, 2));
            return;
        }
        Object obj = this.b;
        String string = obj != null ? obj.toString() : null;
        Object obj2 = this.a;
        ogp ogpVar2 = (ogp) ajmdVar.a;
        ogc ogcVar2 = ogpVar2.b;
        ogcVar2.getClass();
        Call call2 = (Call) ((ohe) obj2).a;
        CarCall carCallC2 = ogcVar2.c(call2);
        carCallC2.getClass();
        ((ype) ((ype) ogp.a.f()).ai(5883)).w("onCurrentSpeakerChanged for call: %s", carCallC2.a);
        call2.registerCallback(ogpVar2.c);
        ogpVar2.a(new ogl(carCallC2, string, 0));
    }

    public /* synthetic */ ohc(ohe oheVar, CharSequence charSequence, int i) {
        this.c = i;
        this.a = oheVar;
        this.b = charSequence;
    }
}
