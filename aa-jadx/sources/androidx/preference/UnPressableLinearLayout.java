package androidx.preference;

/* JADX INFO: loaded from: classes2.dex */
public class UnPressableLinearLayout extends android.widget.LinearLayout {
    public UnPressableLinearLayout(android.content.Context context) {
        this(context, null);
    }

    public UnPressableLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSetPressed(boolean z) {
    }
}
