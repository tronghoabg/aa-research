package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import Ef.E;
import ef.C2515C;
import java.io.File;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30259a;

    /* renamed from: b, reason: collision with root package name */
    public Gd.a f30260b;

    /* renamed from: c, reason: collision with root package name */
    public int f30261c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Dd.c f30262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f30263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ File f30264f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Dd.c cVar, String str, File file, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30262d = cVar;
        this.f30263e = str;
        this.f30264f = file;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new e(this.f30262d, this.f30263e, this.f30264f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c A[Catch: Exception -> 0x002b, L0 -> 0x0181, PHI: r0 r4 r12
  0x012c: PHI (r0v18 Gd.a) = (r0v13 Gd.a), (r0v21 Gd.a) binds: [B:17:0x003e, B:53:0x0129] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r4v11 java.lang.Object) = (r4v5 java.lang.Object), (r4v18 java.lang.Object) binds: [B:17:0x003e, B:53:0x0129] A[DONT_GENERATE, DONT_INLINE]
  0x012c: PHI (r12v7 int) = (r12v5 int), (r12v9 int) binds: [B:17:0x003e, B:53:0x0129] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {L0 -> 0x0181, blocks: (B:16:0x003b, B:55:0x012c, B:40:0x00b3, B:44:0x00c3, B:46:0x00eb, B:50:0x00f7, B:52:0x011f), top: B:78:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ba  */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) throws com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.r {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
