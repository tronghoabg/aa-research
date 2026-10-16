package com.waze.main_screen.bottom_bars;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private b f25918a;

    public a(Context context) {
        super(context, null, 0);
    }

    public final void a(b bVar) {
        this.f25918a = bVar;
    }

    protected final void b(int i2) {
        b bVar = this.f25918a;
        if (bVar != null) {
            bVar.a(i2);
        }
    }
}
