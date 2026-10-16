package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import i.AbstractC2820a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final int f17754a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17755b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2820a.f36456t);
        this.f17755b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f17754a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
