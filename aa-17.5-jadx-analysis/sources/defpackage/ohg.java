package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import android.telecom.Call;
import com.google.android.apps.auto.components.telecom.call.CarCall;

/* loaded from: classes2.dex */
public final /* synthetic */ class ohg extends afeo implements afeg {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(Object obj, int i) {
        super(2, obj, ohe.class, "onParticipantCountChanged", "onParticipantCountChanged(I)V", 4);
        this.a = i;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.a;
        if (i == 0) {
            final int iIntValue = ((Number) obj).intValue();
            final ohe oheVar = (ohe) this.receiver;
            ((ype) ohh.b.f()).w("onParticipantCountChanged: %d", iIntValue);
            ((ajmd) oheVar.b).m(new ogx() { // from class: ohd
                @Override // defpackage.ogx
                public final void a(ajmd ajmdVar) {
                    ogp ogpVar = (ogp) ajmdVar.a;
                    ogc ogcVar = ogpVar.b;
                    ogcVar.getClass();
                    Call call = (Call) oheVar.a;
                    final CarCall carCallC = ogcVar.c(call);
                    carCallC.getClass();
                    ((ype) ((ype) ogp.a.f()).ai(5884)).w("onParticipantCountChanged for call: %s", carCallC.a);
                    call.registerCallback(ogpVar.c);
                    final int i2 = iIntValue;
                    ogpVar.a(new ogo() { // from class: ogn
                        @Override // defpackage.ogo
                        public final void a(ogs ogsVar) throws RemoteException {
                            ogsVar.o(carCallC, i2);
                        }
                    });
                }
            });
            return afak.a;
        }
        if (i == 1) {
            ohe oheVar2 = (ohe) this.receiver;
            ((ype) ohh.b.f()).u("onActiveParticipantChanged");
            ((ajmd) oheVar2.b).m(new ohc(oheVar2, (CharSequence) obj, 0));
            return afak.a;
        }
        if (i != 2) {
            ((ohb) this.receiver).a(((Boolean) obj).booleanValue());
            return afak.a;
        }
        Uri uri = (Uri) obj;
        ogz ogzVar = (ogz) this.receiver;
        uri.getClass();
        yph yphVar = ohh.b;
        ((ype) yphVar.f()).u("onVoipCallIconChanged");
        String string = uri.toString();
        string.getClass();
        if (string.length() <= 0) {
            uri = null;
        }
        if (uri == null) {
            ((ype) yphVar.f()).u("Voip call icon empty.");
        }
        ((ajmd) ogzVar.b).m(new ohc(ogzVar, uri, 1));
        return afak.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(Object obj, int i, byte[] bArr) {
        super(2, obj, ohe.class, "onActiveParticipantChanged", "onActiveParticipantChanged(Ljava/lang/CharSequence;)V", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(Object obj, int i, char[] cArr) {
        super(2, obj, ogz.class, "onVoipCallIconChanged", "onVoipCallIconChanged(Landroid/net/Uri;)V", 4);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohg(Object obj, int i, short[] sArr) {
        super(2, obj, ohb.class, "onVoipCallSilenceStateChanged", "onVoipCallSilenceStateChanged(Z)V", 4);
        this.a = i;
    }
}
