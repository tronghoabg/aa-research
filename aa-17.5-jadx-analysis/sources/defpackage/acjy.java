package defpackage;

/* loaded from: classes3.dex */
final class acjy {
    public final acjq a;
    public final int b;
    public final int c;
    public final int d;
    final /* synthetic */ acjz e;

    public acjy(acjz acjzVar, acjq acjqVar, int i, int i2, int i3) {
        this.e = acjzVar;
        this.a = acjqVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        if (this.a != acjq.BYTE) {
            return this.d;
        }
        acjz acjzVar = this.e;
        int i = this.b;
        int i2 = this.d;
        int i3 = this.c;
        ackb ackbVar = acjzVar.c;
        return ackbVar.c.d(ackbVar.a.substring(i, i2 + i), i3).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        acjq acjqVar = this.a;
        sb.append(acjqVar);
        sb.append('(');
        acjq acjqVar2 = acjq.ECI;
        acjz acjzVar = this.e;
        if (acjqVar == acjqVar2) {
            sb.append(acjzVar.c.c.b(this.c).displayName());
        } else {
            int i = this.b;
            String strSubstring = acjzVar.c.a.substring(i, this.d + i);
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < strSubstring.length(); i2++) {
                if (strSubstring.charAt(i2) < ' ' || strSubstring.charAt(i2) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(strSubstring.charAt(i2));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
