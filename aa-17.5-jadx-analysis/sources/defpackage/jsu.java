package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;
import android.util.Log;
import androidx.car.app.messaging.model.ConversationItem;

/* loaded from: classes2.dex */
public final /* synthetic */ class jsu implements us {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jsu(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jtf] */
    @Override // defpackage.us
    public final void onClick() {
        lkc lkcVarB;
        switch (this.c) {
            case 0:
                kex kexVar = (kex) this.a;
                kexVar.a.b();
                Object obj = this.b;
                obj.getClass();
                jst jstVar = (jst) kexVar.c;
                jstVar.c = (jtb) obj;
                jstVar.b = gml.c;
                jstVar.a();
                break;
            case 1:
                Log.i("GH.AJTelemetry", "onCharacterSelect");
                Object obj2 = this.b;
                obj2.getClass();
                fux fuxVar = (fux) ((ieb) this.a).b;
                fuxVar.b = (fvd) obj2;
                fuxVar.a = gml.c;
                fuxVar.a();
                break;
            case 2:
                PhoneAccountHandle accountHandle = ((PhoneAccount) this.a).getAccountHandle();
                yph yphVar = juk.a;
                ((ype) ((ype) yphVar.f()).ai((char) 2770)).u("Phone account selected");
                juk jukVar = (juk) this.b;
                ofe ofeVar = jukVar.e;
                if (ofeVar != null) {
                    off.a();
                    ofeVar.c = true;
                    ebf.A().s(ofeVar.a, accountHandle);
                    ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.PHONE_FACET, yzy.aA).l());
                    jukVar.a();
                    break;
                } else {
                    ((ype) ((ype) yphVar.g()).ai((char) 2771)).u("Phone account selected with no disambiguation call");
                    break;
                }
            case 3:
                jxn.b().b(((jxu) this.b).a, (ConversationItem) this.a);
                break;
            case 4:
                jxn.b().a(((jxu) this.b).a, (ConversationItem) this.a);
                break;
            case 5:
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gN);
                llg llgVar = (llg) this.a;
                rrbVarH.p(llgVar.c.a);
                ohsVarJ.F(rrbVarH.l());
                llgVar.d.invoke(((lsb) this.b).a);
                break;
            case 6:
                Object obj3 = this.b;
                obj3.getClass();
                llg llgVar2 = (llg) this.a;
                lth lthVar = llgVar2.g;
                if (lthVar == null) {
                    lod lodVar = (lod) llgVar2.h.e();
                    lkcVarB = lodVar != null ? lodVar.i.d(yzz.MEDIA_FACET) : null;
                } else {
                    lkcVarB = lthVar.b();
                }
                if (lkcVarB != null) {
                    lkcVarB.d((String) obj3, new Bundle());
                    break;
                }
                break;
            case 7:
                lxs.d((String) this.b, (ComponentName) this.a);
                break;
            default:
                kqz kqzVar = (kqz) this.b;
                Long l = kqzVar.c;
                int i = lxx.a;
                odp odpVarA = mcd.A();
                l.getClass();
                String str = kqzVar.d;
                long jLongValue = l.longValue();
                yzz yzzVar = yzz.MESSAGING_APP;
                str.getClass();
                odpVarA.o((Context) this.a, jLongValue, yzzVar, str);
                break;
        }
    }

    public /* synthetic */ jsu(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
