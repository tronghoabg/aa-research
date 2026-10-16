package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class nel extends erm {
    public final String a;
    public final eqj b;
    public final eqj c;
    public final eqj d;
    public final eqj e;
    public final eqj f;
    private final eqj g;
    private final eqj i;

    public nel() {
        String string = mki.a.c.getString(R.string.temperature_unavailable);
        string.getClass();
        this.a = string;
        eqm eqmVar = onu.a().d;
        eqmVar.getClass();
        eqj eqjVarU = tby.u(eqmVar, null);
        this.g = eqjVarU;
        eqj eqjVarT = tby.t(eqjVarU);
        this.i = eqjVarT;
        eqj eqjVarO = tby.o(eqjVarU);
        this.b = eqjVarO;
        this.c = tby.u(tby.G(eqjVarT, eqjVarO, new njg(this, 1)), string);
        this.d = tby.v(eqjVarT, new ndo(9));
        this.e = tby.v(eqjVarT, new ndo(10));
        this.f = tby.u(tby.G(eqjVarT, eqjVarO, new nek()), Integer.valueOf(true != ldz.a.a().b() ? R.drawable.dash_weather_unknown : R.drawable.cielo_weather_unavailable));
    }
}
