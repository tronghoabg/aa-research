package com.applovin.impl;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.util.SparseArray;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.protobuf.ByteString;
import com.moloco.sdk.internal.publisher.C1915d;
import r9.C3955l;

/* loaded from: classes.dex */
public final /* synthetic */ class N implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20811c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f20812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f20813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20814f;

    public /* synthetic */ N(WebViewClient webViewClient, WebView webView, int i5, String str, String str2, int i10) {
        this.f20809a = i10;
        this.f20811c = webViewClient;
        this.f20812d = webView;
        this.f20810b = i5;
        this.f20813e = str;
        this.f20814f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20809a) {
            case 0:
                ((C1636f0) this.f20811c).a((SensorEventListener) this.f20812d, (Sensor) this.f20813e, this.f20810b, (com.applovin.impl.sdk.o) this.f20814f);
                break;
            case 1:
                long j8 = this.f20810b;
                C1915d c1915d = new C1915d(24);
                kd.T t10 = (kd.T) this.f20811c;
                t10.f39614a.h(t10, (WebView) this.f20812d, j8, (String) this.f20813e, (String) this.f20814f, c1915d);
                break;
            case 2:
                long j10 = this.f20810b;
                C1915d c1915d2 = new C1915d(25);
                kd.W w2 = (kd.W) this.f20811c;
                w2.f39626a.h(w2, (WebView) this.f20812d, j10, (String) this.f20813e, (String) this.f20814f, c1915d2);
                break;
            default:
                C3955l c3955l = (C3955l) this.f20811c;
                o9.j jVar = (o9.j) this.f20812d;
                s9.o oVar = jVar.f41460c;
                r9.S s10 = (r9.S) this.f20813e;
                if (oVar.compareTo(s10.f44600e) > 0) {
                    r9.S sA = s10.a(ByteString.EMPTY, oVar);
                    SparseArray sparseArray = c3955l.k;
                    int i5 = this.f20810b;
                    sparseArray.append(i5, sA);
                    r9.Q q4 = c3955l.f44639i;
                    q4.b(sA);
                    q4.j(i5);
                    q4.c((c9.d) this.f20814f, i5);
                }
                c3955l.f44640j.M(jVar);
                break;
        }
    }

    public /* synthetic */ N(Object obj, Object obj2, Object obj3, int i5, Object obj4, int i10) {
        this.f20809a = i10;
        this.f20811c = obj;
        this.f20812d = obj2;
        this.f20813e = obj3;
        this.f20810b = i5;
        this.f20814f = obj4;
    }
}
