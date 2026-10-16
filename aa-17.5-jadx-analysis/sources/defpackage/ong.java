package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.auto.components.ui.telecom.MaterialUnCallView;
import com.google.android.apps.auto.components.ui.telecom.UnCallView;

/* loaded from: classes2.dex */
public final /* synthetic */ class ong implements View.OnClickListener {
    public final /* synthetic */ FrameLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ ong(FrameLayout frameLayout, int i) {
        this.b = i;
        this.a = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                ((MaterialUnCallView) this.a).p.C();
                break;
            case 1:
                ((MaterialUnCallView) this.a).p.C();
                break;
            case 2:
                ((MaterialUnCallView) this.a).p.I();
                break;
            case 3:
                ((MaterialUnCallView) this.a).p.C();
                break;
            case 4:
                ((MaterialUnCallView) this.a).p.G();
                break;
            case 5:
                ((MaterialUnCallView) this.a).p.E();
                break;
            case 6:
                ((MaterialUnCallView) this.a).p.I();
                break;
            case 7:
                ((MaterialUnCallView) this.a).p.H();
                break;
            case 8:
                ((MaterialUnCallView) this.a).p.G();
                break;
            case 9:
                ((MaterialUnCallView) this.a).p.F();
                break;
            case 10:
                ((MaterialUnCallView) this.a).p.E();
                break;
            case 11:
                ((UnCallView) this.a).m.I();
                break;
            case 12:
                ((UnCallView) this.a).m.D();
                break;
            case 13:
                ((UnCallView) this.a).m.C();
                break;
            case 14:
                ((UnCallView) this.a).m.C();
                break;
            case 15:
                ((UnCallView) this.a).m.G();
                break;
            case 16:
                ((UnCallView) this.a).m.E();
                break;
            case 17:
                ((UnCallView) this.a).m.I();
                break;
            case 18:
                ((UnCallView) this.a).m.H();
                break;
            case 19:
                ((UnCallView) this.a).m.G();
                break;
            default:
                ((UnCallView) this.a).m.F();
                break;
        }
    }
}
