package defpackage;

import android.content.Context;
import android.text.SpannedString;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.MessageTemplate;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class lkt implements tho {
    private final /* synthetic */ int a;

    public lkt(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.wb b(defpackage.omw r14, java.lang.Boolean r15, java.lang.Boolean r16, defpackage.lsb r17, java.lang.CharSequence r18, java.lang.CharSequence r19, java.util.Map r20, androidx.core.graphics.drawable.IconCompat r21, android.text.SpannedString r22, defpackage.llg r23) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lkt.b(omw, java.lang.Boolean, java.lang.Boolean, lsb, java.lang.CharSequence, java.lang.CharSequence, java.util.Map, androidx.core.graphics.drawable.IconCompat, android.text.SpannedString, llg):wb");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.tho
    public final /* synthetic */ eqj a(qw qwVar, Object obj) {
        int i = 4;
        switch (this.a) {
            case 0:
                lks lksVar = (lks) obj;
                lksVar.getClass();
                um umVar = new um(lksVar.d);
                umVar.d(new CarIcon(new tj((IconCompat) lksVar.e)));
                ua uaVar = new ua();
                ?? r4 = lksVar.c;
                if (r4 == 0) {
                    uaVar.c(Action.BACK);
                } else {
                    uaVar.e(r4);
                }
                Object obj2 = lksVar.f;
                if (obj2 != null) {
                    sw swVar = new sw();
                    swVar.c(new CarIcon(new tj((IconCompat) obj2)));
                    uaVar.c(swVar.a());
                }
                Header headerA = uaVar.a();
                if (headerA.getStartHeaderAction() != null) {
                    umVar.f = headerA.getStartHeaderAction();
                }
                if (headerA.getTitle() != null) {
                    umVar.b = headerA.getTitle();
                }
                if (!headerA.getEndHeaderActions().isEmpty()) {
                    sx sxVar = new sx();
                    Iterator<Action> it = headerA.getEndHeaderActions().iterator();
                    while (it.hasNext()) {
                        sxVar.b(it.next());
                    }
                    umVar.g = sxVar.a();
                }
                umVar.k = headerA;
                sw swVar2 = new sw();
                swVar2.b = CarText.create(((Context) lksVar.a).getString(R.string.exit));
                swVar2.d(new khe(lksVar, i));
                umVar.b(swVar2.a());
                MessageTemplate messageTemplateA = umVar.a();
                afco afcoVar = tby.a;
                return new eqm(messageTemplateA);
            case 1:
                lkl lklVar = (lkl) obj;
                lklVar.getClass();
                return tby.v(lklVar.c, new kut(lklVar, 15));
            case 2:
                final llg llgVar = (llg) obj;
                llgVar.getClass();
                afen afenVar = new afen() { // from class: lli
                    @Override // defpackage.afen
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
                        omw omwVar = (omw) obj3;
                        Boolean bool = (Boolean) obj4;
                        bool.booleanValue();
                        Boolean bool2 = (Boolean) obj5;
                        bool2.booleanValue();
                        Map map = (Map) obj9;
                        omwVar.getClass();
                        map.getClass();
                        return lkt.b(omwVar, bool, bool2, (lsb) obj6, (CharSequence) obj7, (CharSequence) obj8, map, (IconCompat) obj10, (SpannedString) obj11, llgVar);
                    }
                };
                eqj eqjVar = llgVar.j;
                eqj eqjVar2 = llgVar.k;
                eqj eqjVar3 = llgVar.l;
                eqj eqjVar4 = llgVar.m;
                eqj eqjVar5 = llgVar.p;
                eqj eqjVar6 = llgVar.q;
                eqj eqjVar7 = llgVar.r;
                eqj eqjVar8 = llgVar.n;
                eqj eqjVar9 = llgVar.o;
                return tby.u(tby.i(eqjVar, eqjVar2, eqjVar3, eqjVar4, eqjVar5, eqjVar6, eqjVar7, eqjVar8, eqjVar9, afenVar), b((omw) eqjVar.e(), (Boolean) eqjVar2.e(), (Boolean) eqjVar3.e(), (lsb) eqjVar4.e(), (CharSequence) eqjVar5.e(), (CharSequence) eqjVar6.e(), (Map) eqjVar7.e(), (IconCompat) eqjVar8.e(), (SpannedString) eqjVar9.e(), llgVar));
            case 3:
                llo lloVar = (llo) obj;
                lloVar.getClass();
                return eqy.b(new lld().b(lloVar), new llf(new llq(lloVar), 8));
            case 4:
                lxv lxvVar = (lxv) obj;
                lxvVar.getClass();
                return jti.d(new gms(qwVar), tby.v(lxvVar.j, new lpx(qwVar, 16)), new jsz(), new jtg());
            case 5:
                lxv lxvVar2 = (lxv) obj;
                lxvVar2.getClass();
                return tby.v(lxvVar2.j, new lpx(qwVar, 17));
            case 6:
                kex kexVar = (kex) obj;
                kexVar.getClass();
                return tby.v((eqj) kexVar.a, new lyb(qwVar, kexVar, 2, null));
            default:
                meu meuVar = (meu) obj;
                meuVar.getClass();
                qn qnVar = qwVar.a;
                qnVar.getClass();
                final int color = qnVar.getColor(R.color.gearhead_sdk_tint_light);
                final int color2 = qnVar.getColor(R.color.gearhead_sdk_tint_dark);
                final int color3 = qnVar.getColor(R.color.gearhead_sdk_tint_light);
                ug ugVar = new ug();
                vf vfVar = new vf();
                final int i2 = 1;
                vfVar.e(thq.d(qnVar, R.drawable.gs_dialpad_vd_theme_24, new afec() { // from class: mev
                    @Override // defpackage.afec
                    public final Object invoke(Object obj3) {
                        if (i2 != 0) {
                            int i3 = color;
                            int i4 = color3;
                            return lws.o(color2, i4, i3, (tj) obj3);
                        }
                        int i5 = color;
                        int i6 = color3;
                        return lws.o(color2, i6, i5, (tj) obj3);
                    }
                }), 1);
                vfVar.g(new mel(meuVar, i));
                vfVar.i(qnVar.getString(R.string.calllog_dial_number));
                ugVar.b(vfVar.a());
                if (meuVar.c) {
                    vf vfVar2 = new vf();
                    final int i3 = 0;
                    vfVar2.e(thq.d(qnVar, R.drawable.gs_voicemail_vd_theme_24, new afec() { // from class: mev
                        @Override // defpackage.afec
                        public final Object invoke(Object obj3) {
                            if (i3 != 0) {
                                int i32 = color;
                                int i4 = color3;
                                return lws.o(color2, i4, i32, (tj) obj3);
                            }
                            int i5 = color;
                            int i6 = color3;
                            return lws.o(color2, i6, i5, (tj) obj3);
                        }
                    }), 1);
                    vfVar2.i(qnVar.getString(R.string.calllog_voicemail));
                    vfVar2.g(new mew(i3));
                    ugVar.b(vfVar2.a());
                }
                uj ujVar = new uj();
                ujVar.f(ugVar.a());
                return new eqm(ujVar.a());
        }
    }
}
