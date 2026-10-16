package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class jig implements jii {
    private final jkk a;

    public jig(jkk jkkVar) {
        this.a = jkkVar;
    }

    @Override // defpackage.jii
    public final jid a(Context context, int i) {
        context.getClass();
        return new jid(AnimationUtils.loadAnimation(context, i), null, 0);
    }

    @Override // defpackage.jii
    public final jid b(Context context, ProjectionWindowAnimationParams projectionWindowAnimationParams, int i, int i2) throws Resources.NotFoundException {
        context.getClass();
        projectionWindowAnimationParams.getClass();
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, projectionWindowAnimationParams.a);
        animationLoadAnimation.initialize(i, i2, i, i2);
        return new jid(animationLoadAnimation, projectionWindowAnimationParams.c, projectionWindowAnimationParams.d);
    }

    @Override // defpackage.jii
    public final void c(ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        projectionWindowAnimationChoreography.getClass();
    }

    @Override // defpackage.jii
    public final void f(PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("ScvhWindowAnimationController");
    }

    @Override // defpackage.jii
    public final void g(jhc jhcVar) {
        jhcVar.getClass();
    }

    @Override // defpackage.jii
    public final void i(jhf jhfVar, jid jidVar, boolean z) {
        jidVar.getClass();
        x(jhfVar, jidVar, z);
    }

    @Override // defpackage.jii
    public final void j(jhf jhfVar, jid jidVar) {
        jidVar.getClass();
        o(jhfVar, jidVar);
    }

    @Override // defpackage.jii
    public final void k(jhf jhfVar, jid jidVar, boolean z) {
        x(jhfVar, jidVar, z);
    }

    @Override // defpackage.jii
    public final void l(jhf jhfVar, jid jidVar) {
        o(jhfVar, jidVar);
    }

    @Override // defpackage.jii
    public final void m(Context context, int i) {
        context.getClass();
    }

    @Override // defpackage.jii
    public final void o(jhf jhfVar, jid jidVar) {
        jhfVar.ao();
        this.a.T();
    }

    @Override // defpackage.jii
    public final boolean q(jhf jhfVar) {
        jhfVar.getClass();
        return false;
    }

    @Override // defpackage.jii
    public final boolean r(jhf jhfVar) {
        jhfVar.getClass();
        return false;
    }

    @Override // defpackage.jii
    public final boolean s(jhf jhfVar) {
        jhfVar.getClass();
        return false;
    }

    @Override // defpackage.jii
    public final boolean t(jhf jhfVar) {
        return false;
    }

    @Override // defpackage.jii
    public final boolean u() {
        return false;
    }

    @Override // defpackage.jii
    public final boolean v(jhf jhfVar) {
        return true;
    }

    @Override // defpackage.jii
    public final boolean w(jhf jhfVar) {
        jhfVar.getClass();
        return true;
    }

    @Override // defpackage.jii
    public final boolean x(jhf jhfVar, jid jidVar, boolean z) {
        if (z) {
            ((ina) this.a).u(jhfVar);
        }
        jhfVar.L();
        return false;
    }

    @Override // defpackage.jii
    public final void h() {
    }

    @Override // defpackage.jii
    public final void p() {
    }

    @Override // defpackage.jii
    public final void d(jhf jhfVar) {
    }

    @Override // defpackage.jii
    public final void e(jhf jhfVar) {
    }

    @Override // defpackage.jii
    public final void n(int i, int i2) {
    }
}
