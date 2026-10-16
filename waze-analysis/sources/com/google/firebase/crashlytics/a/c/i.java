package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9186a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final FilenameFilter f9187b = new o(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f9188c = new h(0);

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.crashlytics.a.f.c f9189d;

    /* renamed from: e, reason: collision with root package name */
    private String f9190e = null;

    /* renamed from: f, reason: collision with root package name */
    private String f9191f = null;

    i(com.google.firebase.crashlytics.a.f.c cVar) {
        this.f9189d = cVar;
    }

    private static void d(com.google.firebase.crashlytics.a.f.c cVar, String str, String str2) throws IOException {
        if (str == null || str2 == null) {
            return;
        }
        try {
            cVar.f(str, "aqs." + str2).createNewFile();
        } catch (IOException e2) {
            com.google.firebase.crashlytics.a.i.a().i("Failed to persist App Quality Sessions session id.", e2);
        }
    }

    public final synchronized String a(String str) {
        String strSubstring;
        if (Objects.equals(this.f9190e, str)) {
            return this.f9191f;
        }
        List listL = this.f9189d.l(str, f9187b);
        if (listL.isEmpty()) {
            com.google.firebase.crashlytics.a.i.a().h("Unable to read App Quality Sessions session id.");
            strSubstring = null;
        } else {
            strSubstring = ((File) Collections.min(listL, f9188c)).getName().substring(4);
        }
        return strSubstring;
    }

    public final synchronized void b(String str) {
        if (Objects.equals(this.f9191f, str)) {
            return;
        }
        d(this.f9189d, this.f9190e, str);
        this.f9191f = str;
    }

    public final synchronized void c(String str) {
        if (Objects.equals(this.f9190e, str)) {
            return;
        }
        d(this.f9189d, str, this.f9191f);
        this.f9190e = str;
    }
}
