package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.projection.sdk.demand.Template;
import com.google.android.projection.sdk.demand.TemplateArgument;

/* loaded from: classes3.dex */
public final class xqd extends ijo implements xqe {
    final /* synthetic */ xqb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqd(xqb xqbVar) {
        super("com.google.android.projection.sdk.demand.ICallbacks");
        this.a = xqbVar;
    }

    @Override // defpackage.xqe
    public final void e(int i) {
        Handler handler = this.a.b;
        handler.sendMessage(handler.obtainMessage(2, i, 0));
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            Template template = (Template) ijp.a(parcel, Template.CREATOR);
            TemplateArgument templateArgument = (TemplateArgument) ijp.a(parcel, TemplateArgument.CREATOR);
            ijp.d(parcel);
            if (Log.isLoggable("GH.DemandClient", 3)) {
                Log.d("GH.DemandClient", "onArgumentSelected called");
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("template", template);
            bundle.putParcelable("argument", templateArgument);
            Handler handler = this.a.b;
            handler.sendMessage(handler.obtainMessage(1, bundle));
        } else if (i == 2) {
            int i2 = parcel.readInt();
            ijp.d(parcel);
            if (Log.isLoggable("GH.DemandClient", 3)) {
                Log.d("GH.DemandClient", "onClose called");
            }
            Handler handler2 = this.a.b;
            handler2.sendMessage(handler2.obtainMessage(0, i2, 0));
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            ijp.d(parcel);
            e(i3);
        }
        return true;
    }
}
