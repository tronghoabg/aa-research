package com.applovin.impl;

import android.content.DialogInterface;
import android.net.Uri;

/* loaded from: classes.dex */
public final /* synthetic */ class G0 implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20778b;

    public /* synthetic */ G0(Object obj, int i5) {
        this.f20777a = i5;
        this.f20778b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i5) {
        switch (this.f20777a) {
            case 0:
                ((p3) this.f20778b).a(dialogInterface, i5);
                break;
            default:
                C1667u0.b((Uri) this.f20778b, dialogInterface, i5);
                break;
        }
    }
}
