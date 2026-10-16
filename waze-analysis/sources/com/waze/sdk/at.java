package com.waze.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class at implements com.waze.utils.h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f35255a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f35256b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f35257c;

    at(ae aeVar, String str, int i2) {
        this.f35257c = i2;
        this.f35256b = str;
        Objects.requireNonNull(aeVar);
        this.f35255a = aeVar;
    }

    @Override // com.waze.utils.h
    public final void a(Bitmap bitmap, Object obj) {
        int i2 = this.f35257c;
        Object obj2 = this.f35255a;
        if (i2 != 0) {
            ((ae) obj2).I.setImageBitmap(bitmap);
        } else {
            au.c((au) this.f35256b, new BitmapDrawable(((Context) obj2).getResources(), bitmap));
        }
    }

    @Override // com.waze.utils.h
    public final void b() {
        if (this.f35257c != 0) {
            com.waze.shared_infra.i.h.a("WazeSdk: Failed to load song poster: ".concat((String) this.f35256b));
            return;
        }
        Object obj = this.f35255a;
        au auVar = (au) this.f35256b;
        au.c(auVar, SdkConfiguration.getSystemAppIcon((Context) obj, auVar.f35258a));
    }

    at(au auVar, Context context, int i2) {
        this.f35257c = i2;
        this.f35255a = context;
        Objects.requireNonNull(auVar);
        this.f35256b = auVar;
    }
}
