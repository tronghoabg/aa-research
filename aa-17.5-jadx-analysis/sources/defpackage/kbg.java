package defpackage;

import android.os.RemoteException;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class kbg implements afdr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ kbg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v15, types: [aezr, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() throws qrz {
        switch (this.b) {
            case 0:
                return new gvm((geu) this.a);
            case 1:
                return new hmw((geu) this.a);
            case 2:
                return new hgu((geu) this.a);
            case 3:
                return new fuv((geu) this.a);
            case 4:
                return new gzf((geu) this.a);
            case 5:
                return new gsj((geu) this.a);
            case 6:
                return new jut((geu) this.a);
            case 7:
                return (jut) this.a.a();
            case 8:
                return new heo((geu) this.a);
            case 9:
                return new gsa((geu) this.a);
            case 10:
                return new jxq((geu) this.a);
            case 11:
                return new goq((geu) this.a);
            case 12:
                return new gog((geu) this.a);
            case 13:
                return new gok((geu) this.a);
            case 14:
                return new gsx((geu) this.a);
            case 15:
                eqj eqjVar = ((kgs) this.a).c;
                eqjVar.getClass();
                return khx.f().c(eqjVar, tby.v(eqjVar, new jxa(14)));
            case 16:
                eqj eqjVar2 = ((kgs) this.a).c;
                eqjVar2.getClass();
                return khx.f().a(tby.v(eqjVar2, new jxa(12)));
            case 17:
                kjm kjmVar = (kjm) this.a;
                final ajmd ajmdVar = kjmVar.i;
                final int i = kjmVar.h;
                kjmVar.a.d.F(new red() { // from class: rid
                    @Override // defpackage.red
                    public final void a(Object obj) {
                        ((rio) obj).c(i, ajmdVar);
                    }
                });
                return afak.a;
            case 18:
                kjm kjmVar2 = (kjm) this.a;
                final ajmd ajmdVar2 = kjmVar2.i;
                final int i2 = kjmVar2.h;
                final rij rijVar = kjmVar2.a;
                rijVar.a.g(new rze() { // from class: rii
                    @Override // defpackage.rze
                    public final void a() throws RemoteException {
                        final rij rijVar2 = rijVar;
                        final int i3 = i2;
                        final ajmd ajmdVar3 = ajmdVar2;
                        rijVar2.d.E(new ref() { // from class: rig
                            @Override // defpackage.ref
                            public final void a(Object obj) throws RemoteException {
                                rio rioVar = (rio) obj;
                                int i4 = i3;
                                rioVar.b(i4, ajmdVar3);
                                rijVar2.b.t(i4, rioVar);
                            }
                        });
                    }
                });
                return afak.a;
            case 19:
                kjo kjoVar = kjq.a;
                mki.a.g();
                return ols.l((qrn) this.a);
            default:
                rij rijVar2 = ((kjq) this.a).d;
                if (rijVar2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                return (List) rijVar2.a.b(new rdw(rijVar2, 3));
        }
    }
}
