package com.google.android.libraries.phenotype.client;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.d.b.aa;
import com.google.d.b.aj;
import com.google.d.b.an;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private Context f5994a;

    /* renamed from: b, reason: collision with root package name */
    private aj f5995b;

    /* renamed from: c, reason: collision with root package name */
    private aj f5996c;

    /* renamed from: d, reason: collision with root package name */
    private aj f5997d;

    /* renamed from: e, reason: collision with root package name */
    private aj f5998e;

    /* renamed from: f, reason: collision with root package name */
    private aj f5999f;

    public static /* synthetic */ aa c(f fVar) {
        Context context = fVar.f5994a;
        int i2 = h.f6000a;
        try {
            return aa.i(context.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
        } catch (PackageManager.NameNotFoundException unused) {
            return aa.g();
        }
    }

    public final h a() {
        an.B(this.f5994a);
        if (this.f5995b == null) {
            this.f5995b = h.f6005f;
        }
        int i2 = 0;
        if (this.f5996c == null) {
            Context context = this.f5994a;
            int i3 = h.f6000a;
            this.f5996c = an.a(new e(context, i2));
        }
        if (this.f5997d == null) {
            this.f5997d = new e(this, 4);
        }
        if (this.f5998e == null) {
            Context context2 = this.f5994a;
            int i4 = h.f6000a;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, com.google.android.libraries.e.a.a.c.b(context2).b(), new com.google.android.libraries.e.a.a.f());
            this.f5998e = an.a(new e(arrayList, 2));
        }
        if (this.f5999f == null) {
            this.f5999f = new e(this, 5);
        }
        return new h(this.f5994a, this.f5995b, this.f5996c, this.f5997d, this.f5998e, this.f5999f);
    }

    public final void d(Context context) {
        this.f5994a = context;
    }
}
