package Qc;

import Pc.C0799o;
import Pc.C0800p;
import Pc.C0801q;
import ba.C1521a;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1690d;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s8.l;
import uc.InterfaceC4265b;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements InterfaceC4265b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9948a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f9949b;

    public /* synthetic */ d(c cVar, int i5) {
        this.f9948a = i5;
        this.f9949b = cVar;
    }

    @Override // uc.InterfaceC4265b
    public final void e(Object obj, C1521a c1521a) {
        switch (this.f9948a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                final String str = (String) arrayList2.get(0);
                final Boolean bool = (Boolean) arrayList2.get(1);
                C0799o c0799o = new C0799o(arrayList, c1521a, 12);
                this.f9949b.getClass();
                final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                final int i5 = 0;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Qc.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        Boolean bool2 = bool;
                        String str2 = str;
                        switch (i5) {
                            case 0:
                                HashMap map = c.f9945c;
                                try {
                                    s8.g.f(str2).m(bool2);
                                    taskCompletionSource2.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource2.setException(e7);
                                    return;
                                }
                            default:
                                HashMap map2 = c.f9945c;
                                try {
                                    s8.g gVarF = s8.g.f(str2);
                                    boolean zBooleanValue = bool2.booleanValue();
                                    gVarF.a();
                                    if (gVarF.f45332e.compareAndSet(!zBooleanValue, zBooleanValue)) {
                                        boolean z2 = ComponentCallbacks2C1690d.f26513e.f26514a.get();
                                        if (zBooleanValue && z2) {
                                            gVarF.l(true);
                                        } else if (!zBooleanValue && z2) {
                                            gVarF.l(false);
                                        }
                                    }
                                    taskCompletionSource2.setResult(null);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource2.setException(e10);
                                }
                        }
                    }
                });
                c.b(taskCompletionSource, c0799o);
                break;
            case 1:
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = (ArrayList) obj;
                final String str2 = (String) arrayList4.get(0);
                final Boolean bool2 = (Boolean) arrayList4.get(1);
                C0800p c0800p = new C0800p(arrayList3, c1521a, 11);
                this.f9949b.getClass();
                final TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                final int i10 = 1;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Qc.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        TaskCompletionSource taskCompletionSource22 = taskCompletionSource2;
                        Boolean bool22 = bool2;
                        String str22 = str2;
                        switch (i10) {
                            case 0:
                                HashMap map = c.f9945c;
                                try {
                                    s8.g.f(str22).m(bool22);
                                    taskCompletionSource22.setResult(null);
                                    break;
                                } catch (Exception e7) {
                                    taskCompletionSource22.setException(e7);
                                    return;
                                }
                            default:
                                HashMap map2 = c.f9945c;
                                try {
                                    s8.g gVarF = s8.g.f(str22);
                                    boolean zBooleanValue = bool22.booleanValue();
                                    gVarF.a();
                                    if (gVarF.f45332e.compareAndSet(!zBooleanValue, zBooleanValue)) {
                                        boolean z2 = ComponentCallbacks2C1690d.f26513e.f26514a.get();
                                        if (zBooleanValue && z2) {
                                            gVarF.l(true);
                                        } else if (!zBooleanValue && z2) {
                                            gVarF.l(false);
                                        }
                                    }
                                    taskCompletionSource22.setResult(null);
                                    break;
                                } catch (Exception e10) {
                                    taskCompletionSource22.setException(e10);
                                }
                        }
                    }
                });
                c.b(taskCompletionSource2, c0800p);
                break;
            case 2:
                ArrayList arrayList5 = new ArrayList();
                String str3 = (String) ((ArrayList) obj).get(0);
                C0801q c0801q = new C0801q(arrayList5, c1521a, 11);
                this.f9949b.getClass();
                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new C8.d(27, str3, taskCompletionSource3));
                c.b(taskCompletionSource3, c0801q);
                break;
            case 3:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = (ArrayList) obj;
                String str4 = (String) arrayList7.get(0);
                f fVar = (f) arrayList7.get(1);
                C0799o c0799o2 = new C0799o(arrayList6, c1521a, 13);
                c cVar = this.f9949b;
                cVar.getClass();
                TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                FlutterFirebasePlugin.cachedThreadPool.execute(new Cb.a(cVar, fVar, str4, taskCompletionSource4, 3));
                c.b(taskCompletionSource4, c0799o2);
                break;
            case 4:
                C0800p c0800p2 = new C0800p(new ArrayList(), c1521a, 12);
                final c cVar2 = this.f9949b;
                cVar2.getClass();
                final TaskCompletionSource taskCompletionSource5 = new TaskCompletionSource();
                final int i11 = 1;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Qc.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList8;
                        switch (i11) {
                            case 0:
                                TaskCompletionSource taskCompletionSource6 = taskCompletionSource5;
                                HashMap map = c.f9945c;
                                c cVar3 = cVar2;
                                cVar3.getClass();
                                try {
                                    l lVarA = l.a(cVar3.f9946a);
                                    if (lVarA == null) {
                                        taskCompletionSource6.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                    } else {
                                        taskCompletionSource6.setResult(c.a(lVarA));
                                    }
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource6.setException(e7);
                                    return;
                                }
                            default:
                                c cVar4 = cVar2;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource5;
                                HashMap map2 = c.f9945c;
                                cVar4.getClass();
                                try {
                                    if (cVar4.f9947b) {
                                        Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                    } else {
                                        cVar4.f9947b = true;
                                    }
                                    synchronized (s8.g.k) {
                                        arrayList8 = new ArrayList(s8.g.f45327l.values());
                                    }
                                    ArrayList arrayList9 = new ArrayList(arrayList8.size());
                                    Iterator it = arrayList8.iterator();
                                    while (it.hasNext()) {
                                        s8.g gVar = (s8.g) it.next();
                                        TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                                        FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a(cVar4, gVar, taskCompletionSource8, 5));
                                        arrayList9.add((g) Tasks.await(taskCompletionSource8.getTask()));
                                    }
                                    taskCompletionSource7.setResult(arrayList9);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource7.setException(e10);
                                    return;
                                }
                        }
                    }
                });
                c.b(taskCompletionSource5, c0800p2);
                break;
            default:
                C0801q c0801q2 = new C0801q(new ArrayList(), c1521a, 12);
                final c cVar3 = this.f9949b;
                cVar3.getClass();
                final TaskCompletionSource taskCompletionSource6 = new TaskCompletionSource();
                final int i12 = 0;
                FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: Qc.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ArrayList arrayList8;
                        switch (i12) {
                            case 0:
                                TaskCompletionSource taskCompletionSource62 = taskCompletionSource6;
                                HashMap map = c.f9945c;
                                c cVar32 = cVar3;
                                cVar32.getClass();
                                try {
                                    l lVarA = l.a(cVar32.f9946a);
                                    if (lVarA == null) {
                                        taskCompletionSource62.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
                                    } else {
                                        taskCompletionSource62.setResult(c.a(lVarA));
                                    }
                                    return;
                                } catch (Exception e7) {
                                    taskCompletionSource62.setException(e7);
                                    return;
                                }
                            default:
                                c cVar4 = cVar3;
                                TaskCompletionSource taskCompletionSource7 = taskCompletionSource6;
                                HashMap map2 = c.f9945c;
                                cVar4.getClass();
                                try {
                                    if (cVar4.f9947b) {
                                        Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
                                    } else {
                                        cVar4.f9947b = true;
                                    }
                                    synchronized (s8.g.k) {
                                        arrayList8 = new ArrayList(s8.g.f45327l.values());
                                    }
                                    ArrayList arrayList9 = new ArrayList(arrayList8.size());
                                    Iterator it = arrayList8.iterator();
                                    while (it.hasNext()) {
                                        s8.g gVar = (s8.g) it.next();
                                        TaskCompletionSource taskCompletionSource8 = new TaskCompletionSource();
                                        FlutterFirebasePlugin.cachedThreadPool.execute(new Ab.a(cVar4, gVar, taskCompletionSource8, 5));
                                        arrayList9.add((g) Tasks.await(taskCompletionSource8.getTask()));
                                    }
                                    taskCompletionSource7.setResult(arrayList9);
                                    return;
                                } catch (Exception e10) {
                                    taskCompletionSource7.setException(e10);
                                    return;
                                }
                        }
                    }
                });
                c.b(taskCompletionSource6, c0801q2);
                break;
        }
    }
}
