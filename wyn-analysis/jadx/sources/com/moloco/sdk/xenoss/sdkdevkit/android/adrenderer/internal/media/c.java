package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media;

import Ef.E;
import Va.X7;
import ef.C2515C;
import java.io.File;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class c extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f30242a;

    /* renamed from: b, reason: collision with root package name */
    public int f30243b;

    /* renamed from: c, reason: collision with root package name */
    public int f30244c;

    /* renamed from: d, reason: collision with root package name */
    public int f30245d;

    /* renamed from: e, reason: collision with root package name */
    public long f30246e;

    /* renamed from: f, reason: collision with root package name */
    public String f30247f;

    /* renamed from: g, reason: collision with root package name */
    public int f30248g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ X7 f30249h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f30250i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ File f30251j;
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f30252l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(X7 x72, String str, File file, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.c cVar, String str2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30249h = x72;
        this.f30250i = str;
        this.f30251j = file;
        this.k = cVar;
        this.f30252l = str2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new c(this.f30249h, this.f30250i, this.f30251j, this.k, this.f30252l, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0342 A[Catch: Exception -> 0x01ac, TryCatch #3 {Exception -> 0x01ac, blocks: (B:60:0x0182, B:64:0x0195, B:67:0x019f, B:72:0x01ae, B:81:0x0208, B:84:0x0213, B:86:0x025c, B:88:0x02a1, B:90:0x02a8, B:96:0x02d6, B:100:0x0308, B:104:0x0329, B:106:0x0342, B:108:0x0347, B:109:0x0359, B:95:0x02c4, B:111:0x0376, B:112:0x037e, B:113:0x037f, B:122:0x03e5), top: B:138:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0347 A[Catch: Exception -> 0x01ac, TryCatch #3 {Exception -> 0x01ac, blocks: (B:60:0x0182, B:64:0x0195, B:67:0x019f, B:72:0x01ae, B:81:0x0208, B:84:0x0213, B:86:0x025c, B:88:0x02a1, B:90:0x02a8, B:96:0x02d6, B:100:0x0308, B:104:0x0329, B:106:0x0342, B:108:0x0347, B:109:0x0359, B:95:0x02c4, B:111:0x0376, B:112:0x037e, B:113:0x037f, B:122:0x03e5), top: B:138:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0359 A[Catch: Exception -> 0x01ac, TryCatch #3 {Exception -> 0x01ac, blocks: (B:60:0x0182, B:64:0x0195, B:67:0x019f, B:72:0x01ae, B:81:0x0208, B:84:0x0213, B:86:0x025c, B:88:0x02a1, B:90:0x02a8, B:96:0x02d6, B:100:0x0308, B:104:0x0329, B:106:0x0342, B:108:0x0347, B:109:0x0359, B:95:0x02c4, B:111:0x0376, B:112:0x037e, B:113:0x037f, B:122:0x03e5), top: B:138:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e5 A[Catch: Exception -> 0x01ac, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ac, blocks: (B:60:0x0182, B:64:0x0195, B:67:0x019f, B:72:0x01ae, B:81:0x0208, B:84:0x0213, B:86:0x025c, B:88:0x02a1, B:90:0x02a8, B:96:0x02d6, B:100:0x0308, B:104:0x0329, B:106:0x0342, B:108:0x0347, B:109:0x0359, B:95:0x02c4, B:111:0x0376, B:112:0x037e, B:113:0x037f, B:122:0x03e5), top: B:138:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ae A[Catch: Exception -> 0x01ac, TRY_LEAVE, TryCatch #3 {Exception -> 0x01ac, blocks: (B:60:0x0182, B:64:0x0195, B:67:0x019f, B:72:0x01ae, B:81:0x0208, B:84:0x0213, B:86:0x025c, B:88:0x02a1, B:90:0x02a8, B:96:0x02d6, B:100:0x0308, B:104:0x0329, B:106:0x0342, B:108:0x0347, B:109:0x0359, B:95:0x02c4, B:111:0x0376, B:112:0x037e, B:113:0x037f, B:122:0x03e5), top: B:138:0x0182 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0212 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0213 A[Catch: Exception -> 0x01ac, TryCatch #3 {Exception -> 0x01ac, blocks: (B:60:0x0182, B:64:0x0195, B:67:0x019f, B:72:0x01ae, B:81:0x0208, B:84:0x0213, B:86:0x025c, B:88:0x02a1, B:90:0x02a8, B:96:0x02d6, B:100:0x0308, B:104:0x0329, B:106:0x0342, B:108:0x0347, B:109:0x0359, B:95:0x02c4, B:111:0x0376, B:112:0x037e, B:113:0x037f, B:122:0x03e5), top: B:138:0x0182 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x03cc -> B:117:0x03d2). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
