package Pc;

import D6.C0388o;
import J8.AbstractC0626a;
import J8.C0632g;
import K8.C0690b;
import K8.C0693e;
import K8.C0697i;
import K8.C0698j;
import K8.C0699k;
import a.AbstractC1304a;
import android.util.Log;
import ba.C1521a;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import k8.InterfaceC3199h;
import uc.InterfaceC4265b;

/* renamed from: Pc.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0786b implements OnCompleteListener, InterfaceC4265b, InterfaceC3199h, Continuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9389a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9390b;

    public /* synthetic */ C0786b(Object obj, int i5) {
        this.f9389a = i5;
        this.f9390b = obj;
    }

    @Override // k8.InterfaceC3199h
    public Object apply(Object obj) {
        R5.n nVar = (R5.n) obj;
        ((R5.h) this.f9390b).getClass();
        return nVar;
    }

    @Override // uc.InterfaceC4265b
    public void e(Object obj, C1521a c1521a) {
        Task<K8.T> taskZza;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) obj;
        String str = (String) arrayList2.get(0);
        J j8 = (J) arrayList2.get(1);
        String str2 = (String) arrayList2.get(2);
        C0800p c0800p = new C0800p(arrayList, c1521a, 9);
        ((C0795k) ((InterfaceC0804u) this.f9390b)).getClass();
        C0697i c0697i = (C0697i) C0795k.f9420c.get(str);
        if (c0697i == null) {
            c0800p.b(AbstractC1304a.G(new Exception("Resolver not found")));
            return;
        }
        Object yVar = j8 != null ? new J8.y(J8.u.Y(j8.f9336a, j8.f9337b)) : (J8.s) C0795k.f9421d.get(str2);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(s8.g.f(c0697i.f6648c));
        firebaseAuth.getClass();
        AbstractC1732v.i(yVar);
        C0698j c0698j = c0697i.f6647b;
        AbstractC1732v.i(c0698j);
        boolean z2 = yVar instanceof J8.y;
        C0693e c0693e = c0697i.f6650e;
        if (z2) {
            String str3 = c0698j.f6653b;
            AbstractC1732v.f(str3);
            taskZza = firebaseAuth.f27287e.zza(firebaseAuth.f27283a, c0693e, (J8.y) yVar, str3, new C0632g(firebaseAuth));
        } else {
            if (!(yVar instanceof J8.B)) {
                throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
            }
            String str4 = c0698j.f6653b;
            AbstractC1732v.f(str4);
            taskZza = firebaseAuth.f27287e.zza(firebaseAuth.f27283a, c0693e, (J8.B) yVar, str4, firebaseAuth.k, new C0632g(firebaseAuth));
        }
        taskZza.continueWithTask(new C0690b(c0697i, 2)).addOnCompleteListener(new C0786b(c0800p, 17));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i5;
        String str;
        String strA = null;
        Object obj = this.f9390b;
        switch (this.f9389a) {
            case 0:
                HashMap map = C0788d.f9393i;
                C0800p c0800p = (C0800p) obj;
                if (task.isSuccessful()) {
                    c0800p.a((String) task.getResult());
                    return;
                } else {
                    c0800p.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 1:
                HashMap map2 = C0788d.f9393i;
                C0799o c0799o = (C0799o) obj;
                if (task.isSuccessful()) {
                    c0799o.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0799o.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 2:
                HashMap map3 = C0788d.f9393i;
                C0799o c0799o2 = (C0799o) obj;
                if (!task.isSuccessful()) {
                    c0799o2.b(AbstractC1304a.G(task.getException()));
                    return;
                }
                K8.S s10 = (K8.S) task.getResult();
                int i10 = s10.f6609a;
                if (i10 == 0) {
                    i5 = 2;
                } else if (i10 != 1) {
                    i5 = 4;
                    if (i10 != 2) {
                        if (i10 != 4) {
                            i5 = 6;
                            if (i10 != 5) {
                                i5 = i10 != 6 ? 0 : 7;
                            }
                        } else {
                            i5 = 5;
                        }
                    }
                } else {
                    i5 = 3;
                }
                AbstractC0626a abstractC0626a = s10.f6610b;
                if ((abstractC0626a != null && i10 == 1) || i10 == 0) {
                    strA = abstractC0626a.a();
                    str = null;
                } else if (i10 == 2 || i10 == 5) {
                    Objects.requireNonNull(abstractC0626a);
                    K8.N n10 = (K8.N) abstractC0626a;
                    strA = n10.f5783a;
                    str = n10.f6601b;
                } else {
                    str = null;
                }
                B b5 = new B();
                b5.f9300a = strA;
                b5.f9301b = str;
                A a5 = new A();
                if (i5 == 0) {
                    throw new IllegalStateException("Nonnull field \"operation\" is null.");
                }
                a5.f9298a = i5;
                a5.f9299b = b5;
                c0799o2.a(a5);
                return;
            case 3:
                HashMap map4 = C0788d.f9393i;
                C0800p c0800p2 = (C0800p) obj;
                if (task.isSuccessful()) {
                    c0800p2.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0800p2.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 4:
                HashMap map5 = C0788d.f9393i;
                C0799o c0799o3 = (C0799o) obj;
                if (task.isSuccessful()) {
                    c0799o3.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0799o3.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 5:
                HashMap map6 = C0788d.f9393i;
                C0800p c0800p3 = (C0800p) obj;
                if (task.isSuccessful()) {
                    c0800p3.success();
                    return;
                } else {
                    c0800p3.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 6:
                HashMap map7 = C0788d.f9393i;
                C0799o c0799o4 = (C0799o) obj;
                if (task.isSuccessful()) {
                    c0799o4.success();
                    return;
                } else {
                    c0799o4.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 7:
                HashMap map8 = C0788d.f9393i;
                C0799o c0799o5 = (C0799o) obj;
                if (task.isSuccessful()) {
                    c0799o5.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0799o5.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 8:
                HashMap map9 = C0788d.f9393i;
                C0800p c0800p4 = (C0800p) obj;
                if (task.isSuccessful()) {
                    c0800p4.a(((C0699k) task.getResult()).f6657a);
                    return;
                } else {
                    c0800p4.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 9:
                HashMap map10 = C0788d.f9393i;
                C0801q c0801q = (C0801q) obj;
                if (task.isSuccessful()) {
                    c0801q.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0801q.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 10:
                HashMap map11 = C0788d.f9393i;
                C0801q c0801q2 = (C0801q) obj;
                if (task.isSuccessful()) {
                    c0801q2.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0801q2.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 11:
                C0800p c0800p5 = (C0800p) obj;
                if (task.isSuccessful()) {
                    c0800p5.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0800p5.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 12:
                C0801q c0801q3 = (C0801q) obj;
                if (task.isSuccessful()) {
                    c0801q3.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0801q3.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 13:
                C0799o c0799o6 = (C0799o) obj;
                if (task.isSuccessful()) {
                    c0799o6.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0799o6.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 14:
                C0799o c0799o7 = (C0799o) obj;
                if (task.isSuccessful()) {
                    c0799o7.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                }
                Exception exception = task.getException();
                if (exception.getMessage().contains("User was not linked to an account with the given provider.")) {
                    c0799o7.b(new C0803t("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null));
                    return;
                } else {
                    c0799o7.b(AbstractC1304a.G(exception));
                    return;
                }
            case 15:
                C0800p c0800p6 = (C0800p) obj;
                if (task.isSuccessful()) {
                    c0800p6.success();
                    return;
                } else {
                    c0800p6.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 16:
                C0799o c0799o8 = (C0799o) obj;
                if (task.isSuccessful()) {
                    c0799o8.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0799o8.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 17:
                C0800p c0800p7 = (C0800p) obj;
                if (task.isSuccessful()) {
                    c0800p7.a(com.moloco.sdk.internal.publisher.H.i0((K8.T) task.getResult()));
                    return;
                } else {
                    c0800p7.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 18:
                C0801q c0801q4 = (C0801q) obj;
                if (!task.isSuccessful()) {
                    c0801q4.b(AbstractC1304a.G(task.getException()));
                    return;
                }
                C0698j c0698j = (C0698j) task.getResult();
                String string = UUID.randomUUID().toString();
                C0795k.f9419b.put(string, c0698j);
                I i11 = new I();
                if (string == null) {
                    throw new IllegalStateException("Nonnull field \"id\" is null.");
                }
                i11.f9335a = string;
                c0801q4.a(i11);
                return;
            case 19:
                C0800p c0800p8 = (C0800p) obj;
                if (task.isSuccessful()) {
                    c0800p8.success();
                    return;
                } else {
                    c0800p8.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 20:
                C0799o c0799o9 = (C0799o) obj;
                if (task.isSuccessful()) {
                    c0799o9.success();
                    return;
                } else {
                    c0799o9.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 21:
                C0799o c0799o10 = (C0799o) obj;
                if (task.isSuccessful()) {
                    c0799o10.success();
                    return;
                } else {
                    c0799o10.b(AbstractC1304a.G(task.getException()));
                    return;
                }
            case 22:
                C0801q c0801q5 = (C0801q) obj;
                if (!task.isSuccessful()) {
                    c0801q5.b(AbstractC1304a.G(task.getException()));
                    return;
                }
                K8.B b10 = (K8.B) task.getResult();
                C0796l.f9422a.put(b10.f6568a, b10);
                Long lValueOf = Long.valueOf(b10.f6571d);
                Long lValueOf2 = Long.valueOf(b10.f6570c);
                Long lValueOf3 = Long.valueOf(b10.f6572e);
                L l10 = new L();
                l10.f9341a = lValueOf;
                l10.f9342b = lValueOf2;
                l10.f9343c = lValueOf3;
                l10.f9344d = b10.f6569b;
                String str2 = b10.f6568a;
                if (str2 == null) {
                    throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
                }
                l10.f9345e = str2;
                c0801q5.a(l10);
                return;
            default:
                HashMap map12 = Qc.c.f9945c;
                Qc.h hVar = (Qc.h) obj;
                if (task.isSuccessful()) {
                    hVar.a(task.getResult());
                    return;
                } else {
                    hVar.b(task.getException());
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z2;
        switch (this.f9389a) {
            case 27:
                ((C0388o) this.f9390b).getClass();
                if (task.isSuccessful()) {
                    R8.b bVar = (R8.b) task.getResult();
                    O8.c cVar = O8.c.f8921a;
                    cVar.c("Crashlytics report successfully enqueued to DataTransport: " + bVar.f10445b);
                    File file = bVar.f10446c;
                    if (file.delete()) {
                        cVar.c("Deleted report file: " + file.getPath());
                    } else {
                        cVar.g("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                    z2 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 28:
                ((CountDownLatch) this.f9390b).countDown();
                return null;
            default:
                return (Task) ((R8.k) this.f9390b).call();
        }
    }
}
