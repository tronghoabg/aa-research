package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import com.google.android.projection.gearhead.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
final class feg extends fge {
    private final View a;
    private final few b;

    public feg(View view, few fewVar) {
        this.a = view;
        this.b = fewVar;
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void b(fgc fgcVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        fgcVar.P(this);
        int i = Build.VERSION.SDK_INT;
        View view = this.a;
        if (i == 28) {
            if (!fey.e) {
                try {
                    fey.b();
                    fey.d = fey.a.getDeclaredMethod("removeGhost", View.class);
                    fey.d.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e);
                }
                fey.e = true;
            }
            Method method = fey.d;
            if (method != null) {
                try {
                    method.invoke(null, view);
                } catch (IllegalAccessException unused) {
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2.getCause());
                }
            }
        } else {
            ffa ffaVarB = ffa.b(view);
            if (ffaVarB != null) {
                int i2 = ffaVarB.d - 1;
                ffaVarB.d = i2;
                if (i2 <= 0) {
                    ((fex) ffaVarB.getParent()).removeView(ffaVarB);
                }
            }
        }
        View view2 = this.a;
        view2.setTag(R.id.transition_transform, null);
        view2.setTag(R.id.parent_matrix, null);
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void d() {
        this.b.setVisibility(4);
    }

    @Override // defpackage.fge, defpackage.ffz
    public final void e() {
        this.b.setVisibility(0);
    }
}
