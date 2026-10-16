package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class up {
    public int a;

    public up() {
        this.a = 100;
    }

    public static final void c(android.view.ViewGroup viewGroup, defpackage.hlu hluVar, int i) {
        defpackage.tc tcVar = new defpackage.tc(viewGroup, hluVar.e());
        android.content.Context context = viewGroup.getContext();
        int i2 = defpackage.fgk.a;
        defpackage.fgj fgjVarA = defpackage.fgk.a(i, context);
        fgjVarA.getClass();
        fgjVarA.N(defpackage.czl.class);
        java.lang.Object obj = tcVar.b;
        java.util.ArrayList arrayList = defpackage.fgo.a;
        if (arrayList.contains(obj)) {
            return;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) obj;
        defpackage.tc.q(viewGroup2);
        arrayList.add(obj);
        defpackage.fgj fgjVarJ = fgjVarA.clone();
        defpackage.fgo.d(viewGroup2, fgjVarJ);
        java.lang.Object obj2 = tcVar.a;
        if (obj2 != null) {
            viewGroup2.removeAllViews();
            viewGroup2.addView((android.view.View) obj2);
        }
        viewGroup2.setTag(com.google.android.projection.gearhead.R.id.transition_current_scene, tcVar);
        defpackage.fgo.c(viewGroup2, fgjVarJ);
    }

    private static int g(int i, int i2) {
        return (i == 1 || i2 == 1) ? 1 : 2;
    }

    private static int h(int i, int i2) {
        return (i == 3 || i2 == 3) ? 3 : 2;
    }

    public final int a() {
        int i = this.a - 1;
        this.a = i;
        return i;
    }

    public final boolean b(int i) {
        return this.a >= i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    public final void d(defpackage.pek pekVar) {
        int iG;
        switch (pekVar.ordinal()) {
            case 0:
                iG = g(this.a, 1);
                this.a = iG;
                return;
            case 1:
            case 8:
                iG = h(this.a, 3);
                this.a = iG;
                return;
            case 2:
            case 3:
            case 6:
            case 7:
            case 9:
                iG = h(this.a, 2);
                this.a = iG;
                return;
            case 4:
                iG = g(this.a, 2);
                this.a = iG;
                return;
            case 5:
                if ((defpackage.adax.ar() && defpackage.hry.a()) || defpackage.adax.aq()) {
                    iG = h(this.a, 3);
                } else {
                    iG = h(this.a, 2);
                }
                this.a = iG;
                return;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    public final boolean e() {
        return this.a > 0;
    }

    public final int f(defpackage.yhe yheVar, int i, int i2, defpackage.abzw abzwVar) {
        if ((abzwVar.c == 6 ? (defpackage.abzy) abzwVar.d : defpackage.abzy.a).g.size() != 0) {
            loop0: for (defpackage.abzx abzxVar : (abzwVar.c == 6 ? (defpackage.abzy) abzwVar.d : defpackage.abzy.a).g) {
                java.util.Iterator<E> it = abzxVar.b.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Integer) it.next()).intValue() == i2) {
                        defpackage.abyq abyqVar = abzxVar.c;
                        if (abyqVar == null) {
                            abyqVar = defpackage.abyq.a;
                        }
                        int iAy = defpackage.a.ay(abyqVar.b);
                        if (iAy == 0) {
                            iAy = 1;
                        }
                        int i3 = iAy - 2;
                        if (i3 == 2) {
                            defpackage.abyq abyqVar2 = abzxVar.c;
                            if (abyqVar2 == null) {
                                abyqVar2 = defpackage.abyq.a;
                            }
                            if (!yheVar.containsKey(abyqVar2.c)) {
                                break loop0;
                            }
                            defpackage.abyq abyqVar3 = abzxVar.c;
                            if (abyqVar3 == null) {
                                abyqVar3 = defpackage.abyq.a;
                            }
                            this.a = ((java.lang.Integer) yheVar.get(abyqVar3.c)).intValue();
                            break loop0;
                        }
                        if (i3 != 3) {
                            break loop0;
                        }
                        this.a = i + 1;
                        break loop0;
                    }
                }
            }
        }
        return this.a;
    }

    public up(int i) {
        this.a = i;
    }

    public up(byte[] bArr) {
        this.a = 0;
    }

    public up(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = -1;
    }

    public up(char[] cArr) {
        this.a = 2;
    }

    public up(short[] sArr) {
    }
}
