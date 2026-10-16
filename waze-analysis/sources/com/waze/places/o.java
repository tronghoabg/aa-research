package com.waze.places;

import android.text.SpannableStringBuilder;
import androidx.core.app.NotificationCompat;
import com.waze.R;
import com.waze.navigate.AddressItem;
import com.waze.z.a.d.ai;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private static o f33129a;

    /* renamed from: b, reason: collision with root package name */
    private Object f33130b;

    public o(org.a.d.f.a aVar) {
        h.g.b.x.f(aVar, "level");
        this.f33130b = aVar;
    }

    public static synchronized o a() {
        o oVar;
        oVar = f33129a;
        if (oVar == null) {
            oVar = new o();
            f33129a = oVar;
        }
        return oVar;
    }

    public static void h(org.a.d.f.a aVar, String str) {
        h.g.b.x.f(aVar, "level");
        h.g.b.x.f(str, NotificationCompat.CATEGORY_MESSAGE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.CharSequence, java.lang.Object] */
    public final void b(AddressItem addressItem, h.g.a.l lVar) {
        if (addressItem.getType() != 8) {
            PlacesNativeManager.INSTANCE.eraseAddressItem(addressItem.getId(), addressItem.getCategory().intValue(), addressItem.getTitle(), lVar);
            return;
        }
        if (this.f33130b == null) {
            com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(aVarA.c(R.string.REMOVE_DESTINATION_MESSAGE, new Object[0]));
            spannableStringBuilder.append((CharSequence) "\n\n");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) aVarA.c(R.string.REMOVE_DESTINATION_DRIVE_HISTORY_LINK, new Object[0]));
            spannableStringBuilder.setSpan(new n(), length, spannableStringBuilder.length(), 33);
            this.f33130b = spannableStringBuilder;
        }
        com.waze.shared_infra.o.a aVarA2 = com.waze.shared_infra.o.b.a();
        com.waze.ab.o oVar = new com.waze.ab.o();
        oVar.Q(aVarA2.c(R.string.REMOVE_DESTINATION_TITLE, new Object[0]));
        oVar.O(this.f33130b);
        oVar.R(true);
        oVar.M(aVarA2.c(R.string.REMOVE_DESTINATION_REMOVE, new Object[0]));
        oVar.N(aVarA2.c(R.string.REMOVE_DESTINATION_CANCEL, new Object[0]));
        oVar.y(true);
        oVar.f13808a = new com.waze.navigate.f(addressItem, lVar, 2, null);
        ai.q(oVar);
    }

    public final void c(String str) {
        h.g.b.x.f(str, NotificationCompat.CATEGORY_MESSAGE);
        e(org.a.d.f.a.f56394a, str);
    }

    public final void d(String str) {
        h.g.b.x.f(str, NotificationCompat.CATEGORY_MESSAGE);
        e(org.a.d.f.a.f56397d, str);
    }

    public final void e(org.a.d.f.a aVar, String str) {
        h.g.b.x.f(aVar, "lvl");
        h.g.b.x.f(str, NotificationCompat.CATEGORY_MESSAGE);
        if (g(aVar)) {
            h(aVar, str);
        }
    }

    public final void f(String str) {
        h.g.b.x.f(str, NotificationCompat.CATEGORY_MESSAGE);
        e(org.a.d.f.a.f56396c, str);
    }

    public final boolean g(org.a.d.f.a aVar) {
        h.g.b.x.f(aVar, "lvl");
        return ((org.a.d.f.a) this.f33130b).compareTo(aVar) <= 0;
    }

    private o() {
    }
}
