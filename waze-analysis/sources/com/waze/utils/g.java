package com.waze.utils;

import android.graphics.Bitmap;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class g implements com.bumptech.glide.e.a.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h f44878a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f44879b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f44880c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f44881d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f44882e;

    g(i iVar, h hVar, Object obj, String str, int i2, int i3) {
        this.f44878a = hVar;
        this.f44879b = obj;
        this.f44880c = str;
        this.f44881d = i2;
        this.f44882e = i3;
        Objects.requireNonNull(iVar);
    }

    @Override // com.bumptech.glide.e.a.g
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        System.currentTimeMillis();
        Object obj2 = this.f44879b;
        this.f44878a.a((Bitmap) obj, obj2);
    }

    @Override // com.bumptech.glide.e.a.g
    public final com.bumptech.glide.e.d bm() {
        return null;
    }

    @Override // com.bumptech.glide.e.a.g
    public final void c() {
    }

    @Override // com.bumptech.glide.e.a.g
    public final void d(com.bumptech.glide.e.a.f fVar) {
        int i2;
        int i3 = this.f44881d;
        if (i3 <= 0 || (i2 = this.f44882e) <= 0) {
            fVar.g(Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            fVar.g(i3, i2);
        }
    }

    @Override // com.bumptech.glide.e.a.g
    public final void e(com.bumptech.glide.e.a.f fVar) {
    }

    @Override // com.bumptech.glide.e.a.g
    public final void f(com.bumptech.glide.e.d dVar) {
    }

    @Override // com.bumptech.glide.manager.g
    public final void g() {
    }

    @Override // com.bumptech.glide.manager.g
    public final void h() {
    }

    @Override // com.bumptech.glide.manager.g
    public final void i() {
    }

    @Override // com.bumptech.glide.e.a.g
    public final void l() {
        System.currentTimeMillis();
        this.f44878a.b();
        com.waze.shared_infra.i.h.j("Image manager: Failed loading image, image_url: ".concat(String.valueOf(this.f44880c)));
    }

    @Override // com.bumptech.glide.e.a.g
    public final void m() {
    }
}
