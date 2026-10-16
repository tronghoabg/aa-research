package com.google.firebase.crashlytics.a;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9732a;

    /* renamed from: b, reason: collision with root package name */
    private g f9733b = null;

    public h(Context context) {
        this.f9732a = context;
    }

    static /* bridge */ /* synthetic */ boolean d(h hVar) throws IOException {
        Context context = hVar.f9732a;
        if (context.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open("flutter_assets/NOTICES.Z");
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private final g e() {
        g gVar = this.f9733b;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this);
        this.f9733b = gVar2;
        return gVar2;
    }

    public final String b() {
        return e().f9713a;
    }

    public final String c() {
        return e().f9714b;
    }
}
