package com.bytedance.sdk.component.ivm.uef.ivm;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class moa {
    private String bcc;
    private boolean dj;
    private final String ivm;
    private final int lw;

    /* renamed from: oa, reason: collision with root package name */
    private final String f24984oa;
    private final String uef;
    private String xs;
    private final boolean yo;
    private int moa = -1;
    private int cz = 0;
    private String zjm = null;

    public moa(String str, String str2, boolean z2, int i5, String str3) {
        this.uef = str;
        this.f24984oa = str2;
        this.yo = z2;
        this.lw = i5;
        this.ivm = str3;
    }

    public int bcc() {
        return this.cz;
    }

    public String cz() {
        return this.bcc;
    }

    public boolean dj() {
        return this.moa == -1;
    }

    public String ivm() {
        return this.ivm;
    }

    public int lw() {
        return this.lw;
    }

    public int moa() {
        return this.moa;
    }

    public String oa() {
        return this.f24984oa;
    }

    public String uef() {
        return this.uef;
    }

    public String xs() {
        return this.xs;
    }

    public boolean yo() {
        return this.yo;
    }

    public boolean zjm() {
        return this.dj;
    }

    public void oa(int i5) {
        this.cz = i5;
        if (i5 == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.xs)) {
            this.xs = String.valueOf(this.cz);
            return;
        }
        this.xs += "," + this.cz;
    }

    public void uef(int i5) {
        this.moa = i5;
    }

    public void yo(String str) {
        this.zjm = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.isEmpty(this.bcc)) {
            this.bcc = String.valueOf(this.zjm);
            return;
        }
        this.bcc += "," + this.zjm;
    }

    public void uef(String str) {
        this.xs = str;
    }

    public void uef(boolean z2) {
        this.dj = z2;
    }

    public Runnable uef(String str, Map<String, String> map) {
        return uef.uef().uef(this, str, map);
    }

    public void oa(String str) {
        this.bcc = str;
    }
}
