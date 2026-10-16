package com.bytedance.sdk.component.yo.uef;

import A.AbstractC0213f;
import android.os.SystemClock;

/* loaded from: classes.dex */
public class uef {
    long bcc;
    long ivm;
    long lw;
    long moa;

    /* renamed from: oa, reason: collision with root package name */
    long f25121oa;
    long uef = SystemClock.elapsedRealtime();
    long xs;
    long yo;

    public long bcc() {
        return this.moa;
    }

    public void cq() {
        this.bcc = SystemClock.elapsedRealtime();
    }

    public long cz() {
        return this.lw;
    }

    public void dj() {
        this.xs = SystemClock.elapsedRealtime();
    }

    public long dz() {
        return this.f25121oa;
    }

    public long ivm() {
        return this.ivm;
    }

    public void lw() {
        this.ivm = SystemClock.elapsedRealtime();
    }

    public long moa() {
        return this.uef;
    }

    public void oa() {
        this.moa = SystemClock.elapsedRealtime();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("RequestHttpTime{requestBuildTs=");
        sb2.append(this.uef);
        sb2.append(", asyncCallExecTs=");
        sb2.append(this.f25121oa);
        sb2.append(", requestStartExecTs=");
        sb2.append(this.yo);
        sb2.append(", requestConnectStartTs=");
        sb2.append(this.moa);
        sb2.append(", requestConnectFinishTs=");
        sb2.append(this.lw);
        sb2.append(", reqCallServerStartTs=");
        sb2.append(this.xs);
        sb2.append(", reqCallServerFinishTs=");
        return AbstractC0213f.e(sb2, this.bcc, '}');
    }

    public void uef() {
        this.yo = SystemClock.elapsedRealtime();
    }

    public void wk() {
        this.f25121oa = SystemClock.elapsedRealtime();
    }

    public long wrv() {
        return this.bcc;
    }

    public long xs() {
        return this.yo;
    }

    public void yo() {
        this.lw = SystemClock.elapsedRealtime();
    }

    public long zjm() {
        return this.xs;
    }
}
