package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final /* synthetic */ class kku implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kku(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v16, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v37, types: [java.lang.Object, kqv] */
    /* JADX WARN: Type inference failed for: r8v47, types: [java.lang.Object, kqv] */
    /* JADX WARN: Type inference failed for: r8v49, types: [java.lang.Object, kqv] */
    @Override // defpackage.afdr
    public final Object invoke() {
        switch (this.c) {
            case 0:
                Object obj = this.a;
                int i = kkz.a;
                ((urg) this.b).c(new cct(-289332401, true, new kkw(obj, 8)));
                break;
            case 1:
                Object obj2 = this.a;
                int i2 = kkz.a;
                ((urg) this.b).c(new cct(1486742673, true, new jjb(obj2, 10)));
                break;
            case 2:
                Object obj3 = this.a;
                int i3 = kkz.a;
                ((urg) this.b).c(new cct(-1124913413, true, new kkw(obj3, 7)));
                break;
            case 3:
                Object obj4 = this.b;
                int i4 = kkz.a;
                ((urg) this.a).c(new cct(2056060281, true, new jjb(obj4, 19)));
                break;
            case 4:
                ((kmf) this.b).m((cic) this.a);
                break;
            case 5:
                this.b.j(this.a);
                break;
            case 6:
                this.a.b(this.b);
                break;
            case 7:
                ((lkp) this.a).a((String) this.b);
                break;
            case 8:
                ((lkp) this.a).a((String) this.b);
                break;
            case 9:
                ((llc) this.a).d((llu) this.b);
                break;
            case 10:
                ohs ohsVarJ = ebf.j();
                rrb rrbVarH = rrc.h(yxy.GEARHEAD, yzz.MEDIA_FACET, yzy.gK);
                rrbVarH.p(((llc) this.a).d.a);
                ohsVarJ.F(rrbVarH.l());
                this.b.invoke();
                break;
            case 11:
                Object obj5 = this.a;
                obj5.getClass();
                ((okv) this.b).d((AaPlaybackState.AaCustomAction) obj5);
                break;
            case 12:
                ((okv) this.b).d((AaPlaybackState.AaCustomAction) this.a);
                break;
            case 13:
                kqw kqwVar = ((lxv) this.b).c;
                kqwVar.d();
                kqwVar.c(this.a);
                break;
            case 14:
                kqz kqzVar = (kqz) this.b;
                Long l = kqzVar.c;
                odp odpVarA = mcd.A();
                l.getClass();
                String str = kqzVar.d;
                long jLongValue = l.longValue();
                yzz yzzVar = yzz.PHONE_BROWSE_CONTACTS;
                str.getClass();
                odpVarA.o((Context) this.a, jLongValue, yzzVar, str);
                break;
            case 15:
                lvl.C(oct.f((qn) this.a, null));
                break;
            case 16:
                ((mej) this.b).d.invoke(this.a, yzz.PHONE_BROWSE_CONTACTS);
                break;
            case 17:
                kqw kqwVar2 = ((mej) this.b).c;
                kqwVar2.d();
                kqwVar2.c(this.a);
                break;
            case 18:
                kqw kqwVar3 = ((mer) this.b).d;
                kqwVar3.d();
                kqwVar3.c(this.a);
                break;
            case 19:
                kif kifVar = ((mfa) this.b).d;
                if (kifVar.d) {
                    kifVar.d = false;
                    for (ajmd ajmdVar : kifVar.c) {
                        ((ynz) mfa.b.e().ai(4823)).u("Stopping recents manager");
                    }
                    kifVar.b.b(R.id.call_history_manager_loader_id);
                }
                kifVar.c.remove(this.a);
                break;
            default:
                ?? r0 = this.a;
                Object obj6 = (mss) woy.bH(roc.ag(r0));
                if (obj6 == null) {
                    Boolean bool = (Boolean) ((mtz) this.b).a.e();
                    obj6 = (bool == null || !bool.booleanValue()) ? msr.a : msl.a;
                }
                Object obj7 = (mss) woy.bI(roc.ag(r0), 1);
                if (obj7 == null) {
                    obj7 = msl.a;
                }
                break;
        }
        return afak.a;
    }

    public /* synthetic */ kku(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
