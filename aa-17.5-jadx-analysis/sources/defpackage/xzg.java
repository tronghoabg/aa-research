package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
class xzg {
    public static final xzg a;
    public static final xzg b;
    public static final xzg c;
    public static final xzg d;
    public static final xzg e;
    public static final xzg f;
    public static final xzg g;
    public static final xzg h;
    static final xzg[] i;
    private static final /* synthetic */ xzg[] j;

    static {
        xzg xzgVar = new xzg("STRONG", 0);
        a = xzgVar;
        xzg xzgVar2 = new xzg() { // from class: xza
            @Override // defpackage.xzg
            public final yao a(xzt xztVar, yao yaoVar, yao yaoVar2, Object obj) {
                yao yaoVarA = super.a(xztVar, yaoVar, yaoVar2, obj);
                c(yaoVar, yaoVarA);
                return yaoVarA;
            }
        };
        b = xzgVar2;
        xzg xzgVar3 = new xzg() { // from class: xzb
            @Override // defpackage.xzg
            public final yao a(xzt xztVar, yao yaoVar, yao yaoVar2, Object obj) {
                yao yaoVarA = super.a(xztVar, yaoVar, yaoVar2, obj);
                d(yaoVar, yaoVarA);
                return yaoVarA;
            }
        };
        c = xzgVar3;
        xzg xzgVar4 = new xzg() { // from class: xzc
            @Override // defpackage.xzg
            public final yao a(xzt xztVar, yao yaoVar, yao yaoVar2, Object obj) {
                yao yaoVarA = super.a(xztVar, yaoVar, yaoVar2, obj);
                c(yaoVar, yaoVarA);
                d(yaoVar, yaoVarA);
                return yaoVarA;
            }
        };
        d = xzgVar4;
        xzg xzgVar5 = new xzg("WEAK", 4);
        e = xzgVar5;
        xzg xzgVar6 = new xzg() { // from class: xzd
            @Override // defpackage.xzg
            public final yao a(xzt xztVar, yao yaoVar, yao yaoVar2, Object obj) {
                yao yaoVarA = super.a(xztVar, yaoVar, yaoVar2, obj);
                c(yaoVar, yaoVarA);
                return yaoVarA;
            }
        };
        f = xzgVar6;
        xzg xzgVar7 = new xzg() { // from class: xze
            @Override // defpackage.xzg
            public final yao a(xzt xztVar, yao yaoVar, yao yaoVar2, Object obj) {
                yao yaoVarA = super.a(xztVar, yaoVar, yaoVar2, obj);
                d(yaoVar, yaoVarA);
                return yaoVarA;
            }
        };
        g = xzgVar7;
        xzg xzgVar8 = new xzg() { // from class: xzf
            @Override // defpackage.xzg
            public final yao a(xzt xztVar, yao yaoVar, yao yaoVar2, Object obj) {
                yao yaoVarA = super.a(xztVar, yaoVar, yaoVar2, obj);
                c(yaoVar, yaoVarA);
                d(yaoVar, yaoVarA);
                return yaoVarA;
            }
        };
        h = xzgVar8;
        j = new xzg[]{xzgVar, xzgVar2, xzgVar3, xzgVar4, xzgVar5, xzgVar6, xzgVar7, xzgVar8};
        i = new xzg[]{xzgVar, xzgVar2, xzgVar3, xzgVar4, xzgVar5, xzgVar6, xzgVar7, xzgVar8};
    }

    public xzg(String str, int i2) {
    }

    static final void c(yao yaoVar, yao yaoVar2) {
        yaoVar2.k(yaoVar.b());
        yan.d(yaoVar.h(), yaoVar2);
        yan.d(yaoVar2, yaoVar.f());
        yan.f(yaoVar);
    }

    static final void d(yao yaoVar, yao yaoVar2) {
        yaoVar2.q(yaoVar.c());
        yan.e(yaoVar.i(), yaoVar2);
        yan.e(yaoVar2, yaoVar.g());
        yan.g(yaoVar);
    }

    public static xzg valueOf(String str) {
        return (xzg) Enum.valueOf(xzg.class, str);
    }

    public static xzg[] values() {
        return (xzg[]) j.clone();
    }

    public yao a(xzt xztVar, yao yaoVar, yao yaoVar2, Object obj) {
        return b(xztVar, obj, yaoVar.a(), yaoVar2);
    }

    final yao b(xzt xztVar, Object obj, int i2, yao yaoVar) {
        switch (ordinal()) {
            case 0:
                return new xzy(obj, i2, yaoVar);
            case 1:
                return new xzw(obj, i2, yaoVar);
            case 2:
                return new yaa(obj, i2, yaoVar);
            case 3:
                return new xzx(obj, i2, yaoVar);
            case 4:
                return new yag(xztVar.h, obj, i2, yaoVar);
            case 5:
                return new yae(xztVar.h, obj, i2, yaoVar);
            case 6:
                return new yai(xztVar.h, obj, i2, yaoVar);
            case 7:
                return new yaf(xztVar.h, obj, i2, yaoVar);
            default:
                throw null;
        }
    }
}
