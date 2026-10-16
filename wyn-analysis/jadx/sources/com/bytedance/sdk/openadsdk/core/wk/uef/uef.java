package com.bytedance.sdk.openadsdk.core.wk.uef;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.shadow.okio.Segment;
import com.bykv.vk.openvk.uef.uef.uef.ivm.moa;
import com.bykv.vk.openvk.uef.uef.uef.moa.yo;
import com.bytedance.sdk.component.utils.ue;
import com.bytedance.sdk.openadsdk.core.dz.ivm;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.sy;
import com.bytedance.sdk.openadsdk.core.widget.dhk;
import com.bytedance.sdk.openadsdk.core.wk.oa.lw;
import com.bytedance.sdk.openadsdk.moa.lw.oa.wk;
import com.bytedance.sdk.openadsdk.moa.xs;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public abstract class uef implements yo, ue.uef, com.bytedance.sdk.openadsdk.core.wk.oa.uef {

    /* renamed from: ab, reason: collision with root package name */
    protected boolean f25805ab;
    protected final gzw bcc;
    protected boolean cp;
    protected final Context dj;
    protected long dxx;
    protected WeakReference<yo.oa> gr;
    protected boolean gsd;
    protected oa gzw;
    protected com.bytedance.sdk.openadsdk.core.wk.moa.yo ivm;
    protected long ku;
    protected SurfaceTexture lw;
    protected SurfaceHolder moa;
    private long oyt;
    protected ivm pz;
    protected final ViewGroup rt;
    protected boolean tpx;

    /* renamed from: ue, reason: collision with root package name */
    protected yo.uef f25807ue;
    protected lw xs;
    protected String uef = "TTAD.VideoController";

    /* renamed from: oa, reason: collision with root package name */
    protected final int f25806oa = 100;
    protected final ue yo = new ue(Looper.getMainLooper(), this);
    protected long cz = 0;
    protected long zjm = 0;
    protected final List<Runnable> wrv = new ArrayList();
    protected boolean cq = false;
    protected boolean dz = false;
    protected boolean wk = true;
    protected boolean bs = false;
    protected boolean sy = false;
    protected boolean oib = false;
    protected AtomicBoolean dhk = new AtomicBoolean(false);
    protected boolean orq = true;
    protected boolean fz = false;
    protected Runnable lz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.uef.uef.1
        @Override // java.lang.Runnable
        public void run() {
            boolean z2 = uef.this.cq;
            uef.this.dhk();
        }
    };
    private long km = 0;
    private boolean pu = true;
    private int gb = 1;
    private final AtomicBoolean af = new AtomicBoolean(false);

    /* renamed from: com.bytedance.sdk.openadsdk.core.wk.uef.uef$4, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[dhk.uef.values().length];
            uef = iArr;
            try {
                iArr[dhk.uef.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[dhk.uef.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[dhk.uef.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public uef(Context context, gzw gzwVar, ViewGroup viewGroup) {
        this.bcc = gzwVar;
        this.dj = context;
        this.rt = viewGroup;
        this.uef += hashCode();
    }

    private boolean ab() {
        lw lwVar = this.xs;
        if (lwVar != null) {
            return lwVar.cq() instanceof moa;
        }
        return false;
    }

    private void oyt() {
        lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.moa(0);
            this.xs.uef(false, false);
            this.xs.yo(false);
            this.xs.lw();
            this.xs.xs();
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public final int bcc() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar == null) {
            return 0;
        }
        return yoVar.ab();
    }

    public long bs() {
        return this.ku;
    }

    public final void cp() {
        this.fz = true;
        wk.uef uefVar = new wk.uef();
        uefVar.oa(ivm());
        uefVar.moa(cz() / fz());
        uefVar.yo(xs());
        uefVar.uef(bs());
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(this.xs, uefVar);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean cq() {
        return this.dz;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public final long cz() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar == null) {
            return 0L;
        }
        return yoVar.bs();
    }

    public void dhk() {
        this.yo.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.uef.uef.2
            @Override // java.lang.Runnable
            public void run() {
                uef uefVar = uef.this;
                if (uefVar.ivm != null) {
                    boolean z2 = uefVar.cq;
                    uef.this.ivm.zjm();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public com.bykv.vk.openvk.uef.uef.uef.uef dj() {
        return this.ivm;
    }

    public final long dxx() {
        return xs() + ivm();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public final boolean dz() {
        return this.gsd;
    }

    public int fz() {
        return this.gb;
    }

    public final boolean gr() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        return yoVar == null || yoVar.oa();
    }

    public boolean gsd() {
        return this.f25805ab;
    }

    public boolean gzw() {
        return this.bs;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public long ivm() {
        return this.cz;
    }

    public final void ku() {
        this.fz = true;
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(this.bcc, this.xs, this.gzw);
    }

    public void lw(boolean z2) {
        this.orq = z2;
    }

    public final void lz() {
        com.bytedance.sdk.openadsdk.moa.uef.oa.uef(com.bytedance.sdk.openadsdk.gsd.uef.uef(this.bcc.efa(), true, this.bcc), 5, this.bcc.iou());
    }

    public void moa(long j8) {
        this.dxx = j8;
    }

    public void oa(long j8) {
        this.cz = j8;
        this.zjm = Math.max(this.zjm, j8);
    }

    public void oib() {
        if (this.wrv.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.wrv).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.wrv.clear();
    }

    public boolean orq() {
        return this.wk;
    }

    public final void pz() {
        this.fz = true;
        wk.uef uefVar = new wk.uef();
        uefVar.oa(ivm());
        uefVar.moa(cz() / fz());
        uefVar.yo(xs());
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.oa(wrv(), uefVar);
    }

    public boolean rt() {
        return this.pu;
    }

    public void sy() {
        if (this.ivm == null) {
            return;
        }
        if (ab()) {
            SurfaceTexture surfaceTexture = this.lw;
            if (surfaceTexture == null || surfaceTexture == this.ivm.dhk()) {
                return;
            }
            this.ivm.uef(this.lw);
            return;
        }
        SurfaceHolder surfaceHolder = this.moa;
        if (surfaceHolder == null || surfaceHolder == this.ivm.oib()) {
            return;
        }
        this.ivm.uef(this.moa);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    /* renamed from: tpx, reason: merged with bridge method [inline-methods] */
    public final lw wrv() {
        return this.xs;
    }

    public final boolean ue() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        return yoVar != null && yoVar.ivm();
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean wk() {
        return true;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public final long xs() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar == null) {
            return 0L;
        }
        return yoVar.wk();
    }

    public void yo(long j8) {
        this.km = j8;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public final int zjm() {
        return com.bykv.vk.openvk.uef.uef.oa.moa.uef.uef(this.zjm, this.dxx);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public final void lw(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view) {
        uef(oaVar, view, false);
    }

    public final void moa(boolean z2) {
        this.pu = z2;
    }

    public void uef(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view, boolean z2) {
    }

    public void yo(boolean z2) {
        this.oib = z2;
    }

    public final void lw(long j8) {
        this.cz = j8;
        this.zjm = Math.max(this.zjm, j8);
        lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.uef();
        }
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.uef(true, this.cz, this.f25805ab);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public final void moa(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view) {
        if (this.oib) {
            yo(false);
            lw lwVar = this.xs;
            if (lwVar != null) {
                lwVar.oa(this.rt);
            }
            uef(1);
            return;
        }
        uef(true, 3);
    }

    public void oa(Runnable runnable) {
        this.wrv.add(runnable);
    }

    public void uef(yo.moa moaVar) {
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public final void yo(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view) {
        lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.cz();
        }
        uef(true, 3);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public void oa(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, SurfaceHolder surfaceHolder) {
        this.cq = false;
        this.moa = null;
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.uef(false);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        return false;
    }

    public void uef(Runnable runnable) {
        if (this.xs.orq() && this.cq) {
            runnable.run();
        } else {
            oa(runnable);
        }
    }

    private boolean yo(int i5) {
        return this.xs.oa(i5);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public void oa(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, SurfaceTexture surfaceTexture) {
        this.cq = false;
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.uef(false);
        }
        this.lw = null;
        oib();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public void uef(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, SurfaceHolder surfaceHolder) {
        this.cq = true;
        this.moa = surfaceHolder;
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar == null) {
            return;
        }
        yoVar.uef(surfaceHolder);
        oib();
    }

    public final void oa(boolean z2) {
        this.dz = z2;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public void uef(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, SurfaceTexture surfaceTexture) {
        this.cq = true;
        this.lw = surfaceTexture;
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.uef(surfaceTexture);
            this.ivm.uef(this.cq);
        }
        oib();
    }

    public void oa(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        oa oaVar = (oa) yoVar;
        this.gzw = oaVar;
        this.f25805ab = oaVar.dj();
        yoVar.moa(String.valueOf(this.bcc.jnk()));
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public final void oa(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view) {
        oa(oaVar, view, false, false);
    }

    public final void oa(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view, boolean z2, boolean z10) {
        yo(!this.oib);
        Context context = this.dj;
        if (context != null && (context instanceof Activity)) {
            if (this.oib) {
                uef(z2 ? 8 : 0);
                lw lwVar = this.xs;
                if (lwVar != null) {
                    lwVar.uef(this.rt);
                    this.xs.yo(false);
                }
            } else {
                uef(1);
                lw lwVar2 = this.xs;
                if (lwVar2 != null) {
                    lwVar2.oa(this.rt);
                    this.xs.yo(false);
                }
            }
            WeakReference<yo.oa> weakReference = this.gr;
            yo.oa oaVar2 = weakReference != null ? weakReference.get() : null;
            if (oaVar2 != null) {
                oaVar2.uef(this.oib);
            }
        }
    }

    public void uef(boolean z2) {
        this.wk = z2;
        lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.moa(z2);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public final void uef(final boolean z2, String str) {
        this.f25805ab = z2;
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.oa(z2);
            com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(this.xs, z2, str);
        }
        if (this.pz != null) {
            if (com.bykv.vk.openvk.uef.uef.oa.oa.uef.uef()) {
                this.pz.uef(z2);
            } else {
                this.yo.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.wk.uef.uef.3
                    @Override // java.lang.Runnable
                    public void run() {
                        uef.this.pz.uef(z2);
                    }
                });
            }
        }
    }

    public final void uef(yo.oa oaVar) {
        this.gr = new WeakReference<>(oaVar);
    }

    public final void uef(int i5) {
        Context context = this.dj;
        if (context == null) {
            return;
        }
        boolean z2 = i5 == 0 || i5 == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i5);
            } catch (Throwable unused) {
            }
            if (!z2) {
                activity.getWindow().setFlags(Segment.SHARE_MINIMUM, Segment.SHARE_MINIMUM);
            } else {
                activity.getWindow().clearFlags(Segment.SHARE_MINIMUM);
            }
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public final void oa(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, int i5) {
        lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.ivm();
        }
    }

    public final void oa(xs xsVar) {
        this.fz = true;
        wk.uef uefVar = new wk.uef();
        uefVar.oa(ivm());
        uefVar.moa(cz() / fz());
        uefVar.yo(xs());
        uefVar.moa(bcc());
        uefVar.uef(bs());
        uefVar.yo(this.cp);
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.oa(this.xs, uefVar, xsVar);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public final void uef(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, View view, boolean z2, boolean z10) {
        if (this.wk) {
            oa();
        }
        if (z2 && !this.wk && !gr()) {
            this.xs.oa(!ue(), false);
            this.xs.uef(z10, true, false);
        }
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null && yoVar.ivm()) {
            this.xs.ivm();
            this.xs.lw();
        } else {
            this.xs.ivm();
        }
    }

    public void oa(int i5) {
        this.gb = i5;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public final void oa() {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            yoVar.dj();
        }
        if (this.tpx || !this.dhk.get()) {
            return;
        }
        cp();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public final void uef(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, int i5, boolean z2) {
        if (this.dj == null) {
            return;
        }
        long j8 = (long) (((i5 * r0) * 1.0f) / 100.0f);
        if (this.dxx > 0) {
            this.oyt = (int) j8;
        } else {
            this.oyt = 0L;
        }
        lw lwVar = this.xs;
        if (lwVar != null) {
            lwVar.uef(this.oyt);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.uef
    public final void uef(com.bykv.vk.openvk.uef.uef.uef.moa.oa oaVar, int i5) {
        if (this.ivm == null) {
            return;
        }
        uef(this.oyt, yo(i5));
    }

    private void uef(long j8, boolean z2) {
        if (this.ivm == null) {
            return;
        }
        if (z2) {
            oyt();
        }
        this.ivm.uef(j8);
    }

    public final void uef(xs xsVar) {
        boolean z2 = false;
        if (this.dhk.compareAndSet(false, true)) {
            this.fz = true;
            ivm ivmVar = this.pz;
            if (ivmVar != null) {
                ivmVar.uef(cz(), gsd());
            }
            wk.uef uefVar = new wk.uef();
            uefVar.uef(rt());
            uefVar.moa(cz());
            com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
            if (yoVar != null && yoVar.dz()) {
                z2 = true;
            }
            uefVar.oa(z2);
            com.bytedance.sdk.openadsdk.moa.lw.uef.uef.uef(sy.uef(), this.xs, uefVar, xsVar);
        }
    }

    public final void uef(com.bykv.vk.openvk.uef.uef.uef.yo.uef uefVar) {
        this.fz = true;
        wk.uef uefVar2 = new wk.uef();
        uefVar2.yo(xs());
        uefVar2.moa(cz() / fz());
        uefVar2.oa(ivm());
        uefVar2.uef(uefVar);
        com.bytedance.sdk.openadsdk.moa.lw.uef.uef.yo(wrv(), uefVar2);
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public final void uef(yo.uef uefVar) {
        this.f25807ue = uefVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wk.oa.uef
    public final void uef(dhk.uef uefVar, String str) {
        int i5 = AnonymousClass4.uef[uefVar.ordinal()];
        if (i5 == 1) {
            oa();
            return;
        }
        if (i5 == 2) {
            moa();
        } else {
            if (i5 != 3) {
                return;
            }
            yo();
            this.bs = false;
            this.sy = true;
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef(long j8) {
        this.ku = j8;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public boolean uef(float f10) {
        com.bytedance.sdk.openadsdk.core.wk.moa.yo yoVar = this.ivm;
        if (yoVar != null) {
            return yoVar.uef(f10);
        }
        return false;
    }

    public void uef(long j8, long j10) {
        if (!this.af.get() && com.bytedance.sdk.openadsdk.ivm.uef.uef().yo() && (j8 * 1.0d) / j10 > 0.3d) {
            this.af.set(true);
            if (this.bcc != null) {
                com.bytedance.sdk.openadsdk.ivm.oa.uef().uef("videoPercent30", this.bcc);
            }
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.moa.yo
    public void uef(SurfaceTexture surfaceTexture) {
        this.cp = true;
    }
}
