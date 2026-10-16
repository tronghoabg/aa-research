package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import Ef.E;
import com.moloco.sdk.internal.MolocoLogger;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import ef.C2515C;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class b extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f32211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t6.n f32212b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, t6.n nVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32211a = dVar;
        this.f32212b = nVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new b(this.f32211a, this.f32212b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws IOException {
        File file;
        t6.n nVar = this.f32212b;
        d dVar = this.f32211a;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        try {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h hVarB = dVar.b(dVar.f32215a);
            boolean z2 = hVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d;
            String str = dVar.f32215a;
            if (z2) {
                file = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) hVarB).f30329a;
            } else {
                if (!(hVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f)) {
                    dVar.f32220f = true;
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Failed to download file: " + str, null, false, 12, null);
                    throw new IOException("Cannot read file: " + str);
                }
                file = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) hVarB).f30331a;
            }
            if (!file.exists()) {
                throw new IOException("Cannot read file, does not exist yet: " + str);
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            randomAccessFile.seek(nVar.f45883e);
            dVar.f32217c = randomAccessFile;
            long length = nVar.f45884f;
            if (length == -1) {
                length = file.length() - nVar.f45883e;
            }
            dVar.f32218d = length;
            if (length == 0 && dVar.f32219e && (hVarB instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) && AbstractC3340k.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f) hVarB).f30332b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.f30335a)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Streaming error likely detected", null, false, 12, null);
                dVar.f32220f = true;
            }
            return new Long(dVar.f32218d);
        } catch (IOException e7) {
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            dVar.getClass();
            MolocoLogger.error$default(molocoLogger, "ProgressiveMediaFileDataSource", "Failed to open file: " + dVar.f32215a, e7, false, 8, null);
            throw e7;
        }
    }
}
