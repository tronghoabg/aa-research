package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import androidx.core.widget.NestedScrollView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class eeg implements dzy {
    final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public eeg(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.dzy
    public final float a() {
        float fA;
        int i = this.b;
        ViewGroup viewGroup = this.a;
        if (i != 0) {
            RecyclerView recyclerView = (RecyclerView) viewGroup;
            if (recyclerView.n.ah()) {
                fA = recyclerView.J;
            } else {
                if (!recyclerView.n.ag()) {
                    return BitmapDescriptorFactory.HUE_RED;
                }
                fA = recyclerView.I;
            }
        } else {
            fA = ((NestedScrollView) viewGroup).a();
        }
        return -fA;
    }

    @Override // defpackage.dzy
    public final void b() {
        int i = this.b;
        ViewGroup viewGroup = this.a;
        if (i != 0) {
            ((RecyclerView) viewGroup).ah();
        } else {
            ((NestedScrollView) viewGroup).a.abortAnimation();
        }
    }

    @Override // defpackage.dzy
    public final boolean c(float f) {
        int i;
        int i2;
        if (this.b == 0) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return false;
            }
            b();
            ((NestedScrollView) this.a).j((int) f);
            return true;
        }
        RecyclerView recyclerView = (RecyclerView) this.a;
        if (recyclerView.n.ah()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.n.ag()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0) {
            if (i2 == 0) {
                return false;
            }
            i = 0;
        }
        recyclerView.ah();
        return recyclerView.al(i, i2, 0, Alert.DURATION_SHOW_INDEFINITELY);
    }
}
