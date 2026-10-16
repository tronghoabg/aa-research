package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.pu;

/* loaded from: classes3.dex */
public class fz {
    private long bcc;
    private int cq;
    private long cz;
    private int dj;
    private long ivm;
    private long lw;

    /* renamed from: oa, reason: collision with root package name */
    public long f25676oa;
    public boolean uef;
    private long wrv;
    private long xs;
    private long zjm;
    private pu yo = pu.yo();
    private pu moa = pu.yo();

    public int bcc() {
        return this.dj;
    }

    public long cz() {
        return this.wrv;
    }

    public long ivm() {
        return this.cz;
    }

    public long lw() {
        return this.bcc;
    }

    public long moa() {
        return this.xs;
    }

    public void oa(pu puVar) {
        this.moa = puVar;
        this.cz = puVar.uef(this.yo);
    }

    public void uef(pu puVar, pu puVar2, int i5, pu puVar3) {
        this.lw = puVar.uef(this.yo);
        this.ivm = puVar2.uef(puVar);
        this.xs = i5;
        this.bcc = puVar3.uef(puVar2);
    }

    public long xs() {
        return this.zjm;
    }

    public long yo() {
        return this.ivm;
    }

    public synchronized int zjm() {
        return this.cq;
    }

    public long oa() {
        return this.lw;
    }

    public void oa(long j8) {
        this.wrv = j8;
    }

    public synchronized void oa(int i5) {
        this.cq = i5;
    }

    public void uef(pu puVar) {
        this.yo = puVar;
    }

    public pu uef() {
        return this.yo;
    }

    public void uef(long j8) {
        this.zjm = j8;
    }

    public void uef(int i5) {
        this.dj = i5;
    }
}
