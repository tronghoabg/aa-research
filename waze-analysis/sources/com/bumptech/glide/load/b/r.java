package com.bumptech.glide.load.b;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f3270a;

    r(int i2) {
        this.f3270a = i2;
    }

    @Override // com.bumptech.glide.load.b.q
    public final Class a() {
        return this.f3270a != 0 ? ParcelFileDescriptor.class : InputStream.class;
    }

    @Override // com.bumptech.glide.load.b.q
    public final /* synthetic */ Object b(File file) {
        return this.f3270a != 0 ? ParcelFileDescriptor.open(file, 268435456) : new FileInputStream(file);
    }

    @Override // com.bumptech.glide.load.b.q
    public final /* synthetic */ void c(Object obj) throws IOException {
        if (this.f3270a != 0) {
            ((ParcelFileDescriptor) obj).close();
        } else {
            ((InputStream) obj).close();
        }
    }
}
