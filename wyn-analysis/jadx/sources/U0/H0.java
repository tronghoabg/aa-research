package u0;

import Hf.InterfaceC0603m;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class H0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public Gf.b f46117a;

    /* renamed from: b, reason: collision with root package name */
    public int f46118b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f46119c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f46120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Uri f46121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.flutter.view.c f46122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Gf.e f46123g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Context f46124h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(ContentResolver contentResolver, Uri uri, io.flutter.view.c cVar, Gf.e eVar, Context context, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46120d = contentResolver;
        this.f46121e = uri;
        this.f46122f = cVar;
        this.f46123g = eVar;
        this.f46124h = context;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        Gf.e eVar = this.f46123g;
        Context context = this.f46124h;
        H0 h02 = new H0(this.f46120d, this.f46121e, this.f46122f, eVar, context, interfaceC3103c);
        h02.f46119c = obj;
        return h02;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((H0) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.emit(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0044, B:22:0x0055, B:24:0x005d, B:14:0x002c, B:17:0x003d), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // lf.AbstractC3462a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kf.a r0 = kf.a.f39711a
            int r1 = r10.f46118b
            io.flutter.view.c r2 = r10.f46122f
            r3 = 2
            r4 = 1
            android.content.ContentResolver r5 = r10.f46120d
            if (r1 == 0) goto L30
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            Gf.b r1 = r10.f46117a
            java.lang.Object r6 = r10.f46119c
            Hf.m r6 = (Hf.InterfaceC0603m) r6
            Fe.e.U(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r1
            goto L44
        L1c:
            r11 = move-exception
            goto L86
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            Gf.b r1 = r10.f46117a
            java.lang.Object r6 = r10.f46119c
            Hf.m r6 = (Hf.InterfaceC0603m) r6
            Fe.e.U(r11)     // Catch: java.lang.Throwable -> L1c
            goto L55
        L30:
            Fe.e.U(r11)
            java.lang.Object r11 = r10.f46119c
            Hf.m r11 = (Hf.InterfaceC0603m) r11
            android.net.Uri r1 = r10.f46121e
            r6 = 0
            r5.registerContentObserver(r1, r6, r2)
            Gf.e r1 = r10.f46123g     // Catch: java.lang.Throwable -> L1c
            Gf.b r6 = new Gf.b     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L44:
            r10.f46119c = r11     // Catch: java.lang.Throwable -> L1c
            r10.f46117a = r6     // Catch: java.lang.Throwable -> L1c
            r10.f46118b = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r6.a(r10)     // Catch: java.lang.Throwable -> L1c
            if (r1 != r0) goto L51
            goto L7f
        L51:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L80
            r1.c()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.f46124h     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.f46119c = r6     // Catch: java.lang.Throwable -> L1c
            r10.f46117a = r1     // Catch: java.lang.Throwable -> L1c
            r10.f46118b = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.emit(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L19
        L7f:
            return r0
        L80:
            r5.unregisterContentObserver(r2)
            ef.C r11 = ef.C2515C.f34653a
            return r11
        L86:
            r5.unregisterContentObserver(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.H0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
