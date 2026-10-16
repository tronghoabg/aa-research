package com.bumptech.glide.load.b.a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.b.ad;
import com.bumptech.glide.load.c.a.bc;
import com.bumptech.glide.load.n;
import com.bumptech.glide.load.s;
import com.google.android.gms.common.api.internal.be;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3185a;

    public b(Context context) {
        this.f3185a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* synthetic */ boolean a(Object obj) {
        return n.n((Uri) obj);
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ be b(Object obj, int i2, int i3, s sVar) {
        Long l2;
        Uri uri = (Uri) obj;
        if (n.o(i2, i3) && (l2 = (Long) sVar.b(bc.f3337a)) != null && l2.longValue() == -1) {
            return new be(new com.bumptech.glide.f.d(uri), com.bumptech.glide.load.data.a.c.e(this.f3185a, uri));
        }
        return null;
    }
}
