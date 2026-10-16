package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.os.StatFs;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a;
import ef.C2515C;
import java.io.File;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2139y extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H f32361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2097a f32362b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2139y(H h10, C2097a c2097a, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32361a = h10;
        this.f32362b = c2097a;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2139y(this.f32361a, this.f32362b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2139y c2139y = (C2139y) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2139y.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        com.moloco.sdk.internal.utils.d dVar;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        File file = this.f32362b.f31597a.f31989b;
        AbstractC3340k.e(file, "file");
        String str = null;
        try {
            String parent = file.getParent();
            if (parent == null) {
                parent = file.getAbsolutePath();
            }
            StatFs statFs = new StatFs(parent);
            dVar = new com.moloco.sdk.internal.utils.d(statFs.getAvailableBytes(), statFs.getTotalBytes());
        } catch (Exception unused) {
            dVar = null;
        }
        if (dVar != null) {
            long j8 = dVar.f29778b;
            Integer numValueOf = j8 > 0 ? Integer.valueOf((int) (((j8 - dVar.f29777a) * 100) / j8)) : null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                str = iIntValue < 50 ? "low" : iIntValue < 75 ? "medium" : "high";
            }
        }
        this.f32361a.f29954l = str;
        return C2515C.f34653a;
    }
}
