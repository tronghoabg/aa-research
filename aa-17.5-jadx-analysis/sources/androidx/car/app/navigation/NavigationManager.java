package androidx.car.app.navigation;

import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.INavigationManager;
import defpackage.ept;
import defpackage.sg;
import defpackage.tr;
import defpackage.wr;
import defpackage.xr;
import defpackage.xy;
import defpackage.yj;

/* loaded from: classes2.dex */
public final class NavigationManager implements sg {
    public final INavigationManager.Stub a;

    /* renamed from: androidx.car.app.navigation.NavigationManager$1, reason: invalid class name */
    public class AnonymousClass1 extends INavigationManager.Stub {
        final /* synthetic */ ept val$lifecycle;

        public AnonymousClass1(ept eptVar) {
            this.val$lifecycle = eptVar;
        }

        @Override // androidx.car.app.navigation.INavigationManager
        public int getInterfaceVersion() {
            return 1;
        }

        /* renamed from: lambda$onStopNavigation$0$androidx-car-app-navigation-NavigationManager$1, reason: not valid java name */
        public /* synthetic */ Object m163xb1216230() throws xr {
            yj.a();
            return null;
        }

        @Override // androidx.car.app.navigation.INavigationManager
        public void onStopNavigation(IOnDoneCallback iOnDoneCallback) {
            tr.d(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new xy() { // from class: wq
                @Override // defpackage.xy
                public final Object a() {
                    return this.a.m163xb1216230();
                }
            });
        }
    }

    public NavigationManager(ept eptVar) {
        this.a = new AnonymousClass1(eptVar);
        eptVar.c(new wr(eptVar, 0));
    }
}
