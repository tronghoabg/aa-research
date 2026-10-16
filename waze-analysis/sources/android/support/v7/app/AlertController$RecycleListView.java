package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    private final int f491a;

    /* renamed from: b, reason: collision with root package name */
    private final int f492b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, android.support.v7.a.a.t);
        this.f492b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f491a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }

    public final void a(boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return;
            } else {
                z = false;
            }
        }
        setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f491a, getPaddingRight(), z2 ? getPaddingBottom() : this.f492b);
    }

    public AlertController$RecycleListView(Context context) {
        this(context, null);
    }
}
