package com.bumptech.glide.load.b.a;

import com.bumptech.glide.load.b.ad;
import com.bumptech.glide.load.b.ag;
import com.bumptech.glide.load.b.t;
import com.bumptech.glide.load.data.n;
import com.bumptech.glide.load.r;
import com.bumptech.glide.load.s;
import com.google.android.gms.common.api.internal.be;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements ad {

    /* renamed from: a, reason: collision with root package name */
    public static final r f3183a = r.c("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", Integer.valueOf(DisplayStrings.DS_REPORT_ALERT_ON));

    /* renamed from: b, reason: collision with root package name */
    private final ag f3184b;

    public a(ag agVar) {
        this.f3184b = agVar;
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ be b(Object obj, int i2, int i3, s sVar) {
        ag agVar = this.f3184b;
        t tVar = (t) obj;
        t tVar2 = (t) agVar.d(tVar);
        if (tVar2 == null) {
            agVar.e(tVar, tVar);
        } else {
            tVar = tVar2;
        }
        return new be(tVar, new n(tVar, ((Integer) sVar.b(f3183a)).intValue()));
    }
}
