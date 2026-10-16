package com.b.a.a.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.b.b.a.u;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b implements com.b.b.a.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.b.b.a.b f2548a;

    b(i iVar, com.b.b.a.b bVar) {
        this.f2548a = bVar;
        Objects.requireNonNull(iVar);
    }

    @Override // com.b.b.a.a
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        com.b.b.d.g gVar = (com.b.b.d.g) obj;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            byte[] bArr = gVar.f2638a;
            this.f2548a.f(u.b(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options)));
        } catch (Exception e2) {
            this.f2548a.e(e2);
        }
    }
}
