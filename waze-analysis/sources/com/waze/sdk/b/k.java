package com.waze.sdk.b;

import android.graphics.Bitmap;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k implements com.b.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f35289a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f35290b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f35291c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f35292d;

    k(m mVar, int i2, com.b.b.d.l lVar, int i3) {
        this.f35292d = i3;
        this.f35289a = i2;
        this.f35291c = lVar;
        Objects.requireNonNull(mVar);
        this.f35290b = mVar;
    }

    @Override // com.b.b.a.a
    public final /* synthetic */ void a(Object obj) {
        if (this.f35292d == 0) {
            Bitmap bitmap = (Bitmap) obj;
            m.aj("getTrackImage success  (retryCount=" + this.f35289a + ")");
            m mVar = this.f35290b;
            mVar.an(bitmap);
            mVar.n = (com.b.b.d.i) this.f35291c;
            mVar.m = bitmap;
            return;
        }
        String str = ((com.b.b.d.l) this.f35291c).f2661d;
        StringBuilder sb = new StringBuilder("Downloaded image for Playlist ");
        int i2 = this.f35289a;
        sb.append(i2);
        sb.append(" ");
        sb.append(str);
        m.aj(sb.toString());
        m mVar2 = this.f35290b;
        mVar2.f35297c.add(i2, (Bitmap) obj);
        int i3 = mVar2.f35303i;
        mVar2.f35303i = i3 + 1;
        mVar2.U(i3);
        m.P(mVar2, mVar2.f35302h);
    }

    k(m mVar, int i2, com.b.b.d.i iVar, int i3) {
        this.f35292d = i3;
        this.f35289a = i2;
        this.f35291c = iVar;
        Objects.requireNonNull(mVar);
        this.f35290b = mVar;
    }
}
