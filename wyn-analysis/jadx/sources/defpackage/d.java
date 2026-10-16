package defpackage;

import Cd.C0352u;
import Fe.c;
import Va.X7;
import Ya.a;
import ac.C1346a;
import ac.b;
import android.app.Activity;
import ba.C1521a;
import ef.C2532p;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import r7.AbstractC3935e;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f33918a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final C2532p f33919b = c.z(new C0352u(6));

    public static void a(InterfaceC4269f binaryMessenger, final b bVar) {
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        C2532p c2532p = f33919b;
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, (InterfaceC4277n) c2532p.getValue(), obj, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle");
        if (bVar != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listE;
                    List listE2;
                    Activity activity;
                    switch (i5) {
                        case 0:
                            b bVar2 = bVar;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                bVar2.a((b) obj3);
                                listE = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                listE = tg.b.e(th);
                            }
                            c1521a.c(listE);
                            return;
                        default:
                            try {
                                C1346a c1346a = bVar.f17490a;
                                AbstractC3340k.b(c1346a);
                                activity = (Activity) c1346a.f17489b;
                            } catch (Throwable th2) {
                                listE2 = tg.b.e(th2);
                            }
                            if (activity == null) {
                                throw new a(12);
                            }
                            AbstractC3340k.b(activity);
                            listE2 = AbstractC3935e.C(new a(Boolean.valueOf((activity.getWindow().getAttributes().flags & 128) != 0)));
                            c1521a.c(listE2);
                            return;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, (InterfaceC4277n) c2532p.getValue(), obj, "dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled");
        if (bVar == null) {
            x73.n(null);
        } else {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: c
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listE;
                    List listE2;
                    Activity activity;
                    switch (i10) {
                        case 0:
                            b bVar2 = bVar;
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                bVar2.a((b) obj3);
                                listE = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                listE = tg.b.e(th);
                            }
                            c1521a.c(listE);
                            return;
                        default:
                            try {
                                C1346a c1346a = bVar.f17490a;
                                AbstractC3340k.b(c1346a);
                                activity = (Activity) c1346a.f17489b;
                            } catch (Throwable th2) {
                                listE2 = tg.b.e(th2);
                            }
                            if (activity == null) {
                                throw new a(12);
                            }
                            AbstractC3340k.b(activity);
                            listE2 = AbstractC3935e.C(new a(Boolean.valueOf((activity.getWindow().getAttributes().flags & 128) != 0)));
                            c1521a.c(listE2);
                            return;
                    }
                }
            });
        }
    }
}
