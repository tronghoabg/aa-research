package com.bytedance.sdk.component.cz.uef;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private static volatile uef f24981oa;
    private volatile oa uef;

    private uef() {
    }

    public static uef uef() {
        if (f24981oa == null) {
            synchronized (uef.class) {
                try {
                    if (f24981oa == null) {
                        f24981oa = new uef();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f24981oa;
    }

    public oa oa() {
        return this.uef;
    }

    public void uef(oa oaVar) {
        this.uef = oaVar;
    }
}
