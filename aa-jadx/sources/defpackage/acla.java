package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class acla {
    public final defpackage.acks a;
    public final int b;
    public final int c;
    public final int d;
    final /* synthetic */ defpackage.aclb e;

    public acla(defpackage.aclb aclbVar, defpackage.acks acksVar, int i, int i2, int i3) {
        this.e = aclbVar;
        this.a = acksVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        if (this.a != defpackage.acks.BYTE) {
            return this.d;
        }
        defpackage.aclb aclbVar = this.e;
        int i = this.b;
        int i2 = this.d;
        int i3 = this.c;
        defpackage.acld acldVar = aclbVar.c;
        return acldVar.c.d(acldVar.a.substring(i, i2 + i), i3).length;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.acks acksVar = this.a;
        sb.append(acksVar);
        sb.append('(');
        defpackage.acks acksVar2 = defpackage.acks.ECI;
        defpackage.aclb aclbVar = this.e;
        if (acksVar == acksVar2) {
            sb.append(aclbVar.c.c.b(this.c).displayName());
        } else {
            int i = this.b;
            java.lang.String strSubstring = aclbVar.c.a.substring(i, this.d + i);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
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
