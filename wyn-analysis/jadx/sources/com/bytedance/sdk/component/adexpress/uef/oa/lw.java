package com.bytedance.sdk.component.adexpress.uef.oa;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.uef.yo.uef;
import com.bytedance.sdk.component.utils.tpx;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class lw extends yo {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile lw f24943oa;
    private static File uef;
    private AtomicBoolean yo = new AtomicBoolean(true);
    private AtomicBoolean moa = new AtomicBoolean(false);
    private boolean lw = false;
    private AtomicBoolean ivm = new AtomicBoolean(false);
    private AtomicInteger xs = new AtomicInteger(0);
    private AtomicLong bcc = new AtomicLong();

    private lw() {
        cz();
    }

    public static File bcc() {
        if (uef == null) {
            try {
                File fileUef = moa.uef();
                Context contextOa = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().oa();
                File file = new File(contextOa != null ? com.bytedance.sdk.component.utils.xs.uef(contextOa, "tt_tmpl_pkg") : new File(fileUef, "tt_tmpl_pkg"), "template");
                file.mkdirs();
                uef = file;
            } catch (Throwable unused) {
            }
        }
        return uef;
    }

    private void cz() {
        com.bytedance.sdk.component.adexpress.moa.moa.oa(new com.bytedance.sdk.component.bcc.oa.yo("init") { // from class: com.bytedance.sdk.component.adexpress.uef.oa.lw.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                bcc.uef();
                lw.this.yo.set(false);
                lw.this.moa();
                lw.this.xs();
                if (com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo() == null || !tpx.uef(com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().oa()) || com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().moa();
            }
        }, 10);
    }

    public static lw oa() {
        if (f24943oa == null) {
            synchronized (lw.class) {
                try {
                    if (f24943oa == null) {
                        f24943oa = new lw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24943oa;
    }

    private void zjm() {
        if (this.xs.getAndSet(0) <= 0 || System.currentTimeMillis() - this.bcc.get() <= TTAdConstant.AD_MAX_EVENT_TIME) {
            return;
        }
        xs();
    }

    public com.bytedance.sdk.component.adexpress.uef.yo.uef ivm() {
        return bcc.oa();
    }

    public boolean lw() {
        return this.lw;
    }

    public void moa() {
        com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarOa = bcc.oa();
        if (uefVarOa == null || !uefVarOa.bcc()) {
            return;
        }
        boolean zUef = uef(uefVarOa);
        if (!zUef) {
            bcc.moa();
        }
        this.lw = zUef;
    }

    public void xs() {
        uef(false);
    }

    public void yo() {
        cz();
    }

    public boolean uef(com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar) {
        if (uefVar == null) {
            return false;
        }
        return uef(uefVar.uef()) || uef(uefVar.lw()) || uef(uefVar.ivm());
    }

    @Override // com.bytedance.sdk.component.adexpress.uef.oa.yo
    public File uef() {
        return bcc();
    }

    public void uef(boolean z2) {
        List<uef.C0057uef> listUef;
        boolean z10;
        if (this.yo.get()) {
            return;
        }
        try {
            if (this.moa.get()) {
                if (z2) {
                    this.xs.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z11 = true;
            this.moa.set(true);
            com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarLw = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().lw();
            com.bytedance.sdk.component.adexpress.uef.yo.uef uefVarOa = bcc.oa();
            if (uefVarLw != null && uefVarLw.bcc()) {
                if (!bcc.oa(uefVarLw)) {
                    this.moa.set(false);
                    this.bcc.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo() != null) {
                    com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().yo().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.uef.oa.lw.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.lw.lw.uef().oa();
                        }
                    });
                }
                bcc.uef(uefVarLw);
                boolean zUef = (uefVarLw.lw() == null || TextUtils.isEmpty(uefVarLw.lw().uef())) ? false : uef(uefVarLw.lw().uef());
                if (uefVarLw.uef().size() != 0) {
                    listUef = uef(uefVarLw, uefVarOa);
                    z10 = listUef != null;
                } else {
                    listUef = null;
                    z10 = zUef;
                }
                if (!zUef) {
                    List<uef.C0057uef> listOa = oa(uefVarLw, uefVarOa);
                    if (listUef == null || listOa == null) {
                        listUef = listOa;
                    } else {
                        listUef.addAll(listOa);
                    }
                    if (listOa == null) {
                        z11 = false;
                    }
                    if (listOa == null) {
                        this.moa.set(false);
                    }
                    z10 = z11;
                }
                if (z10 && uef(uefVarLw)) {
                    bcc.uef(uefVarLw);
                    bcc.yo();
                    oa(listUef);
                }
                moa();
                this.moa.set(false);
                this.bcc.set(System.currentTimeMillis());
                zjm();
                return;
            }
            this.moa.set(false);
            uef(109);
        } catch (Throwable unused) {
        }
    }
}
