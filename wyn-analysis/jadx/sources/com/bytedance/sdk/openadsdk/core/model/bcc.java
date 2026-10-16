package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;

/* loaded from: classes3.dex */
public class bcc {
    private int ivm;
    private List<String> lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25660oa;
    private int uef;
    private int xs;
    private List<Integer> yo;

    public List<Integer> ivm() {
        return this.yo;
    }

    public int lw() {
        return this.f25660oa;
    }

    public int moa() {
        return this.uef;
    }

    public int oa() {
        int i5 = this.xs;
        if (i5 >= 2) {
            return i5;
        }
        return 0;
    }

    public boolean uef() {
        return this.ivm == 1;
    }

    public int xs() {
        return this.moa;
    }

    public List<String> yo() {
        return this.lw;
    }

    public void lw(int i5) {
        this.moa = i5;
    }

    public void moa(int i5) {
        this.f25660oa = i5;
    }

    public void oa(int i5) {
        this.xs = i5;
    }

    public void uef(int i5) {
        this.ivm = i5;
    }

    public void yo(int i5) {
        this.uef = i5;
    }

    public void oa(List<Integer> list) {
        this.yo = list;
    }

    public void uef(List<String> list) {
        this.lw = list;
    }
}
