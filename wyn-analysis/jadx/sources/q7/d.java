package q7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC1732v;
import d7.i;

/* loaded from: classes3.dex */
public abstract class d {
    private final String zza;
    private Object zzb;

    public d(String str) {
        this.zza = str;
    }

    public abstract Object getRemoteCreator(IBinder iBinder);

    public final Object getRemoteCreatorInstance(Context context) throws PackageManager.NameNotFoundException, C3878c {
        Context contextCreatePackageContext;
        if (this.zzb == null) {
            AbstractC1732v.i(context);
            int i5 = i.f34135e;
            try {
                contextCreatePackageContext = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                contextCreatePackageContext = null;
            }
            if (contextCreatePackageContext == null) {
                throw new C3878c("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) contextCreatePackageContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e7) {
                throw new C3878c("Could not load creator class.", e7);
            } catch (IllegalAccessException e10) {
                throw new C3878c("Could not access creator.", e10);
            } catch (InstantiationException e11) {
                throw new C3878c("Could not instantiate creator.", e11);
            }
        }
        return this.zzb;
    }
}
