package defpackage;

import androidx.car.app.model.ItemList;
import androidx.car.app.model.SectionedItemList;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class tji extends tjo implements tir {
    public CharSequence a;

    public tji(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.tjo
    public final /* bridge */ /* synthetic */ Object a() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.k) {
            if (obj instanceof tiq) {
                arrayList.add(obj);
            }
        }
        return SectionedItemList.create((ItemList) ((tiq) woy.bN(arrayList)).d(), this.a);
    }

    @Override // defpackage.tjo
    public final String b() {
        CharSequence charSequence = this.a;
        Objects.toString(charSequence);
        return "Sectioned List: header: ".concat(String.valueOf(charSequence));
    }

    @Override // defpackage.tir
    public final void c(uj ujVar) throws tjn {
        try {
            ujVar.c((SectionedItemList) d());
        } catch (Throwable th) {
            throw new tjn("Unable to add ".concat(b()), th);
        }
    }
}
