package defpackage;

/* loaded from: classes.dex */
public final class nmm {
    public boolean a;
    private final git b;

    public nmm(afdr afdrVar, afdr afdrVar2, final afdr afdrVar3, final afdr afdrVar4) {
        final int i = 1;
        final int i2 = 0;
        this.b = new git(new bws(afdrVar2, this, 20, null), new afdr(this) { // from class: nml
            public final /* synthetic */ nmm a;

            {
                this.a = this;
            }

            @Override // defpackage.afdr
            public final Object invoke() {
                int i3 = i;
                nmm nmmVar = this.a;
                if (i3 != 0) {
                    nmmVar.a = true;
                    afdr afdrVar5 = afdrVar3;
                    if (afdrVar5 != null) {
                        afdrVar5.invoke();
                    }
                    return afak.a;
                }
                nmmVar.a = false;
                afdr afdrVar6 = afdrVar3;
                if (afdrVar6 != null) {
                    afdrVar6.invoke();
                }
                return afak.a;
            }
        }, new axf(this, afdrVar, afdrVar4, 7), new afdr(this) { // from class: nml
            public final /* synthetic */ nmm a;

            {
                this.a = this;
            }

            @Override // defpackage.afdr
            public final Object invoke() {
                int i3 = i2;
                nmm nmmVar = this.a;
                if (i3 != 0) {
                    nmmVar.a = true;
                    afdr afdrVar5 = afdrVar4;
                    if (afdrVar5 != null) {
                        afdrVar5.invoke();
                    }
                    return afak.a;
                }
                nmmVar.a = false;
                afdr afdrVar6 = afdrVar4;
                if (afdrVar6 != null) {
                    afdrVar6.invoke();
                }
                return afak.a;
            }
        });
    }

    public final git a(Object obj, Object obj2, bux buxVar, int i) {
        if ((i & 1) != 0) {
            obj = afak.a;
        }
        if ((i & 2) != 0) {
            obj2 = afak.a;
        }
        git gitVar = this.b;
        gitVar.b(new Object[]{obj, obj2}, buxVar);
        return gitVar;
    }
}
