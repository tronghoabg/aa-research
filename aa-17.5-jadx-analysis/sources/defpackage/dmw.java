package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.projection.gearhead.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class dmw implements afec {
    private final /* synthetic */ int a;

    public /* synthetic */ dmw(int i) {
        this.a = i;
    }

    @Override // defpackage.afec
    public final Object invoke(Object obj) throws IOException {
        String strValueOf;
        Parcelable parcelable = null;
        switch (this.a) {
            case 0:
                ((Long) obj).longValue();
                return afak.a;
            case 1:
                deb debVar = ddx.y;
                afak afakVar = afak.a;
                ((dec) obj).a(debVar, afakVar);
                return afakVar;
            case 2:
                return afak.a;
            case 3:
                dnq dnqVar = (dnq) obj;
                if (dnqVar.isAttachedToWindow()) {
                    dnqVar.n();
                }
                return afak.a;
            case 4:
                Bundle bundle = (Bundle) obj;
                bundle.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) bundle.getParcelable("android.telecom.extra.CALL_IMAGE_URI", Uri.class);
                } else {
                    Parcelable parcelable2 = bundle.getParcelable("android.telecom.extra.CALL_IMAGE_URI");
                    if (parcelable2 instanceof Parcelable) {
                        parcelable = parcelable2;
                    }
                }
                return (Uri) parcelable;
            case 5:
                Bundle bundle2 = (Bundle) obj;
                bundle2.getClass();
                return Integer.valueOf(bundle2.getInt("android.telecom.extra.PARTICIPANT_COUNT"));
            case 6:
                Bundle bundle3 = (Bundle) obj;
                bundle3.getClass();
                return bundle3.getString("android.telecom.extra.CURRENT_SPEAKER");
            case 7:
                Bundle bundle4 = (Bundle) obj;
                bundle4.getClass();
                return Boolean.valueOf(bundle4.getBoolean("android.telecom.extra.LOCAL_CALL_SILENCE_STATE"));
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    bArr.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i = 0;
                    for (byte b : bArr) {
                        i++;
                        if (i > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return "  " + ((ehz) entry.getKey()).a + " = " + strValueOf;
            case 9:
                return new vo((bwq) obj);
            case 10:
                ((esc) obj).getClass();
                return new erd();
            case 11:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 12:
                esc escVar = (esc) obj;
                escVar.getClass();
                return new evt(erg.a(escVar));
            case 13:
                etz etzVar = (etz) obj;
                etzVar.getClass();
                etzVar.a = 0;
                etzVar.b = 0;
                return afak.a;
            case 14:
                urf urfVar = (urf) obj;
                urfVar.getClass();
                urfVar.a = true;
                return afak.a;
            case 15:
                Context context2 = (Context) obj;
                context2.getClass();
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 16:
                euz euzVar = (euz) obj;
                euzVar.getClass();
                return euzVar.e;
            case 17:
                euz euzVar2 = (euz) obj;
                euzVar2.getClass();
                if (!(euzVar2 instanceof eva)) {
                    return null;
                }
                eva evaVar = (eva) euzVar2;
                return evaVar.l(evaVar.j());
            case 18:
                View view = (View) obj;
                view.getClass();
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 19:
                View view2 = (View) obj;
                view2.getClass();
                Object tag = view2.getTag(R.id.nav_controller_view_tag);
                if (tag instanceof WeakReference) {
                    return (euu) ((WeakReference) tag).get();
                }
                if (tag instanceof euu) {
                    return (euu) tag;
                }
                return null;
            default:
                evf evfVar = (evf) obj;
                evfVar.getClass();
                evfVar.b = true;
                return afak.a;
        }
    }
}
