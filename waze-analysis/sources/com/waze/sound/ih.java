package com.waze.sound;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ih {

    /* renamed from: a, reason: collision with root package name */
    private static ih f40229a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f40230b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.google_assistant.a f40231c;

    /* renamed from: d, reason: collision with root package name */
    private int f40232d;

    private ih() {
        Cif cif = new Cif(this, Looper.getMainLooper());
        this.f40231c = cif;
        com.waze.google_assistant.aa.f24060a.a().x(cif);
        f();
    }

    public static synchronized ih a() {
        ih ihVar;
        ihVar = f40229a;
        if (ihVar == null) {
            ihVar = new ih();
            f40229a = ihVar;
        }
        return ihVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        int i2 = true == com.waze.google_assistant.aa.f24060a.a().E() ? 2 : 1;
        int i3 = this.f40232d;
        if (i3 != i2) {
            com.waze.shared_infra.i.h.h("VoiceAssistantManager: updating speech recognition state, old=" + com.waze.sharedui.profile.c.b(i3) + ", new=" + com.waze.sharedui.profile.c.b(i2));
            this.f40232d = i2;
            Iterator it = this.f40230b.iterator();
            while (it.hasNext()) {
                ((ig) it.next()).a(this.f40232d);
            }
        }
    }

    public final void c(ig igVar) {
        this.f40230b.add(igVar);
        igVar.a(this.f40232d);
    }

    public final void d() {
        f();
    }

    public final void e(ig igVar) {
        this.f40230b.remove(igVar);
    }
}
