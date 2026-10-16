package com.waze.bt;

import android.content.Intent;
import com.waze.menus.w;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f17457a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f17458b;

    public /* synthetic */ a(f fVar, int i2) {
        this.f17458b = i2;
        this.f17457a = fVar;
    }

    @Override // com.waze.menus.w
    public final void a(Intent intent, int i2) {
        int i3 = this.f17458b;
        f fVar = this.f17457a;
        if (i3 != 0) {
            fVar.f17471f.launch(intent);
        } else {
            fVar.f17470e.launch(intent);
        }
    }
}
