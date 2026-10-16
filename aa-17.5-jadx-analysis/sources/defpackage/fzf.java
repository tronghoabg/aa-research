package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public abstract class fzf {
    public static final fzf a;
    public static final fzf b;
    private static final /* synthetic */ fzf[] g;
    public final boolean c;
    public final fwx d;
    public final fwx e;
    public final boolean f;

    static {
        fzf fzfVar = new fzf() { // from class: fzd
            {
                fwx fwxVar = fwx.d;
            }

            @Override // defpackage.fzf
            public final float a(bux buxVar) {
                buxVar.v(1151183157);
                float f = gux.e(buxVar).a.d;
                ((bvv) buxVar).Y(false);
                return f;
            }

            @Override // defpackage.fzf
            public final float b(bux buxVar) {
                buxVar.v(1672213621);
                hir hirVar = gux.e(buxVar).c;
                ((bvv) buxVar).Y(false);
                return 8.0f;
            }

            @Override // defpackage.fzf
            public final float c(bux buxVar) {
                buxVar.v(27947637);
                float f = gux.e(buxVar).b.d;
                ((bvv) buxVar).Y(false);
                return f;
            }
        };
        a = fzfVar;
        fzf fzfVar2 = new fzf() { // from class: fze
            {
                fwx fwxVar = fwx.a;
                fwx fwxVar2 = fwx.c;
            }

            @Override // defpackage.fzf
            public final float a(bux buxVar) {
                buxVar.v(1589920985);
                float f = gux.e(buxVar).a.g;
                ((bvv) buxVar).Y(false);
                return f;
            }

            @Override // defpackage.fzf
            public final float b(bux buxVar) {
                buxVar.v(-867311591);
                float f = gux.e(buxVar).a.g;
                ((bvv) buxVar).Y(false);
                return f;
            }

            @Override // defpackage.fzf
            public final float c(bux buxVar) {
                buxVar.v(337108505);
                float f = gux.e(buxVar).b.e;
                ((bvv) buxVar).Y(false);
                return f;
            }
        };
        b = fzfVar2;
        fzf[] fzfVarArr = {fzfVar, fzfVar2};
        g = fzfVarArr;
        affa.p(fzfVarArr);
    }

    public fzf(String str, int i, boolean z, fwx fwxVar, fwx fwxVar2, boolean z2) {
        this.c = z;
        this.d = fwxVar;
        this.e = fwxVar2;
        this.f = z2;
    }

    public static fzf valueOf(String str) {
        return (fzf) Enum.valueOf(fzf.class, str);
    }

    public static fzf[] values() {
        return (fzf[]) g.clone();
    }

    public abstract float a(bux buxVar);

    public abstract float b(bux buxVar);

    public abstract float c(bux buxVar);
}
