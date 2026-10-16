package com.waze.realtime_report_feedback;

import com.waze.NativeManager;
import com.waze.hw;
import h.ab;
import h.g.a.l;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class j {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initNativeLayer$default(j jVar, l lVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initNativeLayer");
        }
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        jVar.initNativeLayer(lVar);
    }

    static final ab initNativeLayer$lambda$0(j jVar) {
        x.d(jVar, "null cannot be cast to non-null type com.waze.realtime_report_feedback.ReportFeedbackServiceProvider");
        ((ReportFeedbackServiceProvider) jVar).initNativeLayerNTV();
        return null;
    }

    static final void sendThumbsDownJNI$lambda$0(j jVar, int i2, String str) {
        x.d(jVar, "null cannot be cast to non-null type com.waze.realtime_report_feedback.ReportFeedbackServiceProvider");
        ((ReportFeedbackServiceProvider) jVar).sendThumbsDown(i2, str);
    }

    static final void sendThumbsUpJNI$lambda$0(j jVar, int i2, String str) {
        x.d(jVar, "null cannot be cast to non-null type com.waze.realtime_report_feedback.ReportFeedbackServiceProvider");
        ((ReportFeedbackServiceProvider) jVar).sendThumbsUp(i2, str);
    }

    public void initNativeLayer(final l<? super ab, ab> lVar) {
        NativeManager.runNativeTask(new hw() { // from class: com.waze.realtime_report_feedback.h
            @Override // com.waze.hw
            public final Object a() {
                j.initNativeLayer$lambda$0(this.f33528a);
                return null;
            }
        }, lVar != null ? new com.waze.jni.a() { // from class: com.waze.realtime_report_feedback.i
            @Override // com.waze.jni.a
            public final void a(Object obj) {
                lVar.invoke((ab) obj);
            }
        } : null);
    }

    public abstract void sendThumbsDown(int i2, String str);

    protected final void sendThumbsDownJNI(int i2, String str) {
        x.f(str, "alertUuid");
        NativeManager.runMainThreadTask(new g(this, i2, str, 0));
    }

    public abstract void sendThumbsUp(int i2, String str);

    protected final void sendThumbsUpJNI(int i2, String str) {
        x.f(str, "alertUuid");
        NativeManager.runMainThreadTask(new g(this, i2, str, 1));
    }

    public final void initNativeLayer() {
        initNativeLayer$default(this, null, 1, null);
    }
}
