package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import Hf.InterfaceC0602l;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a;
import ef.C2515C;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class D extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f31131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f31132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2097a f31133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(E e7, C2097a c2097a, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31132b = e7;
        this.f31133c = c2097a;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new D(this.f31132b, this.f31133c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((D) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0602l f0Var;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31131a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        E e7 = this.f31132b;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.o oVar = e7.f31146c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = this.f31133c.f31597a;
        oVar.getClass();
        String url = iVar.f31991d;
        AbstractC3340k.e(url, "url");
        com.moloco.sdk.internal.A aB = oVar.b();
        if (aB instanceof com.moloco.sdk.internal.y) {
            f0Var = new Hf.f0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.n(aB, null));
        } else {
            if (!(aB instanceof com.moloco.sdk.internal.z)) {
                throw new E5.Q((byte) 0, 9);
            }
            File file = (File) ((com.moloco.sdk.internal.z) aB).f29794a;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "MediaCacheRepository", "Collecting status for media file: ".concat(url), null, false, 12, null);
            File file2 = new File(file, U8.v0.k(url));
            if (file2.exists() && oVar.f30309b.j(file2)) {
                f0Var = new Hf.f0(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m(file2, null));
            } else {
                MolocoLogger.info$default(molocoLogger, "MediaCacheRepository", "Media file needs to be downloaded: ".concat(url), null, false, 12, null);
                ConcurrentHashMap concurrentHashMap = oVar.f30314g;
                Object cVar = concurrentHashMap.get(url);
                if (cVar == null) {
                    MolocoLogger.info$default(molocoLogger, "MediaCacheRepository", "Download has not yet started for: ".concat(url), null, false, 12, null);
                    cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f(file2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.i.f30335a));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(url, cVar);
                    if (objPutIfAbsent != null) {
                        cVar = objPutIfAbsent;
                    }
                }
                f0Var = ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c) cVar).f30325b;
            }
        }
        C c10 = new C(e7, null);
        this.f31131a = 1;
        Object objR = Hf.k0.r(f0Var, c10, this);
        return objR == aVar ? aVar : objR;
    }
}
