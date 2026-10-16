package com.waze.main_screen.g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f26393a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f26394b;

    g(q qVar, int i2) {
        this.f26394b = i2;
        Objects.requireNonNull(qVar);
        this.f26393a = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f2;
        int i2 = this.f26394b;
        if (i2 == 0) {
            h.f((h) this.f26393a);
            return;
        }
        if (i2 != 1) {
            FrameLayout frameLayout = this.f26393a;
            if (i2 != 2) {
                q qVar = (q) frameLayout;
                qVar.f26433h = false;
                Runnable runnable = qVar.f26434i;
                qVar.removeCallbacks(runnable);
                qVar.postDelayed(runnable, 20L);
                return;
            }
            q qVar2 = (q) frameLayout;
            if (qVar2.f26432g) {
                float fM = qVar2.m(15);
                if (qVar2.p < (-r0)) {
                    qVar2.n(com.waze.map.f.e.f28905c);
                    f2 = qVar2.p + fM;
                } else {
                    f2 = 0.0f;
                }
                if (qVar2.p > fM) {
                    qVar2.n(com.waze.map.f.e.f28904b);
                    f2 = qVar2.p - fM;
                }
                qVar2.r.c(f2 / 6.0f);
                qVar2.q = true;
                qVar2.postDelayed(this, 20L);
                return;
            }
            return;
        }
        q qVar3 = (q) this.f26393a;
        View view = qVar3.f26427b;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        View view2 = qVar3.f26428c;
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        int i3 = qVar3.n + qVar3.o;
        long jCurrentTimeMillis = System.currentTimeMillis() - qVar3.f26426a;
        boolean z = qVar3.f26432g || qVar3.f26433h;
        float f3 = jCurrentTimeMillis / 300.0f;
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        int iRound = Math.round((z ? qVar3.m.getInterpolation(f3) : 1.0f - qVar3.m.getInterpolation(f3)) * (i3 - qVar3.n)) + qVar3.n;
        if (iRound >= i3 && z) {
            qVar3.n(com.waze.map.f.e.f28903a);
        } else if (layoutParams.height > qVar3.n || z) {
            qVar3.postDelayed(this, 20L);
            i3 = iRound;
        } else {
            qVar3.f26435k = null;
            i3 = qVar3.n;
        }
        layoutParams.height = i3;
        layoutParams2.height = i3;
        view.setLayoutParams(layoutParams);
        view2.setLayoutParams(layoutParams2);
    }

    public /* synthetic */ g(h hVar, int i2) {
        this.f26394b = i2;
        this.f26393a = hVar;
    }

    g(q qVar, int i2, byte[] bArr) {
        this.f26394b = i2;
        Objects.requireNonNull(qVar);
        this.f26393a = qVar;
    }

    g(q qVar, int i2, char[] cArr) {
        this.f26394b = i2;
        Objects.requireNonNull(qVar);
        this.f26393a = qVar;
    }
}
