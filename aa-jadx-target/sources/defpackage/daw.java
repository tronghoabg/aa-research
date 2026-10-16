package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class daw {
    public static final android.view.PointerIcon a(android.content.Context context, defpackage.cra craVar) {
        return craVar instanceof defpackage.cqk ? a$.ExternalSyntheticApiModelOutline2.m(context, ((defpackage.cqk) craVar).a) : a$.ExternalSyntheticApiModelOutline2.m(context, 1000);
    }

    public static final void b(android.view.View view, defpackage.cra craVar) {
        android.view.PointerIcon pointerIconA = a(view.getContext(), craVar);
        if (defpackage.afga.f(a$.ExternalSyntheticApiModelOutline2.m(view), pointerIconA)) {
            return;
        }
        a$.ExternalSyntheticApiModelOutline2.m(view, pointerIconA);
    }

    public static final defpackage.dfb c(defpackage.dec decVar) {
        defpackage.ddz ddzVar = decVar.b;
        defpackage.dfb dfbVar = (defpackage.dfb) ddzVar.g(defpackage.def.H);
        java.util.List list = (java.util.List) ddzVar.g(defpackage.def.D);
        return dfbVar == null ? list != null ? (defpackage.dfb) defpackage.afga.aB(list) : null : dfbVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    public static final java.lang.String d(defpackage.dec decVar, android.content.res.Resources resources) {
        java.util.Collection collection;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        int iG;
        defpackage.ddz ddzVar = decVar.b;
        java.lang.Object objG = ddzVar.g(defpackage.def.b);
        defpackage.det detVar = (defpackage.det) ddzVar.g(defpackage.def.M);
        defpackage.ddw ddwVar = (defpackage.ddw) ddzVar.g(defpackage.def.A);
        java.lang.String string = null;
        if (detVar != null) {
            int iOrdinal = detVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new defpackage.afas();
                    }
                    if (objG == null) {
                        objG = resources.getString(2132084231);
                    }
                } else if (ddwVar == null) {
                    ddwVar = null;
                } else if (ddwVar.a == 2 && objG == null) {
                    objG = resources.getString(2132085303);
                }
            } else if (ddwVar == null) {
                ddwVar = null;
            } else if (ddwVar.a == 2 && objG == null) {
                objG = resources.getString(2132085304);
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) ddzVar.g(defpackage.def.L);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((ddwVar == null || ddwVar.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(2132085001) : resources.getString(2132084615);
            }
        }
        defpackage.ddv ddvVar = (defpackage.ddv) ddzVar.g(defpackage.def.c);
        if (ddvVar != null) {
            if (ddvVar != defpackage.ddv.a) {
                if (objG == null) {
                    defpackage.afhw afhwVar = ddvVar.c;
                    float fFloatValue = ((java.lang.Number) afhwVar.c()).floatValue() - ((java.lang.Number) afhwVar.d()).floatValue() == 0.0f ? 0.0f : (ddvVar.b - ((java.lang.Number) afhwVar.d()).floatValue()) / (((java.lang.Number) afhwVar.c()).floatValue() - ((java.lang.Number) afhwVar.d()).floatValue());
                    if (fFloatValue < 0.0f) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    if (fFloatValue == 0.0f) {
                        iG = 0;
                    } else {
                        iG = fFloatValue == 1.0f ? 100 : defpackage.afqt.g(java.lang.Math.round(fFloatValue * 100.0f), 1, 99);
                    }
                    objG = resources.getString(2132085383, java.lang.Integer.valueOf(iG));
                }
            } else if (objG == null) {
                objG = resources.getString(2132084230);
            }
        }
        defpackage.dej dejVar = defpackage.def.H;
        if (ddzVar.f(dejVar)) {
            defpackage.ddz ddzVarG = decVar.h().g();
            java.util.Collection collection2 = (java.util.Collection) ddzVarG.g(defpackage.def.a);
            if ((collection2 == null || collection2.isEmpty()) && (((collection = (java.util.Collection) ddzVarG.g(defpackage.def.D)) == null || collection.isEmpty()) && (((charSequence = (java.lang.CharSequence) ddzVarG.g(dejVar)) == null || charSequence.length() == 0) && ((charSequence2 = (java.lang.CharSequence) ddzVarG.g(defpackage.def.v)) == null || charSequence2.length() == 0)))) {
                string = resources.getString(2132085302);
            }
            objG = string;
        }
        return (java.lang.String) objG;
    }

    public static final boolean e(defpackage.dec decVar) {
        return !decVar.g().f(defpackage.def.j);
    }

    public static final boolean f(defpackage.dec decVar) {
        defpackage.ddz ddzVar = decVar.b;
        defpackage.det detVar = (defpackage.det) ddzVar.g(defpackage.def.M);
        defpackage.ddw ddwVar = (defpackage.ddw) ddzVar.g(defpackage.def.A);
        java.lang.Boolean bool = (java.lang.Boolean) ddzVar.g(defpackage.def.L);
        boolean z = detVar != null;
        if (bool != null) {
            bool.booleanValue();
            if (ddwVar == null || ddwVar.a != 4) {
                return true;
            }
        }
        return z;
    }

    public static final boolean g(defpackage.dec decVar) {
        return decVar.a.s == defpackage.dlz.b;
    }

    public static final boolean h(defpackage.dec decVar, android.content.res.Resources resources, boolean z) {
        if (defpackage.ded.a(decVar) || z) {
            return false;
        }
        defpackage.ddz ddzVar = decVar.b;
        if (ddzVar.a) {
            return true;
        }
        java.util.List list = (java.util.List) ddzVar.g(defpackage.def.a);
        return !((list != null ? (java.lang.String) defpackage.afga.aB(list) : null) == null && c(decVar) == null && d(decVar, resources) == null && !f(decVar)) && i(decVar);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x003f A[RETURN] */
    public static final boolean i(defpackage.dec decVar) {
        if (decVar.j()) {
            return false;
        }
        java.util.List listK = decVar.k((4 & 1) != 0 ? !decVar.e : false, true & ((4 & 2) == 0));
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            if (!defpackage.vx.d((defpackage.dec) listK.get(i))) {
                return false;
            }
        }
        defpackage.cxl cxlVarL = decVar.a.l();
        while (cxlVarL != null) {
            defpackage.ddz ddzVarR = cxlVarL.r();
            if (ddzVarR != null && ddzVarR.a) {
                if (cxlVarL != null) {
                    return false;
                }
                return true;
            }
            cxlVarL = cxlVarL.l();
        }
        cxlVarL = null;
        if (cxlVarL != null) {
            return false;
        }
        return true;
    }

    public static final void j(edn ednVar, defpackage.dec decVar) {
        defpackage.ddz ddzVar = decVar.b;
        if (e(decVar)) {
            defpackage.ddn ddnVar = (defpackage.ddn) ddzVar.g(defpackage.ddy.y);
            if (ddnVar != null) {
                ednVar.h(new defpackage.edm(null, android.R.id.accessibilityActionPageUp, ddnVar.a, null, null));
            }
            defpackage.ddn ddnVar2 = (defpackage.ddn) ddzVar.g(defpackage.ddy.A);
            if (ddnVar2 != null) {
                ednVar.h(new defpackage.edm(null, android.R.id.accessibilityActionPageDown, ddnVar2.a, null, null));
            }
            defpackage.ddn ddnVar3 = (defpackage.ddn) ddzVar.g(defpackage.ddy.z);
            if (ddnVar3 != null) {
                ednVar.h(new defpackage.edm(null, android.R.id.accessibilityActionPageLeft, ddnVar3.a, null, null));
            }
            defpackage.ddn ddnVar4 = (defpackage.ddn) ddzVar.g(defpackage.ddy.B);
            if (ddnVar4 != null) {
                ednVar.h(new defpackage.edm(null, android.R.id.accessibilityActionPageRight, ddnVar4.a, null, null));
            }
        }
    }

    public static android.view.animation.Interpolator k(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        android.view.animation.Interpolator interpolatorLoadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, i);
        defpackage.a.ak(interpolatorLoadInterpolator, "Failed to parse interpolator, no start tag found");
        return interpolatorLoadInterpolator;
    }

    public static android.animation.Animator l(android.view.View view, fgv fgvVar, int i, int i2, float f, float f2, float f3, float f4, android.animation.TimeInterpolator timeInterpolator, fgj fgjVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) fgvVar.b.getTag(2131429814);
        if (iArr != null) {
            f = (iArr[0] - i) + translationX;
            f2 = (iArr[1] - i2) + translationY;
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
        if (f == f3 && f2 == f4) {
            return null;
        }
        android.animation.ObjectAnimator objectAnimatorOfPropertyValuesHolder = android.animation.ObjectAnimator.ofPropertyValuesHolder(view, android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_X, f, f3), android.animation.PropertyValuesHolder.ofFloat((android.util.Property<?, java.lang.Float>) android.view.View.TRANSLATION_Y, f2, f4));
        fgw fgwVar = new fgw(view, fgvVar.b, translationX, translationY);
        fgjVar.H(fgwVar);
        objectAnimatorOfPropertyValuesHolder.addListener(fgwVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static android.animation.Animator m(android.animation.Animator animator, android.animation.Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }

    public static java.util.ArrayList n(java.util.ArrayList arrayList, java.lang.Object obj) {
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }
}
