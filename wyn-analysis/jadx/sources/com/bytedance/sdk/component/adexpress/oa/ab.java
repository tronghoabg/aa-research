package com.bytedance.sdk.component.adexpress.oa;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.oa.zjm;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ab implements zjm {
    private AtomicBoolean ivm = new AtomicBoolean(false);
    private ScheduledFuture<?> lw;
    private cq moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.lw.uef f24926oa;
    private Context uef;
    private bcc yo;

    public class uef implements Runnable {
        zjm.uef uef;
        private int yo;

        public uef(int i5, zjm.uef uefVar) {
            this.yo = i5;
            this.uef = uefVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.yo == 1) {
                ab.this.f24926oa.uef(true);
                ab.this.uef(this.uef, 107, null);
            }
        }
    }

    public ab(Context context, cq cqVar, com.bytedance.sdk.component.adexpress.lw.uef uefVar, bcc bccVar) {
        this.uef = context;
        this.moa = cqVar;
        this.yo = bccVar;
        this.f24926oa = uefVar;
        uefVar.uef(this.yo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo() {
        try {
            ScheduledFuture<?> scheduledFuture = this.lw;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                return;
            }
            this.lw.cancel(false);
            this.lw = null;
        } catch (Throwable unused) {
        }
    }

    public com.bytedance.sdk.component.adexpress.lw.uef oa() {
        return this.f24926oa;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm
    public boolean uef(final zjm.uef uefVar) {
        int iIvm = this.moa.ivm();
        if (iIvm < 0) {
            uef(uefVar, 107, "time is ".concat(String.valueOf(iIvm)));
        } else {
            this.lw = com.bytedance.sdk.component.adexpress.moa.moa.uef(new uef(1, uefVar), iIvm, TimeUnit.MILLISECONDS);
            this.f24926oa.uef(new xs() { // from class: com.bytedance.sdk.component.adexpress.oa.ab.1
                @Override // com.bytedance.sdk.component.adexpress.oa.xs
                public void uef(View view, dz dzVar) {
                    wk wkVarOa;
                    ab.this.yo();
                    if (uefVar.yo() || (wkVarOa = uefVar.oa()) == null) {
                        return;
                    }
                    wkVarOa.uef(ab.this.f24926oa, dzVar);
                    uefVar.uef(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.oa.xs
                public void uef(int i5, String str) {
                    ab.this.uef(uefVar, i5, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.oa.zjm
    public void uef() {
        this.f24926oa.xs();
        yo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(zjm.uef uefVar, int i5, String str) {
        wk wkVarOa;
        if (uefVar.yo() || this.ivm.get()) {
            return;
        }
        yo();
        this.moa.lw().uef(i5, str);
        if (uefVar.oa(this)) {
            uefVar.uef(this);
        } else {
            if (uefVar.yo() || (wkVarOa = uefVar.oa()) == null) {
                return;
            }
            uefVar.uef(true);
            wkVarOa.a_(i5);
        }
        this.ivm.getAndSet(true);
    }
}
