package androidx.dynamicanimation.animation;

import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class DynamicAnimationKt {
    private static final FloatValueHolder createFloatValueHolder(final l<? super Float, ab> lVar, final a<Float> aVar) {
        return new FloatValueHolder() { // from class: androidx.dynamicanimation.animation.DynamicAnimationKt.createFloatValueHolder.1
            @Override // androidx.dynamicanimation.animation.FloatValueHolder
            public float getValue() {
                return aVar.invoke().floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatValueHolder
            public void setValue(float f2) {
                lVar.invoke(Float.valueOf(f2));
            }
        };
    }

    public static final FlingAnimation flingAnimationOf(l<? super Float, ab> lVar, a<Float> aVar) {
        x.f(lVar, "setter");
        x.f(aVar, "getter");
        return new FlingAnimation(createFloatValueHolder(lVar, aVar));
    }

    public static final SpringAnimation springAnimationOf(l<? super Float, ab> lVar, a<Float> aVar, float f2) {
        x.f(lVar, "setter");
        x.f(aVar, "getter");
        FloatValueHolder floatValueHolderCreateFloatValueHolder = createFloatValueHolder(lVar, aVar);
        return Float.isNaN(f2) ? new SpringAnimation(floatValueHolderCreateFloatValueHolder) : new SpringAnimation(floatValueHolderCreateFloatValueHolder, f2);
    }

    public static /* synthetic */ SpringAnimation springAnimationOf$default(l lVar, a aVar, float f2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        }
        return springAnimationOf(lVar, aVar, f2);
    }

    public static final SpringAnimation withSpringForceProperties(SpringAnimation springAnimation, l<? super SpringForce, ab> lVar) {
        x.f(springAnimation, "<this>");
        x.f(lVar, "func");
        if (springAnimation.getSpring() == null) {
            springAnimation.setSpring(new SpringForce());
        }
        SpringForce spring = springAnimation.getSpring();
        x.e(spring, "getSpring(...)");
        lVar.invoke(spring);
        return springAnimation;
    }
}
