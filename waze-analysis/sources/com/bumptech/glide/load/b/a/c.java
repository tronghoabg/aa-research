package com.bumptech.glide.load.b.a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.b.ad;
import com.bumptech.glide.load.b.ae;
import com.bumptech.glide.load.b.al;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class c implements ae {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3186a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f3187b;

    c(Context context, Class cls) {
        this.f3186a = context;
        this.f3187b = cls;
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        Class cls = this.f3187b;
        return new f(this.f3186a, alVar.a(File.class, cls), alVar.a(Uri.class, cls), cls);
    }
}
