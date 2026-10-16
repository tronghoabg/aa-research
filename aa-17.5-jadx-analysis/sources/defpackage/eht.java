package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class eht implements afgl {
    public final String a;
    private final afec b;
    private final aitx c;
    private final Object d = new Object();
    private volatile efa e;

    public eht(String str, afec afecVar, aitx aitxVar) {
        this.a = str;
        this.b = afecVar;
        this.c = aitxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.afgl
    public final /* synthetic */ Object getValue(Object obj, afia afiaVar) {
        efa efaVar;
        Context context = (Context) obj;
        afiaVar.getClass();
        efa efaVar2 = this.e;
        if (efaVar2 != null) {
            return efaVar2;
        }
        synchronized (this.d) {
            if (this.e == null) {
                Context applicationContext = context.getApplicationContext();
                afec afecVar = this.b;
                applicationContext.getClass();
                ?? Invoke = afecVar.invoke(applicationContext);
                aitx aitxVar = this.c;
                egi egiVar = new egi(eib.a, new cxm(new bws(applicationContext, this, 7), 20));
                afco afcoVarPlus = ((ajbw) aitxVar).a;
                if (afcoVarPlus.get(aivh.d) == null) {
                    afcoVarPlus = afcoVarPlus.plus(new aivj(null));
                }
                eez eezVar = new eez(egiVar, afcoVarPlus);
                eezVar.b(Invoke);
                this.e = new ehy(new ehy(eezVar.a()));
            }
            efaVar = this.e;
            efaVar.getClass();
        }
        return efaVar;
    }
}
