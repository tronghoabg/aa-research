package defpackage;

/* loaded from: classes.dex */
public final class baj implements amy {
    private final afdr a;
    private final dlr b;
    private final boolean c;
    private final amy d;

    public baj(afdr afdrVar, dlr dlrVar, boolean z, amy amyVar) {
        this.a = afdrVar;
        this.b = dlrVar;
        this.c = z;
        this.d = amyVar;
    }

    @Override // defpackage.amy
    public final float a(float f, float f2, float f3) {
        float fIntValue = ((Number) this.a.invoke()).intValue();
        dlr dlrVar = dlr.b;
        if (this.c || this.b != dlrVar) {
            f -= fIntValue;
        }
        return this.d.a(f, f2, f3 - fIntValue);
    }

    @Override // defpackage.amy
    public final /* synthetic */ aec b() {
        return amx.a;
    }
}
