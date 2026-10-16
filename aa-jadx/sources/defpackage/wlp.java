package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wlp {
    private final defpackage.aba a = new defpackage.aba(0);
    private final defpackage.aba b = new defpackage.aba(0);

    public static defpackage.wlp a(android.content.Context context, android.content.res.TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            try {
                android.animation.Animator animatorLoadAnimator = android.animation.AnimatorInflater.loadAnimator(context, resourceId);
                if (animatorLoadAnimator instanceof android.animation.AnimatorSet) {
                    return c(((android.animation.AnimatorSet) animatorLoadAnimator).getChildAnimations());
                }
                if (animatorLoadAnimator == null) {
                    return null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(animatorLoadAnimator);
                return c(arrayList);
            } catch (java.lang.Exception e) {
                android.util.Log.w("MotionSpec", "Can't load animation resource ID #0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(resourceId))), e);
            }
        }
        return null;
    }

    private static defpackage.wlp c(java.util.List list) {
        defpackage.wlp wlpVar = new defpackage.wlp();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            android.animation.Animator animator = (android.animation.Animator) list.get(i);
            if (!(animator instanceof android.animation.ObjectAnimator)) {
                throw new java.lang.IllegalArgumentException("Animator must be an ObjectAnimator: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(animator))));
            }
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
            wlpVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            java.lang.String propertyName = objectAnimator.getPropertyName();
            defpackage.wlq wlqVar = new defpackage.wlq(objectAnimator.getStartDelay(), objectAnimator.getDuration(), objectAnimator.getInterpolator());
            wlqVar.a = objectAnimator.getRepeatCount();
            wlqVar.b = objectAnimator.getRepeatMode();
            wlpVar.a.put(propertyName, wlqVar);
        }
        return wlpVar;
    }

    public final defpackage.wlq b(java.lang.String str) {
        defpackage.aba abaVar = this.a;
        if (abaVar.get(str) != null) {
            return (defpackage.wlq) abaVar.get(str);
        }
        throw new java.lang.IllegalArgumentException();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wlp) {
            return this.a.equals(((defpackage.wlp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "\n" + getClass().getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
