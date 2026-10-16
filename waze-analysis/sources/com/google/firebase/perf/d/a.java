package com.google.firebase.perf.d;

import com.google.android.datatransport.g;
import com.google.android.datatransport.h;
import com.google.firebase.perf.f.ad;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10335a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private final String f10336b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.g.c f10337c;

    /* renamed from: d, reason: collision with root package name */
    private g f10338d;

    a(com.google.firebase.g.c cVar, String str) {
        this.f10336b = str;
        this.f10337c = cVar;
    }

    public final void a(ad adVar) {
        if (this.f10338d == null) {
            h hVar = (h) this.f10337c.a();
            if (hVar != null) {
                this.f10338d = hVar.a(this.f10336b, com.google.android.datatransport.a.a("proto"), new com.google.firebase.crashlytics.a.g.a(2));
            } else {
                f10335a.i("Flg TransportFactory is not available at the moment");
            }
        }
        g gVar = this.f10338d;
        if (gVar != null) {
            gVar.b(com.google.android.datatransport.b.a(adVar));
        } else {
            f10335a.i("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
