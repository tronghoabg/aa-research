package com.waze.ab;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.waze.google_assistant.ai;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private String f13790a;

    /* renamed from: b, reason: collision with root package name */
    private String f13791b;

    /* renamed from: c, reason: collision with root package name */
    private String f13792c;

    /* renamed from: d, reason: collision with root package name */
    private String f13793d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f13794e;

    /* renamed from: f, reason: collision with root package name */
    private int f13795f;

    /* renamed from: g, reason: collision with root package name */
    private int f13796g;

    /* renamed from: h, reason: collision with root package name */
    private int f13797h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f13798i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f13799j;

    /* renamed from: k, reason: collision with root package name */
    private DialogInterface.OnCancelListener f13800k;

    /* renamed from: l, reason: collision with root package name */
    private h f13801l;
    private View m;
    private final int n = 0;
    private ai o;

    public final void n(String str) {
        this.f13792c = str;
    }

    public final void o() {
        this.f13798i = true;
    }

    public final void p(Drawable drawable) {
        this.f13794e = drawable;
    }

    public final void q(int i2) {
        this.f13797h = i2;
    }

    public final void r(h hVar) {
        this.f13801l = hVar;
    }

    public final void s(DialogInterface.OnCancelListener onCancelListener) {
        this.f13800k = onCancelListener;
    }

    public final void t(String str) {
        this.f13791b = str;
    }

    public final void u(String str) {
        this.f13790a = str;
    }

    public final void w(ai aiVar) {
        this.o = aiVar;
    }
}
