package com.bytedance.sdk.component.lw.oa.yo;

import A0.j;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.bytedance.sdk.component.lw.ab;
import com.bytedance.sdk.component.lw.bcc;
import com.bytedance.sdk.component.lw.cz;
import com.bytedance.sdk.component.lw.dj;
import com.bytedance.sdk.component.lw.dz;
import com.bytedance.sdk.component.lw.oib;
import com.bytedance.sdk.component.lw.tpx;
import com.bytedance.sdk.component.lw.zjm;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class yo implements cz {

    /* renamed from: ab, reason: collision with root package name */
    private oib f25039ab;
    private int bcc;
    private int bs;
    private byte[] cp;
    private volatile boolean cq;
    private int cz;
    private com.bytedance.sdk.component.lw.xs dhk;
    private int dj;
    private boolean dz;
    private ExecutorService gr;
    private int gsd;
    private com.bytedance.sdk.component.lw.oa gzw;
    private ImageView.ScaleType ivm;
    private ab lw;
    private String moa;

    /* renamed from: oa, reason: collision with root package name */
    private String f25040oa;
    private boolean oib;
    private ivm orq;
    private dz pz;
    private int rt;
    private final Handler sy;
    private int tpx;

    /* renamed from: ue, reason: collision with root package name */
    private boolean f25041ue;
    Future<?> uef;
    private boolean wk;
    private WeakReference<ImageView> wrv;
    private Bitmap.Config xs;
    private String yo;
    private bcc zjm;

    public static class oa implements zjm {

        /* renamed from: ab, reason: collision with root package name */
        private ivm f25042ab;
        private int bcc;
        private bcc bs;
        private boolean cq;
        private ExecutorService dhk;
        private oib dj;
        private String dz;
        private Bitmap.Config ivm;
        private ImageView.ScaleType lw;
        private String moa;

        /* renamed from: oa, reason: collision with root package name */
        private ImageView f25043oa;
        private int oib;
        private dz orq;
        private int sy;
        private boolean tpx;
        private ab uef;
        private com.bytedance.sdk.component.lw.oa wk;
        private boolean wrv;
        private int xs;
        private String yo;
        private int cz = 1;
        private int zjm = 5;

        public oa(ivm ivmVar) {
            this.f25042ab = ivmVar;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm lw(int i5) {
            this.oib = i5;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm moa(int i5) {
            this.sy = i5;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm oa(int i5) {
            this.bcc = i5;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm uef(String str) {
            this.yo = str;
            return this;
        }

        public zjm yo(String str) {
            this.moa = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm oa(String str) {
            this.dz = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm uef(ImageView.ScaleType scaleType) {
            this.lw = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm yo(int i5) {
            this.cz = i5;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm uef(Bitmap.Config config) {
            this.ivm = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm uef(int i5) {
            this.xs = i5;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm uef(oib oibVar) {
            this.dj = oibVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm uef(boolean z2) {
            this.cq = z2;
            return this;
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public cz uef(ab abVar, int i5) {
            this.zjm = i5;
            return uef(abVar);
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public cz uef(ab abVar) {
            this.uef = abVar;
            return new yo(this).dhk();
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public cz uef(ImageView imageView) {
            this.f25043oa = imageView;
            return new yo(this).dhk();
        }

        @Override // com.bytedance.sdk.component.lw.zjm
        public zjm uef(bcc bccVar) {
            this.bs = bccVar;
            return this;
        }
    }

    public class uef implements ab {

        /* renamed from: oa, reason: collision with root package name */
        private ab f25044oa;

        public uef(ab abVar) {
            this.f25044oa = abVar;
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(final dj djVar) {
            Bitmap bitmapUef;
            final ImageView imageView = (ImageView) yo.this.wrv.get();
            if (imageView != null && yo.this.dj != 3 && uef(imageView)) {
                Object objOa = djVar.oa();
                if (objOa instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) djVar.oa();
                    yo.this.sy.post(new Runnable() { // from class: com.bytedance.sdk.component.lw.oa.yo.yo.uef.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (objOa instanceof Drawable) {
                    final Drawable drawable = (Drawable) djVar.oa();
                    yo.this.sy.post(new Runnable() { // from class: com.bytedance.sdk.component.lw.oa.yo.yo.uef.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28 && j.B(drawable)) {
                                j.k(drawable).start();
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            }
            try {
                if (yo.this.zjm != null && (djVar.oa() instanceof Bitmap) && (bitmapUef = yo.this.zjm.uef((Bitmap) djVar.oa())) != null) {
                    djVar.uef(bitmapUef);
                }
            } catch (Throwable unused) {
            }
            if (yo.this.bs == 5) {
                yo.this.sy.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.lw.oa.yo.yo.uef.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (uef.this.f25044oa != null) {
                            uef.this.f25044oa.uef(djVar);
                        }
                    }
                });
                return;
            }
            ab abVar = this.f25044oa;
            if (abVar != null) {
                abVar.uef(djVar);
            }
        }

        private boolean uef(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(yo.this.yo)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.lw.ab
        public void uef(final int i5, final String str, final Throwable th) {
            if (yo.this.bs == 5) {
                yo.this.sy.post(new Runnable() { // from class: com.bytedance.sdk.component.lw.oa.yo.yo.uef.4
                    @Override // java.lang.Runnable
                    public void run() {
                        if (uef.this.f25044oa != null) {
                            uef.this.f25044oa.uef(i5, str, th);
                        }
                    }
                });
                return;
            }
            ab abVar = this.f25044oa;
            if (abVar != null) {
                abVar.uef(i5, str, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public cz dhk() {
        try {
            if (this.orq == null) {
                ab abVar = this.lw;
                if (abVar != null) {
                    abVar.uef(WebSocketProtocol.CLOSE_NO_STATUS_CODE, "not init !", null);
                    return this;
                }
            } else {
                String strUef = uef();
                if (TextUtils.isEmpty(strUef)) {
                    this.lw.uef(2000, "url is empty", null);
                    return this;
                }
                tpx tpxVarXs = this.orq.xs();
                if (!strUef.startsWith("http://") && !strUef.startsWith("https://") && tpxVarXs != null) {
                    tpxVarXs.uef(1006, "url is not validate ".concat(strUef));
                }
                ExecutorService executorServiceIvm = this.gr == null ? this.orq.ivm() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.lw.oa.yo.yo.1
                    @Override // java.lang.Runnable
                    public void run() {
                        yo yoVar = yo.this;
                        com.bytedance.sdk.component.lw.oa.yo.uef uefVar = new com.bytedance.sdk.component.lw.oa.yo.uef(yoVar, yoVar.f25039ab);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.lw.oa.oa.oa());
                            arrayList.add(new com.bytedance.sdk.component.lw.oa.oa.lw());
                            arrayList.add(new com.bytedance.sdk.component.lw.oa.oa.uef());
                            arrayList.add(new com.bytedance.sdk.component.lw.oa.oa.yo());
                            arrayList.add(new com.bytedance.sdk.component.lw.oa.oa.moa());
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                if (yo.this.cq) {
                                    uefVar.uef(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.lw.oa.oa.ivm ivmVar = (com.bytedance.sdk.component.lw.oa.oa.ivm) arrayList.get(i5);
                                if (yo.this.f25039ab != null && ivmVar != null && !"data_intercept".equals(ivmVar.uef())) {
                                    yo.this.f25039ab.uef(ivmVar.uef(), yo.this);
                                }
                                yo yoVar2 = yo.this;
                                boolean zUef = ivmVar.uef(yoVar2, yoVar2.f25039ab, uefVar);
                                if (yo.this.f25039ab != null && !"data_intercept".equals(ivmVar.uef())) {
                                    yo.this.f25039ab.oa(ivmVar.uef(), yo.this);
                                }
                                if (!zUef) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            uefVar.uef(2000, th.getMessage(), th);
                        }
                    }
                };
                if (this.f25041ue) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.gr;
                if (executorService != null) {
                    this.uef = executorService.submit(runnable);
                    return this;
                }
                if (executorServiceIvm != null) {
                    this.uef = executorServiceIvm.submit(runnable);
                    return this;
                }
            }
        } catch (Exception e7) {
            Log.e("ImageRequest", e7.getMessage());
        }
        return this;
    }

    public ivm ab() {
        return this.orq;
    }

    public com.bytedance.sdk.component.lw.oa bs() {
        return this.gzw;
    }

    public byte[] cq() {
        return this.cp;
    }

    public int dj() {
        return this.dj;
    }

    public com.bytedance.sdk.component.lw.xs dz() {
        return this.dhk;
    }

    public String oib() {
        return bcc() + dj();
    }

    public dz sy() {
        return this.pz;
    }

    public int wk() {
        return this.tpx;
    }

    public boolean wrv() {
        return this.oib;
    }

    public Bitmap.Config zjm() {
        return this.xs;
    }

    private yo(oa oaVar) {
        this.sy = new Handler(Looper.getMainLooper());
        this.oib = true;
        this.cp = null;
        this.f25040oa = oaVar.moa;
        this.lw = new uef(oaVar.uef);
        this.wrv = new WeakReference<>(oaVar.f25043oa);
        this.ivm = oaVar.lw;
        this.xs = oaVar.ivm;
        this.bcc = oaVar.xs;
        this.cz = oaVar.bcc;
        this.dj = oaVar.cz;
        this.bs = oaVar.zjm;
        this.f25039ab = oaVar.dj;
        this.gzw = uef(oaVar);
        if (!TextUtils.isEmpty(oaVar.yo)) {
            oa(oaVar.yo);
            uef(oaVar.yo);
        }
        this.dz = oaVar.wrv;
        this.wk = oaVar.cq;
        this.orq = oaVar.f25042ab;
        this.zjm = oaVar.bs;
        this.rt = oaVar.oib;
        this.gsd = oaVar.sy;
        this.gr = oaVar.dhk;
        this.f25041ue = oaVar.tpx;
        this.pz = oaVar.orq;
    }

    private com.bytedance.sdk.component.lw.oa uef(oa oaVar) {
        return oaVar.wk != null ? oaVar.wk : !TextUtils.isEmpty(oaVar.dz) ? com.bytedance.sdk.component.lw.oa.yo.uef.oa.uef(new File(oaVar.dz)) : com.bytedance.sdk.component.lw.oa.yo.uef.oa.cz();
    }

    public String bcc() {
        return this.yo;
    }

    public ImageView.ScaleType cz() {
        return this.ivm;
    }

    public ab ivm() {
        return this.lw;
    }

    public int lw() {
        return this.rt;
    }

    public int moa() {
        return this.gsd;
    }

    public void oa(String str) {
        WeakReference<ImageView> weakReference = this.wrv;
        if (weakReference != null && weakReference.get() != null) {
            this.wrv.get().setTag(1094453505, str);
        }
        this.yo = str;
    }

    public String xs() {
        return this.moa;
    }

    @Override // com.bytedance.sdk.component.lw.cz
    public int yo() {
        return this.cz;
    }

    @Override // com.bytedance.sdk.component.lw.cz
    public int oa() {
        return this.bcc;
    }

    @Override // com.bytedance.sdk.component.lw.cz
    public String uef() {
        return this.f25040oa;
    }

    public void uef(String str) {
        this.moa = str;
    }

    public void uef(boolean z2) {
        this.oib = z2;
    }

    public void uef(byte[] bArr) {
        this.cp = bArr;
    }

    public void uef(int i5) {
        this.tpx = i5;
    }
}
