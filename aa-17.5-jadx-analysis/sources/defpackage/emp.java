package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$DurationScaleChangeListener;
import android.os.Build;
import android.util.AndroidRuntimeException;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class emp extends emm {
    public emq s;
    private float t;
    private boolean u;

    public emp(Object obj, emn emnVar, float f) {
        super(obj, emnVar);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
        this.s = new emq(f);
    }

    @Override // defpackage.emm
    public final void b() {
        if (!ely.a().b()) {
            throw new AndroidRuntimeException("Animations may only be canceled from the same thread as the animation handler");
        }
        if (this.n) {
            super.c(true);
        }
        float f = this.t;
        if (f != Float.MAX_VALUE) {
            emq emqVar = this.s;
            if (emqVar == null) {
                this.s = new emq(f);
            } else {
                emqVar.d(f);
            }
            this.t = Float.MAX_VALUE;
        }
    }

    @Override // defpackage.emm
    public final void e() {
        emq emqVar = this.s;
        if (emqVar == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dA = emqVar.a();
        if (dA > this.o) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dA < this.p) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.q * 0.75f);
        emqVar.c = dAbs;
        emqVar.d = dAbs * 62.5d;
        if (!ely.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.n;
        if (z || z) {
            return;
        }
        this.n = true;
        if (!this.k) {
            this.j = this.m.a(this.l);
        }
        float f = this.j;
        if (f > this.o || f < this.p) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ely elyVarA = ely.a();
        ArrayList arrayList = elyVarA.b;
        if (arrayList.size() == 0) {
            elyVarA.g.i(elyVarA.c);
            if (Build.VERSION.SDK_INT >= 33) {
                elyVarA.e = ValueAnimator.getDurationScale();
                if (elyVarA.f == null) {
                    elyVarA.f = new elx(elyVarA);
                }
                final elx elxVar = elyVarA.f;
                if (elxVar.a == null) {
                    elxVar.a = new ValueAnimator$DurationScaleChangeListener() { // from class: elw
                        public final void onChanged(float f2) {
                            elxVar.b.e = f2;
                        }
                    };
                    ValueAnimator.registerDurationScaleChangeListener(elxVar.a);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    @Override // defpackage.emm
    public final boolean f(long j) {
        float f;
        boolean z = this.u;
        float f2 = this.t;
        if (z) {
            if (f2 != Float.MAX_VALUE) {
                this.s.d(f2);
                this.t = Float.MAX_VALUE;
            }
            this.j = this.s.a();
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.u = false;
            return true;
        }
        emq emqVar = this.s;
        if (f2 != Float.MAX_VALUE) {
            long j2 = j / 2;
            emi emiVarB = emqVar.b(this.j, this.i, j2);
            this.s.d(this.t);
            this.t = Float.MAX_VALUE;
            emi emiVarB2 = this.s.b(emiVarB.a, emiVarB.b, j2);
            f = emiVarB2.a;
            this.j = f;
            this.i = emiVarB2.b;
        } else {
            emi emiVarB3 = emqVar.b(this.j, this.i, j);
            f = emiVarB3.a;
            this.j = f;
            this.i = emiVarB3.b;
        }
        float fMax = Math.max(f, this.p);
        this.j = fMax;
        this.j = Math.min(fMax, this.o);
        float f3 = this.i;
        emq emqVar2 = this.s;
        if (Math.abs(f3) >= emqVar2.d || Math.abs(r1 - emqVar2.a()) >= emqVar2.c) {
            return false;
        }
        this.j = this.s.a();
        this.i = BitmapDescriptorFactory.HUE_RED;
        return true;
    }

    public final void k(float f) {
        if (this.n) {
            this.t = f;
            return;
        }
        emq emqVar = this.s;
        if (emqVar == null) {
            emqVar = new emq(f);
            this.s = emqVar;
        }
        emqVar.d(f);
        e();
    }

    public final void l() {
        if (!m()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (!ely.a().b()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.n) {
            this.u = true;
        }
    }

    public final boolean m() {
        return this.s.b > 0.0d;
    }

    public emp(Object obj, emn emnVar) {
        super(obj, emnVar);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }

    public emp(emo emoVar) {
        super(emoVar);
        this.s = null;
        this.t = Float.MAX_VALUE;
        this.u = false;
    }
}
