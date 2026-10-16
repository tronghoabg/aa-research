package com.bumptech.glide.load.b;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    private final Resources.Theme f3258a;

    /* renamed from: b, reason: collision with root package name */
    private final Resources f3259b;

    /* renamed from: c, reason: collision with root package name */
    private final m f3260c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3261d;

    /* renamed from: e, reason: collision with root package name */
    private Object f3262e;

    l(Resources.Theme theme, Resources resources, m mVar, int i2) {
        this.f3258a = theme;
        this.f3259b = resources;
        this.f3260c = mVar;
        this.f3261d = i2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return this.f3260c.a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() {
        Object obj = this.f3262e;
        if (obj != null) {
            try {
                this.f3260c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, com.bumptech.glide.load.data.d dVar) {
        try {
            Object objC = this.f3260c.c(this.f3258a, this.f3259b, this.f3261d);
            this.f3262e = objC;
            dVar.b(objC);
        } catch (Resources.NotFoundException e2) {
            dVar.e(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
