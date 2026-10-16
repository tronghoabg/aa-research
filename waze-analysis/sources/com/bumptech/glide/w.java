package com.bumptech.glide;

import androidx.tracing.Trace;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w implements com.bumptech.glide.g.j {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f3570a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f3571b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3572c;

    w(c cVar, List list) {
        this.f3570a = cVar;
        this.f3571b = list;
    }

    @Override // com.bumptech.glide.g.j
    public final /* bridge */ /* synthetic */ Object a() {
        if (this.f3572c) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f3572c = true;
        try {
            return x.a(this.f3570a, this.f3571b);
        } finally {
            this.f3572c = false;
            Trace.endSection();
        }
    }
}
