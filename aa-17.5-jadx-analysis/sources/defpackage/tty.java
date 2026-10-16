package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class tty implements Comparator {
    public int a;
    public int b;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ukp ukpVar = (ukp) obj;
        int i = ukpVar.a;
        ukp ukpVar2 = (ukp) obj2;
        int i2 = ukpVar2.a;
        if (i != i2) {
            return i2 - i;
        }
        int i3 = 536870912 >> i;
        return (Math.abs((ukpVar.e + i3) - this.a) + Math.abs((ukpVar.f + i3) - this.b)) - (Math.abs((ukpVar2.e + i3) - this.a) + Math.abs((ukpVar2.f + i3) - this.b));
    }
}
