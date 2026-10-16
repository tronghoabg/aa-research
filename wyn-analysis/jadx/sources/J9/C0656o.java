package J9;

import A7.V1;
import N1.C0754c;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import p7.AbstractC3772b;
import ta.C4153b;
import ta.C4154c;
import x9.C4504d;
import z9.EnumC4624C;
import z9.EnumC4625D;
import z9.InterfaceC4626E;

/* renamed from: J9.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0656o implements InterfaceC4626E {

    /* renamed from: a, reason: collision with root package name */
    public boolean f5961a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5962b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5963c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5964d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f5965e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5966f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f5967g;

    /* renamed from: h, reason: collision with root package name */
    public Object f5968h;

    /* renamed from: i, reason: collision with root package name */
    public Object f5969i;

    /* renamed from: j, reason: collision with root package name */
    public Object f5970j;

    public C0656o(C0661u c0661u, M9.a aVar, X x5, V v2, N9.b bVar, G g9, C0650i c0650i, N9.h hVar, String str) {
        this.f5962b = c0661u;
        this.f5963c = aVar;
        this.f5964d = x5;
        this.f5965e = v2;
        this.f5966f = bVar;
        this.f5967g = g9;
        this.f5968h = c0650i;
        this.f5969i = hVar;
        this.f5970j = str;
        this.f5961a = false;
    }

    public static Task e(He.g gVar, He.m mVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        Se.j jVar = new Se.j(new Se.r(gVar, new C0654m(taskCompletionSource), Ne.b.f8674d).d(new Se.k(new G8.c(taskCompletionSource, 3))), new C0654m(taskCompletionSource), 2);
        Ne.b.a(mVar, "scheduler is null");
        Se.b bVar = new Se.b();
        try {
            Se.i iVar = new Se.i(bVar);
            Me.a.e(bVar, iVar);
            Je.b bVarB = mVar.b(new L7.b(6, iVar, jVar));
            Je.c cVar = (Je.c) iVar.f11083b;
            cVar.getClass();
            Me.a.c(cVar, bVarB);
            return taskCompletionSource.getTask();
        } catch (NullPointerException e7) {
            throw e7;
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public Task a(EnumC4625D enumC4625D) {
        int i5 = 2;
        int i10 = 0;
        int i11 = 1;
        if (((C0650i) this.f5968h).a()) {
            ic.d.E("Attempting to record: render error to metrics logger");
            return e(new Qe.b(new He.a[]{new Qe.b(new He.a[]{d(), new Qe.b(new A5.h(6, this, enumC4625D), i11)}, i10), new Qe.b(new C0655n(this, i5), i11)}, i10).f(), ((X) this.f5964d).f5906a);
        }
        c("render error to metrics logger");
        return new TaskCompletionSource().getTask();
    }

    public Task b() {
        int i5 = 2;
        int i10 = 1;
        int i11 = 0;
        if (!((C0650i) this.f5968h).a() || this.f5961a) {
            c("message impression to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        ic.d.E("Attempting to record: message impression to metrics logger");
        return e(new Qe.b(new He.a[]{new Qe.b(new He.a[]{d(), new Qe.b(new C0655n(this, i11), i10)}, i11), new Qe.b(new C0655n(this, i5), i10)}, i11).f(), ((X) this.f5964d).f5906a);
    }

    public void c(String str) {
        if (((N9.h) this.f5969i).f8623b.f3290b) {
            ic.d.E("Not recording: " + str + ". Reason: Message is test message");
            return;
        }
        if (((C0650i) this.f5968h).a()) {
            ic.d.E("Not recording: ".concat(str));
            return;
        }
        ic.d.E("Not recording: " + str + ". Reason: Data collection is disabled");
    }

    public He.a d() {
        int i5 = 0;
        int i10 = 1;
        String str = (String) ((N9.h) this.f5969i).f8623b.f3291c;
        ic.d.E("Attempting to record message impression in impression store for id: ".concat(str));
        C4153b c4153bE = C4154c.e();
        ((M9.a) this.f5963c).getClass();
        c4153bE.b(System.currentTimeMillis());
        c4153bE.a(str);
        C4154c c4154c = (C4154c) c4153bE.build();
        C0661u c0661u = (C0661u) this.f5962b;
        He.g gVarA = c0661u.a();
        ta.f fVar = C0661u.f5984c;
        Ne.b.a(fVar, "item is null");
        Qe.f fVar2 = new Qe.f(gVarA.d(He.g.a(fVar)), new A5.h(8, c0661u, c4154c), i10);
        F5.d dVar = new F5.d(12);
        C4504d c4504d = Ne.b.f8673c;
        Qe.e eVarB = new Qe.e(fVar2, dVar, c4504d).b(new F5.d(13));
        if (!((String) this.f5970j).equals("ON_FOREGROUND")) {
            return eVarB;
        }
        V v2 = (V) this.f5965e;
        He.g gVarA2 = v2.a();
        S s10 = V.f5899d;
        Ne.b.a(s10, "item is null");
        return new Qe.b(new He.a[]{new Qe.b(new Qe.e(new Qe.f(gVarA2.d(He.g.a(s10)), new T(v2, (N9.b) this.f5966f, i5), i10), new F5.d(14), c4504d).b(new F5.d(15)), 3), eVarB}, i5);
    }

    public Task f(EnumC4624C enumC4624C) {
        if (!((C0650i) this.f5968h).a()) {
            c("message dismissal to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        ic.d.E("Attempting to record: message dismissal to metrics logger");
        Qe.b bVar = new Qe.b(new A5.h(7, this, enumC4624C), 1);
        if (!this.f5961a) {
            b();
        }
        return e(bVar.f(), ((X) this.f5964d).f5906a);
    }

    public void g(W1.b bVar) {
        n2.o oVar;
        if (!this.f5961a || bVar.equals((W1.b) this.f5968h)) {
            return;
        }
        this.f5968h = bVar;
        W1.t tVar = (W1.t) ((S8.b) this.f5963c).f11028b;
        tVar.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = tVar.f15075f0;
        if (looper != looperMyLooper) {
            throw new IllegalStateException(R8.v.g("Current looper (", looperMyLooper == null ? "null" : looperMyLooper.getThread().getName(), ") is not the playback looper (", looper == null ? "null" : looper.getThread().getName(), ")"));
        }
        if (bVar.equals(tVar.f15094w)) {
            return;
        }
        tVar.f15094w = bVar;
        xa.d dVar = tVar.f15089r;
        if (dVar != null) {
            W1.v vVar = (W1.v) dVar.f47873b;
            synchronized (vVar.f12030a) {
                oVar = vVar.f12045q;
            }
            if (oVar != null) {
                oVar.g();
            }
        }
    }

    public void h(AudioDeviceInfo audioDeviceInfo) {
        Y9.c cVar = (Y9.c) this.f5969i;
        AudioDeviceInfo audioDeviceInfo2 = cVar == null ? null : (AudioDeviceInfo) cVar.f16739b;
        int i5 = Q1.x.f9724a;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        Y9.c cVar2 = audioDeviceInfo != null ? new Y9.c(audioDeviceInfo, 24) : null;
        this.f5969i = cVar2;
        g(W1.b.b((Context) this.f5962b, (C0754c) this.f5970j, cVar2));
    }

    public C0656o(Context context, S8.b bVar, C0754c c0754c, Y9.c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5962b = applicationContext;
        this.f5963c = bVar;
        this.f5970j = c0754c;
        this.f5969i = cVar;
        int i5 = Q1.x.f9724a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f5964d = handler;
        this.f5965e = Q1.x.f9724a >= 23 ? new W1.c(this, 0) : null;
        this.f5966f = new V1(this, 8);
        W1.b bVar2 = W1.b.f14944c;
        String str = Q1.x.f9726c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f5967g = uriFor != null ? new W1.d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }
}
