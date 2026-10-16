package t6;

import X0.C1289q;
import X0.N;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import cb.AbstractC1593a;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import u0.C4163a0;
import uc.C4276m;
import uc.C4281r;
import uc.C4287x;
import uc.InterfaceC4267d;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import x8.InterfaceC4498a;
import zg.C4673l;
import zg.C4683w;
import zg.InterfaceC4666e;

/* loaded from: classes3.dex */
public final class q implements InterfaceC4143k, InterfaceC4267d, w8.a, InterfaceC4666e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f45906a;

    /* renamed from: b, reason: collision with root package name */
    public Object f45907b;

    public /* synthetic */ q(Object obj, Object obj2) {
        this.f45907b = obj;
        this.f45906a = obj2;
    }

    public static HashMap f(String str, int i5, int i10, int i11, int i12) {
        HashMap mapL = AbstractC1593a.l("text", str);
        N0.a.p(i5, mapL, "selectionBase", i10, "selectionExtent");
        N0.a.p(i11, mapL, "composingBase", i12, "composingExtent");
        return mapL;
    }

    @Override // zg.InterfaceC4666e
    public Type a() {
        return (Type) this.f45906a;
    }

    @Override // t6.InterfaceC4143k
    public InterfaceC4144l b() {
        return new r((Context) this.f45906a, ((M2.e) this.f45907b).b());
    }

    @Override // w8.a
    public void c(HashSet hashSet) {
        String str = (String) this.f45906a;
        w8.e eVar = (w8.e) this.f45907b;
        eVar.getClass();
        if (str.isEmpty()) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = eVar.f47408b;
        if (!concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null || !str.equals("fiam") || hashSet == null || hashSet.isEmpty()) {
            return;
        }
        ((InterfaceC4498a) concurrentHashMap.get(str)).a(hashSet);
    }

    @Override // uc.InterfaceC4267d
    public void d(ByteBuffer byteBuffer, mc.g gVar) {
        C4281r c4281r = (C4281r) this.f45907b;
        try {
            ((InterfaceC4279p) this.f45906a).onMethodCall(c4281r.f46763c.a(byteBuffer), new tc.g(1, this, gVar));
        } catch (RuntimeException e7) {
            Log.e("MethodChannel#" + c4281r.f46762b, "Failed to handle method call", e7);
            gVar.a(c4281r.f46763c.e(e7.getMessage(), Log.getStackTraceString(e7)));
        }
    }

    @Override // zg.InterfaceC4666e
    public Object e(C4683w c4683w) {
        Executor executor = (Executor) this.f45907b;
        return executor == null ? c4683w : new C4673l(executor, c4683w);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.datatransport.cct.CctBackendFactory g(java.lang.String r15) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.q.g(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public void h(C4163a0 c4163a0, boolean z2) {
        PendingIntent activity;
        Y1.t tVar = (Y1.t) c4163a0.f46192g;
        String str = tVar.f16380b;
        Context context = (Context) this.f45906a;
        int identifier = context.getResources().getIdentifier(str, tVar.f16381c, context.getPackageName());
        if (identifier == 0) {
            context.getResources().getIdentifier("ic_launcher.png", "mipmap", context.getPackageName());
        }
        C1289q c1289q = (C1289q) this.f45907b;
        c1289q.getClass();
        c1289q.f15878e = C1289q.b((String) c4163a0.f46189d);
        c1289q.f15871G.icon = identifier;
        c1289q.f15879f = C1289q.b((String) c4163a0.f46190e);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setFlags(270532608);
            activity = PendingIntent.getActivity(context, 0, launchIntentForPackage, Build.VERSION.SDK_INT > 23 ? 201326592 : 134217728);
        } else {
            activity = null;
        }
        c1289q.f15880g = activity;
        c1289q.c(2, c4163a0.f46188c);
        this.f45907b = c1289q;
        Integer num = (Integer) c4163a0.f46193h;
        if (num != null) {
            c1289q.f15898z = num.intValue();
            this.f45907b = c1289q;
        }
        if (z2) {
            new N(context).c(null, 75415, ((C1289q) this.f45907b).a());
        }
    }

    public q(String str, CameraManager cameraManager) {
        this.f45907b = str;
        this.f45906a = cameraManager.getCameraCharacteristics(str);
    }

    public q(Context context, C4163a0 c4163a0) {
        this.f45906a = context;
        C1289q c1289q = new C1289q(context, "geolocator_channel_01");
        c1289q.k = 1;
        this.f45907b = c1289q;
        h(c4163a0, false);
    }

    public q(Type type, Executor executor) {
        this.f45906a = type;
        this.f45907b = executor;
    }

    public q(mc.b bVar, int i5) {
        switch (i5) {
            case 2:
                a2.v vVar = new a2.v(this, 28);
                C4281r c4281r = new C4281r(bVar, "flutter/platform_views", C4287x.f46768b, null);
                this.f45906a = c4281r;
                c4281r.b(vVar);
                break;
            case 3:
                com.google.android.gms.ads.nativead.l lVar = new com.google.android.gms.ads.nativead.l(this, 25);
                C4281r c4281r2 = new C4281r(bVar, "flutter/textinput", C4276m.f46758a, null);
                this.f45906a = c4281r2;
                c4281r2.b(lVar);
                break;
            default:
                a2.v vVar2 = new a2.v(this, 27);
                C4281r c4281r3 = new C4281r(bVar, "flutter/localization", C4276m.f46758a, null);
                this.f45906a = c4281r3;
                c4281r3.b(vVar2);
                break;
        }
    }

    public q(Context context, int i5) {
        switch (i5) {
            case 4:
                this.f45907b = null;
                this.f45906a = context;
                break;
            default:
                M2.e eVar = new M2.e(5);
                this.f45906a = context.getApplicationContext();
                this.f45907b = eVar;
                break;
        }
    }

    public q() {
        this.f45906a = new AtomicLong();
        this.f45907b = new AtomicLong();
    }

    public q(InterfaceC4269f interfaceC4269f, String str) {
        this.f45906a = interfaceC4269f;
        this.f45907b = str.isEmpty() ? "" : ".".concat(str);
    }
}
