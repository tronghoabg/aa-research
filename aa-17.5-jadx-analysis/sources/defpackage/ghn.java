package defpackage;

import android.content.Context;
import androidx.car.app.model.Header;
import androidx.car.app.model.ItemList;
import androidx.car.app.model.Pane;
import androidx.car.app.navigation.model.MapTemplate;
import j$.util.Objects;
import java.util.List;

/* loaded from: classes2.dex */
public final class ghn implements ghq {
    final boolean a;
    final gns b;

    public ghn(geu geuVar) {
        this.a = ((ggk) geuVar.F(ggk.class)).l(((gmh) geuVar.d()).a.getPackageName());
        this.b = geuVar.k();
    }

    private static final boolean d(Header header, Header header2) {
        if (header == null && header2 == null) {
            return true;
        }
        if (header == null || header2 == null) {
            return false;
        }
        return Objects.equals(header.getTitle(), header2.getTitle());
    }

    @Override // defpackage.ghq
    public final /* synthetic */ void a(Context context, wb wbVar) {
        mt.j(context, "androidx.car.app.NAVIGATION_TEMPLATES");
    }

    @Override // defpackage.ghq
    public final /* bridge */ /* synthetic */ boolean b(wb wbVar, wb wbVar2, int i) {
        MapTemplate mapTemplate = (MapTemplate) wbVar;
        MapTemplate mapTemplate2 = (MapTemplate) wbVar2;
        Header header = mapTemplate2.getHeader();
        Header header2 = mapTemplate.getHeader();
        Pane pane = mapTemplate2.getPane();
        Pane pane2 = mapTemplate.getPane();
        if (pane2 != null && pane != null) {
            if (pane.isLoading()) {
                return true;
            }
            if (pane2.isLoading() || !d(header, header2)) {
                return false;
            }
            if (i == 1) {
                return true;
            }
            return fxa.k(pane.getRows(), pane2.getRows(), 2);
        }
        if (!d(header, header2)) {
            this.b.d(gnr.a(37));
            if (this.a) {
                return false;
            }
        }
        if (i == 1) {
            return true;
        }
        ItemList itemList = mapTemplate2.getItemList();
        ItemList itemList2 = mapTemplate.getItemList();
        if (itemList == null || itemList2 == null) {
            return false;
        }
        return fxa.k(itemList.getItems(), itemList2.getItems(), 2);
    }

    @Override // defpackage.ghq
    public final /* synthetic */ List c(wb wbVar, wb wbVar2) {
        int i = yfq.d;
        return yls.a;
    }
}
