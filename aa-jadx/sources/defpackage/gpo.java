package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class gpo extends android.widget.LinearLayout {
    public /* synthetic */ gpo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2, int i3, defpackage.affu affuVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public static final void a(android.view.View view, android.view.View view2, android.view.View view3) {
        view.setVisibility(0);
        view2.setVisibility(8);
        view3.setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gpo(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gpo(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpo(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gpo(android.content.Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }
}
