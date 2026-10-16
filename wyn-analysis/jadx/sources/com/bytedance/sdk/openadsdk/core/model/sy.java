package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public class sy {
    private String ivm;
    private boolean lw;
    private double moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25709oa;
    private String uef;
    private int yo;

    public boolean ivm() {
        return this.lw;
    }

    public boolean lw() {
        return !TextUtils.isEmpty(this.uef) && this.f25709oa > 0 && this.yo > 0;
    }

    public double moa() {
        return this.moa;
    }

    public int oa() {
        return this.f25709oa;
    }

    public String uef() {
        return this.uef;
    }

    public String xs() {
        return this.ivm;
    }

    public int yo() {
        return this.yo;
    }

    public void oa(int i5) {
        this.yo = i5;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void oa(String str) {
        this.ivm = str;
    }

    public void uef(int i5) {
        this.f25709oa = i5;
    }

    public void uef(boolean z2) {
        this.lw = z2;
    }
}
