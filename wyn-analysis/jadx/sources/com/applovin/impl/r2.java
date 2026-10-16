package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class r2 {

    /* renamed from: a, reason: collision with root package name */
    protected c f22642a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f22643b;

    /* renamed from: c, reason: collision with root package name */
    protected SpannedString f22644c;

    /* renamed from: d, reason: collision with root package name */
    protected SpannedString f22645d;

    /* renamed from: e, reason: collision with root package name */
    protected String f22646e;

    /* renamed from: f, reason: collision with root package name */
    protected String f22647f;

    /* renamed from: g, reason: collision with root package name */
    protected int f22648g;

    /* renamed from: h, reason: collision with root package name */
    protected int f22649h;

    /* renamed from: i, reason: collision with root package name */
    protected int f22650i;

    /* renamed from: j, reason: collision with root package name */
    protected int f22651j;
    protected int k;

    /* renamed from: l, reason: collision with root package name */
    protected int f22652l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f22653m;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final c f22654a;

        /* renamed from: b, reason: collision with root package name */
        boolean f22655b;

        /* renamed from: c, reason: collision with root package name */
        SpannedString f22656c;

        /* renamed from: d, reason: collision with root package name */
        SpannedString f22657d;

        /* renamed from: e, reason: collision with root package name */
        String f22658e;

        /* renamed from: f, reason: collision with root package name */
        String f22659f;

        /* renamed from: g, reason: collision with root package name */
        int f22660g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f22661h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f22662i = -16777216;

        /* renamed from: j, reason: collision with root package name */
        int f22663j = -16777216;
        int k = 0;

        /* renamed from: l, reason: collision with root package name */
        int f22664l = 0;

        /* renamed from: m, reason: collision with root package name */
        boolean f22665m;

        public b(c cVar) {
            this.f22654a = cVar;
        }

        public b a(boolean z2) {
            this.f22655b = z2;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f22656c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f22657d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f22658e = str;
            return this;
        }

        public b a(String str) {
            this.f22659f = str;
            return this;
        }

        public b b(int i5) {
            this.f22664l = i5;
            return this;
        }

        public b c(int i5) {
            this.f22663j = i5;
            return this;
        }

        public b d(int i5) {
            this.f22662i = i5;
            return this;
        }

        public b a(int i5) {
            this.f22661h = i5;
            return this;
        }

        public b b(boolean z2) {
            this.f22665m = z2;
            return this;
        }

        public b a(Context context) {
            this.f22661h = R.drawable.applovin_ic_disclosure_arrow;
            this.f22664l = AbstractC1650m0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public r2 a() {
            return new r2(this);
        }
    }

    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        SIMPLE(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f22673a;

        c(int i5) {
            this.f22673a = i5;
        }

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == SIMPLE ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f22673a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f22647f;
    }

    public String c() {
        return this.f22646e;
    }

    public int d() {
        return this.f22649h;
    }

    public int e() {
        return this.f22652l;
    }

    public SpannedString f() {
        return this.f22645d;
    }

    public int g() {
        return this.f22651j;
    }

    public int h() {
        return this.f22648g;
    }

    public int i() {
        return this.k;
    }

    public int j() {
        return this.f22642a.b();
    }

    public SpannedString k() {
        return this.f22644c;
    }

    public int l() {
        return this.f22650i;
    }

    public int m() {
        return this.f22642a.c();
    }

    public boolean o() {
        return this.f22643b;
    }

    public boolean p() {
        return this.f22653m;
    }

    public r2(c cVar) {
        this.f22648g = 0;
        this.f22649h = 0;
        this.f22650i = -16777216;
        this.f22651j = -16777216;
        this.k = 0;
        this.f22652l = 0;
        this.f22642a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private r2(b bVar) {
        this.f22648g = 0;
        this.f22649h = 0;
        this.f22650i = -16777216;
        this.f22651j = -16777216;
        this.k = 0;
        this.f22652l = 0;
        this.f22642a = bVar.f22654a;
        this.f22643b = bVar.f22655b;
        this.f22644c = bVar.f22656c;
        this.f22645d = bVar.f22657d;
        this.f22646e = bVar.f22658e;
        this.f22647f = bVar.f22659f;
        this.f22648g = bVar.f22660g;
        this.f22649h = bVar.f22661h;
        this.f22650i = bVar.f22662i;
        this.f22651j = bVar.f22663j;
        this.k = bVar.k;
        this.f22652l = bVar.f22664l;
        this.f22653m = bVar.f22665m;
    }
}
