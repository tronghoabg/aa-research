package com.bumptech.glide.f;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bumptech.glide.g.r;
import com.bumptech.glide.load.o;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a implements o {

    /* renamed from: b, reason: collision with root package name */
    private final int f2878b;

    /* renamed from: c, reason: collision with root package name */
    private final o f2879c;

    private a(int i2, o oVar) {
        this.f2878b = i2;
        this.f2879c = oVar;
    }

    public static o b(Context context) throws PackageManager.NameNotFoundException {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.a(context));
    }

    @Override // com.bumptech.glide.load.o
    public final void a(MessageDigest messageDigest) {
        this.f2879c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f2878b).array());
    }

    @Override // com.bumptech.glide.load.o
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f2878b == aVar.f2878b && this.f2879c.equals(aVar.f2879c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.o
    public final int hashCode() {
        return r.e(this.f2879c, this.f2878b);
    }
}
