package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes.dex */
public class t3 {

    /* renamed from: a, reason: collision with root package name */
    private a f23280a;

    /* renamed from: b, reason: collision with root package name */
    private String f23281b;

    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    public t3(a aVar, String str) {
        this.f23280a = aVar;
        this.f23281b = str;
    }

    public a a() {
        return this.f23280a;
    }

    public String b() {
        return this.f23281b;
    }

    public static t3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new t3(a.AD_UNIT_ID, str);
    }

    public static t3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new t3(a.AD_FORMAT, label);
    }

    public static t3 a(y2 y2Var) {
        String strO = y2Var.O();
        MaxAdFormat format = y2Var.getFormat();
        if (TextUtils.isEmpty(strO) || format == null) {
            return null;
        }
        return new q3(new j3(strO, format));
    }
}
