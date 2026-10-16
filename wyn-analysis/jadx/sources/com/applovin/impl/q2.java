package com.applovin.impl;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
public class q2 {

    /* renamed from: a, reason: collision with root package name */
    public TextView f22601a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f22602b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f22603c;

    /* renamed from: d, reason: collision with root package name */
    public ImageView f22604d;

    /* renamed from: e, reason: collision with root package name */
    private r2 f22605e;

    /* renamed from: f, reason: collision with root package name */
    private int f22606f;

    public void a(int i5) {
        this.f22606f = i5;
    }

    public r2 b() {
        return this.f22605e;
    }

    public int a() {
        return this.f22606f;
    }

    public void a(r2 r2Var) {
        this.f22605e = r2Var;
        this.f22601a.setText(r2Var.k());
        this.f22601a.setTextColor(r2Var.l());
        if (this.f22602b != null) {
            if (!TextUtils.isEmpty(r2Var.f())) {
                this.f22602b.setTypeface(null, 0);
                this.f22602b.setVisibility(0);
                this.f22602b.setText(r2Var.f());
                this.f22602b.setTextColor(r2Var.g());
                if (r2Var.p()) {
                    this.f22602b.setTypeface(null, 1);
                }
            } else {
                this.f22602b.setVisibility(8);
            }
        }
        if (this.f22603c != null) {
            if (r2Var.h() > 0) {
                this.f22603c.setImageResource(r2Var.h());
                this.f22603c.setColorFilter(r2Var.i());
                this.f22603c.setVisibility(0);
            } else {
                this.f22603c.setVisibility(8);
            }
        }
        if (this.f22604d != null) {
            if (r2Var.d() > 0) {
                this.f22604d.setImageResource(r2Var.d());
                this.f22604d.setColorFilter(r2Var.e());
                this.f22604d.setVisibility(0);
                return;
            }
            this.f22604d.setVisibility(8);
        }
    }
}
