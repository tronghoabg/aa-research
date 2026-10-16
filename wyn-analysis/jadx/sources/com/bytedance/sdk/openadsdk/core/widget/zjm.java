package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
public class zjm extends xs {

    /* renamed from: oa, reason: collision with root package name */
    private long f25783oa;
    private long uef;

    public zjm(Context context) {
        super(context);
        setVisibility(8);
        setClickable(true);
    }

    public long getDisplayDuration() {
        if (this.uef == 0) {
            return 0L;
        }
        if (this.f25783oa == 0) {
            this.f25783oa = SystemClock.elapsedRealtime();
        }
        return this.f25783oa - this.uef;
    }

    public boolean moa() {
        return this.uef > 0 && this.f25783oa > 0;
    }

    public void oa(gzw gzwVar, int i5) {
        if (isShown()) {
            return;
        }
        oa();
        setVisibility(0);
        this.uef = SystemClock.elapsedRealtime();
        uef(gzwVar, i5);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.xs
    public boolean uef() {
        return false;
    }

    public void yo() {
        setVisibility(8);
        if (this.uef != 0) {
            this.f25783oa = SystemClock.elapsedRealtime();
        }
    }
}
