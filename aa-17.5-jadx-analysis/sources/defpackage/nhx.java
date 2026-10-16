package defpackage;

import android.view.View;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class nhx implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nhx(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v2, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        int i = this.d;
        if (i == 0) {
            ?? r0 = this.c;
            yph yphVar = nih.a;
            ((cho) obj).getClass();
            ?? r6 = this.a;
            nii niiVar = (nii) r6.a();
            nii niiVar2 = nii.a;
            int iOrdinal = niiVar.ordinal();
            nii niiVar3 = iOrdinal != 0 ? iOrdinal != 3 ? iOrdinal != 4 ? (nii) r6.a() : ((Boolean) r0.a()).booleanValue() ? nii.d : nii.e : !((Boolean) r0.a()).booleanValue() ? nii.e : nii.d : nii.b;
            ?? r5 = this.b;
            nih.a.l().y("FocusProperties onEnter %s", niiVar3);
            Object obj2 = r5.get(niiVar3);
            obj2.getClass();
            ((cil) obj2).a(7);
            return afak.a;
        }
        int i2 = 0;
        if (i != 1) {
            cie cieVar = (cie) obj;
            yph yphVar2 = nih.a;
            cieVar.getClass();
            cieVar.f(new nhx(this.a, this.b, this.c, i2));
            return afak.a;
        }
        List list = (List) obj;
        list.getClass();
        boolean zIsEmpty = list.isEmpty();
        boolean z = !zIsEmpty;
        Object obj3 = this.a;
        if (zIsEmpty) {
            ((View) obj3).setOnClickListener(null);
        } else {
            ((View) obj3).setOnClickListener(new naj(this.b, this.c, list, i2));
        }
        ((View) obj3).setClickable(z);
        return afak.a;
    }
}
