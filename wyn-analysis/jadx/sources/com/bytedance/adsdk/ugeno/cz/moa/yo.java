package com.bytedance.adsdk.ugeno.cz.moa;

import A0.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.dj;
import com.bytedance.adsdk.ugeno.core.ivm;
import com.bytedance.adsdk.ugeno.lw;
import com.bytedance.adsdk.ugeno.uef;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.bytedance.adsdk.ugeno.xs.moa;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class yo extends com.bytedance.adsdk.ugeno.oa.yo<uef> {
    protected String aje;
    private int jp;
    protected boolean lo;
    private float nj;
    protected ImageView.ScaleType qn;
    private int syr;
    protected String uef;

    /* renamed from: uf, reason: collision with root package name */
    private float f24710uf;

    /* renamed from: wf, reason: collision with root package name */
    private float f24711wf;

    public yo(Context context) {
        super(context);
        this.qn = ImageView.ScaleType.FIT_XY;
        this.syr = -1;
        this.f24710uf = -1.0f;
        this.nj = -1.0f;
        this.jp = 0;
        this.f24711wf = 50.0f;
    }

    private ImageView.ScaleType cq(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private void cz() throws NumberFormatException {
        if (TextUtils.isEmpty(this.uef)) {
            return;
        }
        ((uef) this.lw).setImageDrawable(null);
        if (!this.uef.startsWith("local://")) {
            if (!this.uef.startsWith("@")) {
                zjm();
                return;
            } else {
                ((uef) this.lw).setImageResource(Integer.parseInt(this.uef.substring(1)));
                return;
            }
        }
        try {
            String strReplace = this.uef.replace("local://", "");
            if (TextUtils.equals(yo(), "raw")) {
                ((uef) this.lw).setImageResource(moa.uef(this.f24755oa, strReplace));
            } else {
                uef((ImageView) this.lw, strReplace);
            }
        } catch (Exception unused) {
        }
    }

    private void zjm() {
        if (this.f24710uf > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            lw.uef().oa().uef(this.cz, this.uef, new uef.InterfaceC0044uef() { // from class: com.bytedance.adsdk.ugeno.cz.moa.yo.1
                @Override // com.bytedance.adsdk.ugeno.uef.InterfaceC0044uef
                public void uef(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.oa.yo) yo.this).tam != null) {
                            ivm unused = ((com.bytedance.adsdk.ugeno.oa.yo) yo.this).tam;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.oa.yo) yo.this).tam != null) {
                        ivm unused2 = ((com.bytedance.adsdk.ugeno.oa.yo) yo.this).tam;
                    }
                    final Bitmap bitmapUef = bcc.uef(((com.bytedance.adsdk.ugeno.oa.yo) yo.this).f24755oa, bitmap, (int) yo.this.f24710uf);
                    if (bitmapUef != null) {
                        bcc.uef(new Runnable() { // from class: com.bytedance.adsdk.ugeno.cz.moa.yo.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((uef) ((com.bytedance.adsdk.ugeno.oa.yo) yo.this).lw).setImageBitmap(bitmapUef);
                            }
                        });
                    }
                    yo yoVar = yo.this;
                    if (yoVar.lo || yoVar.nj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        Bitmap bitmapUef2 = bcc.uef(((com.bytedance.adsdk.ugeno.oa.yo) yo.this).f24755oa, bitmap, yo.this.nj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) yo.this.nj : 10);
                        if (bitmapUef2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.oa.yo) yo.this).f24755oa.getResources(), bitmapUef2);
                            bcc.uef(new Runnable() { // from class: com.bytedance.adsdk.ugeno.cz.moa.yo.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((uef) ((com.bytedance.adsdk.ugeno.oa.yo) yo.this).lw).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.uef uefVarOa = lw.uef().oa();
        dj djVar = this.cz;
        String str = this.uef;
        T t10 = this.lw;
        uefVarOa.uef(djVar, str, (ImageView) t10, ((uef) t10).getWidth(), ((uef) this.lw).getHeight(), new uef.InterfaceC0044uef() { // from class: com.bytedance.adsdk.ugeno.cz.moa.yo.2
            @Override // com.bytedance.adsdk.ugeno.uef.InterfaceC0044uef
            public void uef(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.oa.yo) yo.this).tam != null) {
                        ivm unused = ((com.bytedance.adsdk.ugeno.oa.yo) yo.this).tam;
                    }
                } else if (((com.bytedance.adsdk.ugeno.oa.yo) yo.this).tam != null) {
                    ivm unused2 = ((com.bytedance.adsdk.ugeno.oa.yo) yo.this).tam;
                }
            }
        });
        if (this.lo || this.nj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            lw.uef().oa().uef(this.cz, this.uef, new uef.InterfaceC0044uef() { // from class: com.bytedance.adsdk.ugeno.cz.moa.yo.3
                @Override // com.bytedance.adsdk.ugeno.uef.InterfaceC0044uef
                public void uef(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapUef = bcc.uef(((com.bytedance.adsdk.ugeno.oa.yo) yo.this).f24755oa, bitmap, yo.this.nj > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (int) yo.this.nj : 10);
                    bcc.uef(new Runnable() { // from class: com.bytedance.adsdk.ugeno.cz.moa.yo.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapUef != null) {
                                ((uef) ((com.bytedance.adsdk.ugeno.oa.yo) yo.this).lw).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.oa.yo) yo.this).f24755oa.getResources(), bitmapUef));
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo, com.bytedance.adsdk.ugeno.moa
    public void bcc() {
        super.bcc();
        Drawable drawable = ((uef) this.lw).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !j.x(drawable)) {
            return;
        }
        j.j(drawable).stop();
    }

    public void dz(String str) {
        this.uef = str;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: moa, reason: merged with bridge method [inline-methods] */
    public uef uef() {
        uef uefVar = new uef(this.f24755oa);
        uefVar.uef(this);
        return uefVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException, NumberFormatException {
        super.oa();
        cz();
        ((uef) this.lw).setScaleType(this.qn);
        ((uef) this.lw).setBorderColor(this.hts);
        ((uef) this.lw).setCornerRadius(this.gem);
        ((uef) this.lw).setBorderWidth(this.nkh);
        int i5 = this.syr;
        if (i5 != -1) {
            ((uef) this.lw).setColorFilter(i5);
        }
        ((uef) this.lw).setEraseEnabled(this.jp == 1);
        ((uef) this.lw).setEraseRadius(this.f24711wf);
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo, com.bytedance.adsdk.ugeno.moa
    public void xs() {
        super.xs();
        ((uef) this.lw).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.cz.moa.yo.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((uef) ((com.bytedance.adsdk.ugeno.oa.yo) yo.this).lw).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !j.x(drawable)) {
                    return;
                }
                j.j(drawable).start();
            }
        });
    }

    public String yo() {
        return this.aje;
    }

    public void uef(ImageView imageView, String str) {
        imageView.setImageResource(moa.oa(this.f24755oa, str));
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        T t10;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.qn = cq(str2);
                break;
            case "imageBlur":
                this.f24710uf = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, -1.0f);
                break;
            case "eraseRadius":
                float fUef = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 50.0f);
                this.f24711wf = fUef;
                T t11 = this.lw;
                if (t11 != 0) {
                    ((uef) t11).setEraseRadius(fUef);
                    break;
                }
                break;
            case "isBgGaussianBlur":
                this.lo = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, false);
                break;
            case "src":
                this.uef = str2;
                break;
            case "erase":
                int iUef = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0);
                this.jp = iUef;
                if (iUef == 1 && (t10 = this.lw) != 0) {
                    ((uef) t10).setEraseEnabled(true);
                    break;
                }
                break;
            case "tintColor":
                this.syr = com.bytedance.adsdk.ugeno.xs.uef.uef(str2);
                break;
            case "imageBgBlur":
                this.nj = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, -1.0f);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo, com.bytedance.adsdk.ugeno.moa
    public void uef(String str, Map<String, Object> map) {
        this.xs = (com.bytedance.adsdk.ugeno.oa.uef) oa((com.bytedance.adsdk.ugeno.oa.yo) this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lz());
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        uef(this.xs, str, arrayList.toArray());
    }

    private void uef(com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.oa.yo<View>> listCz;
        if (yoVar == null) {
            return;
        }
        yoVar.uef(str, objArr);
        if (!(yoVar instanceof com.bytedance.adsdk.ugeno.oa.uef) || (listCz = ((com.bytedance.adsdk.ugeno.oa.uef) yoVar).cz()) == null || listCz.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.oa.yo<View>> it = listCz.iterator();
        while (it.hasNext()) {
            uef(it.next(), str, objArr);
        }
    }
}
