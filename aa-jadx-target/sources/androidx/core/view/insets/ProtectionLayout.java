package androidx.core.view.insets;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ProtectionLayout extends android.widget.FrameLayout {
    private static final java.lang.Object a = new java.lang.Object();
    private final java.util.List b;
    private eee c;

    public ProtectionLayout(android.content.Context context, java.util.List<eed> list) {
        super(context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.b = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    private final void a() {
        eej eejVar;
        java.util.List list = this.b;
        if (list.isEmpty()) {
            b();
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView();
        java.lang.Object tag = viewGroup.getTag(2131429715);
        if (tag instanceof eej) {
            eejVar = (eej) tag;
        } else {
            eejVar = new eej(viewGroup);
            viewGroup.setTag(2131429715, eejVar);
        }
        b();
        this.c = new eee(eejVar, list);
        getChildCount();
        if (this.c.a() <= 0) {
            return;
        }
        this.c.d();
        getContext();
        throw null;
    }

    private final void b() {
        if (this.c != null) {
            removeViews(getChildCount() - this.c.a(), this.c.a());
            int iA = this.c.a();
            eee eeeVar = this.c;
            if (iA > 0) {
                eeeVar.d();
                throw null;
            }
            if (!eeeVar.d) {
                eeeVar.d = true;
                eeeVar.b.b.remove(eeeVar);
                java.util.ArrayList arrayList = eeeVar.a;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((eed) arrayList.get(size)).b = null;
                    }
                }
                arrayList.clear();
            }
            this.c = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != a) {
            eee eeeVar = this.c;
            int childCount = getChildCount() - (eeeVar != null ? eeeVar.a() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getRootView();
        java.lang.Object tag = viewGroup.getTag(2131429715);
        if (tag instanceof eej) {
            eej eejVar = (eej) tag;
            if (eejVar.b.isEmpty()) {
                eejVar.a.post(new eaw(eejVar, 2));
                viewGroup.setTag(2131429715, null);
            }
        }
    }

    public ProtectionLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new java.util.ArrayList();
    }

    public ProtectionLayout(android.content.Context context) {
        super(context);
        this.b = new java.util.ArrayList();
    }
}
