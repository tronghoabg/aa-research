package defpackage;

/* loaded from: classes3.dex */
public final class vpn {
    public static final vpn a = new vpn(new vpo[0]);
    public final vpo[] b;
    public final int[] c;

    public vpn(vpo[] vpoVarArr) {
        this.b = vpoVarArr;
        this.c = new int[vpoVarArr.length];
        for (int i = 0; i < vpoVarArr.length; i++) {
            this.c[i] = vpoVarArr[i].b;
        }
    }
}
