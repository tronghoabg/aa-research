package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class b implements e {

    /* renamed from: a, reason: collision with root package name */
    private final String f3466a;

    /* renamed from: b, reason: collision with root package name */
    private final AssetManager f3467b;

    /* renamed from: c, reason: collision with root package name */
    private Object f3468c;

    public b(AssetManager assetManager, String str) {
        this.f3467b = assetManager;
        this.f3466a = str;
    }

    protected abstract Object b(AssetManager assetManager, String str);

    @Override // com.bumptech.glide.load.data.e
    public final void bk() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d() {
        Object obj = this.f3468c;
        if (obj == null) {
            return;
        }
        try {
            e(obj);
        } catch (IOException unused) {
        }
    }

    protected abstract void e(Object obj);

    @Override // com.bumptech.glide.load.data.e
    public final void f(com.bumptech.glide.p pVar, d dVar) {
        try {
            Object objB = b(this.f3467b, this.f3466a);
            this.f3468c = objB;
            dVar.b(objB);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            dVar.e(e2);
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int g() {
        return 1;
    }
}
