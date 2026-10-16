package defpackage;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.projection.gearhead.R;
import j$.time.Duration;

/* loaded from: classes2.dex */
public final class lxv {
    public static final yob a = yob.c("com/google/android/apps/auto/components/messaging/template/ContactsModel");
    private static final Duration k = wub.an(60);
    public final ComponentName b;
    public final kqw c;
    public final afec d;
    public final afec e;
    public final String f;
    public final String g;
    public final tki h;
    public final eqm i;
    public final eqj j;

    public lxv(Context context, ComponentName componentName, ept eptVar, int i, kqw kqwVar, afec afecVar, afec afecVar2) {
        this.b = componentName;
        this.c = kqwVar;
        this.d = afecVar;
        this.e = afecVar2;
        String string = context.getString(R.string.contact_call_subtitle);
        string.getClass();
        this.f = string;
        String string2 = context.getString(R.string.contact_multiple_phone_numbers_subtitle);
        string2.getClass();
        this.g = string2;
        tjy tjyVarZ = szp.z(new meg(context, i), i);
        String simpleName = getClass().getSimpleName();
        simpleName.getClass();
        this.h = new tki(context, eptVar, tjyVarZ, simpleName);
        this.i = new eqm(null);
        aiyd aiydVar = new aiyd(new dmx(this, (afck) null, 12));
        mkk mkkVar = mkm.a;
        this.j = tby.u(dtx.n(aimv.a(new jyc(aimv.a(aiydVar, mkkVar.e()), this, context, 4), mkkVar.b()), k), null);
    }
}
