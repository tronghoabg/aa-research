package com.waze.uid.c;

import android.view.KeyEvent;
import android.widget.TextView;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class an implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ be f44212a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44213b;

    public /* synthetic */ an(be beVar, int i2) {
        this.f44213b = i2;
        this.f44212a = beVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        int i3 = this.f44213b;
        if (i3 == 0) {
            return aq.f((aq) this.f44212a, i2);
        }
        be beVar = this.f44212a;
        return i3 != 1 ? aw.c((aw) beVar, i2) : ah.e((ah) beVar, i2);
    }
}
