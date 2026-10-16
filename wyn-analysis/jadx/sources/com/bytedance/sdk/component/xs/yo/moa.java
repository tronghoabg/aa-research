package com.bytedance.sdk.component.xs.yo;

/* loaded from: classes.dex */
public class moa {

    /* renamed from: oa, reason: collision with root package name */
    private oa f25117oa;
    private uef uef;

    public interface oa {
    }

    public enum uef {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public static class yo {
        private static final moa uef = new moa();
    }

    public static void uef(uef uefVar) {
        synchronized (moa.class) {
            yo.uef.uef = uefVar;
        }
    }

    private moa() {
        this.uef = uef.OFF;
        this.f25117oa = new com.bytedance.sdk.component.xs.yo.oa();
    }
}
