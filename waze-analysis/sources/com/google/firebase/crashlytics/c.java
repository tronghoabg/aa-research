package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.a.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.g.b f9776a;

    /* renamed from: b, reason: collision with root package name */
    private volatile com.google.firebase.crashlytics.a.a.a f9777b;

    /* renamed from: c, reason: collision with root package name */
    private volatile com.google.firebase.crashlytics.a.b.a f9778c;

    /* renamed from: d, reason: collision with root package name */
    private final List f9779d;

    public c(com.google.firebase.g.b bVar) {
        com.google.firebase.crashlytics.a.b.b bVar2 = new com.google.firebase.crashlytics.a.b.b();
        com.google.firebase.crashlytics.a.a.e eVar = new com.google.firebase.crashlytics.a.a.e();
        this.f9776a = bVar;
        this.f9778c = bVar2;
        this.f9779d = new ArrayList();
        this.f9777b = eVar;
        bVar.e(new com.google.firebase.crashlytics.a.b(this, 1));
    }

    public static /* synthetic */ void a(c cVar, com.google.firebase.g.c cVar2) {
        i.a().b("AnalyticsConnector now available.");
        com.google.firebase.a.a.c cVar3 = (com.google.firebase.a.a.c) cVar2.a();
        com.google.firebase.crashlytics.a.a.d dVar = new com.google.firebase.crashlytics.a.a.d(cVar3);
        com.google.firebase.a.a.a aVarF = cVar3.f();
        if (aVarF == null) {
            i.a().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            aVarF = cVar3.f();
            if (aVarF != null) {
                i.a().h("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        if (aVarF == null) {
            i.a().h("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        i.a().b("Registered Firebase Analytics listener.");
        com.google.firebase.crashlytics.a.a.c cVar4 = new com.google.firebase.crashlytics.a.a.c();
        com.google.firebase.crashlytics.a.a.b bVar = new com.google.firebase.crashlytics.a.a.b(dVar, TimeUnit.MILLISECONDS);
        synchronized (cVar) {
            Iterator it = cVar.f9779d.iterator();
            while (it.hasNext()) {
                cVar4.a((h) it.next());
            }
            cVar.f9778c = cVar4;
            cVar.f9777b = bVar;
        }
    }

    public static /* synthetic */ void c(c cVar, h hVar) {
        synchronized (cVar) {
            if (cVar.f9778c instanceof com.google.firebase.crashlytics.a.b.b) {
                cVar.f9779d.add(hVar);
            }
            cVar.f9778c.a(hVar);
        }
    }
}
