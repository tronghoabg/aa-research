package com.bumptech.glide.load.b;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements ae {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3253a;

    public f(int i2) {
        this.f3253a = i2;
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        int i2 = this.f3253a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? new s(alVar.a(Uri.class, InputStream.class), 3) : new s(alVar.a(Uri.class, ParcelFileDescriptor.class), 3) : new h() : new s(new e(this, 1, null), 1) : new s(new e(this, 0), 1);
    }
}
