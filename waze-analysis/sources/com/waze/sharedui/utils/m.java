package com.waze.sharedui.utils;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.waze.settings.ao;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class m implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f39110a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final h.f f39111b = h.g.a(new ao(16));

    /* renamed from: c, reason: collision with root package name */
    private int f39112c = 0;

    public final Intent o(Context context) {
        Intent intentA = ((k) ((h.f) f39111b.getValue()).getValue()).a(this, context);
        intentA.addFlags(this.f39112c);
        return intentA;
    }

    public final void p() {
        this.f39112c = 3;
    }
}
