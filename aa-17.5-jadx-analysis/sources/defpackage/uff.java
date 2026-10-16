package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class uff extends ufg {
    private final ufw a;
    private final String b;
    private final ujf c;
    private final int d;
    private final float e;
    private final float f;

    public uff(ufw ufwVar, String str, ujf ujfVar, int i, float[] fArr) {
        super(fArr[0], fArr[1]);
        this.a = ufwVar;
        this.b = str;
        this.c = ujfVar;
        this.d = i;
        this.e = fArr[2];
        this.f = fArr[3];
    }

    @Override // defpackage.ufg
    @ResultIgnorabilityUnspecified
    public final uwk a() {
        uwi uwiVarC = this.a.c(this.b, this.c, this.d);
        if (uwiVarC != null) {
            return new uwk(uwiVarC);
        }
        return null;
    }

    @Override // defpackage.ufg
    public final float c() {
        return this.e;
    }

    @Override // defpackage.ufg
    public final float i() {
        return this.f;
    }
}
