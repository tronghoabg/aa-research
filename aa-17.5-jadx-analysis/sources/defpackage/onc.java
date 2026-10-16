package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.auto.sdk.MenuItem;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class onc extends lt implements oxi {
    public static final yph a = yph.c("GH.AudioRouteAdapter");
    private static final krm i;
    private static final krm j;
    public int e;
    public FrameLayout f;
    List g;
    public final ajmd h;
    private final Context k;
    private final boolean l;
    private final ebf m;

    static {
        int i2 = krm.c;
        urf urfVar = new urf(null);
        urfVar.a = true;
        i = new krm(urfVar);
        urf urfVar2 = new urf(null);
        urfVar2.a = false;
        j = new krm(urfVar2);
    }

    public onc(Context context, ajmd ajmdVar) {
        onb onbVar = new onb(this);
        this.m = onbVar;
        this.k = context;
        new ncp(context);
        ajmdVar.getClass();
        this.h = ajmdVar;
        leh.a();
        this.l = true;
        c();
        ebf.A().D(onbVar);
    }

    @Override // defpackage.lt
    public final int a() {
        int size = this.g.size();
        ((ype) ((ype) a.f()).ai((char) 6041)).w("getItemCount: %d routes", size);
        return size;
    }

    public final void c() {
        boolean z;
        boolean z2;
        List listL = ebf.A().l();
        ArrayList arrayList = new ArrayList();
        int iA = ebf.A().a();
        Iterator it = listL.iterator();
        while (true) {
            int i2 = -1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = (Integer) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("audio_route", num.intValue());
            MenuItem menuItem = new MenuItem();
            Context context = this.k;
            int iIntValue = num.intValue();
            if (iIntValue == 1) {
                i2 = R.string.audio_route_earpiece;
            } else if (iIntValue == 2) {
                i2 = R.string.audio_route_bluetooth;
            } else if (iIntValue == 4) {
                i2 = R.string.audio_route_wired_headset;
            } else if (iIntValue != 8) {
                tss.q("GH.AudioRouteAdapter", "Unknown audio route: %d", num);
            } else {
                i2 = R.string.audio_route_speaker;
            }
            menuItem.c = context.getString(i2);
            menuItem.e = ncp.k(num.intValue());
            if (this.l) {
                menuItem.f = this.e;
                menuItem.k = true;
                if (num.intValue() == iA) {
                    menuItem.i = R.drawable.gs_check_vd_theme_24;
                    menuItem.j = context.getColor(R.color.coolwalk_green);
                    menuItem.l = true;
                }
            } else {
                bundle.putBoolean("use_small_icons_key", true);
            }
            menuItem.b = bundle;
            osq.A(menuItem);
            arrayList.add(menuItem);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            MenuItem menuItem2 = (MenuItem) arrayList.get(i3);
            if (i3 == 0) {
                z = true;
            } else {
                Bundle bundle2 = ((MenuItem) arrayList.get(i3 - 1)).b;
                z = bundle2 != null ? bundle2.getBoolean("separate_from_next_key", false) : false;
            }
            if (i3 == arrayList.size() - 1) {
                z2 = true;
            } else {
                Bundle bundle3 = menuItem2.b;
                z2 = bundle3 != null ? bundle3.getBoolean("separate_from_next_key", false) : false;
            }
            if (menuItem2 == null) {
                throw new IllegalStateException("MenuItem is required.");
            }
            arrayList2.add(new adqy(menuItem2, z, z2));
        }
        this.g = yfq.o(arrayList2);
    }

    @Override // defpackage.lt
    public final mo f(ViewGroup viewGroup, int i2) {
        ((ype) ((ype) a.f()).ai((char) 6043)).w("creating viewholder: type=%d", i2);
        View viewInflate = LayoutInflater.from(this.k).inflate(true != this.l ? R.layout.content_forward_list_item : R.layout.material_audio_route_selector_content_forward_list_item, viewGroup, false);
        this.f = (FrameLayout) viewInflate.findViewById(R.id.divider);
        return new krl(viewInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x078f A[PHI: r14
  0x078f: PHI (r14v9 boolean) = (r14v8 boolean), (r14v12 boolean) binds: [B:279:0x078d, B:275:0x0784] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0793 A[PHI: r14
  0x0793: PHI (r14v10 boolean) = (r14v22 boolean), (r14v23 boolean) binds: [B:279:0x078d, B:276:0x0786] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    @Override // defpackage.lt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.mo r20, int r21) throws android.content.pm.PackageManager.NameNotFoundException, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 1970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.onc.n(mo, int):void");
    }

    @Override // defpackage.oxi
    public final void b(int i2) {
    }
}
