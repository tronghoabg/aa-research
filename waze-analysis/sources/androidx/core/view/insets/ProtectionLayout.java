package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.waze.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object PROTECTION_VIEW = new Object();
    private ProtectionGroup mGroup;
    private final List<Protection> mProtections;

    public ProtectionLayout(Context context, List<Protection> list) {
        super(context);
        this.mProtections = new ArrayList();
        setProtections(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void addProtectionView(android.content.Context r8, int r9, androidx.core.view.insets.Protection r10) {
        /*
            r7 = this;
            androidx.core.view.insets.Protection$Attributes r0 = r10.getAttributes()
            int r1 = r10.getSide()
            r2 = 8
            r3 = -1
            r4 = 1
            if (r1 == r4) goto L42
            r5 = 2
            if (r1 == r5) goto L3b
            r5 = 4
            if (r1 == r5) goto L35
            if (r1 != r2) goto L1d
            int r10 = r0.getHeight()
            r1 = 80
            goto L4a
        L1d:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Unexpected side: "
            r8.<init>(r9)
            int r9 = r10.getSide()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L35:
            int r10 = r0.getWidth()
            r1 = 5
            goto L47
        L3b:
            int r10 = r0.getHeight()
            r1 = 48
            goto L4a
        L42:
            int r10 = r0.getWidth()
            r1 = 3
        L47:
            r6 = r3
            r3 = r10
            r10 = r6
        L4a:
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r3, r10, r1)
            androidx.core.graphics.Insets r10 = r0.getMargin()
            int r1 = r10.left
            r5.leftMargin = r1
            int r1 = r10.top
            r5.topMargin = r1
            int r1 = r10.right
            r5.rightMargin = r1
            int r10 = r10.bottom
            r5.bottomMargin = r10
            android.view.View r10 = new android.view.View
            r10.<init>(r8)
            java.lang.Object r8 = androidx.core.view.insets.ProtectionLayout.PROTECTION_VIEW
            r10.setTag(r8)
            float r8 = r0.getTranslationX()
            r10.setTranslationX(r8)
            float r8 = r0.getTranslationY()
            r10.setTranslationY(r8)
            float r8 = r0.getAlpha()
            r10.setAlpha(r8)
            boolean r8 = r0.isVisible()
            if (r4 == r8) goto L89
            goto L8a
        L89:
            r2 = 0
        L8a:
            r10.setVisibility(r2)
            android.graphics.drawable.Drawable r8 = r0.getDrawable()
            r10.setBackground(r8)
            androidx.core.view.insets.ProtectionLayout$1 r8 = new androidx.core.view.insets.ProtectionLayout$1
            r8.<init>()
            r0.setCallback(r8)
            r7.addView(r10, r9, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.insets.ProtectionLayout.addProtectionView(android.content.Context, int, androidx.core.view.insets.Protection):void");
    }

    private void addProtectionViews() {
        if (this.mProtections.isEmpty()) {
            removeProtectionViews();
            return;
        }
        SystemBarStateMonitor orInstallSystemBarStateMonitor = getOrInstallSystemBarStateMonitor();
        removeProtectionViews();
        this.mGroup = new ProtectionGroup(orInstallSystemBarStateMonitor, this.mProtections);
        int childCount = getChildCount();
        int size = this.mGroup.size();
        for (int i2 = 0; i2 < size; i2++) {
            addProtectionView(getContext(), i2 + childCount, this.mGroup.getProtection(i2));
        }
    }

    private SystemBarStateMonitor getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof SystemBarStateMonitor) {
            return (SystemBarStateMonitor) tag;
        }
        SystemBarStateMonitor systemBarStateMonitor = new SystemBarStateMonitor(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, systemBarStateMonitor);
        return systemBarStateMonitor;
    }

    private void maybeUninstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof SystemBarStateMonitor) {
            SystemBarStateMonitor systemBarStateMonitor = (SystemBarStateMonitor) tag;
            if (systemBarStateMonitor.hasCallback()) {
                return;
            }
            systemBarStateMonitor.detachFromWindow();
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
        }
    }

    private void removeProtectionViews() {
        if (this.mGroup == null) {
            return;
        }
        removeViews(getChildCount() - this.mGroup.size(), this.mGroup.size());
        int size = this.mGroup.size();
        int i2 = 0;
        while (true) {
            ProtectionGroup protectionGroup = this.mGroup;
            if (i2 >= size) {
                protectionGroup.dispose();
                this.mGroup = null;
                return;
            } else {
                protectionGroup.getProtection(i2).getAttributes().setCallback(null);
                i2++;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != PROTECTION_VIEW) {
            ProtectionGroup protectionGroup = this.mGroup;
            int childCount = getChildCount() - (protectionGroup != null ? protectionGroup.size() : 0);
            if (i2 > childCount || i2 < 0) {
                i2 = childCount;
            }
        }
        super.addView(view, i2, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        addProtectionViews();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeProtectionViews();
        maybeUninstallSystemBarStateMonitor();
    }

    public void setProtections(List<Protection> list) {
        this.mProtections.clear();
        this.mProtections.addAll(list);
        if (isAttachedToWindow()) {
            addProtectionViews();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.mProtections = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.mProtections = new ArrayList();
    }
}
