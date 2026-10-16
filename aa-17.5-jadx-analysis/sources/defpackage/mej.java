package defpackage;

import android.content.Context;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class mej {
    public static final yzz a = yzz.PHONE_BROWSE_CONTACTS;
    public static final yob b = yob.c("com/google/android/apps/auto/components/phone/contacts/ContactsModel");
    private static final Duration k = wub.an(60);
    public final kqw c;
    public final afeg d;
    public final afeg e;
    public final tmb f;
    public final tki g;
    public final eqm h = new eqm(null);
    public Long i;
    public final eqj j;

    public mej(Context context, ept eptVar, int i, kqw kqwVar, afeg afegVar, afeg afegVar2, tmb tmbVar) {
        this.c = kqwVar;
        this.d = afegVar;
        this.e = afegVar2;
        this.f = tmbVar;
        this.g = new tki(context, eptVar, szp.z(new meg(context, i), i), "mej");
        aiyd aiydVar = new aiyd(new dmx(this, (afck) null, 13));
        mkk mkkVar = mkm.a;
        this.j = tby.u(eqy.b(dtx.n(aiyr.a(aimv.a(new hcg(new hcg(aimv.a(aiydVar, mkkVar.e()), this, 6), new meq((afck) null, 1, (byte[]) null), 12), mkkVar.b())), k), new eyr((Object) this, 15, (short[][][]) null)), null);
    }

    public static final void a() {
        ebf.j().F(rrc.h(yxy.GEARHEAD, a, yzy.yI).l());
        kfl.h().A(R.string.assistant_query_make_a_call, osv.ASSISTANT_NUDGE_IN_DIALER_CLICKED);
    }
}
