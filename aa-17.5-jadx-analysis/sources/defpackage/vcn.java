package defpackage;

import android.animation.TimeAnimator;
import android.util.SparseArray;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class vcn implements TimeAnimator.TimeListener {
    public final TimeAnimator a;
    public vcm b;
    private final vcr c;
    private final ArrayDeque d = new ArrayDeque();
    private long e;
    private long f;
    private vcl g;
    private final SparseArray h;
    private boolean i;

    public vcn(vcr vcrVar, TimeAnimator timeAnimator, vcm vcmVar) {
        vcl vclVar = vcl.c;
        this.g = vclVar;
        this.h = new SparseArray();
        this.c = vcrVar;
        this.a = timeAnimator;
        this.b = vcmVar;
        this.g = vclVar;
        timeAnimator.setTimeListener(this);
    }

    @Override // android.animation.TimeAnimator.TimeListener
    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        if (this.i) {
            this.i = false;
            vcl vclVar = (vcl) this.d.pollFirst();
            vcl vclVar2 = this.g;
            vcr vcrVar = this.c;
            vclVar2.b(vcrVar);
            if (vclVar == null) {
                this.a.end();
            } else {
                this.g = vclVar;
                vclVar.a(vcrVar);
                this.f = this.e;
            }
            vcm vcmVar = this.b;
            if (vcmVar != null) {
                vcmVar.a();
            }
        }
        TimeAnimator timeAnimator2 = this.a;
        if (timeAnimator2.isStarted()) {
            this.e = j;
            vbf vbfVar = (vbf) this.h.get(0);
            if (vbfVar != null) {
                vbfVar.a();
                vcr vcrVar2 = this.c;
                for (int i = 0; i < 4 && i < vcrVar2.a.size(); i++) {
                    if (i == 0) {
                        vcq vcqVar = vcrVar2.b;
                    } else if (i == 1) {
                        vcq vcqVar2 = vcrVar2.c;
                    } else if (i != 2) {
                        boolean z = vcrVar2.i;
                        vcq vcqVar3 = vcrVar2.e;
                    } else {
                        vcq vcqVar4 = vcrVar2.d;
                    }
                }
            }
            boolean zC = this.g.c(this.f, this.e, this.c);
            vcm vcmVar2 = this.b;
            if (vcmVar2 != null) {
                vcmVar2.a();
            }
            if (zC) {
                return;
            }
            this.i = true;
            if (timeAnimator2.isStarted()) {
                return;
            }
            this.e = 0L;
            timeAnimator2.start();
        }
    }
}
