package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final /* synthetic */ class zyq {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zyq(Context context, String str, zyx zyxVar, kex kexVar, zwj zwjVar) {
        this.a = context;
        this.b = str;
        this.c = zyxVar;
        this.e = kexVar;
        this.d = zwjVar;
    }

    public static final tvq b(tvr tvrVar, uip uipVar) {
        int iOrdinal = (uipVar != null ? uipVar.e : ujo.DEFAULT).ordinal();
        return new tvq(tvrVar, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? uum.a : uuq.a : uuo.a : uus.p : uus.j);
    }

    public final tpw a(tpr tprVar, tza tzaVar, tod todVar, abde abdeVar) {
        float f = this.a.getResources().getDisplayMetrics().density;
        txj txjVar = (txj) this.e;
        return new twf(txjVar, txjVar.c, (uvg) this.b, (gjv) this.d, (usy) this.c, f, abdeVar, tprVar, tzaVar, todVar);
    }

    public zyq(txj txjVar, uvg uvgVar, gjv gjvVar, usy usyVar, Context context) {
        this.e = txjVar;
        this.b = uvgVar;
        this.d = gjvVar;
        this.c = usyVar;
        this.a = context;
    }
}
