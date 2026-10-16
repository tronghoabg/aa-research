package com.waze.sharedui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class r extends ScrollView {

    /* renamed from: a, reason: collision with root package name */
    private final Set f39272a;

    public r(Context context) {
        super(context);
        this.f39272a = new HashSet();
    }

    public final void a(q qVar) {
        this.f39272a.add(qVar);
    }

    public final void b(q qVar) {
        this.f39272a.remove(qVar);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        Iterator it = this.f39272a.iterator();
        while (it.hasNext()) {
            ((q) it.next()).a();
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39272a = new HashSet();
    }

    public r(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f39272a = new HashSet();
    }
}
