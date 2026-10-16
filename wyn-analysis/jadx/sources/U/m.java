package u;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import b.AbstractBinderC1490c;
import b.C1489b;
import b.InterfaceC1491d;

/* loaded from: classes.dex */
public abstract class m implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, g gVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1491d interfaceC1491d;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i5 = AbstractBinderC1490c.f19098a;
        if (iBinder == null) {
            interfaceC1491d = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1491d.f19099U8);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1491d)) {
                C1489b c1489b = new C1489b();
                c1489b.f19097a = iBinder;
                interfaceC1491d = c1489b;
            } else {
                interfaceC1491d = (InterfaceC1491d) iInterfaceQueryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new l(interfaceC1491d, componentName, this.mApplicationContext));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
