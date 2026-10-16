package com.bytedance.sdk.component.lw.oa.yo;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.lw.bs;
import com.bytedance.sdk.component.lw.cq;
import com.bytedance.sdk.component.lw.dhk;
import com.bytedance.sdk.component.lw.sy;
import com.bytedance.sdk.component.lw.tpx;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class ivm {
    private ExecutorService bcc;
    private Context cz;
    private com.bytedance.sdk.component.lw.moa ivm;
    private volatile sy moa;

    /* renamed from: oa, reason: collision with root package name */
    private final cq f25024oa;
    private ExecutorService xs;
    private volatile bs yo;
    private Map<String, List<yo>> uef = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.lw.yo> lw = new ConcurrentHashMap();

    public ivm(Context context, cq cqVar) {
        this.f25024oa = (cq) xs.uef(cqVar);
        this.cz = context;
        com.bytedance.sdk.component.lw.oa.yo.uef.oa.uef(context, cqVar.lw());
    }

    private ExecutorService dj() {
        ExecutorService executorServiceUef = this.f25024oa.uef();
        return executorServiceUef != null ? executorServiceUef : com.bytedance.sdk.component.lw.oa.uef.oa.uef();
    }

    private com.bytedance.sdk.component.lw.moa zjm() {
        com.bytedance.sdk.component.lw.moa moaVarYo = this.f25024oa.yo();
        return moaVarYo == null ? new com.bytedance.sdk.component.lw.uef.uef() : moaVarYo;
    }

    public ExecutorService bcc() {
        ExecutorService executorServiceOa;
        dhk dhkVarOa = this.f25024oa.oa();
        if (dhkVarOa != null && (executorServiceOa = dhkVarOa.oa()) != null) {
            return executorServiceOa;
        }
        if (this.bcc == null) {
            this.bcc = com.bytedance.sdk.component.lw.oa.uef.oa.uef();
        }
        return this.bcc;
    }

    public Map<String, List<yo>> cz() {
        return this.uef;
    }

    public ExecutorService ivm() {
        ExecutorService executorServiceUef;
        dhk dhkVarOa = this.f25024oa.oa();
        if (dhkVarOa != null && (executorServiceUef = dhkVarOa.uef()) != null) {
            return executorServiceUef;
        }
        if (this.xs == null) {
            this.xs = dj();
        }
        return this.xs;
    }

    public com.bytedance.sdk.component.lw.moa lw() {
        if (this.ivm == null) {
            this.ivm = zjm();
        }
        return this.ivm;
    }

    public Collection<com.bytedance.sdk.component.lw.yo> moa() {
        return this.lw.values();
    }

    public boolean oa() {
        return this.f25024oa.xs();
    }

    public Context uef() {
        return this.cz;
    }

    public tpx xs() {
        cq cqVar = this.f25024oa;
        if (cqVar != null) {
            return cqVar.ivm();
        }
        return null;
    }

    public sy yo() {
        return this.moa;
    }

    private com.bytedance.sdk.component.lw.yo moa(com.bytedance.sdk.component.lw.oa oaVar) {
        com.bytedance.sdk.component.lw.yo yoVarMoa = this.f25024oa.moa();
        return yoVarMoa != null ? yoVarMoa : new com.bytedance.sdk.component.lw.oa.yo.uef.uef.oa(oaVar.bcc(), oaVar.uef());
    }

    public sy oa(com.bytedance.sdk.component.lw.oa oaVar) {
        if (oaVar == null) {
            oaVar = com.bytedance.sdk.component.lw.oa.yo.uef.oa.cz();
        }
        if (this.moa == null) {
            synchronized (com.bytedance.sdk.component.lw.oa.yo.uef.oa.oa.class) {
                try {
                    if (this.moa == null) {
                        this.moa = new com.bytedance.sdk.component.lw.oa.yo.uef.oa.oa(oaVar.oa(), oaVar.moa());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.moa;
    }

    public bs uef(com.bytedance.sdk.component.lw.oa oaVar) {
        if (oaVar == null) {
            oaVar = com.bytedance.sdk.component.lw.oa.yo.uef.oa.cz();
        }
        if (this.yo == null) {
            synchronized (com.bytedance.sdk.component.lw.oa.yo.uef.oa.yo.class) {
                try {
                    if (this.yo == null) {
                        this.yo = new com.bytedance.sdk.component.lw.oa.yo.uef.oa.yo(new com.bytedance.sdk.component.lw.oa.yo.uef.oa.uef(oaVar.oa(), oaVar.yo()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.yo;
    }

    public com.bytedance.sdk.component.lw.yo yo(com.bytedance.sdk.component.lw.oa oaVar) {
        if (oaVar == null) {
            oaVar = com.bytedance.sdk.component.lw.oa.yo.uef.oa.cz();
        }
        String string = oaVar.bcc().toString();
        com.bytedance.sdk.component.lw.yo yoVar = this.lw.get(string);
        if (yoVar != null) {
            return yoVar;
        }
        com.bytedance.sdk.component.lw.yo yoVarMoa = moa(oaVar);
        this.lw.put(string, yoVarMoa);
        return yoVarMoa;
    }

    public com.bytedance.sdk.component.lw.yo uef(String str) {
        return yo(com.bytedance.sdk.component.lw.oa.yo.uef.oa.uef(new File(str)));
    }

    public com.bytedance.sdk.component.lw.oa.yo.oa.oa uef(yo yoVar) {
        ImageView.ScaleType scaleTypeCz = yoVar.cz();
        if (scaleTypeCz == null) {
            scaleTypeCz = com.bytedance.sdk.component.lw.oa.yo.oa.oa.uef;
        }
        ImageView.ScaleType scaleType = scaleTypeCz;
        Bitmap.Config configZjm = yoVar.zjm();
        if (configZjm == null) {
            configZjm = com.bytedance.sdk.component.lw.oa.yo.oa.oa.f25028oa;
        }
        return new com.bytedance.sdk.component.lw.oa.yo.oa.oa(yoVar.oa(), yoVar.yo(), scaleType, configZjm, yoVar.moa(), yoVar.lw());
    }
}
