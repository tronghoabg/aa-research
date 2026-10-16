package defpackage;

import com.google.android.apps.auto.components.radio.RadioMediaBrowserService;
import com.google.android.gms.car.RadioProgramSelector;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final /* synthetic */ class fjt implements dny {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ fjt(Executor executor, afdr afdrVar, int i) {
        this.d = i;
        this.a = executor;
        this.c = "setForegroundAsync";
        this.b = afdrVar;
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.dny
    public final Object a(dnw dnwVar) {
        int i = this.d;
        if (i == 0) {
            this.a.execute(new ae(this.b, this.c, dnwVar, 9));
            return afak.a;
        }
        int i2 = 0;
        if (i != 1) {
            ((RadioMediaBrowserService) this.c).n = dnwVar;
            kgq.d(new mja(this.a, (AbstractSafeParcelable) this.b, dnwVar, i2), "GH.Radio", yzz.RADIO_APP, yzy.LV, "Can't tune", new Object[0]);
            return "RequestTune";
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        dnwVar.a(new elt(atomicBoolean, 11), fjf.a);
        this.a.execute(new ae(atomicBoolean, dnwVar, this.b, 8, (char[]) null));
        return this.c;
    }

    public /* synthetic */ fjt(RadioMediaBrowserService radioMediaBrowserService, qsb qsbVar, RadioProgramSelector radioProgramSelector, int i) {
        this.d = i;
        this.c = radioMediaBrowserService;
        this.a = qsbVar;
        this.b = radioProgramSelector;
    }

    public /* synthetic */ fjt(Executor executor, afdr afdrVar, eqm eqmVar, int i) {
        this.d = i;
        this.a = executor;
        this.b = afdrVar;
        this.c = eqmVar;
    }
}
