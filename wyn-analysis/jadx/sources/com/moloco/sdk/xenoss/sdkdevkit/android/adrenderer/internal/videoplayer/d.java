package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import Ef.H;
import android.net.Uri;
import com.moloco.sdk.internal.MolocoLogger;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Map;
import jf.C3109i;
import kotlin.jvm.internal.AbstractC3340k;
import t6.InterfaceC4144l;
import t6.K;

/* loaded from: classes4.dex */
public final class d implements InterfaceC4144l {

    /* renamed from: a, reason: collision with root package name */
    public final String f32215a;

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o f32216b;

    /* renamed from: c, reason: collision with root package name */
    public RandomAccessFile f32217c;

    /* renamed from: d, reason: collision with root package name */
    public long f32218d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f32219e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f32220f;

    public d(String url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o mediaCacheRepository) {
        AbstractC3340k.e(url, "url");
        AbstractC3340k.e(mediaCacheRepository, "mediaCacheRepository");
        this.f32215a = url;
        this.f32216b = mediaCacheRepository;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h b(String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) H.I(C3109i.f38759a, new c(this, str, null));
    }

    @Override // t6.InterfaceC4144l
    public final void close() {
        try {
            RandomAccessFile randomAccessFile = this.f32217c;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } finally {
            this.f32217c = null;
        }
    }

    @Override // t6.InterfaceC4144l
    public final Map d() {
        return Collections.EMPTY_MAP;
    }

    @Override // t6.InterfaceC4144l
    public final Uri k() {
        return Uri.parse(this.f32215a);
    }

    @Override // t6.InterfaceC4141i
    public final int read(byte[] buffer, int i5, int i10) throws IOException {
        IOException iOException;
        int i11;
        AbstractC3340k.e(buffer, "buffer");
        try {
            if (i10 == 0) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Read length is 0", null, false, 12, null);
                return 0;
            }
            long j8 = this.f32218d;
            String str = this.f32215a;
            if (j8 == 0 && (b(str) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Media stream is complete", null, false, 12, null);
                return -1;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVarB = b(str);
            if (hVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Streaming failed: " + str, null, false, 12, null);
                this.f32220f = true;
                return 0;
            }
            if (hVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) {
                RandomAccessFile randomAccessFile = this.f32217c;
                i = randomAccessFile != null ? randomAccessFile.read(buffer, i5, i10) : 0;
                if (i > 0) {
                    this.f32219e = true;
                    this.f32218d -= i;
                }
                return i;
            }
            loop0: while (true) {
                i11 = 0;
                while (i11 <= 0) {
                    try {
                        if (!(b(str) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f)) {
                            break loop0;
                        }
                        RandomAccessFile randomAccessFile2 = this.f32217c;
                        if (randomAccessFile2 != null) {
                            i11 = randomAccessFile2.read(buffer, i5, i10);
                        }
                    } catch (IOException e7) {
                        iOException = e7;
                        i = i11;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Waiting for more data", iOException, false, 8, null);
                        return i;
                    }
                }
            }
            if (i11 > 0) {
                this.f32219e = true;
                this.f32218d -= i11;
            }
            return i11;
        } catch (IOException e10) {
            iOException = e10;
        }
    }

    @Override // t6.InterfaceC4144l
    public final long t(t6.n dataSpec) {
        AbstractC3340k.e(dataSpec, "dataSpec");
        return ((Number) H.I(C3109i.f38759a, new b(this, dataSpec, null))).longValue();
    }

    @Override // t6.InterfaceC4144l
    public final void z(K transferListener) {
        AbstractC3340k.e(transferListener, "transferListener");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "addTransferListener", null, false, 12, null);
    }
}
