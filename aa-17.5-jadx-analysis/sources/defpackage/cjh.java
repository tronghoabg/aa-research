package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import com.google.android.projection.gearhead.R;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cjh implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public cjh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.b;
        if (i == 0) {
            ((cji) this.a).c(view.getContext());
        } else {
            if (i != 1) {
                return;
            }
            View view2 = (View) this.a;
            view2.removeOnAttachStateChangeListener(this);
            int[] iArr = ebm.a;
            view2.requestApplyInsets();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [aivh, java.lang.Object] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.b;
        if (i == 0) {
            Context context = view.getContext();
            cji cjiVar = (cji) this.a;
            if (cjiVar.a) {
                context.getApplicationContext().unregisterComponentCallbacks(cjiVar.b);
                cjiVar.a = false;
            }
            cjiVar.b();
            return;
        }
        if (i != 1) {
            if (i != 2) {
                view.removeOnAttachStateChangeListener(this);
                this.a.s(null);
                return;
            }
            Object obj = this.a;
            Iterator itA = ebg.b((View) obj).a();
            while (itA.hasNext()) {
                Object obj2 = (ViewParent) itA.next();
                if (obj2 instanceof View) {
                    View view2 = (View) obj2;
                    view2.getClass();
                    Object tag = view2.getTag(R.id.is_pooling_container_tag);
                    Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                    if (bool != null ? bool.booleanValue() : false) {
                        return;
                    }
                }
            }
            ((czd) obj).e();
        }
    }
}
