package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class lcc {
    public final yzy a;
    public final int b;
    public final int c;
    public final Integer d;
    private final yfq e;

    public /* synthetic */ lcc(yzy yzyVar, int i, int i2, yfq yfqVar, Integer num, int i3) {
        if ((i3 & 8) != 0) {
            int i4 = yfq.d;
            yfqVar = yls.a;
            yfqVar.getClass();
        }
        i = (i3 & 2) != 0 ? 0 : i;
        num = (i3 & 16) != 0 ? null : num;
        yfqVar.getClass();
        this.a = yzyVar;
        this.b = i;
        this.c = i2;
        this.e = yfqVar;
        this.d = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String a(Context context) {
        context.getClass();
        yfq yfqVar = this.e;
        if (yfqVar.isEmpty()) {
            String string = context.getString(this.c);
            string.getClass();
            return string;
        }
        ArrayList arrayList = new ArrayList(woy.bp(yfqVar, 10));
        ynp ynpVarListIterator = yfqVar.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            Integer num = (Integer) ynpVarListIterator.next();
            num.getClass();
            arrayList.add(context.getString(num.intValue()));
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String string2 = context.getString(this.c, Arrays.copyOf(strArr, strArr.length));
        string2.getClass();
        return string2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcc)) {
            return false;
        }
        lcc lccVar = (lcc) obj;
        return affa.f(this.a, lccVar.a) && this.b == lccVar.b && this.c == lccVar.c && affa.f(this.e, lccVar.e) && affa.f(this.d, lccVar.d);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.e.hashCode();
        Integer num = this.d;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ResponseOption(action=" + this.a + ", icon=" + this.b + ", text=" + this.c + ", textArgs=" + this.e + ", semanticAction=" + this.d + ")";
    }
}
