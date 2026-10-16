package defpackage;

import android.content.res.loader.ResourcesLoader;

/* loaded from: classes.dex */
public final /* synthetic */ class dba implements afdr {
    public static final dba a = new dba(4);
    private final /* synthetic */ int b;

    public /* synthetic */ dba(int i) {
        this.b = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        byte[] bArr = null;
        switch (this.b) {
            case 0:
                return false;
            case 1:
                return dbu.a;
            case 2:
                return true;
            case 3:
                a.am("LocalOwner");
                throw new aezp();
            case 4:
                return null;
            case 5:
                return dfn.d;
            case 6:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 7:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 8:
                throw new IllegalStateException("CompositionLocal LocalAppIconShapeProvider not provided");
            case 9:
                return new kjq();
            case 10:
                return new kkq();
            case 11:
                throw new IllegalStateException("LocalStatusReporters can only be accessed in a CarComposeView");
            case 12:
                throw new IllegalStateException("LocalTouchpadState can only be accessed in a CarComposeView");
            case 13:
                return Boolean.valueOf(nrd.a().d());
            case 14:
                return null;
            case 15:
                throw new IllegalStateException("defaultFocus() can only be called on Composables in a CarComposeView");
            case 16:
                return new ksa(bArr);
            case 17:
                kru kruVar = ksa.a;
                return new ResourcesLoader();
            case 18:
                return new ksf(bArr);
            case 19:
                return ksp.a;
            default:
                ksy ksyVar = ksy.a;
                return woy.bi(ksy.a, ksy.b, ksy.c, ksy.d);
        }
    }
}
