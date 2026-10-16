package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class fyy {
    public static final fyy a;
    public static final fyy b;
    private static final /* synthetic */ fyy[] j;
    public final gjk c;
    public final gjk d;
    public final gjk e;
    public final gjk f;
    public final gjk g;
    public final fwh h;
    public final fwx i;

    static {
        fyy fyyVar = new fyy() { // from class: fyx
            {
                gjk gjkVar = gjk.d;
                gjk gjkVar2 = gjk.f;
                gjk gjkVar3 = gjk.e;
                fxv fxvVar = fwh.b;
                fwx fwxVar = fwx.c;
            }

            @Override // defpackage.fyy
            public final dfw a(bux buxVar) {
                buxVar.v(1935206236);
                dfw dfwVar = czz.av(buxVar).d;
                buxVar.o();
                return dfwVar;
            }
        };
        a = fyyVar;
        fyy fyyVar2 = new fyy() { // from class: fyw
            {
                gjk gjkVar = gjk.a;
                gjk gjkVar2 = gjk.d;
                gjk gjkVar3 = gjk.b;
                fxr fxrVar = fwh.a;
                fwx fwxVar = fwx.d;
            }

            @Override // defpackage.fyy
            public final dfw a(bux buxVar) {
                buxVar.v(863966720);
                dfw dfwVar = czz.av(buxVar).e;
                buxVar.o();
                return dfwVar;
            }
        };
        b = fyyVar2;
        fyy[] fyyVarArr = {fyyVar, fyyVar2};
        j = fyyVarArr;
        affa.p(fyyVarArr);
    }

    public fyy(String str, int i, gjk gjkVar, gjk gjkVar2, gjk gjkVar3, gjk gjkVar4, gjk gjkVar5, fwh fwhVar, fwx fwxVar) {
        this.c = gjkVar;
        this.d = gjkVar2;
        this.e = gjkVar3;
        this.f = gjkVar4;
        this.g = gjkVar5;
        this.h = fwhVar;
        this.i = fwxVar;
    }

    public static fyy valueOf(String str) {
        return (fyy) Enum.valueOf(fyy.class, str);
    }

    public static fyy[] values() {
        return (fyy[]) j.clone();
    }

    public abstract dfw a(bux buxVar);
}
