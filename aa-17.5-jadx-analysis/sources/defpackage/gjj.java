package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class gjj extends cfx implements chu {
    public afec a;
    public boolean b;
    public long c = -1;
    private final afec d = new fzl(this, 16);

    public gjj(afec afecVar) {
        this.a = afecVar;
    }

    @Override // defpackage.cfx
    public final void er() {
        aezr aezrVar = gjf.a;
        gjf gjfVarH = fxi.h();
        afec afecVar = this.d;
        afecVar.getClass();
        gjfVarH.b.add(afecVar);
    }

    @Override // defpackage.chu
    public final void eu(cis cisVar) {
        if (this.b && !cisVar.b()) {
            long j = this.c;
            if (j >= 0) {
                afec afecVar = this.d;
                MotionEvent motionEventObtain = MotionEvent.obtain(j, SystemClock.elapsedRealtime(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                motionEventObtain.setSource(1048584);
                motionEventObtain.getClass();
                afecVar.invoke(motionEventObtain);
            }
        }
        this.b = cisVar.b();
    }

    @Override // defpackage.cfx
    public final void q() {
        aezr aezrVar = gjf.a;
        gjf gjfVarH = fxi.h();
        afec afecVar = this.d;
        afecVar.getClass();
        gjfVarH.b.remove(afecVar);
    }
}
