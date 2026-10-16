package com.bytedance.adsdk.ugeno.yoga;

/* loaded from: classes.dex */
public class wrv extends YogaNodeJNIBase {
    public void cq() {
        long j8 = this.uef;
        if (j8 != 0) {
            this.uef = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j8);
        }
    }

    public void finalize() throws Throwable {
        try {
            cq();
        } finally {
            super.finalize();
        }
    }
}
