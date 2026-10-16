package com.bytedance.sdk.openadsdk.ab.uef;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import com.bytedance.sdk.openadsdk.utils.gb;

/* loaded from: classes3.dex */
public class oa {
    private int bcc = 0;
    private int cz = 0;
    private String ivm;
    private boolean lw;
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private gzw f25152oa;
    private String uef;
    private int xs;
    private String yo;

    public int bcc() {
        return this.bcc;
    }

    public int cz() {
        return this.cz;
    }

    public String ivm() {
        return this.ivm;
    }

    public boolean lw() {
        return this.lw;
    }

    public int moa() {
        return this.moa;
    }

    public gzw oa() {
        return this.f25152oa;
    }

    public String uef() {
        return this.uef;
    }

    public int xs() {
        return this.xs;
    }

    public String yo() {
        gzw gzwVar;
        if (TextUtils.isEmpty(this.yo) && (gzwVar = this.f25152oa) != null) {
            this.yo = gb.uef(gzwVar);
        }
        return this.yo;
    }

    public void oa(String str) {
        this.yo = str;
    }

    public void uef(String str) {
        this.uef = str;
    }

    public void oa(int i5) {
        this.xs = i5;
    }

    public void uef(gzw gzwVar) {
        this.f25152oa = gzwVar;
    }

    public void uef(int i5) {
        this.moa = i5;
    }

    public void uef(boolean z2) {
        this.lw = z2;
    }

    public void yo(String str) {
        this.ivm = str;
    }
}
