package com.waze.sound;

import android.net.Uri;
import androidx.media3.datasource.BaseDataSource;
import androidx.media3.datasource.DataSpec;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingDeque;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class gu extends BaseDataSource {

    /* renamed from: a, reason: collision with root package name */
    private static final gs f40103a = new gs(new byte[0]);

    /* renamed from: b, reason: collision with root package name */
    private final LinkedBlockingDeque f40104b;

    /* renamed from: c, reason: collision with root package name */
    private gs f40105c;

    /* renamed from: d, reason: collision with root package name */
    private Uri f40106d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f40107e;

    public gu() {
        super(true);
        this.f40104b = new LinkedBlockingDeque();
    }

    public final void a(byte[] bArr) {
        h.g.b.x.f(bArr, "bytes");
        this.f40104b.add(new gs(bArr));
    }

    public final void b() {
        this.f40104b.add(f40103a);
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f40104b.clear();
        this.f40105c = null;
        this.f40107e = false;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f40106d;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long open(DataSpec dataSpec) {
        h.g.b.x.f(dataSpec, "dataSpec");
        this.f40106d = dataSpec.uri;
        return -1L;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        h.g.b.x.f(bArr, "buffer");
        if (i3 == 0) {
            return 0;
        }
        while (!this.f40107e) {
            gs gsVar = this.f40105c;
            if (gsVar == null) {
                try {
                    gsVar = (gs) this.f40104b.take();
                    if (gsVar == f40103a) {
                        this.f40107e = true;
                    } else if (gsVar.c().length != 0) {
                        this.f40105c = gsVar;
                    }
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted while waiting for data", e2);
                }
            }
            int iMin = Math.min(i3, gsVar.c().length - gsVar.a());
            System.arraycopy(gsVar.c(), gsVar.a(), bArr, i2, iMin);
            gsVar.b(gsVar.a() + iMin);
            if (gsVar.a() == gsVar.c().length) {
                this.f40105c = null;
            }
            return iMin;
        }
        return -1;
    }
}
