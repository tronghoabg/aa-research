package com.bytedance.sdk.openadsdk.ivm;

import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.yo;
import com.bytedance.sdk.openadsdk.gzw.lw;

/* loaded from: classes3.dex */
public class uef {
    private static volatile uef uef;

    /* renamed from: ab, reason: collision with root package name */
    private boolean f25931ab;
    private int[] bcc;
    private boolean bs;
    private boolean cq;
    private int[] cz;
    private boolean dj;
    private boolean dz;
    private int[] ivm;
    private int[] lw;
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25932oa;
    private int wk;
    private int[] wrv;
    private int[] xs;
    private boolean yo;
    private boolean zjm;

    private uef() {
        oa();
    }

    public int[] ab() {
        return this.wrv;
    }

    public boolean bs() {
        return this.cq;
    }

    public int[] cq() {
        return this.cz;
    }

    public int[] dj() {
        return this.xs;
    }

    public boolean dz() {
        return this.zjm;
    }

    public boolean sy() {
        return this.bs;
    }

    public boolean wk() {
        return this.dj;
    }

    public int[] wrv() {
        return this.bcc;
    }

    public int[] zjm() {
        return this.ivm;
    }

    public boolean bcc() {
        return this.moa;
    }

    public int[] cz() {
        return this.lw;
    }

    public boolean xs() {
        return this.yo;
    }

    public boolean ivm() {
        return this.f25932oa;
    }

    public boolean lw() {
        return this.f25931ab;
    }

    public int moa() {
        return this.wk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] yo(String[] strArr) throws NumberFormatException {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i5 = 0;
        for (String str : strArr) {
            try {
                int i10 = Integer.parseInt(str);
                iArr[i5] = i10;
                if (i10 > 0) {
                    i5++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i5 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i5];
        System.arraycopy(iArr, 0, iArr2, 0, i5);
        return iArr2;
    }

    public void oa() {
        wk.oa().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ivm.uef.1
            @Override // java.lang.Runnable
            public void run() {
                uef.this.dz = lw.uef("feature_switch", false);
                if (uef.this.dz) {
                    try {
                        uef.this.bs = lw.uef("exclude_banner_native", false);
                        uef.this.wk = lw.uef("feature_timer_interval", 10000);
                        uef.this.f25931ab = lw.uef("enable_feature_cids", true);
                        String[] strArrSplit = lw.uef("pag_ad_show_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit2 = lw.uef("pag_ad_click_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit3 = lw.uef("pag_video_play_cnt", "1,3,5&session").split("&");
                        String[] strArrSplit4 = lw.uef("pag_dislike_cnt", "1,3,5session").split(",");
                        uef uefVar = uef.this;
                        uefVar.f25932oa = uefVar.uef(strArrSplit);
                        uef uefVar2 = uef.this;
                        uefVar2.yo = uefVar2.uef(strArrSplit2);
                        uef uefVar3 = uef.this;
                        uefVar3.moa = uefVar3.uef(strArrSplit3);
                        uef uefVar4 = uef.this;
                        uefVar4.lw = uefVar4.oa(strArrSplit);
                        uef uefVar5 = uef.this;
                        uefVar5.ivm = uefVar5.oa(strArrSplit2);
                        uef uefVar6 = uef.this;
                        uefVar6.xs = uefVar6.oa(strArrSplit3);
                        uef uefVar7 = uef.this;
                        uefVar7.wrv = uefVar7.yo(strArrSplit4);
                        String[] strArrSplit5 = lw.uef("pag_landingPage_stay_time", "1,3,5&session").split("&");
                        String[] strArrSplit6 = lw.uef("pag_video_stay_time", "1,3,5&session").split("&");
                        uef uefVar8 = uef.this;
                        uefVar8.zjm = uefVar8.uef(strArrSplit5);
                        uef uefVar9 = uef.this;
                        uefVar9.dj = uefVar9.uef(strArrSplit6);
                        uef uefVar10 = uef.this;
                        uefVar10.bcc = uefVar10.oa(strArrSplit5);
                        uef uefVar11 = uef.this;
                        uefVar11.cz = uefVar11.oa(strArrSplit6);
                        uef.this.cq = lw.uef("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] oa(String[] strArr) {
        if (strArr.length > 0) {
            return yo(strArr[0].split(","));
        }
        return new int[0];
    }

    public static uef uef() {
        if (uef == null) {
            synchronized (yo.class) {
                try {
                    if (uef == null) {
                        uef = new uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return uef;
    }

    public boolean yo() {
        return this.dz;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean uef(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
