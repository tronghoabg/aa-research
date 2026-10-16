package com.waze.settings.tree.b;

import android.view.View;
import androidx.lifecycle.LiveData;
import com.waze.settings.cr;
import com.waze.settings.tree.c.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f37522a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int[] f37523b;

    d(f fVar, int[] iArr) {
        this.f37522a = fVar;
        this.f37523b = iArr;
    }

    @Override // com.waze.settings.tree.c.h
    public final /* synthetic */ LiveData a() {
        return com.waze.settings.tree.a.d.d(this);
    }

    @Override // com.waze.settings.tree.c.h
    public final String b() {
        return String.valueOf(this.f37523b[0]);
    }

    @Override // com.waze.settings.tree.c.h
    public final void c(View view, String str, String str2) {
        int i2 = str != null ? Integer.parseInt(str) : 0;
        cr.setPreferredType$default(f.a(this.f37522a), i2, null, 2, null);
        this.f37523b[0] = i2;
    }
}
