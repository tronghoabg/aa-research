package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zuj extends zuh {
    public static final /* synthetic */ int e = 0;

    public zuj(aaia aaiaVar, Context context) {
        this.c = context;
        this.b = aaiaVar;
        this.d = b();
    }

    @Override // defpackage.zuh
    public final boolean c() {
        return false;
    }

    @Override // defpackage.zuh
    public final boolean d() {
        aahv aahvVar = this.b.b;
        if (aahvVar == null) {
            aahvVar = aahv.a;
        }
        int iAq = a.aq(aahvVar.b);
        if (iAq == 0) {
            iAq = 1;
        }
        return iAq + (-2) == 2;
    }

    @Override // defpackage.zuh
    public final boolean f() {
        aaia aaiaVarA = a(this.c, zuh.a);
        if (aaiaVarA == null) {
            return false;
        }
        aahv aahvVar = aaiaVarA.b;
        if (aahvVar == null) {
            aahvVar = aahv.a;
        }
        int i = aahvVar.b;
        aahv aahvVar2 = this.b.b;
        if (aahvVar2 == null) {
            aahvVar2 = aahv.a;
        }
        if (i == aahvVar2.b) {
            return false;
        }
        this.b = aaiaVarA;
        return true;
    }
}
