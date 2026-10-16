package com.bytedance.sdk.component.ivm.uef;

import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class xs {
    private static volatile com.bytedance.sdk.component.ivm.uef.lw.uef cz;
    private static xs wrv;
    private volatile lw bcc;
    private final AtomicBoolean cq = new AtomicBoolean(false);
    private volatile Map<Integer, com.bytedance.sdk.component.ivm.uef.oa.yo> dj;
    private long dz;
    private volatile com.bytedance.sdk.component.ivm.uef.moa.oa.uef ivm;
    private volatile com.bytedance.sdk.component.ivm.uef.moa.oa.uef lw;
    private volatile com.bytedance.sdk.component.ivm.uef.moa.oa.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private volatile com.bytedance.sdk.component.ivm.uef.moa.oa.uef f25017oa;
    private volatile Context uef;
    private volatile com.bytedance.sdk.component.ivm.uef.uef.lw xs;
    private volatile com.bytedance.sdk.component.ivm.uef.moa.oa.uef yo;
    private volatile com.bytedance.sdk.component.ivm.uef.oa.yo zjm;

    private xs() {
    }

    public static synchronized xs ivm() {
        try {
            if (wrv == null) {
                wrv = new xs();
            }
        } catch (Throwable th) {
            throw th;
        }
        return wrv;
    }

    public static com.bytedance.sdk.component.ivm.uef.lw.uef moa() {
        if (cz == null) {
            synchronized (xs.class) {
                try {
                    if (cz == null) {
                        cz = new com.bytedance.sdk.component.ivm.uef.lw.oa();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return cz;
    }

    public long ab() {
        return this.dz * 86400000;
    }

    public void bcc() {
        com.bytedance.sdk.component.ivm.uef.oa.moa.uef.oa();
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef cq() {
        return this.moa;
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef cz() {
        return this.ivm;
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef dj() {
        return this.f25017oa;
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef dz() {
        return this.lw;
    }

    public Context lw() {
        return this.uef;
    }

    public Map<Integer, com.bytedance.sdk.component.ivm.uef.oa.yo> oa() {
        return this.dj;
    }

    public boolean uef() {
        return this.cq.get();
    }

    public lw wk() {
        return this.bcc;
    }

    public com.bytedance.sdk.component.ivm.uef.moa.oa.uef wrv() {
        return this.yo;
    }

    public com.bytedance.sdk.component.ivm.uef.oa.yo xs() {
        return this.zjm;
    }

    public com.bytedance.sdk.component.ivm.uef.uef.lw yo() {
        return this.xs;
    }

    public void zjm() {
        com.bytedance.sdk.component.ivm.uef.oa.moa.uef.yo();
    }

    public void lw(com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
        this.lw = uefVar;
    }

    public void oa(com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
        this.f25017oa = uefVar;
    }

    public void uef(boolean z2) {
        this.cq.set(z2);
    }

    public void yo(com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
        this.yo = uefVar;
    }

    public void uef(com.bytedance.sdk.component.ivm.uef.uef.lw lwVar) {
        this.xs = lwVar;
    }

    public void uef(Context context) {
        this.uef = context;
    }

    public void uef(com.bytedance.sdk.component.ivm.uef.oa.yo yoVar) {
        this.zjm = yoVar;
    }

    public void uef(com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
        this.ivm = uefVar;
    }

    public void moa(com.bytedance.sdk.component.ivm.uef.moa.oa.uef uefVar) {
        this.moa = uefVar;
    }

    public void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar) {
        if (uefVar == null) {
            return;
        }
        uefVar.uef(System.currentTimeMillis());
        com.bytedance.sdk.component.ivm.uef.oa.moa.uef.uef(uefVar, uefVar.moa());
    }

    public void uef(String str, boolean z2) {
        com.bytedance.sdk.component.ivm.uef.ivm.uef.uef().uef(str, z2);
    }

    public void uef(String str, List<String> list, boolean z2, Map<String, String> map, int i5, String str2) {
        com.bytedance.sdk.component.ivm.uef.ivm.uef.uef().uef(str, list, z2, map, i5, str2);
    }

    public void uef(lw lwVar) {
        this.bcc = lwVar;
    }

    public void uef(long j8) {
        this.dz = j8;
    }
}
