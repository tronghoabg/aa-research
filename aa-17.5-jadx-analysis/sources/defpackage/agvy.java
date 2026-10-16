package defpackage;

/* loaded from: classes3.dex */
public final class agvy implements agvx {
    public ahwc resolver;

    public final ahwc getResolver() {
        ahwc ahwcVar = this.resolver;
        if (ahwcVar != null) {
            return ahwcVar;
        }
        affa.d("resolver");
        return null;
    }

    @Override // defpackage.agvx
    public agba resolveClass(agzj agzjVar) {
        agzjVar.getClass();
        return getResolver().resolveClass(agzjVar);
    }

    public final void setResolver(ahwc ahwcVar) {
        ahwcVar.getClass();
        this.resolver = ahwcVar;
    }
}
