package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class bf implements com.google.d.b.aj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6112a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6113b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f6114c;

    public /* synthetic */ bf(Object obj, Object obj2, int i2) {
        this.f6114c = i2;
        this.f6112a = obj;
        this.f6113b = obj2;
    }

    @Override // com.google.d.b.aj
    public final Object get() {
        if (this.f6114c != 0) {
            return ((com.google.d.h.f) ((j) this.f6112a).f6131a).o(((com.google.v.v) this.f6113b).x());
        }
        return String.valueOf(com.google.android.libraries.phenotype.client.c.a((Context) this.f6112a)) + File.separator + "phenotype_storage_info" + File.separator + "shared" + File.separator + ((String) this.f6113b);
    }
}
