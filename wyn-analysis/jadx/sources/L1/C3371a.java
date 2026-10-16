package l1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: l1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3371a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f39844a;

    /* renamed from: b, reason: collision with root package name */
    public final C3375e f39845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39846c;

    public C3371a(int i5, C3375e c3375e, int i10) {
        this.f39844a = i5;
        this.f39845b = c3375e;
        this.f39846c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f39844a);
        this.f39845b.f39862a.performAction(this.f39846c, bundle);
    }
}
