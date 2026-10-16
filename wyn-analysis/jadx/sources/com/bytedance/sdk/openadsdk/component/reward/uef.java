package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.gr;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.cp;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.core.model.rt;
import com.bytedance.sdk.openadsdk.core.model.ue;
import com.bytedance.sdk.openadsdk.core.orq;
import com.bytedance.sdk.openadsdk.core.wk.yo.uef;
import com.unity3d.services.UnityAdsConstants;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class uef<L, A> {
    protected com.bytedance.sdk.component.bcc.oa.yo moa;
    protected final Context uef;

    /* renamed from: oa, reason: collision with root package name */
    protected final AtomicBoolean f25386oa = new AtomicBoolean(false);
    protected final List<uef<L, A>.moa> yo = DesugarCollections.synchronizedList(new ArrayList());
    private final gr.uef lw = new gr.uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.6
        @Override // com.bytedance.sdk.component.utils.gr.uef
        public void uef(Context context, Intent intent, boolean z2, int i5) {
            if (z2) {
                uef uefVar = uef.this;
                if (uefVar.moa == null) {
                    uefVar.moa = new oa("net connect task", uefVar.yo);
                    com.bytedance.sdk.component.utils.cz.uef().post(uef.this.moa);
                }
            }
        }
    };

    public class moa extends com.bytedance.sdk.component.bcc.oa.yo {

        /* renamed from: oa, reason: collision with root package name */
        final AdSlot f25406oa;
        final gzw uef;
        final com.bytedance.sdk.openadsdk.core.model.uef yo;

        public moa(gzw gzwVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
            super("VideoPreloadTask");
            this.uef = gzwVar;
            this.f25406oa = adSlot;
            this.yo = uefVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            gzw gzwVar = this.uef;
            if (gzwVar == null || gzwVar.nj() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(this.uef.wg()).uef(), this.uef);
            oaVarUef.uef("material_meta", this.uef);
            oaVarUef.uef("ad_slot", this.f25406oa);
            com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, new com.bykv.vk.openvk.uef.uef.uef.lw.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.moa.1
                @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5, String str) {
                }

                @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
                public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, int i5) {
                    wk wkVarUef = uef.this.uef();
                    moa moaVar = moa.this;
                    wkVarUef.uef(moaVar.f25406oa, moaVar.yo);
                }
            });
        }
    }

    public class oa extends com.bytedance.sdk.component.bcc.oa.yo {

        /* renamed from: oa, reason: collision with root package name */
        private final List<uef<L, A>.moa> f25415oa;

        public oa(String str, List<uef<L, A>.moa> list) {
            super(str);
            this.f25415oa = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<uef<L, A>.moa> list = this.f25415oa;
            if (list == null || list.isEmpty()) {
                uef.this.moa = null;
                return;
            }
            ArrayList arrayList = new ArrayList(this.f25415oa);
            this.f25415oa.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                try {
                    ((moa) it.next()).run();
                } catch (Exception e7) {
                    com.bytedance.sdk.component.utils.dhk.uef("BVL", "continue download task error", e7);
                }
            }
            uef.this.moa = null;
        }
    }

    public class yo {
        protected final com.bytedance.sdk.openadsdk.core.model.uef moa;

        /* renamed from: oa, reason: collision with root package name */
        protected final AtomicBoolean f25436oa;
        protected final uef<L, A>.C0077uef uef;
        protected final AtomicInteger yo;

        private int uef() {
            if (!this.moa.ivm()) {
                return 0;
            }
            int i5 = 0;
            for (int i10 = 0; i10 < this.moa.lw().size(); i10++) {
                gzw gzwVar = this.moa.lw().get(i10);
                if (gzwVar != null && !cp.yo(gzwVar) && gzwVar.nj() != null) {
                    i5++;
                }
            }
            return i5;
        }

        private yo(uef<L, A>.C0077uef c0077uef, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
            this.f25436oa = new AtomicBoolean(false);
            this.uef = c0077uef;
            this.moa = uefVar;
            this.yo = new AtomicInteger(uef());
        }

        public void uef(int i5, String str) {
            if (this.yo.decrementAndGet() > 0 || !this.f25436oa.compareAndSet(false, true)) {
                return;
            }
            this.uef.uef(i5, str);
            com.bytedance.sdk.openadsdk.ab.moa.uef("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.ab.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.yo.1
                @Override // com.bytedance.sdk.openadsdk.ab.oa
                public com.bytedance.sdk.openadsdk.ab.uef.yo uef() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", yo.this.moa.yo());
                    return com.bytedance.sdk.openadsdk.ab.uef.moa.oa().uef("choose_ad_load_error").oa(jSONObject.toString());
                }
            });
        }

        public void uef(A a5) {
            this.yo.decrementAndGet();
            if (this.uef == null || !this.f25436oa.compareAndSet(false, true)) {
                return;
            }
            this.uef.uef(a5);
        }
    }

    public uef(Context context) {
        this.uef = context == null ? com.bytedance.sdk.openadsdk.core.sy.uef() : context.getApplicationContext();
        yo();
    }

    private void oa(final AdSlot adSlot) {
        com.bytedance.sdk.openadsdk.core.sy.yo().uef(adSlot, uef(adSlot, true), oa(), new orq() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.1
            boolean uef = false;

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public String uef() {
                return uef.this.uef().uef(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
                boolean zUef = uef.this.uef().uef(uefVar);
                this.uef = zUef;
                return zUef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                if (this.uef || uefVar.lw() == null || uefVar.lw().isEmpty()) {
                    return;
                }
                uef uefVar2 = uef.this;
                uef.this.uef(uefVar, (com.bytedance.sdk.openadsdk.core.model.uef) uefVar2.uef(uefVar2.uef, uefVar, adSlot), adSlot, true, (boolean) null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yo(AdSlot adSlot) {
        uef().uef(adSlot.getCodeId());
    }

    public void finalize() throws Throwable {
        super.finalize();
        if (this.moa != null) {
            try {
                com.bytedance.sdk.component.utils.cz.uef().removeCallbacks(this.moa);
            } catch (Throwable unused) {
            }
            this.moa = null;
        }
        moa();
    }

    public abstract int ivm();

    public void lw() {
        try {
            uef().uef();
        } catch (Throwable unused) {
        }
    }

    public void moa() {
        if (this.f25386oa.get()) {
            this.f25386oa.set(false);
            try {
                gr.uef(this.lw);
            } catch (Exception unused) {
            }
        }
    }

    public abstract int oa();

    public abstract void oa(A a5);

    public abstract wk uef();

    public abstract A uef(Context context, com.bytedance.sdk.openadsdk.core.model.uef uefVar, AdSlot adSlot);

    public abstract Object uef(A a5);

    public abstract void uef(L l10, int i5, String str);

    public abstract void uef(L l10, Object obj);

    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.uef$uef, reason: collision with other inner class name */
    public class C0077uef {
        protected final boolean moa;

        /* renamed from: oa, reason: collision with root package name */
        protected final com.bytedance.sdk.openadsdk.core.model.uef f25430oa;
        protected final AdSlot uef;
        protected final L yo;

        public C0077uef(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.uef uefVar, L l10, boolean z2) {
            this.uef = adSlot;
            this.f25430oa = uefVar;
            this.yo = l10;
            this.moa = z2;
        }

        public void uef(int i5, String str) {
            L l10 = this.yo;
            if (l10 != null) {
                uef.this.uef((uef) l10, i5, str);
            }
        }

        public void uef(A a5) {
            uef.this.uef(this.uef, this.f25430oa, (com.bytedance.sdk.openadsdk.core.model.uef) this.yo, (L) a5, this.moa);
        }
    }

    private void oa(final AdSlot adSlot, final L l10) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        com.bytedance.sdk.openadsdk.core.sy.yo().uef(adSlot, uef(adSlot, false), oa(), new orq() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.2
            boolean uef = false;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(int i5, String str) {
                Object obj = l10;
                if (obj != null) {
                    uef.this.uef((uef) obj, i5, str);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.gzw.uef
            public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, com.bytedance.sdk.openadsdk.core.model.yo yoVar) {
                com.bytedance.sdk.openadsdk.core.model.uef uefVar2;
                if (uefVar.lw() != null && !uefVar.lw().isEmpty()) {
                    uef uefVar3 = uef.this;
                    Object objUef = uefVar3.uef(uefVar3.uef, uefVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.orq.uef.moa.uef().uef(uefVar.lw().isEmpty() ? null : uefVar.lw().get(0));
                        com.bytedance.sdk.openadsdk.ab.moa.uef(uefVar.xs(), System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                    if (l10 == null || com.bytedance.sdk.openadsdk.core.sy.moa().pz() != 0) {
                        uefVar2 = uefVar;
                    } else {
                        uef.this.uef(adSlot, uefVar, (com.bytedance.sdk.openadsdk.core.model.uef) l10, objUef, this.uef);
                        uefVar2 = uefVar;
                        objUef = objUef;
                    }
                    uef.this.uef(uefVar2, (com.bytedance.sdk.openadsdk.core.model.uef) objUef, adSlot, false, (boolean) l10);
                    return;
                }
                Object obj = l10;
                if (obj != null) {
                    uef.this.uef((uef) obj, -3, com.bytedance.sdk.openadsdk.core.cz.uef(-3));
                    yoVar.uef(-3);
                    yoVar.yo(uef.this.ivm());
                    com.bytedance.sdk.openadsdk.core.model.yo.uef(yoVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public String uef() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String strUef = uef.this.uef().uef(adSlot.getCodeId(), true);
                TextUtils.isEmpty(strUef);
                if (TextUtils.isEmpty(strUef)) {
                    return null;
                }
                return strUef;
            }

            @Override // com.bytedance.sdk.openadsdk.core.orq, com.bytedance.sdk.openadsdk.core.tpx
            public boolean uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
                boolean zUef = uef.this.uef().uef(uefVar);
                this.uef = zUef;
                return zUef;
            }
        });
    }

    public void uef(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        oa(adSlot);
    }

    public void yo() {
        if (this.f25386oa.get()) {
            return;
        }
        this.f25386oa.set(true);
        gr.uef(this.lw, this.uef);
    }

    public void uef(AdSlot adSlot, L l10) {
        Objects.toString(adSlot);
        Objects.toString(l10);
        oa(adSlot, l10);
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, A a5, AdSlot adSlot, boolean z2, L l10) {
        A a10;
        boolean z10;
        if (!z2) {
            com.bytedance.sdk.openadsdk.dz.uef.uef().uef(uefVar.xs());
        }
        uef<L, A> uefVar2 = this;
        AdSlot adSlot2 = adSlot;
        uef<L, A>.yo yoVar = new yo(uefVar2.new C0077uef(adSlot2, uefVar, l10, false), uefVar);
        uef(uefVar);
        int i5 = 0;
        while (i5 < uefVar.lw().size()) {
            gzw gzwVar = uefVar.lw().get(i5);
            int iWxf = gzwVar.wxf();
            if (i5 == 0 && iWxf == 43) {
                gzwVar.nj().ivm(0);
            }
            if (com.bytedance.sdk.openadsdk.component.reward.yo.bcc.uef(gzwVar)) {
                if (com.bytedance.sdk.openadsdk.component.reward.yo.bcc.oa()) {
                    gzwVar.nj().ivm(0);
                    a10 = a5;
                    z10 = z2;
                    AdSlot adSlot3 = adSlot2;
                    uefVar2.uef(uefVar, gzwVar, (gzw) a10, adSlot3, z10, (uef<L, gzw>.yo) yoVar);
                    adSlot2 = adSlot3;
                } else {
                    a10 = a5;
                    z10 = z2;
                }
            } else {
                a10 = a5;
                z10 = z2;
                AdSlot adSlot32 = adSlot2;
                uefVar2.uef(uefVar, gzwVar, (gzw) a10, adSlot32, z10, (uef<L, gzw>.yo) yoVar);
                adSlot2 = adSlot32;
            }
            if (uefVar.cz() && iWxf != 43) {
                return;
            }
            i5++;
            uefVar2 = this;
            a5 = a10;
            z2 = z10;
        }
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        rt rtVarDj = uefVar.dj();
        int iAb = uefVar.cz() ? 10 : 1;
        if (rtVarDj != null) {
            iAb = rtVarDj.ab();
        }
        for (final int i5 = 0; i5 < uefVar.lw().size() && i5 < iAb; i5++) {
            com.bytedance.sdk.openadsdk.core.wk.yo.uef.uef().uef(uefVar.lw().get(i5), new uef.InterfaceC0107uef() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.3
                @Override // com.bytedance.sdk.openadsdk.core.wk.yo.uef.InterfaceC0107uef
                public void uef(boolean z2) {
                    com.bytedance.sdk.component.utils.dhk.uef("BVL", "onCachedResponse: i=" + i5 + ", isSuccess=" + z2);
                }
            });
        }
    }

    private boolean uef(boolean z2, gzw gzwVar, AdSlot adSlot) {
        if (z2) {
            return !cp.yo(gzwVar) && gzw.lw(gzwVar) && com.bytedance.sdk.openadsdk.core.sy.moa().ue(adSlot.getCodeId()).moa == 1 && !com.bytedance.sdk.component.utils.sy.moa(this.uef);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(uef<L, A>.yo yoVar) {
        return yoVar != null && com.bytedance.sdk.openadsdk.core.sy.moa().pz() == 1;
    }

    private void uef(gzw gzwVar, final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.uef uefVar, final A a5, final boolean z2, final uef<L, A>.yo yoVar) {
        com.bytedance.sdk.openadsdk.core.wk.uef.oa oaVarUef = gzw.uef(CacheDirFactory.getICacheDir(gzwVar.wg()).uef(), gzwVar);
        oaVarUef.uef("material_meta", gzwVar);
        oaVarUef.uef("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.wk.lw.uef.uef(oaVarUef, new com.bykv.vk.openvk.uef.uef.uef.lw.oa() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar2, int i5) {
                uef.this.oa((uef) a5);
                if (z2) {
                    uef.this.uef().uef(adSlot, uefVar);
                } else if (uef.this.uef(yoVar)) {
                    yoVar.uef(a5);
                }
            }

            @Override // com.bykv.vk.openvk.uef.uef.uef.lw.uef.InterfaceC0032uef
            public void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar2, int i5, String str) {
                if (uef.this.uef(yoVar)) {
                    yoVar.uef(i5, str);
                }
            }
        });
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.uef uefVar, gzw gzwVar, A a5, AdSlot adSlot, boolean z2, uef<L, A>.yo yoVar) {
        A a10;
        uef<L, A>.yo yoVar2;
        if (uef(z2, gzwVar, adSlot)) {
            uef((moa) new moa(gzwVar, adSlot, uefVar));
            return;
        }
        boolean zUef = uef((yo) yoVar);
        if (cp.yo(gzwVar)) {
            a10 = a5;
            yoVar2 = yoVar;
            if (z2) {
                uef().uef(adSlot, uefVar);
            }
        } else if (!gzw.lw(gzwVar)) {
            a10 = a5;
            yoVar2 = yoVar;
            if (z2) {
                uef().uef(adSlot, uefVar);
            }
        } else {
            if (gzwVar.nj() == null) {
                return;
            }
            a10 = a5;
            yoVar2 = yoVar;
            uef(gzwVar, adSlot, uefVar, (com.bytedance.sdk.openadsdk.core.model.uef) a10, z2, (uef<L, com.bytedance.sdk.openadsdk.core.model.uef>.yo) yoVar2);
            zUef = false;
        }
        if (zUef) {
            yoVar2.uef(a10);
        }
    }

    public void uef(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.uef uefVar, L l10, A a5, final boolean z2) {
        com.bytedance.sdk.openadsdk.core.wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.uef.5
            @Override // java.lang.Runnable
            public void run() {
                if (z2) {
                    uef.this.yo(adSlot);
                } else {
                    uef.this.uef().uef(adSlot, uefVar);
                    uef.this.yo(adSlot);
                }
            }
        });
        if (l10 != null) {
            uef((uef<L, A>) l10, uef((uef<L, A>) a5));
        }
    }

    public void uef(uef<L, A>.moa moaVar) {
        if (moaVar == null) {
            return;
        }
        if (this.yo.size() > 0) {
            this.yo.remove(0);
        }
        this.yo.add(moaVar);
    }

    public ue uef(AdSlot adSlot, boolean z2) {
        ue ueVar = new ue();
        if (adSlot != null && (com.bytedance.sdk.openadsdk.core.sy.moa().cq(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || adSlot.isExpressAd())) {
            ueVar.cz = 2;
        }
        if (oa() == 7) {
            ueVar.f25711oa = z2 ? 2 : 1;
            return ueVar;
        }
        ueVar.yo = z2 ? 2 : 1;
        return ueVar;
    }

    public void uef(String str, gzw gzwVar) {
        uef().uef(str, gzwVar);
    }
}
