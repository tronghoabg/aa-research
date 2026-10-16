package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class jik {
    public final android.view.animation.Animation a;
    public final com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography b;
    public final int c;

    public jik(android.view.animation.Animation animation, com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography, int i) {
        this.a = animation;
        this.b = projectionWindowAnimationChoreography;
        this.c = i;
    }

    public boolean a() {
        return false;
    }

    public java.lang.String toString() {
        com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = this.b;
        return "ProjectionWindowAnimation{animation=" + java.lang.String.valueOf(this.a) + ", choreography=" + java.lang.String.valueOf(projectionWindowAnimationChoreography) + ", delay=" + this.c + "}";
    }
}
