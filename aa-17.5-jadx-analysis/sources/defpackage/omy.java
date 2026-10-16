package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class omy implements View.OnGenericMotionListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ omy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnGenericMotionListener
    public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
        if (this.b == 0) {
            SeekableLinearProgressIndicator seekableLinearProgressIndicator = (SeekableLinearProgressIndicator) this.a;
            if (!view.equals(seekableLinearProgressIndicator.d) || !mlq.J(seekableLinearProgressIndicator.f) || motionEvent.getSource() != 8194 || motionEvent.getAction() != 8) {
                return false;
            }
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue == BitmapDescriptorFactory.HUE_RED) {
                return false;
            }
            seekableLinearProgressIndicator.b(axisValue > BitmapDescriptorFactory.HUE_RED);
            return true;
        }
        if (motionEvent.getActionMasked() != 8) {
            return false;
        }
        Object obj = this.a;
        mrv mrvVar = (mrv) obj;
        int iA = mrvVar.b.a() + (motionEvent.getAxisValue(9) > BitmapDescriptorFactory.HUE_RED ? 1 : -1);
        if (iA >= 0 && iA < mrvVar.b.b()) {
            wwg wwgVarC = mrvVar.b.c(iA);
            wwgVarC.getClass();
            wwgVarC.a();
        }
        return true;
    }
}
