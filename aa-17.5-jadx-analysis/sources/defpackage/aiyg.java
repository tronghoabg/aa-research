package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class aiyg extends ajal {
    private final aixx d;

    public aiyg(aixx aixxVar, afco afcoVar, int i, int i2) {
        super(afcoVar, i, i2);
        this.d = aixxVar;
        int i3 = aisu.a;
    }

    @Override // defpackage.ajal
    public final Object b(aixv aixvVar, afck afckVar) {
        return aimi.a(new ajbf(aixvVar), this.d, false, afckVar);
    }

    @Override // defpackage.ajal
    protected final ajal c(afco afcoVar, int i, int i2) {
        return new aiyg(this.d, afcoVar, i, i2);
    }

    @Override // defpackage.ajal
    protected final String d() {
        aixx aixxVar = this.d;
        Objects.toString(aixxVar);
        return "channel=".concat(aixxVar.toString());
    }

    @Override // defpackage.ajal
    public final aixx e(aitx aitxVar) {
        return this.b == -3 ? this.d : super.e(aitxVar);
    }

    @Override // defpackage.ajal
    public final aiyk f() {
        return new aiyg(this.d);
    }

    @Override // defpackage.ajal, defpackage.aiyk
    public final Object hR(aiyl aiylVar, afck afckVar) {
        return this.b == -3 ? aimi.a(aiylVar, this.d, false, afckVar) : ajal.h(this, aiylVar, afckVar);
    }

    public /* synthetic */ aiyg(aixx aixxVar) {
        this(aixxVar, afcp.a, -3, 1);
    }
}
