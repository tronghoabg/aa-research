package com.bytedance.sdk.openadsdk.core.model;

/* loaded from: classes3.dex */
public class oib {

    /* renamed from: oa, reason: collision with root package name */
    public static int f25702oa = 2;
    public static int uef = 1;
    private int yo = 5;
    private int moa = 30;
    private int lw = 70;
    private int ivm = 1;
    private int xs = uef;
    private int bcc = 0;
    private int cz = 0;
    private int zjm = 3;

    public int bcc() {
        return this.xs;
    }

    public int ivm() {
        return this.lw;
    }

    public int lw() {
        return this.moa;
    }

    public int moa() {
        return this.yo;
    }

    public int oa() {
        return this.cz;
    }

    public int uef() {
        return this.zjm;
    }

    public int xs() {
        return this.ivm;
    }

    public int yo() {
        return this.bcc;
    }

    public void bcc(int i5) {
        this.xs = i5;
    }

    public void ivm(int i5) {
        this.lw = i5;
    }

    public void lw(int i5) {
        this.moa = i5;
    }

    public void moa(int i5) {
        this.yo = i5;
    }

    public void oa(int i5) {
        this.cz = i5;
    }

    public void uef(int i5) {
        this.zjm = i5;
    }

    public void xs(int i5) {
        this.ivm = i5;
    }

    public void yo(int i5) {
        this.bcc = i5;
    }

    public boolean uef(boolean z2) {
        if (z2) {
            int i5 = this.bcc;
            return i5 == 1 || i5 == 3;
        }
        int i10 = this.bcc;
        return i10 == 3 || i10 == 2;
    }
}
