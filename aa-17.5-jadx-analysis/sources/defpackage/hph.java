package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class hph extends hng {
    public static final hno b = new hno(10);
    private final int c;
    private final String d;
    private final Integer e;
    private final Integer f;
    private final Integer g;
    private final Integer h;
    private final Integer i;
    private final List j;

    public hph(int i, String str, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, List list) {
        super(hnh.q);
        this.c = i;
        this.d = str;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = num4;
        this.i = num5;
        this.j = list;
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) {
        bundle.putInt("suggestion_limit", this.c);
        String str = this.d;
        if (str != null) {
            bundle.putString("last_author_phone_number", str);
        }
        Integer num = this.e;
        if (num != null) {
            bundle.putInt("stroke_color", num.intValue());
        }
        Integer num2 = this.f;
        if (num2 != null) {
            bundle.putInt("text_color", num2.intValue());
        }
        Integer num3 = this.g;
        if (num3 != null) {
            bundle.putInt("icon_color", num3.intValue());
        }
        Integer num4 = this.h;
        if (num4 != null) {
            bundle.putInt("suggestion_background_color", num4.intValue());
        }
        Integer num5 = this.i;
        if (num5 != null) {
            bundle.putInt("suggestion_corner_radius", num5.intValue());
        }
        List list = this.j;
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((hpg) it.next()).ordinal()));
        }
        bundle.putIntegerArrayList("disabled_actions", new ArrayList<>(arrayList));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hph)) {
            return false;
        }
        hph hphVar = (hph) obj;
        return this.c == hphVar.c && affa.f(this.d, hphVar.d) && affa.f(this.e, hphVar.e) && affa.f(this.f, hphVar.f) && affa.f(this.g, hphVar.g) && affa.f(this.h, hphVar.h) && affa.f(this.i, hphVar.i) && affa.f(this.j, hphVar.j);
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.c;
        Integer num = this.e;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        int i2 = (i * 31) + iHashCode;
        Integer num2 = this.f;
        int iHashCode3 = ((((i2 * 31) + iHashCode2) * 31) + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.i;
        return ((iHashCode5 + (num5 != null ? num5.hashCode() : 0)) * 31) + this.j.hashCode();
    }

    public hph() {
        this(0, null, null, null, null, null, null, afbe.a);
    }
}
