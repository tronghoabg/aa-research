package defpackage;

import android.view.animation.Animation;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;

/* loaded from: classes.dex */
public class jid {
    public final Animation a;
    public final ProjectionWindowAnimationChoreography b;
    public final int c;

    public jid(Animation animation, ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography, int i) {
        this.a = animation;
        this.b = projectionWindowAnimationChoreography;
        this.c = i;
    }

    public boolean a() {
        return false;
    }

    public String toString() {
        ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography = this.b;
        return "ProjectionWindowAnimation{animation=" + String.valueOf(this.a) + ", choreography=" + String.valueOf(projectionWindowAnimationChoreography) + ", delay=" + this.c + "}";
    }
}
