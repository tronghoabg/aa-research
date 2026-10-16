package defpackage;

import android.content.Context;
import com.google.android.apps.auto.components.connectivity.impl.ConnectivityEventHandlerImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class koy implements xyc {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ koy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.xyc
    public final Object gu() {
        switch (this.b) {
            case 0:
                yph yphVar = ConnectivityEventHandlerImpl.a;
                return new rgh((Context) this.a, new yce(1));
            case 1:
                yph yphVar2 = ConnectivityEventHandlerImpl.a;
                return new sak((Context) this.a);
            case 2:
                return new oic(((oid) this.a).b);
            case 3:
                return new rod(this.a);
            case 4:
                return Boolean.valueOf(((rdj) this.a).p(raj.v));
            case 5:
                return Boolean.valueOf(((rdj) this.a).p(raj.ac));
            case 6:
                return Boolean.valueOf(((rdj) this.a).p(raj.ad));
            case 7:
                return Boolean.valueOf(((rdj) this.a).p(raj.ae));
            case 8:
                return Boolean.valueOf(((rdj) this.a).p(raj.af));
            case 9:
                return Integer.valueOf(((rdj) this.a).B("projected_presentation_config_max_checks", 10));
            case 10:
                return Integer.valueOf(((rdj) this.a).B("projected_presentation_config_check_delay", 20));
            case 11:
                return Boolean.valueOf(((rdj) this.a).p(raj.G));
            case 12:
                return Boolean.valueOf(((rdj) this.a).p(raj.V));
            case 13:
                return Boolean.valueOf(((rdj) this.a).p(raj.X));
            case 14:
                return Boolean.valueOf(((rdj) this.a).p(raj.Y));
            case 15:
                return Boolean.valueOf(((rdj) this.a).p(raj.aa));
            case 16:
                return Boolean.valueOf(((rdj) this.a).p(raj.I));
            case 17:
                return Boolean.valueOf(((rdj) this.a).p(raj.K));
            case 18:
                return Boolean.valueOf(((rdj) this.a).p(raj.F));
            case 19:
                return Boolean.valueOf(((rdj) this.a).p(raj.ab));
            default:
                return new rox(new jow(this.a, 4));
        }
    }
}
