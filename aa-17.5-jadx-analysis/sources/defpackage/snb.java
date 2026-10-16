package defpackage;

import com.google.android.gms.common.Feature;

/* loaded from: classes.dex */
public final class snb {
    public smy a;
    public Feature[] b;
    private boolean d = false;
    private boolean e = false;
    public int c = 0;

    public final snc a() {
        spu.an(this.a != null, "execute parameter required");
        if (!this.e) {
            Feature[] featureArr = this.b;
            this.d = featureArr != null && featureArr[0].c;
        }
        return new snc(this, this.b, this.d, this.c);
    }

    public final void b() {
        this.e = true;
        this.d = false;
    }
}
