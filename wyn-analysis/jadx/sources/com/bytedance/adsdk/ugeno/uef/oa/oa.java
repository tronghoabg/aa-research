package com.bytedance.adsdk.ugeno.uef.oa;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.uef.lw;
import com.bytedance.adsdk.ugeno.xs.bcc;
import com.unity3d.services.UnityAdsConstants;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class oa extends uef {

    /* renamed from: com.bytedance.adsdk.ugeno.uef.oa.oa$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[lw.values().length];
            uef = iArr;
            try {
                iArr[lw.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uef[lw.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uef[lw.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                uef[lw.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                uef[lw.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                uef[lw.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                uef[lw.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                uef[lw.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                uef[lw.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public oa(Context context, com.bytedance.adsdk.ugeno.oa.yo yoVar, String str, TreeMap<Float, String> treeMap) {
        super(context, yoVar, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public TypeEvaluator ivm() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public void oa() {
        float fWk;
        switch (AnonymousClass1.uef[this.moa.ordinal()]) {
            case 1:
                fWk = this.xs.wk();
                break;
            case 2:
                fWk = this.xs.ab();
                break;
            case 3:
                fWk = this.xs.bs();
                break;
            case 4:
                fWk = this.xs.sy();
                break;
            case 5:
                fWk = this.xs.oib();
                if (this.xs.dj() != null) {
                    this.xs.dj().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 6:
                fWk = this.xs.dhk();
                if (this.xs.dj() != null) {
                    this.xs.dj().setCameraDistance(10000.0f);
                    break;
                }
                break;
            case 7:
                fWk = this.xs.tpx();
                break;
            case 8:
                fWk = this.xs.orq();
                break;
            case 9:
                fWk = this.xs.gzw();
                break;
            default:
                fWk = 0.0f;
                break;
        }
        this.lw.add(Keyframe.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fWk));
    }

    @Override // com.bytedance.adsdk.ugeno.uef.oa.uef
    public void uef(float f10, String str) {
        this.lw.add(Keyframe.ofFloat(f10, (this.f24767oa.startsWith(lw.TRANSLATE.uef()) || this.moa == lw.BORDER_RADIUS) ? bcc.uef(this.uef, com.bytedance.adsdk.ugeno.xs.yo.uef(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) : com.bytedance.adsdk.ugeno.xs.yo.uef(str, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }
}
