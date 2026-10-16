package defpackage;

import androidx.car.app.model.ItemList;
import androidx.car.app.model.OnItemVisibilityChangedDelegateImpl;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class tiq extends tjo implements tir {
    public CharSequence a;
    public afec b;
    public uh c;

    public tiq(CharSequence charSequence, afec afecVar, uh uhVar) {
        this.a = charSequence;
        this.b = afecVar;
        this.c = uhVar;
    }

    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        ug ugVar = new ug();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            ugVar.c(charSequence);
        }
        afec afecVar = this.b;
        if (afecVar != null) {
            ugVar.d(new mmp(afecVar, 6));
        }
        uh uhVar = this.c;
        if (uhVar != null) {
            ugVar.d = OnItemVisibilityChangedDelegateImpl.create(uhVar);
        }
        List list = this.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof tis) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        for (Object obj2 : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            tis tisVar = (tis) obj2;
            ugVar.b((uf) tisVar.d());
            if (this.b != null && (tisVar instanceof tis) && tisVar.c()) {
                ugVar.e(i);
            }
            i = i2;
        }
        return ugVar.a();
    }

    @Override // defpackage.tjo
    public final String b() {
        return "ItemList";
    }

    @Override // defpackage.tir
    public final void c(uj ujVar) throws tjn {
        try {
            if (((ItemList) d()).getNoItemsMessage() == null) {
                List<uf> items = ((ItemList) d()).getItems();
                items.getClass();
                if (items.isEmpty()) {
                    return;
                }
            }
            ujVar.f((ItemList) d());
        } catch (Throwable th) {
            throw new tjn("Unable to add ItemList", th);
        }
    }
}
