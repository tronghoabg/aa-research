package com.bumptech.glide.load.b;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k implements ae, m {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3256a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f3257b;

    k(Context context, int i2) {
        this.f3257b = i2;
        this.f3256a = context;
    }

    @Override // com.bumptech.glide.load.b.m
    public final Class a() {
        int i2 = this.f3257b;
        return i2 != 0 ? i2 != 1 ? InputStream.class : AssetFileDescriptor.class : Drawable.class;
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        int i2 = this.f3257b;
        return i2 != 0 ? i2 != 1 ? new n(this.f3256a, this) : new n(this.f3256a, this) : new n(this.f3256a, this);
    }

    @Override // com.bumptech.glide.load.b.m
    public final /* synthetic */ Object c(Resources.Theme theme, Resources resources, int i2) {
        int i3 = this.f3257b;
        return i3 != 0 ? i3 != 1 ? resources.openRawResource(i2) : resources.openRawResourceFd(i2) : com.bumptech.glide.load.c.c.d.a(this.f3256a, i2, theme);
    }

    @Override // com.bumptech.glide.load.b.m
    public final /* synthetic */ void d(Object obj) throws IOException {
        int i2 = this.f3257b;
        if (i2 == 0) {
        } else if (i2 != 1) {
            ((InputStream) obj).close();
        } else {
            ((AssetFileDescriptor) obj).close();
        }
    }
}
