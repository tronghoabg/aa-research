package com.bumptech.glide.load.b;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o implements ae {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3265a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f3266b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(int i2) {
        this(new r(1), 0);
        this.f3265a = i2;
    }

    @Override // com.bumptech.glide.load.b.ae
    public final ad b(al alVar) {
        int i2 = this.f3265a;
        if (i2 == 0) {
            return new s(this.f3266b, 0);
        }
        if (i2 == 1) {
            return new at(1, null);
        }
        Object obj = this.f3266b;
        if (i2 != 2) {
            return new ap((Context) obj, alVar.a(Integer.class, InputStream.class));
        }
        return new ap((Context) obj, alVar.a(Integer.class, AssetFileDescriptor.class));
    }

    public o(q qVar, int i2) {
        this.f3265a = i2;
        this.f3266b = qVar;
    }

    o(Context context, int i2) {
        this.f3265a = i2;
        this.f3266b = context;
    }

    public o(int i2, byte[] bArr) {
        this.f3265a = i2;
        this.f3266b = new j(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(byte[] bArr, int i2) {
        this(new r(0), 0);
        this.f3265a = i2;
    }
}
