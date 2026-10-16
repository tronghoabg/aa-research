package com.bytedance.sdk.openadsdk.core.cq.oa.oa;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.oa.moa;
import com.bytedance.adsdk.oa.zjm;
import com.bytedance.adsdk.ugeno.lw;
import com.bytedance.adsdk.ugeno.oa.yo;
import com.bytedance.adsdk.ugeno.uef;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import java.util.HashMap;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class uef extends yo<oa> {
    protected ImageView.ScaleType aje;
    private float dy;
    private int jp;
    protected ImageView.ScaleType lo;
    private float meb;
    private boolean nj;
    protected HashMap<String, Bitmap> qn;
    private String syr;
    protected String uef;

    /* renamed from: uf, reason: collision with root package name */
    private boolean f25529uf;

    /* renamed from: wf, reason: collision with root package name */
    private boolean f25530wf;
    private boolean ykf;

    /* renamed from: com.bytedance.sdk.openadsdk.core.cq.oa.oa.uef$1, reason: invalid class name */
    public class AnonymousClass1 implements moa {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.oa.moa
        public Bitmap uef(final zjm zjmVar) {
            final String strUef;
            if (zjmVar == null) {
                return null;
            }
            String strZjm = zjmVar.zjm();
            String strCz = zjmVar.cz();
            if (!TextUtils.isEmpty(strZjm) && TextUtils.isEmpty(strCz)) {
                strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(strZjm, ((yo) uef.this).moa);
            } else if (!TextUtils.isEmpty(strCz) && TextUtils.isEmpty(strZjm)) {
                strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(strCz, ((yo) uef.this).moa);
            } else if (TextUtils.isEmpty(strCz) || TextUtils.isEmpty(strZjm)) {
                strUef = null;
            } else {
                strUef = com.bytedance.adsdk.ugeno.yo.oa.uef(strZjm, ((yo) uef.this).moa) + com.bytedance.adsdk.ugeno.yo.oa.uef(strCz, ((yo) uef.this).moa);
            }
            if (TextUtils.isEmpty(strUef)) {
                return null;
            }
            Bitmap bitmap = uef.this.qn.get(strUef);
            if (bitmap != null) {
                return bitmap;
            }
            lw.uef().oa().uef(((yo) uef.this).cz, strUef, new uef.InterfaceC0044uef() { // from class: com.bytedance.sdk.openadsdk.core.cq.oa.oa.uef.1.1
                @Override // com.bytedance.adsdk.ugeno.uef.InterfaceC0044uef
                public void uef(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, zjmVar.uef(), zjmVar.oa(), false);
                        uef.this.qn.put(strUef, bitmapCreateScaledBitmap);
                        bcc.uef(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cq.oa.oa.uef.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((oa) ((yo) uef.this).lw).uef(zjmVar.bcc(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return uef.this.qn.get(strUef);
        }
    }

    public uef(Context context) {
        super(context);
        this.syr = "images";
        this.ykf = true;
        this.dy = 1.0f;
        this.lo = ImageView.ScaleType.FIT_CENTER;
        this.aje = ImageView.ScaleType.FIT_XY;
        this.qn = new HashMap<>();
    }

    private String cq(String str) {
        return (!TextUtils.isEmpty(str) && str.contains(ServiceProvider.NAMED_LOCAL)) ? str.contains("shake_phone") ? "lottie_json/shake_phone.json" : str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "" : "";
    }

    private ImageView.ScaleType dz(String str) {
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
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private ImageView.ScaleType wk(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    public void moa() {
        T t10 = this.lw;
        if (t10 != 0) {
            ((oa) t10).uef();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void oa() throws JSONException {
        super.oa();
        ((oa) this.lw).setProgress(this.meb);
        if (this.dy <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.dy = 1.0f;
        }
        ((oa) this.lw).setSpeed(this.dy);
        if (this.uef.startsWith(ServiceProvider.NAMED_LOCAL)) {
            ((oa) this.lw).setAnimation(cq(this.uef));
            ((oa) this.lw).setImageAssetsFolder(this.syr);
        } else {
            ((oa) this.lw).setAnimationFromUrl(this.uef);
        }
        ((oa) this.lw).setImageAssetDelegate(new AnonymousClass1());
        if (fz()) {
            ((oa) this.lw).setScaleType(this.aje);
        } else {
            ((oa) this.lw).setScaleType(this.lo);
        }
        if (fz()) {
            ((oa) this.lw).setRepeatCount(this.jp);
        } else {
            ((oa) this.lw).uef(this.nj);
        }
        if (!fz()) {
            T t10 = this.lw;
            if (t10 != 0) {
                ((oa) t10).uef();
                return;
            }
            return;
        }
        T t11 = this.lw;
        if (t11 == 0 || !this.ykf) {
            return;
        }
        ((oa) t11).uef();
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    /* renamed from: yo, reason: merged with bridge method [inline-methods] */
    public oa uef() {
        oa oaVar = new oa(this.f24755oa);
        oaVar.uef(this);
        return oaVar;
    }

    @Override // com.bytedance.adsdk.ugeno.oa.yo
    public void uef(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.uef(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
                this.aje = wk(str2);
                break;
            case "scaleType":
                this.lo = dz(str2);
                break;
            case "progress":
                this.meb = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case "imagePath":
                this.syr = str2;
                break;
            case "autoReverse":
                this.f25529uf = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, false);
                break;
            case "src":
                this.uef = com.bytedance.sdk.openadsdk.core.cq.moa.uef(str2);
                break;
            case "loop":
                if (fz()) {
                    this.jp = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 0);
                    break;
                } else {
                    this.nj = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, false);
                    break;
                }
            case "speed":
                this.dy = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, 1.0f);
                break;
            case "autoPlay":
                this.f25530wf = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, false);
                break;
            case "autoplay":
                this.ykf = com.bytedance.adsdk.ugeno.xs.yo.uef(str2, true);
                break;
        }
    }

    public void uef(AnimatorListenerAdapter animatorListenerAdapter) {
        ((oa) this.lw).uef(animatorListenerAdapter);
    }
}
