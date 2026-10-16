package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import Af.r;
import Ef.E;
import Jd.C0672f;
import Jd.s;
import Jd.v;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import ff.AbstractC2641B;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.H;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import lf.AbstractC3471j;
import tf.p;
import wd.C4402c;

/* loaded from: classes4.dex */
public final class i extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f32445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4402c f32446b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f32447c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f32448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f32449e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0672f f32450f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C4402c c4402c, String str, String str2, byte[] bArr, C0672f c0672f, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32446b = c4402c;
        this.f32447c = str;
        this.f32448d = str2;
        this.f32449e = bArr;
        this.f32450f = c0672f;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new i(this.f32446b, this.f32447c, this.f32448d, this.f32449e, this.f32450f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f32445a;
        String str = this.f32447c;
        if (i5 == 0) {
            Fe.e.U(obj);
            Fd.c cVar = new Fd.c();
            cVar.c(s.f6066c);
            Fd.e.b(cVar, str);
            String str2 = this.f32448d;
            if (str2 != null && (!Bf.k.y0(str2))) {
                Fd.e.a(cVar, new r(str2, 26));
            }
            KType kTypeB = null;
            byte[] bArr = this.f32449e;
            if (bArr == null) {
                cVar.f4048d = Md.a.f7629a;
                KClass orCreateKotlinClass = H.f39741a.getOrCreateKotlinClass(byte[].class);
                try {
                    kTypeB = H.b(byte[].class);
                } catch (Throwable unused) {
                }
                cVar.b(new Sd.a(orCreateKotlinClass, kTypeB));
            } else if (bArr instanceof Md.c) {
                cVar.f4048d = bArr;
                cVar.b(null);
            } else {
                cVar.f4048d = bArr;
                KClass orCreateKotlinClass2 = H.f39741a.getOrCreateKotlinClass(byte[].class);
                try {
                    kTypeB = H.b(byte[].class);
                } catch (Throwable unused2) {
                }
                cVar.b(new Sd.a(orCreateKotlinClass2, kTypeB));
            }
            AbstractC2641B.j(cVar, this.f32450f);
            A6.h.d(cVar, 5000L);
            cVar.c(s.f6066c);
            S3.s sVar = new S3.s(cVar, this.f32446b);
            this.f32445a = 1;
            obj = sVar.p(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        v vVarE = ((Gd.a) obj).e();
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "HttpClient", "Response status: " + vVarE + " for url: " + str, false, 4, null);
        return Boolean.valueOf(vVarE.compareTo(v.f6076c) >= 0 && vVarE.compareTo(v.k) < 0);
    }
}
