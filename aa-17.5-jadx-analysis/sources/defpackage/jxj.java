package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.car.app.model.Row;
import com.google.android.apps.auto.components.apphost.compose.ComposableShimLayout;
import com.google.android.apps.auto.components.apphost.view.widgets.common.GridRowContainerView;
import com.google.android.projection.gearhead.R;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class jxj extends lt {
    public geu a;
    public hie e;
    public List f = afbe.a;
    private final Context g;

    public jxj(Context context) {
        this.g = context;
    }

    @Override // defpackage.lt
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.lt
    public final int d(int i) {
        Object obj = this.f.get(i);
        if (obj instanceof hif) {
            hif hifVar = (hif) obj;
            if (hifVar.b()) {
                return 1;
            }
            him himVar = hifVar.a;
            return 3;
        }
        if (obj instanceof kdl) {
            return 4;
        }
        if (obj instanceof gdi) {
            return 5;
        }
        if (obj instanceof gvy) {
            return 6;
        }
        afhe afheVarB = affw.b(this.f.get(i).getClass());
        Objects.toString(afheVarB);
        throw new IllegalStateException("Unknown row type ".concat(String.valueOf(afheVarB)));
    }

    @Override // defpackage.lt
    public final mo f(ViewGroup viewGroup, int i) {
        int i2 = R.layout.composable_shim_layout;
        switch (i) {
            case 1:
                i2 = R.layout.row_section_header_view;
                break;
            case 2:
                i2 = R.layout.row_container_view_action_list_impl;
                break;
            case 3:
                leh.a.a();
                i2 = R.layout.material_row_container_view_row_impl;
                break;
            case 4:
                i2 = R.layout.grid_row_container_view;
                break;
            case 5:
            case 6:
                break;
            default:
                throw new IllegalStateException(a.bp(i, "Unknown view type "));
        }
        return new mo(LayoutInflater.from(this.g).inflate(i2, viewGroup, false));
    }

    @Override // defpackage.lt
    public final void n(mo moVar, int i) {
        moVar.getClass();
        int i2 = moVar.f;
        geu geuVar = null;
        geu geuVar2 = null;
        geu geuVar3 = null;
        geu geuVar4 = null;
        hie hieVar = null;
        switch (i2) {
            case 1:
                Object obj = this.f.get(i);
                obj.getClass();
                him himVar = ((hif) obj).a;
                TextView textView = (TextView) moVar.a;
                hlv hlvVar = hlv.a;
                hlu hluVar = new hlu();
                hluVar.d = 10;
                hluVar.c = new Rect(0, 0, (int) textView.getTextSize(), (int) textView.getTextSize());
                hlv hlvVarA = hluVar.a();
                geu geuVar5 = this.a;
                if (geuVar5 == null) {
                    affa.d("templateContext");
                } else {
                    geuVar = geuVar5;
                }
                textView.setText(hlb.e(geuVar, ((Row) himVar.a).getTitle(), hlvVarA, -1), TextView.BufferType.SPANNABLE);
                return;
            case 2:
            case 3:
                kdx kdxVar = (kdx) moVar.a;
                geu geuVar6 = this.a;
                if (geuVar6 == null) {
                    affa.d("templateContext");
                    geuVar6 = null;
                }
                List list = this.f;
                hie hieVar2 = this.e;
                if (hieVar2 == null) {
                    affa.d("rowListener");
                } else {
                    hieVar = hieVar2;
                }
                kdxVar.d(geuVar6, list, i, hieVar);
                return;
            case 4:
                GridRowContainerView gridRowContainerView = (GridRowContainerView) moVar.a;
                geu geuVar7 = this.a;
                if (geuVar7 == null) {
                    affa.d("templateContext");
                } else {
                    geuVar4 = geuVar7;
                }
                gridRowContainerView.c(geuVar4, this.f, i);
                return;
            case 5:
                Object obj2 = this.f.get(i);
                obj2.getClass();
                hju hjuVar = (hju) obj2;
                ComposableShimLayout composableShimLayout = (ComposableShimLayout) moVar.a;
                geu geuVar8 = this.a;
                if (geuVar8 == null) {
                    affa.d("templateContext");
                } else {
                    geuVar3 = geuVar8;
                }
                composableShimLayout.a(geuVar3, hjuVar);
                return;
            case 6:
                Object obj3 = this.f.get(i);
                obj3.getClass();
                hju hjuVar2 = (hju) obj3;
                ComposableShimLayout composableShimLayout2 = (ComposableShimLayout) moVar.a;
                geu geuVar9 = this.a;
                if (geuVar9 == null) {
                    affa.d("templateContext");
                } else {
                    geuVar2 = geuVar9;
                }
                composableShimLayout2.a(geuVar2, hjuVar2);
                return;
            default:
                throw new IllegalStateException(a.bp(i2, "Unknown view type when binding "));
        }
    }
}
