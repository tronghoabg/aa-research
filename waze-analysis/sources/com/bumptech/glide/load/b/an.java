package com.bumptech.glide.load.b;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class an implements ae {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3225a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3226b;

    public an(int i2) {
        this.f3225a = i2;
        this.f3226b = new ag(null);
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        int i2 = this.f3225a;
        if (i2 == 0) {
            return new ao(this.f3226b, alVar.a(Uri.class, InputStream.class), 0);
        }
        if (i2 == 1) {
            return new s(this.f3226b, 2);
        }
        if (i2 == 2) {
            return new ao(this.f3226b, at.c(), 0);
        }
        if (i2 == 3) {
            return new com.bumptech.glide.load.b.a.a((ag) this.f3226b);
        }
        Object obj = this.f3226b;
        return i2 != 4 ? new com.bumptech.glide.load.b.a.b((Context) obj) : new s((Context) obj, 4, null);
    }

    public an(Object obj, int i2) {
        this.f3225a = i2;
        this.f3226b = obj;
    }
}
