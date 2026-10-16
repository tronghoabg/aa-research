package com.bytedance.adsdk.oa;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.oa.xs;
import com.unity3d.services.UnityAdsConstants;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class ivm extends ImageView {

    /* renamed from: oa, reason: collision with root package name */
    private static final dj<Throwable> f24549oa = new dj<Throwable>() { // from class: com.bytedance.adsdk.oa.ivm.1
        @Override // com.bytedance.adsdk.oa.dj
        public void uef(Throwable th) {
            com.bytedance.adsdk.oa.ivm.ivm.uef(th);
        }
    };
    private static final String uef = "ivm";

    /* renamed from: ab, reason: collision with root package name */
    private xs f24550ab;
    private String bcc;
    private final Handler bs;
    private oa cp;
    private final Set<moa> cq;
    private int cz;
    private long dhk;
    private boolean dj;
    private final Set<Object> dz;
    private String gr;
    private int gsd;
    private int gzw;
    private int ivm;
    private uef ku;
    private dj<Throwable> lw;
    private final dj<Throwable> moa;
    private Handler oib;
    private int orq;
    private final Runnable pz;
    private int rt;
    private int sy;
    private com.bytedance.adsdk.oa.yo.yo.yo tpx;

    /* renamed from: ue, reason: collision with root package name */
    private JSONArray f24551ue;
    private cq<xs> wk;
    private boolean wrv;
    private final cz xs;
    private final dj<xs> yo;
    private boolean zjm;

    /* renamed from: com.bytedance.adsdk.oa.ivm$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            uef = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[ImageView.ScaleType.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                uef[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum moa {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public interface oa {
    }

    public interface uef {
    }

    public static class yo extends View.BaseSavedState {
        public static final Parcelable.Creator<yo> CREATOR = new Parcelable.Creator<yo>() { // from class: com.bytedance.adsdk.oa.ivm.yo.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public yo createFromParcel(Parcel parcel) {
                return new yo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: uef, reason: merged with bridge method [inline-methods] */
            public yo[] newArray(int i5) {
                return new yo[i5];
            }
        };
        int ivm;
        String lw;
        boolean moa;

        /* renamed from: oa, reason: collision with root package name */
        int f24563oa;
        String uef;
        int xs;
        float yo;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i5) {
            super.writeToParcel(parcel, i5);
            parcel.writeString(this.uef);
            parcel.writeFloat(this.yo);
            parcel.writeInt(this.moa ? 1 : 0);
            parcel.writeString(this.lw);
            parcel.writeInt(this.ivm);
            parcel.writeInt(this.xs);
        }

        public yo(Parcelable parcelable) {
            super(parcelable);
        }

        private yo(Parcel parcel) {
            super(parcel);
            this.uef = parcel.readString();
            this.yo = parcel.readFloat();
            this.moa = parcel.readInt() == 1;
            this.lw = parcel.readString();
            this.ivm = parcel.readInt();
            this.xs = parcel.readInt();
        }
    }

    public ivm(Context context) {
        super(context);
        this.yo = new dj<xs>() { // from class: com.bytedance.adsdk.oa.ivm.6
            @Override // com.bytedance.adsdk.oa.dj
            public void uef(xs xsVar) {
                ivm.this.setComposition(xsVar);
            }
        };
        this.moa = new dj<Throwable>() { // from class: com.bytedance.adsdk.oa.ivm.7
            @Override // com.bytedance.adsdk.oa.dj
            public void uef(Throwable th) {
                if (ivm.this.ivm != 0) {
                    ivm ivmVar = ivm.this;
                    ivmVar.setImageResource(ivmVar.ivm);
                }
                (ivm.this.lw == null ? ivm.f24549oa : ivm.this.lw).uef(th);
            }
        };
        this.ivm = 0;
        this.xs = new cz();
        this.zjm = false;
        this.dj = false;
        this.wrv = true;
        this.cq = new HashSet();
        this.dz = new HashSet();
        this.bs = new Handler(Looper.getMainLooper());
        this.sy = 0;
        this.dhk = 0L;
        this.pz = new Runnable() { // from class: com.bytedance.adsdk.oa.ivm.4
            @Override // java.lang.Runnable
            public void run() {
                Log.i("TMe", "--==--- timer callback, timer: " + ivm.this.orq + ", " + ivm.this.gzw);
                if (ivm.this.orq > ivm.this.gzw) {
                    ivm.sy(ivm.this);
                    com.bytedance.adsdk.oa.yo.yo.yo yoVar = ivm.this.tpx;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(ivm.this.orq);
                    yoVar.uef(sb2.toString());
                    ivm.this.invalidate();
                    ivm.this.wk();
                    return;
                }
                if (ivm.this.gsd < 0 || ivm.this.rt < 0) {
                    Log.i("TMe", "--==--- timer end, frame invalid: " + ivm.this.gsd + "," + ivm.this.rt);
                } else {
                    Log.i("TMe", "--==--- timer end, play anim, startframe: " + ivm.this.gsd);
                    ivm.this.uef();
                    ivm ivmVar = ivm.this;
                    ivmVar.setFrame(ivmVar.gsd);
                    ivm.this.uef(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oa.ivm.4.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            if (ivm.this.getFrame() < ivm.this.rt - 1 || ivm.this.getFrame() >= ivm.this.rt + 2) {
                                return;
                            }
                            Log.i("TMe", "--==--- timer end, play anim, endframe: " + ivm.this.rt);
                            ivm.this.oa(this);
                            ivm.this.ivm();
                        }
                    });
                }
                if ((!TextUtils.isEmpty(ivm.this.gr) || (ivm.this.f24551ue != null && ivm.this.f24551ue.length() > 0)) && ivm.this.cp != null) {
                    oa unused = ivm.this.cp;
                    String unused2 = ivm.this.gr;
                    JSONArray unused3 = ivm.this.f24551ue;
                }
            }
        };
        bcc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public xs.uef getGlobalConfig() {
        xs xsVarGr;
        cz czVar = this.xs;
        if (czVar == null || (xsVarGr = czVar.gr()) == null) {
            return null;
        }
        return xsVarGr.dj();
    }

    private xs.oa getGlobalEvent() {
        xs xsVarGr;
        cz czVar = this.xs;
        if (czVar == null || (xsVarGr = czVar.gr()) == null) {
            return null;
        }
        return xsVarGr.zjm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPlayDelayedELExpressTimeS() {
        xs xsVarGr;
        cz czVar = this.xs;
        if (czVar == null || (xsVarGr = czVar.gr()) == null) {
            return null;
        }
        return xsVarGr.cz();
    }

    public static /* synthetic */ int lw(ivm ivmVar) {
        int i5 = ivmVar.sy;
        ivmVar.sy = i5 + 1;
        return i5;
    }

    private void setCompositionTask(cq<xs> cqVar) {
        this.cq.add(moa.SET_ANIMATION);
        bs();
        cq();
        this.wk = cqVar.uef(this.yo).yo(this.moa);
    }

    public static /* synthetic */ int sy(ivm ivmVar) {
        int i5 = ivmVar.orq;
        ivmVar.orq = i5 - 1;
        return i5;
    }

    public boolean getClipToCompositionBounds() {
        return this.xs.yo();
    }

    public xs getComposition() {
        return this.f24550ab;
    }

    public long getDuration() {
        xs xsVar = this.f24550ab;
        if (xsVar != null) {
            return (long) xsVar.lw();
        }
        return 0L;
    }

    public int getFrame() {
        return this.xs.oib();
    }

    public String getImageAssetsFolder() {
        return this.xs.moa();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.xs.lw();
    }

    public float getMaxFrame() {
        return this.xs.wk();
    }

    public float getMinFrame() {
        return this.xs.dz();
    }

    public sy getPerformanceTracker() {
        return this.xs.bcc();
    }

    public float getProgress() {
        return this.xs.cp();
    }

    public oib getRenderMode() {
        return this.xs.ivm();
    }

    public int getRepeatCount() {
        return this.xs.tpx();
    }

    public int getRepeatMode() {
        return this.xs.dhk();
    }

    public float getSpeed() {
        return this.xs.ab();
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof cz) && ((cz) drawable).ivm() == oib.SOFTWARE) {
            this.xs.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        cz czVar = this.xs;
        if (drawable2 == czVar) {
            super.invalidateDrawable(czVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.dj) {
            return;
        }
        this.xs.dj();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ab();
        Handler handler = this.oib;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        yo();
        oa();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i5;
        if (!(parcelable instanceof yo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        yo yoVar = (yo) parcelable;
        super.onRestoreInstanceState(yoVar.getSuperState());
        this.bcc = yoVar.uef;
        Set<moa> set = this.cq;
        moa moaVar = moa.SET_ANIMATION;
        if (!set.contains(moaVar) && !TextUtils.isEmpty(this.bcc)) {
            setAnimation(this.bcc);
        }
        this.cz = yoVar.f24563oa;
        if (!this.cq.contains(moaVar) && (i5 = this.cz) != 0) {
            setAnimation(i5);
        }
        if (!this.cq.contains(moa.SET_PROGRESS)) {
            uef(yoVar.yo, false);
        }
        if (!this.cq.contains(moa.PLAY_OPTION) && yoVar.moa) {
            uef();
        }
        if (!this.cq.contains(moa.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(yoVar.lw);
        }
        if (!this.cq.contains(moa.SET_REPEAT_MODE)) {
            setRepeatMode(yoVar.ivm);
        }
        if (this.cq.contains(moa.SET_REPEAT_COUNT)) {
            return;
        }
        setRepeatCount(yoVar.xs);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        yo yoVar = new yo(super.onSaveInstanceState());
        yoVar.uef = this.bcc;
        yoVar.f24563oa = this.cz;
        yoVar.yo = this.xs.cp();
        yoVar.moa = this.xs.gzw();
        yoVar.lw = this.xs.moa();
        yoVar.ivm = this.xs.dhk();
        yoVar.xs = this.xs.tpx();
        return yoVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int[][] iArr;
        com.bytedance.adsdk.oa.yo.yo.uef uefVarUef = uef(motionEvent);
        if (uefVarUef == null) {
            if (getGlobalConfig() == null || getGlobalConfig().uef != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        String strCz = uefVarUef.cz();
        if (uefVarUef instanceof com.bytedance.adsdk.oa.yo.yo.oa) {
            if (getGlobalConfig() == null || getGlobalConfig().uef != 1) {
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
        if (strCz != null && strCz.startsWith("CSJCLOSE")) {
            ab();
        }
        zjm zjmVarUef = uef(uefVarUef.lw());
        if (zjmVarUef != null && motionEvent.getAction() == 1) {
            uef(strCz, zjmVarUef.lw(), zjmVarUef.xs());
            int[][] iArrIvm = zjmVarUef.ivm();
            if (iArrIvm != null) {
                uef(iArrIvm);
            } else if (getGlobalEvent() != null && (iArr = getGlobalEvent().f24602oa) != null) {
                uef(iArr);
            }
        }
        if (strCz == null || !strCz.startsWith("CSJNTP")) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setAnimation(int i5) {
        this.cz = i5;
        this.bcc = null;
        setCompositionTask(uef(i5));
    }

    public void setAnimationFromJson(String str) {
        uef(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.wrv ? bcc.uef(getContext(), str) : bcc.uef(getContext(), str, (String) null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z2) {
        this.xs.lw(z2);
    }

    public void setCacheComposition(boolean z2) {
        this.wrv = z2;
    }

    public void setClipToCompositionBounds(boolean z2) {
        this.xs.uef(z2);
    }

    public void setComposition(xs xsVar) {
        if (lw.uef) {
            Log.v(uef, "Set Composition \n".concat(String.valueOf(xsVar)));
        }
        this.xs.setCallback(this);
        this.f24550ab = xsVar;
        this.zjm = true;
        boolean zUef = this.xs.uef(xsVar, getContext().getApplicationContext());
        this.zjm = false;
        if (getDrawable() != this.xs || zUef) {
            if (!zUef) {
                sy();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<Object> it = this.dz.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.xs.xs(str);
    }

    public void setFailureListener(dj<Throwable> djVar) {
        this.lw = djVar;
    }

    public void setFallbackResource(int i5) {
        this.ivm = i5;
    }

    public void setFontAssetDelegate(com.bytedance.adsdk.oa.yo yoVar) {
        this.xs.uef(yoVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.xs.uef(map);
    }

    public void setFrame(int i5) {
        this.xs.yo(i5);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z2) {
        this.xs.xs(z2);
    }

    public void setImageAssetDelegate(com.bytedance.adsdk.oa.moa moaVar) {
        this.xs.uef(moaVar);
    }

    public void setImageAssetsFolder(String str) {
        this.xs.uef(str);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        cq();
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        cq();
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i5) {
        cq();
        super.setImageResource(i5);
    }

    public void setLottieAnimListener(uef uefVar) {
        this.ku = uefVar;
    }

    public void setLottieClicklistener(oa oaVar) {
        this.cp = oaVar;
    }

    public void setMaintainOriginalImageBounds(boolean z2) {
        this.xs.oa(z2);
    }

    public void setMaxFrame(int i5) {
        this.xs.oa(i5);
    }

    public void setMaxProgress(float f10) {
        this.xs.oa(f10);
    }

    public void setMinAndMaxFrame(String str) {
        this.xs.moa(str);
    }

    public void setMinFrame(int i5) {
        this.xs.uef(i5);
    }

    public void setMinProgress(float f10) {
        this.xs.uef(f10);
    }

    public void setOutlineMasksAndMattes(boolean z2) {
        this.xs.moa(z2);
    }

    public void setPerformanceTrackingEnabled(boolean z2) {
        this.xs.yo(z2);
    }

    public void setProgress(float f10) {
        uef(f10, true);
    }

    public void setRenderMode(oib oibVar) {
        this.xs.uef(oibVar);
    }

    public void setRepeatCount(int i5) {
        this.cq.add(moa.SET_REPEAT_COUNT);
        this.xs.lw(i5);
    }

    public void setRepeatMode(int i5) {
        this.cq.add(moa.SET_REPEAT_MODE);
        this.xs.moa(i5);
    }

    public void setSafeMode(boolean z2) {
        this.xs.ivm(z2);
    }

    public void setSpeed(float f10) {
        this.xs.yo(f10);
    }

    public void setTextDelegate(dhk dhkVar) {
        this.xs.uef(dhkVar);
    }

    public void setUseCompositionFrameRate(boolean z2) {
        this.xs.bcc(z2);
    }

    public void setView(View view) {
        this.xs.uef(view);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        cz czVar;
        if (!this.zjm && drawable == (czVar = this.xs) && czVar.orq()) {
            ivm();
        } else if (!this.zjm && (drawable instanceof cz)) {
            cz czVar2 = (cz) drawable;
            if (czVar2.orq()) {
                czVar2.pz();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    private void ab() {
        this.bs.removeCallbacksAndMessages(null);
    }

    private void bcc() {
        setSaveEnabled(false);
        this.wrv = true;
        setFallbackResource(0);
        setImageAssetsFolder("");
        uef(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false);
        uef(false, getContext().getApplicationContext());
        setIgnoreDisabledSystemAnimations(false);
        this.xs.uef(Boolean.valueOf(com.bytedance.adsdk.oa.ivm.ivm.uef(getContext()) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        cz();
        zjm();
        wrv();
    }

    private void bs() {
        this.f24550ab = null;
        this.xs.zjm();
    }

    private void cq() {
        cq<xs> cqVar = this.wk;
        if (cqVar != null) {
            cqVar.oa(this.yo);
            this.wk.moa(this.moa);
        }
    }

    private void cz() {
        uef(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.oa.ivm.8
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) throws NumberFormatException {
                ivm.this.oa(this);
                ivm.this.dz();
                ivm.this.dj();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dj() {
        final xs.uef globalConfig = getGlobalConfig();
        if (globalConfig == null || globalConfig.lw <= 0) {
            return;
        }
        if (TextUtils.isEmpty(globalConfig.ivm) && globalConfig.xs == null) {
            return;
        }
        int maxFrame = globalConfig.lw;
        if (maxFrame > getMaxFrame()) {
            maxFrame = (int) getMaxFrame();
        }
        final float maxFrame2 = maxFrame / getMaxFrame();
        uef(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oa.ivm.10
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < maxFrame2) {
                    return;
                }
                ivm.this.oa(this);
                if (ivm.this.cp != null) {
                    oa unused = ivm.this.cp;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dz() throws NumberFormatException {
        cz czVar;
        int i5;
        int i10;
        final int i11;
        if (this.f24550ab == null || (czVar = this.xs) == null) {
            return;
        }
        dhk dhkVarGsd = czVar.gsd();
        xs.yo yoVarBcc = this.f24550ab.bcc();
        if (yoVarBcc == null || dhkVarGsd == null) {
            return;
        }
        final int i12 = yoVarBcc.uef;
        if (i12 < 0) {
            Log.i("TMe", "--==--- timer fail, ke is invalid: ".concat(String.valueOf(i12)));
            return;
        }
        int[] iArr = yoVarBcc.lw;
        final int i13 = -1;
        if (iArr == null || iArr.length < 2) {
            i5 = -1;
            i10 = -1;
        } else {
            i10 = iArr[0];
            i5 = iArr[1];
        }
        String strUef = dhkVarGsd.uef(yoVarBcc.yo);
        String strUef2 = dhkVarGsd.uef(yoVarBcc.moa);
        try {
            i11 = Integer.parseInt(strUef);
            try {
                i13 = Integer.parseInt(strUef2);
            } catch (NumberFormatException unused) {
            }
        } catch (NumberFormatException unused2) {
            i11 = -1;
        }
        Log.i("TMe", "--==--- prepare timer, startS: " + i11 + ", lenS: " + i13);
        if (TextUtils.isEmpty(yoVarBcc.f24607oa)) {
            Log.i("TMe", "--==--- timer fail, id is invalid: " + yoVarBcc.f24607oa);
            return;
        }
        Log.i("TMe", "--==--- timer, id:" + yoVarBcc.f24607oa);
        com.bytedance.adsdk.oa.yo.yo.yo yoVarYo = yo(yoVarBcc.f24607oa);
        if (yoVarYo != null) {
            Log.i("TMe", "--==--- timer success");
            this.gr = yoVarBcc.ivm;
            this.f24551ue = yoVarBcc.xs;
            this.tpx = yoVarYo;
            this.orq = i11;
            this.gzw = i11 - i13;
            this.gsd = i10;
            this.rt = i5;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.orq);
            yoVarYo.uef(sb2.toString());
            uef(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oa.ivm.3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (ivm.this.getFrame() < i12 - 1 || ivm.this.getFrame() >= i12 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- enter timer point, frame: " + ivm.this.getFrame());
                    ivm.this.oa(this);
                    if (i11 < 0 || i13 < 0) {
                        Log.i("TMe", "--==--- enter timer callback, NOT start timer");
                    } else {
                        Log.i("TMe", "--==--- enter timer callback, start timer");
                        ivm.this.wk();
                    }
                    ivm.this.ivm();
                }
            });
        }
    }

    private void moa(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 >= f10 || f13 >= f11) {
            if (f12 / f13 >= f10 / f11) {
                float f14 = f10 / f12;
                matrix.preScale(f14, f14);
                matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f11 - (f13 * f14)) / 2.0f);
                return;
            } else {
                float f15 = f11 / f13;
                matrix.preScale(f15, f15);
                matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return;
            }
        }
        if (f12 / f13 >= f10 / f11) {
            float f16 = f10 / f12;
            matrix.preScale(f16, f16);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f11 - (f13 * f16)) / 2.0f);
        } else {
            float f17 = f11 / f13;
            matrix.preScale(f17, f17);
            matrix.postTranslate((f10 - (f12 * f17)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void oa(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = this.xs.getBounds().width();
        float fHeight = this.xs.getBounds().height();
        if (width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Matrix matrix = new Matrix();
        int i5 = AnonymousClass5.uef[getScaleType().ordinal()];
        if (i5 == 1) {
            uef(matrix, width, height, fWidth, fHeight);
        } else if (i5 == 2) {
            oa(matrix, width, height, fWidth, fHeight);
        } else if (i5 == 3) {
            yo(matrix, width, height, fWidth, fHeight);
        } else if (i5 == 4) {
            moa(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF, rectF2);
    }

    private void sy() {
        boolean zMoa = moa();
        setImageDrawable(null);
        setImageDrawable(this.xs);
        if (zMoa) {
            this.xs.cq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wk() {
        this.bs.postDelayed(this.pz, 1000L);
    }

    private void wrv() {
        uef(new Animator.AnimatorListener() { // from class: com.bytedance.adsdk.oa.ivm.11
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                dhk dhkVarGsd;
                final long jElapsedRealtime = SystemClock.elapsedRealtime() - ivm.this.dhk;
                ivm.this.oa(this);
                String playDelayedELExpressTimeS = ivm.this.getPlayDelayedELExpressTimeS();
                if (!TextUtils.isEmpty(playDelayedELExpressTimeS) && (dhkVarGsd = ivm.this.xs.gsd()) != null) {
                    try {
                        int i5 = Integer.parseInt(dhkVarGsd.uef(playDelayedELExpressTimeS)) * 1000;
                        if (ivm.this.dhk > 0) {
                            long jElapsedRealtime2 = (ivm.this.dhk + i5) - SystemClock.elapsedRealtime();
                            Log.i("TMe", "--==-- lottie delayed time: ".concat(String.valueOf(jElapsedRealtime2)));
                            if (jElapsedRealtime2 > 0) {
                                ivm.this.ivm();
                                ivm.this.setVisibility(8);
                                if (ivm.this.oib == null) {
                                    ivm.this.oib = new Handler(Looper.getMainLooper());
                                }
                                ivm.this.oib.removeCallbacksAndMessages(null);
                                ivm.this.oib.postDelayed(new Runnable() { // from class: com.bytedance.adsdk.oa.ivm.11.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Log.i("TMe", "--==-- lottie real start play");
                                        ivm.this.setVisibility(0);
                                        ivm.this.uef();
                                        ivm.this.uef(jElapsedRealtime);
                                    }
                                }, jElapsedRealtime2);
                                return;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                ivm.this.uef(jElapsedRealtime);
            }
        });
    }

    private void yo(Matrix matrix, float f10, float f11, float f12, float f13) {
        matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
    }

    private void zjm() {
        uef(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oa.ivm.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) throws NumberFormatException {
                int i5;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (!(animatedValue instanceof Float) || ((Float) animatedValue).floatValue() < 0.98f) {
                    return;
                }
                ivm.lw(ivm.this);
                xs.uef globalConfig = ivm.this.getGlobalConfig();
                if (globalConfig != null && (i5 = globalConfig.moa) > 0 && i5 > ivm.this.sy) {
                    ivm.this.dz();
                    ivm.this.uef();
                    ivm.this.setProgress(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else {
                    ivm.this.oa(this);
                    if (ivm.this.ku != null) {
                        uef unused = ivm.this.ku;
                    }
                }
            }
        });
    }

    public void ivm() {
        this.dj = false;
        this.xs.pz();
    }

    public void lw() {
        this.cq.add(moa.PLAY_OPTION);
        this.xs.ue();
    }

    public void setMaxFrame(String str) {
        this.xs.yo(str);
    }

    public void setMinFrame(String str) {
        this.xs.oa(str);
    }

    private com.bytedance.adsdk.oa.yo.yo.yo yo(String str) {
        com.bytedance.adsdk.oa.yo.yo.oa oaVarOa;
        cz czVar = this.xs;
        if (czVar == null || (oaVarOa = czVar.oa()) == null) {
            return null;
        }
        return uef(oaVarOa, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uef(long j8) {
        Map<String, Object> map;
        xs.uef globalConfig = getGlobalConfig();
        if (this.ku != null) {
            HashMap map2 = new HashMap();
            map2.put("duration", Long.valueOf(j8));
            if (globalConfig == null || (map = globalConfig.f24605oa) == null || map.isEmpty()) {
                return;
            }
            map2.putAll(globalConfig.f24605oa);
        }
    }

    public void setAnimation(String str) {
        this.bcc = str;
        this.cz = 0;
        setCompositionTask(oa(str));
    }

    public void yo() {
        this.xs.sy();
    }

    private zjm uef(String str) {
        cz czVar;
        xs xsVarGr;
        Map<String, zjm> mapAb;
        if (TextUtils.isEmpty(str) || (czVar = this.xs) == null || (xsVarGr = czVar.gr()) == null || (mapAb = xsVarGr.ab()) == null) {
            return null;
        }
        return mapAb.get(str);
    }

    public boolean moa() {
        return this.xs.orq();
    }

    private void oa(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 < f10 && f13 < f11) {
            matrix.postTranslate((f10 - f12) / 2.0f, (f11 - f13) / 2.0f);
            return;
        }
        if (f12 / f13 >= f10 / f11) {
            float f14 = f10 / f12;
            matrix.preScale(f14, f14);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (f11 - (f13 * f14)) / 2.0f);
        } else {
            float f15 = f11 / f13;
            matrix.preScale(f15, f15);
            matrix.postTranslate((f10 - (f12 * f15)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    private void uef(int[][] iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        try {
            int[] iArr2 = iArr[0];
            int i5 = iArr2[0];
            final int i10 = iArr2[1];
            if (i5 < 0 || i10 < 0) {
                return;
            }
            Log.i("TMe", "--==--- inel enter, play anim, startframe: ".concat(String.valueOf(i5)));
            ab();
            uef();
            setFrame(i5);
            uef(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.adsdk.oa.ivm.12
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (ivm.this.getFrame() < i10 - 1 || ivm.this.getFrame() >= i10 + 2) {
                        return;
                    }
                    Log.i("TMe", "--==--- inel enter, play anim end, endframe: " + i10 + ", realFrame: " + ivm.this.getFrame());
                    ivm.this.oa(this);
                    ivm.this.ivm();
                }
            });
        } catch (Throwable unused) {
        }
    }

    private cq<xs> oa(final String str) {
        if (isInEditMode()) {
            return new cq<>(new Callable<wrv<xs>>() { // from class: com.bytedance.adsdk.oa.ivm.2
                @Override // java.util.concurrent.Callable
                /* renamed from: uef, reason: merged with bridge method [inline-methods] */
                public wrv<xs> call() throws Exception {
                    return ivm.this.wrv ? bcc.yo(ivm.this.getContext(), str) : bcc.yo(ivm.this.getContext(), str, null);
                }
            }, true);
        }
        return this.wrv ? bcc.oa(getContext(), str) : bcc.oa(getContext(), str, (String) null);
    }

    public void oa(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.xs.oa(animatorUpdateListener);
    }

    private void uef(String str, String str2, JSONArray jSONArray) {
        xs.oa globalEvent = getGlobalEvent();
        if (globalEvent != null && str != null) {
            if (TextUtils.isEmpty(str2) && !str.contains("CSJNO")) {
                str2 = globalEvent.uef;
            }
            if ((jSONArray == null || jSONArray.length() <= 0) && !str.contains("CSJLELNO")) {
                jSONArray = globalEvent.yo;
            }
        }
        if (!TextUtils.isEmpty(str2) || jSONArray == null) {
            return;
        }
        jSONArray.length();
    }

    public void oa() {
        this.xs.bs();
    }

    public void oa(Animator.AnimatorListener animatorListener) {
        this.xs.oa(animatorListener);
    }

    private com.bytedance.adsdk.oa.yo.yo.uef uef(MotionEvent motionEvent) {
        com.bytedance.adsdk.oa.yo.yo.oa oaVarOa;
        cz czVar = this.xs;
        if (czVar == null || (oaVarOa = czVar.oa()) == null) {
            return null;
        }
        return uef(oaVarOa, motionEvent);
    }

    private com.bytedance.adsdk.oa.yo.yo.uef uef(com.bytedance.adsdk.oa.yo.yo.oa oaVar, MotionEvent motionEvent) {
        com.bytedance.adsdk.oa.yo.yo.uef uefVarUef;
        for (com.bytedance.adsdk.oa.yo.yo.uef uefVar : oaVar.wrv()) {
            if (uefVar instanceof com.bytedance.adsdk.oa.yo.yo.oa) {
                if (uefVar.bcc() && uefVar.ivm() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    RectF rectF = new RectF();
                    uefVar.uef(rectF, uefVar.moa(), true);
                    if (rectF.width() >= 3.0f && rectF.height() >= 3.0f && (uefVarUef = uef((com.bytedance.adsdk.oa.yo.yo.oa) uefVar, motionEvent)) != null) {
                        return uefVarUef;
                    }
                }
            } else if (uefVar.bcc() && uefVar.ivm() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                RectF rectF2 = new RectF();
                cz czVar = this.xs;
                if (czVar != null && czVar.xs()) {
                    uefVar.uef(rectF2, uefVar.moa(), true);
                    RectF rectFKu = this.xs.ku();
                    if (rectFKu != null) {
                        uef(rectF2, rectFKu);
                    }
                } else {
                    RectF rectF3 = new RectF();
                    uefVar.uef(rectF3, uefVar.moa(), true);
                    oa(rectF2, rectF3);
                }
                if (uef(motionEvent, rectF2)) {
                    return uefVar;
                }
            }
        }
        return null;
    }

    private boolean uef(MotionEvent motionEvent, RectF rectF) {
        if (motionEvent != null && rectF != null) {
            float x5 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (x5 >= rectF.left && x5 <= rectF.right && y10 >= rectF.top && y10 <= rectF.bottom) {
                return true;
            }
        }
        return false;
    }

    private void uef(RectF rectF, RectF rectF2) {
        float width = getWidth();
        float height = getHeight();
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        if (width == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fWidth == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fHeight == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        Matrix matrix = new Matrix();
        int i5 = AnonymousClass5.uef[getScaleType().ordinal()];
        if (i5 == 1) {
            uef(matrix, width, height, fWidth, fHeight);
        } else if (i5 == 2) {
            oa(matrix, width, height, fWidth, fHeight);
        } else if (i5 == 3) {
            yo(matrix, width, height, fWidth, fHeight);
        } else if (i5 == 4) {
            moa(matrix, width, height, fWidth, fHeight);
        }
        matrix.mapRect(rectF);
    }

    private void uef(Matrix matrix, float f10, float f11, float f12, float f13) {
        if (f12 / f13 >= f10 / f11) {
            float f14 = f11 / f13;
            matrix.preScale(f14, f14);
            matrix.postTranslate(-(((f12 * f14) - f10) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            float f15 = f10 / f12;
            matrix.preScale(f15, f15);
            matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -(((f13 * f15) - f11) / 2.0f));
        }
    }

    public void uef(boolean z2, Context context) {
        this.xs.uef(z2, context);
    }

    private cq<xs> uef(final int i5) {
        if (isInEditMode()) {
            return new cq<>(new Callable<wrv<xs>>() { // from class: com.bytedance.adsdk.oa.ivm.13
                @Override // java.util.concurrent.Callable
                /* renamed from: uef, reason: merged with bridge method [inline-methods] */
                public wrv<xs> call() throws Exception {
                    return ivm.this.wrv ? bcc.oa(ivm.this.getContext(), i5) : bcc.oa(ivm.this.getContext(), i5, (String) null);
                }
            }, true);
        }
        return this.wrv ? bcc.uef(getContext(), i5) : bcc.uef(getContext(), i5, (String) null);
    }

    public void uef(String str, String str2) {
        uef(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void uef(InputStream inputStream, String str) {
        setCompositionTask(bcc.uef(inputStream, str));
    }

    private com.bytedance.adsdk.oa.yo.yo.yo uef(com.bytedance.adsdk.oa.yo.yo.oa oaVar, String str) {
        for (com.bytedance.adsdk.oa.yo.yo.uef uefVar : oaVar.wrv()) {
            if (uefVar instanceof com.bytedance.adsdk.oa.yo.yo.oa) {
                com.bytedance.adsdk.oa.yo.yo.yo yoVarUef = uef((com.bytedance.adsdk.oa.yo.yo.oa) uefVar, str);
                if (yoVarUef != null) {
                    return yoVarUef;
                }
            } else if (TextUtils.equals(str, uefVar.cz()) && (uefVar instanceof com.bytedance.adsdk.oa.yo.yo.yo)) {
                return (com.bytedance.adsdk.oa.yo.yo.yo) uefVar;
            }
        }
        return null;
    }

    public void uef() {
        if (this.dhk == 0) {
            this.dhk = SystemClock.elapsedRealtime();
        }
        this.cq.add(moa.PLAY_OPTION);
        this.xs.dj();
    }

    public void uef(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.xs.uef(animatorUpdateListener);
    }

    public void uef(Animator.AnimatorListener animatorListener) {
        this.xs.uef(animatorListener);
    }

    public void uef(boolean z2) {
        this.xs.lw(z2 ? -1 : 0);
    }

    public Bitmap uef(String str, Bitmap bitmap) {
        return this.xs.uef(str, bitmap);
    }

    private void uef(float f10, boolean z2) {
        if (z2) {
            this.cq.add(moa.SET_PROGRESS);
        }
        this.xs.moa(f10);
    }
}
