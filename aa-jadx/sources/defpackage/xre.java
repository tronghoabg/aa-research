package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xre extends defpackage.ijw implements defpackage.xrf {
    final /* synthetic */ defpackage.xrc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xre(defpackage.xrc xrcVar) {
        super("com.google.android.projection.sdk.demand.ICallbacks");
        this.a = xrcVar;
    }

    @Override // defpackage.xrf
    public final void e(int i) {
        android.os.Handler handler = this.a.b;
        handler.sendMessage(handler.obtainMessage(2, i, 0));
    }

    @Override // defpackage.ijw
    protected final boolean eu(int i, android.os.Parcel parcel, android.os.Parcel parcel2) throws android.os.RemoteException {
        if (i == 1) {
            com.google.android.projection.sdk.demand.Template template = (com.google.android.projection.sdk.demand.Template) defpackage.ijx.a(parcel, com.google.android.projection.sdk.demand.Template.CREATOR);
            com.google.android.projection.sdk.demand.TemplateArgument templateArgument = (com.google.android.projection.sdk.demand.TemplateArgument) defpackage.ijx.a(parcel, com.google.android.projection.sdk.demand.TemplateArgument.CREATOR);
            defpackage.ijx.d(parcel);
            if (android.util.Log.isLoggable("GH.DemandClient", 3)) {
                android.util.Log.d("GH.DemandClient", "onArgumentSelected called");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("template", template);
            bundle.putParcelable("argument", templateArgument);
            android.os.Handler handler = this.a.b;
            handler.sendMessage(handler.obtainMessage(1, bundle));
        } else if (i == 2) {
            int i2 = parcel.readInt();
            defpackage.ijx.d(parcel);
            if (android.util.Log.isLoggable("GH.DemandClient", 3)) {
                android.util.Log.d("GH.DemandClient", "onClose called");
            }
            android.os.Handler handler2 = this.a.b;
            handler2.sendMessage(handler2.obtainMessage(0, i2, 0));
        } else {
            if (i != 3) {
                return false;
            }
            int i3 = parcel.readInt();
            defpackage.ijx.d(parcel);
            e(i3);
        }
        return true;
    }
}
