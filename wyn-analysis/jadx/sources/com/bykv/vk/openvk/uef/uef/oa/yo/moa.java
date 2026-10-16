package com.bykv.vk.openvk.uef.uef.oa.yo;

import android.graphics.SurfaceTexture;
import android.media.PlaybackParams;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bykv.vk.openvk.uef.uef.oa.yo.yo;
import com.bykv.vk.openvk.uef.uef.uef.uef;
import com.bytedance.sdk.component.utils.dhk;
import com.bytedance.sdk.component.utils.tpx;
import com.bytedance.sdk.component.utils.ue;
import com.google.android.gms.common.api.f;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.io.FileInputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class moa implements yo.ivm, yo.lw, yo.moa, yo.oa, yo.uef, yo.xs, yo.InterfaceC0031yo, com.bykv.vk.openvk.uef.uef.uef.uef, ue.uef {
    private static final SparseIntArray uef = new SparseIntArray();

    /* renamed from: ab, reason: collision with root package name */
    private ue f24500ab;
    private boolean cq;
    private ArrayList<Runnable> gsd;
    private boolean gzw;
    private SurfaceHolder ivm;
    private SurfaceTexture lw;
    private volatile boolean oyt;
    private volatile boolean rl;
    private boolean sk;

    /* renamed from: ue, reason: collision with root package name */
    private boolean f24502ue;
    private boolean wrv;

    /* renamed from: oa, reason: collision with root package name */
    private final boolean f24501oa = false;
    private final List<WeakReference<uef.InterfaceC0034uef>> yo = new CopyOnWriteArrayList();
    private final uef moa = new uef();
    private int xs = 0;
    private int bcc = 3;
    private boolean cz = false;
    private volatile yo zjm = null;
    private boolean dj = false;
    private volatile int dz = 201;
    private long wk = -1;
    private boolean bs = false;
    private long sy = 0;
    private long oib = Long.MIN_VALUE;
    private long dhk = 0;
    private long tpx = 0;
    private long orq = 0;
    private int rt = 0;
    private String gr = "0";
    private com.bykv.vk.openvk.uef.uef.uef.yo.yo pz = null;
    private boolean cp = false;
    private CountDownLatch ku = new CountDownLatch(1);
    private volatile int fz = 200;
    private AtomicBoolean dxx = new AtomicBoolean(false);
    private Surface lz = null;
    private long km = 0;
    private long pu = 0;
    private boolean gb = false;
    private final Runnable af = new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.1
        @Override // java.lang.Runnable
        public void run() {
            if (moa.this.zjm == null) {
                return;
            }
            long jSy = moa.this.sy();
            if (jSy > 0 && moa.this.ivm() && moa.this.oib != Long.MIN_VALUE) {
                try {
                    if (moa.this.oib == jSy) {
                        if (!moa.this.bs && moa.this.dhk >= 400) {
                            moa.this.oa(701, 800);
                            moa.this.bs = true;
                        }
                        moa.this.dhk += moa.this.fz;
                    } else {
                        if (moa.this.bs) {
                            moa.this.sy += moa.this.dhk;
                            moa.this.oa(702, 800);
                            long unused = moa.this.sy;
                            int unused2 = moa.this.xs;
                        }
                        moa.this.dhk = 0L;
                        moa.this.bs = false;
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            if (moa.this.bs() > 0) {
                if (moa.this.oib != jSy) {
                    if (com.bykv.vk.openvk.uef.uef.uef.yo.moa()) {
                        long unused3 = moa.this.oib;
                    }
                    moa moaVar = moa.this;
                    moaVar.uef(jSy, moaVar.bs());
                }
                moa.this.oib = jSy;
            }
            if (moa.this.oa()) {
                moa moaVar2 = moa.this;
                moaVar2.uef(moaVar2.bs(), moa.this.bs());
            } else if (moa.this.f24500ab != null) {
                moa.this.f24500ab.postDelayed(this, moa.this.fz);
            }
        }
    };

    public class uef implements Runnable {

        /* renamed from: oa, reason: collision with root package name */
        private long f24509oa;
        private boolean yo;

        public uef() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (moa.this.zjm != null) {
                try {
                    if (!this.yo) {
                        long jZjm = moa.this.zjm.zjm();
                        moa.this.wk = Math.max(this.f24509oa, jZjm);
                    }
                    long unused = moa.this.wk;
                } catch (Throwable th) {
                    th.toString();
                }
            }
            if (moa.this.f24500ab != null) {
                moa.this.f24500ab.sendEmptyMessageDelayed(100, 0L);
            }
        }

        public void uef(boolean z2) {
            this.yo = z2;
        }

        public void uef(long j8) {
            this.f24509oa = j8;
        }
    }

    public moa() {
        uef("SSMediaPlayerWrapper");
    }

    private void cp() {
        if (this.wrv) {
            return;
        }
        this.wrv = true;
        Iterator it = new ArrayList(this.gsd).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.gsd.clear();
        this.wrv = false;
    }

    private void fz() {
        ArrayList<Runnable> arrayList = this.gsd;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.gsd.clear();
    }

    private void gr() {
        SparseIntArray sparseIntArray = uef;
        sparseIntArray.put(this.rt, sparseIntArray.get(this.rt) + 1);
    }

    private void gsd() {
        if (this.zjm == null) {
            return;
        }
        try {
            this.zjm.cq();
        } catch (Throwable unused) {
        }
        this.zjm.uef((yo.oa) null);
        this.zjm.uef((yo.xs) null);
        this.zjm.uef((yo.uef) null);
        this.zjm.uef((yo.moa) null);
        this.zjm.uef((yo.InterfaceC0031yo) null);
        this.zjm.uef((yo.lw) null);
        this.zjm.uef((yo.ivm) null);
        try {
            this.zjm.wrv();
        } catch (Throwable unused2) {
        }
    }

    private void gzw() {
        oa(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.14
            @Override // java.lang.Runnable
            public void run() {
                if (moa.this.f24500ab != null) {
                    moa.this.f24500ab.sendEmptyMessage(104);
                }
            }
        });
    }

    private void ku() {
        ArrayList<Runnable> arrayList = this.gsd;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        cp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void orq() {
        ue ueVar = this.f24500ab;
        if (ueVar != null) {
            ueVar.post(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.10
                @Override // java.lang.Runnable
                public void run() {
                    if (moa.this.zjm == null) {
                        try {
                            moa.this.zjm = new oa();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        if (moa.this.zjm == null) {
                            return;
                        }
                        yo unused = moa.this.zjm;
                        moa.this.gr = "0";
                        moa.this.zjm.uef((yo.lw) moa.this);
                        moa.this.zjm.uef((yo.oa) moa.this);
                        moa.this.zjm.uef((yo.InterfaceC0031yo) moa.this);
                        moa.this.zjm.uef((yo.uef) moa.this);
                        moa.this.zjm.uef((yo.ivm) moa.this);
                        moa.this.zjm.uef((yo.moa) moa.this);
                        moa.this.zjm.uef((yo.xs) moa.this);
                        try {
                            moa.this.zjm.yo(false);
                        } catch (Throwable unused2) {
                        }
                        moa.this.dj = false;
                    }
                }
            });
        }
    }

    private void pz() {
        ue ueVar = this.f24500ab;
        if (ueVar != null) {
            ueVar.post(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.7
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        moa.this.zjm.bcc();
                        moa.this.dz = Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE;
                        moa.this.oyt = false;
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    private void rt() {
        ue ueVar = this.f24500ab;
        if (ueVar == null || ueVar.getLooper() == null) {
            return;
        }
        try {
            this.f24500ab.post(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.6
                @Override // java.lang.Runnable
                public void run() {
                    if (moa.this.f24500ab == null || moa.this.f24500ab.getLooper() == null) {
                        return;
                    }
                    try {
                        com.bytedance.sdk.component.bcc.uef.uef.uef().uef(moa.this.f24500ab);
                        moa.this.f24500ab = null;
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void tpx() {
        this.sy = 0L;
        this.xs = 0;
        this.dhk = 0L;
        this.bs = false;
        this.oib = Long.MIN_VALUE;
    }

    private void ue() {
        this.rl = true;
        this.cz = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.orq;
        for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().uef(this, jElapsedRealtime);
            }
        }
    }

    private boolean uef(int i5, int i10) {
        boolean z2 = i5 == -1010 || i5 == -1007 || i5 == -1004 || i5 == -110 || i5 == 100 || i5 == 200;
        if (i10 == 1 || i10 == 700 || i10 == 800) {
            return true;
        }
        return z2;
    }

    public int ab() {
        return this.xs;
    }

    public long bs() {
        long j8 = this.tpx;
        if (j8 != 0) {
            return j8;
        }
        if (this.dz == 206 || this.dz == 207) {
            try {
                this.tpx = this.zjm.dj();
            } catch (Throwable unused) {
            }
        }
        return this.tpx;
    }

    public boolean cq() {
        return this.dz == 205;
    }

    public SurfaceTexture dhk() {
        return this.lw;
    }

    public boolean dz() {
        return this.sk;
    }

    public SurfaceHolder oib() {
        return this.ivm;
    }

    public long sy() {
        if (bcc()) {
            return 0L;
        }
        if (this.dz == 206 || this.dz == 207) {
            try {
                return this.zjm.zjm();
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    public long wk() {
        if (this.bs) {
            long j8 = this.dhk;
            if (j8 > 0) {
                return this.sy + j8;
            }
        }
        return this.sy;
    }

    public void wrv() {
        if (bcc()) {
            return;
        }
        this.cq = true;
        fz();
        ue ueVar = this.f24500ab;
        if (ueVar != null) {
            try {
                ueVar.removeCallbacksAndMessages(null);
                if (this.zjm != null) {
                    this.f24500ab.sendEmptyMessage(103);
                }
                rt();
            } catch (Throwable unused) {
                rt();
            }
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef
    public boolean bcc() {
        return this.cq;
    }

    public void cz() {
        if (bcc() || this.zjm == null) {
            return;
        }
        this.dxx.set(true);
        if (this.dz != 206) {
            tpx();
            this.oyt = false;
            this.moa.uef(true);
            oa(0L);
            ue ueVar = this.f24500ab;
            if (ueVar != null) {
                ueVar.removeCallbacks(this.af);
                this.f24500ab.postDelayed(this.af, this.fz);
            }
        }
        this.ku.countDown();
    }

    public void dj() {
        ue ueVar;
        if (bcc() || (ueVar = this.f24500ab) == null) {
            return;
        }
        ueVar.removeMessages(100);
        this.oyt = true;
        if (this.gb) {
            if (!this.cz && !oa(this.pz)) {
                uef(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.13
                    @Override // java.lang.Runnable
                    public void run() {
                        if (moa.this.f24500ab != null) {
                            moa.this.f24500ab.sendEmptyMessage(101);
                        }
                    }
                });
                return;
            }
            ue ueVar2 = this.f24500ab;
            if (ueVar2 != null) {
                ueVar2.sendEmptyMessage(101);
                return;
            }
            return;
        }
        if (!this.gzw && !oa(this.pz)) {
            uef(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.12
                @Override // java.lang.Runnable
                public void run() {
                    if (moa.this.f24500ab != null) {
                        moa.this.f24500ab.sendEmptyMessage(101);
                    }
                }
            });
            return;
        }
        ue ueVar3 = this.f24500ab;
        if (ueVar3 != null) {
            ueVar3.sendEmptyMessage(101);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef
    public boolean ivm() {
        ue ueVar;
        return (this.dz == 206 || ((ueVar = this.f24500ab) != null && ueVar.hasMessages(100))) && !this.oyt;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef
    public int lw() {
        if (this.zjm == null || bcc()) {
            return 0;
        }
        return this.zjm.wk();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef
    public boolean xs() {
        ue ueVar;
        return ((this.dz != 207 && !this.oyt) || (ueVar = this.f24500ab) == null || ueVar.hasMessages(100)) ? false : true;
    }

    public void zjm() {
        if (bcc() || this.f24500ab == null) {
            return;
        }
        this.dxx.set(true);
        this.f24500ab.post(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.11
            @Override // java.lang.Runnable
            public void run() {
                if (!moa.this.xs() || moa.this.zjm == null) {
                    return;
                }
                try {
                    moa.this.zjm.ivm();
                    for (WeakReference weakReference : moa.this.yo) {
                        if (weakReference != null && weakReference.get() != null) {
                            ((uef.InterfaceC0034uef) weakReference.get()).lw(moa.this);
                        }
                    }
                    moa.this.dz = Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE;
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        });
    }

    private void oa(long j8) {
        this.moa.uef(j8);
        if (this.f24502ue) {
            oa(this.moa);
        } else if (oa(this.pz)) {
            oa(this.moa);
        } else {
            uef(this.moa);
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef
    public int moa() {
        if (this.zjm == null || bcc()) {
            return 0;
        }
        return this.zjm.dz();
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef
    public boolean yo() {
        return cq() || ivm() || xs();
    }

    private void yo(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) throws Throwable {
        yoVar.ab();
        this.zjm.uef(yoVar);
        yoVar.ab();
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo.ivm
    public void yo(yo yoVar) {
        for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().uef((com.bykv.vk.openvk.uef.uef.uef.uef) this, true);
            }
        }
    }

    private boolean oa(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        return yoVar != null && yoVar.xs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(long j8, long j10) {
        long j11;
        long j12;
        if (!this.rl) {
            ue();
        }
        for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
            if (weakReference == null || weakReference.get() == null) {
                j11 = j8;
                j12 = j10;
            } else {
                j11 = j8;
                j12 = j10;
                weakReference.get().uef(this, j11, j12);
            }
            j8 = j11;
            j10 = j12;
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef
    public boolean oa() {
        return this.dz == 209;
    }

    private void oa(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, File file) {
        try {
            String strUef = com.bykv.vk.openvk.uef.uef.uef.xs.uef.uef(file);
            if (yoVar.bs().equals(strUef)) {
                uef(file);
                return;
            }
            JSONObject jSONObjectYo = yoVar.yo();
            boolean zOa = yoVar.oa();
            if (jSONObjectYo != null) {
                jSONObjectYo.put("file_hash", yoVar.bs());
                jSONObjectYo.put("file_real_hash", strUef);
                jSONObjectYo.put("is_change_play_type", zOa ? 1 : 0);
                jSONObjectYo.put("error_real_code", Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE_VALUE);
                jSONObjectYo.put("error_real_msg", "md5_not_match");
            }
            if (zOa) {
                boolean zDelete = file.delete();
                if (jSONObjectYo != null) {
                    jSONObjectYo.put("delete_cache_file", zDelete ? 1 : 0);
                }
                if (zDelete) {
                    yo(yoVar);
                    return;
                }
            }
            uef(file);
        } catch (Throwable unused) {
        }
    }

    private void uef(String str) {
        this.rt = 0;
        this.f24500ab = com.bytedance.sdk.component.bcc.uef.uef.uef().uef(this, "csj_".concat(String.valueOf(str)));
        this.gb = true;
        orq();
    }

    public void uef(final boolean z2) {
        if (bcc()) {
            return;
        }
        this.f24502ue = z2;
        if (this.zjm != null) {
            this.zjm.uef(z2);
            return;
        }
        ue ueVar = this.f24500ab;
        if (ueVar != null) {
            ueVar.post(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.9
                @Override // java.lang.Runnable
                public void run() {
                    if (moa.this.zjm != null) {
                        moa.this.zjm.uef(z2);
                    }
                }
            });
        }
    }

    private void oa(String str) throws Throwable {
        FileInputStream fileInputStream = new FileInputStream(str);
        this.zjm.uef(fileInputStream.getFD());
        fileInputStream.close();
    }

    public void uef(boolean z2, long j8, boolean z10) {
        if (bcc()) {
            return;
        }
        orq();
        this.cp = z10;
        this.dxx.set(true);
        this.oyt = false;
        oa(z10);
        if (z2) {
            this.wk = j8;
            gzw();
        } else {
            oa(j8);
        }
        ue ueVar = this.f24500ab;
        if (ueVar != null) {
            ueVar.removeCallbacks(this.af);
            this.f24500ab.postDelayed(this.af, this.fz);
        }
        this.ku.countDown();
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo.moa
    public boolean oa(yo yoVar, int i5, int i10) {
        if (this.zjm != yoVar) {
            return false;
        }
        if (i10 == -1004) {
            com.bykv.vk.openvk.uef.uef.uef.yo.uef uefVar = new com.bykv.vk.openvk.uef.uef.uef.yo.uef(i5, i10);
            for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().uef(this, uefVar);
                }
            }
        }
        oa(i5, i10);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(int i5, int i10) {
        if (i5 == 701) {
            this.km = SystemClock.elapsedRealtime();
            this.xs++;
            for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
                if (weakReference != null && weakReference.get() != null) {
                    weakReference.get().uef(this, f.API_PRIORITY_OTHER, 0, 0);
                }
            }
            return;
        }
        if (i5 == 702) {
            if (this.km > 0) {
                this.pu = (SystemClock.elapsedRealtime() - this.km) + this.pu;
                this.km = 0L;
            }
            for (WeakReference<uef.InterfaceC0034uef> weakReference2 : this.yo) {
                if (weakReference2 != null && weakReference2.get() != null) {
                    weakReference2.get().uef((com.bykv.vk.openvk.uef.uef.uef.uef) this, f.API_PRIORITY_OTHER);
                }
            }
            return;
        }
        if (this.gb && i5 == 3) {
            ku();
            ue();
            oa(this.cp);
        } else if (i5 == 805) {
            this.sk = true;
        }
    }

    public void uef(final long j8) {
        if (bcc()) {
            return;
        }
        if (this.dz == 207 || this.dz == 206 || this.dz == 209) {
            oa(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.2
                @Override // java.lang.Runnable
                public void run() {
                    if (moa.this.f24500ab != null) {
                        moa.this.f24500ab.obtainMessage(106, Long.valueOf(j8)).sendToTarget();
                    }
                }
            });
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef
    public boolean uef() {
        return this.cz;
    }

    public void uef(final SurfaceTexture surfaceTexture) {
        if (bcc()) {
            return;
        }
        this.lw = surfaceTexture;
        uef(true);
        oa(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.3
            @Override // java.lang.Runnable
            public void run() {
                moa.this.orq();
                if (moa.this.f24500ab != null) {
                    moa.this.f24500ab.obtainMessage(111, surfaceTexture).sendToTarget();
                }
            }
        });
    }

    public void uef(final SurfaceHolder surfaceHolder) {
        if (bcc()) {
            return;
        }
        this.ivm = surfaceHolder;
        uef(true);
        oa(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.4
            @Override // java.lang.Runnable
            public void run() {
                moa.this.orq();
                if (moa.this.f24500ab != null) {
                    moa.this.f24500ab.obtainMessage(110, surfaceHolder).sendToTarget();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo.lw
    public void oa(yo yoVar) {
        if (bcc()) {
            return;
        }
        this.dz = Sdk.SDKError.Reason.AD_IS_PLAYING_VALUE;
        try {
            com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar2 = this.pz;
            if (yoVar2 != null) {
                float fWk = yoVar2.wk();
                if (fWk > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    com.bykv.vk.openvk.uef.uef.uef.oa oaVar = new com.bykv.vk.openvk.uef.uef.uef.oa();
                    oaVar.uef(fWk);
                    this.zjm.uef(oaVar);
                }
            }
        } catch (Throwable unused) {
        }
        if (this.f24500ab != null) {
            if (this.oyt) {
                pz();
            } else {
                ue ueVar = this.f24500ab;
                ueVar.sendMessage(ueVar.obtainMessage(100, -1, -1));
            }
        }
        uef.delete(this.rt);
        boolean z2 = this.gb;
        boolean z10 = this.gzw;
        if (!z2 && !z10) {
            ue();
            this.gzw = true;
        }
        for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().oa(this);
            }
        }
    }

    public void uef(final com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        if (bcc()) {
            return;
        }
        this.pz = yoVar;
        if (yoVar != null) {
            this.gb = this.gb && !yoVar.xs();
        }
        oa(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.5
            @Override // java.lang.Runnable
            public void run() {
                moa.this.orq();
                if (moa.this.f24500ab != null) {
                    moa.this.f24500ab.obtainMessage(107, yoVar).sendToTarget();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.utils.ue.uef
    public void uef(Message message) {
        int i5 = this.dz;
        int i10 = message.what;
        if (this.zjm != null) {
            try {
                switch (message.what) {
                    case 100:
                        if (this.dz == 205 || this.dz == 207 || this.dz == 209) {
                            this.zjm.ivm();
                            this.orq = SystemClock.elapsedRealtime();
                            this.dz = Sdk.SDKError.Reason.AD_ALREADY_FAILED_VALUE;
                            if (this.wk > 0) {
                                this.zjm.uef(this.wk, this.bcc);
                                this.wk = -1L;
                            }
                            if (this.pz != null) {
                                oa(this.cp);
                                return;
                            }
                            return;
                        }
                        break;
                    case 101:
                        if (this.bs) {
                            this.sy += this.dhk;
                        }
                        this.bs = false;
                        this.dhk = 0L;
                        this.oib = Long.MIN_VALUE;
                        if (this.dz == 206 || this.dz == 207 || this.dz == 209) {
                            this.zjm.bcc();
                            this.dz = Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE;
                            this.oyt = false;
                            for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().moa(this);
                                }
                            }
                            return;
                        }
                        break;
                    case 102:
                        this.zjm.cq();
                        this.dz = 201;
                        return;
                    case 103:
                        try {
                            gsd();
                        } catch (Throwable unused) {
                        }
                        for (WeakReference<uef.InterfaceC0034uef> weakReference2 : this.yo) {
                            if (weakReference2 != null && weakReference2.get() != null) {
                                weakReference2.get().yo(this);
                            }
                        }
                        this.dz = Sdk.SDKError.Reason.AD_IS_LOADING_VALUE;
                        return;
                    case 104:
                        if (this.dz == 202 || this.dz == 208) {
                            this.zjm.cz();
                            return;
                        }
                        break;
                    case 105:
                        if (this.dz == 205 || this.dz == 206 || this.dz == 208 || this.dz == 207 || this.dz == 209) {
                            this.zjm.xs();
                            this.dz = Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE;
                            return;
                        }
                        break;
                    case 106:
                        if (this.dz == 206 || this.dz == 207 || this.dz == 209) {
                            this.zjm.uef(((Long) message.obj).longValue(), this.bcc);
                            return;
                        }
                        break;
                    case 107:
                        tpx();
                        if (this.dz == 201 || this.dz == 203) {
                            com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar = (com.bykv.vk.openvk.uef.uef.uef.yo.yo) message.obj;
                            if (TextUtils.isEmpty(yoVar.lw())) {
                                yoVar.uef(com.bykv.vk.openvk.uef.uef.uef.yo.oa());
                            }
                            if (yoVar.rt()) {
                                this.zjm.uef(yoVar.ab());
                                yoVar.ab();
                            } else {
                                File file = new File(yoVar.lw(), yoVar.bs());
                                if (file.exists()) {
                                    uef(yoVar, file);
                                } else {
                                    yo(yoVar);
                                }
                            }
                            this.dz = Sdk.SDKError.Reason.AD_CONSUMED_VALUE;
                            return;
                        }
                        break;
                    case 108:
                    case 109:
                    default:
                        return;
                    case 110:
                        this.zjm.uef((SurfaceHolder) message.obj);
                        this.zjm.oa(true);
                        this.ku.await(1L, TimeUnit.SECONDS);
                        ku();
                        return;
                    case 111:
                        this.lz = new Surface((SurfaceTexture) message.obj);
                        this.zjm.uef(this.lz);
                        this.zjm.oa(true);
                        this.ku.await(1L, TimeUnit.SECONDS);
                        ku();
                        return;
                }
                this.dz = 200;
                if (this.dj) {
                    return;
                }
                com.bykv.vk.openvk.uef.uef.uef.yo.uef uefVar = new com.bykv.vk.openvk.uef.uef.uef.yo.uef(308, i10);
                uefVar.uef(i5 + "," + i10);
                for (WeakReference<uef.InterfaceC0034uef> weakReference3 : this.yo) {
                    if (weakReference3 != null && weakReference3.get() != null) {
                        weakReference3.get().uef(this, uefVar);
                    }
                }
                this.dj = true;
            } catch (Throwable unused2) {
            }
        }
    }

    private void oa(Runnable runnable) {
        if (runnable == null || bcc()) {
            return;
        }
        if (!this.cq) {
            runnable.run();
        } else {
            uef(runnable);
        }
    }

    public void oa(final boolean z2) {
        ue ueVar;
        if (bcc() || (ueVar = this.f24500ab) == null) {
            return;
        }
        ueVar.post(new Runnable() { // from class: com.bykv.vk.openvk.uef.uef.oa.yo.moa.8
            @Override // java.lang.Runnable
            public void run() {
                if (moa.this.bcc() || moa.this.zjm == null) {
                    return;
                }
                try {
                    moa.this.cp = z2;
                    moa.this.zjm.moa(z2);
                } catch (Throwable unused) {
                }
            }
        });
    }

    public void oa(int i5) {
        this.bcc = i5;
    }

    private void uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar, File file) {
        if (yoVar.uef()) {
            oa(yoVar, file);
        } else {
            uef(file);
        }
    }

    private void uef(File file) {
        file.getAbsolutePath();
        try {
            if (tpx.uef(com.bykv.vk.openvk.uef.uef.uef.yo.uef())) {
                this.zjm.uef(file.getAbsolutePath());
            } else {
                oa(file.getAbsolutePath());
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo.uef
    public void uef(yo yoVar, int i5) {
        if (this.zjm != yoVar) {
            return;
        }
        for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().oa(this, i5);
            }
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo.oa
    public void uef(yo yoVar) {
        this.dz = Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE;
        uef.delete(this.rt);
        ue ueVar = this.f24500ab;
        if (ueVar != null) {
            ueVar.removeCallbacks(this.af);
        }
        for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().uef(this);
            }
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo.InterfaceC0031yo
    public boolean uef(yo yoVar, int i5, int i10) {
        gr();
        this.dz = 200;
        ue ueVar = this.f24500ab;
        if (ueVar != null) {
            ueVar.removeCallbacks(this.af);
        }
        if (uef(i5, i10)) {
            rt();
        }
        if (!this.dxx.get()) {
            return true;
        }
        this.dxx.set(false);
        com.bykv.vk.openvk.uef.uef.uef.yo.uef uefVar = new com.bykv.vk.openvk.uef.uef.uef.yo.uef(i5, i10);
        for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().uef(this, uefVar);
            }
        }
        return true;
    }

    private void uef(Runnable runnable) {
        try {
            if (this.gsd == null) {
                this.gsd = new ArrayList<>();
            }
            this.gsd.add(runnable);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.yo.xs
    public void uef(yo yoVar, int i5, int i10, int i11, int i12) {
        for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
            if (weakReference != null && weakReference.get() != null) {
                weakReference.get().uef((com.bykv.vk.openvk.uef.uef.uef.uef) this, i5, i10);
            }
        }
    }

    public void uef(uef.InterfaceC0034uef interfaceC0034uef) {
        if (interfaceC0034uef == null) {
            return;
        }
        for (WeakReference<uef.InterfaceC0034uef> weakReference : this.yo) {
            if (weakReference != null && weakReference.get() == interfaceC0034uef) {
                return;
            }
        }
        this.yo.add(new WeakReference<>(interfaceC0034uef));
    }

    public void uef(int i5) {
        if (bcc()) {
            return;
        }
        this.fz = i5;
    }

    public boolean uef(float f10) {
        PlaybackParams playbackParamsLw;
        float speed = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return false;
        }
        try {
            if (this.zjm == null || !yo()) {
                return false;
            }
            try {
                playbackParamsLw = this.zjm.lw();
            } catch (Throwable th) {
                dhk.yo("CSJ_VIDEO_MEDIA", "getPlaybackParams error:" + th.getMessage());
                playbackParamsLw = null;
            }
            if (playbackParamsLw != null) {
                speed = playbackParamsLw.getSpeed();
            }
            if (speed == f10) {
                return true;
            }
            com.bykv.vk.openvk.uef.uef.uef.oa oaVar = new com.bykv.vk.openvk.uef.uef.uef.oa();
            oaVar.uef(f10);
            this.zjm.uef(oaVar);
            return true;
        } catch (Throwable th2) {
            dhk.uef("CSJ_VIDEO_MEDIA", "setPlaySpeedRatio error: ", th2);
            return false;
        }
    }
}
