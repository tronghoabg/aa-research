package com.bytedance.adsdk.oa.yo.oa;

import android.graphics.Paint;
import com.bytedance.adsdk.oa.uef.uef.dhk;
import java.util.List;

/* loaded from: classes.dex */
public class sy implements yo {
    private final oa bcc;
    private final float cz;
    private final com.bytedance.adsdk.oa.yo.uef.oa ivm;
    private final com.bytedance.adsdk.oa.yo.uef.moa lw;
    private final com.bytedance.adsdk.oa.yo.uef.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.adsdk.oa.yo.uef.oa f24627oa;
    private final String uef;
    private final uef xs;
    private final List<com.bytedance.adsdk.oa.yo.uef.oa> yo;
    private final boolean zjm;

    /* renamed from: com.bytedance.adsdk.oa.yo.oa.sy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: oa, reason: collision with root package name */
        static final /* synthetic */ int[] f24628oa;
        static final /* synthetic */ int[] uef;

        static {
            int[] iArr = new int[oa.values().length];
            f24628oa = iArr;
            try {
                iArr[oa.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24628oa[oa.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24628oa[oa.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[uef.values().length];
            uef = iArr2;
            try {
                iArr2[uef.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                uef[uef.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                uef[uef.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum oa {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join uef() {
            int i5 = AnonymousClass1.f24628oa[ordinal()];
            if (i5 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i5 == 2) {
                return Paint.Join.MITER;
            }
            if (i5 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public enum uef {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap uef() {
            int i5 = AnonymousClass1.uef[ordinal()];
            return i5 != 1 ? i5 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public sy(String str, com.bytedance.adsdk.oa.yo.uef.oa oaVar, List<com.bytedance.adsdk.oa.yo.uef.oa> list, com.bytedance.adsdk.oa.yo.uef.uef uefVar, com.bytedance.adsdk.oa.yo.uef.moa moaVar, com.bytedance.adsdk.oa.yo.uef.oa oaVar2, uef uefVar2, oa oaVar3, float f10, boolean z2) {
        this.uef = str;
        this.f24627oa = oaVar;
        this.yo = list;
        this.moa = uefVar;
        this.lw = moaVar;
        this.ivm = oaVar2;
        this.xs = uefVar2;
        this.bcc = oaVar3;
        this.cz = f10;
        this.zjm = z2;
    }

    public oa bcc() {
        return this.bcc;
    }

    public float cz() {
        return this.cz;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa ivm() {
        return this.f24627oa;
    }

    public List<com.bytedance.adsdk.oa.yo.uef.oa> lw() {
        return this.yo;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa moa() {
        return this.ivm;
    }

    public com.bytedance.adsdk.oa.yo.uef.uef oa() {
        return this.moa;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new dhk(czVar, uefVar, this);
    }

    public uef xs() {
        return this.xs;
    }

    public com.bytedance.adsdk.oa.yo.uef.moa yo() {
        return this.lw;
    }

    public boolean zjm() {
        return this.zjm;
    }

    public String uef() {
        return this.uef;
    }
}
