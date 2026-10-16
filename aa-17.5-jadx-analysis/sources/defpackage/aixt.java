package defpackage;

/* loaded from: classes2.dex */
public final class aixt extends aixh {
    private final int f;
    private final int g;

    public aixt(int i, int i2) {
        super(i);
        this.f = i;
        this.g = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new IllegalArgumentException(a.bn(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
        } else {
            throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + affw.b(aixh.class).getSimpleName() + " instead");
        }
    }

    private final Object E(Object obj) {
        aixq aixqVarP;
        int i;
        aixt aixtVar;
        ajcz ajczVar = aixj.d;
        aixq aixqVar = (aixq) this.c.a;
        while (true) {
            long jB = this.a.b();
            long j = 1152921504606846975L & jB;
            boolean zW = super.w(jB, false);
            long j2 = aixj.b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (aixqVar.b != j3) {
                aixqVarP = super.p(j3, aixqVar);
                if (aixqVarP != null) {
                    aixtVar = this;
                    i = i2;
                } else if (zW) {
                    return new aixn(this.n());
                }
            } else {
                aixqVarP = aixqVar;
                i = i2;
                aixtVar = this;
            }
            Object obj2 = obj;
            int iA = super.a(aixqVarP, i, obj2, j, ajczVar, zW);
            aixt aixtVar2 = aixtVar;
            aixqVar = aixqVarP;
            if (iA == 0) {
                aixqVar.o();
                return afak.a;
            }
            if (iA == 1) {
                return afak.a;
            }
            if (iA == 2) {
                if (zW) {
                    aixqVar.r();
                    return new aixn(aixtVar2.n());
                }
                aixtVar2.q((aixqVar.b * j2) + i);
                return afak.a;
            }
            if (iA == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iA == 4) {
                if (j < aixtVar2.b()) {
                    aixqVar.o();
                }
                return new aixn(aixtVar2.n());
            }
            aixqVar.o();
            this = aixtVar2;
            obj = obj2;
        }
    }

    @Override // defpackage.aixh, defpackage.aixy
    public final Object h(Object obj, afck afckVar) throws Throwable {
        Object objE = E(obj);
        if (!(objE instanceof aixn)) {
            return afak.a;
        }
        aixp.b(objE);
        throw n();
    }

    @Override // defpackage.aixh, defpackage.aixy
    public final Object j(Object obj) {
        return E(obj);
    }

    @Override // defpackage.aixh
    protected final boolean z() {
        return this.g == 2;
    }
}
