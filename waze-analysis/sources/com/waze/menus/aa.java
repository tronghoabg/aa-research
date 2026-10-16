package com.waze.menus;

import android.content.Intent;
import com.waze.lm;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class aa implements w {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f29691a;

    public /* synthetic */ aa(int i2) {
        this.f29691a = i2;
    }

    @Override // com.waze.menus.w
    public final void a(Intent intent, int i2) {
        if (this.f29691a != 0) {
            return;
        }
        lm.d().e().startActivityForResult(intent, 4097);
    }
}
