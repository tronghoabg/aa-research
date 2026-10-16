package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.xf.ClientParametersDataSource;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class pwj implements ackr {
    private final acku a;
    private final /* synthetic */ int b;

    public pwj(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        switch (this.b) {
            case 0:
                return new pwi((ptf) this.a.a());
            case 1:
                return new pwb(((ackv) this.a).a());
            case 2:
                return new pwk((ptf) this.a.a());
            case 3:
                return new rjg(ackq.b(this.a));
            case 4:
                Context context = (Context) this.a.a();
                vaq.d();
                yvg yvgVarAX = roc.aX(context);
                yvgVarAX.getClass();
                return yvgVarAX;
            case 5:
                return new dwn(((uxv) this.a).b(), 2);
            case 6:
                return new ClientParametersDataSource((Optional) ((acks) this.a).b);
            case 7:
                return new gjv(ackq.b(this.a), (char[]) null);
            case 8:
                return new uqo();
            case 9:
                tnn tnnVarC = ((tnq) this.a.a()).c();
                tnnVarC.getClass();
                return tnnVarC;
            case 10:
                usy usyVarH = ((tno) this.a.a()).h();
                usyVarH.getClass();
                return usyVarH;
            case 11:
                tnn tnnVarC2 = ((tnq) this.a.a()).c();
                tnnVarC2.getClass();
                return tnnVarC2;
            case 12:
                twq twqVar = ((txu) ((tnq) this.a.a()).c()).v;
                twqVar.getClass();
                return twqVar;
            case 13:
                ucf ucfVar = ((txu) ((tnq) this.a.a()).c()).g;
                ucfVar.getClass();
                return ucfVar;
            case 14:
                txe txeVar = ((txu) ((tnq) this.a.a()).c()).t;
                txeVar.getClass();
                return txeVar;
            case 15:
                tqv tqvVarK = ((tnr) this.a.a()).k();
                tqvVarK.getClass();
                return tqvVarK;
            case 16:
                xxh xxhVar = (xxh) ((acks) this.a).b;
                return xxhVar.f() ? (utg) xxhVar.b() : new uvn();
            case 17:
                return (lvl) ((xxh) ((acks) this.a).b).d(new lvl());
            case 18:
                xyc xycVarL = wub.L(new uai((Context) this.a.a(), 6));
                xycVarL.getClass();
                return xycVarL;
            case 19:
                acku ackuVar = this.a;
                ackuVar.getClass();
                return new ttw(new uai(ackuVar, 5));
            default:
                ukz ukzVar = new ukz((tsn) this.a.a());
                vaq.d();
                ukzVar.b();
                return ukzVar;
        }
    }
}
