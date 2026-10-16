package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.EnumSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class tve {
    public final tpf a = new tpf();
    public float b;
    public float c;

    public tve(MotionEvent motionEvent, VelocityTracker velocityTracker, EnumSet enumSet, boolean z) {
        velocityTracker.computeCurrentVelocity(1);
        int pointerCount = motionEvent.getPointerCount();
        tpf[] tpfVarArr = new tpf[pointerCount];
        int pointerCount2 = motionEvent.getPointerCount();
        tpf[] tpfVarArr2 = new tpf[pointerCount2];
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            tpfVarArr2[i] = new tpf(motionEvent.getX(i), motionEvent.getY(i));
            tpf tpfVar = new tpf(velocityTracker.getXVelocity(pointerId), velocityTracker.getYVelocity(pointerId));
            tpfVarArr[i] = tpfVar;
            tpf tpfVar2 = this.a;
            tpf.g(tpfVar2, tpfVar, tpfVar2);
        }
        tpf tpfVar3 = this.a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        tpf.i(tpfVar3, 1000.0f, tpfVar3);
        tpf tpfVar4 = this.a;
        tpf.h(tpfVar4, pointerCount, tpfVar4);
        tpf tpfVar5 = tpfVarArr2[0];
        float f = tpfVar5.b;
        float f2 = tpfVar5.c;
        int i2 = pointerCount2 - 1;
        tpf tpfVar6 = tpfVarArr2[i2];
        float f3 = tpfVar6.b;
        float f4 = tpfVar6.c;
        tpf tpfVar7 = tpfVarArr[0];
        float f5 = tpfVar7.b + f;
        float f6 = tpfVar7.c + f2;
        tpf tpfVar8 = tpfVarArr[i2];
        float f7 = tpfVar8.b + f3;
        float f8 = tpfVar8.c + f4;
        tpf tpfVar9 = new tpf();
        tpf.p(tpfVar6, tpfVar5, tpfVar9);
        tpf tpfVar10 = new tpf();
        tpf.p(new tpf(f7, f8), new tpf(f5, f6), tpfVar10);
        float fC = tpfVar9.c();
        float fA = uzg.a(fC == BitmapDescriptorFactory.HUE_RED ? 1.0f : tpfVar10.c() / fC);
        this.b = fA;
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        this.b = fA * 1000.0f;
        float degrees = (float) Math.toDegrees(a.I(tuw.a(f, f2, f3, f4), tuw.a(f5, f6, f7, f8)));
        this.c = degrees;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        this.c = degrees * 1000.0f;
        if (!enumSet.contains(tvb.a)) {
            this.a.n(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        if (!enumSet.contains(tvb.b)) {
            this.b = BitmapDescriptorFactory.HUE_RED;
        }
        if (enumSet.contains(tvb.c)) {
            return;
        }
        this.c = BitmapDescriptorFactory.HUE_RED;
    }
}
